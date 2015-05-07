/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;

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
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;

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
 * An implementation of the model object '<em><b>Use Case To Interaction Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UseCaseToInteractionRuleImpl extends AbstractRuleImpl implements
		UseCaseToInteractionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseToInteractionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUseCaseToInteractionRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		// initial bindings
		Object[] result1_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_0_1_blackBBBBB(this, match,
						packageDeclaration, useCase, basicFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_0_2_bindingAndBlackFBBBBB(
						this, match, packageDeclaration, useCase, basicFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_4_blackBBBB(match,
							packageDeclaration, useCase, basicFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_4_greenBBBBFF(match,
							packageDeclaration, useCase, basicFlow);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result4_green[4];
			// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_5_blackBBBB(match,
							packageDeclaration, useCase, basicFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_5_greenBB(match,
							packageDeclaration);

			// register objects to match
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_6_expressionBBBBB(this,
							match, packageDeclaration, useCase, basicFlow);
			return UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_7_expressionF();
		} else {
			return UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_1_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result1_bindingAndBlack[1];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		BasicFlow basicFlow = (BasicFlow) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_1_greenBBFFBFB(_package,
						useCase, basicFlow, csp);
		Interaction interaction = (Interaction) result1_green[2];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_green[3];
		FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result1_green[5];

		// collect translated elements
		Object[] result2_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_2_blackBBBBB(useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_2_greenFBBBBB(useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_3_blackBBBBBBBBB(
						ruleresult, packageDeclaration, _package,
						packageDeclarationToPackage, useCase, interaction,
						useCaseToInteraction, basicFlow, basicFlowToInteraction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_3_greenBBBBBBBBFFFFFFF(
						ruleresult, packageDeclaration, _package, useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[8];
		// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[9];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge basicFlowToInteraction__basicFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge basicFlowToInteraction__interaction____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_5_expressionBBBBBBBBBB(
						this, ruleresult, packageDeclaration, _package,
						packageDeclarationToPackage, useCase, interaction,
						useCaseToInteraction, basicFlow, basicFlowToInteraction);
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		BasicFlow basicFlow = (BasicFlow) result2_binding[2];
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_2_2_blackBFFBBB(
						packageDeclaration, useCase, basicFlow, match)) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[1];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_2_3_blackBBBBB(
							packageDeclaration, _package,
							packageDeclarationToPackage, useCase, basicFlow)) {
				Object[] result3_green = UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_2_3_greenBBBBBFFFFF(
								packageDeclaration, _package,
								packageDeclarationToPackage, useCase, basicFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[6];
				// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge packageDeclarationToPackage___package____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_2_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								_package, packageDeclarationToPackage, useCase,
								basicFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("basicFlow", basicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {// Create CSP
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
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("String");

		// Create unbound variables
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
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
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("useCase")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getUseCase())
				&& match.getObject("basicFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getBasicFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		// initial bindings
		Object[] result1_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_10_1_blackBBBB(this, match,
						_package, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_10_2_bindingAndBlackFBBBB(
						this, match, _package, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_4_blackBBB(match,
							_package, interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_4_greenBBBF(match,
							_package, interaction);
			// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_5_blackBBB(match,
							_package, interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_5_greenBB(match,
							_package);

			// register objects to match
			UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_6_expressionBBBB(this,
							match, _package, interaction);
			return UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_7_expressionF();
		} else {
			return UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_1_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result1_bindingAndBlack[1];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_1_greenBFBFFFB(
						packageDeclaration, interaction, csp);
		UseCase useCase = (UseCase) result1_green[1];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_green[3];
		BasicFlow basicFlow = (BasicFlow) result1_green[4];
		FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result1_green[5];

		// collect translated elements
		Object[] result2_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_2_blackBBBBB(useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_2_greenFBBBBB(useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_3_blackBBBBBBBBB(
						ruleresult, packageDeclaration, _package,
						packageDeclarationToPackage, useCase, interaction,
						useCaseToInteraction, basicFlow, basicFlowToInteraction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_3_greenBBBBBBBBFFFFFFF(
						ruleresult, packageDeclaration, _package, useCase,
						interaction, useCaseToInteraction, basicFlow,
						basicFlowToInteraction);
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[8];
		// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[9];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge basicFlowToInteraction__basicFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge basicFlowToInteraction__interaction____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_5_expressionBBBBBBBBBB(
						this, ruleresult, packageDeclaration, _package,
						packageDeclarationToPackage, useCase, interaction,
						useCaseToInteraction, basicFlow, basicFlowToInteraction);
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_binding[0];
		Interaction interaction = (Interaction) result2_binding[1];
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_12_2_blackFBFBB(_package,
						interaction, match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_12_3_blackBBBB(
							packageDeclaration, _package,
							packageDeclarationToPackage, interaction)) {
				Object[] result3_green = UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_12_3_greenBBBBFFFF(
								packageDeclaration, _package,
								packageDeclarationToPackage, interaction);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[5];
				// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge packageDeclarationToPackage___package____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_12_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								_package, packageDeclarationToPackage,
								interaction);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		match.registerObject("_package", _package);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {// Create CSP
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
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", true, csp);
		var_interaction_name.setValue(interaction.getName());
		var_interaction_name.setType("String");

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("interaction")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_492(
			EMoflonEdge _edge_useCases) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_20_2_blackFFFB(_edge_useCases)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Object[] result2_green = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_20_3_expressionFBBBBB(
							this, match, packageDeclaration, useCase, basicFlow)) {
				// Ensure that the correct types of elements are matched
				if (UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_321(
			EMoflonEdge _edge_packagedElement) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_21_2_blackFFB(_edge_packagedElement)) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			Object[] result2_green = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_21_3_expressionFBBBB(
							this, match, _package, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_493(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_22_2_blackFFFB(_edge_flows)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Object[] result2_green = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_22_3_expressionFBBBBB(
							this, match, packageDeclaration, useCase, basicFlow)) {
				// Ensure that the correct types of elements are matched
				if (UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_22_6_expressionFB(__result);
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
			PackageDeclarationToPackage packageDeclarationToPackageParameter) {
		// create result
		Object[] result1_black = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_25_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_25_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_25_2_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList packageDeclarationToPackageList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[2];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_25_3_bindingAndBlackFBBBBBB(
							this, isApplicableMatch, packageDeclaration,
							_package, packageDeclarationToPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UseCaseToInteractionRuleImpl
					.pattern_UseCaseToInteractionRule_25_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = UseCaseToInteractionRuleImpl
						.pattern_UseCaseToInteractionRule_25_5_blackBBB(
								packageDeclaration, _package,
								packageDeclarationToPackage);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_25_6_blackBBBB(
									packageDeclaration, _package,
									packageDeclarationToPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					UseCaseToInteractionRuleImpl
							.pattern_UseCaseToInteractionRule_25_6_greenBBFFFFFBB(
									packageDeclaration, _package, ruleResult,
									csp);
					// UseCase useCase = (UseCase) result6_green[2];
					// Interaction interaction = (Interaction) result6_green[3];
					// UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result6_green[4];
					// BasicFlow basicFlow = (BasicFlow) result6_green[5];
					// FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return UseCaseToInteractionRuleImpl
				.pattern_UseCaseToInteractionRule_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (BasicFlow) arguments.get(5));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Interaction) arguments.get(4));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_492__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_492((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_321__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_321((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_493__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_493((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(PackageDeclarationToPackage) arguments.get(1));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_1_blackBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		return new Object[] { _this, match, packageDeclaration, useCase,
				basicFlow };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_2_bindingFBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				packageDeclaration, useCase, basicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration,
					useCase, basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_2_bindingAndBlackFBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		Object[] result_pattern_UseCaseToInteractionRule_0_2_binding = pattern_UseCaseToInteractionRule_0_2_bindingFBBBBB(
				_this, match, packageDeclaration, useCase, basicFlow);
		if (result_pattern_UseCaseToInteractionRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_0_2_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_0_2_black = pattern_UseCaseToInteractionRule_0_2_blackB(csp);
			if (result_pattern_UseCaseToInteractionRule_0_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						useCase, basicFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCaseToInteractionRule_0_3_expressionFBB(
			UseCaseToInteractionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_4_blackBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow) {
		return new Object[] { match, packageDeclaration, useCase, basicFlow };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_4_greenBBBBFF(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(useCase);
		match.getToBeTranslatedNodes().add(basicFlow);
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String useCase__basicFlow____flows_name_prime = "flows";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getToBeTranslatedEdges().add(
				packageDeclaration__useCase____useCases);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		match.getToBeTranslatedEdges().add(useCase__basicFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { match, packageDeclaration, useCase, basicFlow,
				packageDeclaration__useCase____useCases,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_5_blackBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow) {
		return new Object[] { match, packageDeclaration, useCase, basicFlow };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_0_5_greenBB(
			Match match, PackageDeclaration packageDeclaration) {
		match.getContextNodes().add(packageDeclaration);
		return new Object[] { match, packageDeclaration };
	}

	public static final void pattern_UseCaseToInteractionRule_0_6_expressionBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		_this.registerObjectsToMatch_FWD(match, packageDeclaration, useCase,
				basicFlow);

	}

	public static final boolean pattern_UseCaseToInteractionRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCaseToInteractionRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("_package");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclarationToPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("basicFlow");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmp_package = _localVariable_1;
		EObject tmpPackageDeclarationToPackage = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpBasicFlow = _localVariable_4;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmp_package instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
				if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpBasicFlow instanceof BasicFlow) {
							BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
							return new Object[] { packageDeclaration, _package,
									packageDeclarationToPackage, useCase,
									basicFlow, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_1_blackBBBBBFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow,
			UseCaseToInteractionRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, useCase, basicFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_1_bindingAndBlackFFFFFFBB(
			UseCaseToInteractionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCaseToInteractionRule_1_1_binding = pattern_UseCaseToInteractionRule_1_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_UseCaseToInteractionRule_1_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCaseToInteractionRule_1_1_binding[0];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result_pattern_UseCaseToInteractionRule_1_1_binding[1];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result_pattern_UseCaseToInteractionRule_1_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_UseCaseToInteractionRule_1_1_binding[3];
			BasicFlow basicFlow = (BasicFlow) result_pattern_UseCaseToInteractionRule_1_1_binding[4];

			Object[] result_pattern_UseCaseToInteractionRule_1_1_black = pattern_UseCaseToInteractionRule_1_1_blackBBBBBFBB(
					packageDeclaration, _package, packageDeclarationToPackage,
					useCase, basicFlow, _this, isApplicableMatch);
			if (result_pattern_UseCaseToInteractionRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_1_1_black[5];

				return new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, useCase, basicFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_1_greenBBFFBFB(
			ModalSequenceDiagram.Package _package, UseCase useCase,
			BasicFlow basicFlow, CSP csp) {
		Interaction interaction = ModalSequenceDiagramFactory.eINSTANCE
				.createInteraction();
		UseCaseToInteraction useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToInteraction();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("interaction", "name");
		_package.getPackagedElement().add(interaction);
		useCaseToInteraction.setSource(useCase);
		useCaseToInteraction.setTarget(interaction);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		String interaction_name_prime = (String) _localVariable_0;
		interaction.setName(interaction_name_prime);
		return new Object[] { _package, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction, csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_2_blackBBBBB(
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		return new Object[] { useCase, interaction, useCaseToInteraction,
				basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_2_greenFBBBBB(
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(useCase);
		ruleresult.getCreatedElements().add(interaction);
		ruleresult.getCreatedLinkElements().add(useCaseToInteraction);
		ruleresult.getTranslatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(basicFlowToInteraction);
		return new Object[] { ruleresult, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_1_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject _package, EObject packageDeclarationToPackage,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		if (!packageDeclaration.equals(packageDeclarationToPackage)) {
			if (!packageDeclaration.equals(useCase)) {
				if (!packageDeclaration.equals(useCaseToInteraction)) {
					if (!_package.equals(packageDeclaration)) {
						if (!_package.equals(packageDeclarationToPackage)) {
							if (!_package.equals(useCase)) {
								if (!_package.equals(interaction)) {
									if (!_package.equals(useCaseToInteraction)) {
										if (!_package.equals(basicFlow)) {
											if (!_package
													.equals(basicFlowToInteraction)) {
												if (!packageDeclarationToPackage
														.equals(useCase)) {
													if (!packageDeclarationToPackage
															.equals(useCaseToInteraction)) {
														if (!useCase
																.equals(useCaseToInteraction)) {
															if (!interaction
																	.equals(packageDeclaration)) {
																if (!interaction
																		.equals(packageDeclarationToPackage)) {
																	if (!interaction
																			.equals(useCase)) {
																		if (!interaction
																				.equals(useCaseToInteraction)) {
																			if (!basicFlow
																					.equals(packageDeclaration)) {
																				if (!basicFlow
																						.equals(packageDeclarationToPackage)) {
																					if (!basicFlow
																							.equals(useCase)) {
																						if (!basicFlow
																								.equals(interaction)) {
																							if (!basicFlow
																									.equals(useCaseToInteraction)) {
																								if (!basicFlow
																										.equals(basicFlowToInteraction)) {
																									if (!basicFlowToInteraction
																											.equals(packageDeclaration)) {
																										if (!basicFlowToInteraction
																												.equals(packageDeclarationToPackage)) {
																											if (!basicFlowToInteraction
																													.equals(useCase)) {
																												if (!basicFlowToInteraction
																														.equals(interaction)) {
																													if (!basicFlowToInteraction
																															.equals(useCaseToInteraction)) {
																														return new Object[] {
																																ruleresult,
																																packageDeclaration,
																																_package,
																																packageDeclarationToPackage,
																																useCase,
																																interaction,
																																useCaseToInteraction,
																																basicFlow,
																																basicFlowToInteraction };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCaseToInteractionRule_1_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject _package, EObject useCase, EObject interaction,
			EObject useCaseToInteraction, EObject basicFlow,
			EObject basicFlowToInteraction) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__basicFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCaseToInteractionRule";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String useCase__basicFlow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String basicFlowToInteraction__basicFlow____source_name_prime = "source";
		String basicFlowToInteraction__interaction____target_name_prime = "target";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getTranslatedEdges().add(
				packageDeclaration__useCase____useCases);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				_package__interaction____packagedElement);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getTranslatedEdges().add(useCase__basicFlow____flows);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		ruleresult.getCreatedEdges().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				useCaseToInteraction__interaction____target);
		basicFlowToInteraction__basicFlow____source
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__basicFlow____source.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__basicFlow____source);
		basicFlowToInteraction__interaction____target
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__interaction____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		basicFlowToInteraction__basicFlow____source
				.setName(basicFlowToInteraction__basicFlow____source_name_prime);
		basicFlowToInteraction__interaction____target
				.setName(basicFlowToInteraction__interaction____target_name_prime);
		return new Object[] { ruleresult, packageDeclaration, _package,
				useCase, interaction, useCaseToInteraction, basicFlow,
				basicFlowToInteraction,
				packageDeclaration__useCase____useCases,
				_package__interaction____packagedElement,
				useCase__basicFlow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				basicFlowToInteraction__basicFlow____source,
				basicFlowToInteraction__interaction____target };
	}

	public static final void pattern_UseCaseToInteractionRule_1_5_expressionBBBBBBBBBB(
			UseCaseToInteractionRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		_this.registerObjects_FWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction);

	}

	public static final PerformRuleResult pattern_UseCaseToInteractionRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_1_bindingFB(
			UseCaseToInteractionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_1_blackFBB(
			EClass eClass, UseCaseToInteractionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_1_bindingAndBlackFFB(
			UseCaseToInteractionRule _this) {
		Object[] result_pattern_UseCaseToInteractionRule_2_1_binding = pattern_UseCaseToInteractionRule_2_1_bindingFB(_this);
		if (result_pattern_UseCaseToInteractionRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UseCaseToInteractionRule_2_1_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_2_1_black = pattern_UseCaseToInteractionRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UseCaseToInteractionRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UseCaseToInteractionRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UseCaseToInteractionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("basicFlow");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpBasicFlow = _localVariable_2;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpBasicFlow instanceof BasicFlow) {
					BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
					return new Object[] { packageDeclaration, useCase,
							basicFlow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_2_2_blackBFFBBB(
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						PackageDeclarationToPackage.class, "source")) {
			ModalSequenceDiagram.Package _package = packageDeclarationToPackage
					.getTarget();
			if (_package != null) {
				_result.add(new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, useCase, basicFlow, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_2_3_blackBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getUseCases().contains(useCase)) {
			if (packageDeclaration.equals(packageDeclarationToPackage
					.getSource())) {
				if (_package.equals(packageDeclarationToPackage.getTarget())) {
					if (useCase.getFlows().contains(basicFlow)) {
						_result.add(new Object[] { packageDeclaration,
								_package, packageDeclarationToPackage, useCase,
								basicFlow });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_3_greenBBBBBFFFFF(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage___package____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage___package____target_name_prime = "target";
		String useCase__basicFlow____flows_name_prime = "flows";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(basicFlow);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage___package____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage___package____target.setTrg(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage___package____target);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__basicFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage___package____target
				.setName(packageDeclarationToPackage___package____target_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage, useCase, basicFlow,
				isApplicableMatch, packageDeclaration__useCase____useCases,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage___package____target,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_4_bindingFBBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, basicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, _package, packageDeclarationToPackage,
					useCase, basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_4_bindingAndBlackFBBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {
		Object[] result_pattern_UseCaseToInteractionRule_2_4_binding = pattern_UseCaseToInteractionRule_2_4_bindingFBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, basicFlow);
		if (result_pattern_UseCaseToInteractionRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_2_4_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_2_4_black = pattern_UseCaseToInteractionRule_2_4_blackB(csp);
			if (result_pattern_UseCaseToInteractionRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, _package,
						packageDeclarationToPackage, useCase, basicFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCaseToInteractionRule_2_5_expressionFBB(
			UseCaseToInteractionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UseCaseToInteractionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UseCaseToInteractionRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_1_blackBBBB(
			UseCaseToInteractionRule _this, Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		return new Object[] { _this, match, _package, interaction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_2_bindingFBBBB(
			UseCaseToInteractionRule _this, Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				_package, interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, _package, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_2_bindingAndBlackFBBBB(
			UseCaseToInteractionRule _this, Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		Object[] result_pattern_UseCaseToInteractionRule_10_2_binding = pattern_UseCaseToInteractionRule_10_2_bindingFBBBB(
				_this, match, _package, interaction);
		if (result_pattern_UseCaseToInteractionRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_10_2_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_10_2_black = pattern_UseCaseToInteractionRule_10_2_blackB(csp);
			if (result_pattern_UseCaseToInteractionRule_10_2_black != null) {

				return new Object[] { csp, _this, match, _package, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCaseToInteractionRule_10_3_expressionFBB(
			UseCaseToInteractionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_4_blackBBB(
			Match match, ModalSequenceDiagram.Package _package,
			Interaction interaction) {
		return new Object[] { match, _package, interaction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_4_greenBBBF(
			Match match, ModalSequenceDiagram.Package _package,
			Interaction interaction) {
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(interaction);
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				_package__interaction____packagedElement);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		return new Object[] { match, _package, interaction,
				_package__interaction____packagedElement };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_5_blackBBB(
			Match match, ModalSequenceDiagram.Package _package,
			Interaction interaction) {
		return new Object[] { match, _package, interaction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_10_5_greenBB(
			Match match, ModalSequenceDiagram.Package _package) {
		match.getContextNodes().add(_package);
		return new Object[] { match, _package };
	}

	public static final void pattern_UseCaseToInteractionRule_10_6_expressionBBBB(
			UseCaseToInteractionRule _this, Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, _package, interaction);

	}

	public static final boolean pattern_UseCaseToInteractionRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCaseToInteractionRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("_package");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclarationToPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmp_package = _localVariable_1;
		EObject tmpPackageDeclarationToPackage = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmp_package instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
				if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						return new Object[] { packageDeclaration, _package,
								packageDeclarationToPackage, interaction,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_1_blackBBBBFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction, UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_1_bindingAndBlackFFFFFBB(
			UseCaseToInteractionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCaseToInteractionRule_11_1_binding = pattern_UseCaseToInteractionRule_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_UseCaseToInteractionRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCaseToInteractionRule_11_1_binding[0];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result_pattern_UseCaseToInteractionRule_11_1_binding[1];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result_pattern_UseCaseToInteractionRule_11_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_UseCaseToInteractionRule_11_1_binding[3];

			Object[] result_pattern_UseCaseToInteractionRule_11_1_black = pattern_UseCaseToInteractionRule_11_1_blackBBBBFBB(
					packageDeclaration, _package, packageDeclarationToPackage,
					interaction, _this, isApplicableMatch);
			if (result_pattern_UseCaseToInteractionRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_11_1_black[4];

				return new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_1_greenBFBFFFB(
			PackageDeclaration packageDeclaration, Interaction interaction,
			CSP csp) {
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		UseCaseToInteraction useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToInteraction();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("useCase", "name");
		packageDeclaration.getUseCases().add(useCase);
		useCaseToInteraction.setSource(useCase);
		useCaseToInteraction.setTarget(interaction);
		useCase.getFlows().add(basicFlow);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		String useCase_name_prime = (String) _localVariable_0;
		useCase.setName(useCase_name_prime);
		return new Object[] { packageDeclaration, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction, csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_2_blackBBBBB(
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		return new Object[] { useCase, interaction, useCaseToInteraction,
				basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_2_greenFBBBBB(
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(useCase);
		ruleresult.getTranslatedElements().add(interaction);
		ruleresult.getCreatedLinkElements().add(useCaseToInteraction);
		ruleresult.getCreatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(basicFlowToInteraction);
		return new Object[] { ruleresult, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_11_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject _package, EObject packageDeclarationToPackage,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		if (!packageDeclaration.equals(packageDeclarationToPackage)) {
			if (!packageDeclaration.equals(useCase)) {
				if (!packageDeclaration.equals(useCaseToInteraction)) {
					if (!_package.equals(packageDeclaration)) {
						if (!_package.equals(packageDeclarationToPackage)) {
							if (!_package.equals(useCase)) {
								if (!_package.equals(interaction)) {
									if (!_package.equals(useCaseToInteraction)) {
										if (!_package.equals(basicFlow)) {
											if (!_package
													.equals(basicFlowToInteraction)) {
												if (!packageDeclarationToPackage
														.equals(useCase)) {
													if (!packageDeclarationToPackage
															.equals(useCaseToInteraction)) {
														if (!useCase
																.equals(useCaseToInteraction)) {
															if (!interaction
																	.equals(packageDeclaration)) {
																if (!interaction
																		.equals(packageDeclarationToPackage)) {
																	if (!interaction
																			.equals(useCase)) {
																		if (!interaction
																				.equals(useCaseToInteraction)) {
																			if (!basicFlow
																					.equals(packageDeclaration)) {
																				if (!basicFlow
																						.equals(packageDeclarationToPackage)) {
																					if (!basicFlow
																							.equals(useCase)) {
																						if (!basicFlow
																								.equals(interaction)) {
																							if (!basicFlow
																									.equals(useCaseToInteraction)) {
																								if (!basicFlow
																										.equals(basicFlowToInteraction)) {
																									if (!basicFlowToInteraction
																											.equals(packageDeclaration)) {
																										if (!basicFlowToInteraction
																												.equals(packageDeclarationToPackage)) {
																											if (!basicFlowToInteraction
																													.equals(useCase)) {
																												if (!basicFlowToInteraction
																														.equals(interaction)) {
																													if (!basicFlowToInteraction
																															.equals(useCaseToInteraction)) {
																														return new Object[] {
																																ruleresult,
																																packageDeclaration,
																																_package,
																																packageDeclarationToPackage,
																																useCase,
																																interaction,
																																useCaseToInteraction,
																																basicFlow,
																																basicFlowToInteraction };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCaseToInteractionRule_11_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject _package, EObject useCase, EObject interaction,
			EObject useCaseToInteraction, EObject basicFlow,
			EObject basicFlowToInteraction) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__basicFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCaseToInteractionRule";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String useCase__basicFlow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String basicFlowToInteraction__basicFlow____source_name_prime = "source";
		String basicFlowToInteraction__interaction____target_name_prime = "target";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getCreatedEdges().add(
				packageDeclaration__useCase____useCases);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				_package__interaction____packagedElement);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(useCase__basicFlow____flows);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		ruleresult.getCreatedEdges().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				useCaseToInteraction__interaction____target);
		basicFlowToInteraction__basicFlow____source
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__basicFlow____source.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__basicFlow____source);
		basicFlowToInteraction__interaction____target
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__interaction____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		basicFlowToInteraction__basicFlow____source
				.setName(basicFlowToInteraction__basicFlow____source_name_prime);
		basicFlowToInteraction__interaction____target
				.setName(basicFlowToInteraction__interaction____target_name_prime);
		return new Object[] { ruleresult, packageDeclaration, _package,
				useCase, interaction, useCaseToInteraction, basicFlow,
				basicFlowToInteraction,
				packageDeclaration__useCase____useCases,
				_package__interaction____packagedElement,
				useCase__basicFlow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				basicFlowToInteraction__basicFlow____source,
				basicFlowToInteraction__interaction____target };
	}

	public static final void pattern_UseCaseToInteractionRule_11_5_expressionBBBBBBBBBB(
			UseCaseToInteractionRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		_this.registerObjects_BWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction);

	}

	public static final PerformRuleResult pattern_UseCaseToInteractionRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_1_bindingFB(
			UseCaseToInteractionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_1_blackFBB(
			EClass eClass, UseCaseToInteractionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_1_bindingAndBlackFFB(
			UseCaseToInteractionRule _this) {
		Object[] result_pattern_UseCaseToInteractionRule_12_1_binding = pattern_UseCaseToInteractionRule_12_1_bindingFB(_this);
		if (result_pattern_UseCaseToInteractionRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UseCaseToInteractionRule_12_1_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_12_1_black = pattern_UseCaseToInteractionRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UseCaseToInteractionRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UseCaseToInteractionRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UseCaseToInteractionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("_package");
		EObject _localVariable_1 = match.getObject("interaction");
		EObject tmp_package = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		if (tmp_package instanceof ModalSequenceDiagram.Package) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				return new Object[] { _package, interaction, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_12_2_blackFBFBB(
			ModalSequenceDiagram.Package _package, Interaction interaction,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(_package,
						PackageDeclarationToPackage.class, "target")) {
			PackageDeclaration packageDeclaration = packageDeclarationToPackage
					.getSource();
			if (packageDeclaration != null) {
				_result.add(new Object[] { packageDeclaration, _package,
						packageDeclarationToPackage, interaction, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_12_3_blackBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (_package.getPackagedElement().contains(interaction)) {
			if (packageDeclaration.equals(packageDeclarationToPackage
					.getSource())) {
				if (_package.equals(packageDeclarationToPackage.getTarget())) {
					_result.add(new Object[] { packageDeclaration, _package,
							packageDeclarationToPackage, interaction });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_3_greenBBBBFFFF(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage___package____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage___package____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage);
		isApplicableMatch.getAllContextElements().add(interaction);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				_package__interaction____packagedElement);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage___package____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage___package____target.setTrg(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage___package____target);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage___package____target
				.setName(packageDeclarationToPackage___package____target_name_prime);
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage, interaction, isApplicableMatch,
				_package__interaction____packagedElement,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage___package____target };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_4_bindingFBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, _package, packageDeclarationToPackage,
					interaction };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_4_bindingAndBlackFBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {
		Object[] result_pattern_UseCaseToInteractionRule_12_4_binding = pattern_UseCaseToInteractionRule_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, interaction);
		if (result_pattern_UseCaseToInteractionRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_12_4_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_12_4_black = pattern_UseCaseToInteractionRule_12_4_blackB(csp);
			if (result_pattern_UseCaseToInteractionRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, _package,
						packageDeclarationToPackage, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCaseToInteractionRule_12_5_expressionFBB(
			UseCaseToInteractionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UseCaseToInteractionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UseCaseToInteractionRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_1_bindingFB(
			UseCaseToInteractionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_1_blackFBB(
			EClass __eClass, UseCaseToInteractionRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_1_bindingAndBlackFFB(
			UseCaseToInteractionRule _this) {
		Object[] result_pattern_UseCaseToInteractionRule_20_1_binding = pattern_UseCaseToInteractionRule_20_1_bindingFB(_this);
		if (result_pattern_UseCaseToInteractionRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCaseToInteractionRule_20_1_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_20_1_black = pattern_UseCaseToInteractionRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCaseToInteractionRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCaseToInteractionRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_762379 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_762379)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_20_2_blackFFFB(
			EMoflonEdge _edge_useCases) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_useCases.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpUseCase = _edge_useCases.getTrg();
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (packageDeclaration.getUseCases().contains(useCase)) {
					if (pattern_UseCaseToInteractionRule_20_2_black_nac_0BB(
							useCase, packageDeclaration) == null) {
						for (Flow tmpBasicFlow : useCase.getFlows()) {
							if (tmpBasicFlow instanceof BasicFlow) {
								BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
								_result.add(new Object[] { packageDeclaration,
										useCase, basicFlow, _edge_useCases });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCaseToInteractionRule_20_3_expressionFBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, useCase, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCaseToInteractionRule_20_4_expressionFBB(
			UseCaseToInteractionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCaseToInteractionRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_1_bindingFB(
			UseCaseToInteractionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_1_blackFBB(
			EClass __eClass, UseCaseToInteractionRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_1_bindingAndBlackFFB(
			UseCaseToInteractionRule _this) {
		Object[] result_pattern_UseCaseToInteractionRule_21_1_binding = pattern_UseCaseToInteractionRule_21_1_bindingFB(_this);
		if (result_pattern_UseCaseToInteractionRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCaseToInteractionRule_21_1_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_21_1_black = pattern_UseCaseToInteractionRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCaseToInteractionRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCaseToInteractionRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_2_black_nac_0B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_265915 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_265915 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_265915)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_21_2_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmp_package = _edge_packagedElement.getSrc();
		if (tmp_package instanceof ModalSequenceDiagram.Package) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
			EObject tmpInteraction = _edge_packagedElement.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (_package.getPackagedElement().contains(interaction)) {
					if (pattern_UseCaseToInteractionRule_21_2_black_nac_0B(interaction) == null) {
						_result.add(new Object[] { _package, interaction,
								_edge_packagedElement });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCaseToInteractionRule_21_3_expressionFBBBB(
			UseCaseToInteractionRule _this, Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, _package,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCaseToInteractionRule_21_4_expressionFBB(
			UseCaseToInteractionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCaseToInteractionRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_1_bindingFB(
			UseCaseToInteractionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_1_blackFBB(
			EClass __eClass, UseCaseToInteractionRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_1_bindingAndBlackFFB(
			UseCaseToInteractionRule _this) {
		Object[] result_pattern_UseCaseToInteractionRule_22_1_binding = pattern_UseCaseToInteractionRule_22_1_bindingFB(_this);
		if (result_pattern_UseCaseToInteractionRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCaseToInteractionRule_22_1_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_22_1_black = pattern_UseCaseToInteractionRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCaseToInteractionRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCaseToInteractionRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_289102 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_289102)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_22_2_blackFFFB(
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
						if (pattern_UseCaseToInteractionRule_22_2_black_nac_0BB(
								useCase, packageDeclaration) == null) {
							_result.add(new Object[] { packageDeclaration,
									useCase, basicFlow, _edge_flows });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCaseToInteractionRule_22_3_expressionFBBBBB(
			UseCaseToInteractionRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, useCase, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCaseToInteractionRule_22_4_expressionFBB(
			UseCaseToInteractionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCaseToInteractionRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_1_blackB(
			UseCaseToInteractionRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		if (ruleResult.getCorrObjects().contains(packageDeclarationToPackage)) {
			return new Object[] { ruleResult, packageDeclarationToPackage };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			ModalSequenceDiagram.Package _package) {
		if (ruleResult.getTargetObjects().contains(_package)) {
			return new Object[] { ruleResult, _package };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCaseToInteractionRule_25_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList packageDeclarationToPackageList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpPackageDeclarationToPackage : packageDeclarationToPackageList
					.getEntryObjects()) {
				if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
					PackageDeclaration packageDeclaration = packageDeclarationToPackage
							.getSource();
					if (packageDeclaration != null) {
						ModalSequenceDiagram.Package _package = packageDeclarationToPackage
								.getTarget();
						if (_package != null) {
							if (pattern_UseCaseToInteractionRule_25_2_black_nac_1BB(
									ruleResult, packageDeclarationToPackage) == null) {
								if (pattern_UseCaseToInteractionRule_25_2_black_nac_0BB(
										ruleResult, packageDeclaration) == null) {
									if (pattern_UseCaseToInteractionRule_25_2_black_nac_2BB(
											ruleResult, _package) == null) {
										_result.add(new Object[] {
												packageDeclarationToPackageList,
												packageDeclaration,
												packageDeclarationToPackage,
												_package, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_UseCaseToInteractionRule_25_3_bindingFBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, _package, packageDeclarationToPackage,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_3_bindingAndBlackFBBBBBB(
			UseCaseToInteractionRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UseCaseToInteractionRule_25_3_binding = pattern_UseCaseToInteractionRule_25_3_bindingFBBBBBB(
				_this, isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult);
		if (result_pattern_UseCaseToInteractionRule_25_3_binding != null) {
			CSP csp = (CSP) result_pattern_UseCaseToInteractionRule_25_3_binding[0];

			Object[] result_pattern_UseCaseToInteractionRule_25_3_black = pattern_UseCaseToInteractionRule_25_3_blackB(csp);
			if (result_pattern_UseCaseToInteractionRule_25_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, _package,
						packageDeclarationToPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCaseToInteractionRule_25_4_expressionFBB(
			UseCaseToInteractionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_5_blackBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_6_blackBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult };
	}

	public static final Object[] pattern_UseCaseToInteractionRule_25_6_greenBBFFFFFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		Interaction interaction = ModalSequenceDiagramFactory.eINSTANCE
				.createInteraction();
		UseCaseToInteraction useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToInteraction();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("useCase", "name");
		Object _localVariable_1 = csp.getValue("interaction", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		packageDeclaration.getUseCases().add(useCase);
		ruleResult.getSourceObjects().add(useCase);
		_package.getPackagedElement().add(interaction);
		ruleResult.getTargetObjects().add(interaction);
		useCaseToInteraction.setSource(useCase);
		useCaseToInteraction.setTarget(interaction);
		ruleResult.getCorrObjects().add(useCaseToInteraction);
		useCase.getFlows().add(basicFlow);
		ruleResult.getSourceObjects().add(basicFlow);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		ruleResult.getCorrObjects().add(basicFlowToInteraction);
		String useCase_name_prime = (String) _localVariable_0;
		String interaction_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		useCase.setName(useCase_name_prime);
		interaction.setName(interaction_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { packageDeclaration, _package, useCase,
				interaction, useCaseToInteraction, basicFlow,
				basicFlowToInteraction, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UseCaseToInteractionRule_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCaseToInteractionRuleImpl
