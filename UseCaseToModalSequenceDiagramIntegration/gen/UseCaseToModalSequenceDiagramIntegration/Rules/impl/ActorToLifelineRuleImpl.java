/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.Lifeline;
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

import UseCaseDSL.Actor;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Actor To Lifeline Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActorToLifelineRuleImpl extends AbstractRuleImpl implements
		ActorToLifelineRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorToLifelineRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getActorToLifelineRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		// initial bindings
		Object[] result1_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_0_1_blackBBBBB(this, match,
						packageDeclaration, actor, useCase);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_0_2_bindingAndBlackFBBBBB(this,
						match, packageDeclaration, actor, useCase);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_0_4_blackBBBB(match,
							packageDeclaration, actor, useCase);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ActorToLifelineRuleImpl.pattern_ActorToLifelineRule_0_4_greenBBBF(
					match, packageDeclaration, actor);
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_0_5_blackBBBB(match,
							packageDeclaration, actor, useCase);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ActorToLifelineRuleImpl.pattern_ActorToLifelineRule_0_5_greenBBBF(
					match, packageDeclaration, useCase);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[3];

			// register objects to match
			ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_0_6_expressionBBBBB(this,
							match, packageDeclaration, actor, useCase);
			return ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_0_7_expressionF();
		} else {
			return ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_bindingAndBlack[1];
		PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result1_bindingAndBlack[2];
		Actor actor = (Actor) result1_bindingAndBlack[3];
		UseCase useCase = (UseCase) result1_bindingAndBlack[4];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[5];
		Interaction interaction = (Interaction) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_1_greenBFFBB(actor, interaction,
						csp);
		Lifeline line = (Lifeline) result1_green[1];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[2];

		// collect translated elements
		Object[] result2_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_2_blackBBB(actor, line,
						actorToLine);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_2_greenFBBB(actor, line,
						actorToLine);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_3_blackBBBBBBBBBB(ruleresult,
						packageDeclaration, p, packageDeclarationToP, actor,
						line, actorToLine, useCase, useCaseToInteraction,
						interaction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_3_greenBBBBBBFFFFF(ruleresult,
						packageDeclaration, actor, line, actorToLine,
						interaction);
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[6];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[9];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_5_expressionBBBBBBBBBBB(this,
						ruleresult, packageDeclaration, p,
						packageDeclarationToP, actor, line, actorToLine,
						useCase, useCaseToInteraction, interaction);
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		Actor actor = (Actor) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_2_2_blackBFFBBFFB(
						packageDeclaration, actor, useCase, match)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[1];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_2_3_blackBBBBBBB(
							packageDeclaration, p, packageDeclarationToP,
							actor, useCase, useCaseToInteraction, interaction)) {
				Object[] result3_green = ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_2_3_greenBBBBBBBFFFFFFFF(
								packageDeclaration, p, packageDeclarationToP,
								actor, useCase, useCaseToInteraction,
								interaction);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[8];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[9];
				// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result3_green[10];
				// EMoflonEdge packageDeclarationToP__packageDeclaration____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge packageDeclarationToP__p____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_2_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration, p,
								packageDeclarationToP, actor, useCase,
								useCaseToInteraction, interaction);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("actor", actor);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {// Create CSP
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
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
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
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
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
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject actor, EObject line,
			EObject actorToLine, EObject useCase, EObject useCaseToInteraction,
			EObject interaction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
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
		Object[] result1_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_10_1_blackBBBBB(this, match, p,
						line, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_10_2_bindingAndBlackFBBBBB(this,
						match, p, line, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_4_blackBBBB(match, p, line,
							interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_4_greenBBBFF(match, line,
							interaction);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result4_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_5_blackBBBB(match, p, line,
							interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ActorToLifelineRuleImpl.pattern_ActorToLifelineRule_10_5_greenBBBF(
					match, p, interaction);
			// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result5_green[3];

			// register objects to match
			ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_6_expressionBBBBB(this,
							match, p, line, interaction);
			return ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_7_expressionF();
		} else {
			return ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result1_bindingAndBlack[1];
		PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result1_bindingAndBlack[2];
		Lifeline line = (Lifeline) result1_bindingAndBlack[3];
		UseCase useCase = (UseCase) result1_bindingAndBlack[4];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[5];
		Interaction interaction = (Interaction) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_1_greenBFBFB(
						packageDeclaration, line, csp);
		Actor actor = (Actor) result1_green[1];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[3];

		// collect translated elements
		Object[] result2_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_2_blackBBB(actor, line,
						actorToLine);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_2_greenFBBB(actor, line,
						actorToLine);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_3_blackBBBBBBBBBB(ruleresult,
						packageDeclaration, p, packageDeclarationToP, actor,
						line, actorToLine, useCase, useCaseToInteraction,
						interaction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_3_greenBBBBBBFFFFF(ruleresult,
						packageDeclaration, actor, line, actorToLine,
						interaction);
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[6];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[9];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_5_expressionBBBBBBBBBBB(this,
						ruleresult, packageDeclaration, p,
						packageDeclarationToP, actor, line, actorToLine,
						useCase, useCaseToInteraction, interaction);
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_binding[0];
		Lifeline line = (Lifeline) result2_binding[1];
		Interaction interaction = (Interaction) result2_binding[2];
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_12_2_blackFBFBFFBB(p, line,
						interaction, match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[2];
			UseCase useCase = (UseCase) result2_black[4];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_12_3_blackBBBBBBB(
							packageDeclaration, p, packageDeclarationToP, line,
							useCase, useCaseToInteraction, interaction)) {
				Object[] result3_green = ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_12_3_greenBBBBBBBFFFFFFFFF(
								packageDeclaration, p, packageDeclarationToP,
								line, useCase, useCaseToInteraction,
								interaction);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[8];
				// EMoflonEdge p__interaction____packagedElement = (EMoflonEdge) result3_green[9];
				// EMoflonEdge packageDeclarationToP__packageDeclaration____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge packageDeclarationToP__p____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[14];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration, p,
								packageDeclarationToP, line, useCase,
								useCaseToInteraction, interaction);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_12_7_expressionFB(ruleresult);
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
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", true, csp);
		var_line_name.setValue(line.getName());
		var_line_name.setType("String");

		// Create unbound variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_actor_name, var_line_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
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
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject actor, EObject line,
			EObject actorToLine, EObject useCase, EObject useCaseToInteraction,
			EObject interaction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_455(
			EMoflonEdge _edge_actors) {
		// prepare return value
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_20_2_blackFFFB(_edge_actors)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			Object[] result2_green = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_20_3_expressionFBBBBB(this,
							match, packageDeclaration, actor, useCase)) {
				// Ensure that the correct types of elements are matched
				if (ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_152(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_21_2_blackFFFB(_edge_interaction)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[0];
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			Object[] result2_green = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_21_3_expressionFBBBBB(this,
							match, p, line, interaction)) {
				// Ensure that the correct types of elements are matched
				if (ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_153(
			EMoflonEdge _edge_lifeline) {
		// prepare return value
		Object[] result1_bindingAndBlack = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_22_2_blackFFFB(_edge_lifeline)) {
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[0];
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			Object[] result2_green = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_22_3_expressionFBBBBB(this,
							match, p, line, interaction)) {
				// Ensure that the correct types of elements are matched
				if (ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_22_6_expressionFB(__result);
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
			UseCaseToInteraction useCaseToInteractionParameter) {
		// create result
		Object[] result1_black = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_25_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_25_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_25_2_blackFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCaseToInteractionList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result2_black[5];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_25_3_bindingAndBlackFBBBBBBBBB(
							this, isApplicableMatch, packageDeclaration, p,
							packageDeclarationToP, useCase,
							useCaseToInteraction, interaction, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ActorToLifelineRuleImpl
					.pattern_ActorToLifelineRule_25_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ActorToLifelineRuleImpl
						.pattern_ActorToLifelineRule_25_5_blackBBBBBB(
								packageDeclaration, p, packageDeclarationToP,
								useCase, useCaseToInteraction, interaction);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_25_6_blackBBBBBBB(
									packageDeclaration, p,
									packageDeclarationToP, useCase,
									useCaseToInteraction, interaction,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ActorToLifelineRuleImpl
							.pattern_ActorToLifelineRule_25_6_greenBFFFBBB(
									packageDeclaration, interaction,
									ruleResult, csp);
					// Actor actor = (Actor) result6_green[1];
					// Lifeline line = (Lifeline) result6_green[2];
					// ActorToLifeline actorToLine = (ActorToLifeline) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ActorToLifelineRuleImpl
				.pattern_ActorToLifelineRule_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
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
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
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
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (UseCase) arguments.get(3));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (UseCase) arguments.get(3));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (UseCase) arguments.get(3));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_ACTOR_USECASE_USECASETOINTERACTION_INTERACTION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Actor) arguments.get(4), (UseCase) arguments.get(5),
					(UseCaseToInteraction) arguments.get(6),
					(Interaction) arguments.get(7));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Lifeline) arguments.get(2), (Interaction) arguments.get(3));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_USECASE_USECASETOINTERACTION_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Lifeline) arguments.get(4), (UseCase) arguments.get(5),
					(UseCaseToInteraction) arguments.get(6),
					(Interaction) arguments.get(7));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_455__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_455((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_152__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_152((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_153((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_USECASETOINTERACTION_INTERACTION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4),
					(UseCaseToInteraction) arguments.get(5),
					(Interaction) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ActorToLifelineRule_0_1_blackBBBBB(
			ActorToLifelineRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		return new Object[] { _this, match, packageDeclaration, actor, useCase };
	}

	public static final Object[] pattern_ActorToLifelineRule_0_2_bindingFBBBBB(
			ActorToLifelineRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				packageDeclaration, actor, useCase);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration, actor,
					useCase };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_0_2_bindingAndBlackFBBBBB(
			ActorToLifelineRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		Object[] result_pattern_ActorToLifelineRule_0_2_binding = pattern_ActorToLifelineRule_0_2_bindingFBBBBB(
				_this, match, packageDeclaration, actor, useCase);
		if (result_pattern_ActorToLifelineRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ActorToLifelineRule_0_2_binding[0];

			Object[] result_pattern_ActorToLifelineRule_0_2_black = pattern_ActorToLifelineRule_0_2_blackB(csp);
			if (result_pattern_ActorToLifelineRule_0_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						actor, useCase };
			}
		}
		return null;
	}

	public static final boolean pattern_ActorToLifelineRule_0_3_expressionFBB(
			ActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_0_4_blackBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor actor,
			UseCase useCase) {
		return new Object[] { match, packageDeclaration, actor, useCase };
	}

	public static final Object[] pattern_ActorToLifelineRule_0_4_greenBBBF(
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

	public static final Object[] pattern_ActorToLifelineRule_0_5_blackBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor actor,
			UseCase useCase) {
		return new Object[] { match, packageDeclaration, actor, useCase };
	}

	public static final Object[] pattern_ActorToLifelineRule_0_5_greenBBBF(
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

	public static final void pattern_ActorToLifelineRule_0_6_expressionBBBBB(
			ActorToLifelineRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		_this.registerObjectsToMatch_FWD(match, packageDeclaration, actor,
				useCase);

	}

	public static final boolean pattern_ActorToLifelineRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ActorToLifelineRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclarationToP");
		EObject _localVariable_3 = isApplicableMatch.getObject("actor");
		EObject _localVariable_4 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_6 = isApplicableMatch.getObject("interaction");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpPackageDeclarationToP = _localVariable_2;
		EObject tmpActor = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpUseCaseToInteraction = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpP instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
				if (tmpPackageDeclarationToP instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) tmpPackageDeclarationToP;
					if (tmpActor instanceof Actor) {
						Actor actor = (Actor) tmpActor;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
								UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
									return new Object[] { packageDeclaration,
											p, packageDeclarationToP, actor,
											useCase, useCaseToInteraction,
											interaction, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_1_1_blackBBBBBBBFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction, ActorToLifelineRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, actor, useCase,
						useCaseToInteraction, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_1_1_bindingAndBlackFFFFFFFFBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ActorToLifelineRule_1_1_binding = pattern_ActorToLifelineRule_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_ActorToLifelineRule_1_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_ActorToLifelineRule_1_1_binding[0];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result_pattern_ActorToLifelineRule_1_1_binding[1];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result_pattern_ActorToLifelineRule_1_1_binding[2];
			Actor actor = (Actor) result_pattern_ActorToLifelineRule_1_1_binding[3];
			UseCase useCase = (UseCase) result_pattern_ActorToLifelineRule_1_1_binding[4];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_ActorToLifelineRule_1_1_binding[5];
			Interaction interaction = (Interaction) result_pattern_ActorToLifelineRule_1_1_binding[6];

			Object[] result_pattern_ActorToLifelineRule_1_1_black = pattern_ActorToLifelineRule_1_1_blackBBBBBBBFBB(
					packageDeclaration, p, packageDeclarationToP, actor,
					useCase, useCaseToInteraction, interaction, _this,
					isApplicableMatch);
			if (result_pattern_ActorToLifelineRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ActorToLifelineRule_1_1_black[7];

				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, actor, useCase,
						useCaseToInteraction, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_1_1_greenBFFBB(
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

	public static final Object[] pattern_ActorToLifelineRule_1_2_blackBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		return new Object[] { actor, line, actorToLine };
	}

	public static final Object[] pattern_ActorToLifelineRule_1_2_greenFBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(actor);
		ruleresult.getCreatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		return new Object[] { ruleresult, actor, line, actorToLine };
	}

	public static final Object[] pattern_ActorToLifelineRule_1_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject p, EObject packageDeclarationToP, EObject actor,
			EObject line, EObject actorToLine, EObject useCase,
			EObject useCaseToInteraction, EObject interaction) {
		if (!packageDeclaration.equals(packageDeclarationToP)) {
			if (!packageDeclaration.equals(useCase)) {
				if (!packageDeclaration.equals(useCaseToInteraction)) {
					if (!p.equals(packageDeclaration)) {
						if (!p.equals(packageDeclarationToP)) {
							if (!p.equals(useCase)) {
								if (!p.equals(useCaseToInteraction)) {
									if (!packageDeclarationToP.equals(useCase)) {
										if (!packageDeclarationToP
												.equals(useCaseToInteraction)) {
											if (!actor
													.equals(packageDeclaration)) {
												if (!actor.equals(p)) {
													if (!actor
															.equals(packageDeclarationToP)) {
														if (!actor.equals(line)) {
															if (!actor
																	.equals(actorToLine)) {
																if (!actor
																		.equals(useCase)) {
																	if (!actor
																			.equals(useCaseToInteraction)) {
																		if (!actor
																				.equals(interaction)) {
																			if (!line
																					.equals(packageDeclaration)) {
																				if (!line
																						.equals(p)) {
																					if (!line
																							.equals(packageDeclarationToP)) {
																						if (!line
																								.equals(useCase)) {
																							if (!line
																									.equals(useCaseToInteraction)) {
																								if (!actorToLine
																										.equals(packageDeclaration)) {
																									if (!actorToLine
																											.equals(p)) {
																										if (!actorToLine
																												.equals(packageDeclarationToP)) {
																											if (!actorToLine
																													.equals(line)) {
																												if (!actorToLine
																														.equals(useCase)) {
																													if (!actorToLine
																															.equals(useCaseToInteraction)) {
																														if (!actorToLine
																																.equals(interaction)) {
																															if (!useCase
																																	.equals(useCaseToInteraction)) {
																																if (!interaction
																																		.equals(packageDeclaration)) {
																																	if (!interaction
																																			.equals(p)) {
																																		if (!interaction
																																				.equals(packageDeclarationToP)) {
																																			if (!interaction
																																					.equals(line)) {
																																				if (!interaction
																																						.equals(useCase)) {
																																					if (!interaction
																																							.equals(useCaseToInteraction)) {
																																						return new Object[] {
																																								ruleresult,
																																								packageDeclaration,
																																								p,
																																								packageDeclarationToP,
																																								actor,
																																								line,
																																								actorToLine,
																																								useCase,
																																								useCaseToInteraction,
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
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ActorToLifelineRule_1_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject actor, EObject line, EObject actorToLine,
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
		String ruleresult_ruleName_prime = "ActorToLifelineRule";
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
		return new Object[] { ruleresult, packageDeclaration, actor, line,
				actorToLine, interaction, packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_ActorToLifelineRule_1_5_expressionBBBBBBBBBBB(
			ActorToLifelineRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject actor, EObject line,
			EObject actorToLine, EObject useCase, EObject useCaseToInteraction,
			EObject interaction) {
		_this.registerObjects_FWD(ruleresult, packageDeclaration, p,
				packageDeclarationToP, actor, line, actorToLine, useCase,
				useCaseToInteraction, interaction);

	}

	public static final PerformRuleResult pattern_ActorToLifelineRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_1_bindingFB(
			ActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_1_blackFBB(
			EClass eClass, ActorToLifelineRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_1_bindingAndBlackFFB(
			ActorToLifelineRule _this) {
		Object[] result_pattern_ActorToLifelineRule_2_1_binding = pattern_ActorToLifelineRule_2_1_bindingFB(_this);
		if (result_pattern_ActorToLifelineRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ActorToLifelineRule_2_1_binding[0];

			Object[] result_pattern_ActorToLifelineRule_2_1_black = pattern_ActorToLifelineRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ActorToLifelineRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ActorToLifelineRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ActorToLifelineRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ActorToLifelineRule_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("actor");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					return new Object[] { packageDeclaration, actor, useCase,
							match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_2_2_blackBFFBBFFB(
			PackageDeclaration packageDeclaration, Actor actor,
			UseCase useCase, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToP : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						PackageDeclarationToPackage.class, "source")) {
			ModalSequenceDiagram.Package p = packageDeclarationToP.getTarget();
			if (p != null) {
				for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(useCase,
								UseCaseToInteraction.class, "source")) {
					Interaction interaction = useCaseToInteraction.getTarget();
					if (interaction != null) {
						_result.add(new Object[] { packageDeclaration, p,
								packageDeclarationToP, actor, useCase,
								useCaseToInteraction, interaction, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_2_3_blackBBBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getActors().contains(actor)) {
			if (packageDeclaration.getUseCases().contains(useCase)) {
				if (p.getPackagedElement().contains(interaction)) {
					if (packageDeclaration.equals(packageDeclarationToP
							.getSource())) {
						if (p.equals(packageDeclarationToP.getTarget())) {
							if (useCase
									.equals(useCaseToInteraction.getSource())) {
								if (interaction.equals(useCaseToInteraction
										.getTarget())) {
									_result.add(new Object[] {
											packageDeclaration, p,
											packageDeclarationToP, actor,
											useCase, useCaseToInteraction,
											interaction });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_3_greenBBBBBBBFFFFFFFF(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge p__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String p__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToP__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToP__p____target_name_prime = "target";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(packageDeclarationToP);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(interaction);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
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
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		p__interaction____packagedElement
				.setName(p__interaction____packagedElement_name_prime);
		packageDeclarationToP__packageDeclaration____source
				.setName(packageDeclarationToP__packageDeclaration____source_name_prime);
		packageDeclarationToP__p____target
				.setName(packageDeclarationToP__p____target_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				actor, useCase, useCaseToInteraction, interaction,
				isApplicableMatch, packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases,
				p__interaction____packagedElement,
				packageDeclarationToP__packageDeclaration____source,
				packageDeclarationToP__p____target,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target };
	}

	public static final Object[] pattern_ActorToLifelineRule_2_4_bindingFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, actor, useCase, useCaseToInteraction,
				interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, p, packageDeclarationToP, actor,
					useCase, useCaseToInteraction, interaction };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_2_4_bindingAndBlackFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Actor actor,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		Object[] result_pattern_ActorToLifelineRule_2_4_binding = pattern_ActorToLifelineRule_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, actor, useCase, useCaseToInteraction,
				interaction);
		if (result_pattern_ActorToLifelineRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ActorToLifelineRule_2_4_binding[0];

			Object[] result_pattern_ActorToLifelineRule_2_4_black = pattern_ActorToLifelineRule_2_4_blackB(csp);
			if (result_pattern_ActorToLifelineRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, p, packageDeclarationToP, actor,
						useCase, useCaseToInteraction, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_ActorToLifelineRule_2_5_expressionFBB(
			ActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ActorToLifelineRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ActorToLifelineRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ActorToLifelineRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_10_1_blackBBBBB(
			ActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { _this, match, p, line, interaction };
	}

	public static final Object[] pattern_ActorToLifelineRule_10_2_bindingFBBBBB(
			ActorToLifelineRule _this, Match match,
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

	public static final Object[] pattern_ActorToLifelineRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_10_2_bindingAndBlackFBBBBB(
			ActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		Object[] result_pattern_ActorToLifelineRule_10_2_binding = pattern_ActorToLifelineRule_10_2_bindingFBBBBB(
				_this, match, p, line, interaction);
		if (result_pattern_ActorToLifelineRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ActorToLifelineRule_10_2_binding[0];

			Object[] result_pattern_ActorToLifelineRule_10_2_black = pattern_ActorToLifelineRule_10_2_blackB(csp);
			if (result_pattern_ActorToLifelineRule_10_2_black != null) {

				return new Object[] { csp, _this, match, p, line, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_ActorToLifelineRule_10_3_expressionFBB(
			ActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_10_4_blackBBBB(
			Match match, ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, p, line, interaction };
	}

	public static final Object[] pattern_ActorToLifelineRule_10_4_greenBBBFF(
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

	public static final Object[] pattern_ActorToLifelineRule_10_5_blackBBBB(
			Match match, ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, p, line, interaction };
	}

	public static final Object[] pattern_ActorToLifelineRule_10_5_greenBBBF(
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

	public static final void pattern_ActorToLifelineRule_10_6_expressionBBBBB(
			ActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, p, line, interaction);

	}

	public static final boolean pattern_ActorToLifelineRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ActorToLifelineRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclarationToP");
		EObject _localVariable_3 = isApplicableMatch.getObject("line");
		EObject _localVariable_4 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_6 = isApplicableMatch.getObject("interaction");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpPackageDeclarationToP = _localVariable_2;
		EObject tmpLine = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpUseCaseToInteraction = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpP instanceof ModalSequenceDiagram.Package) {
				ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) tmpP;
				if (tmpPackageDeclarationToP instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) tmpPackageDeclarationToP;
					if (tmpLine instanceof Lifeline) {
						Lifeline line = (Lifeline) tmpLine;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
								UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
									return new Object[] { packageDeclaration,
											p, packageDeclarationToP, line,
											useCase, useCaseToInteraction,
											interaction, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_11_1_blackBBBBBBBFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction, ActorToLifelineRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, line, useCase,
						useCaseToInteraction, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_11_1_bindingAndBlackFFFFFFFFBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ActorToLifelineRule_11_1_binding = pattern_ActorToLifelineRule_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_ActorToLifelineRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_ActorToLifelineRule_11_1_binding[0];
			ModalSequenceDiagram.Package p = (ModalSequenceDiagram.Package) result_pattern_ActorToLifelineRule_11_1_binding[1];
			PackageDeclarationToPackage packageDeclarationToP = (PackageDeclarationToPackage) result_pattern_ActorToLifelineRule_11_1_binding[2];
			Lifeline line = (Lifeline) result_pattern_ActorToLifelineRule_11_1_binding[3];
			UseCase useCase = (UseCase) result_pattern_ActorToLifelineRule_11_1_binding[4];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_ActorToLifelineRule_11_1_binding[5];
			Interaction interaction = (Interaction) result_pattern_ActorToLifelineRule_11_1_binding[6];

			Object[] result_pattern_ActorToLifelineRule_11_1_black = pattern_ActorToLifelineRule_11_1_blackBBBBBBBFBB(
					packageDeclaration, p, packageDeclarationToP, line,
					useCase, useCaseToInteraction, interaction, _this,
					isApplicableMatch);
			if (result_pattern_ActorToLifelineRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ActorToLifelineRule_11_1_black[7];

				return new Object[] { packageDeclaration, p,
						packageDeclarationToP, line, useCase,
						useCaseToInteraction, interaction, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_11_1_greenBFBFB(
			PackageDeclaration packageDeclaration, Lifeline line, CSP csp) {
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		Object _localVariable_0 = csp.getValue("actor", "name");
		packageDeclaration.getActors().add(actor);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		String actor_name_prime = (String) _localVariable_0;
		actor.setName(actor_name_prime);
		return new Object[] { packageDeclaration, actor, line, actorToLine, csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_11_2_blackBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		return new Object[] { actor, line, actorToLine };
	}

	public static final Object[] pattern_ActorToLifelineRule_11_2_greenFBBB(
			Actor actor, Lifeline line, ActorToLifeline actorToLine) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(actor);
		ruleresult.getTranslatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		return new Object[] { ruleresult, actor, line, actorToLine };
	}

	public static final Object[] pattern_ActorToLifelineRule_11_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject p, EObject packageDeclarationToP, EObject actor,
			EObject line, EObject actorToLine, EObject useCase,
			EObject useCaseToInteraction, EObject interaction) {
		if (!packageDeclaration.equals(packageDeclarationToP)) {
			if (!packageDeclaration.equals(useCase)) {
				if (!packageDeclaration.equals(useCaseToInteraction)) {
					if (!p.equals(packageDeclaration)) {
						if (!p.equals(packageDeclarationToP)) {
							if (!p.equals(useCase)) {
								if (!p.equals(useCaseToInteraction)) {
									if (!packageDeclarationToP.equals(useCase)) {
										if (!packageDeclarationToP
												.equals(useCaseToInteraction)) {
											if (!actor
													.equals(packageDeclaration)) {
												if (!actor.equals(p)) {
													if (!actor
															.equals(packageDeclarationToP)) {
														if (!actor.equals(line)) {
															if (!actor
																	.equals(actorToLine)) {
																if (!actor
																		.equals(useCase)) {
																	if (!actor
																			.equals(useCaseToInteraction)) {
																		if (!actor
																				.equals(interaction)) {
																			if (!line
																					.equals(packageDeclaration)) {
																				if (!line
																						.equals(p)) {
																					if (!line
																							.equals(packageDeclarationToP)) {
																						if (!line
																								.equals(useCase)) {
																							if (!line
																									.equals(useCaseToInteraction)) {
																								if (!actorToLine
																										.equals(packageDeclaration)) {
																									if (!actorToLine
																											.equals(p)) {
																										if (!actorToLine
																												.equals(packageDeclarationToP)) {
																											if (!actorToLine
																													.equals(line)) {
																												if (!actorToLine
																														.equals(useCase)) {
																													if (!actorToLine
																															.equals(useCaseToInteraction)) {
																														if (!actorToLine
																																.equals(interaction)) {
																															if (!useCase
																																	.equals(useCaseToInteraction)) {
																																if (!interaction
																																		.equals(packageDeclaration)) {
																																	if (!interaction
																																			.equals(p)) {
																																		if (!interaction
																																				.equals(packageDeclarationToP)) {
																																			if (!interaction
																																					.equals(line)) {
																																				if (!interaction
																																						.equals(useCase)) {
																																					if (!interaction
																																							.equals(useCaseToInteraction)) {
																																						return new Object[] {
																																								ruleresult,
																																								packageDeclaration,
																																								p,
																																								packageDeclarationToP,
																																								actor,
																																								line,
																																								actorToLine,
																																								useCase,
																																								useCaseToInteraction,
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
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ActorToLifelineRule_11_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject actor, EObject line, EObject actorToLine,
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
		String ruleresult_ruleName_prime = "ActorToLifelineRule";
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
		return new Object[] { ruleresult, packageDeclaration, actor, line,
				actorToLine, interaction, packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_ActorToLifelineRule_11_5_expressionBBBBBBBBBBB(
			ActorToLifelineRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToP, EObject actor, EObject line,
			EObject actorToLine, EObject useCase, EObject useCaseToInteraction,
			EObject interaction) {
		_this.registerObjects_BWD(ruleresult, packageDeclaration, p,
				packageDeclarationToP, actor, line, actorToLine, useCase,
				useCaseToInteraction, interaction);

	}

	public static final PerformRuleResult pattern_ActorToLifelineRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_1_bindingFB(
			ActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_1_blackFBB(
			EClass eClass, ActorToLifelineRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_1_bindingAndBlackFFB(
			ActorToLifelineRule _this) {
		Object[] result_pattern_ActorToLifelineRule_12_1_binding = pattern_ActorToLifelineRule_12_1_bindingFB(_this);
		if (result_pattern_ActorToLifelineRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ActorToLifelineRule_12_1_binding[0];

			Object[] result_pattern_ActorToLifelineRule_12_1_black = pattern_ActorToLifelineRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ActorToLifelineRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ActorToLifelineRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ActorToLifelineRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ActorToLifelineRule_12_2_bindingFFFB(
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

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_12_2_blackFBFBFFBB(
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToP : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(p,
						PackageDeclarationToPackage.class, "target")) {
			PackageDeclaration packageDeclaration = packageDeclarationToP
					.getSource();
			if (packageDeclaration != null) {
				for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(interaction,
								UseCaseToInteraction.class, "target")) {
					UseCase useCase = useCaseToInteraction.getSource();
					if (useCase != null) {
						_result.add(new Object[] { packageDeclaration, p,
								packageDeclarationToP, line, useCase,
								useCaseToInteraction, interaction, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_12_3_blackBBBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getUseCases().contains(useCase)) {
			if (p.getPackagedElement().contains(interaction)) {
				if (packageDeclaration
						.equals(packageDeclarationToP.getSource())) {
					if (p.equals(packageDeclarationToP.getTarget())) {
						if (useCase.equals(useCaseToInteraction.getSource())) {
							if (interaction.equals(useCaseToInteraction
									.getTarget())) {
								if (interaction.equals(line.getInteraction())) {
									_result.add(new Object[] {
											packageDeclaration, p,
											packageDeclarationToP, line,
											useCase, useCaseToInteraction,
											interaction });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_3_greenBBBBBBBFFFFFFFFF(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge p__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToP__p____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String p__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToP__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToP__p____target_name_prime = "target";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(packageDeclarationToP);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(interaction);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
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
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		p__interaction____packagedElement
				.setName(p__interaction____packagedElement_name_prime);
		packageDeclarationToP__packageDeclaration____source
				.setName(packageDeclarationToP__packageDeclaration____source_name_prime);
		packageDeclarationToP__p____target
				.setName(packageDeclarationToP__p____target_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				line, useCase, useCaseToInteraction, interaction,
				isApplicableMatch, packageDeclaration__useCase____useCases,
				p__interaction____packagedElement,
				packageDeclarationToP__packageDeclaration____source,
				packageDeclarationToP__p____target,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final Object[] pattern_ActorToLifelineRule_12_4_bindingFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, line, useCase, useCaseToInteraction,
				interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, p, packageDeclarationToP, line,
					useCase, useCaseToInteraction, interaction };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_12_4_bindingAndBlackFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction) {
		Object[] result_pattern_ActorToLifelineRule_12_4_binding = pattern_ActorToLifelineRule_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, line, useCase, useCaseToInteraction,
				interaction);
		if (result_pattern_ActorToLifelineRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ActorToLifelineRule_12_4_binding[0];

			Object[] result_pattern_ActorToLifelineRule_12_4_black = pattern_ActorToLifelineRule_12_4_blackB(csp);
			if (result_pattern_ActorToLifelineRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, p, packageDeclarationToP, line,
						useCase, useCaseToInteraction, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_ActorToLifelineRule_12_5_expressionFBB(
			ActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ActorToLifelineRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ActorToLifelineRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ActorToLifelineRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_1_bindingFB(
			ActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_1_blackFBB(
			EClass __eClass, ActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_1_bindingAndBlackFFB(
			ActorToLifelineRule _this) {
		Object[] result_pattern_ActorToLifelineRule_20_1_binding = pattern_ActorToLifelineRule_20_1_bindingFB(_this);
		if (result_pattern_ActorToLifelineRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ActorToLifelineRule_20_1_binding[0];

			Object[] result_pattern_ActorToLifelineRule_20_1_black = pattern_ActorToLifelineRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ActorToLifelineRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ActorToLifelineRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ActorToLifelineRule_20_2_black_nac_0BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_271690 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_271690)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_20_2_blackFFFB(
			EMoflonEdge _edge_actors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_actors.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpActor = _edge_actors.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (packageDeclaration.getActors().contains(actor)) {
					if (pattern_ActorToLifelineRule_20_2_black_nac_0BB(actor,
							packageDeclaration) == null) {
						for (UseCase useCase : packageDeclaration.getUseCases()) {
							_result.add(new Object[] { packageDeclaration,
									actor, useCase, _edge_actors });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ActorToLifelineRule_20_3_expressionFBBBBB(
			ActorToLifelineRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, actor, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ActorToLifelineRule_20_4_expressionFBB(
			ActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ActorToLifelineRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ActorToLifelineRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_21_1_bindingFB(
			ActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_21_1_blackFBB(
			EClass __eClass, ActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_21_1_bindingAndBlackFFB(
			ActorToLifelineRule _this) {
		Object[] result_pattern_ActorToLifelineRule_21_1_binding = pattern_ActorToLifelineRule_21_1_bindingFB(_this);
		if (result_pattern_ActorToLifelineRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ActorToLifelineRule_21_1_binding[0];

			Object[] result_pattern_ActorToLifelineRule_21_1_black = pattern_ActorToLifelineRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ActorToLifelineRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ActorToLifelineRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_21_2_blackFFFB(
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

	public static final Object[] pattern_ActorToLifelineRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ActorToLifelineRule_21_3_expressionFBBBBB(
			ActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, line,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ActorToLifelineRule_21_4_expressionFBB(
			ActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ActorToLifelineRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ActorToLifelineRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_22_1_bindingFB(
			ActorToLifelineRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_22_1_blackFBB(
			EClass __eClass, ActorToLifelineRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_22_1_bindingAndBlackFFB(
			ActorToLifelineRule _this) {
		Object[] result_pattern_ActorToLifelineRule_22_1_binding = pattern_ActorToLifelineRule_22_1_bindingFB(_this);
		if (result_pattern_ActorToLifelineRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ActorToLifelineRule_22_1_binding[0];

			Object[] result_pattern_ActorToLifelineRule_22_1_black = pattern_ActorToLifelineRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ActorToLifelineRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ActorToLifelineRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_22_2_blackFFFB(
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

	public static final Object[] pattern_ActorToLifelineRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ActorToLifelineRule_22_3_expressionFBBBBB(
			ActorToLifelineRule _this, Match match,
			ModalSequenceDiagram.Package p, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, line,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ActorToLifelineRule_22_4_expressionFBB(
			ActorToLifelineRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ActorToLifelineRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ActorToLifelineRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_1_blackB(
			ActorToLifelineRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ActorToLifelineRule_25_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ModalSequenceDiagram.Package p) {
		if (ruleResult.getTargetObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclarationToPackage packageDeclarationToP) {
		if (ruleResult.getCorrObjects().contains(packageDeclarationToP)) {
			return new Object[] { ruleResult, packageDeclarationToP };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ActorToLifelineRule_25_2_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList useCaseToInteractionList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpUseCaseToInteraction : useCaseToInteractionList
					.getEntryObjects()) {
				if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
					UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
					UseCase useCase = useCaseToInteraction.getSource();
					if (useCase != null) {
						Interaction interaction = useCaseToInteraction
								.getTarget();
						if (interaction != null) {
							if (pattern_ActorToLifelineRule_25_2_black_nac_2BB(
									ruleResult, useCaseToInteraction) == null) {
								if (pattern_ActorToLifelineRule_25_2_black_nac_1BB(
										ruleResult, useCase) == null) {
									if (pattern_ActorToLifelineRule_25_2_black_nac_3BB(
											ruleResult, interaction) == null) {
										for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														useCase,
														PackageDeclaration.class,
														"useCases")) {
											if (pattern_ActorToLifelineRule_25_2_black_nac_0BB(
													ruleResult,
													packageDeclaration) == null) {
												for (ModalSequenceDiagram.Package p : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																interaction,
																ModalSequenceDiagram.Package.class,
																"packagedElement")) {
													if (pattern_ActorToLifelineRule_25_2_black_nac_4BB(
															ruleResult, p) == null) {
														for (PackageDeclarationToPackage packageDeclarationToP : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		packageDeclaration,
																		PackageDeclarationToPackage.class,
																		"source")) {
															if (p.equals(packageDeclarationToP
																	.getTarget())) {
																if (pattern_ActorToLifelineRule_25_2_black_nac_5BB(
																		ruleResult,
																		packageDeclarationToP) == null) {
																	_result.add(new Object[] {
																			useCaseToInteractionList,
																			packageDeclaration,
																			useCase,
																			useCaseToInteraction,
																			interaction,
																			p,
																			packageDeclarationToP,
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
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_3_bindingFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, useCase, useCaseToInteraction,
				interaction, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, p, packageDeclarationToP, useCase,
					useCaseToInteraction, interaction, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ActorToLifelineRule_25_3_bindingAndBlackFBBBBBBBBB(
			ActorToLifelineRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ActorToLifelineRule_25_3_binding = pattern_ActorToLifelineRule_25_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, p,
				packageDeclarationToP, useCase, useCaseToInteraction,
				interaction, ruleResult);
		if (result_pattern_ActorToLifelineRule_25_3_binding != null) {
			CSP csp = (CSP) result_pattern_ActorToLifelineRule_25_3_binding[0];

			Object[] result_pattern_ActorToLifelineRule_25_3_black = pattern_ActorToLifelineRule_25_3_blackB(csp);
			if (result_pattern_ActorToLifelineRule_25_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, p, packageDeclarationToP, useCase,
						useCaseToInteraction, interaction, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ActorToLifelineRule_25_4_expressionFBB(
			ActorToLifelineRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ActorToLifelineRule_25_5_blackBBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction) {
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				useCase, useCaseToInteraction, interaction };
	}

	public static final Object[] pattern_ActorToLifelineRule_25_6_blackBBBBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package p,
			PackageDeclarationToPackage packageDeclarationToP, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { packageDeclaration, p, packageDeclarationToP,
				useCase, useCaseToInteraction, interaction, ruleResult };
	}

	public static final Object[] pattern_ActorToLifelineRule_25_6_greenBFFFBBB(
			PackageDeclaration packageDeclaration, Interaction interaction,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		Lifeline line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		Object _localVariable_0 = csp.getValue("actor", "name");
		Object _localVariable_1 = csp.getValue("line", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		packageDeclaration.getActors().add(actor);
		ruleResult.getSourceObjects().add(actor);
		line.setInteraction(interaction);
		ruleResult.getTargetObjects().add(line);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		ruleResult.getCorrObjects().add(actorToLine);
		String actor_name_prime = (String) _localVariable_0;
		String line_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		actor.setName(actor_name_prime);
		line.setName(line_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { packageDeclaration, actor, line, actorToLine,
				interaction, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ActorToLifelineRule_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ActorToLifelineRuleImpl
