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

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule;

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
 * An implementation of the model object '<em><b>Use Case Precond To Found Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UseCasePrecondToFoundMessageRuleImpl extends AbstractRuleImpl
		implements UseCasePrecondToFoundMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasePrecondToFoundMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUseCasePrecondToFoundMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, useCase,
					actor, packageDeclaration, basicFlow));

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
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_basicFlow
				__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __useCase_flows_basicFlow
				__useCase_flows_basicFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_basicFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						basicFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_basicFlow.setSrc(useCase);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__useCase_flows_basicFlow.setTrg(basicFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, useCase, actor,
					packageDeclaration, basicFlow);
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
		ModalSequenceDiagram.Package _package = null;
		Actor actor = null;
		BasicFlow basicFlow = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Lifeline line = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		ActorToLifeline actorToLine = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge interaction__lifeline__line = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge _package__packagedElement__interaction = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge actorToLine__target__line = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge line__interaction__interaction = null;
		EMoflonEdge actorToLine__source__actor = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("basicFlow"));

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("packageDeclarationToPackage"));

			// ensure correct type and really bound of object packageDeclarationToPackage
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToPackage = (PackageDeclarationToPackage) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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
			// create object message
			message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object interaction
			interaction = ModalSequenceDiagramFactory.eINSTANCE
					.createInteraction();

			// create object line
			line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();

			// create object basicFlowToInteraction
			basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object actorToLine
			actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createActorToLifeline();

			// assign attribute message
			message.setName((java.lang.String) csp.getValue("message", "name"));
			// assign attribute message
			message.setMessageKind((ModalSequenceDiagram.MessageKind) csp
					.getValue("message", "messageKind"));
			// assign attribute message
			message.setMessageSort((ModalSequenceDiagram.MessageSort) csp
					.getValue("message", "messageSort"));
			// assign attribute interaction
			interaction.setName((java.lang.String) csp.getValue("interaction",
					"name"));
			// assign attribute line
			line.setName((java.lang.String) csp.getValue("line", "name"));

			// create link
			basicFlowToInteraction.setSource(basicFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(message,
					messageReceive, "receiveEvent");

			// create link
			messageReceive.setMessage(message);

			// create link
			interaction.getMessage().add(message);

			// create link
			line.setInteraction(interaction);

			// create link
			messageReceive.setEnclosingInteraction(interaction);

			// create link
			_package.getPackagedElement().add(interaction);

			// create link
			basicFlowToInteraction.setTarget(interaction);

			// create link
			line.getCoveredBy().add(messageReceive);

			// create link
			actorToLine.setSource(actor);

			// create link
			actorToLine.setTarget(line);

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
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects actor and _package 
			JavaSDM.ensure(!actor.equals(_package));

			// check isomorphic binding between objects actorToLine and _package 
			JavaSDM.ensure(!actorToLine.equals(_package));

			// check isomorphic binding between objects basicFlow and _package 
			JavaSDM.ensure(!basicFlow.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and _package 
			JavaSDM.ensure(!basicFlowToInteraction.equals(_package));

			// check isomorphic binding between objects interaction and _package 
			JavaSDM.ensure(!interaction.equals(_package));

			// check isomorphic binding between objects line and _package 
			JavaSDM.ensure(!line.equals(_package));

			// check isomorphic binding between objects message and _package 
			JavaSDM.ensure(!message.equals(_package));

			// check isomorphic binding between objects messageReceive and _package 
			JavaSDM.ensure(!messageReceive.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects basicFlow and actor 
			JavaSDM.ensure(!basicFlow.equals(actor));

			// check isomorphic binding between objects basicFlowToInteraction and actor 
			JavaSDM.ensure(!basicFlowToInteraction.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects message and actor 
			JavaSDM.ensure(!message.equals(actor));

			// check isomorphic binding between objects messageReceive and actor 
			JavaSDM.ensure(!messageReceive.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects packageDeclarationToPackage and actor 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects basicFlow and actorToLine 
			JavaSDM.ensure(!basicFlow.equals(actorToLine));

			// check isomorphic binding between objects basicFlowToInteraction and actorToLine 
			JavaSDM.ensure(!basicFlowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects message and actorToLine 
			JavaSDM.ensure(!message.equals(actorToLine));

			// check isomorphic binding between objects messageReceive and actorToLine 
			JavaSDM.ensure(!messageReceive.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects packageDeclarationToPackage and actorToLine 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects basicFlowToInteraction and basicFlow 
			JavaSDM.ensure(!basicFlowToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlow 
			JavaSDM.ensure(!interaction.equals(basicFlow));

			// check isomorphic binding between objects line and basicFlow 
			JavaSDM.ensure(!line.equals(basicFlow));

			// check isomorphic binding between objects message and basicFlow 
			JavaSDM.ensure(!message.equals(basicFlow));

			// check isomorphic binding between objects messageReceive and basicFlow 
			JavaSDM.ensure(!messageReceive.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlow 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlowToInteraction 
			JavaSDM.ensure(!interaction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects line and basicFlowToInteraction 
			JavaSDM.ensure(!line.equals(basicFlowToInteraction));

			// check isomorphic binding between objects message and basicFlowToInteraction 
			JavaSDM.ensure(!message.equals(basicFlowToInteraction));

			// check isomorphic binding between objects messageReceive and basicFlowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCase and basicFlowToInteraction 
			JavaSDM.ensure(!useCase.equals(basicFlowToInteraction));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and interaction 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects message and line 
			JavaSDM.ensure(!message.equals(line));

			// check isomorphic binding between objects messageReceive and line 
			JavaSDM.ensure(!messageReceive.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects packageDeclarationToPackage and line 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects packageDeclarationToPackage and message 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and messageReceive 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// create object interaction__lifeline__line
			interaction__lifeline__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_basicFlow
			__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object _package__packagedElement__interaction
			_package__packagedElement__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__interaction__interaction
			line__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCasePrecondToFoundMessageRule");
			// assign attribute message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive.setName("receiveEvent");
			// assign attribute message__interaction__interaction
			message__interaction__interaction.setName("interaction");
			// assign attribute interaction__message__message
			interaction__message__message.setName("message");
			// assign attribute line__interaction__interaction
			line__interaction__interaction.setName("interaction");
			// assign attribute interaction__lifeline__line
			interaction__lifeline__line.setName("lifeline");
			// assign attribute messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction
					.setName("enclosingInteraction");
			// assign attribute interaction__fragment__messageReceive
			interaction__fragment__messageReceive.setName("fragment");
			// assign attribute messageReceive__message__message
			messageReceive__message__message.setName("message");
			// assign attribute __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase.setName("useCases");
			// assign attribute __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor.setName("actors");
			// assign attribute line__coveredBy__messageReceive
			line__coveredBy__messageReceive.setName("coveredBy");
			// assign attribute messageReceive__covered__line
			messageReceive__covered__line.setName("covered");
			// assign attribute actorToLine__source__actor
			actorToLine__source__actor.setName("source");
			// assign attribute actorToLine__target__line
			actorToLine__target__line.setName("target");
			// assign attribute _package__packagedElement__interaction
			_package__packagedElement__interaction.setName("packagedElement");
			// assign attribute __useCase_flows_basicFlow
			__useCase_flows_basicFlow.setName("flows");
			// assign attribute basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow.setName("source");
			// assign attribute basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__lifeline__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_basicFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_useCases_useCase, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					_package__packagedElement__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							basicFlowToInteraction__target__interaction,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__target__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_actors_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__source__actor, "createdEdges");

			// create link
			__useCase_flows_basicFlow.setSrc(useCase);

			// create link
			__packageDeclaration_useCases_useCase.setTrg(useCase);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			interaction__lifeline__line.setSrc(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			_package__packagedElement__interaction.setTrg(interaction);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			line__interaction__interaction.setTrg(interaction);

			// create link
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setSrc(messageReceive);

			// create link
			interaction__fragment__messageReceive.setTrg(messageReceive);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			__packageDeclaration_actors_actor.setTrg(actor);

			// create link
			__packageDeclaration_actors_actor.setSrc(packageDeclaration);

			// create link
			__packageDeclaration_useCases_useCase.setSrc(packageDeclaration);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			// create link
			line__interaction__interaction.setSrc(line);

			// create link
			interaction__lifeline__line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			actorToLine__target__line.setSrc(actorToLine);

			// create link
			actorToLine__source__actor.setSrc(actorToLine);

			// create link
			_package__packagedElement__interaction.setSrc(_package);

			// create link
			basicFlowToInteraction__source__basicFlow.setTrg(basicFlow);

			// create link
			__useCase_flows_basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__source__basicFlow
					.setSrc(basicFlowToInteraction);

			// create link
			basicFlowToInteraction__target__interaction
					.setSrc(basicFlowToInteraction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, useCase, message, interaction,
				messageReceive, actor, packageDeclaration, line, actorToLine,
				_package, packageDeclarationToPackage, basicFlow,
				basicFlowToInteraction);
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
		BasicFlow basicFlow = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		CSP csp = null;
		ModalSequenceDiagram.Package _package = null;
		Iterator fujaba__IterPackageDeclarationToPackageDeclarationToPackage = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;

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
			ruleresult.setRule("UseCasePrecondToFoundMessageRule");

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
			_TmpObject = (match.getObject("basicFlow"));

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;
			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from packageDeclaration to packageDeclarationToPackage
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToPackageDeclarationToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							packageDeclaration,
							PackageDeclarationToPackage.class, "source"))
					.iterator();

			while (fujaba__IterPackageDeclarationToPackageDeclarationToPackage
					.hasNext()) {
				try {
					packageDeclarationToPackage = (PackageDeclarationToPackage) fujaba__IterPackageDeclarationToPackageDeclarationToPackage
							.next();

					// check object packageDeclarationToPackage is really bound
					JavaSDM.ensure(packageDeclarationToPackage != null);
					// bind object
					_package = packageDeclarationToPackage.getTarget();

					// check object _package is really bound
					JavaSDM.ensure(_package != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link source from packageDeclarationToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToPackage.getSource()));

						// check link target from packageDeclarationToPackage to _package
						JavaSDM.ensure(_package
								.equals(packageDeclarationToPackage.getTarget()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_basicFlow
						__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclaration_actors_actor
						__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase
								.setName("useCases");
						// assign attribute __packageDeclaration_actors_actor
						__packageDeclaration_actors_actor.setName("actors");
						// assign attribute __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration
								.setName("source");
						// assign attribute __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package
								.setName("target");
						// assign attribute __useCase_flows_basicFlow
						__useCase_flows_basicFlow.setName("flows");

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__packageDeclaration_useCases_useCase.setTrg(useCase);

						// create link
						__useCase_flows_basicFlow.setSrc(useCase);

						// create link
						__packageDeclaration_actors_actor.setTrg(actor);

						// create link
						isApplicableMatch.getAllContextElements().add(actor);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__packageDeclaration_actors_actor
								.setSrc(packageDeclaration);

						// create link
						__packageDeclaration_useCases_useCase
								.setSrc(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements()
								.add(basicFlow);

						// create link
						__useCase_flows_basicFlow.setTrg(basicFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_actors_actor,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__packageDeclarationToPackage_source_packageDeclaration,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_useCases_useCase,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_basicFlow,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, useCase, actor,
									packageDeclaration, _package,
									packageDeclarationToPackage, basicFlow));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_FWD(csp);
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
										.setRuleName("UseCasePrecondToFoundMessageRule");
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
	public void registerObjectsToMatch_FWD(Match match, UseCase useCase,
			Actor actor, PackageDeclaration packageDeclaration,
			BasicFlow basicFlow) {
		match.registerObject("useCase", useCase);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("basicFlow", basicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Actor actor, PackageDeclaration packageDeclaration,
			BasicFlow basicFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("String");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("EObject");

		// Create explicit parameters

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
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("found");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("asynchSignal");
		literal1.setType("String");

		// Create attribute variables
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", true, csp);
		var_useCase_preConditions.setValue(useCase.getPreConditions());
		var_useCase_preConditions.setType("");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("EObject");
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("EObject");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq_0 = new Eq();
		EqMessageSort eqMessageSort = new EqMessageSort();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_preConditions, var_message_name);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal0);
		eq_0.setRuleName("");
		eq_0.solve(var_actor_name, var_line_name);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
		eq_1.setRuleName("");
		eq_1.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
				&& match.getObject("actor")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getActor())
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
	public boolean isAppropriate_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge __message_interaction_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, message,
					interaction, messageReceive, line, _package));

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

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object message is really bound
				JavaSDM.ensure(message != null);
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object ___package_packagedElement_interaction
				___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive.setName("receiveEvent");
				// assign attribute __message_interaction_interaction
				__message_interaction_interaction.setName("interaction");
				// assign attribute __interaction_message_message
				__interaction_message_message.setName("message");
				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");
				// assign attribute __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction
						.setName("enclosingInteraction");
				// assign attribute __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive.setName("fragment");
				// assign attribute __messageReceive_message_message
				__messageReceive_message_message.setName("message");
				// assign attribute __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive.setName("coveredBy");
				// assign attribute __messageReceive_covered_line
				__messageReceive_covered_line.setName("covered");
				// assign attribute ___package_packagedElement_interaction
				___package_packagedElement_interaction
						.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						___package_packagedElement_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				___package_packagedElement_interaction.setTrg(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				___package_packagedElement_interaction.setSrc(_package);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object message is really bound
				JavaSDM.ensure(message != null);
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						_package, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, message, interaction,
					messageReceive, line, _package);
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
		ModalSequenceDiagram.Package _package = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UseCase useCase = null;
		BasicFlow basicFlow = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		Actor actor = null;
		ActorToLifeline actorToLine = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge packageDeclaration__actors__actor = null;
		EMoflonEdge actorToLine__source__actor = null;
		EMoflonEdge actorToLine__target__line = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge useCase__flows__basicFlow = null;
		EMoflonEdge packageDeclaration__useCases__useCase = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("message"));

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("messageReceive"));

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("packageDeclarationToPackage"));

			// ensure correct type and really bound of object packageDeclarationToPackage
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToPackage = (PackageDeclarationToPackage) _TmpObject;
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
			// create object useCase
			useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();

			// create object basicFlow
			basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();

			// create object basicFlowToInteraction
			basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object actor
			actor = UseCaseDSLFactory.eINSTANCE.createActor();

			// create object actorToLine
			actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createActorToLifeline();

			// assign attribute useCase
			useCase.setPreConditions((java.lang.String) csp.getValue("useCase",
					"preConditions"));
			// assign attribute useCase
			useCase.setName((java.lang.String) csp.getValue("useCase", "name"));
			// assign attribute actor
			actor.setType((UseCaseDSL.ActorType) csp.getValue("actor", "type"));
			// assign attribute actor
			actor.setName((java.lang.String) csp.getValue("actor", "name"));

			// create link
			actorToLine.setTarget(line);

			// create link
			basicFlowToInteraction.setSource(basicFlow);

			// create link
			useCase.getFlows().add(basicFlow); // add link

			// create link
			packageDeclaration.getUseCases().add(useCase);

			// create link
			basicFlowToInteraction.setTarget(interaction);

			// create link
			packageDeclaration.getActors().add(actor);

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
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "createdElements");

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

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects actor and _package 
			JavaSDM.ensure(!actor.equals(_package));

			// check isomorphic binding between objects actorToLine and _package 
			JavaSDM.ensure(!actorToLine.equals(_package));

			// check isomorphic binding between objects basicFlow and _package 
			JavaSDM.ensure(!basicFlow.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and _package 
			JavaSDM.ensure(!basicFlowToInteraction.equals(_package));

			// check isomorphic binding between objects interaction and _package 
			JavaSDM.ensure(!interaction.equals(_package));

			// check isomorphic binding between objects line and _package 
			JavaSDM.ensure(!line.equals(_package));

			// check isomorphic binding between objects message and _package 
			JavaSDM.ensure(!message.equals(_package));

			// check isomorphic binding between objects messageReceive and _package 
			JavaSDM.ensure(!messageReceive.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects basicFlow and actor 
			JavaSDM.ensure(!basicFlow.equals(actor));

			// check isomorphic binding between objects basicFlowToInteraction and actor 
			JavaSDM.ensure(!basicFlowToInteraction.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects message and actor 
			JavaSDM.ensure(!message.equals(actor));

			// check isomorphic binding between objects messageReceive and actor 
			JavaSDM.ensure(!messageReceive.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects packageDeclarationToPackage and actor 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects basicFlow and actorToLine 
			JavaSDM.ensure(!basicFlow.equals(actorToLine));

			// check isomorphic binding between objects basicFlowToInteraction and actorToLine 
			JavaSDM.ensure(!basicFlowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects message and actorToLine 
			JavaSDM.ensure(!message.equals(actorToLine));

			// check isomorphic binding between objects messageReceive and actorToLine 
			JavaSDM.ensure(!messageReceive.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects packageDeclarationToPackage and actorToLine 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects basicFlowToInteraction and basicFlow 
			JavaSDM.ensure(!basicFlowToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlow 
			JavaSDM.ensure(!interaction.equals(basicFlow));

			// check isomorphic binding between objects line and basicFlow 
			JavaSDM.ensure(!line.equals(basicFlow));

			// check isomorphic binding between objects message and basicFlow 
			JavaSDM.ensure(!message.equals(basicFlow));

			// check isomorphic binding between objects messageReceive and basicFlow 
			JavaSDM.ensure(!messageReceive.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlow 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlowToInteraction 
			JavaSDM.ensure(!interaction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects line and basicFlowToInteraction 
			JavaSDM.ensure(!line.equals(basicFlowToInteraction));

			// check isomorphic binding between objects message and basicFlowToInteraction 
			JavaSDM.ensure(!message.equals(basicFlowToInteraction));

			// check isomorphic binding between objects messageReceive and basicFlowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCase and basicFlowToInteraction 
			JavaSDM.ensure(!useCase.equals(basicFlowToInteraction));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and interaction 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects message and line 
			JavaSDM.ensure(!message.equals(line));

			// check isomorphic binding between objects messageReceive and line 
			JavaSDM.ensure(!messageReceive.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects packageDeclarationToPackage and line 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects packageDeclarationToPackage and message 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and messageReceive 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_interaction_interaction
			__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_lifeline_line
			__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__actors__actor
			packageDeclaration__actors__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__basicFlow
			useCase__flows__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ___package_packagedElement_interaction
			___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCasePrecondToFoundMessageRule");
			// assign attribute __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive.setName("receiveEvent");
			// assign attribute __message_interaction_interaction
			__message_interaction_interaction.setName("interaction");
			// assign attribute __interaction_message_message
			__interaction_message_message.setName("message");
			// assign attribute __line_interaction_interaction
			__line_interaction_interaction.setName("interaction");
			// assign attribute __interaction_lifeline_line
			__interaction_lifeline_line.setName("lifeline");
			// assign attribute __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction
					.setName("enclosingInteraction");
			// assign attribute __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive.setName("fragment");
			// assign attribute __messageReceive_message_message
			__messageReceive_message_message.setName("message");
			// assign attribute packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase.setName("useCases");
			// assign attribute packageDeclaration__actors__actor
			packageDeclaration__actors__actor.setName("actors");
			// assign attribute __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive.setName("coveredBy");
			// assign attribute __messageReceive_covered_line
			__messageReceive_covered_line.setName("covered");
			// assign attribute actorToLine__source__actor
			actorToLine__source__actor.setName("source");
			// assign attribute actorToLine__target__line
			actorToLine__target__line.setName("target");
			// assign attribute ___package_packagedElement_interaction
			___package_packagedElement_interaction.setName("packagedElement");
			// assign attribute useCase__flows__basicFlow
			useCase__flows__basicFlow.setName("flows");
			// assign attribute basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow.setName("source");
			// assign attribute basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_lifeline_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__actors__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__source__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__target__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							basicFlowToInteraction__target__interaction,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__useCases__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					___package_packagedElement_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			packageDeclaration__useCases__useCase.setTrg(useCase);

			// create link
			useCase__flows__basicFlow.setSrc(useCase);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__line_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			___package_packagedElement_interaction.setTrg(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_lifeline_line.setSrc(interaction);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			packageDeclaration__actors__actor.setTrg(actor);

			// create link
			packageDeclaration__useCases__useCase.setSrc(packageDeclaration);

			// create link
			packageDeclaration__actors__actor.setSrc(packageDeclaration);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__interaction_lifeline_line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			__line_interaction_interaction.setSrc(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			actorToLine__target__line.setSrc(actorToLine);

			// create link
			actorToLine__source__actor.setSrc(actorToLine);

			// create link
			___package_packagedElement_interaction.setSrc(_package);

			// create link
			basicFlowToInteraction__source__basicFlow.setTrg(basicFlow);

			// create link
			useCase__flows__basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__target__interaction
					.setSrc(basicFlowToInteraction);

			// create link
			basicFlowToInteraction__source__basicFlow
					.setSrc(basicFlowToInteraction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, useCase, message, interaction,
				messageReceive, actor, packageDeclaration, line, actorToLine,
				_package, packageDeclarationToPackage, basicFlow,
				basicFlowToInteraction);
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
		ModalSequenceDiagram.Package _package = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __interaction_message_message = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__Iter_packageToPackageDeclarationToPackage = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;

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
			ruleresult.setRule("UseCasePrecondToFoundMessageRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (match.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (match.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (match.getObject("message"));

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;
			_TmpObject = (match.getObject("messageReceive"));

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from _package to packageDeclarationToPackage
			fujaba__Success = false;

			fujaba__Iter_packageToPackageDeclarationToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							_package, PackageDeclarationToPackage.class,
							"target")).iterator();

			while (fujaba__Iter_packageToPackageDeclarationToPackage.hasNext()) {
				try {
					packageDeclarationToPackage = (PackageDeclarationToPackage) fujaba__Iter_packageToPackageDeclarationToPackage
							.next();

					// check object packageDeclarationToPackage is really bound
					JavaSDM.ensure(packageDeclarationToPackage != null);
					// bind object
					packageDeclaration = packageDeclarationToPackage
							.getSource();

					// check object packageDeclaration is really bound
					JavaSDM.ensure(packageDeclaration != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link source from packageDeclarationToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToPackage.getSource()));

						// check link target from packageDeclarationToPackage to _package
						JavaSDM.ensure(_package
								.equals(packageDeclarationToPackage.getTarget()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object __message_receiveEvent_messageReceive
						__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_message_message
						__interaction_message_message = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __message_interaction_interaction
						__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __messageReceive_message_message
						__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_lifeline_line
						__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object ___package_packagedElement_interaction
						___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_interaction_interaction
						__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_fragment_messageReceive
						__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __messageReceive_enclosingInteraction_interaction
						__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __messageReceive_covered_line
						__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_coveredBy_messageReceive
						__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __message_receiveEvent_messageReceive
						__message_receiveEvent_messageReceive
								.setName("receiveEvent");
						// assign attribute __message_interaction_interaction
						__message_interaction_interaction
								.setName("interaction");
						// assign attribute __interaction_message_message
						__interaction_message_message.setName("message");
						// assign attribute __line_interaction_interaction
						__line_interaction_interaction.setName("interaction");
						// assign attribute __interaction_lifeline_line
						__interaction_lifeline_line.setName("lifeline");
						// assign attribute __messageReceive_enclosingInteraction_interaction
						__messageReceive_enclosingInteraction_interaction
								.setName("enclosingInteraction");
						// assign attribute __interaction_fragment_messageReceive
						__interaction_fragment_messageReceive
								.setName("fragment");
						// assign attribute __messageReceive_message_message
						__messageReceive_message_message.setName("message");
						// assign attribute __line_coveredBy_messageReceive
						__line_coveredBy_messageReceive.setName("coveredBy");
						// assign attribute __messageReceive_covered_line
						__messageReceive_covered_line.setName("covered");
						// assign attribute ___package_packagedElement_interaction
						___package_packagedElement_interaction
								.setName("packagedElement");
						// assign attribute __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration
								.setName("source");
						// assign attribute __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package
								.setName("target");

						// create link
						__message_receiveEvent_messageReceive.setSrc(message);

						// create link
						__interaction_message_message.setTrg(message);

						// create link
						isApplicableMatch.getAllContextElements().add(message);

						// create link
						__message_interaction_interaction.setSrc(message);

						// create link
						__messageReceive_message_message.setTrg(message);

						// create link
						__interaction_lifeline_line.setSrc(interaction);

						// create link
						isApplicableMatch.getAllContextElements().add(
								interaction);

						// create link
						__interaction_message_message.setSrc(interaction);

						// create link
						___package_packagedElement_interaction
								.setTrg(interaction);

						// create link
						__line_interaction_interaction.setTrg(interaction);

						// create link
						__interaction_fragment_messageReceive
								.setSrc(interaction);

						// create link
						__messageReceive_enclosingInteraction_interaction
								.setTrg(interaction);

						// create link
						__message_interaction_interaction.setTrg(interaction);

						// create link
						__messageReceive_message_message.setSrc(messageReceive);

						// create link
						__messageReceive_enclosingInteraction_interaction
								.setSrc(messageReceive);

						// create link
						__interaction_fragment_messageReceive
								.setTrg(messageReceive);

						// create link
						__message_receiveEvent_messageReceive
								.setTrg(messageReceive);

						// create link
						__messageReceive_covered_line.setSrc(messageReceive);

						// create link
						__line_coveredBy_messageReceive.setTrg(messageReceive);

						// create link
						isApplicableMatch.getAllContextElements().add(
								messageReceive);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__interaction_lifeline_line.setTrg(line);

						// create link
						__line_interaction_interaction.setSrc(line);

						// create link
						__messageReceive_covered_line.setTrg(line);

						// create link
						isApplicableMatch.getAllContextElements().add(line);

						// create link
						__line_coveredBy_messageReceive.setSrc(line);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						___package_packagedElement_interaction.setSrc(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__line_coveredBy_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__message_receiveEvent_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__line_interaction_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__messageReceive_covered_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __interaction_lifeline_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__interaction_message_message,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__packageDeclarationToPackage_source_packageDeclaration,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__interaction_fragment_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__messageReceive_message_message,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								___package_packagedElement_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__message_interaction_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__messageReceive_enclosingInteraction_interaction,
										"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, message, interaction,
									messageReceive, packageDeclaration, line,
									_package, packageDeclarationToPackage));

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
										.setRuleName("UseCasePrecondToFoundMessageRule");
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
	public void registerObjectsToMatch_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("_package", _package);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("found");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("asynchSignal");
		literal1.setType("String");

		// Create attribute variables
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", true, csp);
		var_message_messageKind.setValue(message.getMessageKind());
		var_message_messageKind.setType("EObject");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", true, csp);
		var_message_messageSort.setValue(message.getMessageSort());
		var_message_messageSort.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqMessageKind eqMessageKind = new EqMessageKind();
		EqMessageSort eqMessageSort = new EqMessageSort();

		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eqMessageSort);

		// Solve CSP
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal0);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
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
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("String");

		// Create attribute variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("");
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", true, csp);
		var_line_name.setValue(line.getName());
		var_line_name.setType("");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", true, csp);
		var_interaction_name.setValue(interaction.getName());
		var_interaction_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("EObject");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		EqActorType eqActorType = new EqActorType();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_preConditions, var_message_name);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq_0.setRuleName("");
		eq_0.solve(var_actor_name, var_line_name);
		eq_1.setRuleName("");
		eq_1.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("line", line);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
		return true
				&& match.getObject("message")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessage())
				&& match.getObject("interaction")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteraction())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("line")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getLifeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_79(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_750514 = null;
		MessageEnd __DEC_message_sendEvent_217671 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_673638 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_606034 = null;
		MessageEnd __DEC_message_message_606034 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_252671 = null;
		Message __DEC_messageReceive_receiveEvent_252671 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745937 = null;
		Message __DEC_messageReceive_sendEvent_745937 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Message message = null;

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

			// check object _edge_receiveEvent is really bound
			JavaSDM.ensure(_edge_receiveEvent != null);
			// bind object
			_TmpObject = _edge_receiveEvent.getSrc();

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link trg from _edge_receiveEvent to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_receiveEvent.getTrg()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_750514 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_750514 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_750514 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_750514 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_750514
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_217671 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_217671 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_217671 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_217671 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_217671
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_673638 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_673638 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_673638 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_673638
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_673638 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_673638
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_606034
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_606034 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_606034
											.hasNext()) {
								try {
									__DEC_message_message_606034 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_606034
											.next();

									// check object __DEC_message_message_606034 is really bound
									JavaSDM.ensure(__DEC_message_message_606034 != null);
									// check isomorphic binding between objects __DEC_message_message_606034 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_606034
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_252671
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_252671 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_252671
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_252671 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_252671
											.next();

									// check object __DEC_messageReceive_receiveEvent_252671 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_252671 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_252671 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_252671
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_745937
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745937 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745937
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_745937 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745937
											.next();

									// check object __DEC_messageReceive_sendEvent_745937 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_745937 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_745937 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_745937
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_receiveEvent is really bound
						JavaSDM.ensure(_edge_receiveEvent != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_receiveEvent to message
						JavaSDM.ensure(message.equals(_edge_receiveEvent
								.getSrc()));

						// check link trg from _edge_receiveEvent to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_receiveEvent
								.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_80(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_558669 = null;
		MessageEnd __DEC_message_sendEvent_956190 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_166098 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_718819 = null;
		MessageEnd __DEC_message_message_718819 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_368480 = null;
		Message __DEC_messageReceive_receiveEvent_368480 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827718 = null;
		Message __DEC_messageReceive_sendEvent_827718 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Message message = null;

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

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link trg from _edge_interaction to interaction
			JavaSDM.ensure(interaction.equals(_edge_interaction.getTrg()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_558669 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_558669 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_558669 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_558669 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_558669
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_956190 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_956190 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_956190 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_956190 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_956190
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_166098 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_166098 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_166098 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_166098
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_166098 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_166098
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_718819
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_718819 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_718819
											.hasNext()) {
								try {
									__DEC_message_message_718819 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_718819
											.next();

									// check object __DEC_message_message_718819 is really bound
									JavaSDM.ensure(__DEC_message_message_718819 != null);
									// check isomorphic binding between objects __DEC_message_message_718819 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_718819
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_368480
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_368480 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_368480
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_368480 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_368480
											.next();

									// check object __DEC_messageReceive_receiveEvent_368480 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_368480 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_368480 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_368480
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_827718
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827718 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827718
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_827718 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827718
											.next();

									// check object __DEC_messageReceive_sendEvent_827718 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_827718 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_827718 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_827718
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_interaction is really bound
						JavaSDM.ensure(_edge_interaction != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_interaction to message
						JavaSDM.ensure(message.equals(_edge_interaction
								.getSrc()));

						// check link trg from _edge_interaction to interaction
						JavaSDM.ensure(interaction.equals(_edge_interaction
								.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_81(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_701342 = null;
		MessageEnd __DEC_message_sendEvent_376818 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_911433 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_557998 = null;
		MessageEnd __DEC_message_message_557998 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_999653 = null;
		Message __DEC_messageReceive_receiveEvent_999653 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_25651 = null;
		Message __DEC_messageReceive_sendEvent_25651 = null;
		Match match = null;
		Iterator fujaba__IterMessageTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Message message = null;

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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getTrg();

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link src from _edge_message to interaction
			JavaSDM.ensure(interaction.equals(_edge_message.getSrc()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// iterate to-many link src from message to _edge_interaction
					fujaba__Success = false;

					fujaba__IterMessageTo_edge_interaction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(message,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterMessageTo_edge_interaction.hasNext()) {
						try {
							_edge_interaction = (EMoflonEdge) fujaba__IterMessageTo_edge_interaction
									.next();

							// check object _edge_interaction is really bound
							JavaSDM.ensure(_edge_interaction != null);
							// check isomorphic binding between objects _edge_message and _edge_interaction 
							JavaSDM.ensure(!_edge_message
									.equals(_edge_interaction));

							// check link trg from _edge_interaction to interaction
							JavaSDM.ensure(interaction.equals(_edge_interaction
									.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from interaction
								JavaSDM.ensure(interaction
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_enclosingInteraction_701342 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_701342 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_701342 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_701342 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_701342
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_message_sendEvent_376818 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_376818 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_376818 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_376818 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_376818
											.equals(messageReceive));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_packagedElement_911433 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_911433 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_911433 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_911433
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_911433 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_911433
											.equals(_package));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_557998
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_557998 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_557998
													.hasNext()) {
										try {
											__DEC_message_message_557998 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_557998
													.next();

											// check object __DEC_message_message_557998 is really bound
											JavaSDM.ensure(__DEC_message_message_557998 != null);
											// check isomorphic binding between objects __DEC_message_message_557998 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_557998
													.equals(messageReceive));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_999653
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_999653 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_999653
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_999653 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_999653
													.next();

											// check object __DEC_messageReceive_receiveEvent_999653 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_999653 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_999653 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_999653
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_25651
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_25651 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_25651
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_25651 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_25651
													.next();

											// check object __DEC_messageReceive_sendEvent_25651 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_25651 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_25651 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_25651
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check object _edge_interaction is really bound
								JavaSDM.ensure(_edge_interaction != null);
								// check object _edge_message is really bound
								JavaSDM.ensure(_edge_message != null);
								// check object _package is really bound
								JavaSDM.ensure(_package != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check isomorphic binding between objects _edge_message and _edge_interaction 
								JavaSDM.ensure(!_edge_message
										.equals(_edge_interaction));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link message from message to interaction
								JavaSDM.ensure(interaction.equals(message
										.getInteraction()));

								// check link message from messageReceive to message
								JavaSDM.ensure(message.equals(messageReceive
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link packagedElement from interaction to _package
								JavaSDM.ensure(_package.equals(interaction
										.eContainer()));

								// check link src from _edge_interaction to message
								JavaSDM.ensure(message.equals(_edge_interaction
										.getSrc()));

								// check link src from _edge_message to interaction
								JavaSDM.ensure(interaction.equals(_edge_message
										.getSrc()));

								// check link trg from _edge_interaction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_interaction.getTrg()));

								// check link trg from _edge_message to message
								JavaSDM.ensure(message.equals(_edge_message
										.getTrg()));

								// check link covered from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										message, interaction, messageReceive,
										line, _package);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_82(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_664633 = null;
		MessageEnd __DEC_message_sendEvent_511111 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_577423 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_728325 = null;
		MessageEnd __DEC_message_message_728325 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_376788 = null;
		Message __DEC_messageReceive_receiveEvent_376788 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367384 = null;
		Message __DEC_messageReceive_sendEvent_367384 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		ModalSequenceDiagram.Package _package = null;
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
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// iterate to-many link message from interaction to message
			fujaba__Success = false;

			fujaba__IterInteractionToMessage = new ArrayList(
					interaction.getMessage()).iterator();

			while (fujaba__IterInteractionToMessage.hasNext()) {
				try {
					message = (Message) fujaba__IterInteractionToMessage.next();

					// check object message is really bound
					JavaSDM.ensure(message != null);
					// bind object
					_TmpObject = message.getReceiveEvent();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link covered from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_664633 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_664633 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_664633 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_664633 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_664633
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_511111 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_511111 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_511111 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_511111 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_511111
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_577423 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_577423 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_577423 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_577423
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_577423 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_577423
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_728325
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_728325 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_728325
											.hasNext()) {
								try {
									__DEC_message_message_728325 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_728325
											.next();

									// check object __DEC_message_message_728325 is really bound
									JavaSDM.ensure(__DEC_message_message_728325 != null);
									// check isomorphic binding between objects __DEC_message_message_728325 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_728325
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_376788
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_376788 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_376788
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_376788 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_376788
											.next();

									// check object __DEC_messageReceive_receiveEvent_376788 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_376788 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_376788 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_376788
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_367384
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367384 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367384
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_367384 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367384
											.next();

									// check object __DEC_messageReceive_sendEvent_367384 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_367384 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_367384 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_367384
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_interaction is really bound
						JavaSDM.ensure(_edge_interaction != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_interaction to line
						JavaSDM.ensure(line.equals(_edge_interaction.getSrc()));

						// check link trg from _edge_interaction to interaction
						JavaSDM.ensure(interaction.equals(_edge_interaction
								.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(
			EMoflonEdge _edge_lifeline) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_708707 = null;
		MessageEnd __DEC_message_sendEvent_750377 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_317169 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_661548 = null;
		MessageEnd __DEC_message_message_661548 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_208641 = null;
		Message __DEC_messageReceive_receiveEvent_208641 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_20824 = null;
		Message __DEC_messageReceive_sendEvent_20824 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
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
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// bind object
			_TmpObject = _edge_lifeline.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// iterate to-many link message from interaction to message
			fujaba__Success = false;

			fujaba__IterInteractionToMessage = new ArrayList(
					interaction.getMessage()).iterator();

			while (fujaba__IterInteractionToMessage.hasNext()) {
				try {
					message = (Message) fujaba__IterInteractionToMessage.next();

					// check object message is really bound
					JavaSDM.ensure(message != null);
					// bind object
					_TmpObject = message.getReceiveEvent();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link covered from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link trg from interaction to _edge_interaction
					fujaba__Success = false;

					fujaba__IterInteractionTo_edge_interaction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(interaction,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterInteractionTo_edge_interaction.hasNext()) {
						try {
							_edge_interaction = (EMoflonEdge) fujaba__IterInteractionTo_edge_interaction
									.next();

							// check object _edge_interaction is really bound
							JavaSDM.ensure(_edge_interaction != null);
							// check isomorphic binding between objects _edge_lifeline and _edge_interaction 
							JavaSDM.ensure(!_edge_lifeline
									.equals(_edge_interaction));

							// check link src from _edge_interaction to line
							JavaSDM.ensure(line.equals(_edge_interaction
									.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from interaction
								JavaSDM.ensure(interaction
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_enclosingInteraction_708707 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_708707 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_708707 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_708707 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_708707
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_message_sendEvent_750377 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_750377 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_750377 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_750377 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_750377
											.equals(messageReceive));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_packagedElement_317169 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_317169 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_317169 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_317169
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_317169 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_317169
											.equals(_package));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_661548
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_661548 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_661548
													.hasNext()) {
										try {
											__DEC_message_message_661548 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_661548
													.next();

											// check object __DEC_message_message_661548 is really bound
											JavaSDM.ensure(__DEC_message_message_661548 != null);
											// check isomorphic binding between objects __DEC_message_message_661548 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_661548
													.equals(messageReceive));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_208641
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_208641 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_208641
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_208641 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_208641
													.next();

											// check object __DEC_messageReceive_receiveEvent_208641 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_208641 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_208641 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_208641
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_20824
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_20824 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_20824
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_20824 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_20824
													.next();

											// check object __DEC_messageReceive_sendEvent_20824 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_20824 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_20824 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_20824
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check object _edge_interaction is really bound
								JavaSDM.ensure(_edge_interaction != null);
								// check object _edge_lifeline is really bound
								JavaSDM.ensure(_edge_lifeline != null);
								// check object _package is really bound
								JavaSDM.ensure(_package != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check isomorphic binding between objects _edge_lifeline and _edge_interaction 
								JavaSDM.ensure(!_edge_lifeline
										.equals(_edge_interaction));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link message from message to interaction
								JavaSDM.ensure(interaction.equals(message
										.getInteraction()));

								// check link message from messageReceive to message
								JavaSDM.ensure(message.equals(messageReceive
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link packagedElement from interaction to _package
								JavaSDM.ensure(_package.equals(interaction
										.eContainer()));

								// check link src from _edge_interaction to line
								JavaSDM.ensure(line.equals(_edge_interaction
										.getSrc()));

								// check link src from _edge_lifeline to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_lifeline.getSrc()));

								// check link trg from _edge_interaction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_interaction.getTrg()));

								// check link trg from _edge_lifeline to line
								JavaSDM.ensure(line.equals(_edge_lifeline
										.getTrg()));

								// check link covered from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										message, interaction, messageReceive,
										line, _package);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_84(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_906825 = null;
		MessageEnd __DEC_message_sendEvent_424843 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_771536 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_107599 = null;
		MessageEnd __DEC_message_message_107599 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871844 = null;
		Message __DEC_messageReceive_receiveEvent_871844 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_880545 = null;
		Message __DEC_messageReceive_sendEvent_880545 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageReceive = null;

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

			// check object _edge_enclosingInteraction is really bound
			JavaSDM.ensure(_edge_enclosingInteraction != null);
			// bind object
			_TmpObject = _edge_enclosingInteraction.getSrc();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageReceive.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link trg from _edge_enclosingInteraction to interaction
			JavaSDM.ensure(interaction.equals(_edge_enclosingInteraction
					.getTrg()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_906825 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_906825 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_906825 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_906825 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_906825
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_424843 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_424843 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_424843 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_424843 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_424843
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_771536 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_771536 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_771536 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_771536
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_771536 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_771536
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_107599
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_107599 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_107599
											.hasNext()) {
								try {
									__DEC_message_message_107599 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_107599
											.next();

									// check object __DEC_message_message_107599 is really bound
									JavaSDM.ensure(__DEC_message_message_107599 != null);
									// check isomorphic binding between objects __DEC_message_message_107599 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_107599
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_871844
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871844 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871844
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_871844 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871844
											.next();

									// check object __DEC_messageReceive_receiveEvent_871844 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_871844 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_871844 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_871844
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_880545
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_880545 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_880545
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_880545 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_880545
											.next();

									// check object __DEC_messageReceive_sendEvent_880545 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_880545 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_880545 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_880545
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_enclosingInteraction is really bound
						JavaSDM.ensure(_edge_enclosingInteraction != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_enclosingInteraction to messageReceive
						JavaSDM.ensure(messageReceive
								.equals(_edge_enclosingInteraction.getSrc()));

						// check link trg from _edge_enclosingInteraction to interaction
						JavaSDM.ensure(interaction
								.equals(_edge_enclosingInteraction.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_85(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_912941 = null;
		MessageEnd __DEC_message_sendEvent_235429 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_728394 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_805055 = null;
		MessageEnd __DEC_message_message_805055 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125577 = null;
		Message __DEC_messageReceive_receiveEvent_125577 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_181619 = null;
		Message __DEC_messageReceive_sendEvent_181619 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageReceive = null;

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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getTrg();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageReceive.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link src from _edge_fragment to interaction
			JavaSDM.ensure(interaction.equals(_edge_fragment.getSrc()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// iterate to-many link src from messageReceive to _edge_enclosingInteraction
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo_edge_enclosingInteraction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterMessageReceiveTo_edge_enclosingInteraction
							.hasNext()) {
						try {
							_edge_enclosingInteraction = (EMoflonEdge) fujaba__IterMessageReceiveTo_edge_enclosingInteraction
									.next();

							// check object _edge_enclosingInteraction is really bound
							JavaSDM.ensure(_edge_enclosingInteraction != null);
							// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
							JavaSDM.ensure(!_edge_fragment
									.equals(_edge_enclosingInteraction));

							// check link trg from _edge_enclosingInteraction to interaction
							JavaSDM.ensure(interaction
									.equals(_edge_enclosingInteraction.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from interaction
								JavaSDM.ensure(interaction
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_enclosingInteraction_912941 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_912941 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_912941 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_912941 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_912941
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_message_sendEvent_235429 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_235429 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_235429 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_235429 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_235429
											.equals(messageReceive));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_packagedElement_728394 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_728394 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_728394 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_728394
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_728394 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_728394
											.equals(_package));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_805055
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_805055 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_805055
													.hasNext()) {
										try {
											__DEC_message_message_805055 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_805055
													.next();

											// check object __DEC_message_message_805055 is really bound
											JavaSDM.ensure(__DEC_message_message_805055 != null);
											// check isomorphic binding between objects __DEC_message_message_805055 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_805055
													.equals(messageReceive));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_125577
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125577 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125577
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_125577 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125577
													.next();

											// check object __DEC_messageReceive_receiveEvent_125577 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_125577 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_125577 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_125577
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_181619
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_181619 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_181619
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_181619 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_181619
													.next();

											// check object __DEC_messageReceive_sendEvent_181619 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_181619 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_181619 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_181619
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check object _edge_enclosingInteraction is really bound
								JavaSDM.ensure(_edge_enclosingInteraction != null);
								// check object _edge_fragment is really bound
								JavaSDM.ensure(_edge_fragment != null);
								// check object _package is really bound
								JavaSDM.ensure(_package != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
								JavaSDM.ensure(!_edge_fragment
										.equals(_edge_enclosingInteraction));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link message from message to interaction
								JavaSDM.ensure(interaction.equals(message
										.getInteraction()));

								// check link message from messageReceive to message
								JavaSDM.ensure(message.equals(messageReceive
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link packagedElement from interaction to _package
								JavaSDM.ensure(_package.equals(interaction
										.eContainer()));

								// check link src from _edge_enclosingInteraction to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_enclosingInteraction
												.getSrc()));

								// check link src from _edge_fragment to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_fragment.getSrc()));

								// check link trg from _edge_enclosingInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_enclosingInteraction
												.getTrg()));

								// check link trg from _edge_fragment to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_fragment.getTrg()));

								// check link covered from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										message, interaction, messageReceive,
										line, _package);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_86(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_118040 = null;
		MessageEnd __DEC_message_sendEvent_635775 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_755070 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_584761 = null;
		MessageEnd __DEC_message_message_584761 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730120 = null;
		Message __DEC_messageReceive_receiveEvent_730120 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_926000 = null;
		Message __DEC_messageReceive_sendEvent_926000 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		ModalSequenceDiagram.Package _package = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Message message = null;

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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getTrg();

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link src from _edge_message to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_message.getSrc()));

			// iterate to-many link covered from messageReceive to line
			fujaba__Success = false;

			fujaba__IterMessageReceiveToLine = new ArrayList(
					messageReceive.getCovered()).iterator();

			while (fujaba__IterMessageReceiveToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageReceiveToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_118040 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_118040 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_118040 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_118040 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_118040
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_635775 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_635775 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_635775 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_635775 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_635775
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_755070 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_755070 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_755070 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_755070
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_755070 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_755070
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_584761
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_584761 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_584761
											.hasNext()) {
								try {
									__DEC_message_message_584761 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_584761
											.next();

									// check object __DEC_message_message_584761 is really bound
									JavaSDM.ensure(__DEC_message_message_584761 != null);
									// check isomorphic binding between objects __DEC_message_message_584761 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_584761
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_730120
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730120 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730120
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_730120 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730120
											.next();

									// check object __DEC_messageReceive_receiveEvent_730120 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_730120 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_730120 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_730120
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_926000
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_926000 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_926000
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_926000 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_926000
											.next();

									// check object __DEC_messageReceive_sendEvent_926000 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_926000 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_926000 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_926000
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_message is really bound
						JavaSDM.ensure(_edge_message != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_message to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_message
								.getSrc()));

						// check link trg from _edge_message to message
						JavaSDM.ensure(message.equals(_edge_message.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_21(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_410526 = null;
		UseCase __DEC_basicFlow_flows_105364 = null;
		PackageDeclaration __DEC_useCase_useCases_512181 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		UseCase useCase = null;
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

			// check object _edge_useCases is really bound
			JavaSDM.ensure(_edge_useCases != null);
			// bind object
			_TmpObject = _edge_useCases.getSrc();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// bind object
			_TmpObject = _edge_useCases.getTrg();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// iterate to-many link actors from packageDeclaration to actor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToActor.hasNext()) {
				try {
					actor = (Actor) fujaba__IterPackageDeclarationToActor
							.next();

					// check object actor is really bound
					JavaSDM.ensure(actor != null);
					// iterate to-many link flows from useCase to basicFlow
					fujaba__Success = false;

					fujaba__IterUseCaseToBasicFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToBasicFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterUseCaseToBasicFlow.next();

							// ensure correct type and really bound of object basicFlow
							JavaSDM.ensure(_TmpObject instanceof BasicFlow);
							basicFlow = (BasicFlow) _TmpObject;
							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_actor_actors_410526 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_410526 is really bound
									JavaSDM.ensure(__DEC_actor_actors_410526 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_410526
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_410526 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_410526
											.equals(packageDeclaration));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_basicFlow_flows_105364 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_105364 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_105364 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_105364
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_105364 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_105364
											.equals(useCase));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_useCase_useCases_512181 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_512181 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_512181 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_512181
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_512181 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_512181
											.equals(packageDeclaration));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_useCases is really bound
								JavaSDM.ensure(_edge_useCases != null);
								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object basicFlow is really bound
								JavaSDM.ensure(basicFlow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from basicFlow to useCase
								JavaSDM.ensure(useCase.equals(basicFlow
										.eContainer()));

								// check link src from _edge_useCases to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(_edge_useCases.getSrc()));

								// check link trg from _edge_useCases to useCase
								JavaSDM.ensure(useCase.equals(_edge_useCases
										.getTrg()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										useCase, actor, packageDeclaration,
										basicFlow);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(
			EMoflonEdge _edge_actors) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_808857 = null;
		UseCase __DEC_basicFlow_flows_598168 = null;
		PackageDeclaration __DEC_useCase_useCases_370399 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
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

			// iterate to-many link useCases from packageDeclaration to useCase
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToUseCase = new ArrayList(
					packageDeclaration.getUseCases()).iterator();

			while (fujaba__IterPackageDeclarationToUseCase.hasNext()) {
				try {
					useCase = (UseCase) fujaba__IterPackageDeclarationToUseCase
							.next();

					// check object useCase is really bound
					JavaSDM.ensure(useCase != null);
					// iterate to-many link flows from useCase to basicFlow
					fujaba__Success = false;

					fujaba__IterUseCaseToBasicFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToBasicFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterUseCaseToBasicFlow.next();

							// ensure correct type and really bound of object basicFlow
							JavaSDM.ensure(_TmpObject instanceof BasicFlow);
							basicFlow = (BasicFlow) _TmpObject;
							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_actor_actors_808857 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_808857 is really bound
									JavaSDM.ensure(__DEC_actor_actors_808857 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_808857
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_808857 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_808857
											.equals(packageDeclaration));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_basicFlow_flows_598168 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_598168 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_598168 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_598168
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_598168 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_598168
											.equals(useCase));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_useCase_useCases_370399 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_370399 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_370399 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_370399
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_370399 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_370399
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
								// check object basicFlow is really bound
								JavaSDM.ensure(basicFlow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from basicFlow to useCase
								JavaSDM.ensure(useCase.equals(basicFlow
										.eContainer()));

								// check link src from _edge_actors to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(_edge_actors.getSrc()));

								// check link trg from _edge_actors to actor
								JavaSDM.ensure(actor.equals(_edge_actors
										.getTrg()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										useCase, actor, packageDeclaration,
										basicFlow);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_87(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_759117 = null;
		MessageEnd __DEC_message_sendEvent_156621 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_110799 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_136152 = null;
		MessageEnd __DEC_message_message_136152 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572807 = null;
		Message __DEC_messageReceive_receiveEvent_572807 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_915960 = null;
		Message __DEC_messageReceive_sendEvent_915960 = null;
		Match match = null;
		ModalSequenceDiagram.Package _package = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// check object _edge_coveredBy is really bound
			JavaSDM.ensure(_edge_coveredBy != null);
			// bind object
			_TmpObject = _edge_coveredBy.getSrc();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			_TmpObject = _edge_coveredBy.getTrg();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageReceive.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link covered from line to messageReceive
			JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from interaction
				JavaSDM.ensure(interaction.getEnclosingOperand() == null);
				// negative check for link fragment from messageReceive
				JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_interaction_enclosingInteraction_759117 = interaction
							.getEnclosingInteraction();

					// check object __DEC_interaction_enclosingInteraction_759117 is really bound
					JavaSDM.ensure(__DEC_interaction_enclosingInteraction_759117 != null);

					// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_759117 and interaction 
					JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_759117
							.equals(interaction));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_message_sendEvent_156621 = message.getSendEvent();

					// check object __DEC_message_sendEvent_156621 is really bound
					JavaSDM.ensure(__DEC_message_sendEvent_156621 != null);

					// check isomorphic binding between objects __DEC_message_sendEvent_156621 and messageReceive 
					JavaSDM.ensure(!__DEC_message_sendEvent_156621
							.equals(messageReceive));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_interaction_packagedElement_110799 = interaction
							.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
							.eContainer() : null;

					// check object __DEC_interaction_packagedElement_110799 is really bound
					JavaSDM.ensure(__DEC_interaction_packagedElement_110799 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_interaction_packagedElement_110799
							.getPackagedElement().contains(interaction));

					// check isomorphic binding between objects __DEC_interaction_packagedElement_110799 and _package 
					JavaSDM.ensure(!__DEC_interaction_packagedElement_110799
							.equals(_package));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link message from message to __DEC_message_message_136152
					fujaba__Success = false;

					fujaba__IterMessageTo__DEC_message_message_136152 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(message,
											MessageEnd.class, "message"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageTo__DEC_message_message_136152
									.hasNext()) {
						try {
							__DEC_message_message_136152 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_136152
									.next();

							// check object __DEC_message_message_136152 is really bound
							JavaSDM.ensure(__DEC_message_message_136152 != null);
							// check isomorphic binding between objects __DEC_message_message_136152 and messageReceive 
							JavaSDM.ensure(!__DEC_message_message_136152
									.equals(messageReceive));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_572807
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572807 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572807
									.hasNext()) {
						try {
							__DEC_messageReceive_receiveEvent_572807 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572807
									.next();

							// check object __DEC_messageReceive_receiveEvent_572807 is really bound
							JavaSDM.ensure(__DEC_messageReceive_receiveEvent_572807 != null);
							// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_572807 and message 
							JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_572807
									.equals(message));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_915960
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_915960 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_915960
									.hasNext()) {
						try {
							__DEC_messageReceive_sendEvent_915960 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_915960
									.next();

							// check object __DEC_messageReceive_sendEvent_915960 is really bound
							JavaSDM.ensure(__DEC_messageReceive_sendEvent_915960 != null);
							// check isomorphic binding between objects __DEC_messageReceive_sendEvent_915960 and message 
							JavaSDM.ensure(!__DEC_messageReceive_sendEvent_915960
									.equals(message));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check object _edge_coveredBy is really bound
				JavaSDM.ensure(_edge_coveredBy != null);
				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object message is really bound
				JavaSDM.ensure(message != null);
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// check link fragment from messageReceive to interaction
				JavaSDM.ensure(interaction.equals(messageReceive
						.getEnclosingInteraction()));

				// check link lifeline from line to interaction
				JavaSDM.ensure(interaction.equals(line.getInteraction()));

				// check link message from message to interaction
				JavaSDM.ensure(interaction.equals(message.getInteraction()));

				// check link message from messageReceive to message
				JavaSDM.ensure(message.equals(messageReceive.getMessage()));

				// check link receiveEvent from message to messageReceive
				JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

				// check link sendEvent from message to messageReceive
				JavaSDM.ensure(!(messageReceive.equals(message.getSendEvent())));

				// check link packagedElement from interaction to _package
				JavaSDM.ensure(_package.equals(interaction.eContainer()));

				// check link src from _edge_coveredBy to line
				JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

				// check link trg from _edge_coveredBy to messageReceive
				JavaSDM.ensure(messageReceive.equals(_edge_coveredBy.getTrg()));

				// check link covered from line to messageReceive
				JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, message,
						interaction, messageReceive, line, _package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_88(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_597955 = null;
		MessageEnd __DEC_message_sendEvent_364379 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_805225 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_439870 = null;
		MessageEnd __DEC_message_message_439870 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_790810 = null;
		Message __DEC_messageReceive_receiveEvent_790810 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_794975 = null;
		Message __DEC_messageReceive_sendEvent_794975 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		ModalSequenceDiagram.Package _package = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// check object _edge_covered is really bound
			JavaSDM.ensure(_edge_covered != null);
			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			_TmpObject = _edge_covered.getSrc();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageReceive.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_package = interaction.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
					.eContainer() : null;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);

			// check if contained via correct reference
			JavaSDM.ensure(_package.getPackagedElement().contains(interaction));

			// check link covered from line to messageReceive
			JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

			// iterate to-many link trg from messageReceive to _edge_coveredBy
			fujaba__Success = false;

			fujaba__IterMessageReceiveTo_edge_coveredBy = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							messageReceive, EMoflonEdge.class, "trg"))
					.iterator();

			while (fujaba__IterMessageReceiveTo_edge_coveredBy.hasNext()) {
				try {
					_edge_coveredBy = (EMoflonEdge) fujaba__IterMessageReceiveTo_edge_coveredBy
							.next();

					// check object _edge_coveredBy is really bound
					JavaSDM.ensure(_edge_coveredBy != null);
					// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
					JavaSDM.ensure(!_edge_coveredBy.equals(_edge_covered));

					// check link src from _edge_coveredBy to line
					JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from interaction
						JavaSDM.ensure(interaction.getEnclosingOperand() == null);
						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_enclosingInteraction_597955 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_597955 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_597955 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_597955 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_597955
									.equals(interaction));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_message_sendEvent_364379 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_364379 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_364379 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_364379 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_364379
									.equals(messageReceive));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_interaction_packagedElement_805225 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_805225 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_805225 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_805225
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_805225 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_805225
									.equals(_package));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_439870
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_439870 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_439870
											.hasNext()) {
								try {
									__DEC_message_message_439870 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_439870
											.next();

									// check object __DEC_message_message_439870 is really bound
									JavaSDM.ensure(__DEC_message_message_439870 != null);
									// check isomorphic binding between objects __DEC_message_message_439870 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_439870
											.equals(messageReceive));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_790810
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_790810 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_790810
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_790810 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_790810
											.next();

									// check object __DEC_messageReceive_receiveEvent_790810 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_790810 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_790810 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_790810
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_794975
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_794975 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_794975
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_794975 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_794975
											.next();

									// check object __DEC_messageReceive_sendEvent_794975 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_794975 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_794975 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_794975
											.equals(message));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check link fragment from interaction to interaction
						JavaSDM.ensure(!(interaction.equals(interaction
								.getEnclosingInteraction())));

						// check object _edge_covered is really bound
						JavaSDM.ensure(_edge_covered != null);
						// check object _edge_coveredBy is really bound
						JavaSDM.ensure(_edge_coveredBy != null);
						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
						JavaSDM.ensure(!_edge_coveredBy.equals(_edge_covered));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

						// check link src from _edge_covered to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_covered
								.getSrc()));

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_covered to line
						JavaSDM.ensure(line.equals(_edge_covered.getTrg()));

						// check link trg from _edge_coveredBy to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_coveredBy
								.getTrg()));

						// check link covered from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								message, interaction, messageReceive, line,
								_package);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_89(
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_736586 = null;
		MessageEnd __DEC_message_sendEvent_563131 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_280004 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_641488 = null;
		MessageEnd __DEC_message_message_641488 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572350 = null;
		Message __DEC_messageReceive_receiveEvent_572350 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_917287 = null;
		Message __DEC_messageReceive_sendEvent_917287 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		ModalSequenceDiagram.Package _package = null;

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

			// check object _edge_packagedElement is really bound
			JavaSDM.ensure(_edge_packagedElement != null);
			// bind object
			_TmpObject = _edge_packagedElement.getSrc();

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;

			// bind object
			_TmpObject = _edge_packagedElement.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link packagedElement from interaction to _package
			JavaSDM.ensure(_package.equals(interaction.eContainer()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// iterate to-many link message from interaction to message
					fujaba__Success = false;

					fujaba__IterInteractionToMessage = new ArrayList(
							interaction.getMessage()).iterator();

					while (fujaba__IterInteractionToMessage.hasNext()) {
						try {
							message = (Message) fujaba__IterInteractionToMessage
									.next();

							// check object message is really bound
							JavaSDM.ensure(message != null);
							// bind object
							_TmpObject = message.getReceiveEvent();

							// ensure correct type and really bound of object messageReceive
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageReceive = (MessageOccurrenceSpecification) _TmpObject;

							// check link fragment from messageReceive to interaction
							JavaSDM.ensure(interaction.equals(messageReceive
									.getEnclosingInteraction()));

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link covered from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from interaction
								JavaSDM.ensure(interaction
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_enclosingInteraction_736586 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_736586 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_736586 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_736586 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_736586
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_message_sendEvent_563131 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_563131 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_563131 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_563131 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_563131
											.equals(messageReceive));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_interaction_packagedElement_280004 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_280004 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_280004 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_280004
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_280004 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_280004
											.equals(_package));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_641488
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_641488 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_641488
													.hasNext()) {
										try {
											__DEC_message_message_641488 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_641488
													.next();

											// check object __DEC_message_message_641488 is really bound
											JavaSDM.ensure(__DEC_message_message_641488 != null);
											// check isomorphic binding between objects __DEC_message_message_641488 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_641488
													.equals(messageReceive));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_572350
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572350 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572350
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_572350 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_572350
													.next();

											// check object __DEC_messageReceive_receiveEvent_572350 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_572350 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_572350 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_572350
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_917287
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_917287 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_917287
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_917287 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_917287
													.next();

											// check object __DEC_messageReceive_sendEvent_917287 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_917287 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_917287 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_917287
													.equals(message));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check link fragment from interaction to interaction
								JavaSDM.ensure(!(interaction.equals(interaction
										.getEnclosingInteraction())));

								// check object _edge_packagedElement is really bound
								JavaSDM.ensure(_edge_packagedElement != null);
								// check object _package is really bound
								JavaSDM.ensure(_package != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link message from message to interaction
								JavaSDM.ensure(interaction.equals(message
										.getInteraction()));

								// check link message from messageReceive to message
								JavaSDM.ensure(message.equals(messageReceive
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link packagedElement from interaction to _package
								JavaSDM.ensure(_package.equals(interaction
										.eContainer()));

								// check link src from _edge_packagedElement to _package
								JavaSDM.ensure(_package
										.equals(_edge_packagedElement.getSrc()));

								// check link trg from _edge_packagedElement to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_packagedElement.getTrg()));

								// check link covered from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										message, interaction, messageReceive,
										line, _package);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
													.addOppositeReference(
															match,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_517332 = null;
		UseCase __DEC_basicFlow_flows_717574 = null;
		PackageDeclaration __DEC_useCase_useCases_817891 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;
		BasicFlow basicFlow = null;
		UseCase useCase = null;

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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;

			// check link flows from basicFlow to useCase
			JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// iterate to-many link actors from packageDeclaration to actor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToActor.hasNext()) {
				try {
					actor = (Actor) fujaba__IterPackageDeclarationToActor
							.next();

					// check object actor is really bound
					JavaSDM.ensure(actor != null);
					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_actor_actors_517332 = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
									.eContainer() : null;

							// check object __DEC_actor_actors_517332 is really bound
							JavaSDM.ensure(__DEC_actor_actors_517332 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_actor_actors_517332
									.getActors().contains(actor));

							// check isomorphic binding between objects __DEC_actor_actors_517332 and packageDeclaration 
							JavaSDM.ensure(!__DEC_actor_actors_517332
									.equals(packageDeclaration));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_basicFlow_flows_717574 = basicFlow
									.eContainer() instanceof UseCase ? (UseCase) basicFlow
									.eContainer() : null;

							// check object __DEC_basicFlow_flows_717574 is really bound
							JavaSDM.ensure(__DEC_basicFlow_flows_717574 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_basicFlow_flows_717574
									.getFlows().contains(basicFlow));

							// check isomorphic binding between objects __DEC_basicFlow_flows_717574 and useCase 
							JavaSDM.ensure(!__DEC_basicFlow_flows_717574
									.equals(useCase));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_useCase_useCases_817891 = useCase
									.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
									.eContainer() : null;

							// check object __DEC_useCase_useCases_817891 is really bound
							JavaSDM.ensure(__DEC_useCase_useCases_817891 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_useCase_useCases_817891
									.getUseCases().contains(useCase));

							// check isomorphic binding between objects __DEC_useCase_useCases_817891 and packageDeclaration 
							JavaSDM.ensure(!__DEC_useCase_useCases_817891
									.equals(packageDeclaration));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flows is really bound
						JavaSDM.ensure(_edge_flows != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link src from _edge_flows to useCase
						JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

						// check link trg from _edge_flows to basicFlow
						JavaSDM.ensure(basicFlow.equals(_edge_flows.getTrg()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								useCase, actor, packageDeclaration, basicFlow);
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
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match,
					packageDeclaration, useCase, basicFlow));

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

				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __useCase_flows_basicFlow
				__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __useCase_flows_basicFlow
				__useCase_flows_basicFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_basicFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						basicFlow, "toBeTranslatedNodes");

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_basicFlow.setSrc(useCase);

				// create link
				__useCase_flows_basicFlow.setTrg(basicFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, packageDeclaration, useCase,
					basicFlow);
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
			BasicFlow basicFlow) {
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, BasicFlow basicFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("");

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
	public boolean isAppropriate_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge ___package_packagedElement_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, _package,
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

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// create object ___package_packagedElement_interaction
				___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute ___package_packagedElement_interaction
				___package_packagedElement_interaction
						.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						___package_packagedElement_interaction,
						"toBeTranslatedEdges");

				// create link
				___package_packagedElement_interaction.setSrc(_package);

				// create link
				___package_packagedElement_interaction.setTrg(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						_package, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, _package, interaction);
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
			ModalSequenceDiagram.Package _package, Interaction interaction) {
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Interaction interaction) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", true, csp);
		var_interaction_name.setValue(interaction.getName());
		var_interaction_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("");

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_basicFlow_flows_952494 = null;
		PackageDeclaration __DEC_useCase_useCases_52060 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
		UseCase useCase = null;
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

			// check object _edge_useCases is really bound
			JavaSDM.ensure(_edge_useCases != null);
			// bind object
			_TmpObject = _edge_useCases.getSrc();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// bind object
			_TmpObject = _edge_useCases.getTrg();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// iterate to-many link flows from useCase to basicFlow
			fujaba__Success = false;

			fujaba__IterUseCaseToBasicFlow = new ArrayList(useCase.getFlows())
					.iterator();

			while (fujaba__IterUseCaseToBasicFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterUseCaseToBasicFlow.next();

					// ensure correct type and really bound of object basicFlow
					JavaSDM.ensure(_TmpObject instanceof BasicFlow);
					basicFlow = (BasicFlow) _TmpObject;
					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_basicFlow_flows_952494 = basicFlow
									.eContainer() instanceof UseCase ? (UseCase) basicFlow
									.eContainer() : null;

							// check object __DEC_basicFlow_flows_952494 is really bound
							JavaSDM.ensure(__DEC_basicFlow_flows_952494 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_basicFlow_flows_952494
									.getFlows().contains(basicFlow));

							// check isomorphic binding between objects __DEC_basicFlow_flows_952494 and useCase 
							JavaSDM.ensure(!__DEC_basicFlow_flows_952494
									.equals(useCase));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_useCase_useCases_52060 = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
									.eContainer() : null;

							// check object __DEC_useCase_useCases_52060 is really bound
							JavaSDM.ensure(__DEC_useCase_useCases_52060 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_useCase_useCases_52060
									.getUseCases().contains(useCase));

							// check isomorphic binding between objects __DEC_useCase_useCases_52060 and packageDeclaration 
							JavaSDM.ensure(!__DEC_useCase_useCases_52060
									.equals(packageDeclaration));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_useCases is really bound
						JavaSDM.ensure(_edge_useCases != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link src from _edge_useCases to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(_edge_useCases
								.getSrc()));

						// check link trg from _edge_useCases to useCase
						JavaSDM.ensure(useCase.equals(_edge_useCases.getTrg()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								packageDeclaration, useCase, basicFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_186900 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_700481 = null;
		Match match = null;
		Interaction interaction = null;
		ModalSequenceDiagram.Package _package = null;

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

			// check object _edge_packagedElement is really bound
			JavaSDM.ensure(_edge_packagedElement != null);
			// bind object
			_TmpObject = _edge_packagedElement.getSrc();

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;

			// bind object
			_TmpObject = _edge_packagedElement.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link packagedElement from interaction to _package
			JavaSDM.ensure(_package.equals(interaction.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from interaction
				JavaSDM.ensure(interaction.getEnclosingOperand() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_interaction_enclosingInteraction_186900 = interaction
							.getEnclosingInteraction();

					// check object __DEC_interaction_enclosingInteraction_186900 is really bound
					JavaSDM.ensure(__DEC_interaction_enclosingInteraction_186900 != null);

					// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_186900 and interaction 
					JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_186900
							.equals(interaction));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_interaction_packagedElement_700481 = interaction
							.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
							.eContainer() : null;

					// check object __DEC_interaction_packagedElement_700481 is really bound
					JavaSDM.ensure(__DEC_interaction_packagedElement_700481 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_interaction_packagedElement_700481
							.getPackagedElement().contains(interaction));

					// check isomorphic binding between objects __DEC_interaction_packagedElement_700481 and _package 
					JavaSDM.ensure(!__DEC_interaction_packagedElement_700481
							.equals(_package));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check object _edge_packagedElement is really bound
				JavaSDM.ensure(_edge_packagedElement != null);
				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check link packagedElement from interaction to _package
				JavaSDM.ensure(_package.equals(interaction.eContainer()));

				// check link src from _edge_packagedElement to _package
				JavaSDM.ensure(_package.equals(_edge_packagedElement.getSrc()));

				// check link trg from _edge_packagedElement to interaction
				JavaSDM.ensure(interaction.equals(_edge_packagedElement
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, _package,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_basicFlow_flows_672020 = null;
		PackageDeclaration __DEC_useCase_useCases_82129 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		BasicFlow basicFlow = null;
		UseCase useCase = null;

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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;

			// check link flows from basicFlow to useCase
			JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_basicFlow_flows_672020 = basicFlow.eContainer() instanceof UseCase ? (UseCase) basicFlow
							.eContainer() : null;

					// check object __DEC_basicFlow_flows_672020 is really bound
					JavaSDM.ensure(__DEC_basicFlow_flows_672020 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_basicFlow_flows_672020.getFlows()
							.contains(basicFlow));

					// check isomorphic binding between objects __DEC_basicFlow_flows_672020 and useCase 
					JavaSDM.ensure(!__DEC_basicFlow_flows_672020
							.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_useCase_useCases_82129 = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
							.eContainer() : null;

					// check object __DEC_useCase_useCases_82129 is really bound
					JavaSDM.ensure(__DEC_useCase_useCases_82129 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_useCase_useCases_82129.getUseCases()
							.contains(useCase));

					// check isomorphic binding between objects __DEC_useCase_useCases_82129 and packageDeclaration 
					JavaSDM.ensure(!__DEC_useCase_useCases_82129
							.equals(packageDeclaration));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_flows is really bound
				JavaSDM.ensure(_edge_flows != null);
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link flows from basicFlow to useCase
				JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

				// check link src from _edge_flows to useCase
				JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

				// check link trg from _edge_flows to basicFlow
				JavaSDM.ensure(basicFlow.equals(_edge_flows.getTrg()));

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match,
						packageDeclaration, useCase, basicFlow);
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == UseCaseToInteractionRule.class) {
			switch (baseOperationID) {
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_BASICFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(ModalSequenceDiagram.Package) arguments.get(4),
					(PackageDeclarationToPackage) arguments.get(5),
					(BasicFlow) arguments.get(6));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_PACKAGEDECLARATION_LIFELINE_PACKAGE_PACKAGEDECLARATIONTOPACKAGE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(Lifeline) arguments.get(5),
					(ModalSequenceDiagram.Package) arguments.get(6),
					(PackageDeclarationToPackage) arguments.get(7));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_79((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_80((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_81((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_82((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_84((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_85((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_86__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_86((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_87((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_88((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_89((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (BasicFlow) arguments.get(5));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Interaction) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCasePrecondToFoundMessageRuleImpl
