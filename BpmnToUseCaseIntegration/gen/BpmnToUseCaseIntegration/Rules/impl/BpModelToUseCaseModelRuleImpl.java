/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DocRootToUCModel;

import BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

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

import bpmn2.Bpmn2Factory;
import bpmn2.DocumentRoot;

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
 * An implementation of the model object '<em><b>Bp Model To Use Case Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BpModelToUseCaseModelRuleImpl extends AbstractRuleImpl implements
		BpModelToUseCaseModelRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpModelToUseCaseModelRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getBpModelToUseCaseModelRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, DocumentRoot documentRoot) {
		// initial bindings
		Object[] result1_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_0_1_blackBBB(this, match,
						documentRoot);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[documentRoot] = "
							+ documentRoot + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_0_2_bindingAndBlackFBBB(
						this, match, documentRoot);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[documentRoot] = "
							+ documentRoot + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_4_blackBB(match,
							documentRoot);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[documentRoot] = " + documentRoot + ".");
			}
			BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_4_greenBB(match,
							documentRoot);

			// collect context elements
			Object[] result5_black = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_5_blackBB(match,
							documentRoot);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[documentRoot] = " + documentRoot + ".");
			}
			// register objects to match
			BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_6_expressionBBB(this,
							match, documentRoot);
			return BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_7_expressionF();
		} else {
			return BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_1_bindingAndBlackFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		DocumentRoot documentRoot = (DocumentRoot) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_1_greenBFF(documentRoot);
		UseCasesModel useCasesModel = (UseCasesModel) result1_green[1];
		DocRootToUCModel docRootToUCModel = (DocRootToUCModel) result1_green[2];

		// collect translated elements
		Object[] result2_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_2_blackBBB(documentRoot,
						useCasesModel, docRootToUCModel);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[documentRoot] = "
							+ documentRoot + ", " + "[useCasesModel] = "
							+ useCasesModel + ", " + "[docRootToUCModel] = "
							+ docRootToUCModel + ".");
		}
		Object[] result2_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_2_greenFBBB(documentRoot,
						useCasesModel, docRootToUCModel);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_3_blackBBBB(ruleresult,
						documentRoot, useCasesModel, docRootToUCModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[documentRoot] = " + documentRoot + ", "
							+ "[useCasesModel] = " + useCasesModel + ", "
							+ "[docRootToUCModel] = " + docRootToUCModel + ".");
		}
		BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_3_greenBBBBFF(ruleresult,
						documentRoot, useCasesModel, docRootToUCModel);
		// EMoflonEdge docRootToUCModel__documentRoot____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge docRootToUCModel__useCasesModel____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_5_expressionBBBBB(this,
						ruleresult, documentRoot, useCasesModel,
						docRootToUCModel);
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		DocumentRoot documentRoot = (DocumentRoot) result2_binding[0];
		for (Object[] result2_black : BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_2_2_blackBB(documentRoot,
						match)) {
			// ForEach find context
			for (Object[] result3_black : BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_2_3_blackB(documentRoot)) {
				Object[] result3_green = BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_2_3_greenBF(documentRoot);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_2_4_bindingAndBlackFBBB(
								this, isApplicableMatch, documentRoot);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", "
									+ "[documentRoot] = " + documentRoot + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			DocumentRoot documentRoot) {
		match.registerObject("documentRoot", documentRoot);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, DocumentRoot documentRoot) {// Create CSP
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
			DocumentRoot documentRoot) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("documentRoot", documentRoot);
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
			EObject documentRoot, EObject useCasesModel,
			EObject docRootToUCModel) {
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("docRootToUCModel", docRootToUCModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("documentRoot").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getDocumentRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCasesModel useCasesModel) {
		// initial bindings
		Object[] result1_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_10_1_blackBBB(this, match,
						useCasesModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", "
							+ "[useCasesModel] = " + useCasesModel + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_10_2_bindingAndBlackFBBB(
						this, match, useCasesModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", "
							+ "[useCasesModel] = " + useCasesModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_4_blackBB(match,
							useCasesModel);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCasesModel] = " + useCasesModel + ".");
			}
			BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_4_greenBB(match,
							useCasesModel);

			// collect context elements
			Object[] result5_black = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_5_blackBB(match,
							useCasesModel);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCasesModel] = " + useCasesModel + ".");
			}
			// register objects to match
			BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_6_expressionBBB(this,
							match, useCasesModel);
			return BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_7_expressionF();
		} else {
			return BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_1_bindingAndBlackFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_1_greenFBF(useCasesModel);
		DocumentRoot documentRoot = (DocumentRoot) result1_green[0];
		DocRootToUCModel docRootToUCModel = (DocRootToUCModel) result1_green[2];

		// collect translated elements
		Object[] result2_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_2_blackBBB(documentRoot,
						useCasesModel, docRootToUCModel);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[documentRoot] = "
							+ documentRoot + ", " + "[useCasesModel] = "
							+ useCasesModel + ", " + "[docRootToUCModel] = "
							+ docRootToUCModel + ".");
		}
		Object[] result2_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_2_greenFBBB(documentRoot,
						useCasesModel, docRootToUCModel);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_3_blackBBBB(ruleresult,
						documentRoot, useCasesModel, docRootToUCModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[documentRoot] = " + documentRoot + ", "
							+ "[useCasesModel] = " + useCasesModel + ", "
							+ "[docRootToUCModel] = " + docRootToUCModel + ".");
		}
		BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_3_greenBBBBFF(ruleresult,
						documentRoot, useCasesModel, docRootToUCModel);
		// EMoflonEdge docRootToUCModel__documentRoot____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge docRootToUCModel__useCasesModel____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_5_expressionBBBBB(this,
						ruleresult, documentRoot, useCasesModel,
						docRootToUCModel);
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_12_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result2_binding[0];
		for (Object[] result2_black : BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_12_2_blackBB(useCasesModel,
						match)) {
			// ForEach find context
			for (Object[] result3_black : BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_12_3_blackB(useCasesModel)) {
				Object[] result3_green = BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_12_3_greenBF(useCasesModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_12_4_bindingAndBlackFBBB(
								this, isApplicableMatch, useCasesModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", "
									+ "[useCasesModel] = " + useCasesModel
									+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			UseCasesModel useCasesModel) {
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject docRootToUCModel) {
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("docRootToUCModel", docRootToUCModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
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
	public EObjectContainer isAppropriate_FWD_DocumentRoot_0(
			DocumentRoot documentRoot) {
		// prepare return value
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_20_2_blackB(documentRoot)) {
			Object[] result2_green = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_20_3_expressionFBBB(
							this, match, documentRoot)) {
				// Ensure that the correct types of elements are matched
				if (BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_UseCasesModel_0(
			UseCasesModel useCasesModel) {
		// prepare return value
		Object[] result1_bindingAndBlack = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_21_2_blackB(useCasesModel)) {
			Object[] result2_green = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_21_3_expressionFBBB(
							this, match, useCasesModel)) {
				// Ensure that the correct types of elements are matched
				if (BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					BpModelToUseCaseModelRuleImpl
							.pattern_BpModelToUseCaseModelRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer) {
		// create result
		Object[] result1_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// is applicable core
		Object[] result2_black = BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_24_2_blackB(this);
		if (result2_black != null) {

			// solve CSP
			Object[] result3_bindingAndBlack = BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_24_3_bindingAndBlackFBBB(
							this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = " + this + ", "
								+ "[isApplicableMatch] = " + isApplicableMatch
								+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (BpModelToUseCaseModelRuleImpl
					.pattern_BpModelToUseCaseModelRule_24_4_expressionFBB(this,
							csp)) {
				// check nacs story node is empty

				// perform
				Object[] result6_black = BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_24_6_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [perform] failed."
									+ " Variables: " + "[ruleResult] = "
									+ ruleResult + ".");
				}
				BpModelToUseCaseModelRuleImpl
						.pattern_BpModelToUseCaseModelRule_24_6_greenFFFB(ruleResult);
				// DocumentRoot documentRoot = (DocumentRoot) result6_green[0];
				// UseCasesModel useCasesModel = (UseCasesModel) result6_green[1];
				// DocRootToUCModel docRootToUCModel = (DocRootToUCModel) result6_green[2];

			} else {
			}

		} else {
		}
		return BpModelToUseCaseModelRuleImpl
				.pattern_BpModelToUseCaseModelRule_24_7_expressionFB(ruleResult);
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
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_DOCUMENTROOT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DOCUMENTROOT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DOCUMENTROOT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DOCUMENTROOT:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_USECASESMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASESMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASESMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD_DOCUMENT_ROOT_0__DOCUMENTROOT:
			return isAppropriate_FWD_DocumentRoot_0((DocumentRoot) arguments
					.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD_USE_CASES_MODEL_0__USECASESMODEL:
			return isAppropriate_BWD_UseCasesModel_0((UseCasesModel) arguments
					.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_1_blackBBB(
			BpModelToUseCaseModelRule _this, Match match,
			DocumentRoot documentRoot) {
		return new Object[] { _this, match, documentRoot };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_2_bindingFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			DocumentRoot documentRoot) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				documentRoot);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, documentRoot };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_2_bindingAndBlackFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			DocumentRoot documentRoot) {
		Object[] result_pattern_BpModelToUseCaseModelRule_0_2_binding = pattern_BpModelToUseCaseModelRule_0_2_bindingFBBB(
				_this, match, documentRoot);
		if (result_pattern_BpModelToUseCaseModelRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_0_2_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_0_2_black = pattern_BpModelToUseCaseModelRule_0_2_blackB(csp);
			if (result_pattern_BpModelToUseCaseModelRule_0_2_black != null) {

				return new Object[] { csp, _this, match, documentRoot };
			}
		}
		return null;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_0_3_expressionFBB(
			BpModelToUseCaseModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_4_blackBB(
			Match match, DocumentRoot documentRoot) {
		return new Object[] { match, documentRoot };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_4_greenBB(
			Match match, DocumentRoot documentRoot) {
		match.getToBeTranslatedNodes().add(documentRoot);
		return new Object[] { match, documentRoot };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_0_5_blackBB(
			Match match, DocumentRoot documentRoot) {
		return new Object[] { match, documentRoot };
	}

	public static final void pattern_BpModelToUseCaseModelRule_0_6_expressionBBB(
			BpModelToUseCaseModelRule _this, Match match,
			DocumentRoot documentRoot) {
		_this.registerObjectsToMatch_FWD(match, documentRoot);

	}

	public static final boolean pattern_BpModelToUseCaseModelRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("documentRoot");
		EObject tmpDocumentRoot = _localVariable_0;
		if (tmpDocumentRoot instanceof DocumentRoot) {
			DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
			return new Object[] { documentRoot, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_1_blackBFBB(
			DocumentRoot documentRoot, BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { documentRoot, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_1_bindingAndBlackFFBB(
			BpModelToUseCaseModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_BpModelToUseCaseModelRule_1_1_binding = pattern_BpModelToUseCaseModelRule_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_BpModelToUseCaseModelRule_1_1_binding != null) {
			DocumentRoot documentRoot = (DocumentRoot) result_pattern_BpModelToUseCaseModelRule_1_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_1_1_black = pattern_BpModelToUseCaseModelRule_1_1_blackBFBB(
					documentRoot, _this, isApplicableMatch);
			if (result_pattern_BpModelToUseCaseModelRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_1_1_black[1];

				return new Object[] { documentRoot, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_1_greenBFF(
			DocumentRoot documentRoot) {
		UseCasesModel useCasesModel = UseCaseDSLFactory.eINSTANCE
				.createUseCasesModel();
		DocRootToUCModel docRootToUCModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDocRootToUCModel();
		docRootToUCModel.setSource(documentRoot);
		docRootToUCModel.setTarget(useCasesModel);
		return new Object[] { documentRoot, useCasesModel, docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_2_blackBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel docRootToUCModel) {
		return new Object[] { documentRoot, useCasesModel, docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_2_greenFBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel docRootToUCModel) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(documentRoot);
		ruleresult.getCreatedElements().add(useCasesModel);
		ruleresult.getCreatedLinkElements().add(docRootToUCModel);
		return new Object[] { ruleresult, documentRoot, useCasesModel,
				docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject documentRoot,
			EObject useCasesModel, EObject docRootToUCModel) {
		if (!documentRoot.equals(useCasesModel)) {
			if (!docRootToUCModel.equals(documentRoot)) {
				if (!docRootToUCModel.equals(useCasesModel)) {
					return new Object[] { ruleresult, documentRoot,
							useCasesModel, docRootToUCModel };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject documentRoot,
			EObject useCasesModel, EObject docRootToUCModel) {
		EMoflonEdge docRootToUCModel__documentRoot____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge docRootToUCModel__useCasesModel____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "BpModelToUseCaseModelRule";
		String docRootToUCModel__documentRoot____source_name_prime = "source";
		String docRootToUCModel__useCasesModel____target_name_prime = "target";
		docRootToUCModel__documentRoot____source.setSrc(docRootToUCModel);
		docRootToUCModel__documentRoot____source.setTrg(documentRoot);
		ruleresult.getCreatedEdges().add(
				docRootToUCModel__documentRoot____source);
		docRootToUCModel__useCasesModel____target.setSrc(docRootToUCModel);
		docRootToUCModel__useCasesModel____target.setTrg(useCasesModel);
		ruleresult.getCreatedEdges().add(
				docRootToUCModel__useCasesModel____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		docRootToUCModel__documentRoot____source
				.setName(docRootToUCModel__documentRoot____source_name_prime);
		docRootToUCModel__useCasesModel____target
				.setName(docRootToUCModel__useCasesModel____target_name_prime);
		return new Object[] { ruleresult, documentRoot, useCasesModel,
				docRootToUCModel, docRootToUCModel__documentRoot____source,
				docRootToUCModel__useCasesModel____target };
	}

	public static final void pattern_BpModelToUseCaseModelRule_1_5_expressionBBBBB(
			BpModelToUseCaseModelRule _this, PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject docRootToUCModel) {
		_this.registerObjects_FWD(ruleresult, documentRoot, useCasesModel,
				docRootToUCModel);

	}

	public static final PerformRuleResult pattern_BpModelToUseCaseModelRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_1_bindingFB(
			BpModelToUseCaseModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_1_blackFBB(
			EClass eClass, BpModelToUseCaseModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_1_bindingAndBlackFFB(
			BpModelToUseCaseModelRule _this) {
		Object[] result_pattern_BpModelToUseCaseModelRule_2_1_binding = pattern_BpModelToUseCaseModelRule_2_1_bindingFB(_this);
		if (result_pattern_BpModelToUseCaseModelRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_BpModelToUseCaseModelRule_2_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_2_1_black = pattern_BpModelToUseCaseModelRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_BpModelToUseCaseModelRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_BpModelToUseCaseModelRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "BpModelToUseCaseModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("documentRoot");
		EObject tmpDocumentRoot = _localVariable_0;
		if (tmpDocumentRoot instanceof DocumentRoot) {
			DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
			return new Object[] { documentRoot, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_2_2_blackBB(
			DocumentRoot documentRoot, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { documentRoot, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_2_3_blackB(
			DocumentRoot documentRoot) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { documentRoot });
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_3_greenBF(
			DocumentRoot documentRoot) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(documentRoot);
		return new Object[] { documentRoot, isApplicableMatch };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_4_bindingFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch, DocumentRoot documentRoot) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, documentRoot);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, documentRoot };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_4_bindingAndBlackFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch, DocumentRoot documentRoot) {
		Object[] result_pattern_BpModelToUseCaseModelRule_2_4_binding = pattern_BpModelToUseCaseModelRule_2_4_bindingFBBB(
				_this, isApplicableMatch, documentRoot);
		if (result_pattern_BpModelToUseCaseModelRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_2_4_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_2_4_black = pattern_BpModelToUseCaseModelRule_2_4_blackB(csp);
			if (result_pattern_BpModelToUseCaseModelRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						documentRoot };
			}
		}
		return null;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_2_5_expressionFBB(
			BpModelToUseCaseModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "BpModelToUseCaseModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_BpModelToUseCaseModelRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_1_blackBBB(
			BpModelToUseCaseModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		return new Object[] { _this, match, useCasesModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_2_bindingFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				useCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_2_bindingAndBlackFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		Object[] result_pattern_BpModelToUseCaseModelRule_10_2_binding = pattern_BpModelToUseCaseModelRule_10_2_bindingFBBB(
				_this, match, useCasesModel);
		if (result_pattern_BpModelToUseCaseModelRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_10_2_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_10_2_black = pattern_BpModelToUseCaseModelRule_10_2_blackB(csp);
			if (result_pattern_BpModelToUseCaseModelRule_10_2_black != null) {

				return new Object[] { csp, _this, match, useCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_10_3_expressionFBB(
			BpModelToUseCaseModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_4_blackBB(
			Match match, UseCasesModel useCasesModel) {
		return new Object[] { match, useCasesModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_4_greenBB(
			Match match, UseCasesModel useCasesModel) {
		match.getToBeTranslatedNodes().add(useCasesModel);
		return new Object[] { match, useCasesModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_10_5_blackBB(
			Match match, UseCasesModel useCasesModel) {
		return new Object[] { match, useCasesModel };
	}

	public static final void pattern_BpModelToUseCaseModelRule_10_6_expressionBBB(
			BpModelToUseCaseModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		_this.registerObjectsToMatch_BWD(match, useCasesModel);

	}

	public static final boolean pattern_BpModelToUseCaseModelRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCasesModel");
		EObject tmpUseCasesModel = _localVariable_0;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			return new Object[] { useCasesModel, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_1_blackBFBB(
			UseCasesModel useCasesModel, BpModelToUseCaseModelRule _this,
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

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_1_bindingAndBlackFFBB(
			BpModelToUseCaseModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_BpModelToUseCaseModelRule_11_1_binding = pattern_BpModelToUseCaseModelRule_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_BpModelToUseCaseModelRule_11_1_binding != null) {
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_BpModelToUseCaseModelRule_11_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_11_1_black = pattern_BpModelToUseCaseModelRule_11_1_blackBFBB(
					useCasesModel, _this, isApplicableMatch);
			if (result_pattern_BpModelToUseCaseModelRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_11_1_black[1];

				return new Object[] { useCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_1_greenFBF(
			UseCasesModel useCasesModel) {
		DocumentRoot documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();
		DocRootToUCModel docRootToUCModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDocRootToUCModel();
		docRootToUCModel.setSource(documentRoot);
		docRootToUCModel.setTarget(useCasesModel);
		return new Object[] { documentRoot, useCasesModel, docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_2_blackBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel docRootToUCModel) {
		return new Object[] { documentRoot, useCasesModel, docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_2_greenFBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel docRootToUCModel) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(documentRoot);
		ruleresult.getTranslatedElements().add(useCasesModel);
		ruleresult.getCreatedLinkElements().add(docRootToUCModel);
		return new Object[] { ruleresult, documentRoot, useCasesModel,
				docRootToUCModel };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject documentRoot,
			EObject useCasesModel, EObject docRootToUCModel) {
		if (!documentRoot.equals(useCasesModel)) {
			if (!docRootToUCModel.equals(documentRoot)) {
				if (!docRootToUCModel.equals(useCasesModel)) {
					return new Object[] { ruleresult, documentRoot,
							useCasesModel, docRootToUCModel };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject documentRoot,
			EObject useCasesModel, EObject docRootToUCModel) {
		EMoflonEdge docRootToUCModel__documentRoot____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge docRootToUCModel__useCasesModel____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "BpModelToUseCaseModelRule";
		String docRootToUCModel__documentRoot____source_name_prime = "source";
		String docRootToUCModel__useCasesModel____target_name_prime = "target";
		docRootToUCModel__documentRoot____source.setSrc(docRootToUCModel);
		docRootToUCModel__documentRoot____source.setTrg(documentRoot);
		ruleresult.getCreatedEdges().add(
				docRootToUCModel__documentRoot____source);
		docRootToUCModel__useCasesModel____target.setSrc(docRootToUCModel);
		docRootToUCModel__useCasesModel____target.setTrg(useCasesModel);
		ruleresult.getCreatedEdges().add(
				docRootToUCModel__useCasesModel____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		docRootToUCModel__documentRoot____source
				.setName(docRootToUCModel__documentRoot____source_name_prime);
		docRootToUCModel__useCasesModel____target
				.setName(docRootToUCModel__useCasesModel____target_name_prime);
		return new Object[] { ruleresult, documentRoot, useCasesModel,
				docRootToUCModel, docRootToUCModel__documentRoot____source,
				docRootToUCModel__useCasesModel____target };
	}

	public static final void pattern_BpModelToUseCaseModelRule_11_5_expressionBBBBB(
			BpModelToUseCaseModelRule _this, PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject docRootToUCModel) {
		_this.registerObjects_BWD(ruleresult, documentRoot, useCasesModel,
				docRootToUCModel);

	}

	public static final PerformRuleResult pattern_BpModelToUseCaseModelRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_1_bindingFB(
			BpModelToUseCaseModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_1_blackFBB(
			EClass eClass, BpModelToUseCaseModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_1_bindingAndBlackFFB(
			BpModelToUseCaseModelRule _this) {
		Object[] result_pattern_BpModelToUseCaseModelRule_12_1_binding = pattern_BpModelToUseCaseModelRule_12_1_bindingFB(_this);
		if (result_pattern_BpModelToUseCaseModelRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_BpModelToUseCaseModelRule_12_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_12_1_black = pattern_BpModelToUseCaseModelRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_BpModelToUseCaseModelRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_BpModelToUseCaseModelRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "BpModelToUseCaseModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCasesModel");
		EObject tmpUseCasesModel = _localVariable_0;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			return new Object[] { useCasesModel, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_12_2_blackBB(
			UseCasesModel useCasesModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_12_3_blackB(
			UseCasesModel useCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel });
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_3_greenBF(
			UseCasesModel useCasesModel) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		return new Object[] { useCasesModel, isApplicableMatch };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_4_bindingFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch, UseCasesModel useCasesModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, useCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_4_bindingAndBlackFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch, UseCasesModel useCasesModel) {
		Object[] result_pattern_BpModelToUseCaseModelRule_12_4_binding = pattern_BpModelToUseCaseModelRule_12_4_bindingFBBB(
				_this, isApplicableMatch, useCasesModel);
		if (result_pattern_BpModelToUseCaseModelRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_12_4_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_12_4_black = pattern_BpModelToUseCaseModelRule_12_4_blackB(csp);
			if (result_pattern_BpModelToUseCaseModelRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_12_5_expressionFBB(
			BpModelToUseCaseModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "BpModelToUseCaseModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_BpModelToUseCaseModelRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_1_bindingFB(
			BpModelToUseCaseModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_1_blackFBB(
			EClass __eClass, BpModelToUseCaseModelRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_1_bindingAndBlackFFB(
			BpModelToUseCaseModelRule _this) {
		Object[] result_pattern_BpModelToUseCaseModelRule_20_1_binding = pattern_BpModelToUseCaseModelRule_20_1_bindingFB(_this);
		if (result_pattern_BpModelToUseCaseModelRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_BpModelToUseCaseModelRule_20_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_20_1_black = pattern_BpModelToUseCaseModelRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_BpModelToUseCaseModelRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_BpModelToUseCaseModelRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_20_2_blackB(
			DocumentRoot documentRoot) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { documentRoot });
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_BpModelToUseCaseModelRule_20_3_expressionFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			DocumentRoot documentRoot) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, documentRoot);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_20_4_expressionFBB(
			BpModelToUseCaseModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_BpModelToUseCaseModelRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_1_bindingFB(
			BpModelToUseCaseModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_1_blackFBB(
			EClass __eClass, BpModelToUseCaseModelRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_1_bindingAndBlackFFB(
			BpModelToUseCaseModelRule _this) {
		Object[] result_pattern_BpModelToUseCaseModelRule_21_1_binding = pattern_BpModelToUseCaseModelRule_21_1_bindingFB(_this);
		if (result_pattern_BpModelToUseCaseModelRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_BpModelToUseCaseModelRule_21_1_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_21_1_black = pattern_BpModelToUseCaseModelRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_BpModelToUseCaseModelRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_BpModelToUseCaseModelRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_BpModelToUseCaseModelRule_21_2_blackB(
			UseCasesModel useCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCasesModel });
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_BpModelToUseCaseModelRule_21_3_expressionFBBB(
			BpModelToUseCaseModelRule _this, Match match,
			UseCasesModel useCasesModel) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, useCasesModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_21_4_expressionFBB(
			BpModelToUseCaseModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_BpModelToUseCaseModelRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_1_blackB(
			BpModelToUseCaseModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_2_blackB(
			BpModelToUseCaseModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_3_bindingFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_3_bindingAndBlackFBBB(
			BpModelToUseCaseModelRule _this,
			IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_BpModelToUseCaseModelRule_24_3_binding = pattern_BpModelToUseCaseModelRule_24_3_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_BpModelToUseCaseModelRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_BpModelToUseCaseModelRule_24_3_binding[0];

			Object[] result_pattern_BpModelToUseCaseModelRule_24_3_black = pattern_BpModelToUseCaseModelRule_24_3_blackB(csp);
			if (result_pattern_BpModelToUseCaseModelRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_BpModelToUseCaseModelRule_24_4_expressionFBB(
			BpModelToUseCaseModelRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_6_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_BpModelToUseCaseModelRule_24_6_greenFFFB(
			ModelgeneratorRuleResult ruleResult) {
		DocumentRoot documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();
		UseCasesModel useCasesModel = UseCaseDSLFactory.eINSTANCE
				.createUseCasesModel();
		DocRootToUCModel docRootToUCModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDocRootToUCModel();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(documentRoot);
		ruleResult.getTargetObjects().add(useCasesModel);
		docRootToUCModel.setSource(documentRoot);
		docRootToUCModel.setTarget(useCasesModel);
		ruleResult.getCorrObjects().add(docRootToUCModel);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { documentRoot, useCasesModel, docRootToUCModel,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_BpModelToUseCaseModelRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //BpModelToUseCaseModelRuleImpl
