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

import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule;
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
 * An implementation of the model object '<em><b>Normal Step To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NormalStepToMessageRuleImpl extends AbstractRuleImpl implements
		NormalStepToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStepToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNormalStepToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Flow flow,
			NormalStep step, Actor actor, PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, useCase, flow,
					step, actor, packageDeclaration));

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
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
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				__flow_steps_step.setSrc(flow);

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__step_actor_actor.setSrc(step);

				// create link
				__step_actor_actor.setTrg(actor);

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, useCase, flow, step, actor,
					packageDeclaration);
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
		Flow flow = null;
		Interaction interaction = null;
		Lifeline line = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStepToMessage stepToMessage = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge message__sendEvent__messageSend = null;

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
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
			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// create object message
			message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object messageSend
			messageSend = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// assign attribute message
			message.setName((java.lang.String) csp.getValue("message", "name"));

			// create link
			line.getCoveredBy().add(messageReceive);

			// create link
			stepToMessage.setSource(step);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(message,
					messageReceive, "receiveEvent");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(message,
					messageSend, "sendEvent");

			// create link
			messageReceive.setMessage(message);

			// create link
			messageSend.setMessage(message);

			// create link
			stepToMessage.setTarget(message);

			// create link
			interaction.getMessage().add(message);

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
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

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

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

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

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

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

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("NormalStepToMessageRule");
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
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			message__sendEvent__messageSend.setTrg(messageSend);

			// create link
			messageSend__message__message.setSrc(messageSend);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			// create link
			__step_actor_actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, useCase, useCaseToInteraction,
				flow, step, message, interaction, stepToMessage, messageSend,
				messageReceive, line, actor, actorToLine, packageDeclaration);
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
		Flow flow = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __actorToLine_source_actor = null;
		CSP csp = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Lifeline line = null;
		Iterator fujaba__IterActorToActorToLine = null;
		ActorToLifeline actorToLine = null;

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
			ruleresult.setRule("NormalStepToMessageRule");

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from actor to actorToLine
			fujaba__Success = false;

			fujaba__IterActorToActorToLine = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(actor,
							ActorToLifeline.class, "source")).iterator();

			while (fujaba__IterActorToActorToLine.hasNext()) {
				try {
					actorToLine = (ActorToLifeline) fujaba__IterActorToActorToLine
							.next();

					// check object actorToLine is really bound
					JavaSDM.ensure(actorToLine != null);
					// bind object
					line = actorToLine.getTarget();

					// check object line is really bound
					JavaSDM.ensure(line != null);

					// iterate to-many link source from useCase to useCaseToInteraction
					fujaba__Success = false;

					fujaba__IterUseCaseToUseCaseToInteraction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(useCase,
											UseCaseToInteraction.class,
											"source")).iterator();

					while (fujaba__IterUseCaseToUseCaseToInteraction.hasNext()) {
						try {
							useCaseToInteraction = (UseCaseToInteraction) fujaba__IterUseCaseToUseCaseToInteraction
									.next();

							// check object useCaseToInteraction is really bound
							JavaSDM.ensure(useCaseToInteraction != null);
							// bind object
							interaction = useCaseToInteraction.getTarget();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object actorToLine is really bound
								JavaSDM.ensure(actorToLine != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link source from actorToLine to actor
								JavaSDM.ensure(actor.equals(actorToLine
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from actorToLine to line
								JavaSDM.ensure(line.equals(actorToLine
										.getTarget()));

								// check link target from useCaseToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(useCaseToInteraction
												.getTarget()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object __useCase_flows_flow
								__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __useCaseToInteraction_source_useCase
								__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCaseToInteraction_target_interaction
								__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __flow_steps_step
								__flow_steps_step = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __step_actor_actor
								__step_actor_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __line_interaction_interaction
								__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __interaction_lifeline_line
								__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __actorToLine_target_line
								__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __actorToLine_source_actor
								__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __useCase_flows_flow
								__useCase_flows_flow.setName("flows");
								// assign attribute __useCaseToInteraction_source_useCase
								__useCaseToInteraction_source_useCase
										.setName("source");
								// assign attribute __useCaseToInteraction_target_interaction
								__useCaseToInteraction_target_interaction
										.setName("target");
								// assign attribute __flow_steps_step
								__flow_steps_step.setName("steps");
								// assign attribute __step_actor_actor
								__step_actor_actor.setName("actor");
								// assign attribute __line_interaction_interaction
								__line_interaction_interaction
										.setName("interaction");
								// assign attribute __interaction_lifeline_line
								__interaction_lifeline_line.setName("lifeline");
								// assign attribute __actorToLine_source_actor
								__actorToLine_source_actor.setName("source");
								// assign attribute __actorToLine_target_line
								__actorToLine_target_line.setName("target");
								// assign attribute __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor
										.setName("actors");
								// assign attribute __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase
										.setName("useCases");

								// create link
								__useCase_flows_flow.setSrc(useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								__useCaseToInteraction_source_useCase
										.setTrg(useCase);

								// create link
								__packageDeclaration_useCases_useCase
										.setTrg(useCase);

								// create link
								__useCaseToInteraction_source_useCase
										.setSrc(useCaseToInteraction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCaseToInteraction);

								// create link
								__useCaseToInteraction_target_interaction
										.setSrc(useCaseToInteraction);

								// create link
								__flow_steps_step.setSrc(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__useCase_flows_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										step);

								// create link
								__flow_steps_step.setTrg(step);

								// create link
								__step_actor_actor.setSrc(step);

								// create link
								__useCaseToInteraction_target_interaction
										.setTrg(interaction);

								// create link
								__line_interaction_interaction
										.setTrg(interaction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										interaction);

								// create link
								__interaction_lifeline_line.setSrc(interaction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										line);

								// create link
								__actorToLine_target_line.setTrg(line);

								// create link
								__line_interaction_interaction.setSrc(line);

								// create link
								__interaction_lifeline_line.setTrg(line);

								// create link
								__packageDeclaration_actors_actor.setTrg(actor);

								// create link
								__step_actor_actor.setTrg(actor);

								// create link
								__actorToLine_source_actor.setTrg(actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actorToLine);

								// create link
								__actorToLine_target_line.setSrc(actorToLine);

								// create link
								__actorToLine_source_actor.setSrc(actorToLine);

								// create link
								__packageDeclaration_actors_actor
										.setSrc(packageDeclaration);

								// create link
								isApplicableMatch.getAllContextElements().add(
										packageDeclaration);

								// create link
								__packageDeclaration_useCases_useCase
										.setSrc(packageDeclaration);

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
												__step_actor_actor,
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
												__packageDeclaration_actors_actor,
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
												__actorToLine_source_actor,
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
												__flow_steps_step,
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
												__useCase_flows_flow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__line_interaction_interaction,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch, useCase,
													useCaseToInteraction, flow,
													step, interaction, line,
													actor, actorToLine,
													packageDeclaration));

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
												.setRuleName("NormalStepToMessageRule");
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
			Flow flow, NormalStep step, Actor actor,
			PackageDeclaration packageDeclaration) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Flow flow, NormalStep step, Actor actor,
			PackageDeclaration packageDeclaration) {
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
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Flow flow, NormalStep step, Interaction interaction, Lifeline line,
			Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject messageSend, EObject messageReceive,
			EObject line, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
	public boolean isAppropriate_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;

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
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, message,
					interaction, messageSend, messageReceive, line));

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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

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
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

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
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, message, interaction,
					messageSend, messageReceive, line);
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
		Flow flow = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge stepToMessage__target__message = null;

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
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
			flow.getSteps().add(step); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(step, actor,
					"actor");

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
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

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

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

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

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

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

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("NormalStepToMessageRule");
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
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			step__actor__actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, useCase, useCaseToInteraction,
				flow, step, message, interaction, stepToMessage, messageSend,
				messageReceive, line, actor, actorToLine, packageDeclaration);
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
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __actorToLine_source_actor = null;
		CSP csp = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Actor actor = null;
		Iterator fujaba__IterLineToActorToLine = null;
		ActorToLifeline actorToLine = null;

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
			ruleresult.setRule("NormalStepToMessageRule");

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
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// iterate to-many link target from line to actorToLine
			fujaba__Success = false;

			fujaba__IterLineToActorToLine = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(line,
							ActorToLifeline.class, "target")).iterator();

			while (fujaba__IterLineToActorToLine.hasNext()) {
				try {
					actorToLine = (ActorToLifeline) fujaba__IterLineToActorToLine
							.next();

					// check object actorToLine is really bound
					JavaSDM.ensure(actorToLine != null);
					// bind object
					actor = actorToLine.getSource();

					// check object actor is really bound
					JavaSDM.ensure(actor != null);

					// iterate to-many link target from interaction to useCaseToInteraction
					fujaba__Success = false;

					fujaba__IterInteractionToUseCaseToInteraction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(interaction,
											UseCaseToInteraction.class,
											"target")).iterator();

					while (fujaba__IterInteractionToUseCaseToInteraction
							.hasNext()) {
						try {
							useCaseToInteraction = (UseCaseToInteraction) fujaba__IterInteractionToUseCaseToInteraction
									.next();

							// check object useCaseToInteraction is really bound
							JavaSDM.ensure(useCaseToInteraction != null);
							// bind object
							useCase = useCaseToInteraction.getSource();

							// check object useCase is really bound
							JavaSDM.ensure(useCase != null);

							// story node 'find context'
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
								// check object message is really bound
								JavaSDM.ensure(message != null);
								// check object messageReceive is really bound
								JavaSDM.ensure(messageReceive != null);
								// check object messageSend is really bound
								JavaSDM.ensure(messageSend != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

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

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link source from actorToLine to actor
								JavaSDM.ensure(actor.equals(actorToLine
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link target from actorToLine to line
								JavaSDM.ensure(line.equals(actorToLine
										.getTarget()));

								// check link target from useCaseToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(useCaseToInteraction
												.getTarget()));

								// bind object
								packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
										.eContainer() : null;

								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);

								// check if contained via correct reference
								JavaSDM.ensure(packageDeclaration.getUseCases()
										.contains(useCase));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link covered from line to messageReceive
								JavaSDM.ensure(line.getCoveredBy().contains(
										messageReceive));

								// iterate to-many link flows from useCase to flow
								fujaba__Success = false;

								fujaba__IterUseCaseToFlow = new ArrayList(
										useCase.getFlows()).iterator();

								while (fujaba__IterUseCaseToFlow.hasNext()) {
									try {
										flow = (Flow) fujaba__IterUseCaseToFlow
												.next();

										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_receiveEvent_messageReceive
										__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_sendEvent_messageSend
										__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_message_message
										__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_interaction_interaction
										__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_message_message
										__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_message_message
										__interaction_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageReceive
										__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_covered_line
										__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __actorToLine_target_line
										__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __actorToLine_source_actor
										__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
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
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__useCaseToInteraction_target_interaction
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__message_receiveEvent_messageReceive
												.setSrc(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														message);

										// create link
										__message_sendEvent_messageSend
												.setSrc(message);

										// create link
										__messageSend_message_message
												.setTrg(message);

										// create link
										__message_interaction_interaction
												.setSrc(message);

										// create link
										__messageReceive_message_message
												.setTrg(message);

										// create link
										__interaction_message_message
												.setTrg(message);

										// create link
										__interaction_message_message
												.setSrc(interaction);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__message_interaction_interaction
												.setTrg(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__message_sendEvent_messageSend
												.setTrg(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__messageSend_message_message
												.setSrc(messageSend);

										// create link
										__line_coveredBy_messageReceive
												.setTrg(messageReceive);

										// create link
										__message_receiveEvent_messageReceive
												.setTrg(messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__messageReceive_covered_line
												.setSrc(messageReceive);

										// create link
										__messageReceive_message_message
												.setSrc(messageReceive);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__line_coveredBy_messageReceive
												.setSrc(line);

										// create link
										__messageReceive_covered_line
												.setTrg(line);

										// create link
										__actorToLine_target_line.setTrg(line);

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__actorToLine_source_actor
												.setTrg(actor);

										// create link
										__actorToLine_source_actor
												.setSrc(actorToLine);

										// create link
										__actorToLine_target_line
												.setSrc(actorToLine);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actorToLine);

										// create link
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

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
														__useCaseToInteraction_target_interaction,
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
														__line_coveredBy_messageReceive,
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
														__messageReceive_covered_line,
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
														__interaction_lifeline_line,
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
														__packageDeclaration_actors_actor,
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
														__useCaseToInteraction_source_useCase,
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
														__message_receiveEvent_messageReceive,
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
														__messageReceive_message_message,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															useCase,
															useCaseToInteraction,
															flow, message,
															interaction,
															messageSend,
															messageReceive,
															line, actor,
															actorToLine,
															packageDeclaration));

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
														.setRuleName("NormalStepToMessageRule");
												// assign attribute ruleresult
												ruleresult.setSuccess(true);

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
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);
		match.registerObject("messageSend", messageSend);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
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
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Flow flow, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
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
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject messageSend, EObject messageReceive,
			EObject line, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
				&& match.getObject("messageSend")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_540544 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Actor actor = null;
		NormalStep step = null;
		Flow flow = null;

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

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
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// check link steps from step to flow
			JavaSDM.ensure(flow.equals(step.eContainer()));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// check link actors from actor to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_540544 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_540544 is really bound
					JavaSDM.ensure(__DEC_step_steps_540544 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_540544.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_540544 and flow 
					JavaSDM.ensure(!__DEC_step_steps_540544.equals(flow));

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link actors from actor to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_steps to flow
				JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_steps to step
				JavaSDM.ensure(step.equals(_edge_steps.getTrg()));

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, useCase, flow,
						step, actor, packageDeclaration);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_567850 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Flow flow = null;
		Actor actor = null;
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
			actor = step.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = step.eContainer() instanceof Flow ? (Flow) step.eContainer()
					: null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(step));

			// bind object
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// check link actors from actor to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_567850 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_567850 is really bound
					JavaSDM.ensure(__DEC_step_steps_567850 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_567850.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_567850 and flow 
					JavaSDM.ensure(!__DEC_step_steps_567850.equals(flow));

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link actors from actor to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_actor to step
				JavaSDM.ensure(step.equals(_edge_actor.getSrc()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_actor to actor
				JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, useCase, flow,
						step, actor, packageDeclaration);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_193255 = null;
		Interaction __DEC_messageSend_enclosingInteraction_575804 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777693 = null;
		Message __DEC_messageReceive_receiveEvent_777693 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718395 = null;
		Message __DEC_messageSend_receiveEvent_718395 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_474186 = null;
		Message __DEC_messageReceive_sendEvent_474186 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147918 = null;
		Message __DEC_messageSend_sendEvent_147918 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_764697 = null;
		MessageEnd __DEC_message_message_764697 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_sendEvent is really bound
			JavaSDM.ensure(_edge_sendEvent != null);
			// bind object
			_TmpObject = _edge_sendEvent.getSrc();

			// ensure correct type and really bound of object message
			JavaSDM.ensure(_TmpObject instanceof Message);
			message = (Message) _TmpObject;

			// bind object
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link trg from _edge_sendEvent to messageSend
			JavaSDM.ensure(messageSend.equals(_edge_sendEvent.getTrg()));

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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_193255 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_193255 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_193255 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_193255 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_193255
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
							__DEC_messageSend_enclosingInteraction_575804 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_575804 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_575804 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_575804 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_575804
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_777693
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777693 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777693
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_777693 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777693
											.next();

									// check object __DEC_messageReceive_receiveEvent_777693 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_777693 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_777693 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_777693
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_718395
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718395 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718395
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_718395 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718395
											.next();

									// check object __DEC_messageSend_receiveEvent_718395 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_718395 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_718395 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_718395
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_474186
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_474186 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_474186
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_474186 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_474186
											.next();

									// check object __DEC_messageReceive_sendEvent_474186 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_474186 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_474186 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_474186
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_147918
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147918 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147918
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_147918 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147918
											.next();

									// check object __DEC_messageSend_sendEvent_147918 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_147918 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_147918 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_147918
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

							// iterate to-many link message from message to __DEC_message_message_764697
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_764697 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_764697
											.hasNext()) {
								try {
									__DEC_message_message_764697 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_764697
											.next();

									// check object __DEC_message_message_764697 is really bound
									JavaSDM.ensure(__DEC_message_message_764697 != null);
									// check isomorphic binding between objects __DEC_message_message_764697 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_764697
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_764697 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_764697
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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

						// check link src from _edge_sendEvent to message
						JavaSDM.ensure(message.equals(_edge_sendEvent.getSrc()));

						// check link trg from _edge_sendEvent to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_sendEvent
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
								message, interaction, messageSend,
								messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_747563 = null;
		Interaction __DEC_messageSend_enclosingInteraction_785572 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_581606 = null;
		Message __DEC_messageReceive_receiveEvent_581606 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_507298 = null;
		Message __DEC_messageSend_receiveEvent_507298 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_775672 = null;
		Message __DEC_messageReceive_sendEvent_775672 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_426344 = null;
		Message __DEC_messageSend_sendEvent_426344 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_516013 = null;
		MessageEnd __DEC_message_message_516013 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_747563 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_747563 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_747563 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_747563 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_747563
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
							__DEC_messageSend_enclosingInteraction_785572 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_785572 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_785572 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_785572 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_785572
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_581606
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_581606 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_581606
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_581606 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_581606
											.next();

									// check object __DEC_messageReceive_receiveEvent_581606 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_581606 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_581606 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_581606
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_507298
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_507298 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_507298
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_507298 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_507298
											.next();

									// check object __DEC_messageSend_receiveEvent_507298 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_507298 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_507298 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_507298
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_775672
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_775672 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_775672
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_775672 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_775672
											.next();

									// check object __DEC_messageReceive_sendEvent_775672 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_775672 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_775672 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_775672
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_426344
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_426344 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_426344
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_426344 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_426344
											.next();

									// check object __DEC_messageSend_sendEvent_426344 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_426344 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_426344 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_426344
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

							// iterate to-many link message from message to __DEC_message_message_516013
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_516013 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_516013
											.hasNext()) {
								try {
									__DEC_message_message_516013 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_516013
											.next();

									// check object __DEC_message_message_516013 is really bound
									JavaSDM.ensure(__DEC_message_message_516013 != null);
									// check isomorphic binding between objects __DEC_message_message_516013 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_516013
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_516013 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_516013
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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
								message, interaction, messageSend,
								messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_6(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_529129 = null;
		Interaction __DEC_messageSend_enclosingInteraction_537296 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_269241 = null;
		Message __DEC_messageReceive_receiveEvent_269241 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_219307 = null;
		Message __DEC_messageSend_receiveEvent_219307 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_323478 = null;
		Message __DEC_messageReceive_sendEvent_323478 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_833660 = null;
		Message __DEC_messageSend_sendEvent_833660 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_407390 = null;
		MessageEnd __DEC_message_message_407390 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
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
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_529129 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_529129 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_529129 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_529129 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_529129
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
							__DEC_messageSend_enclosingInteraction_537296 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_537296 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_537296 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_537296 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_537296
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_269241
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_269241 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_269241
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_269241 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_269241
											.next();

									// check object __DEC_messageReceive_receiveEvent_269241 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_269241 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_269241 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_269241
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_219307
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_219307 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_219307
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_219307 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_219307
											.next();

									// check object __DEC_messageSend_receiveEvent_219307 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_219307 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_219307 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_219307
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_323478
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_323478 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_323478
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_323478 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_323478
											.next();

									// check object __DEC_messageReceive_sendEvent_323478 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_323478 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_323478 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_323478
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_833660
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_833660 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_833660
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_833660 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_833660
											.next();

									// check object __DEC_messageSend_sendEvent_833660 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_833660 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_833660 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_833660
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

							// iterate to-many link message from message to __DEC_message_message_407390
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_407390 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_407390
											.hasNext()) {
								try {
									__DEC_message_message_407390 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_407390
											.next();

									// check object __DEC_message_message_407390 is really bound
									JavaSDM.ensure(__DEC_message_message_407390 != null);
									// check isomorphic binding between objects __DEC_message_message_407390 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_407390
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_407390 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_407390
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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
								message, interaction, messageSend,
								messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_971747 = null;
		Interaction __DEC_messageSend_enclosingInteraction_797346 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_495804 = null;
		Message __DEC_messageReceive_receiveEvent_495804 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_270946 = null;
		Message __DEC_messageSend_receiveEvent_270946 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905656 = null;
		Message __DEC_messageReceive_sendEvent_905656 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_463891 = null;
		Message __DEC_messageSend_sendEvent_463891 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_864359 = null;
		MessageEnd __DEC_message_message_864359 = null;
		Match match = null;
		Iterator fujaba__IterMessageTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
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

								// negative check for link fragment from messageReceive
								JavaSDM.ensure(messageReceive
										.getEnclosingOperand() == null);
								// negative check for link fragment from messageSend
								JavaSDM.ensure(messageSend
										.getEnclosingOperand() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_971747 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_971747 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_971747 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_971747 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_971747
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
									__DEC_messageSend_enclosingInteraction_797346 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_797346 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_797346 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_797346 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_797346
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_495804
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_495804 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_495804
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_495804 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_495804
													.next();

											// check object __DEC_messageReceive_receiveEvent_495804 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_495804 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_495804 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_495804
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_270946
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_270946 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_270946
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_270946 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_270946
													.next();

											// check object __DEC_messageSend_receiveEvent_270946 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_270946 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_270946 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_270946
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_905656
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905656 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905656
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_905656 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_905656
													.next();

											// check object __DEC_messageReceive_sendEvent_905656 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_905656 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_905656 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_905656
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_463891
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_463891 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_463891
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_463891 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_463891
													.next();

											// check object __DEC_messageSend_sendEvent_463891 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_463891 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_463891 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_463891
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

									// iterate to-many link message from message to __DEC_message_message_864359
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_864359 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_864359
													.hasNext()) {
										try {
											__DEC_message_message_864359 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_864359
													.next();

											// check object __DEC_message_message_864359 is really bound
											JavaSDM.ensure(__DEC_message_message_864359 != null);
											// check isomorphic binding between objects __DEC_message_message_864359 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_864359
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_864359 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_864359
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
								// check isomorphic binding between objects _edge_message and _edge_interaction 
								JavaSDM.ensure(!_edge_message
										.equals(_edge_interaction));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

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
										message, interaction, messageSend,
										messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_722399 = null;
		Interaction __DEC_messageSend_enclosingInteraction_68241 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_558006 = null;
		Message __DEC_messageReceive_receiveEvent_558006 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_65125 = null;
		Message __DEC_messageSend_receiveEvent_65125 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_302187 = null;
		Message __DEC_messageReceive_sendEvent_302187 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_57563 = null;
		Message __DEC_messageSend_sendEvent_57563 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_884466 = null;
		MessageEnd __DEC_message_message_884466 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
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
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link src from _edge_message to messageSend
			JavaSDM.ensure(messageSend.equals(_edge_message.getSrc()));

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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_722399 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_722399 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_722399 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_722399 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_722399
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
							__DEC_messageSend_enclosingInteraction_68241 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_68241 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_68241 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_68241 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_68241
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_558006
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_558006 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_558006
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_558006 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_558006
											.next();

									// check object __DEC_messageReceive_receiveEvent_558006 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_558006 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_558006 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_558006
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_65125
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_65125 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_65125
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_65125 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_65125
											.next();

									// check object __DEC_messageSend_receiveEvent_65125 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_65125 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_65125 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_65125
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_302187
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_302187 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_302187
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_302187 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_302187
											.next();

									// check object __DEC_messageReceive_sendEvent_302187 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_302187 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_302187 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_302187
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_57563
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_57563 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_57563
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_57563 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_57563
											.next();

									// check object __DEC_messageSend_sendEvent_57563 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_57563 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_57563 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_57563
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

							// iterate to-many link message from message to __DEC_message_message_884466
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_884466 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_884466
											.hasNext()) {
								try {
									__DEC_message_message_884466 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_884466
											.next();

									// check object __DEC_message_message_884466 is really bound
									JavaSDM.ensure(__DEC_message_message_884466 != null);
									// check isomorphic binding between objects __DEC_message_message_884466 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_884466
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_884466 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_884466
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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

						// check link src from _edge_message to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_message
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
								message, interaction, messageSend,
								messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_982255 = null;
		Interaction __DEC_messageSend_enclosingInteraction_962499 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_396785 = null;
		Message __DEC_messageReceive_receiveEvent_396785 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884766 = null;
		Message __DEC_messageSend_receiveEvent_884766 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_550904 = null;
		Message __DEC_messageReceive_sendEvent_550904 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_819494 = null;
		Message __DEC_messageSend_sendEvent_819494 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_662373 = null;
		MessageEnd __DEC_message_message_662373 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
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
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			_TmpObject = message.getReceiveEvent();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_982255 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_982255 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_982255 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_982255 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_982255
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
							__DEC_messageSend_enclosingInteraction_962499 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_962499 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_962499 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_962499 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_962499
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_396785
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_396785 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_396785
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_396785 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_396785
											.next();

									// check object __DEC_messageReceive_receiveEvent_396785 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_396785 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_396785 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_396785
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_884766
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884766 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884766
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_884766 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884766
											.next();

									// check object __DEC_messageSend_receiveEvent_884766 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_884766 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_884766 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_884766
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_550904
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_550904 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_550904
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_550904 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_550904
											.next();

									// check object __DEC_messageReceive_sendEvent_550904 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_550904 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_550904 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_550904
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_819494
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_819494 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_819494
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_819494 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_819494
											.next();

									// check object __DEC_messageSend_sendEvent_819494 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_819494 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_819494 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_819494
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

							// iterate to-many link message from message to __DEC_message_message_662373
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_662373 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_662373
											.hasNext()) {
								try {
									__DEC_message_message_662373 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_662373
											.next();

									// check object __DEC_message_message_662373 is really bound
									JavaSDM.ensure(__DEC_message_message_662373 != null);
									// check isomorphic binding between objects __DEC_message_message_662373 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_662373
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_662373 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_662373
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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
								message, interaction, messageSend,
								messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_595591 = null;
		Interaction __DEC_messageSend_enclosingInteraction_382614 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_795810 = null;
		Message __DEC_messageReceive_receiveEvent_795810 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_173515 = null;
		Message __DEC_messageSend_receiveEvent_173515 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_762564 = null;
		Message __DEC_messageReceive_sendEvent_762564 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_823759 = null;
		Message __DEC_messageSend_sendEvent_823759 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_158651 = null;
		MessageEnd __DEC_message_message_158651 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Message message = null;
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
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// check link covered from line to messageReceive
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

					// bind object
					__DEC_messageReceive_enclosingInteraction_595591 = messageReceive
							.getEnclosingInteraction();

					// check object __DEC_messageReceive_enclosingInteraction_595591 is really bound
					JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_595591 != null);

					// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_595591 and interaction 
					JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_595591
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
					__DEC_messageSend_enclosingInteraction_382614 = messageSend
							.getEnclosingInteraction();

					// check object __DEC_messageSend_enclosingInteraction_382614 is really bound
					JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_382614 != null);

					// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_382614 and interaction 
					JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_382614
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

					// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_795810
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_795810 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_795810
									.hasNext()) {
						try {
							__DEC_messageReceive_receiveEvent_795810 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_795810
									.next();

							// check object __DEC_messageReceive_receiveEvent_795810 is really bound
							JavaSDM.ensure(__DEC_messageReceive_receiveEvent_795810 != null);
							// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_795810 and message 
							JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_795810
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

					// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_173515
					fujaba__Success = false;

					fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_173515 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageSend,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_173515
									.hasNext()) {
						try {
							__DEC_messageSend_receiveEvent_173515 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_173515
									.next();

							// check object __DEC_messageSend_receiveEvent_173515 is really bound
							JavaSDM.ensure(__DEC_messageSend_receiveEvent_173515 != null);
							// check isomorphic binding between objects __DEC_messageSend_receiveEvent_173515 and message 
							JavaSDM.ensure(!__DEC_messageSend_receiveEvent_173515
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

					// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_762564
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_762564 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_762564
									.hasNext()) {
						try {
							__DEC_messageReceive_sendEvent_762564 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_762564
									.next();

							// check object __DEC_messageReceive_sendEvent_762564 is really bound
							JavaSDM.ensure(__DEC_messageReceive_sendEvent_762564 != null);
							// check isomorphic binding between objects __DEC_messageReceive_sendEvent_762564 and message 
							JavaSDM.ensure(!__DEC_messageReceive_sendEvent_762564
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

					// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_823759
					fujaba__Success = false;

					fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_823759 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageSend,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_823759
									.hasNext()) {
						try {
							__DEC_messageSend_sendEvent_823759 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_823759
									.next();

							// check object __DEC_messageSend_sendEvent_823759 is really bound
							JavaSDM.ensure(__DEC_messageSend_sendEvent_823759 != null);
							// check isomorphic binding between objects __DEC_messageSend_sendEvent_823759 and message 
							JavaSDM.ensure(!__DEC_messageSend_sendEvent_823759
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

					// iterate to-many link message from message to __DEC_message_message_158651
					fujaba__Success = false;

					fujaba__IterMessageTo__DEC_message_message_158651 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(message,
											MessageEnd.class, "message"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageTo__DEC_message_message_158651
									.hasNext()) {
						try {
							__DEC_message_message_158651 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_158651
									.next();

							// check object __DEC_message_message_158651 is really bound
							JavaSDM.ensure(__DEC_message_message_158651 != null);
							// check isomorphic binding between objects __DEC_message_message_158651 and messageReceive 
							JavaSDM.ensure(!__DEC_message_message_158651
									.equals(messageReceive));

							// check isomorphic binding between objects __DEC_message_message_158651 and messageSend 
							JavaSDM.ensure(!__DEC_message_message_158651
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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// check link fragment from messageReceive to interaction
				JavaSDM.ensure(!(interaction.equals(messageReceive
						.getEnclosingInteraction())));

				// check link fragment from messageSend to interaction
				JavaSDM.ensure(!(interaction.equals(messageSend
						.getEnclosingInteraction())));

				// check link lifeline from line to interaction
				JavaSDM.ensure(interaction.equals(line.getInteraction()));

				// check link message from message to interaction
				JavaSDM.ensure(interaction.equals(message.getInteraction()));

				// check link message from messageReceive to message
				JavaSDM.ensure(message.equals(messageReceive.getMessage()));

				// check link message from messageSend to message
				JavaSDM.ensure(message.equals(messageSend.getMessage()));

				// check link receiveEvent from message to messageReceive
				JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

				// check link receiveEvent from message to messageSend
				JavaSDM.ensure(!(messageSend.equals(message.getReceiveEvent())));

				// check link sendEvent from message to messageSend
				JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

				// check link sendEvent from message to messageReceive
				JavaSDM.ensure(!(messageReceive.equals(message.getSendEvent())));

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
						interaction, messageSend, messageReceive, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_11(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_123118 = null;
		Interaction __DEC_messageSend_enclosingInteraction_544555 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909195 = null;
		Message __DEC_messageReceive_receiveEvent_909195 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_922662 = null;
		Message __DEC_messageSend_receiveEvent_922662 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_111392 = null;
		Message __DEC_messageReceive_sendEvent_111392 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_618999 = null;
		Message __DEC_messageSend_sendEvent_618999 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_555051 = null;
		MessageEnd __DEC_message_message_555051 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Message message = null;
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
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// bind object
			interaction = message.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// check link lifeline from line to interaction
			JavaSDM.ensure(interaction.equals(line.getInteraction()));

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

						// negative check for link fragment from messageReceive
						JavaSDM.ensure(messageReceive.getEnclosingOperand() == null);
						// negative check for link fragment from messageSend
						JavaSDM.ensure(messageSend.getEnclosingOperand() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_123118 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_123118 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_123118 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_123118 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_123118
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
							__DEC_messageSend_enclosingInteraction_544555 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_544555 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_544555 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_544555 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_544555
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_909195
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909195 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909195
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_909195 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909195
											.next();

									// check object __DEC_messageReceive_receiveEvent_909195 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_909195 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_909195 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_909195
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_922662
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_922662 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_922662
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_922662 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_922662
											.next();

									// check object __DEC_messageSend_receiveEvent_922662 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_922662 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_922662 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_922662
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_111392
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_111392 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_111392
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_111392 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_111392
											.next();

									// check object __DEC_messageReceive_sendEvent_111392 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_111392 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_111392 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_111392
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_618999
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_618999 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_618999
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_618999 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_618999
											.next();

									// check object __DEC_messageSend_sendEvent_618999 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_618999 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_618999 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_618999
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

							// iterate to-many link message from message to __DEC_message_message_555051
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_555051 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_555051
											.hasNext()) {
								try {
									__DEC_message_message_555051 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_555051
											.next();

									// check object __DEC_message_message_555051 is really bound
									JavaSDM.ensure(__DEC_message_message_555051 != null);
									// check isomorphic binding between objects __DEC_message_message_555051 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_555051
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_555051 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_555051
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
						// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
						JavaSDM.ensure(!_edge_coveredBy.equals(_edge_covered));

						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

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
								message, interaction, messageSend,
								messageReceive, line);
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
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4),
					(Interaction) arguments.get(5),
					(Lifeline) arguments.get(6), (Actor) arguments.get(7),
					(ActorToLifeline) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
			return null;
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (Message) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(Lifeline) arguments.get(8), (Actor) arguments.get(9),
					(ActorToLifeline) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NormalStepToMessageRuleImpl
