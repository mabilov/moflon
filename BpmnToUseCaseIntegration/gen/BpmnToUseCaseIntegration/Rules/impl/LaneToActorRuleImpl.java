/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.LaneToActorRule;
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

import UseCaseDSL.Actor;
import UseCaseDSL.ActorType;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.FlowElementsContainer;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.RootElement;

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
 * An implementation of the model object '<em><b>Lane To Actor Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaneToActorRuleImpl extends AbstractRuleImpl implements
		LaneToActorRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneToActorRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLaneToActorRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		// initial bindings
		Object[] result1_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_0_1_blackBBBBBB(this, match, laneSet,
						process, definitions, lane);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_0_2_bindingAndBlackFBBBBBB(this,
						match, laneSet, process, definitions, lane);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LaneToActorRuleImpl.pattern_LaneToActorRule_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = LaneToActorRuleImpl
					.pattern_LaneToActorRule_0_4_blackBBBBB(match, laneSet,
							process, definitions, lane);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			LaneToActorRuleImpl.pattern_LaneToActorRule_0_4_greenBBBF(match,
					laneSet, lane);
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LaneToActorRuleImpl
					.pattern_LaneToActorRule_0_5_blackBBBBB(match, laneSet,
							process, definitions, lane);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			LaneToActorRuleImpl.pattern_LaneToActorRule_0_5_greenBBBBFF(match,
					laneSet, process, definitions);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[4];
			// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result5_green[5];

			// register objects to match
			LaneToActorRuleImpl.pattern_LaneToActorRule_0_6_expressionBBBBBB(
					this, match, laneSet, process, definitions, lane);
			return LaneToActorRuleImpl
					.pattern_LaneToActorRule_0_7_expressionF();
		} else {
			return LaneToActorRuleImpl
					.pattern_LaneToActorRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_1_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[0];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[1];
		Definitions definitions = (Definitions) result1_bindingAndBlack[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[3];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[6];
		Lane lane = (Lane) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_1_greenBBFFB(packageDeclaration,
						lane, csp);
		Actor actor = (Actor) result1_green[2];
		LaneToActor laneToActor = (LaneToActor) result1_green[3];

		// collect translated elements
		Object[] result2_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_2_blackBBB(lane, actor, laneToActor);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_2_greenFBBB(lane, actor, laneToActor);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_3_blackBBBBBBBBBBB(ruleresult,
						laneSet, process, definitions, packageDeclaration,
						definitionsToPackage, useCase, processToUseCase, lane,
						actor, laneToActor);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		LaneToActorRuleImpl.pattern_LaneToActorRule_1_3_greenBBBBBBFFFF(
				ruleresult, laneSet, packageDeclaration, lane, actor,
				laneToActor);
		// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[6];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[7];
		// EMoflonEdge laneToActor__lane____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge laneToActor__actor____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		LaneToActorRuleImpl.pattern_LaneToActorRule_1_5_expressionBBBBBBBBBBBB(
				this, ruleresult, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane, actor, laneToActor);
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LaneToActorRuleImpl
				.pattern_LaneToActorRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		LaneSet laneSet = (LaneSet) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		Definitions definitions = (Definitions) result2_binding[2];
		Lane lane = (Lane) result2_binding[3];
		for (Object[] result2_black : LaneToActorRuleImpl
				.pattern_LaneToActorRule_2_2_blackBBBFFFFBB(laneSet, process,
						definitions, lane, match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : LaneToActorRuleImpl
					.pattern_LaneToActorRule_2_3_blackBBBBBBBB(laneSet,
							process, definitions, packageDeclaration,
							definitionsToPackage, useCase, processToUseCase,
							lane)) {
				Object[] result3_green = LaneToActorRuleImpl
						.pattern_LaneToActorRule_2_3_greenBBBBBBBBFFFFFFFFF(
								laneSet, process, definitions,
								packageDeclaration, definitionsToPackage,
								useCase, processToUseCase, lane);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[12];
				// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = LaneToActorRuleImpl
						.pattern_LaneToActorRule_2_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, laneSet, process,
								definitions, packageDeclaration,
								definitionsToPackage, useCase,
								processToUseCase, lane);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LaneToActorRuleImpl
						.pattern_LaneToActorRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LaneToActorRuleImpl
							.pattern_LaneToActorRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					LaneToActorRuleImpl.pattern_LaneToActorRule_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		match.registerObject("laneSet", laneSet);
		match.registerObject("process", process);
		match.registerObject("definitions", definitions);
		match.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {// Create CSP
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
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");
		literal0.setType("");

		// Create attribute variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", true, csp);
		var_lane_id.setValue(lane.getId());
		var_lane_id.setType("String");
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", true, csp);
		var_lane_name.setValue(lane.getName());
		var_lane_name.setType("String");

		// Create unbound variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", csp);
		var_actor_description.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_lane_id, var_actor_name);
		eq_0.setRuleName("");
		eq_0.solve(var_lane_name, var_actor_description);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject actor, EObject laneToActor) {
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("lane").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getLane());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		// initial bindings
		Object[] result1_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_10_1_blackBBBBB(this, match,
						packageDeclaration, useCase, actor);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_10_2_bindingAndBlackFBBBBB(this,
						match, packageDeclaration, useCase, actor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LaneToActorRuleImpl.pattern_LaneToActorRule_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LaneToActorRuleImpl
					.pattern_LaneToActorRule_10_4_blackBBBB(match,
							packageDeclaration, useCase, actor);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			LaneToActorRuleImpl.pattern_LaneToActorRule_10_4_greenBBBF(match,
					packageDeclaration, actor);
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LaneToActorRuleImpl
					.pattern_LaneToActorRule_10_5_blackBBBB(match,
							packageDeclaration, useCase, actor);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			LaneToActorRuleImpl.pattern_LaneToActorRule_10_5_greenBBBF(match,
					packageDeclaration, useCase);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[3];

			// register objects to match
			LaneToActorRuleImpl.pattern_LaneToActorRule_10_6_expressionBBBBB(
					this, match, packageDeclaration, useCase, actor);
			return LaneToActorRuleImpl
					.pattern_LaneToActorRule_10_7_expressionF();
		} else {
			return LaneToActorRuleImpl
					.pattern_LaneToActorRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_1_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[0];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[1];
		Definitions definitions = (Definitions) result1_bindingAndBlack[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[3];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[6];
		Actor actor = (Actor) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_1_greenBFBFB(laneSet, actor, csp);
		Lane lane = (Lane) result1_green[1];
		LaneToActor laneToActor = (LaneToActor) result1_green[3];

		// collect translated elements
		Object[] result2_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_2_blackBBB(lane, actor, laneToActor);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_2_greenFBBB(lane, actor,
						laneToActor);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_3_blackBBBBBBBBBBB(ruleresult,
						laneSet, process, definitions, packageDeclaration,
						definitionsToPackage, useCase, processToUseCase, lane,
						actor, laneToActor);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		LaneToActorRuleImpl.pattern_LaneToActorRule_11_3_greenBBBBBBFFFF(
				ruleresult, laneSet, packageDeclaration, lane, actor,
				laneToActor);
		// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[6];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[7];
		// EMoflonEdge laneToActor__lane____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge laneToActor__actor____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_5_expressionBBBBBBBBBBBB(this,
						ruleresult, laneSet, process, definitions,
						packageDeclaration, definitionsToPackage, useCase,
						processToUseCase, lane, actor, laneToActor);
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LaneToActorRuleImpl
				.pattern_LaneToActorRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		for (Object[] result2_black : LaneToActorRuleImpl
				.pattern_LaneToActorRule_12_2_blackFFBFBFBB(packageDeclaration,
						useCase, actor, match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			Definitions definitions = (Definitions) result2_black[1];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[3];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : LaneToActorRuleImpl
					.pattern_LaneToActorRule_12_3_blackFBBBBBBB(process,
							definitions, packageDeclaration,
							definitionsToPackage, useCase, processToUseCase,
							actor)) {
				LaneSet laneSet = (LaneSet) result3_black[0];
				Object[] result3_green = LaneToActorRuleImpl
						.pattern_LaneToActorRule_12_3_greenBBBBBBBBFFFFFFFFF(
								laneSet, process, definitions,
								packageDeclaration, definitionsToPackage,
								useCase, processToUseCase, actor);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[9];
				// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[11];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[12];
				// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = LaneToActorRuleImpl
						.pattern_LaneToActorRule_12_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, laneSet, process,
								definitions, packageDeclaration,
								definitionsToPackage, useCase,
								processToUseCase, actor);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LaneToActorRuleImpl
						.pattern_LaneToActorRule_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LaneToActorRuleImpl
							.pattern_LaneToActorRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					LaneToActorRuleImpl.pattern_LaneToActorRule_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");
		literal0.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
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
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("String");
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", true, csp);
		var_actor_description.setValue(actor.getDescription());
		var_actor_description.setType("String");

		// Create unbound variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", csp);
		var_lane_id.setType("String");
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", csp);
		var_lane_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_lane_id, var_actor_name);
		eq_0.setRuleName("");
		eq_0.solve(var_lane_name, var_actor_description);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject actor, EObject laneToActor) {
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("actor").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(
			EMoflonEdge _edge_lanes) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LaneToActorRuleImpl
				.pattern_LaneToActorRule_20_2_blackFFFFB(_edge_lanes)) {
			LaneSet laneSet = (LaneSet) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			Definitions definitions = (Definitions) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			Object[] result2_green = LaneToActorRuleImpl
					.pattern_LaneToActorRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LaneToActorRuleImpl
					.pattern_LaneToActorRule_20_3_expressionFBBBBBB(this,
							match, laneSet, process, definitions, lane)) {
				// Ensure that the correct types of elements are matched
				if (LaneToActorRuleImpl
						.pattern_LaneToActorRule_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LaneToActorRuleImpl
							.pattern_LaneToActorRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					LaneToActorRuleImpl.pattern_LaneToActorRule_20_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(
			EMoflonEdge _edge_actors) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneToActorRuleImpl
				.pattern_LaneToActorRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LaneToActorRuleImpl
				.pattern_LaneToActorRule_21_2_blackFFFB(_edge_actors)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Object[] result2_green = LaneToActorRuleImpl
					.pattern_LaneToActorRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LaneToActorRuleImpl
					.pattern_LaneToActorRule_21_3_expressionFBBBBB(this, match,
							packageDeclaration, useCase, actor)) {
				// Ensure that the correct types of elements are matched
				if (LaneToActorRuleImpl
						.pattern_LaneToActorRule_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LaneToActorRuleImpl
							.pattern_LaneToActorRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					LaneToActorRuleImpl.pattern_LaneToActorRule_21_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_21_6_expressionFB(__result);
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
		Object[] result1_black = LaneToActorRuleImpl
				.pattern_LaneToActorRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = LaneToActorRuleImpl
				.pattern_LaneToActorRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LaneToActorRuleImpl
				.pattern_LaneToActorRule_24_2_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList definitionsToPackageList = (RuleEntryList) result2_black[0];
			LaneSet laneSet = (LaneSet) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			Definitions definitions = (Definitions) result2_black[3];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[4];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = LaneToActorRuleImpl
					.pattern_LaneToActorRule_24_3_bindingAndBlackFBBBBBBBBBB(
							this, isApplicableMatch, laneSet, process,
							definitions, packageDeclaration,
							definitionsToPackage, useCase, processToUseCase,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LaneToActorRuleImpl.pattern_LaneToActorRule_24_4_expressionFBB(
					this, csp)) {
				// check nacs
				Object[] result5_black = LaneToActorRuleImpl
						.pattern_LaneToActorRule_24_5_blackBBBBBBB(laneSet,
								process, definitions, packageDeclaration,
								definitionsToPackage, useCase, processToUseCase);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LaneToActorRuleImpl
							.pattern_LaneToActorRule_24_6_blackBBBBBBBB(
									laneSet, process, definitions,
									packageDeclaration, definitionsToPackage,
									useCase, processToUseCase, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					LaneToActorRuleImpl
							.pattern_LaneToActorRule_24_6_greenBBFFFBB(laneSet,
									packageDeclaration, ruleResult, csp);
					// Lane lane = (Lane) result6_green[2];
					// Actor actor = (Actor) result6_green[3];
					// LaneToActor laneToActor = (LaneToActor) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return LaneToActorRuleImpl
				.pattern_LaneToActorRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", csp);
		var_lane_id.setType("String");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", csp);
		var_lane_name.setType("String");
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", csp);
		var_actor_description.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_lane_id, var_actor_name);
		eq_0.setRuleName("");
		eq_0.solve(var_lane_name, var_actor_description);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
		case RulesPackage.LANE_TO_ACTOR_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_USECASE_PROCESSTOUSECASE_LANE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackage) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Lane) arguments.get(8));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
		case RulesPackage.LANE_TO_ACTOR_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_USECASE_PROCESSTOUSECASE_ACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackage) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Actor) arguments.get(8));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DEFINITIONSTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(DefinitionsToPackage) arguments.get(1));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_USECASE_PROCESSTOUSECASE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackage) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LaneToActorRule_0_1_blackBBBBBB(
			LaneToActorRule _this, Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		return new Object[] { _this, match, laneSet, process, definitions, lane };
	}

	public static final Object[] pattern_LaneToActorRule_0_2_bindingFBBBBBB(
			LaneToActorRule _this, Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, laneSet,
				process, definitions, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, laneSet, process,
					definitions, lane };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneToActorRule_0_2_bindingAndBlackFBBBBBB(
			LaneToActorRule _this, Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		Object[] result_pattern_LaneToActorRule_0_2_binding = pattern_LaneToActorRule_0_2_bindingFBBBBBB(
				_this, match, laneSet, process, definitions, lane);
		if (result_pattern_LaneToActorRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_LaneToActorRule_0_2_binding[0];

			Object[] result_pattern_LaneToActorRule_0_2_black = pattern_LaneToActorRule_0_2_blackB(csp);
			if (result_pattern_LaneToActorRule_0_2_black != null) {

				return new Object[] { csp, _this, match, laneSet, process,
						definitions, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneToActorRule_0_3_expressionFBB(
			LaneToActorRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_0_4_blackBBBBB(
			Match match, LaneSet laneSet, bpmn2.Process process,
			Definitions definitions, Lane lane) {
		return new Object[] { match, laneSet, process, definitions, lane };
	}

	public static final Object[] pattern_LaneToActorRule_0_4_greenBBBF(
			Match match, LaneSet laneSet, Lane lane) {
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(lane);
		String laneSet__lane____lanes_name_prime = "lanes";
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getToBeTranslatedEdges().add(laneSet__lane____lanes);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, laneSet, lane, laneSet__lane____lanes };
	}

	public static final Object[] pattern_LaneToActorRule_0_5_blackBBBBB(
			Match match, LaneSet laneSet, bpmn2.Process process,
			Definitions definitions, Lane lane) {
		return new Object[] { match, laneSet, process, definitions, lane };
	}

	public static final Object[] pattern_LaneToActorRule_0_5_greenBBBBFF(
			Match match, LaneSet laneSet, bpmn2.Process process,
			Definitions definitions) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(laneSet);
		match.getContextNodes().add(process);
		match.getContextNodes().add(definitions);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String definitions__process____rootElements_name_prime = "rootElements";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		match.getContextEdges().add(definitions__process____rootElements);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		return new Object[] { match, laneSet, process, definitions,
				process__laneSet____laneSets,
				definitions__process____rootElements };
	}

	public static final void pattern_LaneToActorRule_0_6_expressionBBBBBB(
			LaneToActorRule _this, Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		_this.registerObjectsToMatch_FWD(match, laneSet, process, definitions,
				lane);

	}

	public static final boolean pattern_LaneToActorRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LaneToActorRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("definitions");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("definitionsToPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("lane");
		EObject tmpLaneSet = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpDefinitions = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		EObject tmpDefinitionsToPackage = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpProcessToUseCase = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		if (tmpLaneSet instanceof LaneSet) {
			LaneSet laneSet = (LaneSet) tmpLaneSet;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpDefinitions instanceof Definitions) {
					Definitions definitions = (Definitions) tmpDefinitions;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						if (tmpDefinitionsToPackage instanceof DefinitionsToPackage) {
							DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) tmpDefinitionsToPackage;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpProcessToUseCase instanceof ProcessToUseCase) {
									ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										return new Object[] { laneSet, process,
												definitions,
												packageDeclaration,
												definitionsToPackage, useCase,
												processToUseCase, lane,
												isApplicableMatch };
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

	public static final Object[] pattern_LaneToActorRule_1_1_blackBBBBBBBBFBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane,
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { laneSet, process, definitions,
						packageDeclaration, definitionsToPackage, useCase,
						processToUseCase, lane, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_1_1_bindingAndBlackFFFFFFFFFBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LaneToActorRule_1_1_binding = pattern_LaneToActorRule_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_LaneToActorRule_1_1_binding != null) {
			LaneSet laneSet = (LaneSet) result_pattern_LaneToActorRule_1_1_binding[0];
			bpmn2.Process process = (bpmn2.Process) result_pattern_LaneToActorRule_1_1_binding[1];
			Definitions definitions = (Definitions) result_pattern_LaneToActorRule_1_1_binding[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_LaneToActorRule_1_1_binding[3];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result_pattern_LaneToActorRule_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_LaneToActorRule_1_1_binding[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_LaneToActorRule_1_1_binding[6];
			Lane lane = (Lane) result_pattern_LaneToActorRule_1_1_binding[7];

			Object[] result_pattern_LaneToActorRule_1_1_black = pattern_LaneToActorRule_1_1_blackBBBBBBBBFBB(
					laneSet, process, definitions, packageDeclaration,
					definitionsToPackage, useCase, processToUseCase, lane,
					_this, isApplicableMatch);
			if (result_pattern_LaneToActorRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LaneToActorRule_1_1_black[8];

				return new Object[] { laneSet, process, definitions,
						packageDeclaration, definitionsToPackage, useCase,
						processToUseCase, lane, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_1_1_greenBBFFB(
			PackageDeclaration packageDeclaration, Lane lane, CSP csp) {
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		LaneToActor laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createLaneToActor();
		Object _localVariable_0 = csp.getValue("actor", "name");
		Object _localVariable_1 = csp.getValue("actor", "description");
		Object _localVariable_2 = csp.getValue("actor", "type");
		packageDeclaration.getActors().add(actor);
		laneToActor.setSource(lane);
		laneToActor.setTarget(actor);
		String actor_name_prime = (String) _localVariable_0;
		String actor_description_prime = (String) _localVariable_1;
		ActorType actor_type_prime = (ActorType) _localVariable_2;
		actor.setName(actor_name_prime);
		actor.setDescription(actor_description_prime);
		actor.setType(actor_type_prime);
		return new Object[] { packageDeclaration, lane, actor, laneToActor, csp };
	}

	public static final Object[] pattern_LaneToActorRule_1_2_blackBBB(
			Lane lane, Actor actor, LaneToActor laneToActor) {
		return new Object[] { lane, actor, laneToActor };
	}

	public static final Object[] pattern_LaneToActorRule_1_2_greenFBBB(
			Lane lane, Actor actor, LaneToActor laneToActor) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(lane);
		ruleresult.getCreatedElements().add(actor);
		ruleresult.getCreatedLinkElements().add(laneToActor);
		return new Object[] { ruleresult, lane, actor, laneToActor };
	}

	public static final Object[] pattern_LaneToActorRule_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject laneSet, EObject process,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject useCase,
			EObject processToUseCase, EObject lane, EObject actor,
			EObject laneToActor) {
		if (!laneSet.equals(process)) {
			if (!laneSet.equals(packageDeclaration)) {
				if (!laneSet.equals(useCase)) {
					if (!laneSet.equals(processToUseCase)) {
						if (!laneSet.equals(laneToActor)) {
							if (!process.equals(useCase)) {
								if (!process.equals(processToUseCase)) {
									if (!definitions.equals(laneSet)) {
										if (!definitions.equals(process)) {
											if (!definitions
													.equals(packageDeclaration)) {
												if (!definitions
														.equals(definitionsToPackage)) {
													if (!definitions
															.equals(useCase)) {
														if (!definitions
																.equals(processToUseCase)) {
															if (!definitions
																	.equals(lane)) {
																if (!definitions
																		.equals(laneToActor)) {
																	if (!packageDeclaration
																			.equals(process)) {
																		if (!packageDeclaration
																				.equals(useCase)) {
																			if (!packageDeclaration
																					.equals(processToUseCase)) {
																				if (!definitionsToPackage
																						.equals(laneSet)) {
																					if (!definitionsToPackage
																							.equals(process)) {
																						if (!definitionsToPackage
																								.equals(packageDeclaration)) {
																							if (!definitionsToPackage
																									.equals(useCase)) {
																								if (!definitionsToPackage
																										.equals(processToUseCase)) {
																									if (!definitionsToPackage
																											.equals(lane)) {
																										if (!definitionsToPackage
																												.equals(laneToActor)) {
																											if (!processToUseCase
																													.equals(useCase)) {
																												if (!lane
																														.equals(laneSet)) {
																													if (!lane
																															.equals(process)) {
																														if (!lane
																																.equals(packageDeclaration)) {
																															if (!lane
																																	.equals(useCase)) {
																																if (!lane
																																		.equals(processToUseCase)) {
																																	if (!lane
																																			.equals(laneToActor)) {
																																		if (!actor
																																				.equals(laneSet)) {
																																			if (!actor
																																					.equals(process)) {
																																				if (!actor
																																						.equals(definitions)) {
																																					if (!actor
																																							.equals(packageDeclaration)) {
																																						if (!actor
																																								.equals(definitionsToPackage)) {
																																							if (!actor
																																									.equals(useCase)) {
																																								if (!actor
																																										.equals(processToUseCase)) {
																																									if (!actor
																																											.equals(lane)) {
																																										if (!actor
																																												.equals(laneToActor)) {
																																											if (!laneToActor
																																													.equals(process)) {
																																												if (!laneToActor
																																														.equals(packageDeclaration)) {
																																													if (!laneToActor
																																															.equals(useCase)) {
																																														if (!laneToActor
																																																.equals(processToUseCase)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	laneSet,
																																																	process,
																																																	definitions,
																																																	packageDeclaration,
																																																	definitionsToPackage,
																																																	useCase,
																																																	processToUseCase,
																																																	lane,
																																																	actor,
																																																	laneToActor };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LaneToActorRule_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject laneSet,
			EObject packageDeclaration, EObject lane, EObject actor,
			EObject laneToActor) {
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__lane____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LaneToActorRule";
		String laneSet__lane____lanes_name_prime = "lanes";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String laneToActor__lane____source_name_prime = "source";
		String laneToActor__actor____target_name_prime = "target";
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		ruleresult.getTranslatedEdges().add(laneSet__lane____lanes);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getCreatedEdges().add(packageDeclaration__actor____actors);
		laneToActor__lane____source.setSrc(laneToActor);
		laneToActor__lane____source.setTrg(lane);
		ruleresult.getCreatedEdges().add(laneToActor__lane____source);
		laneToActor__actor____target.setSrc(laneToActor);
		laneToActor__actor____target.setTrg(actor);
		ruleresult.getCreatedEdges().add(laneToActor__actor____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		laneToActor__lane____source
				.setName(laneToActor__lane____source_name_prime);
		laneToActor__actor____target
				.setName(laneToActor__actor____target_name_prime);
		return new Object[] { ruleresult, laneSet, packageDeclaration, lane,
				actor, laneToActor, laneSet__lane____lanes,
				packageDeclaration__actor____actors,
				laneToActor__lane____source, laneToActor__actor____target };
	}

	public static final void pattern_LaneToActorRule_1_5_expressionBBBBBBBBBBBB(
			LaneToActorRule _this, PerformRuleResult ruleresult,
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject actor, EObject laneToActor) {
		_this.registerObjects_FWD(ruleresult, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane, actor, laneToActor);

	}

	public static final PerformRuleResult pattern_LaneToActorRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_2_1_bindingFB(
			LaneToActorRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_2_1_blackFBB(
			EClass eClass, LaneToActorRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_2_1_bindingAndBlackFFB(
			LaneToActorRule _this) {
		Object[] result_pattern_LaneToActorRule_2_1_binding = pattern_LaneToActorRule_2_1_bindingFB(_this);
		if (result_pattern_LaneToActorRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LaneToActorRule_2_1_binding[0];

			Object[] result_pattern_LaneToActorRule_2_1_black = pattern_LaneToActorRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_LaneToActorRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LaneToActorRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LaneToActorRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LaneToActorRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("laneSet");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("definitions");
		EObject _localVariable_3 = match.getObject("lane");
		EObject tmpLaneSet = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpDefinitions = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		if (tmpLaneSet instanceof LaneSet) {
			LaneSet laneSet = (LaneSet) tmpLaneSet;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpDefinitions instanceof Definitions) {
					Definitions definitions = (Definitions) tmpDefinitions;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						return new Object[] { laneSet, process, definitions,
								lane, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_2_2_blackBBBFFFFBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			Lane lane, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DefinitionsToPackage definitionsToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(definitions,
						DefinitionsToPackage.class, "source")) {
			PackageDeclaration packageDeclaration = definitionsToPackage
					.getTarget();
			if (packageDeclaration != null) {
				for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(process,
								ProcessToUseCase.class, "source")) {
					UseCase useCase = processToUseCase.getTarget();
					if (useCase != null) {
						_result.add(new Object[] { laneSet, process,
								definitions, packageDeclaration,
								definitionsToPackage, useCase,
								processToUseCase, lane, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_2_3_blackBBBBBBBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (laneSet.getLanes().contains(lane)) {
			if (process.getLaneSets().contains(laneSet)) {
				if (definitions.getRootElements().contains(process)) {
					if (packageDeclaration.getUseCases().contains(useCase)) {
						if (definitions
								.equals(definitionsToPackage.getSource())) {
							if (packageDeclaration.equals(definitionsToPackage
									.getTarget())) {
								if (process
										.equals(processToUseCase.getSource())) {
									if (useCase.equals(processToUseCase
											.getTarget())) {
										_result.add(new Object[] { laneSet,
												process, definitions,
												packageDeclaration,
												definitionsToPackage, useCase,
												processToUseCase, lane });
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

	public static final Object[] pattern_LaneToActorRule_2_3_greenBBBBBBBBFFFFFFFFF(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String laneSet__lane____lanes_name_prime = "lanes";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String definitions__process____rootElements_name_prime = "rootElements";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(definitions);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(definitionsToPackage);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(lane);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				definitions__process____rootElements);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
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
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		return new Object[] { laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane, isApplicableMatch,
				laneSet__lane____lanes, process__laneSet____laneSets,
				definitions__process____rootElements,
				packageDeclaration__useCase____useCases,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				processToUseCase__process____source,
				processToUseCase__useCase____target };
	}

	public static final Object[] pattern_LaneToActorRule_2_4_bindingFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, laneSet,
					process, definitions, packageDeclaration,
					definitionsToPackage, useCase, processToUseCase, lane };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneToActorRule_2_4_bindingAndBlackFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane) {
		Object[] result_pattern_LaneToActorRule_2_4_binding = pattern_LaneToActorRule_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane);
		if (result_pattern_LaneToActorRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LaneToActorRule_2_4_binding[0];

			Object[] result_pattern_LaneToActorRule_2_4_black = pattern_LaneToActorRule_2_4_blackB(csp);
			if (result_pattern_LaneToActorRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, laneSet,
						process, definitions, packageDeclaration,
						definitionsToPackage, useCase, processToUseCase, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneToActorRule_2_5_expressionFBB(
			LaneToActorRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LaneToActorRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LaneToActorRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LaneToActorRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_10_1_blackBBBBB(
			LaneToActorRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		return new Object[] { _this, match, packageDeclaration, useCase, actor };
	}

	public static final Object[] pattern_LaneToActorRule_10_2_bindingFBBBBB(
			LaneToActorRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				packageDeclaration, useCase, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration,
					useCase, actor };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneToActorRule_10_2_bindingAndBlackFBBBBB(
			LaneToActorRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		Object[] result_pattern_LaneToActorRule_10_2_binding = pattern_LaneToActorRule_10_2_bindingFBBBBB(
				_this, match, packageDeclaration, useCase, actor);
		if (result_pattern_LaneToActorRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_LaneToActorRule_10_2_binding[0];

			Object[] result_pattern_LaneToActorRule_10_2_black = pattern_LaneToActorRule_10_2_blackB(csp);
			if (result_pattern_LaneToActorRule_10_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						useCase, actor };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneToActorRule_10_3_expressionFBB(
			LaneToActorRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_10_4_blackBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, Actor actor) {
		return new Object[] { match, packageDeclaration, useCase, actor };
	}

	public static final Object[] pattern_LaneToActorRule_10_4_greenBBBF(
			Match match, PackageDeclaration packageDeclaration, Actor actor) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(actor);
		String packageDeclaration__actor____actors_name_prime = "actors";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getToBeTranslatedEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		return new Object[] { match, packageDeclaration, actor,
				packageDeclaration__actor____actors };
	}

	public static final Object[] pattern_LaneToActorRule_10_5_blackBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, Actor actor) {
		return new Object[] { match, packageDeclaration, useCase, actor };
	}

	public static final Object[] pattern_LaneToActorRule_10_5_greenBBBF(
			Match match, PackageDeclaration packageDeclaration, UseCase useCase) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(useCase);
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { match, packageDeclaration, useCase,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_LaneToActorRule_10_6_expressionBBBBB(
			LaneToActorRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		_this.registerObjectsToMatch_BWD(match, packageDeclaration, useCase,
				actor);

	}

	public static final boolean pattern_LaneToActorRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LaneToActorRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("definitions");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("definitionsToPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("actor");
		EObject tmpLaneSet = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpDefinitions = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		EObject tmpDefinitionsToPackage = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpProcessToUseCase = _localVariable_6;
		EObject tmpActor = _localVariable_7;
		if (tmpLaneSet instanceof LaneSet) {
			LaneSet laneSet = (LaneSet) tmpLaneSet;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpDefinitions instanceof Definitions) {
					Definitions definitions = (Definitions) tmpDefinitions;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						if (tmpDefinitionsToPackage instanceof DefinitionsToPackage) {
							DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) tmpDefinitionsToPackage;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpProcessToUseCase instanceof ProcessToUseCase) {
									ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
									if (tmpActor instanceof Actor) {
										Actor actor = (Actor) tmpActor;
										return new Object[] { laneSet, process,
												definitions,
												packageDeclaration,
												definitionsToPackage, useCase,
												processToUseCase, actor,
												isApplicableMatch };
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

	public static final Object[] pattern_LaneToActorRule_11_1_blackBBBBBBBBFBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor,
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { laneSet, process, definitions,
						packageDeclaration, definitionsToPackage, useCase,
						processToUseCase, actor, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_11_1_bindingAndBlackFFFFFFFFFBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LaneToActorRule_11_1_binding = pattern_LaneToActorRule_11_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_LaneToActorRule_11_1_binding != null) {
			LaneSet laneSet = (LaneSet) result_pattern_LaneToActorRule_11_1_binding[0];
			bpmn2.Process process = (bpmn2.Process) result_pattern_LaneToActorRule_11_1_binding[1];
			Definitions definitions = (Definitions) result_pattern_LaneToActorRule_11_1_binding[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_LaneToActorRule_11_1_binding[3];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result_pattern_LaneToActorRule_11_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_LaneToActorRule_11_1_binding[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_LaneToActorRule_11_1_binding[6];
			Actor actor = (Actor) result_pattern_LaneToActorRule_11_1_binding[7];

			Object[] result_pattern_LaneToActorRule_11_1_black = pattern_LaneToActorRule_11_1_blackBBBBBBBBFBB(
					laneSet, process, definitions, packageDeclaration,
					definitionsToPackage, useCase, processToUseCase, actor,
					_this, isApplicableMatch);
			if (result_pattern_LaneToActorRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_LaneToActorRule_11_1_black[8];

				return new Object[] { laneSet, process, definitions,
						packageDeclaration, definitionsToPackage, useCase,
						processToUseCase, actor, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_11_1_greenBFBFB(
			LaneSet laneSet, Actor actor, CSP csp) {
		Lane lane = Bpmn2Factory.eINSTANCE.createLane();
		LaneToActor laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createLaneToActor();
		Object _localVariable_0 = csp.getValue("lane", "id");
		Object _localVariable_1 = csp.getValue("lane", "name");
		laneSet.getLanes().add(lane);
		laneToActor.setSource(lane);
		laneToActor.setTarget(actor);
		String lane_id_prime = (String) _localVariable_0;
		String lane_name_prime = (String) _localVariable_1;
		lane.setId(lane_id_prime);
		lane.setName(lane_name_prime);
		return new Object[] { laneSet, lane, actor, laneToActor, csp };
	}

	public static final Object[] pattern_LaneToActorRule_11_2_blackBBB(
			Lane lane, Actor actor, LaneToActor laneToActor) {
		return new Object[] { lane, actor, laneToActor };
	}

	public static final Object[] pattern_LaneToActorRule_11_2_greenFBBB(
			Lane lane, Actor actor, LaneToActor laneToActor) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(lane);
		ruleresult.getTranslatedElements().add(actor);
		ruleresult.getCreatedLinkElements().add(laneToActor);
		return new Object[] { ruleresult, lane, actor, laneToActor };
	}

	public static final Object[] pattern_LaneToActorRule_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject laneSet, EObject process,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject useCase,
			EObject processToUseCase, EObject lane, EObject actor,
			EObject laneToActor) {
		if (!laneSet.equals(process)) {
			if (!laneSet.equals(packageDeclaration)) {
				if (!laneSet.equals(useCase)) {
					if (!laneSet.equals(processToUseCase)) {
						if (!laneSet.equals(laneToActor)) {
							if (!process.equals(useCase)) {
								if (!process.equals(processToUseCase)) {
									if (!definitions.equals(laneSet)) {
										if (!definitions.equals(process)) {
											if (!definitions
													.equals(packageDeclaration)) {
												if (!definitions
														.equals(definitionsToPackage)) {
													if (!definitions
															.equals(useCase)) {
														if (!definitions
																.equals(processToUseCase)) {
															if (!definitions
																	.equals(lane)) {
																if (!definitions
																		.equals(laneToActor)) {
																	if (!packageDeclaration
																			.equals(process)) {
																		if (!packageDeclaration
																				.equals(useCase)) {
																			if (!packageDeclaration
																					.equals(processToUseCase)) {
																				if (!definitionsToPackage
																						.equals(laneSet)) {
																					if (!definitionsToPackage
																							.equals(process)) {
																						if (!definitionsToPackage
																								.equals(packageDeclaration)) {
																							if (!definitionsToPackage
																									.equals(useCase)) {
																								if (!definitionsToPackage
																										.equals(processToUseCase)) {
																									if (!definitionsToPackage
																											.equals(lane)) {
																										if (!definitionsToPackage
																												.equals(laneToActor)) {
																											if (!processToUseCase
																													.equals(useCase)) {
																												if (!lane
																														.equals(laneSet)) {
																													if (!lane
																															.equals(process)) {
																														if (!lane
																																.equals(packageDeclaration)) {
																															if (!lane
																																	.equals(useCase)) {
																																if (!lane
																																		.equals(processToUseCase)) {
																																	if (!lane
																																			.equals(laneToActor)) {
																																		if (!actor
																																				.equals(laneSet)) {
																																			if (!actor
																																					.equals(process)) {
																																				if (!actor
																																						.equals(definitions)) {
																																					if (!actor
																																							.equals(packageDeclaration)) {
																																						if (!actor
																																								.equals(definitionsToPackage)) {
																																							if (!actor
																																									.equals(useCase)) {
																																								if (!actor
																																										.equals(processToUseCase)) {
																																									if (!actor
																																											.equals(lane)) {
																																										if (!actor
																																												.equals(laneToActor)) {
																																											if (!laneToActor
																																													.equals(process)) {
																																												if (!laneToActor
																																														.equals(packageDeclaration)) {
																																													if (!laneToActor
																																															.equals(useCase)) {
																																														if (!laneToActor
																																																.equals(processToUseCase)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	laneSet,
																																																	process,
																																																	definitions,
																																																	packageDeclaration,
																																																	definitionsToPackage,
																																																	useCase,
																																																	processToUseCase,
																																																	lane,
																																																	actor,
																																																	laneToActor };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LaneToActorRule_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject laneSet,
			EObject packageDeclaration, EObject lane, EObject actor,
			EObject laneToActor) {
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__lane____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LaneToActorRule";
		String laneSet__lane____lanes_name_prime = "lanes";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String laneToActor__lane____source_name_prime = "source";
		String laneToActor__actor____target_name_prime = "target";
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		ruleresult.getCreatedEdges().add(laneSet__lane____lanes);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getTranslatedEdges()
				.add(packageDeclaration__actor____actors);
		laneToActor__lane____source.setSrc(laneToActor);
		laneToActor__lane____source.setTrg(lane);
		ruleresult.getCreatedEdges().add(laneToActor__lane____source);
		laneToActor__actor____target.setSrc(laneToActor);
		laneToActor__actor____target.setTrg(actor);
		ruleresult.getCreatedEdges().add(laneToActor__actor____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		laneToActor__lane____source
				.setName(laneToActor__lane____source_name_prime);
		laneToActor__actor____target
				.setName(laneToActor__actor____target_name_prime);
		return new Object[] { ruleresult, laneSet, packageDeclaration, lane,
				actor, laneToActor, laneSet__lane____lanes,
				packageDeclaration__actor____actors,
				laneToActor__lane____source, laneToActor__actor____target };
	}

	public static final void pattern_LaneToActorRule_11_5_expressionBBBBBBBBBBBB(
			LaneToActorRule _this, PerformRuleResult ruleresult,
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject actor, EObject laneToActor) {
		_this.registerObjects_BWD(ruleresult, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, lane, actor, laneToActor);

	}

	public static final PerformRuleResult pattern_LaneToActorRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_12_1_bindingFB(
			LaneToActorRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_12_1_blackFBB(
			EClass eClass, LaneToActorRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_12_1_bindingAndBlackFFB(
			LaneToActorRule _this) {
		Object[] result_pattern_LaneToActorRule_12_1_binding = pattern_LaneToActorRule_12_1_bindingFB(_this);
		if (result_pattern_LaneToActorRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LaneToActorRule_12_1_binding[0];

			Object[] result_pattern_LaneToActorRule_12_1_black = pattern_LaneToActorRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_LaneToActorRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LaneToActorRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LaneToActorRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LaneToActorRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("actor");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					return new Object[] { packageDeclaration, useCase, actor,
							match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_12_2_blackFFBFBFBB(
			PackageDeclaration packageDeclaration, UseCase useCase,
			Actor actor, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DefinitionsToPackage definitionsToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						DefinitionsToPackage.class, "target")) {
			Definitions definitions = definitionsToPackage.getSource();
			if (definitions != null) {
				for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(useCase,
								ProcessToUseCase.class, "target")) {
					bpmn2.Process process = processToUseCase.getSource();
					if (process != null) {
						_result.add(new Object[] { process, definitions,
								packageDeclaration, definitionsToPackage,
								useCase, processToUseCase, actor, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_12_3_blackFBBBBBBB(
			bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (definitions.getRootElements().contains(process)) {
			if (packageDeclaration.getUseCases().contains(useCase)) {
				if (packageDeclaration.getActors().contains(actor)) {
					if (definitions.equals(definitionsToPackage.getSource())) {
						if (packageDeclaration.equals(definitionsToPackage
								.getTarget())) {
							if (process.equals(processToUseCase.getSource())) {
								if (useCase
										.equals(processToUseCase.getTarget())) {
									for (LaneSet laneSet : process
											.getLaneSets()) {
										_result.add(new Object[] { laneSet,
												process, definitions,
												packageDeclaration,
												definitionsToPackage, useCase,
												processToUseCase, actor });
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

	public static final Object[] pattern_LaneToActorRule_12_3_greenBBBBBBBBFFFFFFFFF(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		String definitions__process____rootElements_name_prime = "rootElements";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(definitions);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(definitionsToPackage);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(actor);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				definitions__process____rootElements);
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
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		return new Object[] { laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, actor, isApplicableMatch,
				process__laneSet____laneSets,
				definitions__process____rootElements,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				processToUseCase__process____source,
				processToUseCase__useCase____target };
	}

	public static final Object[] pattern_LaneToActorRule_12_4_bindingFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, laneSet,
					process, definitions, packageDeclaration,
					definitionsToPackage, useCase, processToUseCase, actor };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneToActorRule_12_4_bindingAndBlackFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase, Actor actor) {
		Object[] result_pattern_LaneToActorRule_12_4_binding = pattern_LaneToActorRule_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, actor);
		if (result_pattern_LaneToActorRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_LaneToActorRule_12_4_binding[0];

			Object[] result_pattern_LaneToActorRule_12_4_black = pattern_LaneToActorRule_12_4_blackB(csp);
			if (result_pattern_LaneToActorRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, laneSet,
						process, definitions, packageDeclaration,
						definitionsToPackage, useCase, processToUseCase, actor };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneToActorRule_12_5_expressionFBB(
			LaneToActorRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LaneToActorRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LaneToActorRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LaneToActorRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_20_1_bindingFB(
			LaneToActorRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_20_1_blackFBB(
			EClass __eClass, LaneToActorRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_20_1_bindingAndBlackFFB(
			LaneToActorRule _this) {
		Object[] result_pattern_LaneToActorRule_20_1_binding = pattern_LaneToActorRule_20_1_bindingFB(_this);
		if (result_pattern_LaneToActorRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LaneToActorRule_20_1_binding[0];

			Object[] result_pattern_LaneToActorRule_20_1_black = pattern_LaneToActorRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_LaneToActorRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LaneToActorRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LaneToActorRule_20_2_black_nac_0BB(
			Lane lane, LaneSet laneSet) {
		for (LaneSet __DEC_lane_lanes_807636 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(lane, LaneSet.class, "lanes")) {
			if (!laneSet.equals(__DEC_lane_lanes_807636)) {
				return new Object[] { lane, laneSet };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_20_2_blackFFFFB(
			EMoflonEdge _edge_lanes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLaneSet = _edge_lanes.getSrc();
		if (tmpLaneSet instanceof LaneSet) {
			LaneSet laneSet = (LaneSet) tmpLaneSet;
			EObject tmpLane = _edge_lanes.getTrg();
			if (tmpLane instanceof Lane) {
				Lane lane = (Lane) tmpLane;
				if (laneSet.getLanes().contains(lane)) {
					if (pattern_LaneToActorRule_20_2_black_nac_0BB(lane,
							laneSet) == null) {
						for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(laneSet,
										FlowElementsContainer.class, "laneSets")) {
							if (tmpProcess instanceof bpmn2.Process) {
								bpmn2.Process process = (bpmn2.Process) tmpProcess;
								for (Definitions definitions : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(process,
												Definitions.class,
												"rootElements")) {
									_result.add(new Object[] { laneSet,
											process, definitions, lane,
											_edge_lanes });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LaneToActorRule_20_3_expressionFBBBBBB(
			LaneToActorRule _this, Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, laneSet,
				process, definitions, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LaneToActorRule_20_4_expressionFBB(
			LaneToActorRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LaneToActorRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LaneToActorRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_21_1_bindingFB(
			LaneToActorRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_21_1_blackFBB(
			EClass __eClass, LaneToActorRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_21_1_bindingAndBlackFFB(
			LaneToActorRule _this) {
		Object[] result_pattern_LaneToActorRule_21_1_binding = pattern_LaneToActorRule_21_1_bindingFB(_this);
		if (result_pattern_LaneToActorRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LaneToActorRule_21_1_binding[0];

			Object[] result_pattern_LaneToActorRule_21_1_black = pattern_LaneToActorRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_LaneToActorRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LaneToActorRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LaneToActorRule_21_2_black_nac_0BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_282872 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_282872)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_21_2_blackFFFB(
			EMoflonEdge _edge_actors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_actors.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpActor = _edge_actors.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (packageDeclaration.getActors().contains(actor)) {
					if (pattern_LaneToActorRule_21_2_black_nac_0BB(actor,
							packageDeclaration) == null) {
						for (UseCase useCase : packageDeclaration.getUseCases()) {
							_result.add(new Object[] { packageDeclaration,
									useCase, actor, _edge_actors });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LaneToActorRule_21_3_expressionFBBBBB(
			LaneToActorRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				packageDeclaration, useCase, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LaneToActorRule_21_4_expressionFBB(
			LaneToActorRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LaneToActorRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LaneToActorRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_24_1_blackB(
			LaneToActorRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LaneToActorRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Definitions definitions) {
		if (ruleResult.getSourceObjects().contains(definitions)) {
			return new Object[] { ruleResult, definitions };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult,
			DefinitionsToPackage definitionsToPackage) {
		if (ruleResult.getCorrObjects().contains(definitionsToPackage)) {
			return new Object[] { ruleResult, definitionsToPackage };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getTargetObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneToActorRule_24_2_blackFFFFFFFFBB(
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
							if (pattern_LaneToActorRule_24_2_black_nac_3BB(
									ruleResult, definitionsToPackage) == null) {
								if (pattern_LaneToActorRule_24_2_black_nac_2BB(
										ruleResult, definitions) == null) {
									if (pattern_LaneToActorRule_24_2_black_nac_4BB(
											ruleResult, packageDeclaration) == null) {
										for (RootElement tmpProcess : definitions
												.getRootElements()) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_LaneToActorRule_24_2_black_nac_1BB(
														ruleResult, process) == null) {
													for (UseCase useCase : packageDeclaration
															.getUseCases()) {
														if (pattern_LaneToActorRule_24_2_black_nac_5BB(
																ruleResult,
																useCase) == null) {
															for (LaneSet laneSet : process
																	.getLaneSets()) {
																if (pattern_LaneToActorRule_24_2_black_nac_0BB(
																		ruleResult,
																		laneSet) == null) {
																	for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					process,
																					ProcessToUseCase.class,
																					"source")) {
																		if (useCase
																				.equals(processToUseCase
																						.getTarget())) {
																			if (pattern_LaneToActorRule_24_2_black_nac_6BB(
																					ruleResult,
																					processToUseCase) == null) {
																				_result.add(new Object[] {
																						definitionsToPackageList,
																						laneSet,
																						process,
																						definitions,
																						definitionsToPackage,
																						packageDeclaration,
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
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_24_3_bindingFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, laneSet,
					process, definitions, packageDeclaration,
					definitionsToPackage, useCase, processToUseCase, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LaneToActorRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneToActorRule_24_3_bindingAndBlackFBBBBBBBBBB(
			LaneToActorRule _this, IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LaneToActorRule_24_3_binding = pattern_LaneToActorRule_24_3_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, ruleResult);
		if (result_pattern_LaneToActorRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_LaneToActorRule_24_3_binding[0];

			Object[] result_pattern_LaneToActorRule_24_3_black = pattern_LaneToActorRule_24_3_blackB(csp);
			if (result_pattern_LaneToActorRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, laneSet,
						process, definitions, packageDeclaration,
						definitionsToPackage, useCase, processToUseCase,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneToActorRule_24_4_expressionFBB(
			LaneToActorRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneToActorRule_24_5_blackBBBBBBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase) {
		return new Object[] { laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase };
	}

	public static final Object[] pattern_LaneToActorRule_24_6_blackBBBBBBBB(
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			ProcessToUseCase processToUseCase,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { laneSet, process, definitions,
				packageDeclaration, definitionsToPackage, useCase,
				processToUseCase, ruleResult };
	}

	public static final Object[] pattern_LaneToActorRule_24_6_greenBBFFFBB(
			LaneSet laneSet, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Lane lane = Bpmn2Factory.eINSTANCE.createLane();
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		LaneToActor laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createLaneToActor();
		Object _localVariable_0 = csp.getValue("lane", "id");
		Object _localVariable_1 = csp.getValue("lane", "name");
		Object _localVariable_2 = csp.getValue("actor", "name");
		Object _localVariable_3 = csp.getValue("actor", "description");
		Object _localVariable_4 = csp.getValue("actor", "type");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		laneSet.getLanes().add(lane);
		ruleResult.getSourceObjects().add(lane);
		packageDeclaration.getActors().add(actor);
		ruleResult.getTargetObjects().add(actor);
		laneToActor.setSource(lane);
		laneToActor.setTarget(actor);
		ruleResult.getCorrObjects().add(laneToActor);
		String lane_id_prime = (String) _localVariable_0;
		String lane_name_prime = (String) _localVariable_1;
		String actor_name_prime = (String) _localVariable_2;
		String actor_description_prime = (String) _localVariable_3;
		ActorType actor_type_prime = (ActorType) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		lane.setId(lane_id_prime);
		lane.setName(lane_name_prime);
		actor.setName(actor_name_prime);
		actor.setDescription(actor_description_prime);
		actor.setType(actor_type_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { laneSet, packageDeclaration, lane, actor,
				laneToActor, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_LaneToActorRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LaneToActorRuleImpl
