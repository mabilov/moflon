/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.DocRootToUCModel;

import BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule;
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

import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
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
 * An implementation of the model object '<em><b>Definitions To Package Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DefinitionsToPackageRuleImpl extends AbstractRuleImpl implements
		DefinitionsToPackageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsToPackageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getDefinitionsToPackageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Definitions definitions,
			DocumentRoot documentRoot) {
		// initial bindings
		Object[] result1_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_0_1_blackBBBB(this, match,
						definitions, documentRoot);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_0_2_bindingAndBlackFBBBB(
						this, match, definitions, documentRoot);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_4_blackBBB(match,
							definitions, documentRoot);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_4_greenBBBF(match,
							definitions, documentRoot);
			// EMoflonEdge documentRoot__definitions____definitions = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_5_blackBBB(match,
							definitions, documentRoot);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_5_greenBB(match,
							documentRoot);

			// register objects to match
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_6_expressionBBBB(this,
							match, definitions, documentRoot);
			return DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_7_expressionF();
		} else {
			return DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_1_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Definitions definitions = (Definitions) result1_bindingAndBlack[0];
		DocumentRoot documentRoot = (DocumentRoot) result1_bindingAndBlack[1];
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[2];
		DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_1_greenBFFBB(definitions,
						useCasesModel, csp);
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_green[1];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_green[2];

		// collect translated elements
		Object[] result2_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_2_blackBBB(definitions,
						packageDeclaration, definitionsToPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_2_greenFBBB(definitions,
						packageDeclaration, definitionsToPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_3_blackBBBBBBB(ruleresult,
						definitions, packageDeclaration, definitionsToPackage,
						documentRoot, useCasesModel,
						documentRootToUseCasesModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_3_greenBBBBBBFFFF(
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, documentRoot, useCasesModel);
		// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge documentRoot__definitions____definitions = (EMoflonEdge) result3_green[8];
		// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_5_expressionBBBBBBBB(this,
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, documentRoot, useCasesModel,
						documentRootToUseCasesModel);
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Definitions definitions = (Definitions) result2_binding[0];
		DocumentRoot documentRoot = (DocumentRoot) result2_binding[1];
		for (Object[] result2_black : DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_2_2_blackBBFFB(definitions,
						documentRoot, match)) {
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[2];
			DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_2_3_blackBBBB(
							definitions, documentRoot, useCasesModel,
							documentRootToUseCasesModel)) {
				Object[] result3_green = DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_2_3_greenBBBBFFFF(
								definitions, documentRoot, useCasesModel,
								documentRootToUseCasesModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge documentRoot__definitions____definitions = (EMoflonEdge) result3_green[5];
				// EMoflonEdge documentRootToUseCasesModel__documentRoot____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge documentRootToUseCasesModel__useCasesModel____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_2_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, definitions,
								documentRoot, useCasesModel,
								documentRootToUseCasesModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		match.registerObject("definitions", definitions);
		match.registerObject("documentRoot", documentRoot);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Definitions definitions,
			DocumentRoot documentRoot) {// Create CSP
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
			Definitions definitions, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("");

		// Create attribute variables
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", true, csp);
		var_definitions_targetNamespace.setValue(definitions
				.getTargetNamespace());
		var_definitions_targetNamespace.setType("String");

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
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
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("definitions").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getDefinitions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		// initial bindings
		Object[] result1_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_10_1_blackBBBB(this, match,
						packageDeclaration, useCasesModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_10_2_bindingAndBlackFBBBB(
						this, match, packageDeclaration, useCasesModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_4_blackBBB(match,
							packageDeclaration, useCasesModel);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_4_greenBBBF(match,
							packageDeclaration, useCasesModel);
			// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_5_blackBBB(match,
							packageDeclaration, useCasesModel);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_5_greenBB(match,
							useCasesModel);

			// register objects to match
			DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_6_expressionBBBB(this,
							match, packageDeclaration, useCasesModel);
			return DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_7_expressionF();
		} else {
			return DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_1_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		DocumentRoot documentRoot = (DocumentRoot) result1_bindingAndBlack[1];
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[2];
		DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_1_greenFBFBB(
						packageDeclaration, documentRoot, csp);
		Definitions definitions = (Definitions) result1_green[0];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_green[2];

		// collect translated elements
		Object[] result2_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_2_blackBBB(definitions,
						packageDeclaration, definitionsToPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_2_greenFBBB(definitions,
						packageDeclaration, definitionsToPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_3_blackBBBBBBB(ruleresult,
						definitions, packageDeclaration, definitionsToPackage,
						documentRoot, useCasesModel,
						documentRootToUseCasesModel);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_3_greenBBBBBBFFFF(
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, documentRoot, useCasesModel);
		// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge documentRoot__definitions____definitions = (EMoflonEdge) result3_green[8];
		// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_5_expressionBBBBBBBB(this,
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, documentRoot, useCasesModel,
						documentRootToUseCasesModel);
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		UseCasesModel useCasesModel = (UseCasesModel) result2_binding[1];
		for (Object[] result2_black : DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_12_2_blackBFBFB(
						packageDeclaration, useCasesModel, match)) {
			DocumentRoot documentRoot = (DocumentRoot) result2_black[1];
			DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_12_3_blackBBBB(
							packageDeclaration, documentRoot, useCasesModel,
							documentRootToUseCasesModel)) {
				Object[] result3_green = DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_12_3_greenBBBBFFFF(
								packageDeclaration, documentRoot,
								useCasesModel, documentRootToUseCasesModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[5];
				// EMoflonEdge documentRootToUseCasesModel__documentRoot____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge documentRootToUseCasesModel__useCasesModel____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_12_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								documentRoot, useCasesModel,
								documentRootToUseCasesModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {// Create CSP
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
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("");

		// Create attribute variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", true, csp);
		var_packageDeclaration_name.setValue(packageDeclaration.getName());
		var_packageDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", csp);
		var_definitions_targetNamespace.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
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
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("packageDeclaration")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getPackageDeclaration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(
			EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_20_2_blackFFB(_edge_definitions)) {
			Definitions definitions = (Definitions) result2_black[0];
			DocumentRoot documentRoot = (DocumentRoot) result2_black[1];
			Object[] result2_green = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_20_3_expressionFBBBB(
							this, match, definitions, documentRoot)) {
				// Ensure that the correct types of elements are matched
				if (DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(
			EMoflonEdge _edge_packages) {
		// prepare return value
		Object[] result1_bindingAndBlack = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_21_2_blackFFB(_edge_packages)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[1];
			Object[] result2_green = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_21_3_expressionFBBBB(
							this, match, packageDeclaration, useCasesModel)) {
				// Ensure that the correct types of elements are matched
				if (DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_21_6_expressionFB(__result);
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
			DocRootToUCModel documentRootToUseCasesModelParameter) {
		// create result
		Object[] result1_black = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_24_2_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList documentRootToUseCasesModelList = (RuleEntryList) result2_black[0];
			DocumentRoot documentRoot = (DocumentRoot) result2_black[1];
			DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result2_black[2];
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_24_3_bindingAndBlackFBBBBBB(
							this, isApplicableMatch, documentRoot,
							useCasesModel, documentRootToUseCasesModel,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (DefinitionsToPackageRuleImpl
					.pattern_DefinitionsToPackageRule_24_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = DefinitionsToPackageRuleImpl
						.pattern_DefinitionsToPackageRule_24_5_blackBBB(
								documentRoot, useCasesModel,
								documentRootToUseCasesModel);
				if (result5_black != null) {

					// perform
					Object[] result6_black = DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_24_6_blackBBBB(
									documentRoot, useCasesModel,
									documentRootToUseCasesModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					DefinitionsToPackageRuleImpl
							.pattern_DefinitionsToPackageRule_24_6_greenFFFBBBB(
									documentRoot, useCasesModel, ruleResult,
									csp);
					// Definitions definitions = (Definitions) result6_green[0];
					// PackageDeclaration packageDeclaration = (PackageDeclaration) result6_green[1];
					// DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return DefinitionsToPackageRuleImpl
				.pattern_DefinitionsToPackageRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", csp);
		var_definitions_targetNamespace.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
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
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2),
					(UseCasesModel) arguments.get(3),
					(DocRootToUCModel) arguments.get(4));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(DocumentRoot) arguments.get(2),
					(UseCasesModel) arguments.get(3),
					(DocRootToUCModel) arguments.get(4));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DOCROOTTOUCMODEL:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(DocRootToUCModel) arguments.get(1));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(DocumentRoot) arguments.get(1),
					(UseCasesModel) arguments.get(2),
					(DocRootToUCModel) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_1_blackBBBB(
			DefinitionsToPackageRule _this, Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		return new Object[] { _this, match, definitions, documentRoot };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_2_bindingFBBBB(
			DefinitionsToPackageRule _this, Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				definitions, documentRoot);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, definitions, documentRoot };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_2_bindingAndBlackFBBBB(
			DefinitionsToPackageRule _this, Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		Object[] result_pattern_DefinitionsToPackageRule_0_2_binding = pattern_DefinitionsToPackageRule_0_2_bindingFBBBB(
				_this, match, definitions, documentRoot);
		if (result_pattern_DefinitionsToPackageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_0_2_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_0_2_black = pattern_DefinitionsToPackageRule_0_2_blackB(csp);
			if (result_pattern_DefinitionsToPackageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, definitions,
						documentRoot };
			}
		}
		return null;
	}

	public static final boolean pattern_DefinitionsToPackageRule_0_3_expressionFBB(
			DefinitionsToPackageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_4_blackBBB(
			Match match, Definitions definitions, DocumentRoot documentRoot) {
		return new Object[] { match, definitions, documentRoot };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_4_greenBBBF(
			Match match, Definitions definitions, DocumentRoot documentRoot) {
		EMoflonEdge documentRoot__definitions____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(definitions);
		String documentRoot__definitions____definitions_name_prime = "definitions";
		documentRoot__definitions____definitions.setSrc(documentRoot);
		documentRoot__definitions____definitions.setTrg(definitions);
		match.getToBeTranslatedEdges().add(
				documentRoot__definitions____definitions);
		documentRoot__definitions____definitions
				.setName(documentRoot__definitions____definitions_name_prime);
		return new Object[] { match, definitions, documentRoot,
				documentRoot__definitions____definitions };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_5_blackBBB(
			Match match, Definitions definitions, DocumentRoot documentRoot) {
		return new Object[] { match, definitions, documentRoot };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_0_5_greenBB(
			Match match, DocumentRoot documentRoot) {
		match.getContextNodes().add(documentRoot);
		return new Object[] { match, documentRoot };
	}

	public static final void pattern_DefinitionsToPackageRule_0_6_expressionBBBB(
			DefinitionsToPackageRule _this, Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		_this.registerObjectsToMatch_FWD(match, definitions, documentRoot);

	}

	public static final boolean pattern_DefinitionsToPackageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DefinitionsToPackageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("definitions");
		EObject _localVariable_1 = isApplicableMatch.getObject("documentRoot");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCasesModel");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("documentRootToUseCasesModel");
		EObject tmpDefinitions = _localVariable_0;
		EObject tmpDocumentRoot = _localVariable_1;
		EObject tmpUseCasesModel = _localVariable_2;
		EObject tmpDocumentRootToUseCasesModel = _localVariable_3;
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			if (tmpDocumentRoot instanceof DocumentRoot) {
				DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
				if (tmpUseCasesModel instanceof UseCasesModel) {
					UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
					if (tmpDocumentRootToUseCasesModel instanceof DocRootToUCModel) {
						DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) tmpDocumentRootToUseCasesModel;
						return new Object[] { definitions, documentRoot,
								useCasesModel, documentRootToUseCasesModel,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_1_blackBBBBFBB(
			Definitions definitions, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			DefinitionsToPackageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { definitions, documentRoot, useCasesModel,
						documentRootToUseCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_1_bindingAndBlackFFFFFBB(
			DefinitionsToPackageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DefinitionsToPackageRule_1_1_binding = pattern_DefinitionsToPackageRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_DefinitionsToPackageRule_1_1_binding != null) {
			Definitions definitions = (Definitions) result_pattern_DefinitionsToPackageRule_1_1_binding[0];
			DocumentRoot documentRoot = (DocumentRoot) result_pattern_DefinitionsToPackageRule_1_1_binding[1];
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_DefinitionsToPackageRule_1_1_binding[2];
			DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result_pattern_DefinitionsToPackageRule_1_1_binding[3];

			Object[] result_pattern_DefinitionsToPackageRule_1_1_black = pattern_DefinitionsToPackageRule_1_1_blackBBBBFBB(
					definitions, documentRoot, useCasesModel,
					documentRootToUseCasesModel, _this, isApplicableMatch);
			if (result_pattern_DefinitionsToPackageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_1_1_black[4];

				return new Object[] { definitions, documentRoot, useCasesModel,
						documentRootToUseCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_1_greenBFFBB(
			Definitions definitions, UseCasesModel useCasesModel, CSP csp) {
		PackageDeclaration packageDeclaration = UseCaseDSLFactory.eINSTANCE
				.createPackageDeclaration();
		DefinitionsToPackage definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDefinitionsToPackage();
		Object _localVariable_0 = csp.getValue("packageDeclaration", "name");
		useCasesModel.getPackages().add(packageDeclaration);
		definitionsToPackage.setSource(definitions);
		definitionsToPackage.setTarget(packageDeclaration);
		String packageDeclaration_name_prime = (String) _localVariable_0;
		packageDeclaration.setName(packageDeclaration_name_prime);
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, useCasesModel, csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_2_blackBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage) {
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_2_greenFBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(definitions);
		ruleresult.getCreatedElements().add(packageDeclaration);
		ruleresult.getCreatedLinkElements().add(definitionsToPackage);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				definitionsToPackage };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel) {
		if (!definitions.equals(packageDeclaration)) {
			if (!definitions.equals(definitionsToPackage)) {
				if (!definitions.equals(documentRoot)) {
					if (!definitions.equals(useCasesModel)) {
						if (!definitions.equals(documentRootToUseCasesModel)) {
							if (!packageDeclaration.equals(useCasesModel)) {
								if (!definitionsToPackage
										.equals(packageDeclaration)) {
									if (!definitionsToPackage
											.equals(documentRoot)) {
										if (!definitionsToPackage
												.equals(useCasesModel)) {
											if (!definitionsToPackage
													.equals(documentRootToUseCasesModel)) {
												if (!documentRoot
														.equals(packageDeclaration)) {
													if (!documentRoot
															.equals(useCasesModel)) {
														if (!documentRoot
																.equals(documentRootToUseCasesModel)) {
															if (!documentRootToUseCasesModel
																	.equals(packageDeclaration)) {
																if (!documentRootToUseCasesModel
																		.equals(useCasesModel)) {
																	return new Object[] {
																			ruleresult,
																			definitions,
																			packageDeclaration,
																			definitionsToPackage,
																			documentRoot,
																			useCasesModel,
																			documentRootToUseCasesModel };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DefinitionsToPackageRule_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject documentRoot, EObject useCasesModel) {
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRoot__definitions____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DefinitionsToPackageRule";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String documentRoot__definitions____definitions_name_prime = "definitions";
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		definitionsToPackage__definitions____source
				.setSrc(definitionsToPackage);
		definitionsToPackage__definitions____source.setTrg(definitions);
		ruleresult.getCreatedEdges().add(
				definitionsToPackage__definitions____source);
		definitionsToPackage__packageDeclaration____target
				.setSrc(definitionsToPackage);
		definitionsToPackage__packageDeclaration____target
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				definitionsToPackage__packageDeclaration____target);
		documentRoot__definitions____definitions.setSrc(documentRoot);
		documentRoot__definitions____definitions.setTrg(definitions);
		ruleresult.getTranslatedEdges().add(
				documentRoot__definitions____definitions);
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				useCasesModel__packageDeclaration____packages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		documentRoot__definitions____definitions
				.setName(documentRoot__definitions____definitions_name_prime);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				documentRoot__definitions____definitions,
				useCasesModel__packageDeclaration____packages };
	}

	public static final void pattern_DefinitionsToPackageRule_1_5_expressionBBBBBBBB(
			DefinitionsToPackageRule _this, PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		_this.registerObjects_FWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				documentRootToUseCasesModel);

	}

	public static final PerformRuleResult pattern_DefinitionsToPackageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_1_bindingFB(
			DefinitionsToPackageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_1_blackFBB(
			EClass eClass, DefinitionsToPackageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_1_bindingAndBlackFFB(
			DefinitionsToPackageRule _this) {
		Object[] result_pattern_DefinitionsToPackageRule_2_1_binding = pattern_DefinitionsToPackageRule_2_1_bindingFB(_this);
		if (result_pattern_DefinitionsToPackageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_DefinitionsToPackageRule_2_1_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_2_1_black = pattern_DefinitionsToPackageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_DefinitionsToPackageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DefinitionsToPackageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "DefinitionsToPackageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("definitions");
		EObject _localVariable_1 = match.getObject("documentRoot");
		EObject tmpDefinitions = _localVariable_0;
		EObject tmpDocumentRoot = _localVariable_1;
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			if (tmpDocumentRoot instanceof DocumentRoot) {
				DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
				return new Object[] { definitions, documentRoot, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_2_2_blackBBFFB(
			Definitions definitions, DocumentRoot documentRoot, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DocRootToUCModel documentRootToUseCasesModel : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(documentRoot,
						DocRootToUCModel.class, "source")) {
			UseCasesModel useCasesModel = documentRootToUseCasesModel
					.getTarget();
			if (useCasesModel != null) {
				_result.add(new Object[] { definitions, documentRoot,
						useCasesModel, documentRootToUseCasesModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_2_3_blackBBBB(
			Definitions definitions, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (documentRoot.getDefinitions().contains(definitions)) {
			if (documentRoot.equals(documentRootToUseCasesModel.getSource())) {
				if (useCasesModel.equals(documentRootToUseCasesModel
						.getTarget())) {
					_result.add(new Object[] { definitions, documentRoot,
							useCasesModel, documentRootToUseCasesModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_3_greenBBBBFFFF(
			Definitions definitions, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge documentRoot__definitions____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRootToUseCasesModel__documentRoot____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRootToUseCasesModel__useCasesModel____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String documentRoot__definitions____definitions_name_prime = "definitions";
		String documentRootToUseCasesModel__documentRoot____source_name_prime = "source";
		String documentRootToUseCasesModel__useCasesModel____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(definitions);
		isApplicableMatch.getAllContextElements().add(documentRoot);
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel);
		documentRoot__definitions____definitions.setSrc(documentRoot);
		documentRoot__definitions____definitions.setTrg(definitions);
		isApplicableMatch.getAllContextElements().add(
				documentRoot__definitions____definitions);
		documentRootToUseCasesModel__documentRoot____source
				.setSrc(documentRootToUseCasesModel);
		documentRootToUseCasesModel__documentRoot____source
				.setTrg(documentRoot);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel__documentRoot____source);
		documentRootToUseCasesModel__useCasesModel____target
				.setSrc(documentRootToUseCasesModel);
		documentRootToUseCasesModel__useCasesModel____target
				.setTrg(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel__useCasesModel____target);
		documentRoot__definitions____definitions
				.setName(documentRoot__definitions____definitions_name_prime);
		documentRootToUseCasesModel__documentRoot____source
				.setName(documentRootToUseCasesModel__documentRoot____source_name_prime);
		documentRootToUseCasesModel__useCasesModel____target
				.setName(documentRootToUseCasesModel__useCasesModel____target_name_prime);
		return new Object[] { definitions, documentRoot, useCasesModel,
				documentRootToUseCasesModel, isApplicableMatch,
				documentRoot__definitions____definitions,
				documentRootToUseCasesModel__documentRoot____source,
				documentRootToUseCasesModel__useCasesModel____target };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_4_bindingFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch, Definitions definitions,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, definitions, documentRoot, useCasesModel,
				documentRootToUseCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, definitions,
					documentRoot, useCasesModel, documentRootToUseCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_4_bindingAndBlackFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch, Definitions definitions,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		Object[] result_pattern_DefinitionsToPackageRule_2_4_binding = pattern_DefinitionsToPackageRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, definitions, documentRoot,
				useCasesModel, documentRootToUseCasesModel);
		if (result_pattern_DefinitionsToPackageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_2_4_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_2_4_black = pattern_DefinitionsToPackageRule_2_4_blackB(csp);
			if (result_pattern_DefinitionsToPackageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						definitions, documentRoot, useCasesModel,
						documentRootToUseCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_DefinitionsToPackageRule_2_5_expressionFBB(
			DefinitionsToPackageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DefinitionsToPackageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DefinitionsToPackageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_1_blackBBBB(
			DefinitionsToPackageRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		return new Object[] { _this, match, packageDeclaration, useCasesModel };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_2_bindingFBBBB(
			DefinitionsToPackageRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				packageDeclaration, useCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration,
					useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_2_bindingAndBlackFBBBB(
			DefinitionsToPackageRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		Object[] result_pattern_DefinitionsToPackageRule_10_2_binding = pattern_DefinitionsToPackageRule_10_2_bindingFBBBB(
				_this, match, packageDeclaration, useCasesModel);
		if (result_pattern_DefinitionsToPackageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_10_2_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_10_2_black = pattern_DefinitionsToPackageRule_10_2_blackB(csp);
			if (result_pattern_DefinitionsToPackageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						useCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_DefinitionsToPackageRule_10_3_expressionFBB(
			DefinitionsToPackageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_4_blackBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCasesModel useCasesModel) {
		return new Object[] { match, packageDeclaration, useCasesModel };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_4_greenBBBF(
			Match match, PackageDeclaration packageDeclaration,
			UseCasesModel useCasesModel) {
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(packageDeclaration);
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		match.getToBeTranslatedEdges().add(
				useCasesModel__packageDeclaration____packages);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		return new Object[] { match, packageDeclaration, useCasesModel,
				useCasesModel__packageDeclaration____packages };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_5_blackBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCasesModel useCasesModel) {
		return new Object[] { match, packageDeclaration, useCasesModel };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_10_5_greenBB(
			Match match, UseCasesModel useCasesModel) {
		match.getContextNodes().add(useCasesModel);
		return new Object[] { match, useCasesModel };
	}

	public static final void pattern_DefinitionsToPackageRule_10_6_expressionBBBB(
			DefinitionsToPackageRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		_this.registerObjectsToMatch_BWD(match, packageDeclaration,
				useCasesModel);

	}

	public static final boolean pattern_DefinitionsToPackageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DefinitionsToPackageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("documentRoot");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCasesModel");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("documentRootToUseCasesModel");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpDocumentRoot = _localVariable_1;
		EObject tmpUseCasesModel = _localVariable_2;
		EObject tmpDocumentRootToUseCasesModel = _localVariable_3;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpDocumentRoot instanceof DocumentRoot) {
				DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
				if (tmpUseCasesModel instanceof UseCasesModel) {
					UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
					if (tmpDocumentRootToUseCasesModel instanceof DocRootToUCModel) {
						DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) tmpDocumentRootToUseCasesModel;
						return new Object[] { packageDeclaration, documentRoot,
								useCasesModel, documentRootToUseCasesModel,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_1_blackBBBBFBB(
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			DefinitionsToPackageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, documentRoot,
						useCasesModel, documentRootToUseCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_1_bindingAndBlackFFFFFBB(
			DefinitionsToPackageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DefinitionsToPackageRule_11_1_binding = pattern_DefinitionsToPackageRule_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_DefinitionsToPackageRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_DefinitionsToPackageRule_11_1_binding[0];
			DocumentRoot documentRoot = (DocumentRoot) result_pattern_DefinitionsToPackageRule_11_1_binding[1];
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_DefinitionsToPackageRule_11_1_binding[2];
			DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) result_pattern_DefinitionsToPackageRule_11_1_binding[3];

			Object[] result_pattern_DefinitionsToPackageRule_11_1_black = pattern_DefinitionsToPackageRule_11_1_blackBBBBFBB(
					packageDeclaration, documentRoot, useCasesModel,
					documentRootToUseCasesModel, _this, isApplicableMatch);
			if (result_pattern_DefinitionsToPackageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_11_1_black[4];

				return new Object[] { packageDeclaration, documentRoot,
						useCasesModel, documentRootToUseCasesModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_1_greenFBFBB(
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			CSP csp) {
		Definitions definitions = Bpmn2Factory.eINSTANCE.createDefinitions();
		DefinitionsToPackage definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDefinitionsToPackage();
		Object _localVariable_0 = csp
				.getValue("definitions", "targetNamespace");
		documentRoot.getDefinitions().add(definitions);
		definitionsToPackage.setSource(definitions);
		definitionsToPackage.setTarget(packageDeclaration);
		String definitions_targetNamespace_prime = (String) _localVariable_0;
		definitions.setTargetNamespace(definitions_targetNamespace_prime);
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, documentRoot, csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_2_blackBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage) {
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_2_greenFBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(definitions);
		ruleresult.getTranslatedElements().add(packageDeclaration);
		ruleresult.getCreatedLinkElements().add(definitionsToPackage);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				definitionsToPackage };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel) {
		if (!definitions.equals(packageDeclaration)) {
			if (!definitions.equals(definitionsToPackage)) {
				if (!definitions.equals(documentRoot)) {
					if (!definitions.equals(useCasesModel)) {
						if (!definitions.equals(documentRootToUseCasesModel)) {
							if (!packageDeclaration.equals(useCasesModel)) {
								if (!definitionsToPackage
										.equals(packageDeclaration)) {
									if (!definitionsToPackage
											.equals(documentRoot)) {
										if (!definitionsToPackage
												.equals(useCasesModel)) {
											if (!definitionsToPackage
													.equals(documentRootToUseCasesModel)) {
												if (!documentRoot
														.equals(packageDeclaration)) {
													if (!documentRoot
															.equals(useCasesModel)) {
														if (!documentRoot
																.equals(documentRootToUseCasesModel)) {
															if (!documentRootToUseCasesModel
																	.equals(packageDeclaration)) {
																if (!documentRootToUseCasesModel
																		.equals(useCasesModel)) {
																	return new Object[] {
																			ruleresult,
																			definitions,
																			packageDeclaration,
																			definitionsToPackage,
																			documentRoot,
																			useCasesModel,
																			documentRootToUseCasesModel };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DefinitionsToPackageRule_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject documentRoot, EObject useCasesModel) {
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRoot__definitions____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DefinitionsToPackageRule";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String documentRoot__definitions____definitions_name_prime = "definitions";
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		definitionsToPackage__definitions____source
				.setSrc(definitionsToPackage);
		definitionsToPackage__definitions____source.setTrg(definitions);
		ruleresult.getCreatedEdges().add(
				definitionsToPackage__definitions____source);
		definitionsToPackage__packageDeclaration____target
				.setSrc(definitionsToPackage);
		definitionsToPackage__packageDeclaration____target
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				definitionsToPackage__packageDeclaration____target);
		documentRoot__definitions____definitions.setSrc(documentRoot);
		documentRoot__definitions____definitions.setTrg(definitions);
		ruleresult.getCreatedEdges().add(
				documentRoot__definitions____definitions);
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		ruleresult.getTranslatedEdges().add(
				useCasesModel__packageDeclaration____packages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		documentRoot__definitions____definitions
				.setName(documentRoot__definitions____definitions_name_prime);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				documentRoot__definitions____definitions,
				useCasesModel__packageDeclaration____packages };
	}

	public static final void pattern_DefinitionsToPackageRule_11_5_expressionBBBBBBBB(
			DefinitionsToPackageRule _this, PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		_this.registerObjects_BWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				documentRootToUseCasesModel);

	}

	public static final PerformRuleResult pattern_DefinitionsToPackageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_1_bindingFB(
			DefinitionsToPackageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_1_blackFBB(
			EClass eClass, DefinitionsToPackageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_1_bindingAndBlackFFB(
			DefinitionsToPackageRule _this) {
		Object[] result_pattern_DefinitionsToPackageRule_12_1_binding = pattern_DefinitionsToPackageRule_12_1_bindingFB(_this);
		if (result_pattern_DefinitionsToPackageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_DefinitionsToPackageRule_12_1_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_12_1_black = pattern_DefinitionsToPackageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_DefinitionsToPackageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DefinitionsToPackageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "DefinitionsToPackageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("useCasesModel");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpUseCasesModel = _localVariable_1;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpUseCasesModel instanceof UseCasesModel) {
				UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
				return new Object[] { packageDeclaration, useCasesModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_12_2_blackBFBFB(
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DocRootToUCModel documentRootToUseCasesModel : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCasesModel,
						DocRootToUCModel.class, "target")) {
			DocumentRoot documentRoot = documentRootToUseCasesModel.getSource();
			if (documentRoot != null) {
				_result.add(new Object[] { packageDeclaration, documentRoot,
						useCasesModel, documentRootToUseCasesModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_12_3_blackBBBB(
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCasesModel.getPackages().contains(packageDeclaration)) {
			if (documentRoot.equals(documentRootToUseCasesModel.getSource())) {
				if (useCasesModel.equals(documentRootToUseCasesModel
						.getTarget())) {
					_result.add(new Object[] { packageDeclaration,
							documentRoot, useCasesModel,
							documentRootToUseCasesModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_3_greenBBBBFFFF(
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRootToUseCasesModel__documentRoot____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge documentRootToUseCasesModel__useCasesModel____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		String documentRootToUseCasesModel__documentRoot____source_name_prime = "source";
		String documentRootToUseCasesModel__useCasesModel____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(documentRoot);
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel);
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				useCasesModel__packageDeclaration____packages);
		documentRootToUseCasesModel__documentRoot____source
				.setSrc(documentRootToUseCasesModel);
		documentRootToUseCasesModel__documentRoot____source
				.setTrg(documentRoot);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel__documentRoot____source);
		documentRootToUseCasesModel__useCasesModel____target
				.setSrc(documentRootToUseCasesModel);
		documentRootToUseCasesModel__useCasesModel____target
				.setTrg(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				documentRootToUseCasesModel__useCasesModel____target);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		documentRootToUseCasesModel__documentRoot____source
				.setName(documentRootToUseCasesModel__documentRoot____source_name_prime);
		documentRootToUseCasesModel__useCasesModel____target
				.setName(documentRootToUseCasesModel__useCasesModel____target_name_prime);
		return new Object[] { packageDeclaration, documentRoot, useCasesModel,
				documentRootToUseCasesModel, isApplicableMatch,
				useCasesModel__packageDeclaration____packages,
				documentRootToUseCasesModel__documentRoot____source,
				documentRootToUseCasesModel__useCasesModel____target };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_4_bindingFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, documentRoot,
				useCasesModel, documentRootToUseCasesModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, documentRoot, useCasesModel,
					documentRootToUseCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_4_bindingAndBlackFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		Object[] result_pattern_DefinitionsToPackageRule_12_4_binding = pattern_DefinitionsToPackageRule_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, packageDeclaration, documentRoot,
				useCasesModel, documentRootToUseCasesModel);
		if (result_pattern_DefinitionsToPackageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_12_4_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_12_4_black = pattern_DefinitionsToPackageRule_12_4_blackB(csp);
			if (result_pattern_DefinitionsToPackageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, documentRoot, useCasesModel,
						documentRootToUseCasesModel };
			}
		}
		return null;
	}

	public static final boolean pattern_DefinitionsToPackageRule_12_5_expressionFBB(
			DefinitionsToPackageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DefinitionsToPackageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DefinitionsToPackageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_1_bindingFB(
			DefinitionsToPackageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_1_blackFBB(
			EClass __eClass, DefinitionsToPackageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_1_bindingAndBlackFFB(
			DefinitionsToPackageRule _this) {
		Object[] result_pattern_DefinitionsToPackageRule_20_1_binding = pattern_DefinitionsToPackageRule_20_1_bindingFB(_this);
		if (result_pattern_DefinitionsToPackageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_DefinitionsToPackageRule_20_1_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_20_1_black = pattern_DefinitionsToPackageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_DefinitionsToPackageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DefinitionsToPackageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_2_black_nac_0BB(
			Definitions definitions, DocumentRoot documentRoot) {
		for (DocumentRoot __DEC_definitions_definitions_638816 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(definitions, DocumentRoot.class,
						"definitions")) {
			if (!documentRoot.equals(__DEC_definitions_definitions_638816)) {
				return new Object[] { definitions, documentRoot };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_20_2_blackFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpDocumentRoot = _edge_definitions.getSrc();
		if (tmpDocumentRoot instanceof DocumentRoot) {
			DocumentRoot documentRoot = (DocumentRoot) tmpDocumentRoot;
			EObject tmpDefinitions = _edge_definitions.getTrg();
			if (tmpDefinitions instanceof Definitions) {
				Definitions definitions = (Definitions) tmpDefinitions;
				if (documentRoot.getDefinitions().contains(definitions)) {
					if (pattern_DefinitionsToPackageRule_20_2_black_nac_0BB(
							definitions, documentRoot) == null) {
						_result.add(new Object[] { definitions, documentRoot,
								_edge_definitions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DefinitionsToPackageRule_20_3_expressionFBBBB(
			DefinitionsToPackageRule _this, Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				documentRoot);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DefinitionsToPackageRule_20_4_expressionFBB(
			DefinitionsToPackageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_DefinitionsToPackageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_1_bindingFB(
			DefinitionsToPackageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_1_blackFBB(
			EClass __eClass, DefinitionsToPackageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_1_bindingAndBlackFFB(
			DefinitionsToPackageRule _this) {
		Object[] result_pattern_DefinitionsToPackageRule_21_1_binding = pattern_DefinitionsToPackageRule_21_1_bindingFB(_this);
		if (result_pattern_DefinitionsToPackageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_DefinitionsToPackageRule_21_1_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_21_1_black = pattern_DefinitionsToPackageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_DefinitionsToPackageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DefinitionsToPackageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_2_black_nac_0BB(
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		for (UseCasesModel __DEC_packageDeclaration_packages_210117 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						UseCasesModel.class, "packages")) {
			if (!useCasesModel.equals(__DEC_packageDeclaration_packages_210117)) {
				return new Object[] { packageDeclaration, useCasesModel };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_21_2_blackFFB(
			EMoflonEdge _edge_packages) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCasesModel = _edge_packages.getSrc();
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			EObject tmpPackageDeclaration = _edge_packages.getTrg();
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (useCasesModel.getPackages().contains(packageDeclaration)) {
					if (pattern_DefinitionsToPackageRule_21_2_black_nac_0BB(
							packageDeclaration, useCasesModel) == null) {
						_result.add(new Object[] { packageDeclaration,
								useCasesModel, _edge_packages });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DefinitionsToPackageRule_21_3_expressionFBBBB(
			DefinitionsToPackageRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				packageDeclaration, useCasesModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DefinitionsToPackageRule_21_4_expressionFBB(
			DefinitionsToPackageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_DefinitionsToPackageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_1_blackB(
			DefinitionsToPackageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, DocumentRoot documentRoot) {
		if (ruleResult.getSourceObjects().contains(documentRoot)) {
			return new Object[] { ruleResult, documentRoot };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			DocRootToUCModel documentRootToUseCasesModel) {
		if (ruleResult.getCorrObjects().contains(documentRootToUseCasesModel)) {
			return new Object[] { ruleResult, documentRootToUseCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCasesModel useCasesModel) {
		if (ruleResult.getTargetObjects().contains(useCasesModel)) {
			return new Object[] { ruleResult, useCasesModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DefinitionsToPackageRule_24_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList documentRootToUseCasesModelList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpDocumentRootToUseCasesModel : documentRootToUseCasesModelList
					.getEntryObjects()) {
				if (tmpDocumentRootToUseCasesModel instanceof DocRootToUCModel) {
					DocRootToUCModel documentRootToUseCasesModel = (DocRootToUCModel) tmpDocumentRootToUseCasesModel;
					DocumentRoot documentRoot = documentRootToUseCasesModel
							.getSource();
					if (documentRoot != null) {
						UseCasesModel useCasesModel = documentRootToUseCasesModel
								.getTarget();
						if (useCasesModel != null) {
							if (pattern_DefinitionsToPackageRule_24_2_black_nac_1BB(
									ruleResult, documentRootToUseCasesModel) == null) {
								if (pattern_DefinitionsToPackageRule_24_2_black_nac_0BB(
										ruleResult, documentRoot) == null) {
									if (pattern_DefinitionsToPackageRule_24_2_black_nac_2BB(
											ruleResult, useCasesModel) == null) {
										_result.add(new Object[] {
												documentRootToUseCasesModelList,
												documentRoot,
												documentRootToUseCasesModel,
												useCasesModel,
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

	public static final Object[] pattern_DefinitionsToPackageRule_24_3_bindingFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, documentRoot, useCasesModel,
				documentRootToUseCasesModel, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, documentRoot,
					useCasesModel, documentRootToUseCasesModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_3_bindingAndBlackFBBBBBB(
			DefinitionsToPackageRule _this,
			IsApplicableMatch isApplicableMatch, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_DefinitionsToPackageRule_24_3_binding = pattern_DefinitionsToPackageRule_24_3_bindingFBBBBBB(
				_this, isApplicableMatch, documentRoot, useCasesModel,
				documentRootToUseCasesModel, ruleResult);
		if (result_pattern_DefinitionsToPackageRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_DefinitionsToPackageRule_24_3_binding[0];

			Object[] result_pattern_DefinitionsToPackageRule_24_3_black = pattern_DefinitionsToPackageRule_24_3_blackB(csp);
			if (result_pattern_DefinitionsToPackageRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						documentRoot, useCasesModel,
						documentRootToUseCasesModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_DefinitionsToPackageRule_24_4_expressionFBB(
			DefinitionsToPackageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_5_blackBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		return new Object[] { documentRoot, useCasesModel,
				documentRootToUseCasesModel };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_6_blackBBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { documentRoot, useCasesModel,
				documentRootToUseCasesModel, ruleResult };
	}

	public static final Object[] pattern_DefinitionsToPackageRule_24_6_greenFFFBBBB(
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Definitions definitions = Bpmn2Factory.eINSTANCE.createDefinitions();
		PackageDeclaration packageDeclaration = UseCaseDSLFactory.eINSTANCE
				.createPackageDeclaration();
		DefinitionsToPackage definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createDefinitionsToPackage();
		Object _localVariable_0 = csp
				.getValue("definitions", "targetNamespace");
		Object _localVariable_1 = csp.getValue("packageDeclaration", "name");
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		documentRoot.getDefinitions().add(definitions);
		ruleResult.getSourceObjects().add(definitions);
		useCasesModel.getPackages().add(packageDeclaration);
		ruleResult.getTargetObjects().add(packageDeclaration);
		definitionsToPackage.setSource(definitions);
		definitionsToPackage.setTarget(packageDeclaration);
		ruleResult.getCorrObjects().add(definitionsToPackage);
		String definitions_targetNamespace_prime = (String) _localVariable_0;
		String packageDeclaration_name_prime = (String) _localVariable_1;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		definitions.setTargetNamespace(definitions_targetNamespace_prime);
		packageDeclaration.setName(packageDeclaration_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_DefinitionsToPackageRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DefinitionsToPackageRuleImpl
