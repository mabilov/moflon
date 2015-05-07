/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;

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

import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel;

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
 * An implementation of the model object '<em><b>UC Model To MSD Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UCModelToMSDModelRuleImpl extends AbstractRuleImpl implements
		UCModelToMSDModelRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCModelToMSDModelRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUCModelToMSDModelRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCasesModel useCasesModel) {
		// initial bindings
		Object[] result1_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_0_1_blackBBB(this, match,
						useCasesModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_0_2_bindingAndBlackFBBB(this,
						match, useCasesModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_4_blackBB(match,
							useCasesModel);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_4_greenBB(match,
							useCasesModel);

			// collect context elements
			Object[] result5_black = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_5_blackBB(match,
							useCasesModel);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_6_expressionBBB(this,
							match, useCasesModel);
			return UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_7_expressionF();
		} else {
			return UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_1_greenBFF(useCasesModel);
		Model model = (Model) result1_green[1];
		UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result1_green[2];

		// collect translated elements
		Object[] result2_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_2_blackBBB(useCasesModel,
						model, useCasesModelToModel);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_2_greenFBBB(useCasesModel,
						model, useCasesModelToModel);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_3_blackBBBB(ruleresult,
						useCasesModel, model, useCasesModelToModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_3_greenBBBBFF(ruleresult,
						useCasesModel, model, useCasesModelToModel);
		// EMoflonEdge useCasesModelToModel__useCasesModel____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge useCasesModelToModel__model____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_5_expressionBBBBB(this,
						ruleresult, useCasesModel, model, useCasesModelToModel);
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result2_binding[0];
		for (Object[] result2_black : UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_2_2_blackBB(useCasesModel, match)) {
			// ForEach find context
			for (Object[] result3_black : UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_2_3_blackB(useCasesModel)) {
				Object[] result3_green = UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_2_3_greenBF(useCasesModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_2_4_bindingAndBlackFBBB(
								this, isApplicableMatch, useCasesModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			UseCasesModel useCasesModel) {
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			UseCasesModel useCasesModel) {// Create CSP
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
			UseCasesModel useCasesModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("useCasesModel")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getUseCasesModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Model model) {
		// initial bindings
		Object[] result1_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_10_1_blackBBB(this, match, model);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_10_2_bindingAndBlackFBBB(this,
						match, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_4_blackBB(match, model);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_4_greenBB(match, model);

			// collect context elements
			Object[] result5_black = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_5_blackBB(match, model);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_6_expressionBBB(this,
							match, model);
			return UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_7_expressionF();
		} else {
			return UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Model model = (Model) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_1_greenFBF(model);
		UseCasesModel useCasesModel = (UseCasesModel) result1_green[0];
		UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result1_green[2];

		// collect translated elements
		Object[] result2_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_2_blackBBB(useCasesModel,
						model, useCasesModelToModel);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_2_greenFBBB(useCasesModel,
						model, useCasesModelToModel);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_3_blackBBBB(ruleresult,
						useCasesModel, model, useCasesModelToModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_3_greenBBBBFF(ruleresult,
						useCasesModel, model, useCasesModelToModel);
		// EMoflonEdge useCasesModelToModel__useCasesModel____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge useCasesModelToModel__model____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_5_expressionBBBBB(this,
						ruleresult, useCasesModel, model, useCasesModelToModel);
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_12_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Model model = (Model) result2_binding[0];
		for (Object[] result2_black : UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_12_2_blackBB(model, match)) {
			// ForEach find context
			for (Object[] result3_black : UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_12_3_blackB(model)) {
				Object[] result3_green = UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_12_3_greenBF(model);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_12_4_bindingAndBlackFBBB(
								this, isApplicableMatch, model);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Model model) {
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Model model) {// Create CSP
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
			Model model) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("model")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_UseCasesModel_1(
			UseCasesModel useCasesModel) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_20_2_blackB(useCasesModel)) {
			Object[] result2_green = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_20_3_expressionFBBB(this,
							match, useCasesModel)) {
				// Ensure that the correct types of elements are matched
				if (UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Model_1(Model model) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_21_2_blackB(model)) {
			Object[] result2_green = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_21_3_expressionFBBB(this,
							match, model)) {
				// Ensure that the correct types of elements are matched
				if (UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UCModelToMSDModelRuleImpl
							.pattern_UCModelToMSDModelRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer) {
		// create result
		Object[] result1_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// is applicable core
		Object[] result2_black = UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_24_2_blackB(this);
		if (result2_black != null) {

			// solve CSP
			Object[] result3_bindingAndBlack = UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_24_3_bindingAndBlackFBBB(
							this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UCModelToMSDModelRuleImpl
					.pattern_UCModelToMSDModelRule_24_4_expressionFBB(this, csp)) {
				// check nacs story node is empty

				// perform
				Object[] result6_black = UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_24_6_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [perform] failed");
				}
				UCModelToMSDModelRuleImpl
						.pattern_UCModelToMSDModelRule_24_6_greenFFFB(ruleResult);
				// UseCasesModel useCasesModel = (UseCasesModel) result6_green[0];
				// Model model = (Model) result6_green[1];
				// UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result6_green[2];

			} else {
			}

		} else {
		}
		return UCModelToMSDModelRuleImpl
				.pattern_UCModelToMSDModelRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_MODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_1__USECASESMODEL:
			return isAppropriate_FWD_UseCasesModel_1((UseCasesModel) arguments
					.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_1__MODEL:
			return isAppropriate_BWD_Model_1((Model) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_1_blackBBB(
			UCModelToMSDModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		return new Object[] { _this, match, useCasesModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_2_bindingFBBB(
			UCModelToMSDModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				useCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_2_bindingAndBlackFBBB(
			UCModelToMSDModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		Object[] result_pattern_UCModelToMSDModelRule_0_2_binding = pattern_UCModelToMSDModelRule_0_2_bindingFBBB(
				_this, match, useCasesModel);
		if (result_pattern_UCModelToMSDModelRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_0_2_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_0_2_black = pattern_UCModelToMSDModelRule_0_2_blackB(csp);
			if (result_pattern_UCModelToMSDModelRule_0_2_black != null) {

				return new Object[] { csp, _this, match, useCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UCModelToMSDModelRule_0_3_expressionFBB(
			UCModelToMSDModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_4_blackBB(
			Match match, UseCasesModel useCasesModel) {
		return new Object[] { match, useCasesModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_4_greenBB(
			Match match, UseCasesModel useCasesModel) {
		match.getToBeTranslatedNodes().add(useCasesModel);
		return new Object[] { match, useCasesModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_0_5_blackBB(
			Match match, UseCasesModel useCasesModel) {
		return new Object[] { match, useCasesModel };
	}

	public static final void pattern_UCModelToMSDModelRule_0_6_expressionBBB(
			UCModelToMSDModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		_this.registerObjectsToMatch_FWD(match, useCasesModel);

	}

	public static final boolean pattern_UCModelToMSDModelRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UCModelToMSDModelRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCasesModel");
		EObject tmpUseCasesModel = _localVariable_0;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			return new Object[] { useCasesModel, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_1_blackBFBB(
			UseCasesModel useCasesModel, UCModelToMSDModelRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_1_bindingAndBlackFFBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UCModelToMSDModelRule_1_1_binding = pattern_UCModelToMSDModelRule_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_UCModelToMSDModelRule_1_1_binding != null) {
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_UCModelToMSDModelRule_1_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_1_1_black = pattern_UCModelToMSDModelRule_1_1_blackBFBB(
					useCasesModel, _this, isApplicableMatch);
			if (result_pattern_UCModelToMSDModelRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_1_1_black[1];

				return new Object[] { useCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_1_greenBFF(
			UseCasesModel useCasesModel) {
		Model model = ModalSequenceDiagramFactory.eINSTANCE.createModel();
		UseCasesModelToModel useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCasesModelToModel();
		useCasesModelToModel.setSource(useCasesModel);
		useCasesModelToModel.setTarget(model);
		return new Object[] { useCasesModel, model, useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_2_blackBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel) {
		return new Object[] { useCasesModel, model, useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_2_greenFBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(useCasesModel);
		ruleresult.getCreatedElements().add(model);
		ruleresult.getCreatedLinkElements().add(useCasesModelToModel);
		return new Object[] { ruleresult, useCasesModel, model,
				useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel) {
		if (!useCasesModel.equals(useCasesModelToModel)) {
			if (!model.equals(useCasesModel)) {
				if (!model.equals(useCasesModelToModel)) {
					return new Object[] { ruleresult, useCasesModel, model,
							useCasesModelToModel };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel) {
		EMoflonEdge useCasesModelToModel__useCasesModel____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__model____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UCModelToMSDModelRule";
		String useCasesModelToModel__useCasesModel____source_name_prime = "source";
		String useCasesModelToModel__model____target_name_prime = "target";
		useCasesModelToModel__useCasesModel____source
				.setSrc(useCasesModelToModel);
		useCasesModelToModel__useCasesModel____source.setTrg(useCasesModel);
		ruleresult.getCreatedEdges().add(
				useCasesModelToModel__useCasesModel____source);
		useCasesModelToModel__model____target.setSrc(useCasesModelToModel);
		useCasesModelToModel__model____target.setTrg(model);
		ruleresult.getCreatedEdges().add(useCasesModelToModel__model____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCasesModelToModel__useCasesModel____source
				.setName(useCasesModelToModel__useCasesModel____source_name_prime);
		useCasesModelToModel__model____target
				.setName(useCasesModelToModel__model____target_name_prime);
		return new Object[] { ruleresult, useCasesModel, model,
				useCasesModelToModel,
				useCasesModelToModel__useCasesModel____source,
				useCasesModelToModel__model____target };
	}

	public static final void pattern_UCModelToMSDModelRule_1_5_expressionBBBBB(
			UCModelToMSDModelRule _this, PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		_this.registerObjects_FWD(ruleresult, useCasesModel, model,
				useCasesModelToModel);

	}

	public static final PerformRuleResult pattern_UCModelToMSDModelRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_1_bindingFB(
			UCModelToMSDModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_1_blackFBB(
			EClass eClass, UCModelToMSDModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_1_bindingAndBlackFFB(
			UCModelToMSDModelRule _this) {
		Object[] result_pattern_UCModelToMSDModelRule_2_1_binding = pattern_UCModelToMSDModelRule_2_1_bindingFB(_this);
		if (result_pattern_UCModelToMSDModelRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UCModelToMSDModelRule_2_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_2_1_black = pattern_UCModelToMSDModelRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UCModelToMSDModelRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UCModelToMSDModelRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UCModelToMSDModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCasesModel");
		EObject tmpUseCasesModel = _localVariable_0;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			return new Object[] { useCasesModel, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_2_2_blackBB(
			UseCasesModel useCasesModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_2_3_blackB(
			UseCasesModel useCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel });
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_3_greenBF(
			UseCasesModel useCasesModel) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		return new Object[] { useCasesModel, isApplicableMatch };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_4_bindingFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, useCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_4_bindingAndBlackFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel) {
		Object[] result_pattern_UCModelToMSDModelRule_2_4_binding = pattern_UCModelToMSDModelRule_2_4_bindingFBBB(
				_this, isApplicableMatch, useCasesModel);
		if (result_pattern_UCModelToMSDModelRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_2_4_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_2_4_black = pattern_UCModelToMSDModelRule_2_4_blackB(csp);
			if (result_pattern_UCModelToMSDModelRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UCModelToMSDModelRule_2_5_expressionFBB(
			UCModelToMSDModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UCModelToMSDModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UCModelToMSDModelRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_1_blackBBB(
			UCModelToMSDModelRule _this, Match match, Model model) {
		return new Object[] { _this, match, model };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_2_bindingFBBB(
			UCModelToMSDModelRule _this, Match match, Model model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_2_bindingAndBlackFBBB(
			UCModelToMSDModelRule _this, Match match, Model model) {
		Object[] result_pattern_UCModelToMSDModelRule_10_2_binding = pattern_UCModelToMSDModelRule_10_2_bindingFBBB(
				_this, match, model);
		if (result_pattern_UCModelToMSDModelRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_10_2_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_10_2_black = pattern_UCModelToMSDModelRule_10_2_blackB(csp);
			if (result_pattern_UCModelToMSDModelRule_10_2_black != null) {

				return new Object[] { csp, _this, match, model };
			}
		}
		return null;
	}

	public static final boolean pattern_UCModelToMSDModelRule_10_3_expressionFBB(
			UCModelToMSDModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_4_blackBB(
			Match match, Model model) {
		return new Object[] { match, model };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_4_greenBB(
			Match match, Model model) {
		match.getToBeTranslatedNodes().add(model);
		return new Object[] { match, model };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_10_5_blackBB(
			Match match, Model model) {
		return new Object[] { match, model };
	}

	public static final void pattern_UCModelToMSDModelRule_10_6_expressionBBB(
			UCModelToMSDModelRule _this, Match match, Model model) {
		_this.registerObjectsToMatch_BWD(match, model);

	}

	public static final boolean pattern_UCModelToMSDModelRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UCModelToMSDModelRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			return new Object[] { model, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_1_blackBFBB(
			Model model, UCModelToMSDModelRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_1_bindingAndBlackFFBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UCModelToMSDModelRule_11_1_binding = pattern_UCModelToMSDModelRule_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_UCModelToMSDModelRule_11_1_binding != null) {
			Model model = (Model) result_pattern_UCModelToMSDModelRule_11_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_11_1_black = pattern_UCModelToMSDModelRule_11_1_blackBFBB(
					model, _this, isApplicableMatch);
			if (result_pattern_UCModelToMSDModelRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_11_1_black[1];

				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_1_greenFBF(
			Model model) {
		UseCasesModel useCasesModel = UseCaseDSLFactory.eINSTANCE
				.createUseCasesModel();
		UseCasesModelToModel useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCasesModelToModel();
		useCasesModelToModel.setSource(useCasesModel);
		useCasesModelToModel.setTarget(model);
		return new Object[] { useCasesModel, model, useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_2_blackBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel) {
		return new Object[] { useCasesModel, model, useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_2_greenFBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(useCasesModel);
		ruleresult.getTranslatedElements().add(model);
		ruleresult.getCreatedLinkElements().add(useCasesModelToModel);
		return new Object[] { ruleresult, useCasesModel, model,
				useCasesModelToModel };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel) {
		if (!useCasesModel.equals(useCasesModelToModel)) {
			if (!model.equals(useCasesModel)) {
				if (!model.equals(useCasesModelToModel)) {
					return new Object[] { ruleresult, useCasesModel, model,
							useCasesModelToModel };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel) {
		EMoflonEdge useCasesModelToModel__useCasesModel____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__model____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UCModelToMSDModelRule";
		String useCasesModelToModel__useCasesModel____source_name_prime = "source";
		String useCasesModelToModel__model____target_name_prime = "target";
		useCasesModelToModel__useCasesModel____source
				.setSrc(useCasesModelToModel);
		useCasesModelToModel__useCasesModel____source.setTrg(useCasesModel);
		ruleresult.getCreatedEdges().add(
				useCasesModelToModel__useCasesModel____source);
		useCasesModelToModel__model____target.setSrc(useCasesModelToModel);
		useCasesModelToModel__model____target.setTrg(model);
		ruleresult.getCreatedEdges().add(useCasesModelToModel__model____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCasesModelToModel__useCasesModel____source
				.setName(useCasesModelToModel__useCasesModel____source_name_prime);
		useCasesModelToModel__model____target
				.setName(useCasesModelToModel__model____target_name_prime);
		return new Object[] { ruleresult, useCasesModel, model,
				useCasesModelToModel,
				useCasesModelToModel__useCasesModel____source,
				useCasesModelToModel__model____target };
	}

	public static final void pattern_UCModelToMSDModelRule_11_5_expressionBBBBB(
			UCModelToMSDModelRule _this, PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		_this.registerObjects_BWD(ruleresult, useCasesModel, model,
				useCasesModelToModel);

	}

	public static final PerformRuleResult pattern_UCModelToMSDModelRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_1_bindingFB(
			UCModelToMSDModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_1_blackFBB(
			EClass eClass, UCModelToMSDModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_1_bindingAndBlackFFB(
			UCModelToMSDModelRule _this) {
		Object[] result_pattern_UCModelToMSDModelRule_12_1_binding = pattern_UCModelToMSDModelRule_12_1_bindingFB(_this);
		if (result_pattern_UCModelToMSDModelRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UCModelToMSDModelRule_12_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_12_1_black = pattern_UCModelToMSDModelRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UCModelToMSDModelRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UCModelToMSDModelRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UCModelToMSDModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			return new Object[] { model, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_12_2_blackBB(
			Model model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_12_3_blackB(
			Model model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_3_greenBF(
			Model model) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(model);
		return new Object[] { model, isApplicableMatch };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_4_bindingFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			Model model) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_4_bindingAndBlackFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			Model model) {
		Object[] result_pattern_UCModelToMSDModelRule_12_4_binding = pattern_UCModelToMSDModelRule_12_4_bindingFBBB(
				_this, isApplicableMatch, model);
		if (result_pattern_UCModelToMSDModelRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_12_4_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_12_4_black = pattern_UCModelToMSDModelRule_12_4_blackB(csp);
			if (result_pattern_UCModelToMSDModelRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model };
			}
		}
		return null;
	}

	public static final boolean pattern_UCModelToMSDModelRule_12_5_expressionFBB(
			UCModelToMSDModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UCModelToMSDModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UCModelToMSDModelRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_1_bindingFB(
			UCModelToMSDModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_1_blackFBB(
			EClass __eClass, UCModelToMSDModelRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_1_bindingAndBlackFFB(
			UCModelToMSDModelRule _this) {
		Object[] result_pattern_UCModelToMSDModelRule_20_1_binding = pattern_UCModelToMSDModelRule_20_1_bindingFB(_this);
		if (result_pattern_UCModelToMSDModelRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UCModelToMSDModelRule_20_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_20_1_black = pattern_UCModelToMSDModelRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UCModelToMSDModelRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UCModelToMSDModelRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_20_2_blackB(
			UseCasesModel useCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel });
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UCModelToMSDModelRule_20_3_expressionFBBB(
			UCModelToMSDModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		boolean _localVariable_0 = _this
				.isAppropriate_FWD(match, useCasesModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UCModelToMSDModelRule_20_4_expressionFBB(
			UCModelToMSDModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UCModelToMSDModelRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_1_bindingFB(
			UCModelToMSDModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_1_blackFBB(
			EClass __eClass, UCModelToMSDModelRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_1_bindingAndBlackFFB(
			UCModelToMSDModelRule _this) {
		Object[] result_pattern_UCModelToMSDModelRule_21_1_binding = pattern_UCModelToMSDModelRule_21_1_bindingFB(_this);
		if (result_pattern_UCModelToMSDModelRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UCModelToMSDModelRule_21_1_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_21_1_black = pattern_UCModelToMSDModelRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UCModelToMSDModelRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UCModelToMSDModelRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UCModelToMSDModelRule_21_2_blackB(
			Model model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UCModelToMSDModelRule_21_3_expressionFBBB(
			UCModelToMSDModelRule _this, Match match, Model model) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UCModelToMSDModelRule_21_4_expressionFBB(
			UCModelToMSDModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UCModelToMSDModelRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_1_blackB(
			UCModelToMSDModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_2_blackB(
			UCModelToMSDModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_3_bindingFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_3_bindingAndBlackFBBB(
			UCModelToMSDModelRule _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UCModelToMSDModelRule_24_3_binding = pattern_UCModelToMSDModelRule_24_3_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_UCModelToMSDModelRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_UCModelToMSDModelRule_24_3_binding[0];

			Object[] result_pattern_UCModelToMSDModelRule_24_3_black = pattern_UCModelToMSDModelRule_24_3_blackB(csp);
			if (result_pattern_UCModelToMSDModelRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UCModelToMSDModelRule_24_4_expressionFBB(
			UCModelToMSDModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_6_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_UCModelToMSDModelRule_24_6_greenFFFB(
			ModelgeneratorRuleResult ruleResult) {
		UseCasesModel useCasesModel = UseCaseDSLFactory.eINSTANCE
				.createUseCasesModel();
		Model model = ModalSequenceDiagramFactory.eINSTANCE.createModel();
		UseCasesModelToModel useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCasesModelToModel();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(useCasesModel);
		ruleResult.getTargetObjects().add(model);
		useCasesModelToModel.setSource(useCasesModel);
		useCasesModelToModel.setTarget(model);
		ruleResult.getCorrObjects().add(useCasesModelToModel);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { useCasesModel, model, useCasesModelToModel,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_UCModelToMSDModelRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UCModelToMSDModelRuleImpl
