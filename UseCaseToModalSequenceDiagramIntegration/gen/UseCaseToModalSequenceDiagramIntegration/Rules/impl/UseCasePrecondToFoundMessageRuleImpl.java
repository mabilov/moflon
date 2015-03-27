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
import UseCaseToModalSequenceDiagramIntegration.UseCaseToMessage;
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
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

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
				// create object __useCase_flows_basicFlow
				__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __useCase_flows_basicFlow
				__useCase_flows_basicFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_basicFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						basicFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor,
						"toBeTranslatedEdges");

				// create link
				__useCase_flows_basicFlow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

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
		UseCaseToMessage useCaseToMessage = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Lifeline line = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		ActorToLifeline actorToLine = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge useCaseToMessage__source__useCase = null;
		EMoflonEdge useCaseToMessage__target__message = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge _package__packagedElement__interaction = null;
		EMoflonEdge actorToLine__target__line = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge actorToLine__source__actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge interaction__lifeline__line = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge line__interaction__interaction = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge messageReceive__covered__line = null;

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
			// create object useCaseToMessage
			useCaseToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToMessage();

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
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					useCaseToMessage, message, "target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					useCaseToMessage, useCase, "source");

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
			basicFlowToInteraction.setTarget(interaction);

			// create link
			_package.getPackagedElement().add(interaction);

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
			// check object useCaseToMessage is really bound
			JavaSDM.ensure(useCaseToMessage != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");
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
			// check object useCaseToMessage is really bound
			JavaSDM.ensure(useCaseToMessage != null);
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

			// check isomorphic binding between objects useCaseToMessage and _package 
			JavaSDM.ensure(!useCaseToMessage.equals(_package));

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

			// check isomorphic binding between objects useCaseToMessage and actor 
			JavaSDM.ensure(!useCaseToMessage.equals(actor));

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

			// check isomorphic binding between objects useCaseToMessage and actorToLine 
			JavaSDM.ensure(!useCaseToMessage.equals(actorToLine));

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

			// check isomorphic binding between objects useCaseToMessage and basicFlow 
			JavaSDM.ensure(!useCaseToMessage.equals(basicFlow));

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

			// check isomorphic binding between objects useCaseToMessage and basicFlowToInteraction 
			JavaSDM.ensure(!useCaseToMessage.equals(basicFlowToInteraction));

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

			// check isomorphic binding between objects useCaseToMessage and interaction 
			JavaSDM.ensure(!useCaseToMessage.equals(interaction));

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

			// check isomorphic binding between objects useCaseToMessage and line 
			JavaSDM.ensure(!useCaseToMessage.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects packageDeclarationToPackage and message 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects useCaseToMessage and message 
			JavaSDM.ensure(!useCaseToMessage.equals(message));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and messageReceive 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToMessage and messageReceive 
			JavaSDM.ensure(!useCaseToMessage.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToMessage and packageDeclaration 
			JavaSDM.ensure(!useCaseToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToMessage and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToMessage
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToMessage and useCase 
			JavaSDM.ensure(!useCaseToMessage.equals(useCase));

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_basicFlow
			__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToMessage__source__useCase
			useCaseToMessage__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToMessage__target__message
			useCaseToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object _package__packagedElement__interaction
			_package__packagedElement__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__lifeline__line
			interaction__lifeline__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__interaction__interaction
			line__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCasePrecondToFoundMessageRule");
			// assign attribute useCaseToMessage__source__useCase
			useCaseToMessage__source__useCase.setName("source");
			// assign attribute useCaseToMessage__target__message
			useCaseToMessage__target__message.setName("target");
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
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_basicFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage__source__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					_package__packagedElement__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__target__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine__source__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_useCases_useCase, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							basicFlowToInteraction__target__interaction,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__lifeline__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_actors_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			useCaseToMessage__source__useCase.setSrc(useCaseToMessage);

			// create link
			useCaseToMessage__target__message.setSrc(useCaseToMessage);

			// create link
			useCaseToMessage__source__useCase.setTrg(useCase);

			// create link
			__useCase_flows_basicFlow.setSrc(useCase);

			// create link
			__packageDeclaration_useCases_useCase.setTrg(useCase);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			useCaseToMessage__target__message.setTrg(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			line__interaction__interaction.setTrg(interaction);

			// create link
			interaction__lifeline__line.setSrc(interaction);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			_package__packagedElement__interaction.setTrg(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setSrc(messageReceive);

			// create link
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			__packageDeclaration_actors_actor.setTrg(actor);

			// create link
			__packageDeclaration_useCases_useCase.setSrc(packageDeclaration);

			// create link
			__packageDeclaration_actors_actor.setSrc(packageDeclaration);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			interaction__lifeline__line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			line__interaction__interaction.setSrc(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

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
		this.registerObjects_FWD(ruleresult, useCaseToMessage, useCase,
				message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, _package,
				packageDeclarationToPackage, basicFlow, basicFlowToInteraction);
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
		EMoflonEdge __useCase_flows_basicFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
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

						// create object __useCase_flows_basicFlow
						__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
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
						__useCase_flows_basicFlow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__packageDeclaration_useCases_useCase.setTrg(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(actor);

						// create link
						__packageDeclaration_actors_actor.setTrg(actor);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__packageDeclaration_useCases_useCase
								.setSrc(packageDeclaration);

						// create link
						__packageDeclaration_actors_actor
								.setSrc(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements()
								.add(basicFlow);

						// create link
						__useCase_flows_basicFlow.setTrg(basicFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_useCases_useCase,
								"allContextElements");

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
								isApplicableMatch, __useCase_flows_basicFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
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
		literal1.setValue("ASYNCH_SIGNAL");
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
			EObject useCaseToMessage, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject _package, EObject packageDeclarationToPackage,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCaseToMessage", useCaseToMessage);
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
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;

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
				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object ___package_packagedElement_interaction
				___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
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
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						___package_packagedElement_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "toBeTranslatedNodes");

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				___package_packagedElement_interaction.setTrg(interaction);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

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
		UseCaseToMessage useCaseToMessage = null;
		UseCase useCase = null;
		BasicFlow basicFlow = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		Actor actor = null;
		ActorToLifeline actorToLine = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge actorToLine__source__actor = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge useCaseToMessage__source__useCase = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge packageDeclaration__actors__actor = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge packageDeclaration__useCases__useCase = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge useCase__flows__basicFlow = null;
		EMoflonEdge useCaseToMessage__target__message = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge actorToLine__target__line = null;
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
			// create object useCaseToMessage
			useCaseToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToMessage();

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
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					useCaseToMessage, message, "target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					useCaseToMessage, useCase, "source");

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
			// check object useCaseToMessage is really bound
			JavaSDM.ensure(useCaseToMessage != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actorToLine, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "translatedElements");
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
			// check object useCaseToMessage is really bound
			JavaSDM.ensure(useCaseToMessage != null);
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

			// check isomorphic binding between objects useCaseToMessage and _package 
			JavaSDM.ensure(!useCaseToMessage.equals(_package));

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

			// check isomorphic binding between objects useCaseToMessage and actor 
			JavaSDM.ensure(!useCaseToMessage.equals(actor));

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

			// check isomorphic binding between objects useCaseToMessage and actorToLine 
			JavaSDM.ensure(!useCaseToMessage.equals(actorToLine));

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

			// check isomorphic binding between objects useCaseToMessage and basicFlow 
			JavaSDM.ensure(!useCaseToMessage.equals(basicFlow));

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

			// check isomorphic binding between objects useCaseToMessage and basicFlowToInteraction 
			JavaSDM.ensure(!useCaseToMessage.equals(basicFlowToInteraction));

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

			// check isomorphic binding between objects useCaseToMessage and interaction 
			JavaSDM.ensure(!useCaseToMessage.equals(interaction));

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

			// check isomorphic binding between objects useCaseToMessage and line 
			JavaSDM.ensure(!useCaseToMessage.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects packageDeclarationToPackage and message 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects useCaseToMessage and message 
			JavaSDM.ensure(!useCaseToMessage.equals(message));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and messageReceive 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToMessage and messageReceive 
			JavaSDM.ensure(!useCaseToMessage.equals(messageReceive));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToMessage and packageDeclaration 
			JavaSDM.ensure(!useCaseToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToMessage and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToMessage
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToMessage and useCase 
			JavaSDM.ensure(!useCaseToMessage.equals(useCase));

			// create object actorToLine__source__actor
			actorToLine__source__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ___package_packagedElement_interaction
			___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_lifeline_line
			__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToMessage__source__useCase
			useCaseToMessage__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__actors__actor
			packageDeclaration__actors__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_interaction_interaction
			__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__basicFlow
			useCase__flows__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToMessage__target__message
			useCaseToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object actorToLine__target__line
			actorToLine__target__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCasePrecondToFoundMessageRule");
			// assign attribute useCaseToMessage__source__useCase
			useCaseToMessage__source__useCase.setName("source");
			// assign attribute useCaseToMessage__target__message
			useCaseToMessage__target__message.setName("target");
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
					actorToLine__source__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					___package_packagedElement_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_lifeline_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage__source__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__actors__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__useCases__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToMessage__target__message, "createdEdges");

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
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			useCaseToMessage__target__message.setSrc(useCaseToMessage);

			// create link
			useCaseToMessage__source__useCase.setSrc(useCaseToMessage);

			// create link
			packageDeclaration__useCases__useCase.setTrg(useCase);

			// create link
			useCaseToMessage__source__useCase.setTrg(useCase);

			// create link
			useCase__flows__basicFlow.setSrc(useCase);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			useCaseToMessage__target__message.setTrg(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			___package_packagedElement_interaction.setTrg(interaction);

			// create link
			__interaction_lifeline_line.setSrc(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			__line_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			packageDeclaration__actors__actor.setTrg(actor);

			// create link
			actorToLine__source__actor.setTrg(actor);

			// create link
			packageDeclaration__actors__actor.setSrc(packageDeclaration);

			// create link
			packageDeclaration__useCases__useCase.setSrc(packageDeclaration);

			// create link
			__line_interaction_interaction.setSrc(line);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__interaction_lifeline_line.setTrg(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			actorToLine__target__line.setTrg(line);

			// create link
			actorToLine__source__actor.setSrc(actorToLine);

			// create link
			actorToLine__target__line.setSrc(actorToLine);

			// create link
			___package_packagedElement_interaction.setSrc(_package);

			// create link
			basicFlowToInteraction__source__basicFlow.setTrg(basicFlow);

			// create link
			useCase__flows__basicFlow.setTrg(basicFlow);

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
		this.registerObjects_BWD(ruleresult, useCaseToMessage, useCase,
				message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, _package,
				packageDeclarationToPackage, basicFlow, basicFlowToInteraction);
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
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
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

						// check link coveredBy from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// create object __messageReceive_message_message
						__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __message_interaction_interaction
						__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_message_message
						__interaction_message_message = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __message_receiveEvent_messageReceive
						__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __interaction_lifeline_line
						__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __messageReceive_enclosingInteraction_interaction
						__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __interaction_fragment_messageReceive
						__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_interaction_interaction
						__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object ___package_packagedElement_interaction
						___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
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
						__messageReceive_message_message.setTrg(message);

						// create link
						__message_interaction_interaction.setSrc(message);

						// create link
						__interaction_message_message.setTrg(message);

						// create link
						__message_receiveEvent_messageReceive.setSrc(message);

						// create link
						isApplicableMatch.getAllContextElements().add(message);

						// create link
						__interaction_lifeline_line.setSrc(interaction);

						// create link
						__messageReceive_enclosingInteraction_interaction
								.setTrg(interaction);

						// create link
						__message_interaction_interaction.setTrg(interaction);

						// create link
						__interaction_fragment_messageReceive
								.setSrc(interaction);

						// create link
						__interaction_message_message.setSrc(interaction);

						// create link
						__line_interaction_interaction.setTrg(interaction);

						// create link
						___package_packagedElement_interaction
								.setTrg(interaction);

						// create link
						isApplicableMatch.getAllContextElements().add(
								interaction);

						// create link
						__messageReceive_covered_line.setSrc(messageReceive);

						// create link
						__messageReceive_message_message.setSrc(messageReceive);

						// create link
						isApplicableMatch.getAllContextElements().add(
								messageReceive);

						// create link
						__messageReceive_enclosingInteraction_interaction
								.setSrc(messageReceive);

						// create link
						__message_receiveEvent_messageReceive
								.setTrg(messageReceive);

						// create link
						__line_coveredBy_messageReceive.setTrg(messageReceive);

						// create link
						__interaction_fragment_messageReceive
								.setTrg(messageReceive);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__messageReceive_covered_line.setTrg(line);

						// create link
						__line_coveredBy_messageReceive.setSrc(line);

						// create link
						__line_interaction_interaction.setSrc(line);

						// create link
						__interaction_lifeline_line.setTrg(line);

						// create link
						isApplicableMatch.getAllContextElements().add(line);

						// create link
						___package_packagedElement_interaction.setSrc(_package);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__line_interaction_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__message_interaction_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __interaction_lifeline_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__line_coveredBy_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__interaction_fragment_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__messageReceive_enclosingInteraction_interaction,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__messageReceive_covered_line,
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
								__interaction_message_message,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								___package_packagedElement_interaction,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__message_receiveEvent_messageReceive,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__messageReceive_message_message,
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
		literal1.setValue("ASYNCH_SIGNAL");
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
			EObject useCaseToMessage, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject _package, EObject packageDeclarationToPackage,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCaseToMessage", useCaseToMessage);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_331(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_527742 = null;
		MessageEnd __DEC_message_sendEvent_124804 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_768602 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_116037 = null;
		MessageEnd __DEC_message_message_116037 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_965015 = null;
		Message __DEC_messageReceive_receiveEvent_965015 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_103865 = null;
		Message __DEC_messageReceive_sendEvent_103865 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
							__DEC_interaction_enclosingInteraction_527742 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_527742 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_527742 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_527742 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_527742
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
							__DEC_message_sendEvent_124804 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_124804 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_124804 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_124804 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_124804
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
							__DEC_interaction_packagedElement_768602 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_768602 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_768602 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_768602
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_768602 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_768602
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

							// iterate to-many link message from message to __DEC_message_message_116037
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_116037 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_116037
											.hasNext()) {
								try {
									__DEC_message_message_116037 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_116037
											.next();

									// check object __DEC_message_message_116037 is really bound
									JavaSDM.ensure(__DEC_message_message_116037 != null);
									// check isomorphic binding between objects __DEC_message_message_116037 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_116037
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_965015
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_965015 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_965015
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_965015 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_965015
											.next();

									// check object __DEC_messageReceive_receiveEvent_965015 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_965015 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_965015 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_965015
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_103865
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_103865 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_103865
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_103865 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_103865
											.next();

									// check object __DEC_messageReceive_sendEvent_103865 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_103865 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_103865 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_103865
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_332(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_562861 = null;
		MessageEnd __DEC_message_sendEvent_728485 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_515609 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_711657 = null;
		MessageEnd __DEC_message_message_711657 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_146209 = null;
		Message __DEC_messageReceive_receiveEvent_146209 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_276390 = null;
		Message __DEC_messageReceive_sendEvent_276390 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
							__DEC_interaction_enclosingInteraction_562861 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_562861 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_562861 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_562861 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_562861
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
							__DEC_message_sendEvent_728485 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_728485 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_728485 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_728485 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_728485
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
							__DEC_interaction_packagedElement_515609 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_515609 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_515609 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_515609
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_515609 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_515609
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

							// iterate to-many link message from message to __DEC_message_message_711657
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_711657 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_711657
											.hasNext()) {
								try {
									__DEC_message_message_711657 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_711657
											.next();

									// check object __DEC_message_message_711657 is really bound
									JavaSDM.ensure(__DEC_message_message_711657 != null);
									// check isomorphic binding between objects __DEC_message_message_711657 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_711657
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_146209
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_146209 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_146209
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_146209 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_146209
											.next();

									// check object __DEC_messageReceive_receiveEvent_146209 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_146209 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_146209 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_146209
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_276390
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_276390 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_276390
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_276390 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_276390
											.next();

									// check object __DEC_messageReceive_sendEvent_276390 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_276390 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_276390 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_276390
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_333(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_914263 = null;
		MessageEnd __DEC_message_sendEvent_699802 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_197044 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_62000 = null;
		MessageEnd __DEC_message_message_62000 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_834835 = null;
		Message __DEC_messageReceive_receiveEvent_834835 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_711585 = null;
		Message __DEC_messageReceive_sendEvent_711585 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
									__DEC_interaction_enclosingInteraction_914263 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_914263 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_914263 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_914263 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_914263
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
									__DEC_message_sendEvent_699802 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_699802 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_699802 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_699802 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_699802
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
									__DEC_interaction_packagedElement_197044 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_197044 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_197044 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_197044
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_197044 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_197044
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

									// iterate to-many link message from message to __DEC_message_message_62000
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_62000 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_62000
													.hasNext()) {
										try {
											__DEC_message_message_62000 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_62000
													.next();

											// check object __DEC_message_message_62000 is really bound
											JavaSDM.ensure(__DEC_message_message_62000 != null);
											// check isomorphic binding between objects __DEC_message_message_62000 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_62000
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_834835
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_834835 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_834835
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_834835 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_834835
													.next();

											// check object __DEC_messageReceive_receiveEvent_834835 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_834835 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_834835 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_834835
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_711585
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_711585 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_711585
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_711585 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_711585
													.next();

											// check object __DEC_messageReceive_sendEvent_711585 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_711585 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_711585 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_711585
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

								// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_334(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_568954 = null;
		MessageEnd __DEC_message_sendEvent_695792 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_188888 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_842844 = null;
		MessageEnd __DEC_message_message_842844 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_627229 = null;
		Message __DEC_messageReceive_receiveEvent_627229 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_608056 = null;
		Message __DEC_messageReceive_sendEvent_608056 = null;
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

					// check link coveredBy from line to messageReceive
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
							__DEC_interaction_enclosingInteraction_568954 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_568954 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_568954 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_568954 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_568954
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
							__DEC_message_sendEvent_695792 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_695792 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_695792 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_695792 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_695792
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
							__DEC_interaction_packagedElement_188888 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_188888 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_188888 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_188888
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_188888 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_188888
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

							// iterate to-many link message from message to __DEC_message_message_842844
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_842844 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_842844
											.hasNext()) {
								try {
									__DEC_message_message_842844 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_842844
											.next();

									// check object __DEC_message_message_842844 is really bound
									JavaSDM.ensure(__DEC_message_message_842844 != null);
									// check isomorphic binding between objects __DEC_message_message_842844 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_842844
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_627229
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_627229 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_627229
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_627229 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_627229
											.next();

									// check object __DEC_messageReceive_receiveEvent_627229 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_627229 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_627229 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_627229
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_608056
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_608056 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_608056
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_608056 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_608056
											.next();

									// check object __DEC_messageReceive_sendEvent_608056 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_608056 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_608056 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_608056
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_335(
			EMoflonEdge _edge_lifeline) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_649736 = null;
		MessageEnd __DEC_message_sendEvent_927313 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_858711 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_249964 = null;
		MessageEnd __DEC_message_message_249964 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_391474 = null;
		Message __DEC_messageReceive_receiveEvent_391474 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_707582 = null;
		Message __DEC_messageReceive_sendEvent_707582 = null;
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

					// check link coveredBy from line to messageReceive
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
									__DEC_interaction_enclosingInteraction_649736 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_649736 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_649736 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_649736 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_649736
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
									__DEC_message_sendEvent_927313 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_927313 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_927313 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_927313 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_927313
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
									__DEC_interaction_packagedElement_858711 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_858711 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_858711 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_858711
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_858711 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_858711
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

									// iterate to-many link message from message to __DEC_message_message_249964
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_249964 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_249964
													.hasNext()) {
										try {
											__DEC_message_message_249964 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_249964
													.next();

											// check object __DEC_message_message_249964 is really bound
											JavaSDM.ensure(__DEC_message_message_249964 != null);
											// check isomorphic binding between objects __DEC_message_message_249964 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_249964
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_391474
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_391474 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_391474
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_391474 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_391474
													.next();

											// check object __DEC_messageReceive_receiveEvent_391474 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_391474 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_391474 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_391474
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_707582
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_707582 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_707582
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_707582 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_707582
													.next();

											// check object __DEC_messageReceive_sendEvent_707582 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_707582 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_707582 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_707582
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

								// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_336(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_997310 = null;
		MessageEnd __DEC_message_sendEvent_709263 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_864484 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_349443 = null;
		MessageEnd __DEC_message_message_349443 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_249329 = null;
		Message __DEC_messageReceive_receiveEvent_249329 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_150684 = null;
		Message __DEC_messageReceive_sendEvent_150684 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
							__DEC_interaction_enclosingInteraction_997310 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_997310 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_997310 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_997310 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_997310
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
							__DEC_message_sendEvent_709263 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_709263 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_709263 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_709263 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_709263
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
							__DEC_interaction_packagedElement_864484 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_864484 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_864484 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_864484
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_864484 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_864484
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

							// iterate to-many link message from message to __DEC_message_message_349443
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_349443 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_349443
											.hasNext()) {
								try {
									__DEC_message_message_349443 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_349443
											.next();

									// check object __DEC_message_message_349443 is really bound
									JavaSDM.ensure(__DEC_message_message_349443 != null);
									// check isomorphic binding between objects __DEC_message_message_349443 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_349443
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_249329
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_249329 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_249329
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_249329 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_249329
											.next();

									// check object __DEC_messageReceive_receiveEvent_249329 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_249329 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_249329 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_249329
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_150684
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_150684 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_150684
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_150684 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_150684
											.next();

									// check object __DEC_messageReceive_sendEvent_150684 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_150684 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_150684 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_150684
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_337(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_292472 = null;
		MessageEnd __DEC_message_sendEvent_190561 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_820154 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_457832 = null;
		MessageEnd __DEC_message_message_457832 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_402466 = null;
		Message __DEC_messageReceive_receiveEvent_402466 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_389869 = null;
		Message __DEC_messageReceive_sendEvent_389869 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
									__DEC_interaction_enclosingInteraction_292472 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_292472 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_292472 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_292472 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_292472
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
									__DEC_message_sendEvent_190561 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_190561 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_190561 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_190561 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_190561
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
									__DEC_interaction_packagedElement_820154 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_820154 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_820154 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_820154
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_820154 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_820154
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

									// iterate to-many link message from message to __DEC_message_message_457832
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_457832 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_457832
													.hasNext()) {
										try {
											__DEC_message_message_457832 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_457832
													.next();

											// check object __DEC_message_message_457832 is really bound
											JavaSDM.ensure(__DEC_message_message_457832 != null);
											// check isomorphic binding between objects __DEC_message_message_457832 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_457832
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_402466
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_402466 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_402466
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_402466 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_402466
													.next();

											// check object __DEC_messageReceive_receiveEvent_402466 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_402466 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_402466 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_402466
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_389869
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_389869 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_389869
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_389869 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_389869
													.next();

											// check object __DEC_messageReceive_sendEvent_389869 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_389869 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_389869 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_389869
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

								// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_338(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_816079 = null;
		MessageEnd __DEC_message_sendEvent_799021 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_581883 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_743560 = null;
		MessageEnd __DEC_message_message_743560 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_119412 = null;
		Message __DEC_messageReceive_receiveEvent_119412 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_383217 = null;
		Message __DEC_messageReceive_sendEvent_383217 = null;
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

			// iterate to-many link coveredBy from messageReceive to line
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
							__DEC_interaction_enclosingInteraction_816079 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_816079 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_816079 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_816079 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_816079
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
							__DEC_message_sendEvent_799021 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_799021 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_799021 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_799021 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_799021
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
							__DEC_interaction_packagedElement_581883 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_581883 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_581883 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_581883
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_581883 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_581883
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

							// iterate to-many link message from message to __DEC_message_message_743560
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_743560 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_743560
											.hasNext()) {
								try {
									__DEC_message_message_743560 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_743560
											.next();

									// check object __DEC_message_message_743560 is really bound
									JavaSDM.ensure(__DEC_message_message_743560 != null);
									// check isomorphic binding between objects __DEC_message_message_743560 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_743560
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_119412
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_119412 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_119412
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_119412 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_119412
											.next();

									// check object __DEC_messageReceive_receiveEvent_119412 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_119412 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_119412 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_119412
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_383217
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_383217 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_383217
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_383217 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_383217
											.next();

									// check object __DEC_messageReceive_sendEvent_383217 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_383217 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_383217 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_383217
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_81(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_491007 = null;
		UseCase __DEC_basicFlow_flows_194408 = null;
		PackageDeclaration __DEC_useCase_useCases_186293 = null;
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
									__DEC_actor_actors_491007 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_491007 is really bound
									JavaSDM.ensure(__DEC_actor_actors_491007 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_491007
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_491007 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_491007
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
									__DEC_basicFlow_flows_194408 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_194408 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_194408 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_194408
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_194408 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_194408
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
									__DEC_useCase_useCases_186293 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_186293 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_186293 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_186293
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_186293 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_186293
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_82(
			EMoflonEdge _edge_actors) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_540787 = null;
		UseCase __DEC_basicFlow_flows_449596 = null;
		PackageDeclaration __DEC_useCase_useCases_658862 = null;
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
									__DEC_actor_actors_540787 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_540787 is really bound
									JavaSDM.ensure(__DEC_actor_actors_540787 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_540787
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_540787 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_540787
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
									__DEC_basicFlow_flows_449596 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_449596 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_449596 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_449596
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_449596 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_449596
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
									__DEC_useCase_useCases_658862 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_658862 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_658862 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_658862
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_658862 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_658862
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_339(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_708018 = null;
		MessageEnd __DEC_message_sendEvent_540947 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_718631 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_250520 = null;
		MessageEnd __DEC_message_message_250520 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_502602 = null;
		Message __DEC_messageReceive_receiveEvent_502602 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_341076 = null;
		Message __DEC_messageReceive_sendEvent_341076 = null;
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

			// check link coveredBy from line to messageReceive
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
					__DEC_interaction_enclosingInteraction_708018 = interaction
							.getEnclosingInteraction();

					// check object __DEC_interaction_enclosingInteraction_708018 is really bound
					JavaSDM.ensure(__DEC_interaction_enclosingInteraction_708018 != null);

					// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_708018 and interaction 
					JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_708018
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
					__DEC_message_sendEvent_540947 = message.getSendEvent();

					// check object __DEC_message_sendEvent_540947 is really bound
					JavaSDM.ensure(__DEC_message_sendEvent_540947 != null);

					// check isomorphic binding between objects __DEC_message_sendEvent_540947 and messageReceive 
					JavaSDM.ensure(!__DEC_message_sendEvent_540947
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
					__DEC_interaction_packagedElement_718631 = interaction
							.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
							.eContainer() : null;

					// check object __DEC_interaction_packagedElement_718631 is really bound
					JavaSDM.ensure(__DEC_interaction_packagedElement_718631 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_interaction_packagedElement_718631
							.getPackagedElement().contains(interaction));

					// check isomorphic binding between objects __DEC_interaction_packagedElement_718631 and _package 
					JavaSDM.ensure(!__DEC_interaction_packagedElement_718631
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

					// iterate to-many link message from message to __DEC_message_message_250520
					fujaba__Success = false;

					fujaba__IterMessageTo__DEC_message_message_250520 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(message,
											MessageEnd.class, "message"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageTo__DEC_message_message_250520
									.hasNext()) {
						try {
							__DEC_message_message_250520 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_250520
									.next();

							// check object __DEC_message_message_250520 is really bound
							JavaSDM.ensure(__DEC_message_message_250520 != null);
							// check isomorphic binding between objects __DEC_message_message_250520 and messageReceive 
							JavaSDM.ensure(!__DEC_message_message_250520
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

					// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_502602
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_502602 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_502602
									.hasNext()) {
						try {
							__DEC_messageReceive_receiveEvent_502602 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_502602
									.next();

							// check object __DEC_messageReceive_receiveEvent_502602 is really bound
							JavaSDM.ensure(__DEC_messageReceive_receiveEvent_502602 != null);
							// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_502602 and message 
							JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_502602
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

					// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_341076
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_341076 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_341076
									.hasNext()) {
						try {
							__DEC_messageReceive_sendEvent_341076 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_341076
									.next();

							// check object __DEC_messageReceive_sendEvent_341076 is really bound
							JavaSDM.ensure(__DEC_messageReceive_sendEvent_341076 != null);
							// check isomorphic binding between objects __DEC_messageReceive_sendEvent_341076 and message 
							JavaSDM.ensure(!__DEC_messageReceive_sendEvent_341076
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

				// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_340(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_724362 = null;
		MessageEnd __DEC_message_sendEvent_147643 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_92583 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_689145 = null;
		MessageEnd __DEC_message_message_689145 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678617 = null;
		Message __DEC_messageReceive_receiveEvent_678617 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_227415 = null;
		Message __DEC_messageReceive_sendEvent_227415 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
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

			// check object _edge_covered is really bound
			JavaSDM.ensure(_edge_covered != null);
			// bind object
			_TmpObject = _edge_covered.getSrc();

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

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// check link coveredBy from line to messageReceive
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
							__DEC_interaction_enclosingInteraction_724362 = interaction
									.getEnclosingInteraction();

							// check object __DEC_interaction_enclosingInteraction_724362 is really bound
							JavaSDM.ensure(__DEC_interaction_enclosingInteraction_724362 != null);

							// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_724362 and interaction 
							JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_724362
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
							__DEC_message_sendEvent_147643 = message
									.getSendEvent();

							// check object __DEC_message_sendEvent_147643 is really bound
							JavaSDM.ensure(__DEC_message_sendEvent_147643 != null);

							// check isomorphic binding between objects __DEC_message_sendEvent_147643 and messageReceive 
							JavaSDM.ensure(!__DEC_message_sendEvent_147643
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
							__DEC_interaction_packagedElement_92583 = interaction
									.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
									.eContainer() : null;

							// check object __DEC_interaction_packagedElement_92583 is really bound
							JavaSDM.ensure(__DEC_interaction_packagedElement_92583 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_interaction_packagedElement_92583
									.getPackagedElement().contains(interaction));

							// check isomorphic binding between objects __DEC_interaction_packagedElement_92583 and _package 
							JavaSDM.ensure(!__DEC_interaction_packagedElement_92583
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

							// iterate to-many link message from message to __DEC_message_message_689145
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_689145 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_689145
											.hasNext()) {
								try {
									__DEC_message_message_689145 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_689145
											.next();

									// check object __DEC_message_message_689145 is really bound
									JavaSDM.ensure(__DEC_message_message_689145 != null);
									// check isomorphic binding between objects __DEC_message_message_689145 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_689145
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_678617
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678617 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678617
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_678617 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678617
											.next();

									// check object __DEC_messageReceive_receiveEvent_678617 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_678617 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_678617 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_678617
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_227415
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_227415 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_227415
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_227415 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_227415
											.next();

									// check object __DEC_messageReceive_sendEvent_227415 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_227415 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_227415 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_227415
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

						// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_341(
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_256074 = null;
		MessageEnd __DEC_message_sendEvent_232771 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_327182 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_721818 = null;
		MessageEnd __DEC_message_message_721818 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_174384 = null;
		Message __DEC_messageReceive_receiveEvent_174384 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_897074 = null;
		Message __DEC_messageReceive_sendEvent_897074 = null;
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

							// check link coveredBy from line to messageReceive
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
									__DEC_interaction_enclosingInteraction_256074 = interaction
											.getEnclosingInteraction();

									// check object __DEC_interaction_enclosingInteraction_256074 is really bound
									JavaSDM.ensure(__DEC_interaction_enclosingInteraction_256074 != null);

									// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_256074 and interaction 
									JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_256074
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
									__DEC_message_sendEvent_232771 = message
											.getSendEvent();

									// check object __DEC_message_sendEvent_232771 is really bound
									JavaSDM.ensure(__DEC_message_sendEvent_232771 != null);

									// check isomorphic binding between objects __DEC_message_sendEvent_232771 and messageReceive 
									JavaSDM.ensure(!__DEC_message_sendEvent_232771
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
									__DEC_interaction_packagedElement_327182 = interaction
											.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
											.eContainer() : null;

									// check object __DEC_interaction_packagedElement_327182 is really bound
									JavaSDM.ensure(__DEC_interaction_packagedElement_327182 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_interaction_packagedElement_327182
											.getPackagedElement().contains(
													interaction));

									// check isomorphic binding between objects __DEC_interaction_packagedElement_327182 and _package 
									JavaSDM.ensure(!__DEC_interaction_packagedElement_327182
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

									// iterate to-many link message from message to __DEC_message_message_721818
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_721818 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_721818
													.hasNext()) {
										try {
											__DEC_message_message_721818 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_721818
													.next();

											// check object __DEC_message_message_721818 is really bound
											JavaSDM.ensure(__DEC_message_message_721818 != null);
											// check isomorphic binding between objects __DEC_message_message_721818 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_721818
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_174384
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_174384 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_174384
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_174384 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_174384
													.next();

											// check object __DEC_messageReceive_receiveEvent_174384 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_174384 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_174384 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_174384
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_897074
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_897074 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_897074
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_897074 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_897074
													.next();

											// check object __DEC_messageReceive_sendEvent_897074 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_897074 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_897074 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_897074
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

								// check link coveredBy from line to messageReceive
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_83(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_593846 = null;
		UseCase __DEC_basicFlow_flows_781231 = null;
		PackageDeclaration __DEC_useCase_useCases_112162 = null;
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
							__DEC_actor_actors_593846 = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
									.eContainer() : null;

							// check object __DEC_actor_actors_593846 is really bound
							JavaSDM.ensure(__DEC_actor_actors_593846 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_actor_actors_593846
									.getActors().contains(actor));

							// check isomorphic binding between objects __DEC_actor_actors_593846 and packageDeclaration 
							JavaSDM.ensure(!__DEC_actor_actors_593846
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
							__DEC_basicFlow_flows_781231 = basicFlow
									.eContainer() instanceof UseCase ? (UseCase) basicFlow
									.eContainer() : null;

							// check object __DEC_basicFlow_flows_781231 is really bound
							JavaSDM.ensure(__DEC_basicFlow_flows_781231 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_basicFlow_flows_781231
									.getFlows().contains(basicFlow));

							// check isomorphic binding between objects __DEC_basicFlow_flows_781231 and useCase 
							JavaSDM.ensure(!__DEC_basicFlow_flows_781231
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
							__DEC_useCase_useCases_112162 = useCase
									.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
									.eContainer() : null;

							// check object __DEC_useCase_useCases_112162 is really bound
							JavaSDM.ensure(__DEC_useCase_useCases_112162 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_useCase_useCases_112162
									.getUseCases().contains(useCase));

							// check isomorphic binding between objects __DEC_useCase_useCases_112162 and packageDeclaration 
							JavaSDM.ensure(!__DEC_useCase_useCases_112162
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
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
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
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_331__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_331((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_332__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_332((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_333__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_333((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_334__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_334((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_335__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_335((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_336__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_336((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_337__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_337((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_338__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_338((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_81((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_82((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_339__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_339((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_340__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_340((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_341__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_341((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_83((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCasePrecondToFoundMessageRuleImpl
