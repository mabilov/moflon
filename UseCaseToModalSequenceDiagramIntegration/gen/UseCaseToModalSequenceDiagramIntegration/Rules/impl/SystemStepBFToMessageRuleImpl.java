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
import UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule;

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
 * An implementation of the model object '<em><b>System Step BF To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemStepBFToMessageRuleImpl extends AbstractRuleImpl implements
		SystemStepBFToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStepBFToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSystemStepBFToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, BasicFlow flow,
			UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __useCase_flows_flow = null;
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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, actor, flow,
					useCase, step, packageDeclaration));

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
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "toBeTranslatedNodes");

				// create link
				__step_actor_actor.setTrg(actor);

				// create link
				__flow_steps_step.setSrc(flow);

				// create link
				__step_actor_actor.setSrc(step);

				// create link
				__flow_steps_step.setTrg(step);

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
				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
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
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

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
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, actor, flow, useCase, step,
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
		BasicFlow flow = null;
		FlowToInteractionFragment flowToInteraction = null;
		Interaction interaction = null;
		Lifeline line = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge messageSend__covered__line = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge messageSend__enclosingInteraction__interaction = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge interaction__fragment__messageSend = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge line__coveredBy__messageSend = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge messageSend__message__message = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
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
			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object messageSend
			messageSend = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object message
			message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();

			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// assign attribute message
			message.setName((java.lang.String) csp.getValue("message", "name"));

			// create link
			messageReceive.getCovered().add(line);

			// create link
			messageSend.getCovered().add(line);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageSend,
					message, "message");

			// create link
			message.setSendEvent(messageSend);

			// create link
			interaction.getFragment().add(messageSend);

			// create link
			messageReceive.setEnclosingInteraction(interaction);

			// create link
			message.setInteraction(interaction);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageReceive,
					message, "message");

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
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// create object messageSend__covered__line
			messageSend__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingInteraction__interaction
			messageSend__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageSend
			interaction__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageSend
			line__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SystemStepBFToMessageRule");
			// assign attribute line__coveredBy__messageSend
			line__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__line
			messageSend__covered__line.setName("covered");
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
					messageSend__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			// create link
			line__coveredBy__messageSend.setSrc(line);

			// create link
			messageSend__covered__line.setTrg(line);

			// create link
			messageSend__enclosingInteraction__interaction.setSrc(messageSend);

			// create link
			line__coveredBy__messageSend.setTrg(messageSend);

			// create link
			message__sendEvent__messageSend.setTrg(messageSend);

			// create link
			messageSend__message__message.setSrc(messageSend);

			// create link
			messageSend__covered__line.setSrc(messageSend);

			// create link
			interaction__fragment__messageSend.setTrg(messageSend);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			messageSend__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__messageSend.setSrc(interaction);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setSrc(messageReceive);

			// create link
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			interaction__fragment__messageReceive.setTrg(messageReceive);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, flowToInteraction, useCase,
				useCaseToInteraction, step, message, stepToMessage,
				packageDeclaration);
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
		UseCase useCase = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		CSP csp = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Interaction interaction = null;
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
			ruleresult.setRule("SystemStepBFToMessageRule");

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
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
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
					// bind object
					_TmpObject = flowToInteraction.getTarget();

					// ensure correct type and really bound of object interaction
					JavaSDM.ensure(_TmpObject instanceof Interaction);
					interaction = (Interaction) _TmpObject;

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
							// check link target from useCaseToInteraction to interaction
							JavaSDM.ensure(interaction
									.equals(useCaseToInteraction.getTarget()));

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object flowToInteraction is really bound
								JavaSDM.ensure(flowToInteraction != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
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

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link source from flowToInteraction to flow
								JavaSDM.ensure(flow.equals(flowToInteraction
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from flowToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(flowToInteraction.getTarget()));

								// check link target from useCaseToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(useCaseToInteraction
												.getTarget()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

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
										// create object __step_actor_actor
										__step_actor_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

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

										// create object __flowToInteraction_source_flow
										__flowToInteraction_source_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_step
										__flow_steps_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __flowToInteraction_source_flow
										__flowToInteraction_source_flow
												.setName("source");
										// assign attribute __flowToInteraction_target_interaction
										__flowToInteraction_target_interaction
												.setName("target");
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
										__interaction_lifeline_line
												.setName("lifeline");
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");

										// create link
										__step_actor_actor.setTrg(actor);

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__flowToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

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
										__flowToInteraction_source_flow
												.setTrg(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flowToInteraction_source_flow
												.setSrc(flowToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToInteraction);

										// create link
										__flowToInteraction_target_interaction
												.setSrc(flowToInteraction);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										__useCaseToInteraction_target_interaction
												.setSrc(useCaseToInteraction);

										// create link
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__step_actor_actor.setSrc(step);

										// create link
										__flow_steps_step.setTrg(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

										// create link
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

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
														__packageDeclaration_useCases_useCase,
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
														__flow_steps_step,
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
														__step_actor_actor,
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
														__packageDeclaration_actors_actor,
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
														__flowToInteraction_target_interaction,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															actor,
															line,
															interaction,
															flow,
															flowToInteraction,
															useCase,
															useCaseToInteraction,
															step,
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
														.setRuleName("SystemStepBFToMessageRule");
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
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
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
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			NormalStep step, PackageDeclaration packageDeclaration) {
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
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
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
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageSend_message_message = null;
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
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, line,
					messageSend, interaction, messageReceive, message));

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

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_line
				__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageSend
				__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageSend
				__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_coveredBy_messageSend
				__line_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_line
				__messageSend_covered_line.setName("covered");
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
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
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
						__interaction_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__messageSend_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

				// create link
				__line_coveredBy_messageSend.setSrc(line);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setSrc(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__messageSend_covered_line.setSrc(messageSend);

				// create link
				__interaction_fragment_messageSend.setTrg(messageSend);

				// create link
				__line_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__interaction_fragment_messageSend.setSrc(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

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
						__interaction_lifeline_line, "contextEdges");

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

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, line, messageSend,
					interaction, messageReceive, message);
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
		BasicFlow flow = null;
		FlowToInteractionFragment flowToInteraction = null;
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
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __interaction_fragment_messageSend = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
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
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_line
			__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_enclosingInteraction_interaction
			__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageSend
			__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageSend
			__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SystemStepBFToMessageRule");
			// assign attribute __line_coveredBy_messageSend
			__line_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_line
			__messageSend_covered_line.setName("covered");
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
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageSend, "translatedEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__line_coveredBy_messageSend.setSrc(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__messageSend_covered_line.setTrg(line);

			// create link
			__line_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__interaction_fragment_messageSend.setTrg(messageSend);

			// create link
			__messageSend_enclosingInteraction_interaction.setSrc(messageSend);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__messageSend_covered_line.setSrc(messageSend);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			__messageSend_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_messageSend.setSrc(interaction);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, flowToInteraction, useCase,
				useCaseToInteraction, step, message, stepToMessage,
				packageDeclaration);
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
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		CSP csp = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
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
			ruleresult.setRule("SystemStepBFToMessageRule");

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
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
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

								// check link sendEvent from message to messageSend
								JavaSDM.ensure(messageSend.equals(message
										.getSendEvent()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link source from flowToInteraction to flow
								JavaSDM.ensure(flow.equals(flowToInteraction
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link target from flowToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(flowToInteraction.getTarget()));

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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// iterate to-many link actors from packageDeclaration to actor
								fujaba__Success = false;

								fujaba__IterPackageDeclarationToActor = new ArrayList(
										packageDeclaration.getActors())
										.iterator();

								while (fujaba__IterPackageDeclarationToActor
										.hasNext()) {
									try {
										actor = (Actor) fujaba__IterPackageDeclarationToActor
												.next();

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_covered_line
										__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_covered_line
										__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageReceive
										__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageSend
										__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_fragment_messageSend
										__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_sendEvent_messageSend
										__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_message_message
										__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_enclosingInteraction_interaction
										__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_fragment_messageReceive
										__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_interaction_interaction
										__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_enclosingInteraction_interaction
										__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToInteraction_target_interaction
										__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_message_message
										__interaction_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_receiveEvent_messageReceive
										__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_message_message
										__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
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

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __line_coveredBy_messageSend
										__line_coveredBy_messageSend
												.setName("coveredBy");
										// assign attribute __messageSend_covered_line
										__messageSend_covered_line
												.setName("covered");
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
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__messageSend_covered_line.setTrg(line);

										// create link
										__messageReceive_covered_line
												.setTrg(line);

										// create link
										__line_coveredBy_messageReceive
												.setSrc(line);

										// create link
										__line_coveredBy_messageSend
												.setSrc(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__line_coveredBy_messageSend
												.setTrg(messageSend);

										// create link
										__interaction_fragment_messageSend
												.setTrg(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__messageSend_covered_line
												.setSrc(messageSend);

										// create link
										__message_sendEvent_messageSend
												.setTrg(messageSend);

										// create link
										__messageSend_message_message
												.setSrc(messageSend);

										// create link
										__messageSend_enclosingInteraction_interaction
												.setSrc(messageSend);

										// create link
										__interaction_fragment_messageSend
												.setSrc(interaction);

										// create link
										__interaction_fragment_messageReceive
												.setSrc(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__message_interaction_interaction
												.setTrg(interaction);

										// create link
										__messageReceive_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__flowToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__messageSend_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__interaction_message_message
												.setSrc(interaction);

										// create link
										__message_receiveEvent_messageReceive
												.setTrg(messageReceive);

										// create link
										__interaction_fragment_messageReceive
												.setTrg(messageReceive);

										// create link
										__line_coveredBy_messageReceive
												.setTrg(messageReceive);

										// create link
										__messageReceive_message_message
												.setSrc(messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__messageReceive_covered_line
												.setSrc(messageReceive);

										// create link
										__messageReceive_enclosingInteraction_interaction
												.setSrc(messageReceive);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flowToInteraction_source_flow
												.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToInteraction);

										// create link
										__flowToInteraction_source_flow
												.setSrc(flowToInteraction);

										// create link
										__flowToInteraction_target_interaction
												.setSrc(flowToInteraction);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__useCaseToInteraction_target_interaction
												.setSrc(useCaseToInteraction);

										// create link
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										__message_sendEvent_messageSend
												.setSrc(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														message);

										// create link
										__messageSend_message_message
												.setTrg(message);

										// create link
										__message_receiveEvent_messageReceive
												.setSrc(message);

										// create link
										__messageReceive_message_message
												.setTrg(message);

										// create link
										__interaction_message_message
												.setTrg(message);

										// create link
										__message_interaction_interaction
												.setSrc(message);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

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
														__flowToInteraction_target_interaction,
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
														__interaction_fragment_messageSend,
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
														__useCase_flows_flow,
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
														__messageReceive_covered_line,
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
														__line_interaction_interaction,
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
														__interaction_message_message,
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
														__interaction_fragment_messageReceive,
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
														__interaction_lifeline_line,
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
														__messageReceive_enclosingInteraction_interaction,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__messageSend_covered_line,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__line_coveredBy_messageSend,
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
														__packageDeclaration_actors_actor,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															actor,
															line,
															messageSend,
															interaction,
															messageReceive,
															flow,
															flowToInteraction,
															useCase,
															useCaseToInteraction,
															message,
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
														.setRuleName("SystemStepBFToMessageRule");
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
	public void registerObjectsToMatch_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("message", message);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			PackageDeclaration packageDeclaration) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

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
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_90(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_885731 = null;
		Message __DEC_messageReceive_receiveEvent_885731 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_815935 = null;
		Message __DEC_messageSend_receiveEvent_815935 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_240020 = null;
		Message __DEC_messageReceive_sendEvent_240020 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_338572 = null;
		Message __DEC_messageSend_sendEvent_338572 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_830453 = null;
		MessageEnd __DEC_message_message_830453 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
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

			// bind object
			_TmpObject = _edge_coveredBy.getTrg();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageSend to interaction
			JavaSDM.ensure(interaction.equals(messageSend
					.getEnclosingInteraction()));

			// bind object
			message = messageSend.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link covered from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

			// iterate to-many link covered from line to messageReceive
			fujaba__Success = false;

			fujaba__IterLineToMessageReceive = new ArrayList(
					line.getCoveredBy()).iterator();

			while (fujaba__IterLineToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageReceive.next();

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

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_885731
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_885731 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_885731
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_885731 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_885731
											.next();

									// check object __DEC_messageReceive_receiveEvent_885731 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_885731 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_885731 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_885731
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_815935
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_815935 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_815935
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_815935 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_815935
											.next();

									// check object __DEC_messageSend_receiveEvent_815935 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_815935 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_815935 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_815935
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_240020
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_240020 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_240020
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_240020 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_240020
											.next();

									// check object __DEC_messageReceive_sendEvent_240020 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_240020 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_240020 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_240020
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_338572
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_338572 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_338572
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_338572 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_338572
											.next();

									// check object __DEC_messageSend_sendEvent_338572 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_338572 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_338572 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_338572
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

							// iterate to-many link message from message to __DEC_message_message_830453
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_830453 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_830453
											.hasNext()) {
								try {
									__DEC_message_message_830453 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_830453
											.next();

									// check object __DEC_message_message_830453 is really bound
									JavaSDM.ensure(__DEC_message_message_830453 != null);
									// check isomorphic binding between objects __DEC_message_message_830453 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_830453
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_830453 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_830453
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

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_coveredBy to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_coveredBy
								.getTrg()));

						// check link covered from messageReceive to line
						JavaSDM.ensure(messageReceive.getCovered().contains(
								line));

						// check link covered from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, interaction, messageReceive,
								message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_91(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_703963 = null;
		Message __DEC_messageReceive_receiveEvent_703963 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_52502 = null;
		Message __DEC_messageSend_receiveEvent_52502 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_139284 = null;
		Message __DEC_messageReceive_sendEvent_139284 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_223071 = null;
		Message __DEC_messageSend_sendEvent_223071 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_883974 = null;
		MessageEnd __DEC_message_message_883974 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Lifeline line = null;
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

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link fragment from messageSend to interaction
			JavaSDM.ensure(interaction.equals(messageSend
					.getEnclosingInteraction()));

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link covered from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

			// iterate to-many link covered from line to messageReceive
			fujaba__Success = false;

			fujaba__IterLineToMessageReceive = new ArrayList(
					line.getCoveredBy()).iterator();

			while (fujaba__IterLineToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageReceive.next();

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

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// iterate to-many link src from line to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterLineTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(line,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterLineTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_703963
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_703963 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_703963
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_703963 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_703963
													.next();

											// check object __DEC_messageReceive_receiveEvent_703963 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_703963 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_703963 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_703963
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_52502
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_52502 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_52502
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_52502 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_52502
													.next();

											// check object __DEC_messageSend_receiveEvent_52502 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_52502 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_52502 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_52502
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_139284
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_139284 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_139284
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_139284 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_139284
													.next();

											// check object __DEC_messageReceive_sendEvent_139284 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_139284 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_139284 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_139284
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_223071
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_223071 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_223071
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_223071 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_223071
													.next();

											// check object __DEC_messageSend_sendEvent_223071 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_223071 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_223071 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_223071
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

									// iterate to-many link message from message to __DEC_message_message_883974
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_883974 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_883974
													.hasNext()) {
										try {
											__DEC_message_message_883974 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_883974
													.next();

											// check object __DEC_message_message_883974 is really bound
											JavaSDM.ensure(__DEC_message_message_883974 != null);
											// check isomorphic binding between objects __DEC_message_message_883974 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_883974
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_883974 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_883974
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
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

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

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to line
								JavaSDM.ensure(line.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_coveredBy.getTrg()));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_738462 = null;
		Message __DEC_messageReceive_receiveEvent_738462 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_766940 = null;
		Message __DEC_messageSend_receiveEvent_766940 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_372772 = null;
		Message __DEC_messageReceive_sendEvent_372772 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_990168 = null;
		Message __DEC_messageSend_sendEvent_990168 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_775404 = null;
		MessageEnd __DEC_message_message_775404 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
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
			_TmpObject = _edge_enclosingInteraction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link fragment from messageSend to interaction
			JavaSDM.ensure(interaction.equals(messageSend
					.getEnclosingInteraction()));

			// iterate to-many link fragment from interaction to messageReceive
			fujaba__Success = false;

			fujaba__IterInteractionToMessageReceive = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToMessageReceive.next();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;
					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// bind object
					message = messageReceive.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

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
							// check link covered from messageReceive to line
							JavaSDM.ensure(messageReceive.getCovered()
									.contains(line));

							// check link covered from messageSend to line
							JavaSDM.ensure(messageSend.getCovered().contains(
									line));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_738462
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_738462 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_738462
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_738462 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_738462
													.next();

											// check object __DEC_messageReceive_receiveEvent_738462 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_738462 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_738462 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_738462
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_766940
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_766940 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_766940
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_766940 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_766940
													.next();

											// check object __DEC_messageSend_receiveEvent_766940 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_766940 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_766940 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_766940
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_372772
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_372772 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_372772
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_372772 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_372772
													.next();

											// check object __DEC_messageReceive_sendEvent_372772 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_372772 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_372772 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_372772
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_990168
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_990168 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_990168
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_990168 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_990168
													.next();

											// check object __DEC_messageSend_sendEvent_990168 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_990168 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_990168 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_990168
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

									// iterate to-many link message from message to __DEC_message_message_775404
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_775404 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_775404
													.hasNext()) {
										try {
											__DEC_message_message_775404 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_775404
													.next();

											// check object __DEC_message_message_775404 is really bound
											JavaSDM.ensure(__DEC_message_message_775404 != null);
											// check isomorphic binding between objects __DEC_message_message_775404 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_775404
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_775404 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_775404
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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_93(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_472848 = null;
		Message __DEC_messageReceive_receiveEvent_472848 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_632559 = null;
		Message __DEC_messageSend_receiveEvent_632559 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_349638 = null;
		Message __DEC_messageReceive_sendEvent_349638 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_937233 = null;
		Message __DEC_messageSend_sendEvent_937233 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_949134 = null;
		MessageEnd __DEC_message_message_949134 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getTrg();

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

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link src from _edge_fragment to interaction
			JavaSDM.ensure(interaction.equals(_edge_fragment.getSrc()));

			// iterate to-many link covered from messageSend to line
			fujaba__Success = false;

			fujaba__IterMessageSendToLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageSendToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// iterate to-many link covered from line to messageReceive
					fujaba__Success = false;

					fujaba__IterLineToMessageReceive = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageReceive.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageReceive
									.next();

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

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

							// iterate to-many link src from messageSend to _edge_enclosingInteraction
							fujaba__Success = false;

							fujaba__IterMessageSendTo_edge_enclosingInteraction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													EMoflonEdge.class, "src"))
									.iterator();

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

									// check link trg from _edge_enclosingInteraction to interaction
									JavaSDM.ensure(interaction
											.equals(_edge_enclosingInteraction
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_472848
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_472848 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_472848
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_472848 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_472848
															.next();

													// check object __DEC_messageReceive_receiveEvent_472848 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_472848 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_472848 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_472848
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_632559
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_632559 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_632559
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_632559 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_632559
															.next();

													// check object __DEC_messageSend_receiveEvent_632559 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_632559 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_632559 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_632559
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_349638
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_349638 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_349638
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_349638 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_349638
															.next();

													// check object __DEC_messageReceive_sendEvent_349638 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_349638 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_349638 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_349638
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_937233
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_937233 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_937233
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_937233 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_937233
															.next();

													// check object __DEC_messageSend_sendEvent_937233 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_937233 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_937233 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_937233
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

											// iterate to-many link message from message to __DEC_message_message_949134
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_949134 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_949134
															.hasNext()) {
												try {
													__DEC_message_message_949134 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_949134
															.next();

													// check object __DEC_message_message_949134 is really bound
													JavaSDM.ensure(__DEC_message_message_949134 != null);
													// check isomorphic binding between objects __DEC_message_message_949134 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_949134
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_949134 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_949134
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
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingInteraction));

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

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														interaction,
														messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_94(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_432371 = null;
		Message __DEC_messageReceive_receiveEvent_432371 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_876263 = null;
		Message __DEC_messageSend_receiveEvent_876263 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_614333 = null;
		Message __DEC_messageReceive_sendEvent_614333 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_602860 = null;
		Message __DEC_messageSend_sendEvent_602860 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_644876 = null;
		MessageEnd __DEC_message_message_644876 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
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

					// iterate to-many link covered from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_432371
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_432371 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_432371
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_432371 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_432371
													.next();

											// check object __DEC_messageReceive_receiveEvent_432371 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_432371 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_432371 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_432371
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_876263
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_876263 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_876263
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_876263 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_876263
													.next();

											// check object __DEC_messageSend_receiveEvent_876263 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_876263 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_876263 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_876263
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_614333
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_614333 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_614333
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_614333 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_614333
													.next();

											// check object __DEC_messageReceive_sendEvent_614333 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_614333 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_614333 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_614333
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_602860
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_602860 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_602860
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_602860 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_602860
													.next();

											// check object __DEC_messageSend_sendEvent_602860 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_602860 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_602860 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_602860
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

									// iterate to-many link message from message to __DEC_message_message_644876
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_644876 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_644876
													.hasNext()) {
										try {
											__DEC_message_message_644876 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_644876
													.next();

											// check object __DEC_message_message_644876 is really bound
											JavaSDM.ensure(__DEC_message_message_644876 != null);
											// check isomorphic binding between objects __DEC_message_message_644876 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_644876
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_644876 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_644876
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

								// check link src from _edge_enclosingInteraction to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_enclosingInteraction
												.getSrc()));

								// check link trg from _edge_enclosingInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_enclosingInteraction
												.getTrg()));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_95(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_286890 = null;
		Message __DEC_messageReceive_receiveEvent_286890 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_612239 = null;
		Message __DEC_messageSend_receiveEvent_612239 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611384 = null;
		Message __DEC_messageReceive_sendEvent_611384 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_97772 = null;
		Message __DEC_messageSend_sendEvent_97772 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_384718 = null;
		MessageEnd __DEC_message_message_384718 = null;
		Match match = null;
		Iterator fujaba__IterMessageReceiveTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
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

					// iterate to-many link covered from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// iterate to-many link src from messageReceive to _edge_enclosingInteraction
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo_edge_enclosingInteraction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
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
											.equals(_edge_enclosingInteraction
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_286890
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_286890 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_286890
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_286890 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_286890
															.next();

													// check object __DEC_messageReceive_receiveEvent_286890 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_286890 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_286890 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_286890
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_612239
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_612239 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_612239
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_612239 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_612239
															.next();

													// check object __DEC_messageSend_receiveEvent_612239 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_612239 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_612239 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_612239
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_611384
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611384 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611384
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_611384 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611384
															.next();

													// check object __DEC_messageReceive_sendEvent_611384 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_611384 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_611384 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_611384
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_97772
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_97772 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_97772
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_97772 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_97772
															.next();

													// check object __DEC_messageSend_sendEvent_97772 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_97772 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_97772 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_97772
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

											// iterate to-many link message from message to __DEC_message_message_384718
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_384718 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_384718
															.hasNext()) {
												try {
													__DEC_message_message_384718 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_384718
															.next();

													// check object __DEC_message_message_384718 is really bound
													JavaSDM.ensure(__DEC_message_message_384718 != null);
													// check isomorphic binding between objects __DEC_message_message_384718 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_384718
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_384718 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_384718
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
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingInteraction));

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

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														interaction,
														messageReceive, message);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_24(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_222860 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NormalStep step = null;
		UseCase useCase = null;
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
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_222860 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_222860 is really bound
					JavaSDM.ensure(__DEC_step_steps_222860 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_222860.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_222860 and flow 
					JavaSDM.ensure(!__DEC_step_steps_222860.equals(flow));

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
				fujaba__Success = this.isAppropriate_FWD(match, actor, flow,
						useCase, step, packageDeclaration);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_25(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_497354 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
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
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_497354 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_497354 is really bound
					JavaSDM.ensure(__DEC_step_steps_497354 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_497354.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_497354 and flow 
					JavaSDM.ensure(!__DEC_step_steps_497354.equals(flow));

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
				fujaba__Success = this.isAppropriate_FWD(match, actor, flow,
						useCase, step, packageDeclaration);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_96(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777934 = null;
		Message __DEC_messageReceive_receiveEvent_777934 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_500523 = null;
		Message __DEC_messageSend_receiveEvent_500523 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_18803 = null;
		Message __DEC_messageReceive_sendEvent_18803 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_679037 = null;
		Message __DEC_messageSend_sendEvent_679037 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_781791 = null;
		MessageEnd __DEC_message_message_781791 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
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

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link src from _edge_sendEvent to message
			JavaSDM.ensure(message.equals(_edge_sendEvent.getSrc()));

			// iterate to-many link covered from messageSend to line
			fujaba__Success = false;

			fujaba__IterMessageSendToLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageSendToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// iterate to-many link covered from line to messageReceive
					fujaba__Success = false;

					fujaba__IterLineToMessageReceive = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageReceive.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageReceive
									.next();

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

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_777934
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777934 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777934
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_777934 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777934
													.next();

											// check object __DEC_messageReceive_receiveEvent_777934 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_777934 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_777934 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_777934
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_500523
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_500523 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_500523
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_500523 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_500523
													.next();

											// check object __DEC_messageSend_receiveEvent_500523 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_500523 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_500523 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_500523
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_18803
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_18803 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_18803
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_18803 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_18803
													.next();

											// check object __DEC_messageReceive_sendEvent_18803 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_18803 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_18803 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_18803
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_679037
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_679037 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_679037
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_679037 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_679037
													.next();

											// check object __DEC_messageSend_sendEvent_679037 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_679037 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_679037 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_679037
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

									// iterate to-many link message from message to __DEC_message_message_781791
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_781791 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_781791
													.hasNext()) {
										try {
											__DEC_message_message_781791 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_781791
													.next();

											// check object __DEC_message_message_781791 is really bound
											JavaSDM.ensure(__DEC_message_message_781791 != null);
											// check isomorphic binding between objects __DEC_message_message_781791 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_781791
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_781791 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_781791
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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_97(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_769994 = null;
		Message __DEC_messageReceive_receiveEvent_769994 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_137472 = null;
		Message __DEC_messageSend_receiveEvent_137472 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_410546 = null;
		Message __DEC_messageReceive_sendEvent_410546 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_222797 = null;
		Message __DEC_messageSend_sendEvent_222797 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_606721 = null;
		MessageEnd __DEC_message_message_606721 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
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

			// check object _edge_receiveEvent is really bound
			JavaSDM.ensure(_edge_receiveEvent != null);
			// bind object
			_TmpObject = _edge_receiveEvent.getTrg();

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

			// check link src from _edge_receiveEvent to message
			JavaSDM.ensure(message.equals(_edge_receiveEvent.getSrc()));

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

					// iterate to-many link covered from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_769994
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_769994 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_769994
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_769994 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_769994
													.next();

											// check object __DEC_messageReceive_receiveEvent_769994 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_769994 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_769994 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_769994
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_137472
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_137472 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_137472
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_137472 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_137472
													.next();

											// check object __DEC_messageSend_receiveEvent_137472 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_137472 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_137472 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_137472
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_410546
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_410546 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_410546
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_410546 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_410546
													.next();

											// check object __DEC_messageReceive_sendEvent_410546 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_410546 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_410546 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_410546
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_222797
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_222797 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_222797
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_222797 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_222797
													.next();

											// check object __DEC_messageSend_sendEvent_222797 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_222797 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_222797 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_222797
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

									// iterate to-many link message from message to __DEC_message_message_606721
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_606721 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_606721
													.hasNext()) {
										try {
											__DEC_message_message_606721 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_606721
													.next();

											// check object __DEC_message_message_606721 is really bound
											JavaSDM.ensure(__DEC_message_message_606721 != null);
											// check isomorphic binding between objects __DEC_message_message_606721 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_606721
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_606721 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_606721
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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_98(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_956622 = null;
		Message __DEC_messageReceive_receiveEvent_956622 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_714673 = null;
		Message __DEC_messageSend_receiveEvent_714673 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_95702 = null;
		Message __DEC_messageReceive_sendEvent_95702 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_852832 = null;
		Message __DEC_messageSend_sendEvent_852832 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_19976 = null;
		MessageEnd __DEC_message_message_19976 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// check object _edge_interaction is really bound
			JavaSDM.ensure(_edge_interaction != null);
			// bind object
			_TmpObject = _edge_interaction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// iterate to-many link fragment from interaction to messageReceive
			fujaba__Success = false;

			fujaba__IterInteractionToMessageReceive = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToMessageReceive.next();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;
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
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// bind object
							message = messageSend.getMessage();

							// check object message is really bound
							JavaSDM.ensure(message != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// check link src from _edge_interaction to message
							JavaSDM.ensure(message.equals(_edge_interaction
									.getSrc()));

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
									// check link covered from messageReceive to line
									JavaSDM.ensure(messageReceive.getCovered()
											.contains(line));

									// check link covered from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_956622
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_956622 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_956622
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_956622 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_956622
															.next();

													// check object __DEC_messageReceive_receiveEvent_956622 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_956622 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_956622 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_956622
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_714673
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_714673 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_714673
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_714673 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_714673
															.next();

													// check object __DEC_messageSend_receiveEvent_714673 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_714673 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_714673 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_714673
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_95702
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_95702 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_95702
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_95702 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_95702
															.next();

													// check object __DEC_messageReceive_sendEvent_95702 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_95702 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_95702 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_95702
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_852832
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_852832 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_852832
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_852832 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_852832
															.next();

													// check object __DEC_messageSend_sendEvent_852832 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_852832 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_852832 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_852832
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

											// iterate to-many link message from message to __DEC_message_message_19976
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_19976 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_19976
															.hasNext()) {
												try {
													__DEC_message_message_19976 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_19976
															.next();

													// check object __DEC_message_message_19976 is really bound
													JavaSDM.ensure(__DEC_message_message_19976 != null);
													// check isomorphic binding between objects __DEC_message_message_19976 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_19976
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_19976 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_19976
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

										// check link trg from _edge_interaction to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_interaction
														.getTrg()));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														interaction,
														messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_99(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_265164 = null;
		Message __DEC_messageReceive_receiveEvent_265164 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_476406 = null;
		Message __DEC_messageSend_receiveEvent_476406 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_361284 = null;
		Message __DEC_messageReceive_sendEvent_361284 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942328 = null;
		Message __DEC_messageSend_sendEvent_942328 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_57580 = null;
		MessageEnd __DEC_message_message_57580 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

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
					// check isomorphic binding between objects _edge_message and _edge_interaction 
					JavaSDM.ensure(!_edge_message.equals(_edge_interaction));

					// iterate to-many link fragment from interaction to messageReceive
					fujaba__Success = false;

					fujaba__IterInteractionToMessageReceive = new ArrayList(
							interaction.getFragment()).iterator();

					while (fujaba__IterInteractionToMessageReceive.hasNext()) {
						try {
							_TmpObject = fujaba__IterInteractionToMessageReceive
									.next();

							// ensure correct type and really bound of object messageReceive
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageReceive = (MessageOccurrenceSpecification) _TmpObject;
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
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// bind object
									message = messageSend.getMessage();

									// check object message is really bound
									JavaSDM.ensure(message != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// check link message from messageReceive to message
									JavaSDM.ensure(message
											.equals(messageReceive.getMessage()));

									// check link receiveEvent from message to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(message.getReceiveEvent()));

									// check link sendEvent from message to messageSend
									JavaSDM.ensure(messageSend.equals(message
											.getSendEvent()));

									// check link src from _edge_interaction to message
									JavaSDM.ensure(message
											.equals(_edge_interaction.getSrc()));

									// check link trg from _edge_message to message
									JavaSDM.ensure(message.equals(_edge_message
											.getTrg()));

									// iterate to-many link lifeline from interaction to line
									fujaba__Success = false;

									fujaba__IterInteractionToLine = new ArrayList(
											interaction.getLifeline())
											.iterator();

									while (fujaba__IterInteractionToLine
											.hasNext()) {
										try {
											line = (Lifeline) fujaba__IterInteractionToLine
													.next();

											// check object line is really bound
											JavaSDM.ensure(line != null);
											// check link covered from messageReceive to line
											JavaSDM.ensure(messageReceive
													.getCovered()
													.contains(line));

											// check link covered from messageSend to line
											JavaSDM.ensure(messageSend
													.getCovered()
													.contains(line));

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

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_265164
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_265164 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_265164
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_265164 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_265164
																	.next();

															// check object __DEC_messageReceive_receiveEvent_265164 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_265164 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_265164 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_265164
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

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_476406
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_476406 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_476406
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_476406 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_476406
																	.next();

															// check object __DEC_messageSend_receiveEvent_476406 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_476406 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_476406 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_476406
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

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_361284
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_361284 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_361284
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_361284 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_361284
																	.next();

															// check object __DEC_messageReceive_sendEvent_361284 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_361284 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_361284 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_361284
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

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_942328
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942328 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942328
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_942328 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942328
																	.next();

															// check object __DEC_messageSend_sendEvent_942328 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_942328 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_942328 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_942328
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

													// iterate to-many link message from message to __DEC_message_message_57580
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_57580 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_57580
																	.hasNext()) {
														try {
															__DEC_message_message_57580 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_57580
																	.next();

															// check object __DEC_message_message_57580 is really bound
															JavaSDM.ensure(__DEC_message_message_57580 != null);
															// check isomorphic binding between objects __DEC_message_message_57580 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_57580
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_57580 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_57580
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

												// check link src from _edge_interaction to message
												JavaSDM.ensure(message
														.equals(_edge_interaction
																.getSrc()));

												// check link src from _edge_message to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_message
																.getSrc()));

												// check link trg from _edge_interaction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_interaction
																.getTrg()));

												// check link trg from _edge_message to message
												JavaSDM.ensure(message
														.equals(_edge_message
																.getTrg()));

												// check link covered from messageReceive to line
												JavaSDM.ensure(messageReceive
														.getCovered().contains(
																line));

												// check link covered from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// create object match
												match = TGGRuntimeFactory.eINSTANCE
														.createMatch();

												// assign attribute match
												match.setRuleName(__eClass
														.getName());
												// statement node 'bookkeeping with generic isAppropriate method'
												fujaba__Success = this
														.isAppropriate_BWD(
																match, line,
																messageSend,
																interaction,
																messageReceive,
																message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829279 = null;
		Message __DEC_messageReceive_receiveEvent_829279 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_838448 = null;
		Message __DEC_messageSend_receiveEvent_838448 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_204463 = null;
		Message __DEC_messageReceive_sendEvent_204463 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_357657 = null;
		Message __DEC_messageSend_sendEvent_357657 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_938343 = null;
		MessageEnd __DEC_message_message_938343 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link trg from _edge_message to message
			JavaSDM.ensure(message.equals(_edge_message.getTrg()));

			// iterate to-many link covered from messageSend to line
			fujaba__Success = false;

			fujaba__IterMessageSendToLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageSendToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check link lifeline from line to interaction
					JavaSDM.ensure(interaction.equals(line.getInteraction()));

					// iterate to-many link covered from line to messageReceive
					fujaba__Success = false;

					fujaba__IterLineToMessageReceive = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageReceive.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageReceive
									.next();

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

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_829279
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829279 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829279
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_829279 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829279
													.next();

											// check object __DEC_messageReceive_receiveEvent_829279 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_829279 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_829279 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_829279
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_838448
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_838448 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_838448
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_838448 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_838448
													.next();

											// check object __DEC_messageSend_receiveEvent_838448 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_838448 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_838448 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_838448
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_204463
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_204463 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_204463
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_204463 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_204463
													.next();

											// check object __DEC_messageReceive_sendEvent_204463 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_204463 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_204463 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_204463
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_357657
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_357657 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_357657
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_357657 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_357657
													.next();

											// check object __DEC_messageSend_sendEvent_357657 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_357657 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_357657 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_357657
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

									// iterate to-many link message from message to __DEC_message_message_938343
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_938343 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_938343
													.hasNext()) {
										try {
											__DEC_message_message_938343 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_938343
													.next();

											// check object __DEC_message_message_938343 is really bound
											JavaSDM.ensure(__DEC_message_message_938343 != null);
											// check isomorphic binding between objects __DEC_message_message_938343 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_938343
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_938343 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_938343
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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_101(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_203526 = null;
		Message __DEC_messageReceive_receiveEvent_203526 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_332247 = null;
		Message __DEC_messageSend_receiveEvent_332247 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_154044 = null;
		Message __DEC_messageReceive_sendEvent_154044 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_649245 = null;
		Message __DEC_messageSend_sendEvent_649245 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_609674 = null;
		MessageEnd __DEC_message_message_609674 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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

			// check link trg from _edge_message to message
			JavaSDM.ensure(message.equals(_edge_message.getTrg()));

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

					// iterate to-many link covered from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_203526
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_203526 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_203526
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_203526 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_203526
													.next();

											// check object __DEC_messageReceive_receiveEvent_203526 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_203526 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_203526 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_203526
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_332247
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_332247 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_332247
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_332247 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_332247
													.next();

											// check object __DEC_messageSend_receiveEvent_332247 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_332247 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_332247 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_332247
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_154044
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_154044 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_154044
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_154044 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_154044
													.next();

											// check object __DEC_messageReceive_sendEvent_154044 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_154044 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_154044 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_154044
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_649245
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_649245 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_649245
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_649245 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_649245
													.next();

											// check object __DEC_messageSend_sendEvent_649245 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_649245 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_649245 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_649245
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

									// iterate to-many link message from message to __DEC_message_message_609674
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_609674 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_609674
													.hasNext()) {
										try {
											__DEC_message_message_609674 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_609674
													.next();

											// check object __DEC_message_message_609674 is really bound
											JavaSDM.ensure(__DEC_message_message_609674 != null);
											// check isomorphic binding between objects __DEC_message_message_609674 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_609674
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_609674 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_609674
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

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_102(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_440937 = null;
		Message __DEC_messageReceive_receiveEvent_440937 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_245325 = null;
		Message __DEC_messageSend_receiveEvent_245325 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_950537 = null;
		Message __DEC_messageReceive_sendEvent_950537 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_815465 = null;
		Message __DEC_messageSend_sendEvent_815465 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_964914 = null;
		MessageEnd __DEC_message_message_964914 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// bind object
			_TmpObject = _edge_coveredBy.getTrg();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// check link covered from messageReceive to line
			JavaSDM.ensure(messageReceive.getCovered().contains(line));

			// iterate to-many link covered from line to messageSend
			fujaba__Success = false;

			fujaba__IterLineToMessageSend = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageSend.next();

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

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_440937
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_440937 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_440937
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_440937 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_440937
											.next();

									// check object __DEC_messageReceive_receiveEvent_440937 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_440937 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_440937 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_440937
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_245325
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_245325 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_245325
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_245325 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_245325
											.next();

									// check object __DEC_messageSend_receiveEvent_245325 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_245325 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_245325 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_245325
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_950537
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_950537 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_950537
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_950537 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_950537
											.next();

									// check object __DEC_messageReceive_sendEvent_950537 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_950537 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_950537 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_950537
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_815465
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_815465 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_815465
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_815465 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_815465
											.next();

									// check object __DEC_messageSend_sendEvent_815465 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_815465 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_815465 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_815465
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

							// iterate to-many link message from message to __DEC_message_message_964914
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_964914 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_964914
											.hasNext()) {
								try {
									__DEC_message_message_964914 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_964914
											.next();

									// check object __DEC_message_message_964914 is really bound
									JavaSDM.ensure(__DEC_message_message_964914 != null);
									// check isomorphic binding between objects __DEC_message_message_964914 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_964914
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_964914 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_964914
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

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_coveredBy to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_coveredBy
								.getTrg()));

						// check link covered from messageReceive to line
						JavaSDM.ensure(messageReceive.getCovered().contains(
								line));

						// check link covered from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, interaction, messageReceive,
								message);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_103(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678917 = null;
		Message __DEC_messageReceive_receiveEvent_678917 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_820211 = null;
		Message __DEC_messageSend_receiveEvent_820211 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_288615 = null;
		Message __DEC_messageReceive_sendEvent_288615 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_358553 = null;
		Message __DEC_messageSend_sendEvent_358553 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_780150 = null;
		MessageEnd __DEC_message_message_780150 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Lifeline line = null;
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

			// check link receiveEvent from message to messageReceive
			JavaSDM.ensure(messageReceive.equals(message.getReceiveEvent()));

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link covered from messageReceive to line
			JavaSDM.ensure(messageReceive.getCovered().contains(line));

			// iterate to-many link covered from line to messageSend
			fujaba__Success = false;

			fujaba__IterLineToMessageSend = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageSend.next();

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

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// iterate to-many link src from line to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterLineTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(line,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterLineTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
									.next();

							// check object _edge_coveredBy is really bound
							JavaSDM.ensure(_edge_coveredBy != null);
							// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
							JavaSDM.ensure(!_edge_coveredBy
									.equals(_edge_covered));

							// check link trg from _edge_coveredBy to messageReceive
							JavaSDM.ensure(messageReceive
									.equals(_edge_coveredBy.getTrg()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_678917
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678917 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678917
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_678917 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678917
													.next();

											// check object __DEC_messageReceive_receiveEvent_678917 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_678917 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_678917 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_678917
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_820211
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_820211 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_820211
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_820211 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_820211
													.next();

											// check object __DEC_messageSend_receiveEvent_820211 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_820211 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_820211 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_820211
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_288615
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_288615 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_288615
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_288615 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_288615
													.next();

											// check object __DEC_messageReceive_sendEvent_288615 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_288615 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_288615 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_288615
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_358553
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_358553 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_358553
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_358553 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_358553
													.next();

											// check object __DEC_messageSend_sendEvent_358553 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_358553 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_358553 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_358553
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

									// iterate to-many link message from message to __DEC_message_message_780150
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_780150 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_780150
													.hasNext()) {
										try {
											__DEC_message_message_780150 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_780150
													.next();

											// check object __DEC_message_message_780150 is really bound
											JavaSDM.ensure(__DEC_message_message_780150 != null);
											// check isomorphic binding between objects __DEC_message_message_780150 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_780150
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_780150 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_780150
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
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

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

								// check link src from _edge_covered to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_covered.getSrc()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to line
								JavaSDM.ensure(line.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_coveredBy.getTrg()));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, interaction,
										messageReceive, message);
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
	public boolean isAppropriate_FWD(Match match, BasicFlow flow,
			UseCase useCase, NormalStep step, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, flow, useCase,
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
				// create object __step_actor_actor
				__step_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
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
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

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
				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, flow, useCase, step, actor,
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
	public void registerObjectsToMatch_FWD(Match match, BasicFlow flow,
			UseCase useCase, NormalStep step, Actor actor,
			PackageDeclaration packageDeclaration) {
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BasicFlow flow,
			UseCase useCase, NormalStep step, Actor actor,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Lifeline line, Actor actor, ActorToLifeline actorToLine,
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
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject interaction, EObject messageSend, EObject messageReceive,
			EObject flow, EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject line, EObject actor,
			EObject actorToLine, EObject packageDeclaration) {
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
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
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
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

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, interaction,
					messageSend, messageReceive, message, line));

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

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageSend
				__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

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
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_fragment_messageSend.setSrc(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setSrc(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__interaction_fragment_messageSend.setTrg(messageSend);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

				// create link
				__messageReceive_covered_line.setTrg(line);

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
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__interaction_lifeline_line.setTrg(line);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, interaction, messageSend,
					messageReceive, message, line);
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
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		match.registerObject("interaction", interaction);
		match.registerObject("messageSend", messageSend);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("message", message);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
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
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Lifeline line, Actor actor, ActorToLifeline actorToLine,
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
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("message", message);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject interaction, EObject messageSend, EObject messageReceive,
			EObject flow, EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject line, EObject actor,
			EObject actorToLine, EObject packageDeclaration) {
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_12(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_639490 = null;
		Message __DEC_messageReceive_receiveEvent_639490 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285202 = null;
		Message __DEC_messageSend_receiveEvent_285202 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_146154 = null;
		Message __DEC_messageReceive_sendEvent_146154 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_728061 = null;
		Message __DEC_messageSend_sendEvent_728061 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_360067 = null;
		MessageEnd __DEC_message_message_360067 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link src from _edge_enclosingInteraction to messageSend
							JavaSDM.ensure(messageSend
									.equals(_edge_enclosingInteraction.getSrc()));

							// check link covered from line to messageReceive
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_639490
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_639490 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_639490
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_639490 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_639490
													.next();

											// check object __DEC_messageReceive_receiveEvent_639490 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_639490 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_639490 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_639490
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_285202
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285202 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285202
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_285202 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285202
													.next();

											// check object __DEC_messageSend_receiveEvent_285202 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_285202 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_285202 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_285202
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_146154
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_146154 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_146154
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_146154 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_146154
													.next();

											// check object __DEC_messageReceive_sendEvent_146154 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_146154 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_146154 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_146154
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_728061
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_728061 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_728061
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_728061 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_728061
													.next();

											// check object __DEC_messageSend_sendEvent_728061 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_728061 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_728061 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_728061
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

									// iterate to-many link message from message to __DEC_message_message_360067
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_360067 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_360067
													.hasNext()) {
										try {
											__DEC_message_message_360067 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_360067
													.next();

											// check object __DEC_message_message_360067 is really bound
											JavaSDM.ensure(__DEC_message_message_360067 != null);
											// check isomorphic binding between objects __DEC_message_message_360067 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_360067
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_360067 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_360067
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
										interaction, messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_13(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_974103 = null;
		Message __DEC_messageReceive_receiveEvent_974103 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605512 = null;
		Message __DEC_messageSend_receiveEvent_605512 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_765171 = null;
		Message __DEC_messageReceive_sendEvent_765171 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942466 = null;
		Message __DEC_messageSend_sendEvent_942466 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_230426 = null;
		MessageEnd __DEC_message_message_230426 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link trg from _edge_fragment to messageSend
							JavaSDM.ensure(messageSend.equals(_edge_fragment
									.getTrg()));

							// check link covered from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// iterate to-many link trg from interaction to _edge_enclosingInteraction
							fujaba__Success = false;

							fujaba__IterInteractionTo_edge_enclosingInteraction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(interaction,
													EMoflonEdge.class, "trg"))
									.iterator();

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

									// check link src from _edge_enclosingInteraction to messageSend
									JavaSDM.ensure(messageSend
											.equals(_edge_enclosingInteraction
													.getSrc()));

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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_974103
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_974103 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_974103
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_974103 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_974103
															.next();

													// check object __DEC_messageReceive_receiveEvent_974103 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_974103 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_974103 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_974103
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_605512
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605512 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605512
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_605512 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605512
															.next();

													// check object __DEC_messageSend_receiveEvent_605512 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_605512 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_605512 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_605512
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_765171
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_765171 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_765171
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_765171 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_765171
															.next();

													// check object __DEC_messageReceive_sendEvent_765171 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_765171 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_765171 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_765171
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_942466
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942466 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942466
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_942466 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_942466
															.next();

													// check object __DEC_messageSend_sendEvent_942466 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_942466 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_942466 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_942466
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

											// iterate to-many link message from message to __DEC_message_message_230426
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_230426 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_230426
															.hasNext()) {
												try {
													__DEC_message_message_230426 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_230426
															.next();

													// check object __DEC_message_message_230426 is really bound
													JavaSDM.ensure(__DEC_message_message_230426 != null);
													// check isomorphic binding between objects __DEC_message_message_230426 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_230426
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_230426 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_230426
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
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingInteraction));

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

										// check link covered from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														interaction,
														messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_14(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_851040 = null;
		Message __DEC_messageReceive_receiveEvent_851040 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_89923 = null;
		Message __DEC_messageSend_receiveEvent_89923 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_966221 = null;
		Message __DEC_messageReceive_sendEvent_966221 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_733205 = null;
		Message __DEC_messageSend_sendEvent_733205 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_557536 = null;
		MessageEnd __DEC_message_message_557536 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link src from _edge_enclosingInteraction to messageReceive
							JavaSDM.ensure(messageReceive
									.equals(_edge_enclosingInteraction.getSrc()));

							// check link covered from line to messageReceive
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_851040
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_851040 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_851040
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_851040 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_851040
													.next();

											// check object __DEC_messageReceive_receiveEvent_851040 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_851040 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_851040 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_851040
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_89923
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_89923 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_89923
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_89923 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_89923
													.next();

											// check object __DEC_messageSend_receiveEvent_89923 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_89923 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_89923 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_89923
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_966221
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_966221 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_966221
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_966221 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_966221
													.next();

											// check object __DEC_messageReceive_sendEvent_966221 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_966221 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_966221 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_966221
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_733205
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_733205 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_733205
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_733205 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_733205
													.next();

											// check object __DEC_messageSend_sendEvent_733205 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_733205 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_733205 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_733205
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

									// iterate to-many link message from message to __DEC_message_message_557536
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_557536 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_557536
													.hasNext()) {
										try {
											__DEC_message_message_557536 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_557536
													.next();

											// check object __DEC_message_message_557536 is really bound
											JavaSDM.ensure(__DEC_message_message_557536 != null);
											// check isomorphic binding between objects __DEC_message_message_557536 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_557536
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_557536 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_557536
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

								// check link src from _edge_enclosingInteraction to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_enclosingInteraction
												.getSrc()));

								// check link trg from _edge_enclosingInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(_edge_enclosingInteraction
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
										interaction, messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_380882 = null;
		Message __DEC_messageReceive_receiveEvent_380882 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_95654 = null;
		Message __DEC_messageSend_receiveEvent_95654 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_731292 = null;
		Message __DEC_messageReceive_sendEvent_731292 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_455407 = null;
		Message __DEC_messageSend_sendEvent_455407 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_6147 = null;
		MessageEnd __DEC_message_message_6147 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterInteractionToMessage = null;
		Message message = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link trg from _edge_fragment to messageReceive
							JavaSDM.ensure(messageReceive.equals(_edge_fragment
									.getTrg()));

							// check link covered from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// iterate to-many link trg from interaction to _edge_enclosingInteraction
							fujaba__Success = false;

							fujaba__IterInteractionTo_edge_enclosingInteraction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(interaction,
													EMoflonEdge.class, "trg"))
									.iterator();

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

									// check link src from _edge_enclosingInteraction to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_enclosingInteraction
													.getSrc()));

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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_380882
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_380882 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_380882
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_380882 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_380882
															.next();

													// check object __DEC_messageReceive_receiveEvent_380882 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_380882 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_380882 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_380882
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_95654
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_95654 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_95654
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_95654 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_95654
															.next();

													// check object __DEC_messageSend_receiveEvent_95654 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_95654 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_95654 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_95654
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_731292
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_731292 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_731292
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_731292 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_731292
															.next();

													// check object __DEC_messageReceive_sendEvent_731292 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_731292 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_731292 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_731292
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_455407
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_455407 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_455407
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_455407 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_455407
															.next();

													// check object __DEC_messageSend_sendEvent_455407 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_455407 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_455407 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_455407
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

											// iterate to-many link message from message to __DEC_message_message_6147
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_6147 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_6147
															.hasNext()) {
												try {
													__DEC_message_message_6147 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_6147
															.next();

													// check object __DEC_message_message_6147 is really bound
													JavaSDM.ensure(__DEC_message_message_6147 != null);
													// check isomorphic binding between objects __DEC_message_message_6147 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_6147
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_6147 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_6147
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
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingInteraction));

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
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														interaction,
														messageSend,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_427192 = null;
		Match match = null;
		Actor actor = null;
		NormalStep step = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
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
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;

			// bind object
			actor = step.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link actors from actor to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

			// check link steps from step to flow
			JavaSDM.ensure(flow.equals(step.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_427192 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_427192 is really bound
					JavaSDM.ensure(__DEC_step_steps_427192 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_427192.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_427192 and flow 
					JavaSDM.ensure(!__DEC_step_steps_427192.equals(flow));

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
				fujaba__Success = this.isAppropriate_FWD(match, flow, useCase,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_932049 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		BasicFlow flow = null;
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
			_TmpObject = step.eContainer() instanceof BasicFlow ? (BasicFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;

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
					__DEC_step_steps_932049 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_932049 is really bound
					JavaSDM.ensure(__DEC_step_steps_932049 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_932049.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_932049 and flow 
					JavaSDM.ensure(!__DEC_step_steps_932049.equals(flow));

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
				fujaba__Success = this.isAppropriate_FWD(match, flow, useCase,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_597038 = null;
		Message __DEC_messageReceive_receiveEvent_597038 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_463692 = null;
		Message __DEC_messageSend_receiveEvent_463692 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_643642 = null;
		Message __DEC_messageReceive_sendEvent_643642 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_473029 = null;
		Message __DEC_messageSend_sendEvent_473029 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_524119 = null;
		MessageEnd __DEC_message_message_524119 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
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

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link src from _edge_sendEvent to message
			JavaSDM.ensure(message.equals(_edge_sendEvent.getSrc()));

			// iterate to-many link fragment from interaction to messageReceive
			fujaba__Success = false;

			fujaba__IterInteractionToMessageReceive = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToMessageReceive.next();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;
					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

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
							// check link covered from line to messageReceive
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_597038
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_597038 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_597038
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_597038 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_597038
													.next();

											// check object __DEC_messageReceive_receiveEvent_597038 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_597038 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_597038 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_597038
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_463692
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_463692 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_463692
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_463692 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_463692
													.next();

											// check object __DEC_messageSend_receiveEvent_463692 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_463692 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_463692 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_463692
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_643642
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_643642 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_643642
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_643642 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_643642
													.next();

											// check object __DEC_messageReceive_sendEvent_643642 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_643642 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_643642 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_643642
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_473029
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_473029 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_473029
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_473029 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_473029
													.next();

											// check object __DEC_messageSend_sendEvent_473029 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_473029 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_473029 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_473029
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

									// iterate to-many link message from message to __DEC_message_message_524119
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_524119 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_524119
													.hasNext()) {
										try {
											__DEC_message_message_524119 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_524119
													.next();

											// check object __DEC_message_message_524119 is really bound
											JavaSDM.ensure(__DEC_message_message_524119 != null);
											// check isomorphic binding between objects __DEC_message_message_524119 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_524119
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_524119 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_524119
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
										interaction, messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_493216 = null;
		Message __DEC_messageReceive_receiveEvent_493216 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_92548 = null;
		Message __DEC_messageSend_receiveEvent_92548 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_182620 = null;
		Message __DEC_messageReceive_sendEvent_182620 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_319115 = null;
		Message __DEC_messageSend_sendEvent_319115 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_34480 = null;
		MessageEnd __DEC_message_message_34480 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
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

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_493216
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_493216 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_493216
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_493216 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_493216
											.next();

									// check object __DEC_messageReceive_receiveEvent_493216 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_493216 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_493216 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_493216
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_92548
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_92548 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_92548
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_92548 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_92548
											.next();

									// check object __DEC_messageSend_receiveEvent_92548 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_92548 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_92548 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_92548
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_182620
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_182620 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_182620
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_182620 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_182620
											.next();

									// check object __DEC_messageReceive_sendEvent_182620 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_182620 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_182620 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_182620
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_319115
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_319115 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_319115
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_319115 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_319115
											.next();

									// check object __DEC_messageSend_sendEvent_319115 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_319115 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_319115 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_319115
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

							// iterate to-many link message from message to __DEC_message_message_34480
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_34480 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_34480
											.hasNext()) {
								try {
									__DEC_message_message_34480 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_34480
											.next();

									// check object __DEC_message_message_34480 is really bound
									JavaSDM.ensure(__DEC_message_message_34480 != null);
									// check isomorphic binding between objects __DEC_message_message_34480 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_34480
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_34480 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_34480
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
								interaction, messageSend, messageReceive,
								message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_18(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_803332 = null;
		Message __DEC_messageReceive_receiveEvent_803332 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_868391 = null;
		Message __DEC_messageSend_receiveEvent_868391 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_557828 = null;
		Message __DEC_messageReceive_sendEvent_557828 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_983502 = null;
		Message __DEC_messageSend_sendEvent_983502 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_698762 = null;
		MessageEnd __DEC_message_message_698762 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check object _edge_interaction is really bound
			JavaSDM.ensure(_edge_interaction != null);
			// bind object
			_TmpObject = _edge_interaction.getTrg();

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

					// check link src from _edge_interaction to message
					JavaSDM.ensure(message.equals(_edge_interaction.getSrc()));

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
							// check link covered from line to messageReceive
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_803332
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_803332 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_803332
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_803332 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_803332
													.next();

											// check object __DEC_messageReceive_receiveEvent_803332 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_803332 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_803332 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_803332
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_868391
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_868391 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_868391
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_868391 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_868391
													.next();

											// check object __DEC_messageSend_receiveEvent_868391 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_868391 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_868391 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_868391
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_557828
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_557828 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_557828
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_557828 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_557828
													.next();

											// check object __DEC_messageReceive_sendEvent_557828 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_557828 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_557828 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_557828
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_983502
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_983502 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_983502
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_983502 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_983502
													.next();

											// check object __DEC_messageSend_sendEvent_983502 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_983502 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_983502 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_983502
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

									// iterate to-many link message from message to __DEC_message_message_698762
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_698762 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_698762
													.hasNext()) {
										try {
											__DEC_message_message_698762 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_698762
													.next();

											// check object __DEC_message_message_698762 is really bound
											JavaSDM.ensure(__DEC_message_message_698762 != null);
											// check isomorphic binding between objects __DEC_message_message_698762 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_698762
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_698762 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_698762
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
										interaction, messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_19(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_654569 = null;
		Message __DEC_messageReceive_receiveEvent_654569 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_886917 = null;
		Message __DEC_messageSend_receiveEvent_886917 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_370280 = null;
		Message __DEC_messageReceive_sendEvent_370280 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_424311 = null;
		Message __DEC_messageSend_sendEvent_424311 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_813244 = null;
		MessageEnd __DEC_message_message_813244 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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

					// check link trg from _edge_message to message
					JavaSDM.ensure(message.equals(_edge_message.getTrg()));

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
							// check link covered from line to messageReceive
							JavaSDM.ensure(line.getCoveredBy().contains(
									messageReceive));

							// iterate to-many link trg from interaction to _edge_interaction
							fujaba__Success = false;

							fujaba__IterInteractionTo_edge_interaction = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(interaction,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterInteractionTo_edge_interaction
									.hasNext()) {
								try {
									_edge_interaction = (EMoflonEdge) fujaba__IterInteractionTo_edge_interaction
											.next();

									// check object _edge_interaction is really bound
									JavaSDM.ensure(_edge_interaction != null);
									// check isomorphic binding between objects _edge_message and _edge_interaction 
									JavaSDM.ensure(!_edge_message
											.equals(_edge_interaction));

									// check link src from _edge_interaction to message
									JavaSDM.ensure(message
											.equals(_edge_interaction.getSrc()));

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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_654569
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_654569 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_654569
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_654569 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_654569
															.next();

													// check object __DEC_messageReceive_receiveEvent_654569 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_654569 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_654569 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_654569
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

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_886917
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_886917 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_886917
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_886917 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_886917
															.next();

													// check object __DEC_messageSend_receiveEvent_886917 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_886917 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_886917 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_886917
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

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_370280
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_370280 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_370280
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_370280 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_370280
															.next();

													// check object __DEC_messageReceive_sendEvent_370280 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_370280 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_370280 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_370280
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

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_424311
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_424311 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_424311
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_424311 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_424311
															.next();

													// check object __DEC_messageSend_sendEvent_424311 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_424311 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_424311 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_424311
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

											// iterate to-many link message from message to __DEC_message_message_813244
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_813244 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_813244
															.hasNext()) {
												try {
													__DEC_message_message_813244 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_813244
															.next();

													// check object __DEC_message_message_813244 is really bound
													JavaSDM.ensure(__DEC_message_message_813244 != null);
													// check isomorphic binding between objects __DEC_message_message_813244 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_813244
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_813244 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_813244
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

										// check link covered from line to messageReceive
										JavaSDM.ensure(line.getCoveredBy()
												.contains(messageReceive));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														interaction,
														messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_299178 = null;
		Message __DEC_messageReceive_receiveEvent_299178 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_923876 = null;
		Message __DEC_messageSend_receiveEvent_923876 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_946390 = null;
		Message __DEC_messageReceive_sendEvent_946390 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_740412 = null;
		Message __DEC_messageSend_sendEvent_740412 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_205916 = null;
		MessageEnd __DEC_message_message_205916 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
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

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

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

			// check link src from _edge_message to messageSend
			JavaSDM.ensure(messageSend.equals(_edge_message.getSrc()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_299178
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_299178 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_299178
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_299178 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_299178
											.next();

									// check object __DEC_messageReceive_receiveEvent_299178 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_299178 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_299178 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_299178
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_923876
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_923876 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_923876
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_923876 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_923876
											.next();

									// check object __DEC_messageSend_receiveEvent_923876 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_923876 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_923876 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_923876
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_946390
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_946390 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_946390
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_946390 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_946390
											.next();

									// check object __DEC_messageReceive_sendEvent_946390 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_946390 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_946390 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_946390
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_740412
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_740412 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_740412
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_740412 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_740412
											.next();

									// check object __DEC_messageSend_sendEvent_740412 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_740412 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_740412 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_740412
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

							// iterate to-many link message from message to __DEC_message_message_205916
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_205916 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_205916
											.hasNext()) {
								try {
									__DEC_message_message_205916 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_205916
											.next();

									// check object __DEC_message_message_205916 is really bound
									JavaSDM.ensure(__DEC_message_message_205916 != null);
									// check isomorphic binding between objects __DEC_message_message_205916 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_205916
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_205916 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_205916
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
								interaction, messageSend, messageReceive,
								message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_21(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_752490 = null;
		Message __DEC_messageReceive_receiveEvent_752490 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_992283 = null;
		Message __DEC_messageSend_receiveEvent_992283 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_176285 = null;
		Message __DEC_messageReceive_sendEvent_176285 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_579720 = null;
		Message __DEC_messageSend_sendEvent_579720 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_396872 = null;
		MessageEnd __DEC_message_message_396872 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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

			// check link trg from _edge_message to message
			JavaSDM.ensure(message.equals(_edge_message.getTrg()));

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
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_752490
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_752490 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_752490
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_752490 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_752490
													.next();

											// check object __DEC_messageReceive_receiveEvent_752490 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_752490 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_752490 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_752490
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_992283
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_992283 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_992283
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_992283 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_992283
													.next();

											// check object __DEC_messageSend_receiveEvent_992283 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_992283 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_992283 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_992283
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_176285
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_176285 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_176285
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_176285 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_176285
													.next();

											// check object __DEC_messageReceive_sendEvent_176285 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_176285 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_176285 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_176285
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_579720
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_579720 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_579720
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_579720 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_579720
													.next();

											// check object __DEC_messageSend_sendEvent_579720 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_579720 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_579720 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_579720
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

									// iterate to-many link message from message to __DEC_message_message_396872
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_396872 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_396872
													.hasNext()) {
										try {
											__DEC_message_message_396872 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_396872
													.next();

											// check object __DEC_message_message_396872 is really bound
											JavaSDM.ensure(__DEC_message_message_396872 != null);
											// check isomorphic binding between objects __DEC_message_message_396872 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_396872
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_396872 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_396872
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
										interaction, messageSend,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777497 = null;
		Message __DEC_messageReceive_receiveEvent_777497 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_603702 = null;
		Message __DEC_messageSend_receiveEvent_603702 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_262772 = null;
		Message __DEC_messageReceive_sendEvent_262772 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425723 = null;
		Message __DEC_messageSend_sendEvent_425723 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_720701 = null;
		MessageEnd __DEC_message_message_720701 = null;
		Match match = null;
		Message message = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Lifeline line = null;
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

			// check object _edge_coveredBy is really bound
			JavaSDM.ensure(_edge_coveredBy != null);
			// bind object
			_TmpObject = _edge_coveredBy.getTrg();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			_TmpObject = _edge_coveredBy.getSrc();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// check link covered from line to messageReceive
			JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

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
					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// bind object
					message = messageSend.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_777497
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777497 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777497
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_777497 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_777497
											.next();

									// check object __DEC_messageReceive_receiveEvent_777497 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_777497 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_777497 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_777497
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

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_603702
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_603702 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_603702
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_603702 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_603702
											.next();

									// check object __DEC_messageSend_receiveEvent_603702 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_603702 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_603702 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_603702
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

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_262772
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_262772 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_262772
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_262772 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_262772
											.next();

									// check object __DEC_messageReceive_sendEvent_262772 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_262772 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_262772 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_262772
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

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_425723
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425723 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425723
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_425723 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425723
											.next();

									// check object __DEC_messageSend_sendEvent_425723 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_425723 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_425723 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_425723
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

							// iterate to-many link message from message to __DEC_message_message_720701
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_720701 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_720701
											.hasNext()) {
								try {
									__DEC_message_message_720701 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_720701
											.next();

									// check object __DEC_message_message_720701 is really bound
									JavaSDM.ensure(__DEC_message_message_720701 != null);
									// check isomorphic binding between objects __DEC_message_message_720701 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_720701
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_720701 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_720701
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

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

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
								interaction, messageSend, messageReceive,
								message, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_23(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_483338 = null;
		Message __DEC_messageReceive_receiveEvent_483338 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_662321 = null;
		Message __DEC_messageSend_receiveEvent_662321 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_244450 = null;
		Message __DEC_messageReceive_sendEvent_244450 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_750509 = null;
		Message __DEC_messageSend_sendEvent_750509 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_184164 = null;
		MessageEnd __DEC_message_message_184164 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
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

			// check object _edge_covered is really bound
			JavaSDM.ensure(_edge_covered != null);
			// bind object
			_TmpObject = _edge_covered.getTrg();

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

					// check link src from _edge_covered to messageReceive
					JavaSDM.ensure(messageReceive.equals(_edge_covered.getSrc()));

					// check link covered from line to messageReceive
					JavaSDM.ensure(line.getCoveredBy().contains(messageReceive));

					// iterate to-many link src from line to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterLineTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(line,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterLineTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
									.next();

							// check object _edge_coveredBy is really bound
							JavaSDM.ensure(_edge_coveredBy != null);
							// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
							JavaSDM.ensure(!_edge_coveredBy
									.equals(_edge_covered));

							// check link trg from _edge_coveredBy to messageReceive
							JavaSDM.ensure(messageReceive
									.equals(_edge_coveredBy.getTrg()));

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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_483338
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_483338 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_483338
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_483338 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_483338
													.next();

											// check object __DEC_messageReceive_receiveEvent_483338 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_483338 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_483338 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_483338
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

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_662321
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_662321 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_662321
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_662321 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_662321
													.next();

											// check object __DEC_messageSend_receiveEvent_662321 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_662321 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_662321 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_662321
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

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_244450
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_244450 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_244450
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_244450 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_244450
													.next();

											// check object __DEC_messageReceive_sendEvent_244450 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_244450 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_244450 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_244450
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

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_750509
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_750509 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_750509
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_750509 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_750509
													.next();

											// check object __DEC_messageSend_sendEvent_750509 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_750509 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_750509 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_750509
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

									// iterate to-many link message from message to __DEC_message_message_184164
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_184164 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_184164
													.hasNext()) {
										try {
											__DEC_message_message_184164 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_184164
													.next();

											// check object __DEC_message_message_184164 is really bound
											JavaSDM.ensure(__DEC_message_message_184164 != null);
											// check isomorphic binding between objects __DEC_message_message_184164 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_184164
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_184164 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_184164
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
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

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

								// check link src from _edge_covered to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_covered.getSrc()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to line
								JavaSDM.ensure(line.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_coveredBy.getTrg()));

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
										interaction, messageSend,
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
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject useCase,
			EObject useCaseToInteraction, EObject step, EObject message,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
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
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NormalStepToMessageRule.class) {
			switch (baseOperationID) {
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			default:
				return -1;
			}
		}
		if (baseClass == NormalStepBFToMessageRule.class) {
			switch (baseOperationID) {
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
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
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(NormalStep) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Interaction) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(BasicFlow) arguments.get(6),
					(FlowToInteractionFragment) arguments.get(7),
					(UseCase) arguments.get(8),
					(UseCaseToInteraction) arguments.get(9),
					(Message) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_90((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_91((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_93((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_94((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_95((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_96__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_96((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_97__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_97((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_98__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_98((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_99((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_101__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_101((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_102((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_103((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1), (UseCase) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1), (UseCase) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1), (UseCase) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Interaction) arguments.get(1),
					(BasicFlow) arguments.get(2),
					(FlowToInteractionFragment) arguments.get(3),
					(UseCase) arguments.get(4),
					(UseCaseToInteraction) arguments.get(5),
					(NormalStep) arguments.get(6), (Lifeline) arguments.get(7),
					(Actor) arguments.get(8),
					(ActorToLifeline) arguments.get(9),
					(PackageDeclaration) arguments.get(10));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Message) arguments.get(4), (Lifeline) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Message) arguments.get(4), (Lifeline) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Message) arguments.get(4), (Lifeline) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Interaction) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(Message) arguments.get(8), (Lifeline) arguments.get(9),
					(Actor) arguments.get(10),
					(ActorToLifeline) arguments.get(11),
					(PackageDeclaration) arguments.get(12));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_12((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_13((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_14((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_18((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_19((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4),
					(Interaction) arguments.get(5),
					(Lifeline) arguments.get(6), (Actor) arguments.get(7),
					(ActorToLifeline) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
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
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments
					.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SystemStepBFToMessageRuleImpl
