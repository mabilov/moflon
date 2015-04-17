/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.PackageableElement;

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
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule;

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
 * An implementation of the model object '<em><b>User Actor To Lifeline Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserActorToLifelineRuleImpl extends AbstractRuleImpl implements
		UserActorToLifelineRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserActorToLifelineRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserActorToLifelineRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_0_1_blackBBBB(this, match,
						actor, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_0_2_bindingAndBlackFBBBB(this,
						match, actor, packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_4_blackBBB(match, actor,
							packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_4_greenBBBF(match,
							actor, packageDeclaration);
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_5_blackBBB(match, actor,
							packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_5_greenBB(match,
							packageDeclaration);

			// register objects to match
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_6_expressionBBBB(this,
							match, actor, packageDeclaration);
			return UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_7_expressionF();
		} else {
			return UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_1_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[1];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_bindingAndBlack[2];
		PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result1_bindingAndBlack[3];
		Interaction interaction = (Interaction) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_1_greenBFFBB(actor,
						interaction, csp);
		Lifeline line = (Lifeline) result1_green[1];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[2];

		// collect translated elements
		Object[] result2_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_2_blackBBB(actor, line,
						actorToLine);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_2_greenFBBB(actor, line,
						actorToLine);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_3_blackBBBBBBBB(ruleresult,
						actor, packageDeclaration, p, packageDeclarationToP,
						line, actorToLine, interaction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_3_greenBBBBBBFFFFF(
						ruleresult, actor, packageDeclaration, line,
						actorToLine, interaction);
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[6];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[9];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_5_expressionBBBBBBBBB(this,
						ruleresult, actor, packageDeclaration, p,
						packageDeclarationToP, line, actorToLine, interaction);
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[1];
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_2_2_blackBBFFB(actor,
						packageDeclaration, match)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[2];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_2_3_blackBBBBF(actor,
							packageDeclaration, p, packageDeclarationToP)) {
				Interaction interaction = (Interaction) result3_black[4];
				Object[] result3_green = UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_2_3_greenBBBBBFFFFF(
								actor, packageDeclaration, p,
								packageDeclarationToP, interaction);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[6];
				// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result3_green[7];
				// EMoflonEdge packageDeclarationToP__packageDeclaration____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge packageDeclarationToP__p____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_2_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, actor,
								packageDeclaration, p, packageDeclarationToP,
								interaction);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration) {// Create CSP
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
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("String");

		// Create unbound variables
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_actor_name, var_line_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("actor").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		// initial bindings
		Object[] result1_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_10_1_blackBBBBB(this, match,
						p, line, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_10_2_bindingAndBlackFBBBBB(
						this, match, p, line, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_4_blackBBBB(match, p,
							line, interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_4_greenBBBFF(match,
							line, interaction);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result4_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_5_blackBBBB(match, p,
							line, interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_5_greenBBBF(match, p,
							interaction);
			// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result5_green[3];

			// register objects to match
			UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_6_expressionBBBBB(this,
							match, p, line, interaction);
			return UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_7_expressionF();
		} else {
			return UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_1_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_bindingAndBlack[1];
		PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result1_bindingAndBlack[2];
		Lifeline line = (Lifeline) result1_bindingAndBlack[3];
		Interaction interaction = (Interaction) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_1_greenFBBFB(
						packageDeclaration, line, csp);
		Actor actor = (Actor) result1_green[0];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[3];

		// collect translated elements
		Object[] result2_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_2_blackBBB(actor, line,
						actorToLine);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_2_greenFBBB(actor, line,
						actorToLine);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_3_blackBBBBBBBB(ruleresult,
						actor, packageDeclaration, p, packageDeclarationToP,
						line, actorToLine, interaction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_3_greenBBBBBBFFFFF(
						ruleresult, actor, packageDeclaration, line,
						actorToLine, interaction);
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[6];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[9];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_5_expressionBBBBBBBBB(this,
						ruleresult, actor, packageDeclaration, p,
						packageDeclarationToP, line, actorToLine, interaction);
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_binding[0];
		Lifeline line = (Lifeline) result2_binding[1];
		Interaction interaction = (Interaction) result2_binding[2];
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_12_2_blackFBFBBB(p, line,
						interaction, match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_12_3_blackBBBBB(
							packageDeclaration, p, packageDeclarationToP, line,
							interaction)) {
				Object[] result3_green = UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_12_3_greenBBBBBFFFFFF(
								packageDeclaration, p, packageDeclarationToP,
								line, interaction);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result3_green[6];
				// EMoflonEdge packageDeclarationToP__packageDeclaration____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge packageDeclarationToP__p____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[9];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_12_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, packageDeclaration, p,
								packageDeclarationToP, line, interaction);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		match.registerObject("p", p);
		match.registerObject("line", line);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {// Create CSP
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
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");
		literal0.setType("");

		// Create attribute variables
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", true, csp);
		var_line_name.setValue(line.getName());
		var_line_name.setType("String");

		// Create unbound variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_actor_name, var_line_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("line", line);
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
			EObject actor, EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("line")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getLifeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_232(
			EMoflonEdge _edge_actors) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_20_2_blackFFB(_edge_actors)) {
			Actor actor = (Actor) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			Object[] result2_green = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_20_3_expressionFBBBB(this,
							match, actor, packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_74(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_21_2_blackFFFB(_edge_interaction)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[0];
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			Object[] result2_green = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_21_3_expressionFBBBBB(
							this, match, p, line, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_75(
			EMoflonEdge _edge_lifeline) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_22_2_blackFFFB(_edge_lifeline)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[0];
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			Object[] result2_green = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_22_3_expressionFBBBBB(
							this, match, p, line, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_22_6_expressionFB(__result);
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
			PackageDeclarationToPackage packageDeclarationToPParameter) {
		// create result
		Object[] result1_black = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_25_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_25_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_25_2_blackFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList packageDeclarationToPList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[2];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_25_3_bindingAndBlackFBBBBBBB(
							this, isApplicableMatch, packageDeclaration, p,
							packageDeclarationToP, interaction, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UserActorToLifelineRuleImpl
					.pattern_UserActorToLifelineRule_25_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = UserActorToLifelineRuleImpl
						.pattern_UserActorToLifelineRule_25_5_blackBBBB(
								packageDeclaration, p, packageDeclarationToP,
								interaction);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_25_6_blackBBBBB(
									packageDeclaration, p,
									packageDeclarationToP, interaction,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					UserActorToLifelineRuleImpl
							.pattern_UserActorToLifelineRule_25_6_greenFBFFBBB(
									packageDeclaration, interaction,
									ruleResult, csp);
					// Actor actor = (Actor) result6_green[0];
					// Lifeline line = (Lifeline) result6_green[2];
					// ActorToLifeline actorToLine = (ActorToLifeline) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return UserActorToLifelineRuleImpl
				.pattern_UserActorToLifelineRule_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_actor_name, var_line_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("interaction", interaction);
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
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
			return null;
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(ModalSequenceDiagram.Package) arguments.get(3),
					(PackageDeclarationToPackage) arguments.get(4),
					(Interaction) arguments.get(5));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
			return null;
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Lifeline) arguments.get(4), (Interaction) arguments.get(5));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_232__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_232((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_74((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_75((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(PackageDeclarationToPackage) arguments.get(1));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Interaction) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_1_blackBBBB(
			UserActorToLifelineRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, actor, packageDeclaration };
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_2_bindingFBBBB(
			UserActorToLifelineRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_2_bindingAndBlackFBBBB(
			UserActorToLifelineRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_UserActorToLifelineRule_0_2_binding = pattern_UserActorToLifelineRule_0_2_bindingFBBBB(
				_this, match, actor, packageDeclaration);
		if (result_pattern_UserActorToLifelineRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserActorToLifelineRule_0_2_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_0_2_black = pattern_UserActorToLifelineRule_0_2_blackB(csp);
			if (result_pattern_UserActorToLifelineRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor,
						packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_UserActorToLifelineRule_0_3_expressionFBB(
			UserActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_4_blackBBB(
			Match match, Actor actor, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, packageDeclaration };
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_4_greenBBBF(
			Match match, Actor actor, PackageDeclaration packageDeclaration) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(actor);
		String packageDeclaration__actor____actors_name_prime = "actors";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getToBeTranslatedEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		return new Object[] { match, actor, packageDeclaration,
				packageDeclaration__actor____actors };
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_5_blackBBB(
			Match match, Actor actor, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, packageDeclaration };
	}

	public static final Object[] pattern_UserActorToLifelineRule_0_5_greenBB(
			Match match, PackageDeclaration packageDeclaration) {
		match.getContextNodes().add(packageDeclaration);
		return new Object[] { match, packageDeclaration };
	}

	public static final void pattern_UserActorToLifelineRule_0_6_expressionBBBB(
			UserActorToLifelineRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, actor, packageDeclaration);

	}

	public static final boolean pattern_UserActorToLifelineRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserActorToLifelineRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("p");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("packageDeclarationToP");
		EObject _localVariable_4 = isApplicableMatch.getObject("interaction");
		EObject tmpActor = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpP = _localVariable_2;
		EObject tmpPackageDeclarationToP = _localVariable_3;
		EObject tmpInteraction = _localVariable_4;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpP instanceof ModalSequenceDiagram.Package) {
					ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
					if (tmpPackageDeclarationToP instanceof PackageDeclarationToPackage) {
						PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) tmpPackageDeclarationToP;
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							return new Object[] { actor, packageDeclaration, p,
									packageDeclarationToP, interaction,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_1_blackBBBBBFBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction, UserActorToLifelineRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { actor, packageDeclaration, p,
						packageDeclarationToP, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_1_bindingAndBlackFFFFFFBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserActorToLifelineRule_1_1_binding = pattern_UserActorToLifelineRule_1_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_UserActorToLifelineRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_UserActorToLifelineRule_1_1_binding[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserActorToLifelineRule_1_1_binding[1];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result_pattern_UserActorToLifelineRule_1_1_binding[2];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result_pattern_UserActorToLifelineRule_1_1_binding[3];
			Interaction interaction = (Interaction) result_pattern_UserActorToLifelineRule_1_1_binding[4];

			Object[] result_pattern_UserActorToLifelineRule_1_1_black = pattern_UserActorToLifelineRule_1_1_blackBBBBBFBB(
					actor, packageDeclaration, p, packageDeclarationToP,
					interaction, _this, isApplicableMatch);
			if (result_pattern_UserActorToLifelineRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UserActorToLifelineRule_1_1_black[5];

				return new Object[] { actor, packageDeclaration, p,
						packageDeclarationToP, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_1_greenBFFBB(
			Actor actor, Interaction interaction, CSP csp) {
		Lifeline line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		Object _localVariable_0 = csp.getValue("line", "name");
		line.setInteraction(interaction);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		String line_name_prime = (String) _localVariable_0;
		line.setName(line_name_prime);
		return new Object[] { actor, line, actorToLine, interaction, csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_2_blackBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		return new Object[] { actor, line, actorToLine };
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_2_greenFBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(actor);
		ruleresult.getCreatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		return new Object[] { ruleresult, actor, line, actorToLine };
	}

	public static final Object[] pattern_UserActorToLifelineRule_1_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		if (!actor.equals(packageDeclaration)) {
			if (!actor.equals(p)) {
				if (!actor.equals(packageDeclarationToP)) {
					if (!actor.equals(line)) {
						if (!actor.equals(actorToLine)) {
							if (!actor.equals(interaction)) {
								if (!packageDeclaration
										.equals(packageDeclarationToP)) {
									if (!p.equals(packageDeclaration)) {
										if (!p.equals(packageDeclarationToP)) {
											if (!line
													.equals(packageDeclaration)) {
												if (!line.equals(p)) {
													if (!line
															.equals(packageDeclarationToP)) {
														if (!actorToLine
																.equals(packageDeclaration)) {
															if (!actorToLine
																	.equals(p)) {
																if (!actorToLine
																		.equals(packageDeclarationToP)) {
																	if (!actorToLine
																			.equals(line)) {
																		if (!actorToLine
																				.equals(interaction)) {
																			if (!interaction
																					.equals(packageDeclaration)) {
																				if (!interaction
																						.equals(p)) {
																					if (!interaction
																							.equals(packageDeclarationToP)) {
																						if (!interaction
																								.equals(line)) {
																							return new Object[] {
																									ruleresult,
																									actor,
																									packageDeclaration,
																									p,
																									packageDeclarationToP,
																									line,
																									actorToLine,
																									interaction };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserActorToLifelineRule_1_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject interaction) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserActorToLifelineRule";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getTranslatedEdges()
				.add(packageDeclaration__actor____actors);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		ruleresult.getCreatedEdges().add(actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		ruleresult.getCreatedEdges().add(actorToLine__line____target);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		ruleresult.getCreatedEdges().add(interaction__line____lifeline);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { ruleresult, actor, packageDeclaration, line,
				actorToLine, interaction, packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_UserActorToLifelineRule_1_5_expressionBBBBBBBBB(
			UserActorToLifelineRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		_this.registerObjects_FWD(ruleresult, actor, packageDeclaration, p,
				packageDeclarationToP, line, actorToLine, interaction);

	}

	public static final PerformRuleResult pattern_UserActorToLifelineRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_1_bindingFB(
			UserActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_1_blackFBB(
			EClass eClass, UserActorToLifelineRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_1_bindingAndBlackFFB(
			UserActorToLifelineRule _this) {
		Object[] result_pattern_UserActorToLifelineRule_2_1_binding = pattern_UserActorToLifelineRule_2_1_bindingFB(_this);
		if (result_pattern_UserActorToLifelineRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserActorToLifelineRule_2_1_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_2_1_black = pattern_UserActorToLifelineRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserActorToLifelineRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserActorToLifelineRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserActorToLifelineRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				return new Object[] { actor, packageDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_2_2_blackBBFFB(
			Actor actor, PackageDeclaration packageDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToP : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						PackageDeclarationToPackage.class, "source")) {
			ModalSequenceDiagram.Package p = packageDeclarationToP.getTarget();
			if (p != null) {
				_result.add(new Object[] { actor, packageDeclaration, p,
						packageDeclarationToP, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_2_3_blackBBBBF(
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getActors().contains(actor)) {
			if (packageDeclaration.equals(packageDeclarationToP.getSource())) {
				if (p.equals(packageDeclarationToP.getTarget())) {
					for (PackageableElement tmpInteraction : p
							.getPackagedElement()) {
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							_result.add(new Object[] { actor,
									packageDeclaration, p,
									packageDeclarationToP, interaction });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_3_greenBBBBBFFFFF(
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge p__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__actor____actors_name_prime = "actors";
		String p__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToP__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToP__p____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(packageDeclarationToP);
		isApplicableMatch.getAllContextElements().add(interaction);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		p__interaction____packagedElement.setSrc(p);
		p__interaction____packagedElement.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				p__interaction____packagedElement);
		packageDeclarationToP__packageDeclaration____source
				.setSrc(packageDeclarationToP);
		packageDeclarationToP__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToP__packageDeclaration____source);
		packageDeclarationToP__p____target.setSrc(packageDeclarationToP);
		packageDeclarationToP__p____target.setTrg(p);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToP__p____target);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		p__interaction____packagedElement
				.setName(p__interaction____packagedElement_name_prime);
		packageDeclarationToP__packageDeclaration____source
				.setName(packageDeclarationToP__packageDeclaration____source_name_prime);
		packageDeclarationToP__p____target
				.setName(packageDeclarationToP__p____target_name_prime);
		return new Object[] { actor, packageDeclaration, p,
				packageDeclarationToP, interaction, isApplicableMatch,
				packageDeclaration__actor____actors,
				p__interaction____packagedElement,
				packageDeclarationToP__packageDeclaration____source,
				packageDeclarationToP__p____target };
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_4_bindingFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, packageDeclaration, p,
				packageDeclarationToP, interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					packageDeclaration, p, packageDeclarationToP, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_4_bindingAndBlackFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction) {
		Object[] result_pattern_UserActorToLifelineRule_2_4_binding = pattern_UserActorToLifelineRule_2_4_bindingFBBBBBBB(
				_this, isApplicableMatch, actor, packageDeclaration, p,
				packageDeclarationToP, interaction);
		if (result_pattern_UserActorToLifelineRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserActorToLifelineRule_2_4_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_2_4_black = pattern_UserActorToLifelineRule_2_4_blackB(csp);
			if (result_pattern_UserActorToLifelineRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						packageDeclaration, p, packageDeclarationToP,
						interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UserActorToLifelineRule_2_5_expressionFBB(
			UserActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserActorToLifelineRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserActorToLifelineRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserActorToLifelineRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_1_blackBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { _this, match, p, line, interaction };
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_2_bindingFBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, p, line,
				interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, line, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_2_bindingAndBlackFBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		Object[] result_pattern_UserActorToLifelineRule_10_2_binding = pattern_UserActorToLifelineRule_10_2_bindingFBBBBB(
				_this, match, p, line, interaction);
		if (result_pattern_UserActorToLifelineRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserActorToLifelineRule_10_2_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_10_2_black = pattern_UserActorToLifelineRule_10_2_blackB(csp);
			if (result_pattern_UserActorToLifelineRule_10_2_black != null) {

				return new Object[] { csp, _this, match, p, line, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UserActorToLifelineRule_10_3_expressionFBB(
			UserActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_4_blackBBBB(
			Match match, ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, p, line, interaction };
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_4_greenBBBFF(
			Match match, Lifeline line, Interaction interaction) {
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(line);
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getToBeTranslatedEdges().add(interaction__line____lifeline);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { match, line, interaction,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_5_blackBBBB(
			Match match, ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, p, line, interaction };
	}

	public static final Object[] pattern_UserActorToLifelineRule_10_5_greenBBBF(
			Match match, ModalSequenceDiagram.Package p, Interaction interaction) {
		EMoflonEdge p__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(p);
		match.getContextNodes().add(interaction);
		String p__interaction____packagedElement_name_prime = "packagedElement";
		p__interaction____packagedElement.setSrc(p);
		p__interaction____packagedElement.setTrg(interaction);
		match.getContextEdges().add(p__interaction____packagedElement);
		p__interaction____packagedElement
				.setName(p__interaction____packagedElement_name_prime);
		return new Object[] { match, p, interaction,
				p__interaction____packagedElement };
	}

	public static final void pattern_UserActorToLifelineRule_10_6_expressionBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, p, line, interaction);

	}

	public static final boolean pattern_UserActorToLifelineRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserActorToLifelineRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclarationToP");
		EObject _localVariable_3 = isApplicableMatch.getObject("line");
		EObject _localVariable_4 = isApplicableMatch.getObject("interaction");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpPackageDeclarationToP = _localVariable_2;
		EObject tmpLine = _localVariable_3;
		EObject tmpInteraction = _localVariable_4;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpP instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
				if (tmpPackageDeclarationToP instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) tmpPackageDeclarationToP;
					if (tmpLine instanceof Lifeline) {
						Lifeline line = (Lifeline) tmpLine;
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							return new Object[] { packageDeclaration, p,
									packageDeclarationToP, line, interaction,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_1_blackBBBBBFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction, UserActorToLifelineRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, line, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_1_bindingAndBlackFFFFFFBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserActorToLifelineRule_11_1_binding = pattern_UserActorToLifelineRule_11_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_UserActorToLifelineRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserActorToLifelineRule_11_1_binding[0];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result_pattern_UserActorToLifelineRule_11_1_binding[1];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result_pattern_UserActorToLifelineRule_11_1_binding[2];
			Lifeline line = (Lifeline) result_pattern_UserActorToLifelineRule_11_1_binding[3];
			Interaction interaction = (Interaction) result_pattern_UserActorToLifelineRule_11_1_binding[4];

			Object[] result_pattern_UserActorToLifelineRule_11_1_black = pattern_UserActorToLifelineRule_11_1_blackBBBBBFBB(
					packageDeclaration, p, packageDeclarationToP, line,
					interaction, _this, isApplicableMatch);
			if (result_pattern_UserActorToLifelineRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UserActorToLifelineRule_11_1_black[5];

				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, line, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_1_greenFBBFB(
			PackageDeclaration packageDeclaration, Lifeline line, CSP csp) {
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		Object _localVariable_0 = csp.getValue("actor", "type");
		Object _localVariable_1 = csp.getValue("actor", "name");
		packageDeclaration.getActors().add(actor);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		ActorType actor_type_prime = (ActorType) _localVariable_0;
		String actor_name_prime = (String) _localVariable_1;
		actor.setType(actor_type_prime);
		actor.setName(actor_name_prime);
		return new Object[] { actor, packageDeclaration, line, actorToLine, csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_2_blackBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		return new Object[] { actor, line, actorToLine };
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_2_greenFBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(actor);
		ruleresult.getTranslatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		return new Object[] { ruleresult, actor, line, actorToLine };
	}

	public static final Object[] pattern_UserActorToLifelineRule_11_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		if (!actor.equals(packageDeclaration)) {
			if (!actor.equals(p)) {
				if (!actor.equals(packageDeclarationToP)) {
					if (!actor.equals(line)) {
						if (!actor.equals(actorToLine)) {
							if (!actor.equals(interaction)) {
								if (!packageDeclaration
										.equals(packageDeclarationToP)) {
									if (!p.equals(packageDeclaration)) {
										if (!p.equals(packageDeclarationToP)) {
											if (!line
													.equals(packageDeclaration)) {
												if (!line.equals(p)) {
													if (!line
															.equals(packageDeclarationToP)) {
														if (!actorToLine
																.equals(packageDeclaration)) {
															if (!actorToLine
																	.equals(p)) {
																if (!actorToLine
																		.equals(packageDeclarationToP)) {
																	if (!actorToLine
																			.equals(line)) {
																		if (!actorToLine
																				.equals(interaction)) {
																			if (!interaction
																					.equals(packageDeclaration)) {
																				if (!interaction
																						.equals(p)) {
																					if (!interaction
																							.equals(packageDeclarationToP)) {
																						if (!interaction
																								.equals(line)) {
																							return new Object[] {
																									ruleresult,
																									actor,
																									packageDeclaration,
																									p,
																									packageDeclarationToP,
																									line,
																									actorToLine,
																									interaction };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserActorToLifelineRule_11_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject interaction) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserActorToLifelineRule";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getCreatedEdges().add(packageDeclaration__actor____actors);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		ruleresult.getCreatedEdges().add(actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		ruleresult.getCreatedEdges().add(actorToLine__line____target);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		ruleresult.getTranslatedEdges().add(interaction__line____lifeline);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { ruleresult, actor, packageDeclaration, line,
				actorToLine, interaction, packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_UserActorToLifelineRule_11_5_expressionBBBBBBBBB(
			UserActorToLifelineRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject line, EObject actorToLine,
			EObject interaction) {
		_this.registerObjects_BWD(ruleresult, actor, packageDeclaration, p,
				packageDeclarationToP, line, actorToLine, interaction);

	}

	public static final PerformRuleResult pattern_UserActorToLifelineRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_1_bindingFB(
			UserActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_1_blackFBB(
			EClass eClass, UserActorToLifelineRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_1_bindingAndBlackFFB(
			UserActorToLifelineRule _this) {
		Object[] result_pattern_UserActorToLifelineRule_12_1_binding = pattern_UserActorToLifelineRule_12_1_bindingFB(_this);
		if (result_pattern_UserActorToLifelineRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserActorToLifelineRule_12_1_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_12_1_black = pattern_UserActorToLifelineRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserActorToLifelineRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserActorToLifelineRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserActorToLifelineRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("line");
		EObject _localVariable_2 = match.getObject("interaction");
		EObject tmpP = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		if (tmpP instanceof ModalSequenceDiagram.Package) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					return new Object[] { p, line, interaction, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_12_2_blackFBFBBB(
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToP : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(p,
						PackageDeclarationToPackage.class, "target")) {
			PackageDeclaration packageDeclaration = packageDeclarationToP
					.getSource();
			if (packageDeclaration != null) {
				_result.add(new Object[] { packageDeclaration, p,
						packageDeclarationToP, line, interaction, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_12_3_blackBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (p.getPackagedElement().contains(interaction)) {
			if (packageDeclaration.equals(packageDeclarationToP.getSource())) {
				if (p.equals(packageDeclarationToP.getTarget())) {
					if (interaction.equals(line.getInteraction())) {
						_result.add(new Object[] { packageDeclaration, p,
								packageDeclarationToP, line, interaction });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_3_greenBBBBBFFFFFF(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge p__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String p__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToP__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToP__p____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(packageDeclarationToP);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(interaction);
		p__interaction____packagedElement.setSrc(p);
		p__interaction____packagedElement.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				p__interaction____packagedElement);
		packageDeclarationToP__packageDeclaration____source
				.setSrc(packageDeclarationToP);
		packageDeclarationToP__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToP__packageDeclaration____source);
		packageDeclarationToP__p____target.setSrc(packageDeclarationToP);
		packageDeclarationToP__p____target.setTrg(p);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToP__p____target);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		p__interaction____packagedElement
				.setName(p__interaction____packagedElement_name_prime);
		packageDeclarationToP__packageDeclaration____source
				.setName(packageDeclarationToP__packageDeclaration____source_name_prime);
		packageDeclarationToP__p____target
				.setName(packageDeclarationToP__p____target_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				line, interaction, isApplicableMatch,
				p__interaction____packagedElement,
				packageDeclarationToP__packageDeclaration____source,
				packageDeclarationToP__p____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_4_bindingFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, line, interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, p, packageDeclarationToP, line,
					interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_4_bindingAndBlackFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			Interaction interaction) {
		Object[] result_pattern_UserActorToLifelineRule_12_4_binding = pattern_UserActorToLifelineRule_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, line, interaction);
		if (result_pattern_UserActorToLifelineRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserActorToLifelineRule_12_4_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_12_4_black = pattern_UserActorToLifelineRule_12_4_blackB(csp);
			if (result_pattern_UserActorToLifelineRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, p, packageDeclarationToP, line,
						interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UserActorToLifelineRule_12_5_expressionFBB(
			UserActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserActorToLifelineRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserActorToLifelineRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserActorToLifelineRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_1_bindingFB(
			UserActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_1_blackFBB(
			EClass __eClass, UserActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_1_bindingAndBlackFFB(
			UserActorToLifelineRule _this) {
		Object[] result_pattern_UserActorToLifelineRule_20_1_binding = pattern_UserActorToLifelineRule_20_1_bindingFB(_this);
		if (result_pattern_UserActorToLifelineRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserActorToLifelineRule_20_1_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_20_1_black = pattern_UserActorToLifelineRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserActorToLifelineRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserActorToLifelineRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_2_black_nac_0BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_777329 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_777329)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_20_2_blackFFB(
			EMoflonEdge _edge_actors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_actors.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpActor = _edge_actors.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (packageDeclaration.getActors().contains(actor)) {
					if (pattern_UserActorToLifelineRule_20_2_black_nac_0BB(
							actor, packageDeclaration) == null) {
						_result.add(new Object[] { actor, packageDeclaration,
								_edge_actors });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserActorToLifelineRule_20_3_expressionFBBBB(
			UserActorToLifelineRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserActorToLifelineRule_20_4_expressionFBB(
			UserActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserActorToLifelineRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserActorToLifelineRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_1_bindingFB(
			UserActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_1_blackFBB(
			EClass __eClass, UserActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_1_bindingAndBlackFFB(
			UserActorToLifelineRule _this) {
		Object[] result_pattern_UserActorToLifelineRule_21_1_binding = pattern_UserActorToLifelineRule_21_1_bindingFB(_this);
		if (result_pattern_UserActorToLifelineRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserActorToLifelineRule_21_1_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_21_1_black = pattern_UserActorToLifelineRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserActorToLifelineRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserActorToLifelineRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_21_2_blackFFFB(
			EMoflonEdge _edge_interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_interaction.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpInteraction = _edge_interaction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(line.getInteraction())) {
					for (ModalSequenceDiagram.Package p : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(interaction,
									ModalSequenceDiagram.Package.class,
									"packagedElement")) {
						_result.add(new Object[] { p, line, interaction,
								_edge_interaction });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserActorToLifelineRule_21_3_expressionFBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, line,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserActorToLifelineRule_21_4_expressionFBB(
			UserActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserActorToLifelineRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserActorToLifelineRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_1_bindingFB(
			UserActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_1_blackFBB(
			EClass __eClass, UserActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_1_bindingAndBlackFFB(
			UserActorToLifelineRule _this) {
		Object[] result_pattern_UserActorToLifelineRule_22_1_binding = pattern_UserActorToLifelineRule_22_1_bindingFB(_this);
		if (result_pattern_UserActorToLifelineRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserActorToLifelineRule_22_1_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_22_1_black = pattern_UserActorToLifelineRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserActorToLifelineRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserActorToLifelineRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_22_2_blackFFFB(
			EMoflonEdge _edge_lifeline) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_lifeline.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpLine = _edge_lifeline.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (interaction.equals(line.getInteraction())) {
					for (ModalSequenceDiagram.Package p : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(interaction,
									ModalSequenceDiagram.Package.class,
									"packagedElement")) {
						_result.add(new Object[] { p, line, interaction,
								_edge_lifeline });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserActorToLifelineRule_22_3_expressionFBBBBB(
			UserActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, line,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserActorToLifelineRule_22_4_expressionFBB(
			UserActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserActorToLifelineRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserActorToLifelineRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_1_blackB(
			UserActorToLifelineRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclarationToPackage packageDeclarationToP) {
		if (ruleResult.getCorrObjects().contains(packageDeclarationToP)) {
			return new Object[] { ruleResult, packageDeclarationToP };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ModalSequenceDiagram.Package p) {
		if (ruleResult.getTargetObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserActorToLifelineRule_25_2_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList packageDeclarationToPList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpPackageDeclarationToP : packageDeclarationToPList
					.getEntryObjects()) {
				if (tmpPackageDeclarationToP instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) tmpPackageDeclarationToP;
					PackageDeclaration packageDeclaration = packageDeclarationToP
							.getSource();
					if (packageDeclaration != null) {
						ModalSequenceDiagram.Package p = packageDeclarationToP
								.getTarget();
						if (p != null) {
							if (pattern_UserActorToLifelineRule_25_2_black_nac_1BB(
									ruleResult, packageDeclarationToP) == null) {
								if (pattern_UserActorToLifelineRule_25_2_black_nac_0BB(
										ruleResult, packageDeclaration) == null) {
									if (pattern_UserActorToLifelineRule_25_2_black_nac_2BB(
											ruleResult, p) == null) {
										for (PackageableElement tmpInteraction : p
												.getPackagedElement()) {
											if (tmpInteraction instanceof Interaction) {
												Interaction interaction = (Interaction) tmpInteraction;
												if (pattern_UserActorToLifelineRule_25_2_black_nac_3BB(
														ruleResult, interaction) == null) {
													_result.add(new Object[] {
															packageDeclarationToPList,
															packageDeclaration,
															packageDeclarationToP,
															p, interaction,
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
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_3_bindingFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, interaction, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, p, packageDeclarationToP, interaction,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_3_bindingAndBlackFBBBBBBB(
			UserActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UserActorToLifelineRule_25_3_binding = pattern_UserActorToLifelineRule_25_3_bindingFBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, interaction, ruleResult);
		if (result_pattern_UserActorToLifelineRule_25_3_binding != null) {
			CSP csp = (CSP) result_pattern_UserActorToLifelineRule_25_3_binding[0];

			Object[] result_pattern_UserActorToLifelineRule_25_3_black = pattern_UserActorToLifelineRule_25_3_blackB(csp);
			if (result_pattern_UserActorToLifelineRule_25_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, p, packageDeclarationToP,
						interaction, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UserActorToLifelineRule_25_4_expressionFBB(
			UserActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_5_blackBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction) {
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				interaction };
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_6_blackBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP,
			Interaction interaction, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				interaction, ruleResult };
	}

	public static final Object[] pattern_UserActorToLifelineRule_25_6_greenFBFFBBB(
			PackageDeclaration packageDeclaration, Interaction interaction,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		Lifeline line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		Object _localVariable_0 = csp.getValue("actor", "type");
		Object _localVariable_1 = csp.getValue("actor", "name");
		Object _localVariable_2 = csp.getValue("line", "name");
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		packageDeclaration.getActors().add(actor);
		ruleResult.getSourceObjects().add(actor);
		line.setInteraction(interaction);
		ruleResult.getTargetObjects().add(line);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		ruleResult.getCorrObjects().add(actorToLine);
		ActorType actor_type_prime = (ActorType) _localVariable_0;
		String actor_name_prime = (String) _localVariable_1;
		String line_name_prime = (String) _localVariable_2;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		actor.setType(actor_type_prime);
		actor.setName(actor_name_prime);
		line.setName(line_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, packageDeclaration, line, actorToLine,
				interaction, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UserActorToLifelineRule_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserActorToLifelineRuleImpl
