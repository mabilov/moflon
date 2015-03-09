/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;
import UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel;

import de.upb.tools.sdm.*;

import java.lang.reflect.InvocationTargetException;

import java.util.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
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
			PackageDeclaration packageDeclaration, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match,
					packageDeclaration, actor));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor,
						"toBeTranslatedEdges");

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, packageDeclaration, actor);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		Interaction interaction = null;
		ModalSequenceDiagram.Package p = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToP = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		ActorToLifeline actorToLine = null;
		Lifeline line = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge actorToLine__source__actor = null;
		EMoflonEdge actorToLine__target__line = null;
		EMoflonEdge interaction__lifeline__line = null;
		EMoflonEdge line__interaction__interaction = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("p"));

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclarationToP"));

			// ensure correct type and really bound of object packageDeclarationToP
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToP = (PackageDeclarationToPackage) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object actorToLine
			actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createActorToLifeline();

			// create object line
			line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();

			// assign attribute line
			line.setName((java.lang.String) csp.getValue("line", "name"));

			// create link
			actorToLine.setSource(actor);

			// create link
			actorToLine.setTarget(line);

			// create link
			interaction.getLifeline().add(line);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToP is really bound
			JavaSDM.ensure(packageDeclarationToP != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects p and actor 
			JavaSDM.ensure(!p.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects packageDeclarationToP and actor 
			JavaSDM.ensure(!packageDeclarationToP.equals(actor));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects p and actorToLine 
			JavaSDM.ensure(!p.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects packageDeclarationToP and actorToLine 
			JavaSDM.ensure(!packageDeclarationToP.equals(actorToLine));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects p and interaction 
			JavaSDM.ensure(!p.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToP and interaction 
			JavaSDM.ensure(!packageDeclarationToP.equals(interaction));

			// check isomorphic binding between objects p and line 
			JavaSDM.ensure(!p.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects packageDeclarationToP and line 
			JavaSDM.ensure(!packageDeclarationToP.equals(line));

			// check isomorphic binding between objects packageDeclaration and p 
			JavaSDM.ensure(!packageDeclaration.equals(p));

			// check isomorphic binding between objects packageDeclarationToP and p 
			JavaSDM.ensure(!packageDeclarationToP.equals(p));

			// check isomorphic binding between objects packageDeclarationToP and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToP.equals(packageDeclaration));

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__lifeline__line
			interaction__lifeline__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__interaction__interaction
			line__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ActorToLifelineRule");
			// assign attribute __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor.setName("actors");
			// assign attribute actorToLine__source__actor
			actorToLine__source__actor.setName("source");
			// assign attribute actorToLine__target__line
			actorToLine__target__line.setName("target");
			// assign attribute line__interaction__interaction
			line__interaction__interaction.setName("interaction");
			// assign attribute interaction__lifeline__line
			interaction__lifeline__line.setName("lifeline");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__source__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__target__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__lifeline__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_actors_actor, "translatedEdges");

			// create link
			__packageDeclaration_actors_actor.setSrc(packageDeclaration);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			__packageDeclaration_actors_actor.setTrg(actor);

			// create link
			interaction__lifeline__line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			line__interaction__interaction.setSrc(line);

			// create link
			actorToLine__target__line.setSrc(actorToLine);

			// create link
			actorToLine__source__actor.setSrc(actorToLine);

			// create link
			line__interaction__interaction.setTrg(interaction);

			// create link
			interaction__lifeline__line.setSrc(interaction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, packageDeclaration, p,
				packageDeclarationToP, actor, line, actorToLine, interaction);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclarationToP_source_packageDeclaration = null;
		EMoflonEdge __packageDeclarationToP_target_p = null;
		EMoflonEdge __p_packagedElement_interaction = null;
		CSP csp = null;
		Iterator fujaba__IterPToInteraction = null;
		Interaction interaction = null;
		ModalSequenceDiagram.Package p = null;
		Iterator fujaba__IterPackageDeclarationToPackageDeclarationToP = null;
		PackageDeclarationToPackage packageDeclarationToP = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("ActorToLifelineRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from packageDeclaration to packageDeclarationToP
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToPackageDeclarationToP = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							packageDeclaration,
							PackageDeclarationToPackage.class, "source"))
					.iterator();

			while (fujaba__IterPackageDeclarationToPackageDeclarationToP
					.hasNext()) {
				try {
					packageDeclarationToP = (PackageDeclarationToPackage) fujaba__IterPackageDeclarationToPackageDeclarationToP
							.next();

					// check object packageDeclarationToP is really bound
					JavaSDM.ensure(packageDeclarationToP != null);
					// bind object
					p = packageDeclarationToP.getTarget();

					// check object p is really bound
					JavaSDM.ensure(p != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object p is really bound
						JavaSDM.ensure(p != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToP is really bound
						JavaSDM.ensure(packageDeclarationToP != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link source from packageDeclarationToP to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToP.getSource()));

						// check link target from packageDeclarationToP to p
						JavaSDM.ensure(p.equals(packageDeclarationToP
								.getTarget()));

						// iterate to-many link packagedElement from p to interaction
						fujaba__Success = false;

						fujaba__IterPToInteraction = new ArrayList(
								p.getPackagedElement()).iterator();

						while (fujaba__IterPToInteraction.hasNext()) {
							try {
								_TmpObject = fujaba__IterPToInteraction.next();

								// ensure correct type and really bound of object interaction
								JavaSDM.ensure(_TmpObject instanceof Interaction);
								interaction = (Interaction) _TmpObject;
								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclarationToP_source_packageDeclaration
								__packageDeclarationToP_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclarationToP_target_p
								__packageDeclarationToP_target_p = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __p_packagedElement_interaction
								__p_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor
										.setName("actors");
								// assign attribute __p_packagedElement_interaction
								__p_packagedElement_interaction
										.setName("packagedElement");
								// assign attribute __packageDeclarationToP_source_packageDeclaration
								__packageDeclarationToP_source_packageDeclaration
										.setName("source");
								// assign attribute __packageDeclarationToP_target_p
								__packageDeclarationToP_target_p
										.setName("target");

								// create link
								isApplicableMatch.getAllContextElements().add(
										packageDeclaration);

								// create link
								__packageDeclaration_actors_actor
										.setSrc(packageDeclaration);

								// create link
								__packageDeclarationToP_source_packageDeclaration
										.setTrg(packageDeclaration);

								// create link
								isApplicableMatch.getAllContextElements()
										.add(p);

								// create link
								__packageDeclarationToP_target_p.setTrg(p);

								// create link
								__p_packagedElement_interaction.setSrc(p);

								// create link
								__packageDeclarationToP_source_packageDeclaration
										.setSrc(packageDeclarationToP);

								// create link
								isApplicableMatch.getAllContextElements().add(
										packageDeclarationToP);

								// create link
								__packageDeclarationToP_target_p
										.setSrc(packageDeclarationToP);

								// create link
								__packageDeclaration_actors_actor.setTrg(actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								__p_packagedElement_interaction
										.setTrg(interaction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										interaction);

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__packageDeclaration_actors_actor,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__p_packagedElement_interaction,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__packageDeclarationToP_target_p,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__packageDeclarationToP_source_packageDeclaration,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch,
													packageDeclaration, p,
													packageDeclarationToP,
													actor, interaction));

									// ensure correct type and really bound of object csp
									JavaSDM.ensure(_TmpObject instanceof CSP);
									csp = (CSP) _TmpObject;
									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								// statement node 'check CSP'
								fujaba__Success = this
										.isApplicable_checkCsp_FWD(csp);
								if (fujaba__Success) {
									// story node 'add match to rule result'
									try {
										fujaba__Success = false;

										// check object isApplicableMatch is really bound
										JavaSDM.ensure(isApplicableMatch != null);
										// check object ruleresult is really bound
										JavaSDM.ensure(ruleresult != null);
										// assign attribute isApplicableMatch
										isApplicableMatch
												.setRuleName("ActorToLifelineRule");
										// assign attribute ruleresult
										ruleresult.setSuccess(true);

										// create link
										ruleresult.getIsApplicableMatch().add(
												isApplicableMatch);

										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

								} else {

								}

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}
						}
						JavaSDM.ensure(fujaba__Success);
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

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
			Interaction interaction) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("");

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
			EObject actorToLine, EObject interaction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("actor", actor);
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
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __p_packagedElement_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, p, line,
					interaction));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "toBeTranslatedEdges");

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// create object __p_packagedElement_interaction
				__p_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __p_packagedElement_interaction
				__p_packagedElement_interaction.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, p,
						"contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__p_packagedElement_interaction, "contextEdges");

				// create link
				__p_packagedElement_interaction.setSrc(p);

				// create link
				__p_packagedElement_interaction.setTrg(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, p, line, interaction);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Interaction interaction = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package p = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToP = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Actor actor = null;
		ActorToLifeline actorToLine = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge actorToLine__source__actor = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge packageDeclaration__actors__actor = null;
		EMoflonEdge actorToLine__target__line = null;
		EMoflonEdge __interaction_lifeline_line = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("p"));

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclarationToP"));

			// ensure correct type and really bound of object packageDeclarationToP
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToP = (PackageDeclarationToPackage) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object actor
			actor = UseCaseDSLFactory.eINSTANCE.createActor();

			// create object actorToLine
			actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createActorToLifeline();

			// assign attribute actor
			actor.setName((java.lang.String) csp.getValue("actor", "name"));

			// create link
			actorToLine.setTarget(line);

			// create link
			packageDeclaration.getActors().add(actor); // add link

			// create link
			actorToLine.setSource(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToP is really bound
			JavaSDM.ensure(packageDeclarationToP != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects p and actor 
			JavaSDM.ensure(!p.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects packageDeclarationToP and actor 
			JavaSDM.ensure(!packageDeclarationToP.equals(actor));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects p and actorToLine 
			JavaSDM.ensure(!p.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects packageDeclarationToP and actorToLine 
			JavaSDM.ensure(!packageDeclarationToP.equals(actorToLine));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects p and interaction 
			JavaSDM.ensure(!p.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToP and interaction 
			JavaSDM.ensure(!packageDeclarationToP.equals(interaction));

			// check isomorphic binding between objects p and line 
			JavaSDM.ensure(!p.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects packageDeclarationToP and line 
			JavaSDM.ensure(!packageDeclarationToP.equals(line));

			// check isomorphic binding between objects packageDeclaration and p 
			JavaSDM.ensure(!packageDeclaration.equals(p));

			// check isomorphic binding between objects packageDeclarationToP and p 
			JavaSDM.ensure(!packageDeclarationToP.equals(p));

			// check isomorphic binding between objects packageDeclarationToP and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToP.equals(packageDeclaration));

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_interaction_interaction
			__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__actors__actor
			packageDeclaration__actors__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_lifeline_line
			__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ActorToLifelineRule");
			// assign attribute packageDeclaration__actors__actor
			packageDeclaration__actors__actor.setName("actors");
			// assign attribute actorToLine__source__actor
			actorToLine__source__actor.setName("source");
			// assign attribute actorToLine__target__line
			actorToLine__target__line.setName("target");
			// assign attribute __line_interaction_interaction
			__line_interaction_interaction.setName("interaction");
			// assign attribute __interaction_lifeline_line
			__interaction_lifeline_line.setName("lifeline");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__source__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__actors__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__target__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_lifeline_line, "translatedEdges");

			// create link
			packageDeclaration__actors__actor.setSrc(packageDeclaration);

			// create link
			packageDeclaration__actors__actor.setTrg(actor);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			__line_interaction_interaction.setSrc(line);

			// create link
			__interaction_lifeline_line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			actorToLine__source__actor.setSrc(actorToLine);

			// create link
			actorToLine__target__line.setSrc(actorToLine);

			// create link
			__interaction_lifeline_line.setSrc(interaction);

			// create link
			__line_interaction_interaction.setTrg(interaction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, packageDeclaration, p,
				packageDeclarationToP, actor, line, actorToLine, interaction);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		Interaction interaction = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package p = null;
		EMoflonEdge __packageDeclarationToP_source_packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __p_packagedElement_interaction = null;
		EMoflonEdge __packageDeclarationToP_target_p = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__IterPToPackageDeclarationToP = null;
		PackageDeclarationToPackage packageDeclarationToP = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("ActorToLifelineRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (match.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (match.getObject("p"));

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from p to packageDeclarationToP
			fujaba__Success = false;

			fujaba__IterPToPackageDeclarationToP = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(p,
							PackageDeclarationToPackage.class, "target"))
					.iterator();

			while (fujaba__IterPToPackageDeclarationToP.hasNext()) {
				try {
					packageDeclarationToP = (PackageDeclarationToPackage) fujaba__IterPToPackageDeclarationToP
							.next();

					// check object packageDeclarationToP is really bound
					JavaSDM.ensure(packageDeclarationToP != null);
					// bind object
					packageDeclaration = packageDeclarationToP.getSource();

					// check object packageDeclaration is really bound
					JavaSDM.ensure(packageDeclaration != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object p is really bound
						JavaSDM.ensure(p != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToP is really bound
						JavaSDM.ensure(packageDeclarationToP != null);
						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link packagedElement from interaction to p
						JavaSDM.ensure(p.equals(interaction.eContainer()));

						// check link source from packageDeclarationToP to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToP.getSource()));

						// check link target from packageDeclarationToP to p
						JavaSDM.ensure(p.equals(packageDeclarationToP
								.getTarget()));

						// create object __packageDeclarationToP_source_packageDeclaration
						__packageDeclarationToP_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __p_packagedElement_interaction
						__p_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToP_target_p
						__packageDeclarationToP_target_p = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_lifeline_line
						__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_interaction_interaction
						__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __p_packagedElement_interaction
						__p_packagedElement_interaction
								.setName("packagedElement");
						// assign attribute __packageDeclarationToP_source_packageDeclaration
						__packageDeclarationToP_source_packageDeclaration
								.setName("source");
						// assign attribute __packageDeclarationToP_target_p
						__packageDeclarationToP_target_p.setName("target");
						// assign attribute __line_interaction_interaction
						__line_interaction_interaction.setName("interaction");
						// assign attribute __interaction_lifeline_line
						__interaction_lifeline_line.setName("lifeline");

						// create link
						__packageDeclarationToP_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(p);

						// create link
						__p_packagedElement_interaction.setSrc(p);

						// create link
						__packageDeclarationToP_target_p.setTrg(p);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToP);

						// create link
						__packageDeclarationToP_source_packageDeclaration
								.setSrc(packageDeclarationToP);

						// create link
						__packageDeclarationToP_target_p
								.setSrc(packageDeclarationToP);

						// create link
						isApplicableMatch.getAllContextElements().add(line);

						// create link
						__interaction_lifeline_line.setTrg(line);

						// create link
						__line_interaction_interaction.setSrc(line);

						// create link
						__line_interaction_interaction.setTrg(interaction);

						// create link
						__interaction_lifeline_line.setSrc(interaction);

						// create link
						isApplicableMatch.getAllContextElements().add(
								interaction);

						// create link
						__p_packagedElement_interaction.setTrg(interaction);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__p_packagedElement_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToP_target_p,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __interaction_lifeline_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__line_interaction_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__packageDeclarationToP_source_packageDeclaration,
										"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, packageDeclaration, p,
									packageDeclarationToP, line, interaction));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_BWD(csp);
						if (fujaba__Success) {
							// story node 'add match to rule result'
							try {
								fujaba__Success = false;

								// check object isApplicableMatch is really bound
								JavaSDM.ensure(isApplicableMatch != null);
								// check object ruleresult is really bound
								JavaSDM.ensure(ruleresult != null);
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("ActorToLifelineRule");
								// assign attribute ruleresult
								ruleresult.setSuccess(true);

								// create link
								ruleresult.getIsApplicableMatch().add(
										isApplicableMatch);

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
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
			Interaction interaction) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

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
			Interaction interaction) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", true, csp);
		var_line_name.setValue(line.getName());
		var_line_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("");

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
			EObject actorToLine, EObject interaction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToP",
				packageDeclarationToP);
		ruleresult.registerObject("actor", actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(
			EMoflonEdge _edge_actors) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_842423 = null;
		Match match = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_actors is really bound
			JavaSDM.ensure(_edge_actors != null);
			// bind object
			_TmpObject = _edge_actors.getSrc();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// bind object
			_TmpObject = _edge_actors.getTrg();

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;

			// check link actors from actor to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_actor_actors_842423 = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
							.eContainer() : null;

					// check object __DEC_actor_actors_842423 is really bound
					JavaSDM.ensure(__DEC_actor_actors_842423 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_actor_actors_842423.getActors()
							.contains(actor));

					// check isomorphic binding between objects __DEC_actor_actors_842423 and packageDeclaration 
					JavaSDM.ensure(!__DEC_actor_actors_842423
							.equals(packageDeclaration));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_actors is really bound
				JavaSDM.ensure(_edge_actors != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check link actors from actor to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

				// check link src from _edge_actors to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(_edge_actors.getSrc()));

				// check link trg from _edge_actors to actor
				JavaSDM.ensure(actor.equals(_edge_actors.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match,
						packageDeclaration, actor);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
					fujaba__Success = this.checkTypes_FWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;
		ModalSequenceDiagram.Package p = null;
		Interaction interaction = null;
		Lifeline line = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_interaction is really bound
			JavaSDM.ensure(_edge_interaction != null);
			// bind object
			_TmpObject = _edge_interaction.getSrc();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			_TmpObject = _edge_interaction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// bind object
			p = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object p is really bound
			JavaSDM.ensure(p != null);

			// check if contained via correct reference
			JavaSDM.ensure(p.getPackagedElement().contains(interaction));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check object _edge_interaction is really bound
				JavaSDM.ensure(_edge_interaction != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// check link lifeline from line to interaction
				JavaSDM.ensure(interaction.equals(line.getInteraction()));

				// check link packagedElement from interaction to p
				JavaSDM.ensure(p.equals(interaction.eContainer()));

				// check link src from _edge_interaction to line
				JavaSDM.ensure(line.equals(_edge_interaction.getSrc()));

				// check link trg from _edge_interaction to interaction
				JavaSDM.ensure(interaction.equals(_edge_interaction.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, p, line,
						interaction);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(
			EMoflonEdge _edge_lifeline) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package p = null;
		Interaction interaction = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_lifeline is really bound
			JavaSDM.ensure(_edge_lifeline != null);
			// bind object
			_TmpObject = _edge_lifeline.getSrc();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// bind object
			p = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object p is really bound
			JavaSDM.ensure(p != null);

			// check if contained via correct reference
			JavaSDM.ensure(p.getPackagedElement().contains(interaction));

			// bind object
			_TmpObject = _edge_lifeline.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// iterate to-many link trg from interaction to _edge_interaction
			fujaba__Success = false;

			fujaba__IterInteractionTo_edge_interaction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							interaction, EMoflonEdge.class, "trg")).iterator();

			while (fujaba__IterInteractionTo_edge_interaction.hasNext()) {
				try {
					_edge_interaction = (EMoflonEdge) fujaba__IterInteractionTo_edge_interaction
							.next();

					// check object _edge_interaction is really bound
					JavaSDM.ensure(_edge_interaction != null);
					// check isomorphic binding between objects _edge_lifeline and _edge_interaction 
					JavaSDM.ensure(!_edge_lifeline.equals(_edge_interaction));

					// check link src from _edge_interaction to line
					JavaSDM.ensure(line.equals(_edge_interaction.getSrc()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check object _edge_interaction is really bound
						JavaSDM.ensure(_edge_interaction != null);
						// check object _edge_lifeline is really bound
						JavaSDM.ensure(_edge_lifeline != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object p is really bound
						JavaSDM.ensure(p != null);
						// check isomorphic binding between objects _edge_lifeline and _edge_interaction 
						JavaSDM.ensure(!_edge_lifeline
								.equals(_edge_interaction));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link packagedElement from interaction to p
						JavaSDM.ensure(p.equals(interaction.eContainer()));

						// check link src from _edge_interaction to line
						JavaSDM.ensure(line.equals(_edge_interaction.getSrc()));

						// check link src from _edge_lifeline to interaction
						JavaSDM.ensure(interaction.equals(_edge_lifeline
								.getSrc()));

						// check link trg from _edge_interaction to interaction
						JavaSDM.ensure(interaction.equals(_edge_interaction
								.getTrg()));

						// check link trg from _edge_lifeline to line
						JavaSDM.ensure(line.equals(_edge_lifeline.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, p,
								line, interaction);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
							fujaba__Success = this.checkTypes_BWD(match);
							if (fujaba__Success) {
								// story node 'Add match to rule result'
								try {
									fujaba__Success = false;

									// check object __performOperation is really bound
									JavaSDM.ensure(__performOperation != null);
									// check object __result is really bound
									JavaSDM.ensure(__result != null);
									// check object match is really bound
									JavaSDM.ensure(match != null);

									// create link
									org.moflon.util.eMoflonEMFUtil
											.addOppositeReference(match,
													__performOperation,
													"isApplicableOperation");

									// create link
									__result.getContents().add(match);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

							} else {

							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
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
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_ACTOR_INTERACTION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Actor) arguments.get(4), (Interaction) arguments.get(5));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
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
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Lifeline) arguments.get(4), (Interaction) arguments.get(5));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ActorToLifelineRuleImpl
