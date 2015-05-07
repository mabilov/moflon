/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

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

import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage;

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
 * An implementation of the model object '<em><b>UC Package To MSD Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UCPackageToMSDPackageImpl extends AbstractRuleImpl implements
		UCPackageToMSDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCPackageToMSDPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUCPackageToMSDPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCasesModel useCasesModel,
			PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_0_1_blackBBBB(this, match,
						useCasesModel, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_0_2_bindingAndBlackFBBBB(this,
						match, useCasesModel, packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_4_blackBBB(match,
							useCasesModel, packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_4_greenBBBF(match,
							useCasesModel, packageDeclaration);
			// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_5_blackBBB(match,
							useCasesModel, packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_5_greenBB(match,
							useCasesModel);

			// register objects to match
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_6_expressionBBBB(this,
							match, useCasesModel, packageDeclaration);
			return UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_7_expressionF();
		} else {
			return UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[0];
		Model model = (Model) result1_bindingAndBlack[1];
		UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result1_bindingAndBlack[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_1_greenBBFFB(model,
						packageDeclaration, csp);
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_green[2];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_2_blackBBB(packageDeclaration,
						p, packageDeclarationToPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_2_greenFBBB(
						packageDeclaration, p, packageDeclarationToPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_3_blackBBBBBBB(ruleresult,
						useCasesModel, model, useCasesModelToModel,
						packageDeclaration, p, packageDeclarationToPackage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_3_greenBBBBBBFFFF(ruleresult,
						useCasesModel, model, packageDeclaration, p,
						packageDeclarationToPackage);
		// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[6];
		// EMoflonEdge model__p____packagedElement = (EMoflonEdge) result3_green[7];
		// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge packageDeclarationToPackage__p____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_5_expressionBBBBBBBB(this,
						ruleresult, useCasesModel, model, useCasesModelToModel,
						packageDeclaration, p, packageDeclarationToPackage);
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result2_binding[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[1];
		for (Object[] result2_black : UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_2_2_blackBFFBB(useCasesModel,
						packageDeclaration, match)) {
			Model model = (Model) result2_black[1];
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_2_3_blackBBBB(useCasesModel,
							model, useCasesModelToModel, packageDeclaration)) {
				Object[] result3_green = UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_2_3_greenBBBBFFFF(
								useCasesModel, model, useCasesModelToModel,
								packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[5];
				// EMoflonEdge useCasesModelToModel__useCasesModel____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge useCasesModelToModel__model____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_2_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, useCasesModel, model,
								useCasesModelToModel, packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		match.registerObject("useCasesModel", useCasesModel);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {// Create CSP
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
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", true, csp);
		var_packageDeclaration_name.setValue(packageDeclaration.getName());
		var_packageDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_p_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"p.name", csp);
		var_p_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_packageDeclaration_name, var_p_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("useCasesModelToModel",
				useCasesModelToModel);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
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
	public boolean isAppropriate_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {
		// initial bindings
		Object[] result1_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_10_1_blackBBBB(this, match,
						model, p);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_10_2_bindingAndBlackFBBBB(this,
						match, model, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_4_blackBBB(match, model,
							p);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_4_greenBBBF(match, model,
							p);
			// EMoflonEdge model__p____packagedElement = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_5_blackBBB(match, model,
							p);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_5_greenBB(match, model);

			// register objects to match
			UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_6_expressionBBBB(this,
							match, model, p);
			return UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_7_expressionF();
		} else {
			return UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_1_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCasesModel useCasesModel = (UseCasesModel) result1_bindingAndBlack[0];
		Model model = (Model) result1_bindingAndBlack[1];
		UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result1_bindingAndBlack[2];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_1_greenBFBFB(useCasesModel,
						p, csp);
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_green[1];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_2_blackBBB(
						packageDeclaration, p, packageDeclarationToPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_2_greenFBBB(
						packageDeclaration, p, packageDeclarationToPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_3_blackBBBBBBB(ruleresult,
						useCasesModel, model, useCasesModelToModel,
						packageDeclaration, p, packageDeclarationToPackage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_3_greenBBBBBBFFFF(ruleresult,
						useCasesModel, model, packageDeclaration, p,
						packageDeclarationToPackage);
		// EMoflonEdge useCasesModel__packageDeclaration____packages = (EMoflonEdge) result3_green[6];
		// EMoflonEdge model__p____packagedElement = (EMoflonEdge) result3_green[7];
		// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge packageDeclarationToPackage__p____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_5_expressionBBBBBBBB(this,
						ruleresult, useCasesModel, model, useCasesModelToModel,
						packageDeclaration, p, packageDeclarationToPackage);
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Model model = (Model) result2_binding[0];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_binding[1];
		for (Object[] result2_black : UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_12_2_blackFBFBB(model, p, match)) {
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[0];
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_12_3_blackBBBB(
							useCasesModel, model, useCasesModelToModel, p)) {
				Object[] result3_green = UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_12_3_greenBBBBFFFF(
								useCasesModel, model, useCasesModelToModel, p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge model__p____packagedElement = (EMoflonEdge) result3_green[5];
				// EMoflonEdge useCasesModelToModel__useCasesModel____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge useCasesModelToModel__model____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_12_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, useCasesModel, model,
								useCasesModelToModel, p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {
		match.registerObject("model", model);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {// Create CSP
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
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_p_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"p.name", true, csp);
		var_p_name.setValue(p.getName());
		var_p_name.setType("String");

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_packageDeclaration_name, var_p_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("useCasesModelToModel",
				useCasesModelToModel);
		isApplicableMatch.registerObject("p", p);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("p")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_491(
			EMoflonEdge _edge_packages) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_20_2_blackFFB(_edge_packages)) {
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			Object[] result2_green = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_20_3_expressionFBBBB(this,
							match, useCasesModel, packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_320(
			EMoflonEdge _edge_packagedElement) {
		// prepare return value
		Object[] result1_bindingAndBlack = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_21_2_blackFFB(_edge_packagedElement)) {
			Model model = (Model) result2_black[0];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[1];
			Object[] result2_green = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_21_3_expressionFBBBB(this,
							match, model, p)) {
				// Ensure that the correct types of elements are matched
				if (UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_21_6_expressionFB(__result);
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
			UseCasesModelToModel useCasesModelToModelParameter) {
		// create result
		Object[] result1_black = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_24_2_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCasesModelToModelList = (RuleEntryList) result2_black[0];
			UseCasesModel useCasesModel = (UseCasesModel) result2_black[1];
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result2_black[2];
			Model model = (Model) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_24_3_bindingAndBlackFBBBBBB(
							this, isApplicableMatch, useCasesModel, model,
							useCasesModelToModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UCPackageToMSDPackageImpl
					.pattern_UCPackageToMSDPackage_24_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = UCPackageToMSDPackageImpl
						.pattern_UCPackageToMSDPackage_24_5_blackBBB(
								useCasesModel, model, useCasesModelToModel);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_24_6_blackBBBB(
									useCasesModel, model, useCasesModelToModel,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					UCPackageToMSDPackageImpl
							.pattern_UCPackageToMSDPackage_24_6_greenBBFFFBB(
									useCasesModel, model, ruleResult, csp);
					// PackageDeclaration packageDeclaration = (PackageDeclaration) result6_green[2];
					// ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result6_green[3];
					// PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return UCPackageToMSDPackageImpl
				.pattern_UCPackageToMSDPackage_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");
		Variable var_p_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"p.name", csp);
		var_p_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_packageDeclaration_name, var_p_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("useCasesModelToModel",
				useCasesModelToModel);
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
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1), (Model) arguments.get(2),
					(UseCasesModelToModel) arguments.get(3),
					(PackageDeclaration) arguments.get(4));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1), (Model) arguments.get(2),
					(UseCasesModelToModel) arguments.get(3),
					(ModalSequenceDiagram.Package) arguments.get(4));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_491__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_491((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_320__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_320((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASESMODELTOMODEL:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCasesModelToModel) arguments.get(1));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1), (Model) arguments.get(2),
					(UseCasesModelToModel) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_1_blackBBBB(
			UCPackageToMSDPackage _this, Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, useCasesModel, packageDeclaration };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_2_bindingFBBBB(
			UCPackageToMSDPackage _this, Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				useCasesModel, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCasesModel,
					packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_2_bindingAndBlackFBBBB(
			UCPackageToMSDPackage _this, Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		Object[] result_pattern_UCPackageToMSDPackage_0_2_binding = pattern_UCPackageToMSDPackage_0_2_bindingFBBBB(
				_this, match, useCasesModel, packageDeclaration);
		if (result_pattern_UCPackageToMSDPackage_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_0_2_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_0_2_black = pattern_UCPackageToMSDPackage_0_2_blackB(csp);
			if (result_pattern_UCPackageToMSDPackage_0_2_black != null) {

				return new Object[] { csp, _this, match, useCasesModel,
						packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_UCPackageToMSDPackage_0_3_expressionFBB(
			UCPackageToMSDPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_4_blackBBB(
			Match match, UseCasesModel useCasesModel,
			PackageDeclaration packageDeclaration) {
		return new Object[] { match, useCasesModel, packageDeclaration };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_4_greenBBBF(
			Match match, UseCasesModel useCasesModel,
			PackageDeclaration packageDeclaration) {
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
		return new Object[] { match, useCasesModel, packageDeclaration,
				useCasesModel__packageDeclaration____packages };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_5_blackBBB(
			Match match, UseCasesModel useCasesModel,
			PackageDeclaration packageDeclaration) {
		return new Object[] { match, useCasesModel, packageDeclaration };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_0_5_greenBB(
			Match match, UseCasesModel useCasesModel) {
		match.getContextNodes().add(useCasesModel);
		return new Object[] { match, useCasesModel };
	}

	public static final void pattern_UCPackageToMSDPackage_0_6_expressionBBBB(
			UCPackageToMSDPackage _this, Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, useCasesModel,
				packageDeclaration);

	}

	public static final boolean pattern_UCPackageToMSDPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UCPackageToMSDPackage_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCasesModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("useCasesModelToModel");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpUseCasesModel = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpUseCasesModelToModel = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				if (tmpUseCasesModelToModel instanceof UseCasesModelToModel) {
					UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) tmpUseCasesModelToModel;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						return new Object[] { useCasesModel, model,
								useCasesModelToModel, packageDeclaration,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_1_blackBBBBFBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration, UCPackageToMSDPackage _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCasesModel, model,
						useCasesModelToModel, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_1_bindingAndBlackFFFFFBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UCPackageToMSDPackage_1_1_binding = pattern_UCPackageToMSDPackage_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_UCPackageToMSDPackage_1_1_binding != null) {
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_UCPackageToMSDPackage_1_1_binding[0];
			Model model = (Model) result_pattern_UCPackageToMSDPackage_1_1_binding[1];
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result_pattern_UCPackageToMSDPackage_1_1_binding[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UCPackageToMSDPackage_1_1_binding[3];

			Object[] result_pattern_UCPackageToMSDPackage_1_1_black = pattern_UCPackageToMSDPackage_1_1_blackBBBBFBB(
					useCasesModel, model, useCasesModelToModel,
					packageDeclaration, _this, isApplicableMatch);
			if (result_pattern_UCPackageToMSDPackage_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_1_1_black[4];

				return new Object[] { useCasesModel, model,
						useCasesModelToModel, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_1_greenBBFFB(
			Model model, PackageDeclaration packageDeclaration, CSP csp) {
		ModalSequenceDiagram.Package p = ModalSequenceDiagramFactory.eINSTANCE
				.createPackage();
		PackageDeclarationToPackage packageDeclarationToPackage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createPackageDeclarationToPackage();
		Object _localVariable_0 = csp.getValue("p", "name");
		model.getPackagedElement().add(p);
		packageDeclarationToPackage.setSource(packageDeclaration);
		packageDeclarationToPackage.setTarget(p);
		String p_name_prime = (String) _localVariable_0;
		p.setName(p_name_prime);
		return new Object[] { model, packageDeclaration, p,
				packageDeclarationToPackage, csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_2_blackBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		return new Object[] { packageDeclaration, p,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_2_greenFBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(packageDeclaration);
		ruleresult.getCreatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(packageDeclarationToPackage);
		return new Object[] { ruleresult, packageDeclaration, p,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel, EObject packageDeclaration,
			EObject p, EObject packageDeclarationToPackage) {
		if (!useCasesModel.equals(useCasesModelToModel)) {
			if (!model.equals(useCasesModel)) {
				if (!model.equals(useCasesModelToModel)) {
					if (!model.equals(packageDeclaration)) {
						if (!model.equals(p)) {
							if (!model.equals(packageDeclarationToPackage)) {
								if (!packageDeclaration.equals(useCasesModel)) {
									if (!packageDeclaration
											.equals(useCasesModelToModel)) {
										if (!packageDeclaration
												.equals(packageDeclarationToPackage)) {
											if (!p.equals(useCasesModel)) {
												if (!p.equals(useCasesModelToModel)) {
													if (!p.equals(packageDeclaration)) {
														if (!p.equals(packageDeclarationToPackage)) {
															if (!packageDeclarationToPackage
																	.equals(useCasesModel)) {
																if (!packageDeclarationToPackage
																		.equals(useCasesModelToModel)) {
																	return new Object[] {
																			ruleresult,
																			useCasesModel,
																			model,
																			useCasesModelToModel,
																			packageDeclaration,
																			p,
																			packageDeclarationToPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UCPackageToMSDPackage_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge model__p____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UCPackageToMSDPackage";
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		String model__p____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage__p____target_name_prime = "target";
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		ruleresult.getTranslatedEdges().add(
				useCasesModel__packageDeclaration____packages);
		model__p____packagedElement.setSrc(model);
		model__p____packagedElement.setTrg(p);
		ruleresult.getCreatedEdges().add(model__p____packagedElement);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage__p____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(
				packageDeclarationToPackage__p____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		model__p____packagedElement
				.setName(model__p____packagedElement_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage__p____target
				.setName(packageDeclarationToPackage__p____target_name_prime);
		return new Object[] { ruleresult, useCasesModel, model,
				packageDeclaration, p, packageDeclarationToPackage,
				useCasesModel__packageDeclaration____packages,
				model__p____packagedElement,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage__p____target };
	}

	public static final void pattern_UCPackageToMSDPackage_1_5_expressionBBBBBBBB(
			UCPackageToMSDPackage _this, PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		_this.registerObjects_FWD(ruleresult, useCasesModel, model,
				useCasesModelToModel, packageDeclaration, p,
				packageDeclarationToPackage);

	}

	public static final PerformRuleResult pattern_UCPackageToMSDPackage_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_1_bindingFB(
			UCPackageToMSDPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_1_blackFBB(
			EClass eClass, UCPackageToMSDPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_1_bindingAndBlackFFB(
			UCPackageToMSDPackage _this) {
		Object[] result_pattern_UCPackageToMSDPackage_2_1_binding = pattern_UCPackageToMSDPackage_2_1_bindingFB(_this);
		if (result_pattern_UCPackageToMSDPackage_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UCPackageToMSDPackage_2_1_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_2_1_black = pattern_UCPackageToMSDPackage_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UCPackageToMSDPackage_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UCPackageToMSDPackage_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UCPackageToMSDPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCasesModel");
		EObject _localVariable_1 = match.getObject("packageDeclaration");
		EObject tmpUseCasesModel = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				return new Object[] { useCasesModel, packageDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_2_2_blackBFFBB(
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCasesModelToModel useCasesModelToModel : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCasesModel,
						UseCasesModelToModel.class, "source")) {
			Model model = useCasesModelToModel.getTarget();
			if (model != null) {
				_result.add(new Object[] { useCasesModel, model,
						useCasesModelToModel, packageDeclaration, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_2_3_blackBBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCasesModel.getPackages().contains(packageDeclaration)) {
			if (useCasesModel.equals(useCasesModelToModel.getSource())) {
				if (model.equals(useCasesModelToModel.getTarget())) {
					_result.add(new Object[] { useCasesModel, model,
							useCasesModelToModel, packageDeclaration });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_3_greenBBBBFFFF(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__useCasesModel____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__model____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		String useCasesModelToModel__useCasesModel____source_name_prime = "source";
		String useCasesModelToModel__model____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(useCasesModelToModel);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				useCasesModel__packageDeclaration____packages);
		useCasesModelToModel__useCasesModel____source
				.setSrc(useCasesModelToModel);
		useCasesModelToModel__useCasesModel____source.setTrg(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				useCasesModelToModel__useCasesModel____source);
		useCasesModelToModel__model____target.setSrc(useCasesModelToModel);
		useCasesModelToModel__model____target.setTrg(model);
		isApplicableMatch.getAllContextElements().add(
				useCasesModelToModel__model____target);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		useCasesModelToModel__useCasesModel____source
				.setName(useCasesModelToModel__useCasesModel____source_name_prime);
		useCasesModelToModel__model____target
				.setName(useCasesModelToModel__model____target_name_prime);
		return new Object[] { useCasesModel, model, useCasesModelToModel,
				packageDeclaration, isApplicableMatch,
				useCasesModel__packageDeclaration____packages,
				useCasesModelToModel__useCasesModel____source,
				useCasesModelToModel__model____target };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_4_bindingFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, useCasesModel, model, useCasesModelToModel,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCasesModel,
					model, useCasesModelToModel, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_4_bindingAndBlackFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_UCPackageToMSDPackage_2_4_binding = pattern_UCPackageToMSDPackage_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, useCasesModel, model,
				useCasesModelToModel, packageDeclaration);
		if (result_pattern_UCPackageToMSDPackage_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_2_4_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_2_4_black = pattern_UCPackageToMSDPackage_2_4_blackB(csp);
			if (result_pattern_UCPackageToMSDPackage_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCasesModel, model, useCasesModelToModel,
						packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_UCPackageToMSDPackage_2_5_expressionFBB(
			UCPackageToMSDPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UCPackageToMSDPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UCPackageToMSDPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_1_blackBBBB(
			UCPackageToMSDPackage _this, Match match, Model model,
			ModalSequenceDiagram.Package p) {
		if (!model.equals(p)) {
			return new Object[] { _this, match, model, p };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_2_bindingFBBBB(
			UCPackageToMSDPackage _this, Match match, Model model,
			ModalSequenceDiagram.Package p) {
		CSP _localVariable_0 = _this
				.isAppropriate_solveCsp_BWD(match, model, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, p };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_2_bindingAndBlackFBBBB(
			UCPackageToMSDPackage _this, Match match, Model model,
			ModalSequenceDiagram.Package p) {
		Object[] result_pattern_UCPackageToMSDPackage_10_2_binding = pattern_UCPackageToMSDPackage_10_2_bindingFBBBB(
				_this, match, model, p);
		if (result_pattern_UCPackageToMSDPackage_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_10_2_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_10_2_black = pattern_UCPackageToMSDPackage_10_2_blackB(csp);
			if (result_pattern_UCPackageToMSDPackage_10_2_black != null) {

				return new Object[] { csp, _this, match, model, p };
			}
		}
		return null;
	}

	public static final boolean pattern_UCPackageToMSDPackage_10_3_expressionFBB(
			UCPackageToMSDPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_4_blackBBB(
			Match match, Model model, ModalSequenceDiagram.Package p) {
		if (!model.equals(p)) {
			return new Object[] { match, model, p };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_4_greenBBBF(
			Match match, Model model, ModalSequenceDiagram.Package p) {
		EMoflonEdge model__p____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(p);
		String model__p____packagedElement_name_prime = "packagedElement";
		model__p____packagedElement.setSrc(model);
		model__p____packagedElement.setTrg(p);
		match.getToBeTranslatedEdges().add(model__p____packagedElement);
		model__p____packagedElement
				.setName(model__p____packagedElement_name_prime);
		return new Object[] { match, model, p, model__p____packagedElement };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_5_blackBBB(
			Match match, Model model, ModalSequenceDiagram.Package p) {
		if (!model.equals(p)) {
			return new Object[] { match, model, p };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_10_5_greenBB(
			Match match, Model model) {
		match.getContextNodes().add(model);
		return new Object[] { match, model };
	}

	public static final void pattern_UCPackageToMSDPackage_10_6_expressionBBBB(
			UCPackageToMSDPackage _this, Match match, Model model,
			ModalSequenceDiagram.Package p) {
		_this.registerObjectsToMatch_BWD(match, model, p);

	}

	public static final boolean pattern_UCPackageToMSDPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UCPackageToMSDPackage_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCasesModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("useCasesModelToModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("p");
		EObject tmpUseCasesModel = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpUseCasesModelToModel = _localVariable_2;
		EObject tmpP = _localVariable_3;
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				if (tmpUseCasesModelToModel instanceof UseCasesModelToModel) {
					UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) tmpUseCasesModelToModel;
					if (tmpP instanceof ModalSequenceDiagram.Package) {
						ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
						return new Object[] { useCasesModel, model,
								useCasesModelToModel, p, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_1_blackBBBBFBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p, UCPackageToMSDPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!model.equals(p)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { useCasesModel, model,
							useCasesModelToModel, p, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_1_bindingAndBlackFFFFFBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UCPackageToMSDPackage_11_1_binding = pattern_UCPackageToMSDPackage_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_UCPackageToMSDPackage_11_1_binding != null) {
			UseCasesModel useCasesModel = (UseCasesModel) result_pattern_UCPackageToMSDPackage_11_1_binding[0];
			Model model = (Model) result_pattern_UCPackageToMSDPackage_11_1_binding[1];
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) result_pattern_UCPackageToMSDPackage_11_1_binding[2];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result_pattern_UCPackageToMSDPackage_11_1_binding[3];

			Object[] result_pattern_UCPackageToMSDPackage_11_1_black = pattern_UCPackageToMSDPackage_11_1_blackBBBBFBB(
					useCasesModel, model, useCasesModelToModel, p, _this,
					isApplicableMatch);
			if (result_pattern_UCPackageToMSDPackage_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_11_1_black[4];

				return new Object[] { useCasesModel, model,
						useCasesModelToModel, p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_1_greenBFBFB(
			UseCasesModel useCasesModel, ModalSequenceDiagram.Package p, CSP csp) {
		PackageDeclaration packageDeclaration = UseCaseDSLFactory.eINSTANCE
				.createPackageDeclaration();
		PackageDeclarationToPackage packageDeclarationToPackage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createPackageDeclarationToPackage();
		Object _localVariable_0 = csp.getValue("packageDeclaration", "name");
		useCasesModel.getPackages().add(packageDeclaration);
		packageDeclarationToPackage.setSource(packageDeclaration);
		packageDeclarationToPackage.setTarget(p);
		String packageDeclaration_name_prime = (String) _localVariable_0;
		packageDeclaration.setName(packageDeclaration_name_prime);
		return new Object[] { useCasesModel, packageDeclaration, p,
				packageDeclarationToPackage, csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_2_blackBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		return new Object[] { packageDeclaration, p,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_2_greenFBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(packageDeclaration);
		ruleresult.getTranslatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(packageDeclarationToPackage);
		return new Object[] { ruleresult, packageDeclaration, p,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject useCasesModelToModel, EObject packageDeclaration,
			EObject p, EObject packageDeclarationToPackage) {
		if (!useCasesModel.equals(useCasesModelToModel)) {
			if (!model.equals(useCasesModel)) {
				if (!model.equals(useCasesModelToModel)) {
					if (!model.equals(packageDeclaration)) {
						if (!model.equals(p)) {
							if (!model.equals(packageDeclarationToPackage)) {
								if (!packageDeclaration.equals(useCasesModel)) {
									if (!packageDeclaration
											.equals(useCasesModelToModel)) {
										if (!packageDeclaration
												.equals(packageDeclarationToPackage)) {
											if (!p.equals(useCasesModel)) {
												if (!p.equals(useCasesModelToModel)) {
													if (!p.equals(packageDeclaration)) {
														if (!p.equals(packageDeclarationToPackage)) {
															if (!packageDeclarationToPackage
																	.equals(useCasesModel)) {
																if (!packageDeclarationToPackage
																		.equals(useCasesModelToModel)) {
																	return new Object[] {
																			ruleresult,
																			useCasesModel,
																			model,
																			useCasesModelToModel,
																			packageDeclaration,
																			p,
																			packageDeclarationToPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UCPackageToMSDPackage_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject useCasesModel, EObject model,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		EMoflonEdge useCasesModel__packageDeclaration____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge model__p____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UCPackageToMSDPackage";
		String useCasesModel__packageDeclaration____packages_name_prime = "packages";
		String model__p____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage__p____target_name_prime = "target";
		useCasesModel__packageDeclaration____packages.setSrc(useCasesModel);
		useCasesModel__packageDeclaration____packages
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				useCasesModel__packageDeclaration____packages);
		model__p____packagedElement.setSrc(model);
		model__p____packagedElement.setTrg(p);
		ruleresult.getTranslatedEdges().add(model__p____packagedElement);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		ruleresult.getCreatedEdges().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage__p____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(
				packageDeclarationToPackage__p____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCasesModel__packageDeclaration____packages
				.setName(useCasesModel__packageDeclaration____packages_name_prime);
		model__p____packagedElement
				.setName(model__p____packagedElement_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage__p____target
				.setName(packageDeclarationToPackage__p____target_name_prime);
		return new Object[] { ruleresult, useCasesModel, model,
				packageDeclaration, p, packageDeclarationToPackage,
				useCasesModel__packageDeclaration____packages,
				model__p____packagedElement,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage__p____target };
	}

	public static final void pattern_UCPackageToMSDPackage_11_5_expressionBBBBBBBB(
			UCPackageToMSDPackage _this, PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		_this.registerObjects_BWD(ruleresult, useCasesModel, model,
				useCasesModelToModel, packageDeclaration, p,
				packageDeclarationToPackage);

	}

	public static final PerformRuleResult pattern_UCPackageToMSDPackage_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_1_bindingFB(
			UCPackageToMSDPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_1_blackFBB(
			EClass eClass, UCPackageToMSDPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_1_bindingAndBlackFFB(
			UCPackageToMSDPackage _this) {
		Object[] result_pattern_UCPackageToMSDPackage_12_1_binding = pattern_UCPackageToMSDPackage_12_1_bindingFB(_this);
		if (result_pattern_UCPackageToMSDPackage_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UCPackageToMSDPackage_12_1_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_12_1_black = pattern_UCPackageToMSDPackage_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UCPackageToMSDPackage_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UCPackageToMSDPackage_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UCPackageToMSDPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("p");
		EObject tmpModel = _localVariable_0;
		EObject tmpP = _localVariable_1;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpP instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
				return new Object[] { model, p, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_12_2_blackFBFBB(
			Model model, ModalSequenceDiagram.Package p, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!model.equals(p)) {
			for (UseCasesModelToModel useCasesModelToModel : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(model,
							UseCasesModelToModel.class, "target")) {
				UseCasesModel useCasesModel = useCasesModelToModel.getSource();
				if (useCasesModel != null) {
					_result.add(new Object[] { useCasesModel, model,
							useCasesModelToModel, p, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_12_3_blackBBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!model.equals(p)) {
			if (model.getPackagedElement().contains(p)) {
				if (useCasesModel.equals(useCasesModelToModel.getSource())) {
					if (model.equals(useCasesModelToModel.getTarget())) {
						_result.add(new Object[] { useCasesModel, model,
								useCasesModelToModel, p });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_3_greenBBBBFFFF(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge model__p____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__useCasesModel____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCasesModelToModel__model____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String model__p____packagedElement_name_prime = "packagedElement";
		String useCasesModelToModel__useCasesModel____source_name_prime = "source";
		String useCasesModelToModel__model____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(useCasesModel);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(useCasesModelToModel);
		isApplicableMatch.getAllContextElements().add(p);
		model__p____packagedElement.setSrc(model);
		model__p____packagedElement.setTrg(p);
		isApplicableMatch.getAllContextElements().add(
				model__p____packagedElement);
		useCasesModelToModel__useCasesModel____source
				.setSrc(useCasesModelToModel);
		useCasesModelToModel__useCasesModel____source.setTrg(useCasesModel);
		isApplicableMatch.getAllContextElements().add(
				useCasesModelToModel__useCasesModel____source);
		useCasesModelToModel__model____target.setSrc(useCasesModelToModel);
		useCasesModelToModel__model____target.setTrg(model);
		isApplicableMatch.getAllContextElements().add(
				useCasesModelToModel__model____target);
		model__p____packagedElement
				.setName(model__p____packagedElement_name_prime);
		useCasesModelToModel__useCasesModel____source
				.setName(useCasesModelToModel__useCasesModel____source_name_prime);
		useCasesModelToModel__model____target
				.setName(useCasesModelToModel__model____target_name_prime);
		return new Object[] { useCasesModel, model, useCasesModelToModel, p,
				isApplicableMatch, model__p____packagedElement,
				useCasesModelToModel__useCasesModel____source,
				useCasesModelToModel__model____target };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_4_bindingFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, useCasesModel, model, useCasesModelToModel,
				p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCasesModel,
					model, useCasesModelToModel, p };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_4_bindingAndBlackFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {
		Object[] result_pattern_UCPackageToMSDPackage_12_4_binding = pattern_UCPackageToMSDPackage_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, useCasesModel, model,
				useCasesModelToModel, p);
		if (result_pattern_UCPackageToMSDPackage_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_12_4_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_12_4_black = pattern_UCPackageToMSDPackage_12_4_blackB(csp);
			if (result_pattern_UCPackageToMSDPackage_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCasesModel, model, useCasesModelToModel, p };
			}
		}
		return null;
	}

	public static final boolean pattern_UCPackageToMSDPackage_12_5_expressionFBB(
			UCPackageToMSDPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UCPackageToMSDPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UCPackageToMSDPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_1_bindingFB(
			UCPackageToMSDPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_1_blackFBB(
			EClass __eClass, UCPackageToMSDPackage _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_1_bindingAndBlackFFB(
			UCPackageToMSDPackage _this) {
		Object[] result_pattern_UCPackageToMSDPackage_20_1_binding = pattern_UCPackageToMSDPackage_20_1_bindingFB(_this);
		if (result_pattern_UCPackageToMSDPackage_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UCPackageToMSDPackage_20_1_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_20_1_black = pattern_UCPackageToMSDPackage_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UCPackageToMSDPackage_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UCPackageToMSDPackage_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_2_black_nac_0BB(
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		for (UseCasesModel __DEC_packageDeclaration_packages_603470 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						UseCasesModel.class, "packages")) {
			if (!useCasesModel.equals(__DEC_packageDeclaration_packages_603470)) {
				return new Object[] { packageDeclaration, useCasesModel };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_20_2_blackFFB(
			EMoflonEdge _edge_packages) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCasesModel = _edge_packages.getSrc();
		if (tmpUseCasesModel instanceof UseCasesModel) {
			UseCasesModel useCasesModel = (UseCasesModel) tmpUseCasesModel;
			EObject tmpPackageDeclaration = _edge_packages.getTrg();
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (useCasesModel.getPackages().contains(packageDeclaration)) {
					if (pattern_UCPackageToMSDPackage_20_2_black_nac_0BB(
							packageDeclaration, useCasesModel) == null) {
						_result.add(new Object[] { useCasesModel,
								packageDeclaration, _edge_packages });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UCPackageToMSDPackage_20_3_expressionFBBBB(
			UCPackageToMSDPackage _this, Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				useCasesModel, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UCPackageToMSDPackage_20_4_expressionFBB(
			UCPackageToMSDPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UCPackageToMSDPackage_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_1_bindingFB(
			UCPackageToMSDPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_1_blackFBB(
			EClass __eClass, UCPackageToMSDPackage _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_1_bindingAndBlackFFB(
			UCPackageToMSDPackage _this) {
		Object[] result_pattern_UCPackageToMSDPackage_21_1_binding = pattern_UCPackageToMSDPackage_21_1_bindingFB(_this);
		if (result_pattern_UCPackageToMSDPackage_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UCPackageToMSDPackage_21_1_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_21_1_black = pattern_UCPackageToMSDPackage_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UCPackageToMSDPackage_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UCPackageToMSDPackage_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_21_2_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_packagedElement.getSrc();
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			EObject tmpP = _edge_packagedElement.getTrg();
			if (tmpP instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
				if (!model.equals(p)) {
					if (model.getPackagedElement().contains(p)) {
						_result.add(new Object[] { model, p,
								_edge_packagedElement });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UCPackageToMSDPackage_21_3_expressionFBBBB(
			UCPackageToMSDPackage _this, Match match, Model model,
			ModalSequenceDiagram.Package p) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, model, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UCPackageToMSDPackage_21_4_expressionFBB(
			UCPackageToMSDPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UCPackageToMSDPackage_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_1_blackB(
			UCPackageToMSDPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, UseCasesModel useCasesModel) {
		if (ruleResult.getSourceObjects().contains(useCasesModel)) {
			return new Object[] { ruleResult, useCasesModel };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			UseCasesModelToModel useCasesModelToModel) {
		if (ruleResult.getCorrObjects().contains(useCasesModelToModel)) {
			return new Object[] { ruleResult, useCasesModelToModel };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getTargetObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UCPackageToMSDPackage_24_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList useCasesModelToModelList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpUseCasesModelToModel : useCasesModelToModelList
					.getEntryObjects()) {
				if (tmpUseCasesModelToModel instanceof UseCasesModelToModel) {
					UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) tmpUseCasesModelToModel;
					UseCasesModel useCasesModel = useCasesModelToModel
							.getSource();
					if (useCasesModel != null) {
						Model model = useCasesModelToModel.getTarget();
						if (model != null) {
							if (pattern_UCPackageToMSDPackage_24_2_black_nac_1BB(
									ruleResult, useCasesModelToModel) == null) {
								if (pattern_UCPackageToMSDPackage_24_2_black_nac_0BB(
										ruleResult, useCasesModel) == null) {
									if (pattern_UCPackageToMSDPackage_24_2_black_nac_2BB(
											ruleResult, model) == null) {
										_result.add(new Object[] {
												useCasesModelToModelList,
												useCasesModel,
												useCasesModelToModel, model,
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

	public static final Object[] pattern_UCPackageToMSDPackage_24_3_bindingFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, useCasesModel, model, useCasesModelToModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCasesModel,
					model, useCasesModelToModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_3_bindingAndBlackFBBBBBB(
			UCPackageToMSDPackage _this, IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UCPackageToMSDPackage_24_3_binding = pattern_UCPackageToMSDPackage_24_3_bindingFBBBBBB(
				_this, isApplicableMatch, useCasesModel, model,
				useCasesModelToModel, ruleResult);
		if (result_pattern_UCPackageToMSDPackage_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_UCPackageToMSDPackage_24_3_binding[0];

			Object[] result_pattern_UCPackageToMSDPackage_24_3_black = pattern_UCPackageToMSDPackage_24_3_blackB(csp);
			if (result_pattern_UCPackageToMSDPackage_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCasesModel, model, useCasesModelToModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UCPackageToMSDPackage_24_4_expressionFBB(
			UCPackageToMSDPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_5_blackBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel) {
		return new Object[] { useCasesModel, model, useCasesModelToModel };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_6_blackBBBB(
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { useCasesModel, model, useCasesModelToModel,
				ruleResult };
	}

	public static final Object[] pattern_UCPackageToMSDPackage_24_6_greenBBFFFBB(
			UseCasesModel useCasesModel, Model model,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		PackageDeclaration packageDeclaration = UseCaseDSLFactory.eINSTANCE
				.createPackageDeclaration();
		ModalSequenceDiagram.Package p = ModalSequenceDiagramFactory.eINSTANCE
				.createPackage();
		PackageDeclarationToPackage packageDeclarationToPackage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createPackageDeclarationToPackage();
		Object _localVariable_0 = csp.getValue("packageDeclaration", "name");
		Object _localVariable_1 = csp.getValue("p", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		useCasesModel.getPackages().add(packageDeclaration);
		ruleResult.getSourceObjects().add(packageDeclaration);
		model.getPackagedElement().add(p);
		ruleResult.getTargetObjects().add(p);
		packageDeclarationToPackage.setSource(packageDeclaration);
		packageDeclarationToPackage.setTarget(p);
		ruleResult.getCorrObjects().add(packageDeclarationToPackage);
		String packageDeclaration_name_prime = (String) _localVariable_0;
		String p_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		packageDeclaration.setName(packageDeclaration_name_prime);
		p.setName(p_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { useCasesModel, model, packageDeclaration, p,
				packageDeclarationToPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UCPackageToMSDPackage_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UCPackageToMSDPackageImpl
