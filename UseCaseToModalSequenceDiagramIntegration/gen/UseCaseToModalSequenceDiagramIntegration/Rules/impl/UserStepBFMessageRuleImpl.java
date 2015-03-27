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

import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBFToMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule;

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
 * An implementation of the model object '<em><b>User Step BF Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserStepBFMessageRuleImpl extends AbstractRuleImpl implements
		UserStepBFMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStepBFMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserStepBFMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			UseCase useCase, NormalStep step) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __useCase_flows_flow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object sysActor is really bound
			JavaSDM.ensure(sysActor != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, actor,
					sysActor, packageDeclaration, flow, useCase, step));

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
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object sysActor is really bound
				JavaSDM.ensure(sysActor != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects sysActor and actor 
				JavaSDM.ensure(!sysActor.equals(actor));

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_actor_actor
				__step_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __flow_steps_step
				__flow_steps_step.setName("steps");
				// assign attribute __step_actor_actor
				__step_actor_actor.setName("actor");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				__step_actor_actor.setTrg(actor);

				// create link
				__flow_steps_step.setSrc(flow);

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__step_actor_actor.setSrc(step);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object sysActor is really bound
				JavaSDM.ensure(sysActor != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects sysActor and actor 
				JavaSDM.ensure(!sysActor.equals(actor));

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_sysActor
				__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __packageDeclaration_actors_sysActor
				__packageDeclaration_actors_sysActor.setName("actors");
				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_sysActor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysActor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__packageDeclaration_actors_sysActor.setTrg(sysActor);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_sysActor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, actor, sysActor,
					packageDeclaration, flow, useCase, step);
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
		ActorToLifeline actorToLine = null;
		BasicFlow flow = null;
		FlowToInteractionFragment flowToInteraction = null;
		Interaction interaction = null;
		Lifeline line = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		Actor sysActor = null;
		ActorToLifeline sysActorToSysLine = null;
		Lifeline sysLine = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge messageSend__covered__sysLine = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge interaction__fragment__messageSend = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge sysLine__coveredBy__messageSend = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge messageSend__enclosingInteraction__interaction = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge stepToMessage__source__step = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("actorToLine"));

			// ensure correct type and really bound of object actorToLine
			JavaSDM.ensure(_TmpObject instanceof ActorToLifeline);
			actorToLine = (ActorToLifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToInteraction"));

			// ensure correct type and really bound of object flowToInteraction
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToInteraction = (FlowToInteractionFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysActor"));

			// ensure correct type and really bound of object sysActor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			sysActor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysActorToSysLine"));

			// ensure correct type and really bound of object sysActorToSysLine
			JavaSDM.ensure(_TmpObject instanceof ActorToLifeline);
			sysActorToSysLine = (ActorToLifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysLine"));

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCaseToInteraction"));

			// ensure correct type and really bound of object useCaseToInteraction
			JavaSDM.ensure(_TmpObject instanceof UseCaseToInteraction);
			useCaseToInteraction = (UseCaseToInteraction) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			// check isomorphic binding between objects sysActorToSysLine and actorToLine 
			JavaSDM.ensure(!sysActorToSysLine.equals(actorToLine));

			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

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
			// create object messageSend
			messageSend = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object message
			message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// assign attribute message
			message.setName((java.lang.String) csp.getValue("message", "name"));
			// assign attribute message
			message.setMessageSort((ModalSequenceDiagram.MessageSort) csp
					.getValue("message", "messageSort"));
			// assign attribute message
			message.setMessageKind((ModalSequenceDiagram.MessageKind) csp
					.getValue("message", "messageKind"));

			// create link
			messageSend.getCovered().add(sysLine);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageSend,
					message, "message");

			// create link
			message.setSendEvent(messageSend);

			// create link
			interaction.getFragment().add(messageSend);

			// create link
			message.setInteraction(interaction);

			// create link
			messageReceive.setEnclosingInteraction(interaction);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageReceive,
					message, "message");

			// create link
			line.getCoveredBy().add(messageReceive);

			// create link
			message.setReceiveEvent(messageReceive);

			// create link
			stepToMessage.setSource(step);

			// create link
			stepToMessage.setTarget(message);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");
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
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowToInteraction is really bound
			JavaSDM.ensure(flowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check object sysActor is really bound
			JavaSDM.ensure(sysActor != null);
			// check object sysActorToSysLine is really bound
			JavaSDM.ensure(sysActorToSysLine != null);
			// check object sysLine is really bound
			JavaSDM.ensure(sysLine != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowToInteraction and actor 
			JavaSDM.ensure(!flowToInteraction.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects message and actor 
			JavaSDM.ensure(!message.equals(actor));

			// check isomorphic binding between objects messageReceive and actor 
			JavaSDM.ensure(!messageReceive.equals(actor));

			// check isomorphic binding between objects messageSend and actor 
			JavaSDM.ensure(!messageSend.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects step and actor 
			JavaSDM.ensure(!step.equals(actor));

			// check isomorphic binding between objects stepToMessage and actor 
			JavaSDM.ensure(!stepToMessage.equals(actor));

			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			// check isomorphic binding between objects sysActorToSysLine and actor 
			JavaSDM.ensure(!sysActorToSysLine.equals(actor));

			// check isomorphic binding between objects sysLine and actor 
			JavaSDM.ensure(!sysLine.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects flowToInteraction and actorToLine 
			JavaSDM.ensure(!flowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects message and actorToLine 
			JavaSDM.ensure(!message.equals(actorToLine));

			// check isomorphic binding between objects messageReceive and actorToLine 
			JavaSDM.ensure(!messageReceive.equals(actorToLine));

			// check isomorphic binding between objects messageSend and actorToLine 
			JavaSDM.ensure(!messageSend.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects step and actorToLine 
			JavaSDM.ensure(!step.equals(actorToLine));

			// check isomorphic binding between objects stepToMessage and actorToLine 
			JavaSDM.ensure(!stepToMessage.equals(actorToLine));

			// check isomorphic binding between objects sysActor and actorToLine 
			JavaSDM.ensure(!sysActor.equals(actorToLine));

			// check isomorphic binding between objects sysActorToSysLine and actorToLine 
			JavaSDM.ensure(!sysActorToSysLine.equals(actorToLine));

			// check isomorphic binding between objects sysLine and actorToLine 
			JavaSDM.ensure(!sysLine.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

			// check isomorphic binding between objects flowToInteraction and flow 
			JavaSDM.ensure(!flowToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and flow 
			JavaSDM.ensure(!interaction.equals(flow));

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

			// check isomorphic binding between objects message and flow 
			JavaSDM.ensure(!message.equals(flow));

			// check isomorphic binding between objects messageReceive and flow 
			JavaSDM.ensure(!messageReceive.equals(flow));

			// check isomorphic binding between objects messageSend and flow 
			JavaSDM.ensure(!messageSend.equals(flow));

			// check isomorphic binding between objects packageDeclaration and flow 
			JavaSDM.ensure(!packageDeclaration.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToMessage and flow 
			JavaSDM.ensure(!stepToMessage.equals(flow));

			// check isomorphic binding between objects sysActor and flow 
			JavaSDM.ensure(!sysActor.equals(flow));

			// check isomorphic binding between objects sysActorToSysLine and flow 
			JavaSDM.ensure(!sysActorToSysLine.equals(flow));

			// check isomorphic binding between objects sysLine and flow 
			JavaSDM.ensure(!sysLine.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and flowToInteraction 
			JavaSDM.ensure(!interaction.equals(flowToInteraction));

			// check isomorphic binding between objects line and flowToInteraction 
			JavaSDM.ensure(!line.equals(flowToInteraction));

			// check isomorphic binding between objects message and flowToInteraction 
			JavaSDM.ensure(!message.equals(flowToInteraction));

			// check isomorphic binding between objects messageReceive and flowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(flowToInteraction));

			// check isomorphic binding between objects messageSend and flowToInteraction 
			JavaSDM.ensure(!messageSend.equals(flowToInteraction));

			// check isomorphic binding between objects packageDeclaration and flowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(flowToInteraction));

			// check isomorphic binding between objects step and flowToInteraction 
			JavaSDM.ensure(!step.equals(flowToInteraction));

			// check isomorphic binding between objects stepToMessage and flowToInteraction 
			JavaSDM.ensure(!stepToMessage.equals(flowToInteraction));

			// check isomorphic binding between objects sysActor and flowToInteraction 
			JavaSDM.ensure(!sysActor.equals(flowToInteraction));

			// check isomorphic binding between objects sysActorToSysLine and flowToInteraction 
			JavaSDM.ensure(!sysActorToSysLine.equals(flowToInteraction));

			// check isomorphic binding between objects sysLine and flowToInteraction 
			JavaSDM.ensure(!sysLine.equals(flowToInteraction));

			// check isomorphic binding between objects useCase and flowToInteraction 
			JavaSDM.ensure(!useCase.equals(flowToInteraction));

			// check isomorphic binding between objects useCaseToInteraction and flowToInteraction 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToInteraction));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects messageSend and interaction 
			JavaSDM.ensure(!messageSend.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects step and interaction 
			JavaSDM.ensure(!step.equals(interaction));

			// check isomorphic binding between objects stepToMessage and interaction 
			JavaSDM.ensure(!stepToMessage.equals(interaction));

			// check isomorphic binding between objects sysActor and interaction 
			JavaSDM.ensure(!sysActor.equals(interaction));

			// check isomorphic binding between objects sysActorToSysLine and interaction 
			JavaSDM.ensure(!sysActorToSysLine.equals(interaction));

			// check isomorphic binding between objects sysLine and interaction 
			JavaSDM.ensure(!sysLine.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects useCaseToInteraction and interaction 
			JavaSDM.ensure(!useCaseToInteraction.equals(interaction));

			// check isomorphic binding between objects message and line 
			JavaSDM.ensure(!message.equals(line));

			// check isomorphic binding between objects messageReceive and line 
			JavaSDM.ensure(!messageReceive.equals(line));

			// check isomorphic binding between objects messageSend and line 
			JavaSDM.ensure(!messageSend.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToMessage and line 
			JavaSDM.ensure(!stepToMessage.equals(line));

			// check isomorphic binding between objects sysActor and line 
			JavaSDM.ensure(!sysActor.equals(line));

			// check isomorphic binding between objects sysActorToSysLine and line 
			JavaSDM.ensure(!sysActorToSysLine.equals(line));

			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects useCaseToInteraction and line 
			JavaSDM.ensure(!useCaseToInteraction.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects messageSend and message 
			JavaSDM.ensure(!messageSend.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects step and message 
			JavaSDM.ensure(!step.equals(message));

			// check isomorphic binding between objects stepToMessage and message 
			JavaSDM.ensure(!stepToMessage.equals(message));

			// check isomorphic binding between objects sysActor and message 
			JavaSDM.ensure(!sysActor.equals(message));

			// check isomorphic binding between objects sysActorToSysLine and message 
			JavaSDM.ensure(!sysActorToSysLine.equals(message));

			// check isomorphic binding between objects sysLine and message 
			JavaSDM.ensure(!sysLine.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects useCaseToInteraction and message 
			JavaSDM.ensure(!useCaseToInteraction.equals(message));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects step and messageReceive 
			JavaSDM.ensure(!step.equals(messageReceive));

			// check isomorphic binding between objects stepToMessage and messageReceive 
			JavaSDM.ensure(!stepToMessage.equals(messageReceive));

			// check isomorphic binding between objects sysActor and messageReceive 
			JavaSDM.ensure(!sysActor.equals(messageReceive));

			// check isomorphic binding between objects sysActorToSysLine and messageReceive 
			JavaSDM.ensure(!sysActorToSysLine.equals(messageReceive));

			// check isomorphic binding between objects sysLine and messageReceive 
			JavaSDM.ensure(!sysLine.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToInteraction and messageReceive 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageReceive));

			// check isomorphic binding between objects packageDeclaration and messageSend 
			JavaSDM.ensure(!packageDeclaration.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToMessage and messageSend 
			JavaSDM.ensure(!stepToMessage.equals(messageSend));

			// check isomorphic binding between objects sysActor and messageSend 
			JavaSDM.ensure(!sysActor.equals(messageSend));

			// check isomorphic binding between objects sysActorToSysLine and messageSend 
			JavaSDM.ensure(!sysActorToSysLine.equals(messageSend));

			// check isomorphic binding between objects sysLine and messageSend 
			JavaSDM.ensure(!sysLine.equals(messageSend));

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects sysActor and packageDeclaration 
			JavaSDM.ensure(!sysActor.equals(packageDeclaration));

			// check isomorphic binding between objects sysActorToSysLine and packageDeclaration 
			JavaSDM.ensure(!sysActorToSysLine.equals(packageDeclaration));

			// check isomorphic binding between objects sysLine and packageDeclaration 
			JavaSDM.ensure(!sysLine.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects sysActor and step 
			JavaSDM.ensure(!sysActor.equals(step));

			// check isomorphic binding between objects sysActorToSysLine and step 
			JavaSDM.ensure(!sysActorToSysLine.equals(step));

			// check isomorphic binding between objects sysLine and step 
			JavaSDM.ensure(!sysLine.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects sysActor and stepToMessage 
			JavaSDM.ensure(!sysActor.equals(stepToMessage));

			// check isomorphic binding between objects sysActorToSysLine and stepToMessage 
			JavaSDM.ensure(!sysActorToSysLine.equals(stepToMessage));

			// check isomorphic binding between objects sysLine and stepToMessage 
			JavaSDM.ensure(!sysLine.equals(stepToMessage));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects sysActorToSysLine and sysActor 
			JavaSDM.ensure(!sysActorToSysLine.equals(sysActor));

			// check isomorphic binding between objects sysLine and sysActor 
			JavaSDM.ensure(!sysLine.equals(sysActor));

			// check isomorphic binding between objects useCase and sysActor 
			JavaSDM.ensure(!useCase.equals(sysActor));

			// check isomorphic binding between objects useCaseToInteraction and sysActor 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysActor));

			// check isomorphic binding between objects sysLine and sysActorToSysLine 
			JavaSDM.ensure(!sysLine.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCase and sysActorToSysLine 
			JavaSDM.ensure(!useCase.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCaseToInteraction and sysActorToSysLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCase and sysLine 
			JavaSDM.ensure(!useCase.equals(sysLine));

			// check isomorphic binding between objects useCaseToInteraction and sysLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysLine));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__covered__sysLine
			messageSend__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageSend
			interaction__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingInteraction__interaction
			messageSend__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserStepBFMessageRule");
			// assign attribute sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__sysLine
			messageSend__covered__sysLine.setName("covered");
			// assign attribute messageSend__enclosingInteraction__interaction
			messageSend__enclosingInteraction__interaction
					.setName("enclosingInteraction");
			// assign attribute interaction__fragment__messageSend
			interaction__fragment__messageSend.setName("fragment");
			// assign attribute messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction
					.setName("enclosingInteraction");
			// assign attribute interaction__fragment__messageReceive
			interaction__fragment__messageReceive.setName("fragment");
			// assign attribute __flow_steps_step
			__flow_steps_step.setName("steps");
			// assign attribute __step_actor_actor
			__step_actor_actor.setName("actor");
			// assign attribute message__sendEvent__messageSend
			message__sendEvent__messageSend.setName("sendEvent");
			// assign attribute message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive.setName("receiveEvent");
			// assign attribute message__interaction__interaction
			message__interaction__interaction.setName("interaction");
			// assign attribute interaction__message__message
			interaction__message__message.setName("message");
			// assign attribute stepToMessage__source__step
			stepToMessage__source__step.setName("source");
			// assign attribute stepToMessage__target__message
			stepToMessage__target__message.setName("target");
			// assign attribute messageSend__message__message
			messageSend__message__message.setName("message");
			// assign attribute messageReceive__message__message
			messageReceive__message__message.setName("message");
			// assign attribute line__coveredBy__messageReceive
			line__coveredBy__messageReceive.setName("coveredBy");
			// assign attribute messageReceive__covered__line
			messageReceive__covered__line.setName("covered");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			messageSend__covered__sysLine.setTrg(sysLine);

			// create link
			sysLine__coveredBy__messageSend.setSrc(sysLine);

			// create link
			messageSend__enclosingInteraction__interaction.setSrc(messageSend);

			// create link
			message__sendEvent__messageSend.setTrg(messageSend);

			// create link
			messageSend__message__message.setSrc(messageSend);

			// create link
			messageSend__covered__sysLine.setSrc(messageSend);

			// create link
			sysLine__coveredBy__messageSend.setTrg(messageSend);

			// create link
			interaction__fragment__messageSend.setTrg(messageSend);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__messageSend.setSrc(interaction);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			messageSend__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setSrc(messageReceive);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			interaction__fragment__messageReceive.setTrg(messageReceive);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, actor, sysActor,
				packageDeclaration, sysLine, sysActorToSysLine, messageSend,
				interaction, messageReceive, flow, flowToInteraction, useCase,
				useCaseToInteraction, step, message, stepToMessage, line,
				actorToLine);
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
		BasicFlow flow = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		Actor sysActor = null;
		UseCase useCase = null;
		EMoflonEdge __actorToLine_source_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __actorToLine_target_line = null;
		CSP csp = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Lifeline line = null;
		Iterator fujaba__IterActorToActorToLine = null;
		ActorToLifeline actorToLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterSysActorToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		Iterator fujaba__IterFlowToFlowToInteraction = null;
		FlowToInteractionFragment flowToInteraction = null;

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
			ruleresult.setRule("UserStepBFMessageRule");

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
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;
			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("sysActor"));

			// ensure correct type and really bound of object sysActor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			sysActor = (Actor) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			// iterate to-many link source from flow to flowToInteraction
			fujaba__Success = false;

			fujaba__IterFlowToFlowToInteraction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							FlowToInteractionFragment.class, "source"))
					.iterator();

			while (fujaba__IterFlowToFlowToInteraction.hasNext()) {
				try {
					flowToInteraction = (FlowToInteractionFragment) fujaba__IterFlowToFlowToInteraction
							.next();

					// check object flowToInteraction is really bound
					JavaSDM.ensure(flowToInteraction != null);
					// iterate to-many link source from sysActor to sysActorToSysLine
					fujaba__Success = false;

					fujaba__IterSysActorToSysActorToSysLine = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(sysActor,
											ActorToLifeline.class, "source"))
							.iterator();

					while (fujaba__IterSysActorToSysActorToSysLine.hasNext()) {
						try {
							sysActorToSysLine = (ActorToLifeline) fujaba__IterSysActorToSysActorToSysLine
									.next();

							// check object sysActorToSysLine is really bound
							JavaSDM.ensure(sysActorToSysLine != null);
							// bind object
							sysLine = sysActorToSysLine.getTarget();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);

							// iterate to-many link source from actor to actorToLine
							fujaba__Success = false;

							fujaba__IterActorToActorToLine = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(actor,
													ActorToLifeline.class,
													"source")).iterator();

							while (fujaba__IterActorToActorToLine.hasNext()) {
								try {
									actorToLine = (ActorToLifeline) fujaba__IterActorToActorToLine
											.next();

									// check object actorToLine is really bound
									JavaSDM.ensure(actorToLine != null);
									// check isomorphic binding between objects sysActorToSysLine and actorToLine 
									JavaSDM.ensure(!sysActorToSysLine
											.equals(actorToLine));

									// bind object
									line = actorToLine.getTarget();

									// check object line is really bound
									JavaSDM.ensure(line != null);

									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// iterate to-many link source from useCase to useCaseToInteraction
									fujaba__Success = false;

									fujaba__IterUseCaseToUseCaseToInteraction = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															useCase,
															UseCaseToInteraction.class,
															"source"))
											.iterator();

									while (fujaba__IterUseCaseToUseCaseToInteraction
											.hasNext()) {
										try {
											useCaseToInteraction = (UseCaseToInteraction) fujaba__IterUseCaseToUseCaseToInteraction
													.next();

											// check object useCaseToInteraction is really bound
											JavaSDM.ensure(useCaseToInteraction != null);
											// bind object
											interaction = useCaseToInteraction
													.getTarget();

											// check object interaction is really bound
											JavaSDM.ensure(interaction != null);

											// check link target from flowToInteraction to interaction
											JavaSDM.ensure(interaction
													.equals(flowToInteraction
															.getTarget()));

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check object actor is really bound
												JavaSDM.ensure(actor != null);
												// check object actorToLine is really bound
												JavaSDM.ensure(actorToLine != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object flowToInteraction is really bound
												JavaSDM.ensure(flowToInteraction != null);
												// check object interaction is really bound
												JavaSDM.ensure(interaction != null);
												// check object line is really bound
												JavaSDM.ensure(line != null);
												// check object packageDeclaration is really bound
												JavaSDM.ensure(packageDeclaration != null);
												// check object step is really bound
												JavaSDM.ensure(step != null);
												// check object sysActor is really bound
												JavaSDM.ensure(sysActor != null);
												// check object sysActorToSysLine is really bound
												JavaSDM.ensure(sysActorToSysLine != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check object useCase is really bound
												JavaSDM.ensure(useCase != null);
												// check object useCaseToInteraction is really bound
												JavaSDM.ensure(useCaseToInteraction != null);
												// check isomorphic binding between objects sysActor and actor 
												JavaSDM.ensure(!sysActor
														.equals(actor));

												// check isomorphic binding between objects sysActorToSysLine and actorToLine 
												JavaSDM.ensure(!sysActorToSysLine
														.equals(actorToLine));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check link actor from step to actor
												JavaSDM.ensure(actor
														.equals(step.getActor()));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link actors from actor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(actor
																.eContainer()));

												// check link actors from sysActor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(sysActor
																.eContainer()));

												// check link flows from flow to useCase
												JavaSDM.ensure(useCase
														.equals(flow
																.eContainer()));

												// check link source from actorToLine to actor
												JavaSDM.ensure(actor
														.equals(actorToLine
																.getSource()));

												// check link source from flowToInteraction to flow
												JavaSDM.ensure(flow
														.equals(flowToInteraction
																.getSource()));

												// check link source from sysActorToSysLine to sysActor
												JavaSDM.ensure(sysActor
														.equals(sysActorToSysLine
																.getSource()));

												// check link source from useCaseToInteraction to useCase
												JavaSDM.ensure(useCase
														.equals(useCaseToInteraction
																.getSource()));

												// check link steps from step to flow
												JavaSDM.ensure(flow.equals(step
														.eContainer()));

												// check link target from actorToLine to line
												JavaSDM.ensure(line
														.equals(actorToLine
																.getTarget()));

												// check link target from flowToInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(flowToInteraction
																.getTarget()));

												// check link target from sysActorToSysLine to sysLine
												JavaSDM.ensure(sysLine
														.equals(sysActorToSysLine
																.getTarget()));

												// check link target from useCaseToInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(useCaseToInteraction
																.getTarget()));

												// check link useCases from useCase to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(useCase
																.eContainer()));

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_actor_actor
												__step_actor_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flow_steps_step
												__flow_steps_step = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCase_flows_flow
												__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_source_flow
												__flowToInteraction_source_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_target_line
												__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor
														.setName("actors");
												// assign attribute __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor
														.setName("actors");
												// assign attribute __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor
														.setName("source");
												// assign attribute __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine
														.setName("target");
												// assign attribute __flowToInteraction_source_flow
												__flowToInteraction_source_flow
														.setName("source");
												// assign attribute __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction
														.setName("target");
												// assign attribute __useCase_flows_flow
												__useCase_flows_flow
														.setName("flows");
												// assign attribute __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase
														.setName("source");
												// assign attribute __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction
														.setName("target");
												// assign attribute __flow_steps_step
												__flow_steps_step
														.setName("steps");
												// assign attribute __step_actor_actor
												__step_actor_actor
														.setName("actor");
												// assign attribute __line_interaction_interaction
												__line_interaction_interaction
														.setName("interaction");
												// assign attribute __interaction_lifeline_line
												__interaction_lifeline_line
														.setName("lifeline");
												// assign attribute __actorToLine_source_actor
												__actorToLine_source_actor
														.setName("source");
												// assign attribute __actorToLine_target_line
												__actorToLine_target_line
														.setName("target");
												// assign attribute __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase
														.setName("useCases");

												// create link
												__actorToLine_source_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

												// create link
												__packageDeclaration_actors_actor
														.setTrg(actor);

												// create link
												__step_actor_actor
														.setTrg(actor);

												// create link
												__sysActorToSysLine_source_sysActor
														.setTrg(sysActor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActor);

												// create link
												__packageDeclaration_actors_sysActor
														.setTrg(sysActor);

												// create link
												__packageDeclaration_actors_sysActor
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_actor
														.setSrc(packageDeclaration);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(packageDeclaration);

												// create link
												__packageDeclaration_useCases_useCase
														.setSrc(packageDeclaration);

												// create link
												__sysActorToSysLine_target_sysLine
														.setTrg(sysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setSrc(sysActorToSysLine);

												// create link
												__sysActorToSysLine_source_sysActor
														.setSrc(sysActorToSysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActorToSysLine);

												// create link
												__line_interaction_interaction
														.setTrg(interaction);

												// create link
												__interaction_lifeline_line
														.setSrc(interaction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(interaction);

												// create link
												__flowToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__flow_steps_step.setSrc(flow);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												__flowToInteraction_source_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flowToInteraction);

												// create link
												__flowToInteraction_source_flow
														.setSrc(flowToInteraction);

												// create link
												__flowToInteraction_target_interaction
														.setSrc(flowToInteraction);

												// create link
												__useCase_flows_flow
														.setSrc(useCase);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

												// create link
												__useCaseToInteraction_source_useCase
														.setTrg(useCase);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCase);

												// create link
												__useCaseToInteraction_target_interaction
														.setSrc(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												__useCaseToInteraction_source_useCase
														.setSrc(useCaseToInteraction);

												// create link
												__flow_steps_step.setTrg(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(step);

												// create link
												__step_actor_actor.setSrc(step);

												// create link
												__interaction_lifeline_line
														.setTrg(line);

												// create link
												__actorToLine_target_line
														.setTrg(line);

												// create link
												__line_interaction_interaction
														.setSrc(line);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(line);

												// create link
												__actorToLine_target_line
														.setSrc(actorToLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actorToLine);

												// create link
												__actorToLine_source_actor
														.setSrc(actorToLine);

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flowToInteraction_target_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flowToInteraction_source_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__actorToLine_target_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__sysActorToSysLine_target_sysLine,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__step_actor_actor,
																"allContextElements");

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
																__sysActorToSysLine_source_sysActor,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCaseToInteraction_source_useCase,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCaseToInteraction_target_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCase_flows_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__packageDeclaration_useCases_useCase,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flow_steps_step,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__packageDeclaration_actors_sysActor,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__interaction_lifeline_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__line_interaction_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__actorToLine_source_actor,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_FWD(
																	isApplicableMatch,
																	actor,
																	sysActor,
																	packageDeclaration,
																	sysLine,
																	sysActorToSysLine,
																	interaction,
																	flow,
																	flowToInteraction,
																	useCase,
																	useCaseToInteraction,
																	step, line,
																	actorToLine));

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
																.setRuleName("UserStepBFMessageRule");
														// assign attribute ruleresult
														ruleresult
																.setSuccess(true);

														// create link
														ruleresult
																.getIsApplicableMatch()
																.add(isApplicableMatch);

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
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, UseCase useCase, NormalStep step) {
		match.registerObject("actor", actor);
		match.registerObject("sysActor", sysActor);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, UseCase useCase, NormalStep step) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("String");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("EObject");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
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
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Lifeline line, ActorToLifeline actorToLine) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("String");

		// Create attribute variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", true, csp);
		var_step_name.setValue(step.getName());
		var_step_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("EObject");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("EObject");

		// Create constraints
		Eq eq = new Eq();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject line, EObject actorToLine) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

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
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object sysLine is really bound
			JavaSDM.ensure(sysLine != null);
			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, sysLine,
					messageSend, interaction, messageReceive, message, line));

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
				// check object message is really bound
				JavaSDM.ensure(message != null);
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// check object messageSend is really bound
				JavaSDM.ensure(messageSend != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageSend
				__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_sysLine
				__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_sysLine
				__messageSend_covered_sysLine.setName("covered");
				// assign attribute __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction
						.setName("enclosingInteraction");
				// assign attribute __interaction_fragment_messageSend
				__interaction_fragment_messageSend.setName("fragment");
				// assign attribute __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction
						.setName("enclosingInteraction");
				// assign attribute __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive.setName("fragment");
				// assign attribute __message_sendEvent_messageSend
				__message_sendEvent_messageSend.setName("sendEvent");
				// assign attribute __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive.setName("receiveEvent");
				// assign attribute __message_interaction_interaction
				__message_interaction_interaction.setName("interaction");
				// assign attribute __interaction_message_message
				__interaction_message_message.setName("message");
				// assign attribute __messageSend_message_message
				__messageSend_message_message.setName("message");
				// assign attribute __messageReceive_message_message
				__messageReceive_message_message.setName("message");
				// assign attribute __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive.setName("coveredBy");
				// assign attribute __messageReceive_covered_line
				__messageReceive_covered_line.setName("covered");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

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
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				__sysLine_coveredBy_messageSend.setSrc(sysLine);

				// create link
				__messageSend_covered_sysLine.setTrg(sysLine);

				// create link
				__interaction_fragment_messageSend.setTrg(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__messageSend_covered_sysLine.setSrc(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__sysLine_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setSrc(messageSend);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__interaction_fragment_messageSend.setSrc(interaction);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

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
				// check object message is really bound
				JavaSDM.ensure(message != null);
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// check object messageSend is really bound
				JavaSDM.ensure(messageSend != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysLine, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, sysLine, messageSend,
					interaction, messageReceive, message, line);
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
		Actor actor = null;
		ActorToLifeline actorToLine = null;
		BasicFlow flow = null;
		FlowToInteractionFragment flowToInteraction = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		PackageDeclaration packageDeclaration = null;
		Actor sysActor = null;
		ActorToLifeline sysActorToSysLine = null;
		Lifeline sysLine = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge flow__steps__step = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("actorToLine"));

			// ensure correct type and really bound of object actorToLine
			JavaSDM.ensure(_TmpObject instanceof ActorToLifeline);
			actorToLine = (ActorToLifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToInteraction"));

			// ensure correct type and really bound of object flowToInteraction
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToInteraction = (FlowToInteractionFragment) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("messageSend"));

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysActor"));

			// ensure correct type and really bound of object sysActor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			sysActor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysActorToSysLine"));

			// ensure correct type and really bound of object sysActorToSysLine
			JavaSDM.ensure(_TmpObject instanceof ActorToLifeline);
			sysActorToSysLine = (ActorToLifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sysLine"));

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCaseToInteraction"));

			// ensure correct type and really bound of object useCaseToInteraction
			JavaSDM.ensure(_TmpObject instanceof UseCaseToInteraction);
			useCaseToInteraction = (UseCaseToInteraction) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			// check isomorphic binding between objects sysActorToSysLine and actorToLine 
			JavaSDM.ensure(!sysActorToSysLine.equals(actorToLine));

			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

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
			// create object step
			step = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// assign attribute step
			step.setName((java.lang.String) csp.getValue("step", "name"));

			// create link
			stepToMessage.setTarget(message);

			// create link
			step.setActor(actor);

			// create link
			flow.getSteps().add(step); // add link

			// create link
			stepToMessage.setSource(step);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");
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
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowToInteraction is really bound
			JavaSDM.ensure(flowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check object sysActor is really bound
			JavaSDM.ensure(sysActor != null);
			// check object sysActorToSysLine is really bound
			JavaSDM.ensure(sysActorToSysLine != null);
			// check object sysLine is really bound
			JavaSDM.ensure(sysLine != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowToInteraction and actor 
			JavaSDM.ensure(!flowToInteraction.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

			// check isomorphic binding between objects message and actor 
			JavaSDM.ensure(!message.equals(actor));

			// check isomorphic binding between objects messageReceive and actor 
			JavaSDM.ensure(!messageReceive.equals(actor));

			// check isomorphic binding between objects messageSend and actor 
			JavaSDM.ensure(!messageSend.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects step and actor 
			JavaSDM.ensure(!step.equals(actor));

			// check isomorphic binding between objects stepToMessage and actor 
			JavaSDM.ensure(!stepToMessage.equals(actor));

			// check isomorphic binding between objects sysActor and actor 
			JavaSDM.ensure(!sysActor.equals(actor));

			// check isomorphic binding between objects sysActorToSysLine and actor 
			JavaSDM.ensure(!sysActorToSysLine.equals(actor));

			// check isomorphic binding between objects sysLine and actor 
			JavaSDM.ensure(!sysLine.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects flowToInteraction and actorToLine 
			JavaSDM.ensure(!flowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

			// check isomorphic binding between objects message and actorToLine 
			JavaSDM.ensure(!message.equals(actorToLine));

			// check isomorphic binding between objects messageReceive and actorToLine 
			JavaSDM.ensure(!messageReceive.equals(actorToLine));

			// check isomorphic binding between objects messageSend and actorToLine 
			JavaSDM.ensure(!messageSend.equals(actorToLine));

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

			// check isomorphic binding between objects step and actorToLine 
			JavaSDM.ensure(!step.equals(actorToLine));

			// check isomorphic binding between objects stepToMessage and actorToLine 
			JavaSDM.ensure(!stepToMessage.equals(actorToLine));

			// check isomorphic binding between objects sysActor and actorToLine 
			JavaSDM.ensure(!sysActor.equals(actorToLine));

			// check isomorphic binding between objects sysActorToSysLine and actorToLine 
			JavaSDM.ensure(!sysActorToSysLine.equals(actorToLine));

			// check isomorphic binding between objects sysLine and actorToLine 
			JavaSDM.ensure(!sysLine.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

			// check isomorphic binding between objects flowToInteraction and flow 
			JavaSDM.ensure(!flowToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and flow 
			JavaSDM.ensure(!interaction.equals(flow));

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

			// check isomorphic binding between objects message and flow 
			JavaSDM.ensure(!message.equals(flow));

			// check isomorphic binding between objects messageReceive and flow 
			JavaSDM.ensure(!messageReceive.equals(flow));

			// check isomorphic binding between objects messageSend and flow 
			JavaSDM.ensure(!messageSend.equals(flow));

			// check isomorphic binding between objects packageDeclaration and flow 
			JavaSDM.ensure(!packageDeclaration.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToMessage and flow 
			JavaSDM.ensure(!stepToMessage.equals(flow));

			// check isomorphic binding between objects sysActor and flow 
			JavaSDM.ensure(!sysActor.equals(flow));

			// check isomorphic binding between objects sysActorToSysLine and flow 
			JavaSDM.ensure(!sysActorToSysLine.equals(flow));

			// check isomorphic binding between objects sysLine and flow 
			JavaSDM.ensure(!sysLine.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and flowToInteraction 
			JavaSDM.ensure(!interaction.equals(flowToInteraction));

			// check isomorphic binding between objects line and flowToInteraction 
			JavaSDM.ensure(!line.equals(flowToInteraction));

			// check isomorphic binding between objects message and flowToInteraction 
			JavaSDM.ensure(!message.equals(flowToInteraction));

			// check isomorphic binding between objects messageReceive and flowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(flowToInteraction));

			// check isomorphic binding between objects messageSend and flowToInteraction 
			JavaSDM.ensure(!messageSend.equals(flowToInteraction));

			// check isomorphic binding between objects packageDeclaration and flowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(flowToInteraction));

			// check isomorphic binding between objects step and flowToInteraction 
			JavaSDM.ensure(!step.equals(flowToInteraction));

			// check isomorphic binding between objects stepToMessage and flowToInteraction 
			JavaSDM.ensure(!stepToMessage.equals(flowToInteraction));

			// check isomorphic binding between objects sysActor and flowToInteraction 
			JavaSDM.ensure(!sysActor.equals(flowToInteraction));

			// check isomorphic binding between objects sysActorToSysLine and flowToInteraction 
			JavaSDM.ensure(!sysActorToSysLine.equals(flowToInteraction));

			// check isomorphic binding between objects sysLine and flowToInteraction 
			JavaSDM.ensure(!sysLine.equals(flowToInteraction));

			// check isomorphic binding between objects useCase and flowToInteraction 
			JavaSDM.ensure(!useCase.equals(flowToInteraction));

			// check isomorphic binding between objects useCaseToInteraction and flowToInteraction 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToInteraction));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects messageSend and interaction 
			JavaSDM.ensure(!messageSend.equals(interaction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects step and interaction 
			JavaSDM.ensure(!step.equals(interaction));

			// check isomorphic binding between objects stepToMessage and interaction 
			JavaSDM.ensure(!stepToMessage.equals(interaction));

			// check isomorphic binding between objects sysActor and interaction 
			JavaSDM.ensure(!sysActor.equals(interaction));

			// check isomorphic binding between objects sysActorToSysLine and interaction 
			JavaSDM.ensure(!sysActorToSysLine.equals(interaction));

			// check isomorphic binding between objects sysLine and interaction 
			JavaSDM.ensure(!sysLine.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects useCaseToInteraction and interaction 
			JavaSDM.ensure(!useCaseToInteraction.equals(interaction));

			// check isomorphic binding between objects message and line 
			JavaSDM.ensure(!message.equals(line));

			// check isomorphic binding between objects messageReceive and line 
			JavaSDM.ensure(!messageReceive.equals(line));

			// check isomorphic binding between objects messageSend and line 
			JavaSDM.ensure(!messageSend.equals(line));

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToMessage and line 
			JavaSDM.ensure(!stepToMessage.equals(line));

			// check isomorphic binding between objects sysActor and line 
			JavaSDM.ensure(!sysActor.equals(line));

			// check isomorphic binding between objects sysActorToSysLine and line 
			JavaSDM.ensure(!sysActorToSysLine.equals(line));

			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects useCaseToInteraction and line 
			JavaSDM.ensure(!useCaseToInteraction.equals(line));

			// check isomorphic binding between objects messageReceive and message 
			JavaSDM.ensure(!messageReceive.equals(message));

			// check isomorphic binding between objects messageSend and message 
			JavaSDM.ensure(!messageSend.equals(message));

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

			// check isomorphic binding between objects step and message 
			JavaSDM.ensure(!step.equals(message));

			// check isomorphic binding between objects stepToMessage and message 
			JavaSDM.ensure(!stepToMessage.equals(message));

			// check isomorphic binding between objects sysActor and message 
			JavaSDM.ensure(!sysActor.equals(message));

			// check isomorphic binding between objects sysActorToSysLine and message 
			JavaSDM.ensure(!sysActorToSysLine.equals(message));

			// check isomorphic binding between objects sysLine and message 
			JavaSDM.ensure(!sysLine.equals(message));

			// check isomorphic binding between objects useCase and message 
			JavaSDM.ensure(!useCase.equals(message));

			// check isomorphic binding between objects useCaseToInteraction and message 
			JavaSDM.ensure(!useCaseToInteraction.equals(message));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

			// check isomorphic binding between objects step and messageReceive 
			JavaSDM.ensure(!step.equals(messageReceive));

			// check isomorphic binding between objects stepToMessage and messageReceive 
			JavaSDM.ensure(!stepToMessage.equals(messageReceive));

			// check isomorphic binding between objects sysActor and messageReceive 
			JavaSDM.ensure(!sysActor.equals(messageReceive));

			// check isomorphic binding between objects sysActorToSysLine and messageReceive 
			JavaSDM.ensure(!sysActorToSysLine.equals(messageReceive));

			// check isomorphic binding between objects sysLine and messageReceive 
			JavaSDM.ensure(!sysLine.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToInteraction and messageReceive 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageReceive));

			// check isomorphic binding between objects packageDeclaration and messageSend 
			JavaSDM.ensure(!packageDeclaration.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToMessage and messageSend 
			JavaSDM.ensure(!stepToMessage.equals(messageSend));

			// check isomorphic binding between objects sysActor and messageSend 
			JavaSDM.ensure(!sysActor.equals(messageSend));

			// check isomorphic binding between objects sysActorToSysLine and messageSend 
			JavaSDM.ensure(!sysActorToSysLine.equals(messageSend));

			// check isomorphic binding between objects sysLine and messageSend 
			JavaSDM.ensure(!sysLine.equals(messageSend));

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects sysActor and packageDeclaration 
			JavaSDM.ensure(!sysActor.equals(packageDeclaration));

			// check isomorphic binding between objects sysActorToSysLine and packageDeclaration 
			JavaSDM.ensure(!sysActorToSysLine.equals(packageDeclaration));

			// check isomorphic binding between objects sysLine and packageDeclaration 
			JavaSDM.ensure(!sysLine.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects sysActor and step 
			JavaSDM.ensure(!sysActor.equals(step));

			// check isomorphic binding between objects sysActorToSysLine and step 
			JavaSDM.ensure(!sysActorToSysLine.equals(step));

			// check isomorphic binding between objects sysLine and step 
			JavaSDM.ensure(!sysLine.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects sysActor and stepToMessage 
			JavaSDM.ensure(!sysActor.equals(stepToMessage));

			// check isomorphic binding between objects sysActorToSysLine and stepToMessage 
			JavaSDM.ensure(!sysActorToSysLine.equals(stepToMessage));

			// check isomorphic binding between objects sysLine and stepToMessage 
			JavaSDM.ensure(!sysLine.equals(stepToMessage));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects sysActorToSysLine and sysActor 
			JavaSDM.ensure(!sysActorToSysLine.equals(sysActor));

			// check isomorphic binding between objects sysLine and sysActor 
			JavaSDM.ensure(!sysLine.equals(sysActor));

			// check isomorphic binding between objects useCase and sysActor 
			JavaSDM.ensure(!useCase.equals(sysActor));

			// check isomorphic binding between objects useCaseToInteraction and sysActor 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysActor));

			// check isomorphic binding between objects sysLine and sysActorToSysLine 
			JavaSDM.ensure(!sysLine.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCase and sysActorToSysLine 
			JavaSDM.ensure(!useCase.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCaseToInteraction and sysActorToSysLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysActorToSysLine));

			// check isomorphic binding between objects useCase and sysLine 
			JavaSDM.ensure(!useCase.equals(sysLine));

			// check isomorphic binding between objects useCaseToInteraction and sysLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(sysLine));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object __messageSend_enclosingInteraction_interaction
			__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_sysLine
			__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageSend
			__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserStepBFMessageRule");
			// assign attribute __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_sysLine
			__messageSend_covered_sysLine.setName("covered");
			// assign attribute __messageSend_enclosingInteraction_interaction
			__messageSend_enclosingInteraction_interaction
					.setName("enclosingInteraction");
			// assign attribute __interaction_fragment_messageSend
			__interaction_fragment_messageSend.setName("fragment");
			// assign attribute __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction
					.setName("enclosingInteraction");
			// assign attribute __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive.setName("fragment");
			// assign attribute flow__steps__step
			flow__steps__step.setName("steps");
			// assign attribute step__actor__actor
			step__actor__actor.setName("actor");
			// assign attribute __message_sendEvent_messageSend
			__message_sendEvent_messageSend.setName("sendEvent");
			// assign attribute __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive.setName("receiveEvent");
			// assign attribute __message_interaction_interaction
			__message_interaction_interaction.setName("interaction");
			// assign attribute __interaction_message_message
			__interaction_message_message.setName("message");
			// assign attribute stepToMessage__source__step
			stepToMessage__source__step.setName("source");
			// assign attribute stepToMessage__target__message
			stepToMessage__target__message.setName("target");
			// assign attribute __messageSend_message_message
			__messageSend_message_message.setName("message");
			// assign attribute __messageReceive_message_message
			__messageReceive_message_message.setName("message");
			// assign attribute __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive.setName("coveredBy");
			// assign attribute __messageReceive_covered_line
			__messageReceive_covered_line.setName("covered");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__sysLine_coveredBy_messageSend.setSrc(sysLine);

			// create link
			__messageSend_covered_sysLine.setTrg(sysLine);

			// create link
			__interaction_fragment_messageSend.setTrg(messageSend);

			// create link
			__sysLine_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__messageSend_enclosingInteraction_interaction.setSrc(messageSend);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__messageSend_covered_sysLine.setSrc(messageSend);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_messageSend.setSrc(interaction);

			// create link
			__messageSend_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, actor, sysActor,
				packageDeclaration, sysLine, sysActorToSysLine, messageSend,
				interaction, messageReceive, flow, flowToInteraction, useCase,
				useCaseToInteraction, step, message, stepToMessage, line,
				actorToLine);
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
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		Lifeline sysLine = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __actorToLine_source_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __actorToLine_target_line = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Actor actor = null;
		Iterator fujaba__IterLineToActorToLine = null;
		ActorToLifeline actorToLine = null;
		Actor sysActor = null;
		Iterator fujaba__IterSysLineToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		BasicFlow flow = null;
		Iterator fujaba__IterInteractionToFlowToInteraction = null;
		FlowToInteractionFragment flowToInteraction = null;

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
			ruleresult.setRule("UserStepBFMessageRule");

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
			_TmpObject = (match.getObject("message"));

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;
			_TmpObject = (match.getObject("messageReceive"));

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;
			_TmpObject = (match.getObject("messageSend"));

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;
			_TmpObject = (match.getObject("sysLine"));

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects sysLine and line 
			JavaSDM.ensure(!sysLine.equals(line));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// iterate to-many link target from interaction to flowToInteraction
			fujaba__Success = false;

			fujaba__IterInteractionToFlowToInteraction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							interaction, FlowToInteractionFragment.class,
							"target")).iterator();

			while (fujaba__IterInteractionToFlowToInteraction.hasNext()) {
				try {
					flowToInteraction = (FlowToInteractionFragment) fujaba__IterInteractionToFlowToInteraction
							.next();

					// check object flowToInteraction is really bound
					JavaSDM.ensure(flowToInteraction != null);
					// bind object
					_TmpObject = flowToInteraction.getSource();

					// ensure correct type and really bound of object flow
					JavaSDM.ensure(_TmpObject instanceof BasicFlow);
					flow = (BasicFlow) _TmpObject;

					// iterate to-many link target from sysLine to sysActorToSysLine
					fujaba__Success = false;

					fujaba__IterSysLineToSysActorToSysLine = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(sysLine,
											ActorToLifeline.class, "target"))
							.iterator();

					while (fujaba__IterSysLineToSysActorToSysLine.hasNext()) {
						try {
							sysActorToSysLine = (ActorToLifeline) fujaba__IterSysLineToSysActorToSysLine
									.next();

							// check object sysActorToSysLine is really bound
							JavaSDM.ensure(sysActorToSysLine != null);
							// bind object
							sysActor = sysActorToSysLine.getSource();

							// check object sysActor is really bound
							JavaSDM.ensure(sysActor != null);

							// iterate to-many link target from line to actorToLine
							fujaba__Success = false;

							fujaba__IterLineToActorToLine = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(line,
													ActorToLifeline.class,
													"target")).iterator();

							while (fujaba__IterLineToActorToLine.hasNext()) {
								try {
									actorToLine = (ActorToLifeline) fujaba__IterLineToActorToLine
											.next();

									// check object actorToLine is really bound
									JavaSDM.ensure(actorToLine != null);
									// check isomorphic binding between objects sysActorToSysLine and actorToLine 
									JavaSDM.ensure(!sysActorToSysLine
											.equals(actorToLine));

									// bind object
									actor = actorToLine.getSource();

									// check object actor is really bound
									JavaSDM.ensure(actor != null);

									// check isomorphic binding between objects sysActor and actor 
									JavaSDM.ensure(!sysActor.equals(actor));

									// iterate to-many link target from interaction to useCaseToInteraction
									fujaba__Success = false;

									fujaba__IterInteractionToUseCaseToInteraction = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															interaction,
															UseCaseToInteraction.class,
															"target"))
											.iterator();

									while (fujaba__IterInteractionToUseCaseToInteraction
											.hasNext()) {
										try {
											useCaseToInteraction = (UseCaseToInteraction) fujaba__IterInteractionToUseCaseToInteraction
													.next();

											// check object useCaseToInteraction is really bound
											JavaSDM.ensure(useCaseToInteraction != null);
											// bind object
											useCase = useCaseToInteraction
													.getSource();

											// check object useCase is really bound
											JavaSDM.ensure(useCase != null);

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check object actor is really bound
												JavaSDM.ensure(actor != null);
												// check object actorToLine is really bound
												JavaSDM.ensure(actorToLine != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object flowToInteraction is really bound
												JavaSDM.ensure(flowToInteraction != null);
												// check object interaction is really bound
												JavaSDM.ensure(interaction != null);
												// check object line is really bound
												JavaSDM.ensure(line != null);
												// check object message is really bound
												JavaSDM.ensure(message != null);
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object sysActor is really bound
												JavaSDM.ensure(sysActor != null);
												// check object sysActorToSysLine is really bound
												JavaSDM.ensure(sysActorToSysLine != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check object useCase is really bound
												JavaSDM.ensure(useCase != null);
												// check object useCaseToInteraction is really bound
												JavaSDM.ensure(useCaseToInteraction != null);
												// check isomorphic binding between objects sysActor and actor 
												JavaSDM.ensure(!sysActor
														.equals(actor));

												// check isomorphic binding between objects sysActorToSysLine and actorToLine 
												JavaSDM.ensure(!sysActorToSysLine
														.equals(actorToLine));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link message from message to interaction
												JavaSDM.ensure(interaction.equals(message
														.getInteraction()));

												// check link message from messageReceive to message
												JavaSDM.ensure(message
														.equals(messageReceive
																.getMessage()));

												// check link message from messageSend to message
												JavaSDM.ensure(message
														.equals(messageSend
																.getMessage()));

												// check link receiveEvent from message to messageReceive
												JavaSDM.ensure(messageReceive.equals(message
														.getReceiveEvent()));

												// check link sendEvent from message to messageSend
												JavaSDM.ensure(messageSend.equals(message
														.getSendEvent()));

												// bind object
												packageDeclaration = actor
														.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
														.eContainer() : null;

												// check object packageDeclaration is really bound
												JavaSDM.ensure(packageDeclaration != null);

												// check if contained via correct reference
												JavaSDM.ensure(packageDeclaration
														.getActors().contains(
																actor));

												// check link actors from sysActor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(sysActor
																.eContainer()));

												// check link flows from flow to useCase
												JavaSDM.ensure(useCase
														.equals(flow
																.eContainer()));

												// check link source from actorToLine to actor
												JavaSDM.ensure(actor
														.equals(actorToLine
																.getSource()));

												// check link source from flowToInteraction to flow
												JavaSDM.ensure(flow
														.equals(flowToInteraction
																.getSource()));

												// check link source from sysActorToSysLine to sysActor
												JavaSDM.ensure(sysActor
														.equals(sysActorToSysLine
																.getSource()));

												// check link source from useCaseToInteraction to useCase
												JavaSDM.ensure(useCase
														.equals(useCaseToInteraction
																.getSource()));

												// check link target from actorToLine to line
												JavaSDM.ensure(line
														.equals(actorToLine
																.getTarget()));

												// check link target from flowToInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(flowToInteraction
																.getTarget()));

												// check link target from sysActorToSysLine to sysLine
												JavaSDM.ensure(sysLine
														.equals(sysActorToSysLine
																.getTarget()));

												// check link target from useCaseToInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(useCaseToInteraction
																.getTarget()));

												// check link useCases from useCase to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(useCase
																.eContainer()));

												// check link coveredBy from line to messageReceive
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(
																messageReceive));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_messageSend
												__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_covered_sysLine
												__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_message_message
												__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_fragment_messageSend
												__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_sendEvent_messageSend
												__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_enclosingInteraction_interaction
												__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_interaction_interaction
												__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_enclosingInteraction_interaction
												__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_message_message
												__interaction_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_fragment_messageReceive
												__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_message_message
												__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_covered_line
												__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_receiveEvent_messageReceive
												__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_coveredBy_messageReceive
												__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_source_flow
												__flowToInteraction_source_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCase_flows_flow
												__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_target_line
												__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor
														.setName("actors");
												// assign attribute __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor
														.setName("actors");
												// assign attribute __sysLine_coveredBy_messageSend
												__sysLine_coveredBy_messageSend
														.setName("coveredBy");
												// assign attribute __messageSend_covered_sysLine
												__messageSend_covered_sysLine
														.setName("covered");
												// assign attribute __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor
														.setName("source");
												// assign attribute __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine
														.setName("target");
												// assign attribute __messageSend_enclosingInteraction_interaction
												__messageSend_enclosingInteraction_interaction
														.setName("enclosingInteraction");
												// assign attribute __interaction_fragment_messageSend
												__interaction_fragment_messageSend
														.setName("fragment");
												// assign attribute __messageReceive_enclosingInteraction_interaction
												__messageReceive_enclosingInteraction_interaction
														.setName("enclosingInteraction");
												// assign attribute __interaction_fragment_messageReceive
												__interaction_fragment_messageReceive
														.setName("fragment");
												// assign attribute __flowToInteraction_source_flow
												__flowToInteraction_source_flow
														.setName("source");
												// assign attribute __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction
														.setName("target");
												// assign attribute __useCase_flows_flow
												__useCase_flows_flow
														.setName("flows");
												// assign attribute __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase
														.setName("source");
												// assign attribute __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction
														.setName("target");
												// assign attribute __message_sendEvent_messageSend
												__message_sendEvent_messageSend
														.setName("sendEvent");
												// assign attribute __message_receiveEvent_messageReceive
												__message_receiveEvent_messageReceive
														.setName("receiveEvent");
												// assign attribute __message_interaction_interaction
												__message_interaction_interaction
														.setName("interaction");
												// assign attribute __interaction_message_message
												__interaction_message_message
														.setName("message");
												// assign attribute __line_interaction_interaction
												__line_interaction_interaction
														.setName("interaction");
												// assign attribute __interaction_lifeline_line
												__interaction_lifeline_line
														.setName("lifeline");
												// assign attribute __messageSend_message_message
												__messageSend_message_message
														.setName("message");
												// assign attribute __messageReceive_message_message
												__messageReceive_message_message
														.setName("message");
												// assign attribute __line_coveredBy_messageReceive
												__line_coveredBy_messageReceive
														.setName("coveredBy");
												// assign attribute __messageReceive_covered_line
												__messageReceive_covered_line
														.setName("covered");
												// assign attribute __actorToLine_source_actor
												__actorToLine_source_actor
														.setName("source");
												// assign attribute __actorToLine_target_line
												__actorToLine_target_line
														.setName("target");
												// assign attribute __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase
														.setName("useCases");

												// create link
												__packageDeclaration_actors_actor
														.setTrg(actor);

												// create link
												__actorToLine_source_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

												// create link
												__sysActorToSysLine_source_sysActor
														.setTrg(sysActor);

												// create link
												__packageDeclaration_actors_sysActor
														.setTrg(sysActor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActor);

												// create link
												__packageDeclaration_useCases_useCase
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_sysActor
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_actor
														.setSrc(packageDeclaration);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(packageDeclaration);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

												// create link
												__sysLine_coveredBy_messageSend
														.setSrc(sysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setTrg(sysLine);

												// create link
												__messageSend_covered_sysLine
														.setTrg(sysLine);

												// create link
												__sysActorToSysLine_source_sysActor
														.setSrc(sysActorToSysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setSrc(sysActorToSysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActorToSysLine);

												// create link
												__messageSend_covered_sysLine
														.setSrc(messageSend);

												// create link
												__messageSend_message_message
														.setSrc(messageSend);

												// create link
												__sysLine_coveredBy_messageSend
														.setTrg(messageSend);

												// create link
												__interaction_fragment_messageSend
														.setTrg(messageSend);

												// create link
												__message_sendEvent_messageSend
														.setTrg(messageSend);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageSend);

												// create link
												__messageSend_enclosingInteraction_interaction
														.setSrc(messageSend);

												// create link
												__interaction_fragment_messageSend
														.setSrc(interaction);

												// create link
												__line_interaction_interaction
														.setTrg(interaction);

												// create link
												__message_interaction_interaction
														.setTrg(interaction);

												// create link
												__flowToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__messageReceive_enclosingInteraction_interaction
														.setTrg(interaction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(interaction);

												// create link
												__interaction_message_message
														.setSrc(interaction);

												// create link
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__interaction_lifeline_line
														.setSrc(interaction);

												// create link
												__messageSend_enclosingInteraction_interaction
														.setTrg(interaction);

												// create link
												__interaction_fragment_messageReceive
														.setSrc(interaction);

												// create link
												__messageReceive_message_message
														.setSrc(messageReceive);

												// create link
												__interaction_fragment_messageReceive
														.setTrg(messageReceive);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageReceive);

												// create link
												__messageReceive_covered_line
														.setSrc(messageReceive);

												// create link
												__message_receiveEvent_messageReceive
														.setTrg(messageReceive);

												// create link
												__messageReceive_enclosingInteraction_interaction
														.setSrc(messageReceive);

												// create link
												__line_coveredBy_messageReceive
														.setTrg(messageReceive);

												// create link
												__flowToInteraction_source_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												__flowToInteraction_target_interaction
														.setSrc(flowToInteraction);

												// create link
												__flowToInteraction_source_flow
														.setSrc(flowToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flowToInteraction);

												// create link
												__useCase_flows_flow
														.setSrc(useCase);

												// create link
												__useCaseToInteraction_source_useCase
														.setTrg(useCase);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCase);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

												// create link
												__useCaseToInteraction_source_useCase
														.setSrc(useCaseToInteraction);

												// create link
												__useCaseToInteraction_target_interaction
														.setSrc(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												__message_receiveEvent_messageReceive
														.setSrc(message);

												// create link
												__message_interaction_interaction
														.setSrc(message);

												// create link
												__message_sendEvent_messageSend
														.setSrc(message);

												// create link
												__messageSend_message_message
														.setTrg(message);

												// create link
												__interaction_message_message
														.setTrg(message);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(message);

												// create link
												__messageReceive_message_message
														.setTrg(message);

												// create link
												__actorToLine_target_line
														.setTrg(line);

												// create link
												__messageReceive_covered_line
														.setTrg(line);

												// create link
												__line_interaction_interaction
														.setSrc(line);

												// create link
												__line_coveredBy_messageReceive
														.setSrc(line);

												// create link
												__interaction_lifeline_line
														.setTrg(line);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(line);

												// create link
												__actorToLine_target_line
														.setSrc(actorToLine);

												// create link
												__actorToLine_source_actor
														.setSrc(actorToLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actorToLine);

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
																__messageReceive_covered_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__actorToLine_target_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flowToInteraction_target_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__interaction_lifeline_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__sysActorToSysLine_target_sysLine,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCaseToInteraction_target_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flowToInteraction_source_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__message_sendEvent_messageSend,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__interaction_message_message,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__packageDeclaration_actors_sysActor,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageReceive_enclosingInteraction_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__interaction_fragment_messageReceive,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__interaction_fragment_messageSend,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__packageDeclaration_useCases_useCase,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__message_interaction_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageSend_enclosingInteraction_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageSend_message_message,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__actorToLine_source_actor,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageReceive_message_message,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__sysLine_coveredBy_messageSend,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__message_receiveEvent_messageReceive,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCase_flows_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__useCaseToInteraction_source_useCase,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__line_coveredBy_messageReceive,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageSend_covered_sysLine,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__line_interaction_interaction,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__sysActorToSysLine_source_sysActor,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_BWD(
																	isApplicableMatch,
																	actor,
																	sysActor,
																	packageDeclaration,
																	sysLine,
																	sysActorToSysLine,
																	messageSend,
																	interaction,
																	messageReceive,
																	flow,
																	flowToInteraction,
																	useCase,
																	useCaseToInteraction,
																	message,
																	line,
																	actorToLine));

													// ensure correct type and really bound of object csp
													JavaSDM.ensure(_TmpObject instanceof CSP);
													csp = (CSP) _TmpObject;
													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												// statement node 'check CSP'
												fujaba__Success = this
														.isApplicable_checkCsp_BWD(csp);
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
																.setRuleName("UserStepBFMessageRule");
														// assign attribute ruleresult
														ruleresult
																.setSuccess(true);

														// create link
														ruleresult
																.getIsApplicableMatch()
																.add(isApplicableMatch);

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
	public void registerObjectsToMatch_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("message", message);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("String");

		// Create attribute variables
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", true, csp);
		var_message_messageSort.setValue(message.getMessageSort());
		var_message_messageSort.setType("EObject");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", true, csp);
		var_message_messageKind.setValue(message.getMessageKind());
		var_message_messageKind.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
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
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Lifeline line, ActorToLifeline actorToLine) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("String");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("EObject");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("EObject");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject line, EObject actorToLine) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("messageSend")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("message")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_361(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_471108 = null;
		Message __DEC_messageReceive_receiveEvent_471108 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74590 = null;
		Message __DEC_messageSend_receiveEvent_74590 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905701 = null;
		Message __DEC_messageReceive_sendEvent_905701 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_558582 = null;
		Message __DEC_messageSend_sendEvent_558582 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_655983 = null;
		MessageEnd __DEC_message_message_655983 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
		Lifeline sysLine = null;

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

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;

			// bind object
			_TmpObject = _edge_coveredBy.getTrg();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageSend.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link coveredBy from messageSend to sysLine
			JavaSDM.ensure(messageSend.getCovered().contains(sysLine));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_471108
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_471108 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_471108
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_471108 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_471108
											.next();

									// check object __DEC_messageReceive_receiveEvent_471108 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_471108 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_471108 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_471108
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_74590
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74590 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74590
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_74590 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74590
											.next();

									// check object __DEC_messageSend_receiveEvent_74590 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_74590 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_74590 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_74590
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_905701
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905701 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905701
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_905701 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905701
											.next();

									// check object __DEC_messageReceive_sendEvent_905701 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_905701 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_905701 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_905701
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_558582
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_558582 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_558582
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_558582 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_558582
											.next();

									// check object __DEC_messageSend_sendEvent_558582 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_558582 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_558582 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_558582
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

							// iterate to-many link message from message to __DEC_message_message_655983
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_655983 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_655983
											.hasNext()) {
								try {
									__DEC_message_message_655983 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_655983
											.next();

									// check object __DEC_message_message_655983 is really bound
									JavaSDM.ensure(__DEC_message_message_655983 != null);
									// check isomorphic binding between objects __DEC_message_message_655983 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_655983
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_655983 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_655983
											.equals(messageSend));

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

						// check object _edge_coveredBy is really bound
						JavaSDM.ensure(_edge_coveredBy != null);
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object message is really bound
						JavaSDM.ensure(message != null);
						// check object messageReceive is really bound
						JavaSDM.ensure(messageReceive != null);
						// check object messageSend is really bound
						JavaSDM.ensure(messageSend != null);
						// check object sysLine is really bound
						JavaSDM.ensure(sysLine != null);
						// check isomorphic binding between objects sysLine and line 
						JavaSDM.ensure(!sysLine.equals(line));

						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(interaction.equals(messageReceive
								.getEnclosingInteraction()));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(interaction.equals(messageSend
								.getEnclosingInteraction()));

						// check link lifeline from line to interaction
						JavaSDM.ensure(interaction.equals(line.getInteraction()));

						// check link message from message to interaction
						JavaSDM.ensure(interaction.equals(message
								.getInteraction()));

						// check link message from messageReceive to message
						JavaSDM.ensure(message.equals(messageReceive
								.getMessage()));

						// check link message from messageSend to message
						JavaSDM.ensure(message.equals(messageSend.getMessage()));

						// check link receiveEvent from message to messageReceive
						JavaSDM.ensure(messageReceive.equals(message
								.getReceiveEvent()));

						// check link receiveEvent from message to messageSend
						JavaSDM.ensure(!(messageSend.equals(message
								.getReceiveEvent())));

						// check link sendEvent from message to messageSend
						JavaSDM.ensure(messageSend.equals(message
								.getSendEvent()));

						// check link sendEvent from message to messageReceive
						JavaSDM.ensure(!(messageReceive.equals(message
								.getSendEvent())));

						// check link src from _edge_coveredBy to sysLine
						JavaSDM.ensure(sysLine.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_coveredBy to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_coveredBy
								.getTrg()));

						// check link coveredBy from line to messageReceive
						JavaSDM.ensure(line.getCoveredBy().contains(
								messageReceive));

						// check link coveredBy from messageSend to sysLine
						JavaSDM.ensure(messageSend.getCovered().contains(
								sysLine));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								sysLine, messageSend, interaction,
								messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_362(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909255 = null;
		Message __DEC_messageReceive_receiveEvent_909255 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_574869 = null;
		Message __DEC_messageSend_receiveEvent_574869 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_706494 = null;
		Message __DEC_messageReceive_sendEvent_706494 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_277118 = null;
		Message __DEC_messageSend_sendEvent_277118 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_751657 = null;
		MessageEnd __DEC_message_message_751657 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		MessageOccurrenceSpecification messageSend = null;

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

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;

			// bind object
			interaction = messageSend.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link coveredBy from messageSend to sysLine
			JavaSDM.ensure(messageSend.getCovered().contains(sysLine));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link src from sysLine to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(sysLine,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterSysLineTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterSysLineTo_edge_coveredBy
									.next();

							// check object _edge_coveredBy is really bound
							JavaSDM.ensure(_edge_coveredBy != null);
							// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
							JavaSDM.ensure(!_edge_coveredBy
									.equals(_edge_covered));

							// check link trg from _edge_coveredBy to messageSend
							JavaSDM.ensure(messageSend.equals(_edge_coveredBy
									.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_909255
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909255 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909255
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_909255 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909255
													.next();

											// check object __DEC_messageReceive_receiveEvent_909255 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_909255 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_909255 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_909255
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_574869
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_574869 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_574869
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_574869 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_574869
													.next();

											// check object __DEC_messageSend_receiveEvent_574869 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_574869 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_574869 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_574869
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_706494
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_706494 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_706494
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_706494 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_706494
													.next();

											// check object __DEC_messageReceive_sendEvent_706494 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_706494 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_706494 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_706494
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_277118
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_277118 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_277118
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_277118 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_277118
													.next();

											// check object __DEC_messageSend_sendEvent_277118 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_277118 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_277118 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_277118
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

									// iterate to-many link message from message to __DEC_message_message_751657
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_751657 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_751657
													.hasNext()) {
										try {
											__DEC_message_message_751657 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_751657
													.next();

											// check object __DEC_message_message_751657 is really bound
											JavaSDM.ensure(__DEC_message_message_751657 != null);
											// check isomorphic binding between objects __DEC_message_message_751657 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_751657
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_751657 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_751657
													.equals(messageSend));

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

								// check object _edge_covered is really bound
								JavaSDM.ensure(_edge_covered != null);
								// check object _edge_coveredBy is really bound
								JavaSDM.ensure(_edge_coveredBy != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_covered to messageSend
								JavaSDM.ensure(messageSend.equals(_edge_covered
										.getSrc()));

								// check link src from _edge_coveredBy to sysLine
								JavaSDM.ensure(sysLine.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to sysLine
								JavaSDM.ensure(sysLine.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_coveredBy.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_363(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_728519 = null;
		Message __DEC_messageReceive_receiveEvent_728519 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_826116 = null;
		Message __DEC_messageSend_receiveEvent_826116 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_516308 = null;
		Message __DEC_messageReceive_sendEvent_516308 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_731997 = null;
		Message __DEC_messageSend_sendEvent_731997 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_426981 = null;
		MessageEnd __DEC_message_message_426981 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;

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

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageSend.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link trg from _edge_enclosingInteraction to interaction
			JavaSDM.ensure(interaction.equals(_edge_enclosingInteraction
					.getTrg()));

			// iterate to-many link coveredBy from messageSend to sysLine
			fujaba__Success = false;

			fujaba__IterMessageSendToSysLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
							.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// iterate to-many link lifeline from interaction to line
					fujaba__Success = false;

					fujaba__IterInteractionToLine = new ArrayList(
							interaction.getLifeline()).iterator();

					while (fujaba__IterInteractionToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterInteractionToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// check link coveredBy from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_728519
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_728519 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_728519
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_728519 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_728519
													.next();

											// check object __DEC_messageReceive_receiveEvent_728519 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_728519 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_728519 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_728519
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_826116
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_826116 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_826116
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_826116 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_826116
													.next();

											// check object __DEC_messageSend_receiveEvent_826116 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_826116 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_826116 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_826116
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_516308
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_516308 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_516308
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_516308 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_516308
													.next();

											// check object __DEC_messageReceive_sendEvent_516308 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_516308 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_516308 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_516308
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_731997
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_731997 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_731997
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_731997 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_731997
													.next();

											// check object __DEC_messageSend_sendEvent_731997 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_731997 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_731997 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_731997
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

									// iterate to-many link message from message to __DEC_message_message_426981
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_426981 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_426981
													.hasNext()) {
										try {
											__DEC_message_message_426981 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_426981
													.next();

											// check object __DEC_message_message_426981 is really bound
											JavaSDM.ensure(__DEC_message_message_426981 != null);
											// check isomorphic binding between objects __DEC_message_message_426981 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_426981
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_426981 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_426981
													.equals(messageSend));

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

								// check object _edge_enclosingInteraction is really bound
								JavaSDM.ensure(_edge_enclosingInteraction != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_enclosingInteraction to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_enclosingInteraction
												.getSrc()));

								// check link trg from _edge_enclosingInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_enclosingInteraction
												.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_364(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_662544 = null;
		Message __DEC_messageReceive_receiveEvent_662544 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_934688 = null;
		Message __DEC_messageSend_receiveEvent_934688 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_847537 = null;
		Message __DEC_messageReceive_sendEvent_847537 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147103 = null;
		Message __DEC_messageSend_sendEvent_147103 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_499569 = null;
		MessageEnd __DEC_message_message_499569 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterMessageSendTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		MessageOccurrenceSpecification messageSend = null;

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

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// iterate to-many link src from messageSend to _edge_enclosingInteraction
			fujaba__Success = false;

			fujaba__IterMessageSendTo_edge_enclosingInteraction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							messageSend, EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterMessageSendTo_edge_enclosingInteraction
					.hasNext()) {
				try {
					_edge_enclosingInteraction = (EMoflonEdge) fujaba__IterMessageSendTo_edge_enclosingInteraction
							.next();

					// check object _edge_enclosingInteraction is really bound
					JavaSDM.ensure(_edge_enclosingInteraction != null);
					// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
					JavaSDM.ensure(!_edge_fragment
							.equals(_edge_enclosingInteraction));

					// bind object
					message = messageSend.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// bind object
					_TmpObject = message.getReceiveEvent();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// bind object
							interaction = messageSend.getEnclosingInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from messageReceive to interaction
							JavaSDM.ensure(interaction.equals(messageReceive
									.getEnclosingInteraction()));

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link src from _edge_fragment to interaction
							JavaSDM.ensure(interaction.equals(_edge_fragment
									.getSrc()));

							// check link trg from _edge_enclosingInteraction to interaction
							JavaSDM.ensure(interaction
									.equals(_edge_enclosingInteraction.getTrg()));

							// iterate to-many link lifeline from interaction to line
							fujaba__Success = false;

							fujaba__IterInteractionToLine = new ArrayList(
									interaction.getLifeline()).iterator();

							while (fujaba__IterInteractionToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterInteractionToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link coveredBy from line to messageReceive
									JavaSDM.ensure(line.getCoveredBy()
											.contains(messageReceive));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// negative check for link fragment from messageReceive
										JavaSDM.ensure(messageReceive
												.getEnclosingOperand() == null);
										// negative check for link fragment from messageSend
										JavaSDM.ensure(messageSend
												.getEnclosingOperand() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_662544
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_662544 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_662544
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_662544 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_662544
															.next();

													// check object __DEC_messageReceive_receiveEvent_662544 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_662544 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_662544 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_662544
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_934688
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_934688 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_934688
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_934688 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_934688
															.next();

													// check object __DEC_messageSend_receiveEvent_934688 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_934688 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_934688 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_934688
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_847537
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_847537 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_847537
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_847537 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_847537
															.next();

													// check object __DEC_messageReceive_sendEvent_847537 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_847537 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_847537 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_847537
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_147103
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147103 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147103
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_147103 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147103
															.next();

													// check object __DEC_messageSend_sendEvent_147103 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_147103 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_147103 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_147103
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

											// iterate to-many link message from message to __DEC_message_message_499569
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_499569 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_499569
															.hasNext()) {
												try {
													__DEC_message_message_499569 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_499569
															.next();

													// check object __DEC_message_message_499569 is really bound
													JavaSDM.ensure(__DEC_message_message_499569 != null);
													// check isomorphic binding between objects __DEC_message_message_499569 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_499569
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_499569 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_499569
															.equals(messageSend));

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

										// check object _edge_enclosingInteraction is really bound
										JavaSDM.ensure(_edge_enclosingInteraction != null);
										// check object _edge_fragment is really bound
										JavaSDM.ensure(_edge_fragment != null);
										// check object interaction is really bound
										JavaSDM.ensure(interaction != null);
										// check object line is really bound
										JavaSDM.ensure(line != null);
										// check object message is really bound
										JavaSDM.ensure(message != null);
										// check object messageReceive is really bound
										JavaSDM.ensure(messageReceive != null);
										// check object messageSend is really bound
										JavaSDM.ensure(messageSend != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingInteraction));

										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(interaction.equals(messageReceive
												.getEnclosingInteraction()));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(interaction.equals(messageSend
												.getEnclosingInteraction()));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link message from message to interaction
										JavaSDM.ensure(interaction
												.equals(message
														.getInteraction()));

										// check link message from messageReceive to message
										JavaSDM.ensure(message
												.equals(messageReceive
														.getMessage()));

										// check link message from messageSend to message
										JavaSDM.ensure(message
												.equals(messageSend
														.getMessage()));

										// check link receiveEvent from message to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(message
														.getReceiveEvent()));

										// check link receiveEvent from message to messageSend
										JavaSDM.ensure(!(messageSend
												.equals(message
														.getReceiveEvent())));

										// check link sendEvent from message to messageSend
										JavaSDM.ensure(messageSend
												.equals(message.getSendEvent()));

										// check link sendEvent from message to messageReceive
										JavaSDM.ensure(!(messageReceive
												.equals(message.getSendEvent())));

										// check link src from _edge_enclosingInteraction to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_enclosingInteraction
														.getSrc()));

										// check link src from _edge_fragment to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_fragment.getSrc()));

										// check link trg from _edge_enclosingInteraction to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_enclosingInteraction
														.getTrg()));

										// check link trg from _edge_fragment to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_fragment.getTrg()));

										// check link coveredBy from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														sysLine, messageSend,
														interaction,
														messageReceive,
														message, line);
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
													__result.getContents().add(
															match);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_365(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_623061 = null;
		Message __DEC_messageReceive_receiveEvent_623061 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_280116 = null;
		Message __DEC_messageSend_receiveEvent_280116 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_867931 = null;
		Message __DEC_messageReceive_sendEvent_867931 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_735857 = null;
		Message __DEC_messageSend_sendEvent_735857 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_308530 = null;
		MessageEnd __DEC_message_message_308530 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_enclosingInteraction is really bound
			JavaSDM.ensure(_edge_enclosingInteraction != null);
			// bind object
			_TmpObject = _edge_enclosingInteraction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// iterate to-many link fragment from interaction to messageSend
			fujaba__Success = false;

			fujaba__IterInteractionToMessageSend = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToMessageSend.next();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;
					// bind object
					message = messageSend.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// bind object
					_TmpObject = message.getReceiveEvent();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// check link src from _edge_enclosingInteraction to messageReceive
					JavaSDM.ensure(messageReceive
							.equals(_edge_enclosingInteraction.getSrc()));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// iterate to-many link lifeline from interaction to line
							fujaba__Success = false;

							fujaba__IterInteractionToLine = new ArrayList(
									interaction.getLifeline()).iterator();

							while (fujaba__IterInteractionToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterInteractionToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link coveredBy from line to messageReceive
									JavaSDM.ensure(line.getCoveredBy()
											.contains(messageReceive));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// negative check for link fragment from messageReceive
										JavaSDM.ensure(messageReceive
												.getEnclosingOperand() == null);
										// negative check for link fragment from messageSend
										JavaSDM.ensure(messageSend
												.getEnclosingOperand() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_623061
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_623061 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_623061
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_623061 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_623061
															.next();

													// check object __DEC_messageReceive_receiveEvent_623061 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_623061 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_623061 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_623061
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_280116
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_280116 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_280116
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_280116 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_280116
															.next();

													// check object __DEC_messageSend_receiveEvent_280116 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_280116 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_280116 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_280116
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_867931
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_867931 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_867931
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_867931 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_867931
															.next();

													// check object __DEC_messageReceive_sendEvent_867931 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_867931 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_867931 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_867931
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_735857
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_735857 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_735857
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_735857 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_735857
															.next();

													// check object __DEC_messageSend_sendEvent_735857 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_735857 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_735857 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_735857
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

											// iterate to-many link message from message to __DEC_message_message_308530
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_308530 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_308530
															.hasNext()) {
												try {
													__DEC_message_message_308530 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_308530
															.next();

													// check object __DEC_message_message_308530 is really bound
													JavaSDM.ensure(__DEC_message_message_308530 != null);
													// check isomorphic binding between objects __DEC_message_message_308530 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_308530
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_308530 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_308530
															.equals(messageSend));

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

										// check object _edge_enclosingInteraction is really bound
										JavaSDM.ensure(_edge_enclosingInteraction != null);
										// check object interaction is really bound
										JavaSDM.ensure(interaction != null);
										// check object line is really bound
										JavaSDM.ensure(line != null);
										// check object message is really bound
										JavaSDM.ensure(message != null);
										// check object messageReceive is really bound
										JavaSDM.ensure(messageReceive != null);
										// check object messageSend is really bound
										JavaSDM.ensure(messageSend != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(interaction.equals(messageReceive
												.getEnclosingInteraction()));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(interaction.equals(messageSend
												.getEnclosingInteraction()));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link message from message to interaction
										JavaSDM.ensure(interaction
												.equals(message
														.getInteraction()));

										// check link message from messageReceive to message
										JavaSDM.ensure(message
												.equals(messageReceive
														.getMessage()));

										// check link message from messageSend to message
										JavaSDM.ensure(message
												.equals(messageSend
														.getMessage()));

										// check link receiveEvent from message to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(message
														.getReceiveEvent()));

										// check link receiveEvent from message to messageSend
										JavaSDM.ensure(!(messageSend
												.equals(message
														.getReceiveEvent())));

										// check link sendEvent from message to messageSend
										JavaSDM.ensure(messageSend
												.equals(message.getSendEvent()));

										// check link sendEvent from message to messageReceive
										JavaSDM.ensure(!(messageReceive
												.equals(message.getSendEvent())));

										// check link src from _edge_enclosingInteraction to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_enclosingInteraction
														.getSrc()));

										// check link trg from _edge_enclosingInteraction to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_enclosingInteraction
														.getTrg()));

										// check link coveredBy from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														sysLine, messageSend,
														interaction,
														messageReceive,
														message, line);
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
													__result.getContents().add(
															match);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_366(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871765 = null;
		Message __DEC_messageReceive_receiveEvent_871765 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_661357 = null;
		Message __DEC_messageSend_receiveEvent_661357 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_510667 = null;
		Message __DEC_messageReceive_sendEvent_510667 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_532551 = null;
		Message __DEC_messageSend_sendEvent_532551 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_56483 = null;
		MessageEnd __DEC_message_message_56483 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getSrc();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// iterate to-many link trg from interaction to _edge_enclosingInteraction
			fujaba__Success = false;

			fujaba__IterInteractionTo_edge_enclosingInteraction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							interaction, EMoflonEdge.class, "trg")).iterator();

			while (fujaba__IterInteractionTo_edge_enclosingInteraction
					.hasNext()) {
				try {
					_edge_enclosingInteraction = (EMoflonEdge) fujaba__IterInteractionTo_edge_enclosingInteraction
							.next();

					// check object _edge_enclosingInteraction is really bound
					JavaSDM.ensure(_edge_enclosingInteraction != null);
					// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
					JavaSDM.ensure(!_edge_fragment
							.equals(_edge_enclosingInteraction));

					// iterate to-many link lifeline from interaction to line
					fujaba__Success = false;

					fujaba__IterInteractionToLine = new ArrayList(
							interaction.getLifeline()).iterator();

					while (fujaba__IterInteractionToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterInteractionToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// iterate to-many link fragment from interaction to messageSend
							fujaba__Success = false;

							fujaba__IterInteractionToMessageSend = new ArrayList(
									interaction.getFragment()).iterator();

							while (fujaba__IterInteractionToMessageSend
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterInteractionToMessageSend
											.next();

									// ensure correct type and really bound of object messageSend
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageSend = (MessageOccurrenceSpecification) _TmpObject;
									// bind object
									message = messageSend.getMessage();

									// check object message is really bound
									JavaSDM.ensure(message != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// bind object
									_TmpObject = message.getReceiveEvent();

									// ensure correct type and really bound of object messageReceive
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageReceive = (MessageOccurrenceSpecification) _TmpObject;

									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link fragment from messageReceive to interaction
									JavaSDM.ensure(interaction
											.equals(messageReceive
													.getEnclosingInteraction()));

									// check link message from messageReceive to message
									JavaSDM.ensure(message
											.equals(messageReceive.getMessage()));

									// check link sendEvent from message to messageSend
									JavaSDM.ensure(messageSend.equals(message
											.getSendEvent()));

									// check link src from _edge_enclosingInteraction to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_enclosingInteraction
													.getSrc()));

									// check link trg from _edge_fragment to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_fragment.getTrg()));

									// check link coveredBy from line to messageReceive
									JavaSDM.ensure(line.getCoveredBy()
											.contains(messageReceive));

									// iterate to-many link coveredBy from messageSend to sysLine
									fujaba__Success = false;

									fujaba__IterMessageSendToSysLine = new ArrayList(
											messageSend.getCovered())
											.iterator();

									while (fujaba__IterMessageSendToSysLine
											.hasNext()) {
										try {
											sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
													.next();

											// check object sysLine is really bound
											JavaSDM.ensure(sysLine != null);
											// check isomorphic binding between objects sysLine and line 
											JavaSDM.ensure(!sysLine
													.equals(line));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link fragment from messageReceive
												JavaSDM.ensure(messageReceive
														.getEnclosingOperand() == null);
												// negative check for link fragment from messageSend
												JavaSDM.ensure(messageSend
														.getEnclosingOperand() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_871765
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871765 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871765
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_871765 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_871765
																	.next();

															// check object __DEC_messageReceive_receiveEvent_871765 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_871765 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_871765 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_871765
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

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_661357
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_661357 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_661357
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_661357 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_661357
																	.next();

															// check object __DEC_messageSend_receiveEvent_661357 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_661357 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_661357 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_661357
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

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_510667
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_510667 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_510667
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_510667 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_510667
																	.next();

															// check object __DEC_messageReceive_sendEvent_510667 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_510667 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_510667 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_510667
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

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_532551
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_532551 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_532551
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_532551 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_532551
																	.next();

															// check object __DEC_messageSend_sendEvent_532551 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_532551 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_532551 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_532551
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

													// iterate to-many link message from message to __DEC_message_message_56483
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_56483 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_56483
																	.hasNext()) {
														try {
															__DEC_message_message_56483 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_56483
																	.next();

															// check object __DEC_message_message_56483 is really bound
															JavaSDM.ensure(__DEC_message_message_56483 != null);
															// check isomorphic binding between objects __DEC_message_message_56483 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_56483
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_56483 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_56483
																	.equals(messageSend));

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

												// check object _edge_enclosingInteraction is really bound
												JavaSDM.ensure(_edge_enclosingInteraction != null);
												// check object _edge_fragment is really bound
												JavaSDM.ensure(_edge_fragment != null);
												// check object interaction is really bound
												JavaSDM.ensure(interaction != null);
												// check object line is really bound
												JavaSDM.ensure(line != null);
												// check object message is really bound
												JavaSDM.ensure(message != null);
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
												JavaSDM.ensure(!_edge_fragment
														.equals(_edge_enclosingInteraction));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link message from message to interaction
												JavaSDM.ensure(interaction.equals(message
														.getInteraction()));

												// check link message from messageReceive to message
												JavaSDM.ensure(message
														.equals(messageReceive
																.getMessage()));

												// check link message from messageSend to message
												JavaSDM.ensure(message
														.equals(messageSend
																.getMessage()));

												// check link receiveEvent from message to messageReceive
												JavaSDM.ensure(messageReceive.equals(message
														.getReceiveEvent()));

												// check link receiveEvent from message to messageSend
												JavaSDM.ensure(!(messageSend.equals(message
														.getReceiveEvent())));

												// check link sendEvent from message to messageSend
												JavaSDM.ensure(messageSend.equals(message
														.getSendEvent()));

												// check link sendEvent from message to messageReceive
												JavaSDM.ensure(!(messageReceive.equals(message
														.getSendEvent())));

												// check link src from _edge_enclosingInteraction to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_enclosingInteraction
																.getSrc()));

												// check link src from _edge_fragment to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_fragment
																.getSrc()));

												// check link trg from _edge_enclosingInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_enclosingInteraction
																.getTrg()));

												// check link trg from _edge_fragment to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_fragment
																.getTrg()));

												// check link coveredBy from line to messageReceive
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(
																messageReceive));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// create object match
												match = TGGRuntimeFactory.eINSTANCE
														.createMatch();

												// assign attribute match
												match.setRuleName(__eClass
														.getName());
												// statement node 'bookkeeping with generic isAppropriate method'
												fujaba__Success = this
														.isAppropriate_BWD(
																match, sysLine,
																messageSend,
																interaction,
																messageReceive,
																message, line);
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
															__result.getContents()
																	.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_89(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_972851 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NormalStep step = null;
		BasicFlow flow = null;

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

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;

			// bind object
			actor = step.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			packageDeclaration = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getActors().contains(actor));

			// check link steps from step to flow
			JavaSDM.ensure(flow.equals(step.eContainer()));

			// iterate to-many link actors from packageDeclaration to sysActor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToSysActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToSysActor.hasNext()) {
				try {
					sysActor = (Actor) fujaba__IterPackageDeclarationToSysActor
							.next();

					// check object sysActor is really bound
					JavaSDM.ensure(sysActor != null);
					// check isomorphic binding between objects sysActor and actor 
					JavaSDM.ensure(!sysActor.equals(actor));

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
							// check link flows from flow to useCase
							JavaSDM.ensure(useCase.equals(flow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_step_steps_972851 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_972851 is really bound
									JavaSDM.ensure(__DEC_step_steps_972851 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_972851
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_972851 and flow 
									JavaSDM.ensure(!__DEC_step_steps_972851
											.equals(flow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_steps is really bound
								JavaSDM.ensure(_edge_steps != null);
								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check object sysActor is really bound
								JavaSDM.ensure(sysActor != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects sysActor and actor 
								JavaSDM.ensure(!sysActor.equals(actor));

								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link actors from sysActor to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(sysActor.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link src from _edge_steps to flow
								JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link trg from _edge_steps to step
								JavaSDM.ensure(step.equals(_edge_steps.getTrg()));

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
										actor, sysActor, packageDeclaration,
										flow, useCase, step);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_836004 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		BasicFlow flow = null;
		NormalStep step = null;

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

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;

			// bind object
			_TmpObject = step.eContainer() instanceof BasicFlow ? (BasicFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(step));

			// bind object
			_TmpObject = _edge_actor.getTrg();

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;

			// check link actor from step to actor
			JavaSDM.ensure(actor.equals(step.getActor()));

			// bind object
			packageDeclaration = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getActors().contains(actor));

			// iterate to-many link actors from packageDeclaration to sysActor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToSysActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToSysActor.hasNext()) {
				try {
					sysActor = (Actor) fujaba__IterPackageDeclarationToSysActor
							.next();

					// check object sysActor is really bound
					JavaSDM.ensure(sysActor != null);
					// check isomorphic binding between objects sysActor and actor 
					JavaSDM.ensure(!sysActor.equals(actor));

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
							// check link flows from flow to useCase
							JavaSDM.ensure(useCase.equals(flow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_step_steps_836004 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_836004 is really bound
									JavaSDM.ensure(__DEC_step_steps_836004 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_836004
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_836004 and flow 
									JavaSDM.ensure(!__DEC_step_steps_836004
											.equals(flow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_actor is really bound
								JavaSDM.ensure(_edge_actor != null);
								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check object sysActor is really bound
								JavaSDM.ensure(sysActor != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects sysActor and actor 
								JavaSDM.ensure(!sysActor.equals(actor));

								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link actors from sysActor to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(sysActor.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link src from _edge_actor to step
								JavaSDM.ensure(step.equals(_edge_actor.getSrc()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link trg from _edge_actor to actor
								JavaSDM.ensure(actor.equals(_edge_actor
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
										actor, sysActor, packageDeclaration,
										flow, useCase, step);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_367(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_800877 = null;
		Message __DEC_messageReceive_receiveEvent_800877 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_209346 = null;
		Message __DEC_messageSend_receiveEvent_209346 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_715544 = null;
		Message __DEC_messageReceive_sendEvent_715544 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_244628 = null;
		Message __DEC_messageSend_sendEvent_244628 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_548415 = null;
		MessageEnd __DEC_message_message_548415 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;

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

			// check object _edge_sendEvent is really bound
			JavaSDM.ensure(_edge_sendEvent != null);
			// bind object
			_TmpObject = _edge_sendEvent.getTrg();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = messageSend.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link src from _edge_sendEvent to message
			JavaSDM.ensure(message.equals(_edge_sendEvent.getSrc()));

			// iterate to-many link coveredBy from messageSend to sysLine
			fujaba__Success = false;

			fujaba__IterMessageSendToSysLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
							.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// iterate to-many link lifeline from interaction to line
					fujaba__Success = false;

					fujaba__IterInteractionToLine = new ArrayList(
							interaction.getLifeline()).iterator();

					while (fujaba__IterInteractionToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterInteractionToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// check link coveredBy from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_800877
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_800877 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_800877
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_800877 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_800877
													.next();

											// check object __DEC_messageReceive_receiveEvent_800877 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_800877 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_800877 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_800877
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_209346
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_209346 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_209346
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_209346 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_209346
													.next();

											// check object __DEC_messageSend_receiveEvent_209346 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_209346 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_209346 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_209346
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_715544
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_715544 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_715544
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_715544 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_715544
													.next();

											// check object __DEC_messageReceive_sendEvent_715544 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_715544 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_715544 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_715544
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_244628
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_244628 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_244628
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_244628 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_244628
													.next();

											// check object __DEC_messageSend_sendEvent_244628 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_244628 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_244628 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_244628
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

									// iterate to-many link message from message to __DEC_message_message_548415
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_548415 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_548415
													.hasNext()) {
										try {
											__DEC_message_message_548415 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_548415
													.next();

											// check object __DEC_message_message_548415 is really bound
											JavaSDM.ensure(__DEC_message_message_548415 != null);
											// check isomorphic binding between objects __DEC_message_message_548415 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_548415
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_548415 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_548415
													.equals(messageSend));

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

								// check object _edge_sendEvent is really bound
								JavaSDM.ensure(_edge_sendEvent != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_sendEvent to message
								JavaSDM.ensure(message.equals(_edge_sendEvent
										.getSrc()));

								// check link trg from _edge_sendEvent to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_sendEvent.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_368(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_770011 = null;
		Message __DEC_messageReceive_receiveEvent_770011 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_929910 = null;
		Message __DEC_messageSend_receiveEvent_929910 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_678412 = null;
		Message __DEC_messageReceive_sendEvent_678412 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_176670 = null;
		Message __DEC_messageSend_sendEvent_176670 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_466217 = null;
		MessageEnd __DEC_message_message_466217 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check link trg from _edge_receiveEvent to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_receiveEvent.getTrg()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_770011
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_770011 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_770011
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_770011 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_770011
													.next();

											// check object __DEC_messageReceive_receiveEvent_770011 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_770011 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_770011 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_770011
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_929910
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_929910 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_929910
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_929910 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_929910
													.next();

											// check object __DEC_messageSend_receiveEvent_929910 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_929910 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_929910 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_929910
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_678412
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_678412 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_678412
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_678412 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_678412
													.next();

											// check object __DEC_messageReceive_sendEvent_678412 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_678412 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_678412 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_678412
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_176670
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_176670 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_176670
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_176670 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_176670
													.next();

											// check object __DEC_messageSend_sendEvent_176670 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_176670 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_176670 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_176670
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

									// iterate to-many link message from message to __DEC_message_message_466217
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_466217 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_466217
													.hasNext()) {
										try {
											__DEC_message_message_466217 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_466217
													.next();

											// check object __DEC_message_message_466217 is really bound
											JavaSDM.ensure(__DEC_message_message_466217 != null);
											// check isomorphic binding between objects __DEC_message_message_466217 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_466217
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_466217 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_466217
													.equals(messageSend));

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

								// check object _edge_receiveEvent is really bound
								JavaSDM.ensure(_edge_receiveEvent != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_receiveEvent to message
								JavaSDM.ensure(message
										.equals(_edge_receiveEvent.getSrc()));

								// check link trg from _edge_receiveEvent to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_receiveEvent.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_369(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_924787 = null;
		Message __DEC_messageReceive_receiveEvent_924787 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_609334 = null;
		Message __DEC_messageSend_receiveEvent_609334 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_964829 = null;
		Message __DEC_messageReceive_sendEvent_964829 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_955736 = null;
		Message __DEC_messageSend_sendEvent_955736 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_868683 = null;
		MessageEnd __DEC_message_message_868683 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
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
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// bind object
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// iterate to-many link coveredBy from messageSend to sysLine
			fujaba__Success = false;

			fujaba__IterMessageSendToSysLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
							.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// bind object
					interaction = message.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

					// check link trg from _edge_interaction to interaction
					JavaSDM.ensure(interaction.equals(_edge_interaction
							.getTrg()));

					// iterate to-many link lifeline from interaction to line
					fujaba__Success = false;

					fujaba__IterInteractionToLine = new ArrayList(
							interaction.getLifeline()).iterator();

					while (fujaba__IterInteractionToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterInteractionToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// check link coveredBy from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_924787
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_924787 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_924787
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_924787 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_924787
													.next();

											// check object __DEC_messageReceive_receiveEvent_924787 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_924787 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_924787 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_924787
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_609334
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_609334 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_609334
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_609334 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_609334
													.next();

											// check object __DEC_messageSend_receiveEvent_609334 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_609334 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_609334 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_609334
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_964829
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_964829 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_964829
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_964829 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_964829
													.next();

											// check object __DEC_messageReceive_sendEvent_964829 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_964829 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_964829 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_964829
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_955736
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_955736 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_955736
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_955736 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_955736
													.next();

											// check object __DEC_messageSend_sendEvent_955736 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_955736 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_955736 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_955736
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

									// iterate to-many link message from message to __DEC_message_message_868683
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_868683 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_868683
													.hasNext()) {
										try {
											__DEC_message_message_868683 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_868683
													.next();

											// check object __DEC_message_message_868683 is really bound
											JavaSDM.ensure(__DEC_message_message_868683 != null);
											// check isomorphic binding between objects __DEC_message_message_868683 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_868683
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_868683 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_868683
													.equals(messageSend));

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

								// check object _edge_interaction is really bound
								JavaSDM.ensure(_edge_interaction != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_interaction to message
								JavaSDM.ensure(message.equals(_edge_interaction
										.getSrc()));

								// check link trg from _edge_interaction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_interaction.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_370(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_244520 = null;
		Message __DEC_messageReceive_receiveEvent_244520 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_240608 = null;
		Message __DEC_messageSend_receiveEvent_240608 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_36171 = null;
		Message __DEC_messageReceive_sendEvent_36171 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_8480 = null;
		Message __DEC_messageSend_sendEvent_8480 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_195699 = null;
		MessageEnd __DEC_message_message_195699 = null;
		Match match = null;
		Iterator fujaba__IterMessageTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check link src from _edge_message to interaction
			JavaSDM.ensure(interaction.equals(_edge_message.getSrc()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// iterate to-many link src from message to _edge_interaction
							fujaba__Success = false;

							fujaba__IterMessageTo_edge_interaction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													EMoflonEdge.class, "src"))
									.iterator();

							while (fujaba__IterMessageTo_edge_interaction
									.hasNext()) {
								try {
									_edge_interaction = (EMoflonEdge) fujaba__IterMessageTo_edge_interaction
											.next();

									// check object _edge_interaction is really bound
									JavaSDM.ensure(_edge_interaction != null);
									// check isomorphic binding between objects _edge_message and _edge_interaction 
									JavaSDM.ensure(!_edge_message
											.equals(_edge_interaction));

									// check link trg from _edge_interaction to interaction
									JavaSDM.ensure(interaction
											.equals(_edge_interaction.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// negative check for link fragment from messageReceive
										JavaSDM.ensure(messageReceive
												.getEnclosingOperand() == null);
										// negative check for link fragment from messageSend
										JavaSDM.ensure(messageSend
												.getEnclosingOperand() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_244520
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_244520 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_244520
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_244520 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_244520
															.next();

													// check object __DEC_messageReceive_receiveEvent_244520 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_244520 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_244520 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_244520
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_240608
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_240608 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_240608
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_240608 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_240608
															.next();

													// check object __DEC_messageSend_receiveEvent_240608 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_240608 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_240608 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_240608
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_36171
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_36171 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_36171
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_36171 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_36171
															.next();

													// check object __DEC_messageReceive_sendEvent_36171 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_36171 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_36171 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_36171
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_8480
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_8480 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_8480
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_8480 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_8480
															.next();

													// check object __DEC_messageSend_sendEvent_8480 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_8480 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_8480 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_8480
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

											// iterate to-many link message from message to __DEC_message_message_195699
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_195699 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_195699
															.hasNext()) {
												try {
													__DEC_message_message_195699 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_195699
															.next();

													// check object __DEC_message_message_195699 is really bound
													JavaSDM.ensure(__DEC_message_message_195699 != null);
													// check isomorphic binding between objects __DEC_message_message_195699 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_195699
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_195699 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_195699
															.equals(messageSend));

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

										// check object _edge_interaction is really bound
										JavaSDM.ensure(_edge_interaction != null);
										// check object _edge_message is really bound
										JavaSDM.ensure(_edge_message != null);
										// check object interaction is really bound
										JavaSDM.ensure(interaction != null);
										// check object line is really bound
										JavaSDM.ensure(line != null);
										// check object message is really bound
										JavaSDM.ensure(message != null);
										// check object messageReceive is really bound
										JavaSDM.ensure(messageReceive != null);
										// check object messageSend is really bound
										JavaSDM.ensure(messageSend != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects _edge_message and _edge_interaction 
										JavaSDM.ensure(!_edge_message
												.equals(_edge_interaction));

										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(interaction.equals(messageReceive
												.getEnclosingInteraction()));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(interaction.equals(messageSend
												.getEnclosingInteraction()));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link message from message to interaction
										JavaSDM.ensure(interaction
												.equals(message
														.getInteraction()));

										// check link message from messageReceive to message
										JavaSDM.ensure(message
												.equals(messageReceive
														.getMessage()));

										// check link message from messageSend to message
										JavaSDM.ensure(message
												.equals(messageSend
														.getMessage()));

										// check link receiveEvent from message to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(message
														.getReceiveEvent()));

										// check link receiveEvent from message to messageSend
										JavaSDM.ensure(!(messageSend
												.equals(message
														.getReceiveEvent())));

										// check link sendEvent from message to messageSend
										JavaSDM.ensure(messageSend
												.equals(message.getSendEvent()));

										// check link sendEvent from message to messageReceive
										JavaSDM.ensure(!(messageReceive
												.equals(message.getSendEvent())));

										// check link src from _edge_interaction to message
										JavaSDM.ensure(message
												.equals(_edge_interaction
														.getSrc()));

										// check link src from _edge_message to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_message.getSrc()));

										// check link trg from _edge_interaction to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_interaction
														.getTrg()));

										// check link trg from _edge_message to message
										JavaSDM.ensure(message
												.equals(_edge_message.getTrg()));

										// check link coveredBy from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														sysLine, messageSend,
														interaction,
														messageReceive,
														message, line);
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
													__result.getContents().add(
															match);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_371(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377484 = null;
		Message __DEC_messageReceive_receiveEvent_377484 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_862203 = null;
		Message __DEC_messageSend_receiveEvent_862203 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_878958 = null;
		Message __DEC_messageReceive_sendEvent_878958 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192111 = null;
		Message __DEC_messageSend_sendEvent_192111 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_577943 = null;
		MessageEnd __DEC_message_message_577943 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		MessageOccurrenceSpecification messageSend = null;

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
			_TmpObject = _edge_message.getSrc();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link trg from _edge_message to message
			JavaSDM.ensure(message.equals(_edge_message.getTrg()));

			// iterate to-many link coveredBy from messageSend to sysLine
			fujaba__Success = false;

			fujaba__IterMessageSendToSysLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
							.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// bind object
					interaction = messageSend.getEnclosingInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// iterate to-many link lifeline from interaction to line
					fujaba__Success = false;

					fujaba__IterInteractionToLine = new ArrayList(
							interaction.getLifeline()).iterator();

					while (fujaba__IterInteractionToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterInteractionToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// check link coveredBy from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_377484
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377484 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377484
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_377484 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377484
													.next();

											// check object __DEC_messageReceive_receiveEvent_377484 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_377484 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_377484 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_377484
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_862203
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_862203 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_862203
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_862203 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_862203
													.next();

											// check object __DEC_messageSend_receiveEvent_862203 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_862203 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_862203 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_862203
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_878958
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_878958 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_878958
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_878958 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_878958
													.next();

											// check object __DEC_messageReceive_sendEvent_878958 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_878958 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_878958 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_878958
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_192111
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192111 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192111
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_192111 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192111
													.next();

											// check object __DEC_messageSend_sendEvent_192111 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_192111 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_192111 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_192111
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

									// iterate to-many link message from message to __DEC_message_message_577943
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_577943 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_577943
													.hasNext()) {
										try {
											__DEC_message_message_577943 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_577943
													.next();

											// check object __DEC_message_message_577943 is really bound
											JavaSDM.ensure(__DEC_message_message_577943 != null);
											// check isomorphic binding between objects __DEC_message_message_577943 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_577943
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_577943 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_577943
													.equals(messageSend));

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

								// check object _edge_message is really bound
								JavaSDM.ensure(_edge_message != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_message to messageSend
								JavaSDM.ensure(messageSend.equals(_edge_message
										.getSrc()));

								// check link trg from _edge_message to message
								JavaSDM.ensure(message.equals(_edge_message
										.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_372(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_136732 = null;
		Message __DEC_messageReceive_receiveEvent_136732 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_744306 = null;
		Message __DEC_messageSend_receiveEvent_744306 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_933088 = null;
		Message __DEC_messageReceive_sendEvent_933088 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_264440 = null;
		Message __DEC_messageSend_sendEvent_264440 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_156952 = null;
		MessageEnd __DEC_message_message_156952 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check link src from _edge_message to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_message.getSrc()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_136732
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_136732 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_136732
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_136732 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_136732
													.next();

											// check object __DEC_messageReceive_receiveEvent_136732 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_136732 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_136732 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_136732
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_744306
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_744306 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_744306
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_744306 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_744306
													.next();

											// check object __DEC_messageSend_receiveEvent_744306 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_744306 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_744306 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_744306
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_933088
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_933088 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_933088
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_933088 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_933088
													.next();

											// check object __DEC_messageReceive_sendEvent_933088 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_933088 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_933088 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_933088
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_264440
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_264440 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_264440
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_264440 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_264440
													.next();

											// check object __DEC_messageSend_sendEvent_264440 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_264440 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_264440 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_264440
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

									// iterate to-many link message from message to __DEC_message_message_156952
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_156952 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_156952
													.hasNext()) {
										try {
											__DEC_message_message_156952 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_156952
													.next();

											// check object __DEC_message_message_156952 is really bound
											JavaSDM.ensure(__DEC_message_message_156952 != null);
											// check isomorphic binding between objects __DEC_message_message_156952 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_156952
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_156952 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_156952
													.equals(messageSend));

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

								// check object _edge_message is really bound
								JavaSDM.ensure(_edge_message != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_message to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_message.getSrc()));

								// check link trg from _edge_message to message
								JavaSDM.ensure(message.equals(_edge_message
										.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_373(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_947496 = null;
		Message __DEC_messageReceive_receiveEvent_947496 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_942300 = null;
		Message __DEC_messageSend_receiveEvent_942300 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857768 = null;
		Message __DEC_messageReceive_sendEvent_857768 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_376952 = null;
		Message __DEC_messageSend_sendEvent_376952 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_690335 = null;
		MessageEnd __DEC_message_message_690335 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_coveredBy is really bound
			JavaSDM.ensure(_edge_coveredBy != null);
			// bind object
			_TmpObject = _edge_coveredBy.getSrc();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// iterate to-many link fragment from interaction to messageSend
			fujaba__Success = false;

			fujaba__IterInteractionToMessageSend = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToMessageSend.next();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;
					// bind object
					message = messageSend.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// bind object
					_TmpObject = message.getReceiveEvent();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link fragment from messageReceive to interaction
					JavaSDM.ensure(interaction.equals(messageReceive
							.getEnclosingInteraction()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// check link trg from _edge_coveredBy to messageReceive
					JavaSDM.ensure(messageReceive.equals(_edge_coveredBy
							.getTrg()));

					// check link coveredBy from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link coveredBy from messageSend to sysLine
					fujaba__Success = false;

					fujaba__IterMessageSendToSysLine = new ArrayList(
							messageSend.getCovered()).iterator();

					while (fujaba__IterMessageSendToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_947496
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_947496 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_947496
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_947496 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_947496
													.next();

											// check object __DEC_messageReceive_receiveEvent_947496 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_947496 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_947496 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_947496
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_942300
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_942300 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_942300
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_942300 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_942300
													.next();

											// check object __DEC_messageSend_receiveEvent_942300 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_942300 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_942300 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_942300
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_857768
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857768 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857768
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_857768 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857768
													.next();

											// check object __DEC_messageReceive_sendEvent_857768 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_857768 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_857768 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_857768
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_376952
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_376952 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_376952
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_376952 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_376952
													.next();

											// check object __DEC_messageSend_sendEvent_376952 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_376952 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_376952 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_376952
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

									// iterate to-many link message from message to __DEC_message_message_690335
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_690335 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_690335
													.hasNext()) {
										try {
											__DEC_message_message_690335 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_690335
													.next();

											// check object __DEC_message_message_690335 is really bound
											JavaSDM.ensure(__DEC_message_message_690335 != null);
											// check isomorphic binding between objects __DEC_message_message_690335 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_690335
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_690335 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_690335
													.equals(messageSend));

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

								// check object _edge_coveredBy is really bound
								JavaSDM.ensure(_edge_coveredBy != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(interaction
										.equals(messageReceive
												.getEnclosingInteraction()));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(interaction.equals(messageSend
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

								// check link message from messageSend to message
								JavaSDM.ensure(message.equals(messageSend
										.getMessage()));

								// check link receiveEvent from message to messageReceive
								JavaSDM.ensure(messageReceive.equals(message
										.getReceiveEvent()));

								// check link receiveEvent from message to messageSend
								JavaSDM.ensure(!(messageSend.equals(message
										.getReceiveEvent())));

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link sendEvent from message to messageReceive
								JavaSDM.ensure(!(messageReceive.equals(message
										.getSendEvent())));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_coveredBy.getTrg()));

								// check link coveredBy from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, interaction,
										messageReceive, message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_374(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_121834 = null;
		Message __DEC_messageReceive_receiveEvent_121834 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_761697 = null;
		Message __DEC_messageSend_receiveEvent_761697 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_564909 = null;
		Message __DEC_messageReceive_sendEvent_564909 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459240 = null;
		Message __DEC_messageSend_sendEvent_459240 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_478542 = null;
		MessageEnd __DEC_message_message_478542 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
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

			// iterate to-many link src from line to _edge_coveredBy
			fujaba__Success = false;

			fujaba__IterLineTo_edge_coveredBy = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(line,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterLineTo_edge_coveredBy.hasNext()) {
				try {
					_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
							.next();

					// check object _edge_coveredBy is really bound
					JavaSDM.ensure(_edge_coveredBy != null);
					// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
					JavaSDM.ensure(!_edge_coveredBy.equals(_edge_covered));

					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// iterate to-many link fragment from interaction to messageSend
					fujaba__Success = false;

					fujaba__IterInteractionToMessageSend = new ArrayList(
							interaction.getFragment()).iterator();

					while (fujaba__IterInteractionToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterInteractionToMessageSend
									.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// bind object
							message = messageSend.getMessage();

							// check object message is really bound
							JavaSDM.ensure(message != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// bind object
							_TmpObject = message.getReceiveEvent();

							// ensure correct type and really bound of object messageReceive
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageReceive = (MessageOccurrenceSpecification) _TmpObject;

							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link fragment from messageReceive to interaction
							JavaSDM.ensure(interaction.equals(messageReceive
									.getEnclosingInteraction()));

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// check link src from _edge_covered to messageReceive
							JavaSDM.ensure(messageReceive.equals(_edge_covered
									.getSrc()));

							// check link trg from _edge_coveredBy to messageReceive
							JavaSDM.ensure(messageReceive
									.equals(_edge_coveredBy.getTrg()));

							// check link coveredBy from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// iterate to-many link coveredBy from messageSend to sysLine
							fujaba__Success = false;

							fujaba__IterMessageSendToSysLine = new ArrayList(
									messageSend.getCovered()).iterator();

							while (fujaba__IterMessageSendToSysLine.hasNext()) {
								try {
									sysLine = (Lifeline) fujaba__IterMessageSendToSysLine
											.next();

									// check object sysLine is really bound
									JavaSDM.ensure(sysLine != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// negative check for link fragment from messageReceive
										JavaSDM.ensure(messageReceive
												.getEnclosingOperand() == null);
										// negative check for link fragment from messageSend
										JavaSDM.ensure(messageSend
												.getEnclosingOperand() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_121834
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_121834 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_121834
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_121834 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_121834
															.next();

													// check object __DEC_messageReceive_receiveEvent_121834 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_121834 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_121834 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_121834
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_761697
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_761697 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_761697
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_761697 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_761697
															.next();

													// check object __DEC_messageSend_receiveEvent_761697 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_761697 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_761697 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_761697
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_564909
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_564909 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_564909
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_564909 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_564909
															.next();

													// check object __DEC_messageReceive_sendEvent_564909 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_564909 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_564909 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_564909
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_459240
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459240 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459240
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_459240 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459240
															.next();

													// check object __DEC_messageSend_sendEvent_459240 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_459240 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_459240 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_459240
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

											// iterate to-many link message from message to __DEC_message_message_478542
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_478542 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_478542
															.hasNext()) {
												try {
													__DEC_message_message_478542 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_478542
															.next();

													// check object __DEC_message_message_478542 is really bound
													JavaSDM.ensure(__DEC_message_message_478542 != null);
													// check isomorphic binding between objects __DEC_message_message_478542 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_478542
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_478542 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_478542
															.equals(messageSend));

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

										// check object _edge_covered is really bound
										JavaSDM.ensure(_edge_covered != null);
										// check object _edge_coveredBy is really bound
										JavaSDM.ensure(_edge_coveredBy != null);
										// check object interaction is really bound
										JavaSDM.ensure(interaction != null);
										// check object line is really bound
										JavaSDM.ensure(line != null);
										// check object message is really bound
										JavaSDM.ensure(message != null);
										// check object messageReceive is really bound
										JavaSDM.ensure(messageReceive != null);
										// check object messageSend is really bound
										JavaSDM.ensure(messageSend != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
										JavaSDM.ensure(!_edge_coveredBy
												.equals(_edge_covered));

										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(interaction.equals(messageReceive
												.getEnclosingInteraction()));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(interaction.equals(messageSend
												.getEnclosingInteraction()));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link message from message to interaction
										JavaSDM.ensure(interaction
												.equals(message
														.getInteraction()));

										// check link message from messageReceive to message
										JavaSDM.ensure(message
												.equals(messageReceive
														.getMessage()));

										// check link message from messageSend to message
										JavaSDM.ensure(message
												.equals(messageSend
														.getMessage()));

										// check link receiveEvent from message to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(message
														.getReceiveEvent()));

										// check link receiveEvent from message to messageSend
										JavaSDM.ensure(!(messageSend
												.equals(message
														.getReceiveEvent())));

										// check link sendEvent from message to messageSend
										JavaSDM.ensure(messageSend
												.equals(message.getSendEvent()));

										// check link sendEvent from message to messageReceive
										JavaSDM.ensure(!(messageReceive
												.equals(message.getSendEvent())));

										// check link src from _edge_covered to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_covered.getSrc()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_covered to line
										JavaSDM.ensure(line
												.equals(_edge_covered.getTrg()));

										// check link trg from _edge_coveredBy to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														sysLine, messageSend,
														interaction,
														messageReceive,
														message, line);
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
													__result.getContents().add(
															match);

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
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(BasicFlow) arguments.get(7),
					(FlowToInteractionFragment) arguments.get(8),
					(UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(NormalStep) arguments.get(11),
					(Lifeline) arguments.get(12),
					(ActorToLifeline) arguments.get(13));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Interaction) arguments.get(7),
					(MessageOccurrenceSpecification) arguments.get(8),
					(BasicFlow) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(UseCase) arguments.get(11),
					(UseCaseToInteraction) arguments.get(12),
					(Message) arguments.get(13), (Lifeline) arguments.get(14),
					(ActorToLifeline) arguments.get(15));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_361__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_361((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_362__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_362((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_363__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_363((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_364__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_364((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_365__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_365((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_366__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_366((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_89((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_367__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_367((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_368__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_368((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_369__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_369((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_370__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_370((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_371__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_371((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_372__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_372((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_373__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_373((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_374__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_374((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserStepBFMessageRuleImpl
