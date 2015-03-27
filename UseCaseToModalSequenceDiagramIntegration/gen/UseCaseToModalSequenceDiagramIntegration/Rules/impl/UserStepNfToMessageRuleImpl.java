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

import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNFToMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule;

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
 * An implementation of the model object '<em><b>User Step Nf To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserStepNfToMessageRuleImpl extends AbstractRuleImpl implements
		UserStepNfToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStepNfToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserStepNfToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;

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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match,
					packageDeclaration, sysActor, actor, flow, useCase, step));

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
				// check object sysActor is really bound
				JavaSDM.ensure(sysActor != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects sysActor and actor 
				JavaSDM.ensure(!sysActor.equals(actor));

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_sysActor
				__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_actors_sysActor
				__packageDeclaration_actors_sysActor.setName("actors");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_sysActor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysActor, "contextNodes");

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_sysActor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_sysActor.setTrg(sysActor);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

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
			this.registerObjectsToMatch_FWD(match, packageDeclaration,
					sysActor, actor, flow, useCase, step);
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
		CombinedFragment combo = null;
		NamedFlow flow = null;
		FlowToInteractionFragment flowToOperand = null;
		Interaction interaction = null;
		Lifeline line = null;
		InteractionOperand operand = null;
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
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge operand__fragment__messageReceive = null;
		EMoflonEdge sysLine__coveredBy__messageSend = null;
		EMoflonEdge operand__covered__sysLine = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge messageReceive__enclosingOperand__operand = null;
		EMoflonEdge combo__covered__line = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge messageSend__covered__sysLine = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge combo__covered__sysLine = null;
		EMoflonEdge sysLine__coveredBy__combo = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge sysLine__coveredBy__operand = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge __flow_steps_step = null;

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
			_TmpObject = (isApplicableMatch.getObject("combo"));

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToOperand"));

			// ensure correct type and really bound of object flowToOperand
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToOperand = (FlowToInteractionFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("operand"));

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;
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
			operand.getCovered().add(sysLine);

			// create link
			combo.getCovered().add(sysLine);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageSend,
					message, "message");

			// create link
			message.setSendEvent(messageSend);

			// create link
			messageReceive.setEnclosingOperand(operand);

			// create link
			line.getCoveredBy().add(operand);

			// create link
			line.getCoveredBy().add(combo);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageReceive,
					message, "message");

			// create link
			message.setReceiveEvent(messageReceive);

			// create link
			stepToMessage.setSource(step);

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
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

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

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowToOperand is really bound
			JavaSDM.ensure(flowToOperand != null);
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
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
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

			// check isomorphic binding between objects combo and actor 
			JavaSDM.ensure(!combo.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowToOperand and actor 
			JavaSDM.ensure(!flowToOperand.equals(actor));

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

			// check isomorphic binding between objects operand and actor 
			JavaSDM.ensure(!operand.equals(actor));

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

			// check isomorphic binding between objects combo and actorToLine 
			JavaSDM.ensure(!combo.equals(actorToLine));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects flowToOperand and actorToLine 
			JavaSDM.ensure(!flowToOperand.equals(actorToLine));

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

			// check isomorphic binding between objects operand and actorToLine 
			JavaSDM.ensure(!operand.equals(actorToLine));

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

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects flowToOperand and combo 
			JavaSDM.ensure(!flowToOperand.equals(combo));

			// check isomorphic binding between objects interaction and combo 
			JavaSDM.ensure(!interaction.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

			// check isomorphic binding between objects message and combo 
			JavaSDM.ensure(!message.equals(combo));

			// check isomorphic binding between objects messageReceive and combo 
			JavaSDM.ensure(!messageReceive.equals(combo));

			// check isomorphic binding between objects messageSend and combo 
			JavaSDM.ensure(!messageSend.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

			// check isomorphic binding between objects packageDeclaration and combo 
			JavaSDM.ensure(!packageDeclaration.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToMessage and combo 
			JavaSDM.ensure(!stepToMessage.equals(combo));

			// check isomorphic binding between objects sysActor and combo 
			JavaSDM.ensure(!sysActor.equals(combo));

			// check isomorphic binding between objects sysActorToSysLine and combo 
			JavaSDM.ensure(!sysActorToSysLine.equals(combo));

			// check isomorphic binding between objects sysLine and combo 
			JavaSDM.ensure(!sysLine.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects useCaseToInteraction and combo 
			JavaSDM.ensure(!useCaseToInteraction.equals(combo));

			// check isomorphic binding between objects flowToOperand and flow 
			JavaSDM.ensure(!flowToOperand.equals(flow));

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

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

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

			// check isomorphic binding between objects interaction and flowToOperand 
			JavaSDM.ensure(!interaction.equals(flowToOperand));

			// check isomorphic binding between objects line and flowToOperand 
			JavaSDM.ensure(!line.equals(flowToOperand));

			// check isomorphic binding between objects message and flowToOperand 
			JavaSDM.ensure(!message.equals(flowToOperand));

			// check isomorphic binding between objects messageReceive and flowToOperand 
			JavaSDM.ensure(!messageReceive.equals(flowToOperand));

			// check isomorphic binding between objects messageSend and flowToOperand 
			JavaSDM.ensure(!messageSend.equals(flowToOperand));

			// check isomorphic binding between objects operand and flowToOperand 
			JavaSDM.ensure(!operand.equals(flowToOperand));

			// check isomorphic binding between objects packageDeclaration and flowToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(flowToOperand));

			// check isomorphic binding between objects step and flowToOperand 
			JavaSDM.ensure(!step.equals(flowToOperand));

			// check isomorphic binding between objects stepToMessage and flowToOperand 
			JavaSDM.ensure(!stepToMessage.equals(flowToOperand));

			// check isomorphic binding between objects sysActor and flowToOperand 
			JavaSDM.ensure(!sysActor.equals(flowToOperand));

			// check isomorphic binding between objects sysActorToSysLine and flowToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(flowToOperand));

			// check isomorphic binding between objects sysLine and flowToOperand 
			JavaSDM.ensure(!sysLine.equals(flowToOperand));

			// check isomorphic binding between objects useCase and flowToOperand 
			JavaSDM.ensure(!useCase.equals(flowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and flowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToOperand));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects messageSend and interaction 
			JavaSDM.ensure(!messageSend.equals(interaction));

			// check isomorphic binding between objects operand and interaction 
			JavaSDM.ensure(!operand.equals(interaction));

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

			// check isomorphic binding between objects operand and line 
			JavaSDM.ensure(!operand.equals(line));

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

			// check isomorphic binding between objects operand and message 
			JavaSDM.ensure(!operand.equals(message));

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

			// check isomorphic binding between objects operand and messageReceive 
			JavaSDM.ensure(!operand.equals(messageReceive));

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

			// check isomorphic binding between objects operand and messageSend 
			JavaSDM.ensure(!operand.equals(messageSend));

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

			// check isomorphic binding between objects packageDeclaration and operand 
			JavaSDM.ensure(!packageDeclaration.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToMessage and operand 
			JavaSDM.ensure(!stepToMessage.equals(operand));

			// check isomorphic binding between objects sysActor and operand 
			JavaSDM.ensure(!sysActor.equals(operand));

			// check isomorphic binding between objects sysActorToSysLine and operand 
			JavaSDM.ensure(!sysActorToSysLine.equals(operand));

			// check isomorphic binding between objects sysLine and operand 
			JavaSDM.ensure(!sysLine.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

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

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__fragment__messageReceive
			operand__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__sysLine
			operand__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingOperand__operand
			messageReceive__enclosingOperand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__covered__sysLine
			messageSend__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__sysLine
			combo__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__combo
			sysLine__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__operand
			sysLine__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserStepNfToMessageRule");
			// assign attribute sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__sysLine
			messageSend__covered__sysLine.setName("covered");
			// assign attribute sysLine__coveredBy__operand
			sysLine__coveredBy__operand.setName("coveredBy");
			// assign attribute operand__covered__sysLine
			operand__covered__sysLine.setName("covered");
			// assign attribute sysLine__coveredBy__combo
			sysLine__coveredBy__combo.setName("coveredBy");
			// assign attribute combo__covered__sysLine
			combo__covered__sysLine.setName("covered");
			// assign attribute operand__fragment__messageReceive
			operand__fragment__messageReceive.setName("fragment");
			// assign attribute messageReceive__enclosingOperand__operand
			messageReceive__enclosingOperand__operand
					.setName("enclosingOperand");
			// assign attribute line__coveredBy__operand
			line__coveredBy__operand.setName("coveredBy");
			// assign attribute operand__covered__line
			operand__covered__line.setName("covered");
			// assign attribute line__coveredBy__combo
			line__coveredBy__combo.setName("coveredBy");
			// assign attribute combo__covered__line
			combo__covered__line.setName("covered");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingOperand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			sysLine__coveredBy__combo.setSrc(sysLine);

			// create link
			operand__covered__sysLine.setTrg(sysLine);

			// create link
			sysLine__coveredBy__operand.setSrc(sysLine);

			// create link
			messageSend__covered__sysLine.setTrg(sysLine);

			// create link
			combo__covered__sysLine.setTrg(sysLine);

			// create link
			sysLine__coveredBy__messageSend.setSrc(sysLine);

			// create link
			messageSend__message__message.setSrc(messageSend);

			// create link
			sysLine__coveredBy__messageSend.setTrg(messageSend);

			// create link
			message__sendEvent__messageSend.setTrg(messageSend);

			// create link
			messageSend__covered__sysLine.setSrc(messageSend);

			// create link
			sysLine__coveredBy__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			messageReceive__enclosingOperand__operand.setTrg(operand);

			// create link
			operand__covered__sysLine.setSrc(operand);

			// create link
			operand__fragment__messageReceive.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			combo__covered__sysLine.setSrc(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			sysLine__coveredBy__combo.setTrg(combo);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__enclosingOperand__operand.setSrc(messageReceive);

			// create link
			operand__fragment__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			line__coveredBy__combo.setSrc(line);

			// create link
			combo__covered__line.setTrg(line);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, packageDeclaration, sysActor,
				actor, sysLine, messageSend, sysActorToSysLine, operand, combo,
				flow, flowToOperand, messageReceive, line, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, actorToLine);
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
		NamedFlow flow = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		Actor sysActor = null;
		UseCase useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __actorToLine_source_actor = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __flowToOperand_target_operand = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __flowToOperand_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		CSP csp = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterSysActorToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterFlowToFlowToOperand = null;
		FlowToInteractionFragment flowToOperand = null;
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
			ruleresult.setRule("UserStepNfToMessageRule");

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
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;
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

					// iterate to-many link source from flow to flowToOperand
					fujaba__Success = false;

					fujaba__IterFlowToFlowToOperand = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(flow,
											FlowToInteractionFragment.class,
											"source")).iterator();

					while (fujaba__IterFlowToFlowToOperand.hasNext()) {
						try {
							flowToOperand = (FlowToInteractionFragment) fujaba__IterFlowToFlowToOperand
									.next();

							// check object flowToOperand is really bound
							JavaSDM.ensure(flowToOperand != null);
							// bind object
							_TmpObject = flowToOperand.getTarget();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;

							// iterate to-many link source from sysActor to sysActorToSysLine
							fujaba__Success = false;

							fujaba__IterSysActorToSysActorToSysLine = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(sysActor,
													ActorToLifeline.class,
													"source")).iterator();

							while (fujaba__IterSysActorToSysActorToSysLine
									.hasNext()) {
								try {
									sysActorToSysLine = (ActorToLifeline) fujaba__IterSysActorToSysActorToSysLine
											.next();

									// check object sysActorToSysLine is really bound
									JavaSDM.ensure(sysActorToSysLine != null);
									// check isomorphic binding between objects sysActorToSysLine and actorToLine 
									JavaSDM.ensure(!sysActorToSysLine
											.equals(actorToLine));

									// bind object
									sysLine = sysActorToSysLine.getTarget();

									// check object sysLine is really bound
									JavaSDM.ensure(sysLine != null);

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

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check object actor is really bound
												JavaSDM.ensure(actor != null);
												// check object actorToLine is really bound
												JavaSDM.ensure(actorToLine != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object flowToOperand is really bound
												JavaSDM.ensure(flowToOperand != null);
												// check object interaction is really bound
												JavaSDM.ensure(interaction != null);
												// check object line is really bound
												JavaSDM.ensure(line != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
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

												// bind object
												combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
														.eContainer() : null;

												// check object combo is really bound
												JavaSDM.ensure(combo != null);

												// check if contained via correct reference
												JavaSDM.ensure(combo
														.getOperand().contains(
																operand));

												// check link source from actorToLine to actor
												JavaSDM.ensure(actor
														.equals(actorToLine
																.getSource()));

												// check link source from flowToOperand to flow
												JavaSDM.ensure(flow
														.equals(flowToOperand
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

												// check link target from flowToOperand to operand
												JavaSDM.ensure(operand
														.equals(flowToOperand
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

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_actor_actor
												__step_actor_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_operand_operand
												__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToOperand_target_operand
												__flowToOperand_target_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flow_steps_step
												__flow_steps_step = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToOperand_source_flow
												__flowToOperand_source_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCase_flows_flow
												__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_target_line
												__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor
														.setName("actors");
												// assign attribute __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor
														.setName("actors");
												// assign attribute __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor
														.setName("source");
												// assign attribute __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine
														.setName("target");
												// assign attribute __combo_operand_operand
												__combo_operand_operand
														.setName("operand");
												// assign attribute __flowToOperand_source_flow
												__flowToOperand_source_flow
														.setName("source");
												// assign attribute __flowToOperand_target_operand
												__flowToOperand_target_operand
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
												__packageDeclaration_actors_sysActor
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_sysActor
														.setTrg(sysActor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActor);

												// create link
												__sysActorToSysLine_source_sysActor
														.setTrg(sysActor);

												// create link
												__step_actor_actor
														.setTrg(actor);

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
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setTrg(sysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActorToSysLine);

												// create link
												__sysActorToSysLine_source_sysActor
														.setSrc(sysActorToSysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setSrc(sysActorToSysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(operand);

												// create link
												__combo_operand_operand
														.setTrg(operand);

												// create link
												__flowToOperand_target_operand
														.setTrg(operand);

												// create link
												__combo_operand_operand
														.setSrc(combo);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(combo);

												// create link
												__flow_steps_step.setSrc(flow);

												// create link
												__flowToOperand_source_flow
														.setTrg(flow);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flowToOperand);

												// create link
												__flowToOperand_source_flow
														.setSrc(flowToOperand);

												// create link
												__flowToOperand_target_operand
														.setSrc(flowToOperand);

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
												__interaction_lifeline_line
														.setTrg(line);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCase);

												// create link
												__useCaseToInteraction_source_useCase
														.setTrg(useCase);

												// create link
												__useCase_flows_flow
														.setSrc(useCase);

												// create link
												__useCaseToInteraction_target_interaction
														.setSrc(useCaseToInteraction);

												// create link
												__useCaseToInteraction_source_useCase
														.setSrc(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												__flow_steps_step.setTrg(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(step);

												// create link
												__step_actor_actor.setSrc(step);

												// create link
												__line_interaction_interaction
														.setTrg(interaction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(interaction);

												// create link
												__interaction_lifeline_line
														.setSrc(interaction);

												// create link
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__actorToLine_source_actor
														.setSrc(actorToLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actorToLine);

												// create link
												__actorToLine_target_line
														.setSrc(actorToLine);

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
																__flowToOperand_source_flow,
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
																__useCase_flows_flow,
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
																__flowToOperand_target_operand,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__combo_operand_operand,
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
																__useCaseToInteraction_target_interaction,
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
																__packageDeclaration_actors_actor,
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
																__useCaseToInteraction_source_useCase,
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
																__flow_steps_step,
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
															.isApplicable_solveCsp_FWD(
																	isApplicableMatch,
																	packageDeclaration,
																	sysActor,
																	actor,
																	sysLine,
																	sysActorToSysLine,
																	operand,
																	combo,
																	flow,
																	flowToOperand,
																	line,
																	useCase,
																	useCaseToInteraction,
																	step,
																	interaction,
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
																.setRuleName("UserStepNfToMessageRule");
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
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("sysActor", sysActor);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step) {
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
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			NormalStep step, Interaction interaction,
			ActorToLifeline actorToLine) {
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
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject useCase, EObject useCaseToInteraction, EObject step,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject actorToLine) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __interaction_lifeline_line = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
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
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
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
					messageSend, operand, combo, messageReceive, line, message,
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

				// check object combo is really bound
				JavaSDM.ensure(combo != null);
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
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_combo
				__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_sysLine
				__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingOperand_operand
				__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_sysLine
				__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_fragment_messageReceive
				__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_operand
				__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_sysLine
				__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_sysLine
				__messageSend_covered_sysLine.setName("covered");
				// assign attribute __sysLine_coveredBy_operand
				__sysLine_coveredBy_operand.setName("coveredBy");
				// assign attribute __operand_covered_sysLine
				__operand_covered_sysLine.setName("covered");
				// assign attribute __sysLine_coveredBy_combo
				__sysLine_coveredBy_combo.setName("coveredBy");
				// assign attribute __combo_covered_sysLine
				__combo_covered_sysLine.setName("covered");
				// assign attribute __operand_fragment_messageReceive
				__operand_fragment_messageReceive.setName("fragment");
				// assign attribute __messageReceive_enclosingOperand_operand
				__messageReceive_enclosingOperand_operand
						.setName("enclosingOperand");
				// assign attribute __line_coveredBy_operand
				__line_coveredBy_operand.setName("coveredBy");
				// assign attribute __operand_covered_line
				__operand_covered_line.setName("covered");
				// assign attribute __line_coveredBy_combo
				__line_coveredBy_combo.setName("coveredBy");
				// assign attribute __combo_covered_line
				__combo_covered_line.setName("covered");
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

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingOperand_operand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_sysLine, "toBeTranslatedEdges");

				// create link
				__sysLine_coveredBy_combo.setSrc(sysLine);

				// create link
				__messageSend_covered_sysLine.setTrg(sysLine);

				// create link
				__sysLine_coveredBy_messageSend.setSrc(sysLine);

				// create link
				__operand_covered_sysLine.setTrg(sysLine);

				// create link
				__combo_covered_sysLine.setTrg(sysLine);

				// create link
				__sysLine_coveredBy_operand.setSrc(sysLine);

				// create link
				__sysLine_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__messageSend_covered_sysLine.setSrc(messageSend);

				// create link
				__sysLine_coveredBy_operand.setTrg(operand);

				// create link
				__messageReceive_enclosingOperand_operand.setTrg(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__operand_fragment_messageReceive.setSrc(operand);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__operand_covered_sysLine.setSrc(operand);

				// create link
				__sysLine_coveredBy_combo.setTrg(combo);

				// create link
				__combo_covered_sysLine.setSrc(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingOperand_operand
						.setSrc(messageReceive);

				// create link
				__operand_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object combo is really bound
				JavaSDM.ensure(combo != null);
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
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysLine, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, sysLine, messageSend,
					operand, combo, messageReceive, line, message, interaction);
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
		CombinedFragment combo = null;
		NamedFlow flow = null;
		FlowToInteractionFragment flowToOperand = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
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
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __message_interaction_interaction = null;

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
			_TmpObject = (isApplicableMatch.getObject("combo"));

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToOperand"));

			// ensure correct type and really bound of object flowToOperand
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToOperand = (FlowToInteractionFragment) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("operand"));

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;
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
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

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

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowToOperand is really bound
			JavaSDM.ensure(flowToOperand != null);
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
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
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

			// check isomorphic binding between objects combo and actor 
			JavaSDM.ensure(!combo.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowToOperand and actor 
			JavaSDM.ensure(!flowToOperand.equals(actor));

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

			// check isomorphic binding between objects operand and actor 
			JavaSDM.ensure(!operand.equals(actor));

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

			// check isomorphic binding between objects combo and actorToLine 
			JavaSDM.ensure(!combo.equals(actorToLine));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects flowToOperand and actorToLine 
			JavaSDM.ensure(!flowToOperand.equals(actorToLine));

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

			// check isomorphic binding between objects operand and actorToLine 
			JavaSDM.ensure(!operand.equals(actorToLine));

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

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects flowToOperand and combo 
			JavaSDM.ensure(!flowToOperand.equals(combo));

			// check isomorphic binding between objects interaction and combo 
			JavaSDM.ensure(!interaction.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

			// check isomorphic binding between objects message and combo 
			JavaSDM.ensure(!message.equals(combo));

			// check isomorphic binding between objects messageReceive and combo 
			JavaSDM.ensure(!messageReceive.equals(combo));

			// check isomorphic binding between objects messageSend and combo 
			JavaSDM.ensure(!messageSend.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

			// check isomorphic binding between objects packageDeclaration and combo 
			JavaSDM.ensure(!packageDeclaration.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToMessage and combo 
			JavaSDM.ensure(!stepToMessage.equals(combo));

			// check isomorphic binding between objects sysActor and combo 
			JavaSDM.ensure(!sysActor.equals(combo));

			// check isomorphic binding between objects sysActorToSysLine and combo 
			JavaSDM.ensure(!sysActorToSysLine.equals(combo));

			// check isomorphic binding between objects sysLine and combo 
			JavaSDM.ensure(!sysLine.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects useCaseToInteraction and combo 
			JavaSDM.ensure(!useCaseToInteraction.equals(combo));

			// check isomorphic binding between objects flowToOperand and flow 
			JavaSDM.ensure(!flowToOperand.equals(flow));

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

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

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

			// check isomorphic binding between objects interaction and flowToOperand 
			JavaSDM.ensure(!interaction.equals(flowToOperand));

			// check isomorphic binding between objects line and flowToOperand 
			JavaSDM.ensure(!line.equals(flowToOperand));

			// check isomorphic binding between objects message and flowToOperand 
			JavaSDM.ensure(!message.equals(flowToOperand));

			// check isomorphic binding between objects messageReceive and flowToOperand 
			JavaSDM.ensure(!messageReceive.equals(flowToOperand));

			// check isomorphic binding between objects messageSend and flowToOperand 
			JavaSDM.ensure(!messageSend.equals(flowToOperand));

			// check isomorphic binding between objects operand and flowToOperand 
			JavaSDM.ensure(!operand.equals(flowToOperand));

			// check isomorphic binding between objects packageDeclaration and flowToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(flowToOperand));

			// check isomorphic binding between objects step and flowToOperand 
			JavaSDM.ensure(!step.equals(flowToOperand));

			// check isomorphic binding between objects stepToMessage and flowToOperand 
			JavaSDM.ensure(!stepToMessage.equals(flowToOperand));

			// check isomorphic binding between objects sysActor and flowToOperand 
			JavaSDM.ensure(!sysActor.equals(flowToOperand));

			// check isomorphic binding between objects sysActorToSysLine and flowToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(flowToOperand));

			// check isomorphic binding between objects sysLine and flowToOperand 
			JavaSDM.ensure(!sysLine.equals(flowToOperand));

			// check isomorphic binding between objects useCase and flowToOperand 
			JavaSDM.ensure(!useCase.equals(flowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and flowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToOperand));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

			// check isomorphic binding between objects message and interaction 
			JavaSDM.ensure(!message.equals(interaction));

			// check isomorphic binding between objects messageReceive and interaction 
			JavaSDM.ensure(!messageReceive.equals(interaction));

			// check isomorphic binding between objects messageSend and interaction 
			JavaSDM.ensure(!messageSend.equals(interaction));

			// check isomorphic binding between objects operand and interaction 
			JavaSDM.ensure(!operand.equals(interaction));

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

			// check isomorphic binding between objects operand and line 
			JavaSDM.ensure(!operand.equals(line));

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

			// check isomorphic binding between objects operand and message 
			JavaSDM.ensure(!operand.equals(message));

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

			// check isomorphic binding between objects operand and messageReceive 
			JavaSDM.ensure(!operand.equals(messageReceive));

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

			// check isomorphic binding between objects operand and messageSend 
			JavaSDM.ensure(!operand.equals(messageSend));

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

			// check isomorphic binding between objects packageDeclaration and operand 
			JavaSDM.ensure(!packageDeclaration.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToMessage and operand 
			JavaSDM.ensure(!stepToMessage.equals(operand));

			// check isomorphic binding between objects sysActor and operand 
			JavaSDM.ensure(!sysActor.equals(operand));

			// check isomorphic binding between objects sysActorToSysLine and operand 
			JavaSDM.ensure(!sysActorToSysLine.equals(operand));

			// check isomorphic binding between objects sysLine and operand 
			JavaSDM.ensure(!sysLine.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

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

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingOperand_operand
			__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_sysLine
			__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_operand
			__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_sysLine
			__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_combo
			__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_sysLine
			__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_fragment_messageReceive
			__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserStepNfToMessageRule");
			// assign attribute __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_sysLine
			__messageSend_covered_sysLine.setName("covered");
			// assign attribute __sysLine_coveredBy_operand
			__sysLine_coveredBy_operand.setName("coveredBy");
			// assign attribute __operand_covered_sysLine
			__operand_covered_sysLine.setName("covered");
			// assign attribute __sysLine_coveredBy_combo
			__sysLine_coveredBy_combo.setName("coveredBy");
			// assign attribute __combo_covered_sysLine
			__combo_covered_sysLine.setName("covered");
			// assign attribute __operand_fragment_messageReceive
			__operand_fragment_messageReceive.setName("fragment");
			// assign attribute __messageReceive_enclosingOperand_operand
			__messageReceive_enclosingOperand_operand
					.setName("enclosingOperand");
			// assign attribute __line_coveredBy_operand
			__line_coveredBy_operand.setName("coveredBy");
			// assign attribute __operand_covered_line
			__operand_covered_line.setName("covered");
			// assign attribute __line_coveredBy_combo
			__line_coveredBy_combo.setName("coveredBy");
			// assign attribute __combo_covered_line
			__combo_covered_line.setName("covered");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingOperand_operand,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__operand_covered_sysLine.setTrg(sysLine);

			// create link
			__combo_covered_sysLine.setTrg(sysLine);

			// create link
			__sysLine_coveredBy_combo.setSrc(sysLine);

			// create link
			__messageSend_covered_sysLine.setTrg(sysLine);

			// create link
			__sysLine_coveredBy_messageSend.setSrc(sysLine);

			// create link
			__sysLine_coveredBy_operand.setSrc(sysLine);

			// create link
			__messageSend_covered_sysLine.setSrc(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__sysLine_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			__messageReceive_enclosingOperand_operand.setTrg(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			__operand_covered_sysLine.setSrc(operand);

			// create link
			__operand_fragment_messageReceive.setSrc(operand);

			// create link
			__sysLine_coveredBy_operand.setTrg(operand);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			__sysLine_coveredBy_combo.setTrg(combo);

			// create link
			__combo_covered_sysLine.setSrc(combo);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__operand_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__messageReceive_enclosingOperand_operand.setSrc(messageReceive);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, packageDeclaration, sysActor,
				actor, sysLine, messageSend, sysActorToSysLine, operand, combo,
				flow, flowToOperand, messageReceive, line, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, actorToLine);
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
		CombinedFragment combo = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		Lifeline sysLine = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __actorToLine_source_actor = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __flowToOperand_target_operand = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToOperand_source_flow = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Actor sysActor = null;
		Iterator fujaba__IterSysLineToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		NamedFlow flow = null;
		Iterator fujaba__IterOperandToFlowToOperand = null;
		FlowToInteractionFragment flowToOperand = null;
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
			ruleresult.setRule("UserStepNfToMessageRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("combo"));

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;
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
			_TmpObject = (match.getObject("operand"));

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;
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

					// iterate to-many link target from operand to flowToOperand
					fujaba__Success = false;

					fujaba__IterOperandToFlowToOperand = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(operand,
											FlowToInteractionFragment.class,
											"target")).iterator();

					while (fujaba__IterOperandToFlowToOperand.hasNext()) {
						try {
							flowToOperand = (FlowToInteractionFragment) fujaba__IterOperandToFlowToOperand
									.next();

							// check object flowToOperand is really bound
							JavaSDM.ensure(flowToOperand != null);
							// bind object
							_TmpObject = flowToOperand.getSource();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof NamedFlow);
							flow = (NamedFlow) _TmpObject;

							// iterate to-many link target from sysLine to sysActorToSysLine
							fujaba__Success = false;

							fujaba__IterSysLineToSysActorToSysLine = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(sysLine,
													ActorToLifeline.class,
													"target")).iterator();

							while (fujaba__IterSysLineToSysActorToSysLine
									.hasNext()) {
								try {
									sysActorToSysLine = (ActorToLifeline) fujaba__IterSysLineToSysActorToSysLine
											.next();

									// check object sysActorToSysLine is really bound
									JavaSDM.ensure(sysActorToSysLine != null);
									// check isomorphic binding between objects sysActorToSysLine and actorToLine 
									JavaSDM.ensure(!sysActorToSysLine
											.equals(actorToLine));

									// bind object
									sysActor = sysActorToSysLine.getSource();

									// check object sysActor is really bound
									JavaSDM.ensure(sysActor != null);

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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object flowToOperand is really bound
												JavaSDM.ensure(flowToOperand != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
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

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

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

												// check link flows from flow to useCase
												JavaSDM.ensure(useCase
														.equals(flow
																.eContainer()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link source from actorToLine to actor
												JavaSDM.ensure(actor
														.equals(actorToLine
																.getSource()));

												// check link source from flowToOperand to flow
												JavaSDM.ensure(flow
														.equals(flowToOperand
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

												// check link target from flowToOperand to operand
												JavaSDM.ensure(operand
														.equals(flowToOperand
																.getTarget()));

												// check link target from sysActorToSysLine to sysLine
												JavaSDM.ensure(sysLine
														.equals(sysActorToSysLine
																.getTarget()));

												// check link target from useCaseToInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(useCaseToInteraction
																.getTarget()));

												// bind object
												packageDeclaration = useCase
														.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
														.eContainer() : null;

												// check object packageDeclaration is really bound
												JavaSDM.ensure(packageDeclaration != null);

												// check if contained via correct reference
												JavaSDM.ensure(packageDeclaration
														.getUseCases()
														.contains(useCase));

												// check link actors from actor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(actor
																.eContainer()));

												// check link actors from sysActor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(sysActor
																.eContainer()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
														.getCovered().contains(
																sysLine));

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_covered_sysLine
												__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_operand
												__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_combo
												__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_messageSend
												__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_covered_sysLine
												__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_covered_sysLine
												__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_message_message
												__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_sendEvent_messageSend
												__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_enclosingOperand_operand
												__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_covered_line
												__operand_covered_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToOperand_target_operand
												__flowToOperand_target_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_operand_operand
												__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_coveredBy_operand
												__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_fragment_messageReceive
												__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_coveredBy_combo
												__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_covered_line
												__combo_covered_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCase_flows_flow
												__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToOperand_source_flow
												__flowToOperand_source_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_receiveEvent_messageReceive
												__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_message_message
												__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_target_line
												__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __message_interaction_interaction
												__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_message_message
												__interaction_message_message = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor
														.setName("actors");
												// assign attribute __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor
														.setName("actors");
												// assign attribute __sysLine_coveredBy_messageSend
												__sysLine_coveredBy_messageSend
														.setName("coveredBy");
												// assign attribute __messageSend_covered_sysLine
												__messageSend_covered_sysLine
														.setName("covered");
												// assign attribute __sysLine_coveredBy_operand
												__sysLine_coveredBy_operand
														.setName("coveredBy");
												// assign attribute __operand_covered_sysLine
												__operand_covered_sysLine
														.setName("covered");
												// assign attribute __sysLine_coveredBy_combo
												__sysLine_coveredBy_combo
														.setName("coveredBy");
												// assign attribute __combo_covered_sysLine
												__combo_covered_sysLine
														.setName("covered");
												// assign attribute __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor
														.setName("source");
												// assign attribute __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine
														.setName("target");
												// assign attribute __combo_operand_operand
												__combo_operand_operand
														.setName("operand");
												// assign attribute __operand_fragment_messageReceive
												__operand_fragment_messageReceive
														.setName("fragment");
												// assign attribute __messageReceive_enclosingOperand_operand
												__messageReceive_enclosingOperand_operand
														.setName("enclosingOperand");
												// assign attribute __flowToOperand_source_flow
												__flowToOperand_source_flow
														.setName("source");
												// assign attribute __flowToOperand_target_operand
												__flowToOperand_target_operand
														.setName("target");
												// assign attribute __line_coveredBy_operand
												__line_coveredBy_operand
														.setName("coveredBy");
												// assign attribute __operand_covered_line
												__operand_covered_line
														.setName("covered");
												// assign attribute __line_coveredBy_combo
												__line_coveredBy_combo
														.setName("coveredBy");
												// assign attribute __combo_covered_line
												__combo_covered_line
														.setName("covered");
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
												__actorToLine_source_actor
														.setTrg(actor);

												// create link
												__packageDeclaration_actors_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

												// create link
												__messageSend_covered_sysLine
														.setTrg(sysLine);

												// create link
												__sysLine_coveredBy_operand
														.setSrc(sysLine);

												// create link
												__sysActorToSysLine_target_sysLine
														.setTrg(sysLine);

												// create link
												__sysLine_coveredBy_combo
														.setSrc(sysLine);

												// create link
												__sysLine_coveredBy_messageSend
														.setSrc(sysLine);

												// create link
												__operand_covered_sysLine
														.setTrg(sysLine);

												// create link
												__combo_covered_sysLine
														.setTrg(sysLine);

												// create link
												__messageSend_message_message
														.setSrc(messageSend);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageSend);

												// create link
												__messageSend_covered_sysLine
														.setSrc(messageSend);

												// create link
												__sysLine_coveredBy_messageSend
														.setTrg(messageSend);

												// create link
												__message_sendEvent_messageSend
														.setTrg(messageSend);

												// create link
												__sysActorToSysLine_target_sysLine
														.setSrc(sysActorToSysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysActorToSysLine);

												// create link
												__sysActorToSysLine_source_sysActor
														.setSrc(sysActorToSysLine);

												// create link
												__messageReceive_enclosingOperand_operand
														.setTrg(operand);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(operand);

												// create link
												__operand_covered_sysLine
														.setSrc(operand);

												// create link
												__operand_covered_line
														.setSrc(operand);

												// create link
												__flowToOperand_target_operand
														.setTrg(operand);

												// create link
												__combo_operand_operand
														.setTrg(operand);

												// create link
												__line_coveredBy_operand
														.setTrg(operand);

												// create link
												__sysLine_coveredBy_operand
														.setTrg(operand);

												// create link
												__operand_fragment_messageReceive
														.setSrc(operand);

												// create link
												__combo_operand_operand
														.setSrc(combo);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(combo);

												// create link
												__combo_covered_sysLine
														.setSrc(combo);

												// create link
												__sysLine_coveredBy_combo
														.setTrg(combo);

												// create link
												__line_coveredBy_combo
														.setTrg(combo);

												// create link
												__combo_covered_line
														.setSrc(combo);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												__flowToOperand_source_flow
														.setTrg(flow);

												// create link
												__flowToOperand_source_flow
														.setSrc(flowToOperand);

												// create link
												__flowToOperand_target_operand
														.setSrc(flowToOperand);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flowToOperand);

												// create link
												__operand_fragment_messageReceive
														.setTrg(messageReceive);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageReceive);

												// create link
												__message_receiveEvent_messageReceive
														.setTrg(messageReceive);

												// create link
												__messageReceive_message_message
														.setSrc(messageReceive);

												// create link
												__messageReceive_enclosingOperand_operand
														.setSrc(messageReceive);

												// create link
												__operand_covered_line
														.setTrg(line);

												// create link
												__line_coveredBy_operand
														.setSrc(line);

												// create link
												__line_interaction_interaction
														.setSrc(line);

												// create link
												__combo_covered_line
														.setTrg(line);

												// create link
												__line_coveredBy_combo
														.setSrc(line);

												// create link
												__actorToLine_target_line
														.setTrg(line);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(line);

												// create link
												__interaction_lifeline_line
														.setTrg(line);

												// create link
												__useCaseToInteraction_source_useCase
														.setTrg(useCase);

												// create link
												__useCase_flows_flow
														.setSrc(useCase);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCase);

												// create link
												__useCaseToInteraction_target_interaction
														.setSrc(useCaseToInteraction);

												// create link
												__useCaseToInteraction_source_useCase
														.setSrc(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												__message_receiveEvent_messageReceive
														.setSrc(message);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(message);

												// create link
												__messageSend_message_message
														.setTrg(message);

												// create link
												__message_sendEvent_messageSend
														.setSrc(message);

												// create link
												__message_interaction_interaction
														.setSrc(message);

												// create link
												__interaction_message_message
														.setTrg(message);

												// create link
												__messageReceive_message_message
														.setTrg(message);

												// create link
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__line_interaction_interaction
														.setTrg(interaction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(interaction);

												// create link
												__interaction_lifeline_line
														.setSrc(interaction);

												// create link
												__message_interaction_interaction
														.setTrg(interaction);

												// create link
												__interaction_message_message
														.setSrc(interaction);

												// create link
												__actorToLine_source_actor
														.setSrc(actorToLine);

												// create link
												__actorToLine_target_line
														.setSrc(actorToLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actorToLine);

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__sysLine_coveredBy_operand,
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
																__combo_operand_operand,
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
																__line_coveredBy_operand,
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
																__combo_covered_line,
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
																__operand_fragment_messageReceive,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__operand_covered_sysLine,
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
																__message_sendEvent_messageSend,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__line_coveredBy_combo,
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
																__interaction_message_message,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__operand_covered_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__flowToOperand_target_operand,
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
																__flowToOperand_source_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__combo_covered_sysLine,
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
																__sysLine_coveredBy_combo,
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
																__line_interaction_interaction,
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
																__actorToLine_source_actor,
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
																__actorToLine_target_line,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__messageReceive_enclosingOperand_operand,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_BWD(
																	isApplicableMatch,
																	packageDeclaration,
																	sysActor,
																	actor,
																	sysLine,
																	messageSend,
																	sysActorToSysLine,
																	operand,
																	combo,
																	flow,
																	flowToOperand,
																	messageReceive,
																	line,
																	useCase,
																	useCaseToInteraction,
																	message,
																	interaction,
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
																.setRuleName("UserStepNfToMessageRule");
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
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("operand", operand);
		match.registerObject("combo", combo);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
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
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Message message, Interaction interaction,
			ActorToLifeline actorToLine) {
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
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject useCase, EObject useCaseToInteraction, EObject step,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject actorToLine) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_391(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_597511 = null;
		InteractionOperand __DEC_messageReceive_fragment_330701 = null;
		Interaction __DEC_messageSend_enclosingInteraction_641569 = null;
		InteractionOperand __DEC_messageSend_fragment_6557 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_263646 = null;
		Message __DEC_messageReceive_receiveEvent_263646 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_545809 = null;
		Message __DEC_messageSend_receiveEvent_545809 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_377254 = null;
		Message __DEC_messageReceive_sendEvent_377254 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945373 = null;
		Message __DEC_messageSend_sendEvent_945373 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_482890 = null;
		MessageEnd __DEC_message_message_482890 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
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

			// check link coveredBy from messageSend to sysLine
			JavaSDM.ensure(messageSend.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from sysLine to operand
			fujaba__Success = false;

			fujaba__IterSysLineToOperand = new ArrayList(sysLine.getCoveredBy())
					.iterator();

			while (fujaba__IterSysLineToOperand.hasNext()) {
				try {
					_TmpObject = fujaba__IterSysLineToOperand.next();

					// ensure correct type and really bound of object operand
					JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
					operand = (InteractionOperand) _TmpObject;
					// check link fragment from messageReceive to operand
					JavaSDM.ensure(operand.equals(messageReceive
							.getEnclosingOperand()));

					// bind object
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link coveredBy from combo to sysLine
					JavaSDM.ensure(combo.getCovered().contains(sysLine));

					// iterate to-many link coveredBy from operand to line
					fujaba__Success = false;

					fujaba__IterOperandToLine = new ArrayList(
							operand.getCovered()).iterator();

					while (fujaba__IterOperandToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterOperandToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_597511 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_597511 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_597511 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_597511 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_597511
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
									__DEC_messageReceive_fragment_330701 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_330701 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_330701 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_330701 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_330701
											.equals(operand));

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
									__DEC_messageSend_enclosingInteraction_641569 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_641569 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_641569 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_641569 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_641569
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
									__DEC_messageSend_fragment_6557 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_6557 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_6557 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_6557 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_6557
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_263646
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_263646 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_263646
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_263646 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_263646
													.next();

											// check object __DEC_messageReceive_receiveEvent_263646 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_263646 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_263646 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_263646
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_545809
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_545809 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_545809
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_545809 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_545809
													.next();

											// check object __DEC_messageSend_receiveEvent_545809 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_545809 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_545809 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_545809
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_377254
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_377254 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_377254
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_377254 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_377254
													.next();

											// check object __DEC_messageReceive_sendEvent_377254 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_377254 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_377254 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_377254
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_945373
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945373 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945373
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_945373 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945373
													.next();

											// check object __DEC_messageSend_sendEvent_945373 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_945373 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_945373 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_945373
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_482890
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_482890 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_482890
													.hasNext()) {
										try {
											__DEC_message_message_482890 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_482890
													.next();

											// check object __DEC_message_message_482890 is really bound
											JavaSDM.ensure(__DEC_message_message_482890 != null);
											// check isomorphic binding between objects __DEC_message_message_482890 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_482890
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_482890 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_482890
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
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
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
								// check object operand is really bound
								JavaSDM.ensure(operand != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_coveredBy to sysLine
								JavaSDM.ensure(sysLine.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_coveredBy.getTrg()));

								// check link coveredBy from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link coveredBy from line to operand
								JavaSDM.ensure(line.getCoveredBy().contains(
										operand));

								// check link coveredBy from combo to sysLine
								JavaSDM.ensure(combo.getCovered().contains(
										sysLine));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// check link coveredBy from operand to sysLine
								JavaSDM.ensure(operand.getCovered().contains(
										sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, operand, combo,
										messageReceive, line, message,
										interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_392(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_279291 = null;
		InteractionOperand __DEC_messageReceive_fragment_265659 = null;
		Interaction __DEC_messageSend_enclosingInteraction_1908 = null;
		InteractionOperand __DEC_messageSend_fragment_754133 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829172 = null;
		Message __DEC_messageReceive_receiveEvent_829172 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_748952 = null;
		Message __DEC_messageSend_receiveEvent_748952 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_985332 = null;
		Message __DEC_messageReceive_sendEvent_985332 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_607560 = null;
		Message __DEC_messageSend_sendEvent_607560 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_870843 = null;
		MessageEnd __DEC_message_message_870843 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
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

			// check link coveredBy from messageSend to sysLine
			JavaSDM.ensure(messageSend.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from sysLine to operand
			fujaba__Success = false;

			fujaba__IterSysLineToOperand = new ArrayList(sysLine.getCoveredBy())
					.iterator();

			while (fujaba__IterSysLineToOperand.hasNext()) {
				try {
					_TmpObject = fujaba__IterSysLineToOperand.next();

					// ensure correct type and really bound of object operand
					JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
					operand = (InteractionOperand) _TmpObject;
					// check link fragment from messageReceive to operand
					JavaSDM.ensure(operand.equals(messageReceive
							.getEnclosingOperand()));

					// bind object
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link coveredBy from combo to sysLine
					JavaSDM.ensure(combo.getCovered().contains(sysLine));

					// iterate to-many link coveredBy from operand to line
					fujaba__Success = false;

					fujaba__IterOperandToLine = new ArrayList(
							operand.getCovered()).iterator();

					while (fujaba__IterOperandToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterOperandToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

							// iterate to-many link src from sysLine to _edge_coveredBy
							fujaba__Success = false;

							fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(sysLine,
													EMoflonEdge.class, "src"))
									.iterator();

							while (fujaba__IterSysLineTo_edge_coveredBy
									.hasNext()) {
								try {
									_edge_coveredBy = (EMoflonEdge) fujaba__IterSysLineTo_edge_coveredBy
											.next();

									// check object _edge_coveredBy is really bound
									JavaSDM.ensure(_edge_coveredBy != null);
									// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
									JavaSDM.ensure(!_edge_coveredBy
											.equals(_edge_covered));

									// check link trg from _edge_coveredBy to messageSend
									JavaSDM.ensure(messageSend
											.equals(_edge_coveredBy.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_279291 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_279291 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_279291 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_279291 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_279291
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
											__DEC_messageReceive_fragment_265659 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_265659 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_265659 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_265659 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_265659
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_1908 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_1908 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_1908 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_1908 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_1908
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
											__DEC_messageSend_fragment_754133 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_754133 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_754133 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_754133 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_754133
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_829172
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829172 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829172
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_829172 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_829172
															.next();

													// check object __DEC_messageReceive_receiveEvent_829172 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_829172 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_829172 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_829172
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_748952
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_748952 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_748952
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_748952 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_748952
															.next();

													// check object __DEC_messageSend_receiveEvent_748952 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_748952 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_748952 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_748952
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_985332
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_985332 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_985332
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_985332 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_985332
															.next();

													// check object __DEC_messageReceive_sendEvent_985332 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_985332 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_985332 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_985332
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_607560
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_607560 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_607560
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_607560 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_607560
															.next();

													// check object __DEC_messageSend_sendEvent_607560 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_607560 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_607560 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_607560
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_870843
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_870843 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_870843
															.hasNext()) {
												try {
													__DEC_message_message_870843 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_870843
															.next();

													// check object __DEC_message_message_870843 is really bound
													JavaSDM.ensure(__DEC_message_message_870843 != null);
													// check isomorphic binding between objects __DEC_message_message_870843 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_870843
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_870843 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_870843
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
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

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_covered to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_covered.getSrc()));

										// check link src from _edge_coveredBy to sysLine
										JavaSDM.ensure(sysLine
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_covered to sysLine
										JavaSDM.ensure(sysLine
												.equals(_edge_covered.getTrg()));

										// check link trg from _edge_coveredBy to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_393(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_394791 = null;
		InteractionOperand __DEC_messageReceive_fragment_369424 = null;
		Interaction __DEC_messageSend_enclosingInteraction_163657 = null;
		InteractionOperand __DEC_messageSend_fragment_226209 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377878 = null;
		Message __DEC_messageReceive_receiveEvent_377878 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_373340 = null;
		Message __DEC_messageSend_receiveEvent_373340 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_625000 = null;
		Message __DEC_messageReceive_sendEvent_625000 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972023 = null;
		Message __DEC_messageSend_sendEvent_972023 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_879493 = null;
		MessageEnd __DEC_message_message_879493 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// check link coveredBy from operand to sysLine
			JavaSDM.ensure(operand.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from sysLine to messageSend
			fujaba__Success = false;

			fujaba__IterSysLineToMessageSend = new ArrayList(
					sysLine.getCoveredBy()).iterator();

			while (fujaba__IterSysLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterSysLineToMessageSend.next();

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

					// check link fragment from messageReceive to operand
					JavaSDM.ensure(operand.equals(messageReceive
							.getEnclosingOperand()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// bind object
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link coveredBy from combo to sysLine
					JavaSDM.ensure(combo.getCovered().contains(sysLine));

					// iterate to-many link coveredBy from operand to line
					fujaba__Success = false;

					fujaba__IterOperandToLine = new ArrayList(
							operand.getCovered()).iterator();

					while (fujaba__IterOperandToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterOperandToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_394791 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_394791 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_394791 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_394791 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_394791
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
									__DEC_messageReceive_fragment_369424 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_369424 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_369424 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_369424 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_369424
											.equals(operand));

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
									__DEC_messageSend_enclosingInteraction_163657 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_163657 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_163657 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_163657 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_163657
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
									__DEC_messageSend_fragment_226209 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_226209 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_226209 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_226209 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_226209
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_377878
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377878 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377878
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_377878 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_377878
													.next();

											// check object __DEC_messageReceive_receiveEvent_377878 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_377878 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_377878 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_377878
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_373340
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_373340 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_373340
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_373340 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_373340
													.next();

											// check object __DEC_messageSend_receiveEvent_373340 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_373340 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_373340 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_373340
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_625000
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_625000 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_625000
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_625000 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_625000
													.next();

											// check object __DEC_messageReceive_sendEvent_625000 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_625000 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_625000 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_625000
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_972023
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972023 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972023
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_972023 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972023
													.next();

											// check object __DEC_messageSend_sendEvent_972023 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_972023 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_972023 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_972023
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_879493
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_879493 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_879493
													.hasNext()) {
										try {
											__DEC_message_message_879493 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_879493
													.next();

											// check object __DEC_message_message_879493 is really bound
											JavaSDM.ensure(__DEC_message_message_879493 != null);
											// check isomorphic binding between objects __DEC_message_message_879493 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_879493
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_879493 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_879493
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
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
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
								// check object operand is really bound
								JavaSDM.ensure(operand != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_coveredBy to sysLine
								JavaSDM.ensure(sysLine.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to operand
								JavaSDM.ensure(operand.equals(_edge_coveredBy
										.getTrg()));

								// check link coveredBy from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link coveredBy from line to operand
								JavaSDM.ensure(line.getCoveredBy().contains(
										operand));

								// check link coveredBy from combo to sysLine
								JavaSDM.ensure(combo.getCovered().contains(
										sysLine));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// check link coveredBy from operand to sysLine
								JavaSDM.ensure(operand.getCovered().contains(
										sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, operand, combo,
										messageReceive, line, message,
										interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_394(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_398101 = null;
		InteractionOperand __DEC_messageReceive_fragment_554975 = null;
		Interaction __DEC_messageSend_enclosingInteraction_173941 = null;
		InteractionOperand __DEC_messageSend_fragment_453083 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_291061 = null;
		Message __DEC_messageReceive_receiveEvent_291061 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_640910 = null;
		Message __DEC_messageSend_receiveEvent_640910 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_795280 = null;
		Message __DEC_messageReceive_sendEvent_795280 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_517323 = null;
		Message __DEC_messageSend_sendEvent_517323 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_304972 = null;
		MessageEnd __DEC_message_message_304972 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Lifeline sysLine = null;
		InteractionOperand operand = null;

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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;

			// check link coveredBy from operand to sysLine
			JavaSDM.ensure(operand.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from sysLine to combo
			fujaba__Success = false;

			fujaba__IterSysLineToCombo = new ArrayList(sysLine.getCoveredBy())
					.iterator();

			while (fujaba__IterSysLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterSysLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// check link operand from operand to combo
					JavaSDM.ensure(combo.equals(operand.eContainer()));

					// iterate to-many link coveredBy from combo to line
					fujaba__Success = false;

					fujaba__IterComboToLine = new ArrayList(combo.getCovered())
							.iterator();

					while (fujaba__IterComboToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterComboToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link coveredBy from line to operand
							JavaSDM.ensure(line.getCoveredBy()
									.contains(operand));

							// iterate to-many link coveredBy from sysLine to messageSend
							fujaba__Success = false;

							fujaba__IterSysLineToMessageSend = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToMessageSend.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToMessageSend
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

									// check link fragment from messageReceive to operand
									JavaSDM.ensure(operand
											.equals(messageReceive
													.getEnclosingOperand()));

									// check link message from messageReceive to message
									JavaSDM.ensure(message
											.equals(messageReceive.getMessage()));

									// check link sendEvent from message to messageSend
									JavaSDM.ensure(messageSend.equals(message
											.getSendEvent()));

									// iterate to-many link src from sysLine to _edge_coveredBy
									fujaba__Success = false;

									fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															sysLine,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterSysLineTo_edge_coveredBy
											.hasNext()) {
										try {
											_edge_coveredBy = (EMoflonEdge) fujaba__IterSysLineTo_edge_coveredBy
													.next();

											// check object _edge_coveredBy is really bound
											JavaSDM.ensure(_edge_coveredBy != null);
											// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
											JavaSDM.ensure(!_edge_coveredBy
													.equals(_edge_covered));

											// check link trg from _edge_coveredBy to operand
											JavaSDM.ensure(operand
													.equals(_edge_coveredBy
															.getTrg()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_398101 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_398101 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_398101 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_398101 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_398101
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
													__DEC_messageReceive_fragment_554975 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_554975 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_554975 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_554975 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_554975
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_173941 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_173941 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_173941 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_173941 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_173941
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
													__DEC_messageSend_fragment_453083 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_453083 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_453083 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_453083 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_453083
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_291061
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_291061 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_291061
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_291061 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_291061
																	.next();

															// check object __DEC_messageReceive_receiveEvent_291061 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_291061 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_291061 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_291061
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_640910
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_640910 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_640910
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_640910 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_640910
																	.next();

															// check object __DEC_messageSend_receiveEvent_640910 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_640910 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_640910 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_640910
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_795280
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_795280 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_795280
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_795280 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_795280
																	.next();

															// check object __DEC_messageReceive_sendEvent_795280 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_795280 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_795280 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_795280
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_517323
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_517323 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_517323
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_517323 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_517323
																	.next();

															// check object __DEC_messageSend_sendEvent_517323 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_517323 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_517323 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_517323
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_304972
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_304972 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_304972
																	.hasNext()) {
														try {
															__DEC_message_message_304972 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_304972
																	.next();

															// check object __DEC_message_message_304972 is really bound
															JavaSDM.ensure(__DEC_message_message_304972 != null);
															// check isomorphic binding between objects __DEC_message_message_304972 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_304972
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_304972 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_304972
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_covered to operand
												JavaSDM.ensure(operand
														.equals(_edge_covered
																.getSrc()));

												// check link src from _edge_coveredBy to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_covered to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_covered
																.getTrg()));

												// check link trg from _edge_coveredBy to operand
												JavaSDM.ensure(operand
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_395(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_591957 = null;
		InteractionOperand __DEC_messageReceive_fragment_226751 = null;
		Interaction __DEC_messageSend_enclosingInteraction_376956 = null;
		InteractionOperand __DEC_messageSend_fragment_368217 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_877676 = null;
		Message __DEC_messageReceive_receiveEvent_877676 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_851808 = null;
		Message __DEC_messageSend_receiveEvent_851808 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_761496 = null;
		Message __DEC_messageReceive_sendEvent_761496 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_831458 = null;
		Message __DEC_messageSend_sendEvent_831458 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_842383 = null;
		MessageEnd __DEC_message_message_842383 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		CombinedFragment combo = null;
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

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// check link coveredBy from combo to sysLine
			JavaSDM.ensure(combo.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from sysLine to messageSend
			fujaba__Success = false;

			fujaba__IterSysLineToMessageSend = new ArrayList(
					sysLine.getCoveredBy()).iterator();

			while (fujaba__IterSysLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterSysLineToMessageSend.next();

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

					// iterate to-many link coveredBy from sysLine to operand
					fujaba__Success = false;

					fujaba__IterSysLineToOperand = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// iterate to-many link coveredBy from operand to line
							fujaba__Success = false;

							fujaba__IterOperandToLine = new ArrayList(
									operand.getCovered()).iterator();

							while (fujaba__IterOperandToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterOperandToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// bind object
									interaction = line.getInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_591957 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_591957 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_591957 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_591957 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_591957
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
											__DEC_messageReceive_fragment_226751 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_226751 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_226751 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_226751 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_226751
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_376956 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_376956 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_376956 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_376956 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_376956
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
											__DEC_messageSend_fragment_368217 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_368217 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_368217 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_368217 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_368217
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_877676
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_877676 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_877676
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_877676 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_877676
															.next();

													// check object __DEC_messageReceive_receiveEvent_877676 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_877676 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_877676 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_877676
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_851808
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_851808 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_851808
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_851808 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_851808
															.next();

													// check object __DEC_messageSend_receiveEvent_851808 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_851808 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_851808 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_851808
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_761496
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_761496 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_761496
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_761496 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_761496
															.next();

													// check object __DEC_messageReceive_sendEvent_761496 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_761496 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_761496 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_761496
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_831458
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_831458 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_831458
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_831458 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_831458
															.next();

													// check object __DEC_messageSend_sendEvent_831458 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_831458 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_831458 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_831458
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_842383
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_842383 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_842383
															.hasNext()) {
												try {
													__DEC_message_message_842383 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_842383
															.next();

													// check object __DEC_message_message_842383 is really bound
													JavaSDM.ensure(__DEC_message_message_842383 != null);
													// check isomorphic binding between objects __DEC_message_message_842383 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_842383
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_842383 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_842383
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_coveredBy to sysLine
										JavaSDM.ensure(sysLine
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_coveredBy to combo
										JavaSDM.ensure(combo
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_396(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_452622 = null;
		InteractionOperand __DEC_messageReceive_fragment_920141 = null;
		Interaction __DEC_messageSend_enclosingInteraction_520530 = null;
		InteractionOperand __DEC_messageSend_fragment_903561 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_133323 = null;
		Message __DEC_messageReceive_receiveEvent_133323 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_813394 = null;
		Message __DEC_messageSend_receiveEvent_813394 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_300584 = null;
		Message __DEC_messageReceive_sendEvent_300584 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_377785 = null;
		Message __DEC_messageSend_sendEvent_377785 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_897101 = null;
		MessageEnd __DEC_message_message_897101 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;

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

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;

			// check link coveredBy from combo to sysLine
			JavaSDM.ensure(combo.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from combo to line
			fujaba__Success = false;

			fujaba__IterComboToLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterComboToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// iterate to-many link coveredBy from sysLine to messageSend
					fujaba__Success = false;

					fujaba__IterSysLineToMessageSend = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToMessageSend
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

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// iterate to-many link coveredBy from sysLine to operand
							fujaba__Success = false;

							fujaba__IterSysLineToOperand = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// check link fragment from messageReceive to operand
									JavaSDM.ensure(operand
											.equals(messageReceive
													.getEnclosingOperand()));

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link src from sysLine to _edge_coveredBy
									fujaba__Success = false;

									fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															sysLine,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterSysLineTo_edge_coveredBy
											.hasNext()) {
										try {
											_edge_coveredBy = (EMoflonEdge) fujaba__IterSysLineTo_edge_coveredBy
													.next();

											// check object _edge_coveredBy is really bound
											JavaSDM.ensure(_edge_coveredBy != null);
											// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
											JavaSDM.ensure(!_edge_coveredBy
													.equals(_edge_covered));

											// check link trg from _edge_coveredBy to combo
											JavaSDM.ensure(combo
													.equals(_edge_coveredBy
															.getTrg()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_452622 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_452622 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_452622 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_452622 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_452622
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
													__DEC_messageReceive_fragment_920141 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_920141 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_920141 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_920141 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_920141
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_520530 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_520530 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_520530 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_520530 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_520530
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
													__DEC_messageSend_fragment_903561 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_903561 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_903561 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_903561 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_903561
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_133323
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_133323 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_133323
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_133323 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_133323
																	.next();

															// check object __DEC_messageReceive_receiveEvent_133323 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_133323 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_133323 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_133323
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_813394
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_813394 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_813394
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_813394 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_813394
																	.next();

															// check object __DEC_messageSend_receiveEvent_813394 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_813394 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_813394 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_813394
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_300584
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_300584 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_300584
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_300584 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_300584
																	.next();

															// check object __DEC_messageReceive_sendEvent_300584 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_300584 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_300584 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_300584
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_377785
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_377785 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_377785
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_377785 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_377785
																	.next();

															// check object __DEC_messageSend_sendEvent_377785 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_377785 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_377785 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_377785
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_897101
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_897101 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_897101
																	.hasNext()) {
														try {
															__DEC_message_message_897101 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_897101
																	.next();

															// check object __DEC_message_message_897101 is really bound
															JavaSDM.ensure(__DEC_message_message_897101 != null);
															// check isomorphic binding between objects __DEC_message_message_897101 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_897101
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_897101 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_897101
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_covered to combo
												JavaSDM.ensure(combo
														.equals(_edge_covered
																.getSrc()));

												// check link src from _edge_coveredBy to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_covered to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_covered
																.getTrg()));

												// check link trg from _edge_coveredBy to combo
												JavaSDM.ensure(combo
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_397(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_164624 = null;
		InteractionOperand __DEC_messageReceive_fragment_24695 = null;
		Interaction __DEC_messageSend_enclosingInteraction_791149 = null;
		InteractionOperand __DEC_messageSend_fragment_247409 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_869825 = null;
		Message __DEC_messageReceive_receiveEvent_869825 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_758284 = null;
		Message __DEC_messageSend_receiveEvent_758284 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_747522 = null;
		Message __DEC_messageReceive_sendEvent_747522 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425023 = null;
		Message __DEC_messageSend_sendEvent_425023 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_129961 = null;
		MessageEnd __DEC_message_message_129961 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;

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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// iterate to-many link coveredBy from operand to line
			fujaba__Success = false;

			fujaba__IterOperandToLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link coveredBy from line to combo
					JavaSDM.ensure(line.getCoveredBy().contains(combo));

					// iterate to-many link coveredBy from operand to sysLine
					fujaba__Success = false;

					fujaba__IterOperandToSysLine = new ArrayList(
							operand.getCovered()).iterator();

					while (fujaba__IterOperandToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterOperandToSysLine
									.next();

							// check object sysLine is really bound
							JavaSDM.ensure(sysLine != null);
							// check isomorphic binding between objects sysLine and line 
							JavaSDM.ensure(!sysLine.equals(line));

							// check link coveredBy from combo to sysLine
							JavaSDM.ensure(combo.getCovered().contains(sysLine));

							// iterate to-many link coveredBy from sysLine to messageSend
							fujaba__Success = false;

							fujaba__IterSysLineToMessageSend = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToMessageSend.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToMessageSend
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

									// check link fragment from messageReceive to operand
									JavaSDM.ensure(operand
											.equals(messageReceive
													.getEnclosingOperand()));

									// check link message from messageReceive to message
									JavaSDM.ensure(message
											.equals(messageReceive.getMessage()));

									// check link sendEvent from message to messageSend
									JavaSDM.ensure(messageSend.equals(message
											.getSendEvent()));

									// check link trg from _edge_fragment to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_fragment.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_164624 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_164624 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_164624 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_164624 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_164624
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
											__DEC_messageReceive_fragment_24695 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_24695 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_24695 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_24695 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_24695
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_791149 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_791149 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_791149 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_791149 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_791149
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
											__DEC_messageSend_fragment_247409 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_247409 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_247409 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_247409 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_247409
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_869825
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_869825 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_869825
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_869825 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_869825
															.next();

													// check object __DEC_messageReceive_receiveEvent_869825 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_869825 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_869825 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_869825
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_758284
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_758284 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_758284
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_758284 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_758284
															.next();

													// check object __DEC_messageSend_receiveEvent_758284 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_758284 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_758284 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_758284
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_747522
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_747522 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_747522
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_747522 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_747522
															.next();

													// check object __DEC_messageReceive_sendEvent_747522 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_747522 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_747522 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_747522
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_425023
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425023 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425023
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_425023 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_425023
															.next();

													// check object __DEC_messageSend_sendEvent_425023 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_425023 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_425023 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_425023
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_129961
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_129961 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_129961
															.hasNext()) {
												try {
													__DEC_message_message_129961 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_129961
															.next();

													// check object __DEC_message_message_129961 is really bound
													JavaSDM.ensure(__DEC_message_message_129961 != null);
													// check isomorphic binding between objects __DEC_message_message_129961 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_129961
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_129961 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_129961
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

										// check object _edge_fragment is really bound
										JavaSDM.ensure(_edge_fragment != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_fragment to operand
										JavaSDM.ensure(operand
												.equals(_edge_fragment.getSrc()));

										// check link trg from _edge_fragment to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_fragment.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_398(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_283383 = null;
		InteractionOperand __DEC_messageReceive_fragment_60133 = null;
		Interaction __DEC_messageSend_enclosingInteraction_170073 = null;
		InteractionOperand __DEC_messageSend_fragment_344939 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_362632 = null;
		Message __DEC_messageReceive_receiveEvent_362632 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_908958 = null;
		Message __DEC_messageSend_receiveEvent_908958 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_458780 = null;
		Message __DEC_messageReceive_sendEvent_458780 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_809742 = null;
		Message __DEC_messageSend_sendEvent_809742 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_24366 = null;
		MessageEnd __DEC_message_message_24366 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterOperandTo_edge_fragment = null;
		EMoflonEdge _edge_fragment = null;
		InteractionOperand operand = null;

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

			// check object _edge_enclosingOperand is really bound
			JavaSDM.ensure(_edge_enclosingOperand != null);
			// bind object
			_TmpObject = _edge_enclosingOperand.getTrg();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// iterate to-many link src from operand to _edge_fragment
			fujaba__Success = false;

			fujaba__IterOperandTo_edge_fragment = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							operand, EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterOperandTo_edge_fragment.hasNext()) {
				try {
					_edge_fragment = (EMoflonEdge) fujaba__IterOperandTo_edge_fragment
							.next();

					// check object _edge_fragment is really bound
					JavaSDM.ensure(_edge_fragment != null);
					// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
					JavaSDM.ensure(!_edge_fragment
							.equals(_edge_enclosingOperand));

					// iterate to-many link coveredBy from operand to line
					fujaba__Success = false;

					fujaba__IterOperandToLine = new ArrayList(
							operand.getCovered()).iterator();

					while (fujaba__IterOperandToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterOperandToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// bind object
							combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object combo is really bound
							JavaSDM.ensure(combo != null);

							// check if contained via correct reference
							JavaSDM.ensure(combo.getOperand().contains(operand));

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

							// iterate to-many link coveredBy from operand to sysLine
							fujaba__Success = false;

							fujaba__IterOperandToSysLine = new ArrayList(
									operand.getCovered()).iterator();

							while (fujaba__IterOperandToSysLine.hasNext()) {
								try {
									sysLine = (Lifeline) fujaba__IterOperandToSysLine
											.next();

									// check object sysLine is really bound
									JavaSDM.ensure(sysLine != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link coveredBy from combo to sysLine
									JavaSDM.ensure(combo.getCovered().contains(
											sysLine));

									// iterate to-many link coveredBy from sysLine to messageSend
									fujaba__Success = false;

									fujaba__IterSysLineToMessageSend = new ArrayList(
											sysLine.getCoveredBy()).iterator();

									while (fujaba__IterSysLineToMessageSend
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterSysLineToMessageSend
													.next();

											// ensure correct type and really bound of object messageSend
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageSend = (MessageOccurrenceSpecification) _TmpObject;
											// bind object
											message = messageSend.getMessage();

											// check object message is really bound
											JavaSDM.ensure(message != null);

											// check link message from message to interaction
											JavaSDM.ensure(interaction
													.equals(message
															.getInteraction()));

											// bind object
											_TmpObject = message
													.getReceiveEvent();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;

											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// check link fragment from messageReceive to operand
											JavaSDM.ensure(operand.equals(messageReceive
													.getEnclosingOperand()));

											// check link message from messageReceive to message
											JavaSDM.ensure(message
													.equals(messageReceive
															.getMessage()));

											// check link sendEvent from message to messageSend
											JavaSDM.ensure(messageSend
													.equals(message
															.getSendEvent()));

											// check link src from _edge_enclosingOperand to messageReceive
											JavaSDM.ensure(messageReceive
													.equals(_edge_enclosingOperand
															.getSrc()));

											// check link trg from _edge_fragment to messageReceive
											JavaSDM.ensure(messageReceive
													.equals(_edge_fragment
															.getTrg()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_283383 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_283383 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_283383 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_283383 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_283383
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
													__DEC_messageReceive_fragment_60133 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_60133 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_60133 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_60133 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_60133
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_170073 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_170073 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_170073 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_170073 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_170073
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
													__DEC_messageSend_fragment_344939 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_344939 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_344939 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_344939 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_344939
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_362632
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_362632 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_362632
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_362632 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_362632
																	.next();

															// check object __DEC_messageReceive_receiveEvent_362632 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_362632 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_362632 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_362632
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_908958
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_908958 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_908958
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_908958 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_908958
																	.next();

															// check object __DEC_messageSend_receiveEvent_908958 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_908958 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_908958 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_908958
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_458780
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_458780 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_458780
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_458780 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_458780
																	.next();

															// check object __DEC_messageReceive_sendEvent_458780 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_458780 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_458780 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_458780
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_809742
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_809742 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_809742
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_809742 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_809742
																	.next();

															// check object __DEC_messageSend_sendEvent_809742 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_809742 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_809742 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_809742
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_24366
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_24366 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_24366
																	.hasNext()) {
														try {
															__DEC_message_message_24366 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_24366
																	.next();

															// check object __DEC_message_message_24366 is really bound
															JavaSDM.ensure(__DEC_message_message_24366 != null);
															// check isomorphic binding between objects __DEC_message_message_24366 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_24366
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_24366 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_24366
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

												// check object _edge_enclosingOperand is really bound
												JavaSDM.ensure(_edge_enclosingOperand != null);
												// check object _edge_fragment is really bound
												JavaSDM.ensure(_edge_fragment != null);
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
												JavaSDM.ensure(!_edge_fragment
														.equals(_edge_enclosingOperand));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_enclosingOperand to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_enclosingOperand
																.getSrc()));

												// check link src from _edge_fragment to operand
												JavaSDM.ensure(operand
														.equals(_edge_fragment
																.getSrc()));

												// check link trg from _edge_enclosingOperand to operand
												JavaSDM.ensure(operand
														.equals(_edge_enclosingOperand
																.getTrg()));

												// check link trg from _edge_fragment to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_fragment
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_399(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_967623 = null;
		InteractionOperand __DEC_messageReceive_fragment_212879 = null;
		Interaction __DEC_messageSend_enclosingInteraction_225182 = null;
		InteractionOperand __DEC_messageSend_fragment_709333 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775937 = null;
		Message __DEC_messageReceive_receiveEvent_775937 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_866619 = null;
		Message __DEC_messageSend_receiveEvent_866619 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_663428 = null;
		Message __DEC_messageReceive_sendEvent_663428 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_574491 = null;
		Message __DEC_messageSend_sendEvent_574491 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_886905 = null;
		MessageEnd __DEC_message_message_886905 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// check link coveredBy from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// check link coveredBy from line to operand
			JavaSDM.ensure(line.getCoveredBy().contains(operand));

			// iterate to-many link coveredBy from operand to sysLine
			fujaba__Success = false;

			fujaba__IterOperandToSysLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterOperandToSysLine.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// check link coveredBy from combo to sysLine
					JavaSDM.ensure(combo.getCovered().contains(sysLine));

					// iterate to-many link coveredBy from sysLine to messageSend
					fujaba__Success = false;

					fujaba__IterSysLineToMessageSend = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToMessageSend
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

							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_967623 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_967623 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_967623 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_967623 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_967623
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
									__DEC_messageReceive_fragment_212879 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_212879 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_212879 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_212879 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_212879
											.equals(operand));

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
									__DEC_messageSend_enclosingInteraction_225182 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_225182 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_225182 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_225182 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_225182
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
									__DEC_messageSend_fragment_709333 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_709333 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_709333 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_709333 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_709333
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_775937
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775937 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775937
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_775937 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775937
													.next();

											// check object __DEC_messageReceive_receiveEvent_775937 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_775937 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_775937 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_775937
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_866619
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_866619 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_866619
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_866619 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_866619
													.next();

											// check object __DEC_messageSend_receiveEvent_866619 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_866619 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_866619 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_866619
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_663428
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_663428 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_663428
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_663428 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_663428
													.next();

											// check object __DEC_messageReceive_sendEvent_663428 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_663428 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_663428 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_663428
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_574491
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_574491 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_574491
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_574491 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_574491
													.next();

											// check object __DEC_messageSend_sendEvent_574491 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_574491 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_574491 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_574491
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_886905
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_886905 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_886905
													.hasNext()) {
										try {
											__DEC_message_message_886905 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_886905
													.next();

											// check object __DEC_message_message_886905 is really bound
											JavaSDM.ensure(__DEC_message_message_886905 != null);
											// check isomorphic binding between objects __DEC_message_message_886905 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_886905
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_886905 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_886905
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
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
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
								// check object operand is really bound
								JavaSDM.ensure(operand != null);
								// check object sysLine is really bound
								JavaSDM.ensure(sysLine != null);
								// check isomorphic binding between objects sysLine and line 
								JavaSDM.ensure(!sysLine.equals(line));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to operand
								JavaSDM.ensure(operand.equals(_edge_coveredBy
										.getTrg()));

								// check link coveredBy from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link coveredBy from line to operand
								JavaSDM.ensure(line.getCoveredBy().contains(
										operand));

								// check link coveredBy from combo to sysLine
								JavaSDM.ensure(combo.getCovered().contains(
										sysLine));

								// check link coveredBy from messageSend to sysLine
								JavaSDM.ensure(messageSend.getCovered()
										.contains(sysLine));

								// check link coveredBy from operand to sysLine
								JavaSDM.ensure(operand.getCovered().contains(
										sysLine));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										sysLine, messageSend, operand, combo,
										messageReceive, line, message,
										interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_400(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_408900 = null;
		InteractionOperand __DEC_messageReceive_fragment_918311 = null;
		Interaction __DEC_messageSend_enclosingInteraction_648116 = null;
		InteractionOperand __DEC_messageSend_fragment_62586 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_270164 = null;
		Message __DEC_messageReceive_receiveEvent_270164 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_50755 = null;
		Message __DEC_messageSend_receiveEvent_50755 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367827 = null;
		Message __DEC_messageReceive_sendEvent_367827 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_836274 = null;
		Message __DEC_messageSend_sendEvent_836274 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_961233 = null;
		MessageEnd __DEC_message_message_961233 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
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

			// bind object
			_TmpObject = _edge_covered.getSrc();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// check link coveredBy from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// check link coveredBy from line to operand
			JavaSDM.ensure(line.getCoveredBy().contains(operand));

			// iterate to-many link coveredBy from operand to sysLine
			fujaba__Success = false;

			fujaba__IterOperandToSysLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterOperandToSysLine.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// check link coveredBy from combo to sysLine
					JavaSDM.ensure(combo.getCovered().contains(sysLine));

					// iterate to-many link coveredBy from sysLine to messageSend
					fujaba__Success = false;

					fujaba__IterSysLineToMessageSend = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToMessageSend
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

							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// iterate to-many link trg from operand to _edge_coveredBy
							fujaba__Success = false;

							fujaba__IterOperandTo_edge_coveredBy = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(operand,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterOperandTo_edge_coveredBy
									.hasNext()) {
								try {
									_edge_coveredBy = (EMoflonEdge) fujaba__IterOperandTo_edge_coveredBy
											.next();

									// check object _edge_coveredBy is really bound
									JavaSDM.ensure(_edge_coveredBy != null);
									// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
									JavaSDM.ensure(!_edge_coveredBy
											.equals(_edge_covered));

									// check link src from _edge_coveredBy to line
									JavaSDM.ensure(line.equals(_edge_coveredBy
											.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_408900 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_408900 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_408900 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_408900 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_408900
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
											__DEC_messageReceive_fragment_918311 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_918311 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_918311 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_918311 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_918311
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_648116 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_648116 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_648116 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_648116 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_648116
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
											__DEC_messageSend_fragment_62586 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_62586 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_62586 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_62586 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_62586
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_270164
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_270164 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_270164
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_270164 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_270164
															.next();

													// check object __DEC_messageReceive_receiveEvent_270164 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_270164 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_270164 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_270164
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_50755
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_50755 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_50755
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_50755 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_50755
															.next();

													// check object __DEC_messageSend_receiveEvent_50755 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_50755 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_50755 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_50755
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_367827
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367827 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367827
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_367827 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_367827
															.next();

													// check object __DEC_messageReceive_sendEvent_367827 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_367827 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_367827 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_367827
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_836274
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_836274 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_836274
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_836274 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_836274
															.next();

													// check object __DEC_messageSend_sendEvent_836274 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_836274 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_836274 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_836274
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_961233
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_961233 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_961233
															.hasNext()) {
												try {
													__DEC_message_message_961233 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_961233
															.next();

													// check object __DEC_message_message_961233 is really bound
													JavaSDM.ensure(__DEC_message_message_961233 != null);
													// check isomorphic binding between objects __DEC_message_message_961233 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_961233
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_961233 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_961233
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
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

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_covered to operand
										JavaSDM.ensure(operand
												.equals(_edge_covered.getSrc()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_covered to line
										JavaSDM.ensure(line
												.equals(_edge_covered.getTrg()));

										// check link trg from _edge_coveredBy to operand
										JavaSDM.ensure(operand
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_401(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_833419 = null;
		InteractionOperand __DEC_messageReceive_fragment_48957 = null;
		Interaction __DEC_messageSend_enclosingInteraction_67686 = null;
		InteractionOperand __DEC_messageSend_fragment_717995 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_124894 = null;
		Message __DEC_messageReceive_receiveEvent_124894 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_810109 = null;
		Message __DEC_messageSend_receiveEvent_810109 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_692398 = null;
		Message __DEC_messageReceive_sendEvent_692398 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_954023 = null;
		Message __DEC_messageSend_sendEvent_954023 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_419006 = null;
		MessageEnd __DEC_message_message_419006 = null;
		Match match = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
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

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// check link coveredBy from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// iterate to-many link coveredBy from combo to sysLine
			fujaba__Success = false;

			fujaba__IterComboToSysLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterComboToSysLine.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// iterate to-many link coveredBy from sysLine to messageSend
					fujaba__Success = false;

					fujaba__IterSysLineToMessageSend = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToMessageSend
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

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// iterate to-many link coveredBy from sysLine to operand
							fujaba__Success = false;

							fujaba__IterSysLineToOperand = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// check link fragment from messageReceive to operand
									JavaSDM.ensure(operand
											.equals(messageReceive
													.getEnclosingOperand()));

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_833419 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_833419 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_833419 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_833419 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_833419
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
											__DEC_messageReceive_fragment_48957 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_48957 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_48957 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_48957 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_48957
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_67686 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_67686 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_67686 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_67686 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_67686
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
											__DEC_messageSend_fragment_717995 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_717995 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_717995 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_717995 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_717995
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_124894
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_124894 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_124894
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_124894 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_124894
															.next();

													// check object __DEC_messageReceive_receiveEvent_124894 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_124894 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_124894 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_124894
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_810109
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_810109 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_810109
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_810109 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_810109
															.next();

													// check object __DEC_messageSend_receiveEvent_810109 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_810109 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_810109 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_810109
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_692398
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_692398 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_692398
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_692398 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_692398
															.next();

													// check object __DEC_messageReceive_sendEvent_692398 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_692398 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_692398 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_692398
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_954023
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_954023 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_954023
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_954023 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_954023
															.next();

													// check object __DEC_messageSend_sendEvent_954023 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_954023 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_954023 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_954023
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_419006
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_419006 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_419006
															.hasNext()) {
												try {
													__DEC_message_message_419006 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_419006
															.next();

													// check object __DEC_message_message_419006 is really bound
													JavaSDM.ensure(__DEC_message_message_419006 != null);
													// check isomorphic binding between objects __DEC_message_message_419006 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_419006
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_419006 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_419006
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_coveredBy to combo
										JavaSDM.ensure(combo
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_402(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_111864 = null;
		InteractionOperand __DEC_messageReceive_fragment_346967 = null;
		Interaction __DEC_messageSend_enclosingInteraction_3891 = null;
		InteractionOperand __DEC_messageSend_fragment_96758 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_618006 = null;
		Message __DEC_messageReceive_receiveEvent_618006 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_391794 = null;
		Message __DEC_messageSend_receiveEvent_391794 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_519701 = null;
		Message __DEC_messageReceive_sendEvent_519701 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459118 = null;
		Message __DEC_messageSend_sendEvent_459118 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_468388 = null;
		MessageEnd __DEC_message_message_468388 = null;
		Match match = null;
		Iterator fujaba__IterComboTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
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

			// bind object
			_TmpObject = _edge_covered.getSrc();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// check link coveredBy from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// iterate to-many link coveredBy from combo to sysLine
			fujaba__Success = false;

			fujaba__IterComboToSysLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToSysLine.hasNext()) {
				try {
					sysLine = (Lifeline) fujaba__IterComboToSysLine.next();

					// check object sysLine is really bound
					JavaSDM.ensure(sysLine != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

					// iterate to-many link coveredBy from sysLine to messageSend
					fujaba__Success = false;

					fujaba__IterSysLineToMessageSend = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToMessageSend
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

							// check link message from messageReceive to message
							JavaSDM.ensure(message.equals(messageReceive
									.getMessage()));

							// check link sendEvent from message to messageSend
							JavaSDM.ensure(messageSend.equals(message
									.getSendEvent()));

							// iterate to-many link coveredBy from sysLine to operand
							fujaba__Success = false;

							fujaba__IterSysLineToOperand = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// check link fragment from messageReceive to operand
									JavaSDM.ensure(operand
											.equals(messageReceive
													.getEnclosingOperand()));

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link trg from combo to _edge_coveredBy
									fujaba__Success = false;

									fujaba__IterComboTo_edge_coveredBy = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															combo,
															EMoflonEdge.class,
															"trg")).iterator();

									while (fujaba__IterComboTo_edge_coveredBy
											.hasNext()) {
										try {
											_edge_coveredBy = (EMoflonEdge) fujaba__IterComboTo_edge_coveredBy
													.next();

											// check object _edge_coveredBy is really bound
											JavaSDM.ensure(_edge_coveredBy != null);
											// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
											JavaSDM.ensure(!_edge_coveredBy
													.equals(_edge_covered));

											// check link src from _edge_coveredBy to line
											JavaSDM.ensure(line
													.equals(_edge_coveredBy
															.getSrc()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_111864 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_111864 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_111864 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_111864 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_111864
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
													__DEC_messageReceive_fragment_346967 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_346967 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_346967 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_346967 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_346967
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_3891 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_3891 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_3891 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_3891 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_3891
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
													__DEC_messageSend_fragment_96758 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_96758 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_96758 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_96758 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_96758
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_618006
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_618006 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_618006
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_618006 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_618006
																	.next();

															// check object __DEC_messageReceive_receiveEvent_618006 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_618006 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_618006 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_618006
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_391794
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_391794 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_391794
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_391794 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_391794
																	.next();

															// check object __DEC_messageSend_receiveEvent_391794 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_391794 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_391794 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_391794
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_519701
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_519701 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_519701
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_519701 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_519701
																	.next();

															// check object __DEC_messageReceive_sendEvent_519701 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_519701 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_519701 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_519701
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_459118
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459118 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459118
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_459118 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_459118
																	.next();

															// check object __DEC_messageSend_sendEvent_459118 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_459118 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_459118 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_459118
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_468388
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_468388 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_468388
																	.hasNext()) {
														try {
															__DEC_message_message_468388 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_468388
																	.next();

															// check object __DEC_message_message_468388 is really bound
															JavaSDM.ensure(__DEC_message_message_468388 != null);
															// check isomorphic binding between objects __DEC_message_message_468388 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_468388
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_468388 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_468388
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_covered to combo
												JavaSDM.ensure(combo
														.equals(_edge_covered
																.getSrc()));

												// check link src from _edge_coveredBy to line
												JavaSDM.ensure(line
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_covered to line
												JavaSDM.ensure(line
														.equals(_edge_covered
																.getTrg()));

												// check link trg from _edge_coveredBy to combo
												JavaSDM.ensure(combo
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_338454 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NormalStep step = null;
		NamedFlow flow = null;

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
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;

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
									__DEC_step_steps_338454 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_338454 is really bound
									JavaSDM.ensure(__DEC_step_steps_338454 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_338454
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_338454 and flow 
									JavaSDM.ensure(!__DEC_step_steps_338454
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
										packageDeclaration, sysActor, actor,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_94(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_58420 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NamedFlow flow = null;
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
			_TmpObject = step.eContainer() instanceof NamedFlow ? (NamedFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;

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
									__DEC_step_steps_58420 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_58420 is really bound
									JavaSDM.ensure(__DEC_step_steps_58420 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_58420
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_58420 and flow 
									JavaSDM.ensure(!__DEC_step_steps_58420
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
										packageDeclaration, sysActor, actor,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_403(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_227993 = null;
		InteractionOperand __DEC_messageReceive_fragment_353844 = null;
		Interaction __DEC_messageSend_enclosingInteraction_621885 = null;
		InteractionOperand __DEC_messageSend_fragment_882265 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_161041 = null;
		Message __DEC_messageReceive_receiveEvent_161041 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_635548 = null;
		Message __DEC_messageSend_receiveEvent_635548 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_124874 = null;
		Message __DEC_messageReceive_sendEvent_124874 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804934 = null;
		Message __DEC_messageSend_sendEvent_804934 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_992620 = null;
		MessageEnd __DEC_message_message_992620 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
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

			// check object _edge_sendEvent is really bound
			JavaSDM.ensure(_edge_sendEvent != null);
			// bind object
			_TmpObject = _edge_sendEvent.getTrg();

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
					// iterate to-many link coveredBy from sysLine to operand
					fujaba__Success = false;

					fujaba__IterSysLineToOperand = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// bind object
							combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object combo is really bound
							JavaSDM.ensure(combo != null);

							// check if contained via correct reference
							JavaSDM.ensure(combo.getOperand().contains(operand));

							// check link coveredBy from combo to sysLine
							JavaSDM.ensure(combo.getCovered().contains(sysLine));

							// iterate to-many link coveredBy from operand to line
							fujaba__Success = false;

							fujaba__IterOperandToLine = new ArrayList(
									operand.getCovered()).iterator();

							while (fujaba__IterOperandToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterOperandToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// bind object
									interaction = line.getInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_227993 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_227993 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_227993 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_227993 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_227993
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
											__DEC_messageReceive_fragment_353844 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_353844 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_353844 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_353844 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_353844
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_621885 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_621885 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_621885 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_621885 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_621885
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
											__DEC_messageSend_fragment_882265 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_882265 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_882265 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_882265 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_882265
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_161041
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_161041 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_161041
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_161041 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_161041
															.next();

													// check object __DEC_messageReceive_receiveEvent_161041 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_161041 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_161041 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_161041
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_635548
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_635548 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_635548
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_635548 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_635548
															.next();

													// check object __DEC_messageSend_receiveEvent_635548 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_635548 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_635548 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_635548
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_124874
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_124874 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_124874
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_124874 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_124874
															.next();

													// check object __DEC_messageReceive_sendEvent_124874 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_124874 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_124874 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_124874
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_804934
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804934 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804934
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_804934 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804934
															.next();

													// check object __DEC_messageSend_sendEvent_804934 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_804934 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_804934 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_804934
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_992620
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_992620 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_992620
															.hasNext()) {
												try {
													__DEC_message_message_992620 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_992620
															.next();

													// check object __DEC_message_message_992620 is really bound
													JavaSDM.ensure(__DEC_message_message_992620 != null);
													// check isomorphic binding between objects __DEC_message_message_992620 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_992620
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_992620 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_992620
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_sendEvent to message
										JavaSDM.ensure(message
												.equals(_edge_sendEvent
														.getSrc()));

										// check link trg from _edge_sendEvent to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_sendEvent
														.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_404(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_300945 = null;
		InteractionOperand __DEC_messageReceive_fragment_761618 = null;
		Interaction __DEC_messageSend_enclosingInteraction_289673 = null;
		InteractionOperand __DEC_messageSend_fragment_436600 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_496068 = null;
		Message __DEC_messageReceive_receiveEvent_496068 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_86054 = null;
		Message __DEC_messageSend_receiveEvent_86054 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_713678 = null;
		Message __DEC_messageReceive_sendEvent_713678 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_471496 = null;
		Message __DEC_messageSend_sendEvent_471496 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_956385 = null;
		MessageEnd __DEC_message_message_956385 = null;
		Match match = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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
					// iterate to-many link coveredBy from sysLine to combo
					fujaba__Success = false;

					fujaba__IterSysLineToCombo = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link coveredBy from combo to line
							fujaba__Success = false;

							fujaba__IterComboToLine = new ArrayList(
									combo.getCovered()).iterator();

							while (fujaba__IterComboToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterComboToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// iterate to-many link coveredBy from sysLine to operand
									fujaba__Success = false;

									fujaba__IterSysLineToOperand = new ArrayList(
											sysLine.getCoveredBy()).iterator();

									while (fujaba__IterSysLineToOperand
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterSysLineToOperand
													.next();

											// ensure correct type and really bound of object operand
											JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
											operand = (InteractionOperand) _TmpObject;
											// check link fragment from messageReceive to operand
											JavaSDM.ensure(operand.equals(messageReceive
													.getEnclosingOperand()));

											// check link operand from operand to combo
											JavaSDM.ensure(combo.equals(operand
													.eContainer()));

											// check link coveredBy from line to operand
											JavaSDM.ensure(line.getCoveredBy()
													.contains(operand));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_300945 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_300945 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_300945 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_300945 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_300945
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
													__DEC_messageReceive_fragment_761618 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_761618 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_761618 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_761618 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_761618
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_289673 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_289673 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_289673 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_289673 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_289673
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
													__DEC_messageSend_fragment_436600 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_436600 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_436600 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_436600 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_436600
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_496068
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_496068 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_496068
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_496068 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_496068
																	.next();

															// check object __DEC_messageReceive_receiveEvent_496068 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_496068 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_496068 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_496068
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_86054
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_86054 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_86054
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_86054 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_86054
																	.next();

															// check object __DEC_messageSend_receiveEvent_86054 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_86054 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_86054 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_86054
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_713678
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_713678 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_713678
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_713678 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_713678
																	.next();

															// check object __DEC_messageReceive_sendEvent_713678 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_713678 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_713678 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_713678
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_471496
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_471496 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_471496
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_471496 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_471496
																	.next();

															// check object __DEC_messageSend_sendEvent_471496 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_471496 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_471496 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_471496
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_956385
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_956385 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_956385
																	.hasNext()) {
														try {
															__DEC_message_message_956385 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_956385
																	.next();

															// check object __DEC_message_message_956385 is really bound
															JavaSDM.ensure(__DEC_message_message_956385 != null);
															// check isomorphic binding between objects __DEC_message_message_956385 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_956385
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_956385 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_956385
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_receiveEvent to message
												JavaSDM.ensure(message
														.equals(_edge_receiveEvent
																.getSrc()));

												// check link trg from _edge_receiveEvent to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_receiveEvent
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_405(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_301118 = null;
		InteractionOperand __DEC_messageReceive_fragment_924023 = null;
		Interaction __DEC_messageSend_enclosingInteraction_25317 = null;
		InteractionOperand __DEC_messageSend_fragment_447543 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_692286 = null;
		Message __DEC_messageReceive_receiveEvent_692286 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_799774 = null;
		Message __DEC_messageSend_receiveEvent_799774 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_956229 = null;
		Message __DEC_messageReceive_sendEvent_956229 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_79009 = null;
		Message __DEC_messageSend_sendEvent_79009 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_790576 = null;
		MessageEnd __DEC_message_message_790576 = null;
		Match match = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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

			// check link trg from _edge_interaction to interaction
			JavaSDM.ensure(interaction.equals(_edge_interaction.getTrg()));

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
					// iterate to-many link coveredBy from sysLine to combo
					fujaba__Success = false;

					fujaba__IterSysLineToCombo = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link coveredBy from combo to line
							fujaba__Success = false;

							fujaba__IterComboToLine = new ArrayList(
									combo.getCovered()).iterator();

							while (fujaba__IterComboToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterComboToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// iterate to-many link coveredBy from sysLine to operand
									fujaba__Success = false;

									fujaba__IterSysLineToOperand = new ArrayList(
											sysLine.getCoveredBy()).iterator();

									while (fujaba__IterSysLineToOperand
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterSysLineToOperand
													.next();

											// ensure correct type and really bound of object operand
											JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
											operand = (InteractionOperand) _TmpObject;
											// check link fragment from messageReceive to operand
											JavaSDM.ensure(operand.equals(messageReceive
													.getEnclosingOperand()));

											// check link operand from operand to combo
											JavaSDM.ensure(combo.equals(operand
													.eContainer()));

											// check link coveredBy from line to operand
											JavaSDM.ensure(line.getCoveredBy()
													.contains(operand));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_301118 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_301118 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_301118 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_301118 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_301118
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
													__DEC_messageReceive_fragment_924023 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_924023 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_924023 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_924023 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_924023
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_25317 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_25317 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_25317 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_25317 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_25317
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
													__DEC_messageSend_fragment_447543 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_447543 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_447543 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_447543 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_447543
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_692286
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_692286 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_692286
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_692286 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_692286
																	.next();

															// check object __DEC_messageReceive_receiveEvent_692286 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_692286 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_692286 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_692286
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_799774
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_799774 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_799774
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_799774 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_799774
																	.next();

															// check object __DEC_messageSend_receiveEvent_799774 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_799774 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_799774 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_799774
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_956229
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_956229 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_956229
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_956229 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_956229
																	.next();

															// check object __DEC_messageReceive_sendEvent_956229 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_956229 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_956229 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_956229
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_79009
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_79009 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_79009
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_79009 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_79009
																	.next();

															// check object __DEC_messageSend_sendEvent_79009 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_79009 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_79009 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_79009
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_790576
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_790576 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_790576
																	.hasNext()) {
														try {
															__DEC_message_message_790576 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_790576
																	.next();

															// check object __DEC_message_message_790576 is really bound
															JavaSDM.ensure(__DEC_message_message_790576 != null);
															// check isomorphic binding between objects __DEC_message_message_790576 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_790576
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_790576 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_790576
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_interaction to message
												JavaSDM.ensure(message
														.equals(_edge_interaction
																.getSrc()));

												// check link trg from _edge_interaction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_interaction
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_406(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_633150 = null;
		InteractionOperand __DEC_messageReceive_fragment_20119 = null;
		Interaction __DEC_messageSend_enclosingInteraction_619515 = null;
		InteractionOperand __DEC_messageSend_fragment_831112 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_209909 = null;
		Message __DEC_messageReceive_receiveEvent_209909 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_537857 = null;
		Message __DEC_messageSend_receiveEvent_537857 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_93828 = null;
		Message __DEC_messageReceive_sendEvent_93828 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_150646 = null;
		Message __DEC_messageSend_sendEvent_150646 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_231810 = null;
		MessageEnd __DEC_message_message_231810 = null;
		Match match = null;
		Iterator fujaba__IterMessageTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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
					// iterate to-many link coveredBy from sysLine to operand
					fujaba__Success = false;

					fujaba__IterSysLineToOperand = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// bind object
							combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object combo is really bound
							JavaSDM.ensure(combo != null);

							// check if contained via correct reference
							JavaSDM.ensure(combo.getOperand().contains(operand));

							// check link coveredBy from combo to sysLine
							JavaSDM.ensure(combo.getCovered().contains(sysLine));

							// iterate to-many link coveredBy from operand to line
							fujaba__Success = false;

							fujaba__IterOperandToLine = new ArrayList(
									operand.getCovered()).iterator();

							while (fujaba__IterOperandToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterOperandToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// iterate to-many link src from message to _edge_interaction
									fujaba__Success = false;

									fujaba__IterMessageTo_edge_interaction = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															EMoflonEdge.class,
															"src")).iterator();

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
													.equals(_edge_interaction
															.getTrg()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_633150 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_633150 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_633150 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_633150 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_633150
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
													__DEC_messageReceive_fragment_20119 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_20119 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_20119 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_20119 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_20119
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_619515 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_619515 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_619515 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_619515 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_619515
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
													__DEC_messageSend_fragment_831112 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_831112 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_831112 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_831112 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_831112
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_209909
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_209909 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_209909
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_209909 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_209909
																	.next();

															// check object __DEC_messageReceive_receiveEvent_209909 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_209909 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_209909 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_209909
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_537857
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_537857 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_537857
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_537857 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_537857
																	.next();

															// check object __DEC_messageSend_receiveEvent_537857 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_537857 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_537857 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_537857
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_93828
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_93828 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_93828
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_93828 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_93828
																	.next();

															// check object __DEC_messageReceive_sendEvent_93828 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_93828 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_93828 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_93828
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_150646
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_150646 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_150646
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_150646 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_150646
																	.next();

															// check object __DEC_messageSend_sendEvent_150646 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_150646 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_150646 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_150646
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_231810
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_231810 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_231810
																	.hasNext()) {
														try {
															__DEC_message_message_231810 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_231810
																	.next();

															// check object __DEC_message_message_231810 is really bound
															JavaSDM.ensure(__DEC_message_message_231810 != null);
															// check isomorphic binding between objects __DEC_message_message_231810 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_231810
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_231810 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_231810
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects _edge_message and _edge_interaction 
												JavaSDM.ensure(!_edge_message
														.equals(_edge_interaction));

												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

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

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_407(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_835582 = null;
		InteractionOperand __DEC_messageReceive_fragment_826390 = null;
		Interaction __DEC_messageSend_enclosingInteraction_19409 = null;
		InteractionOperand __DEC_messageSend_fragment_879413 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_498229 = null;
		Message __DEC_messageReceive_receiveEvent_498229 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_269484 = null;
		Message __DEC_messageSend_receiveEvent_269484 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_61817 = null;
		Message __DEC_messageReceive_sendEvent_61817 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_58995 = null;
		Message __DEC_messageSend_sendEvent_58995 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_544676 = null;
		MessageEnd __DEC_message_message_544676 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
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
					// iterate to-many link coveredBy from sysLine to operand
					fujaba__Success = false;

					fujaba__IterSysLineToOperand = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// bind object
							combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object combo is really bound
							JavaSDM.ensure(combo != null);

							// check if contained via correct reference
							JavaSDM.ensure(combo.getOperand().contains(operand));

							// check link coveredBy from combo to sysLine
							JavaSDM.ensure(combo.getCovered().contains(sysLine));

							// iterate to-many link coveredBy from operand to line
							fujaba__Success = false;

							fujaba__IterOperandToLine = new ArrayList(
									operand.getCovered()).iterator();

							while (fujaba__IterOperandToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterOperandToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// check isomorphic binding between objects sysLine and line 
									JavaSDM.ensure(!sysLine.equals(line));

									// bind object
									interaction = line.getInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_835582 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_835582 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_835582 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_835582 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_835582
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
											__DEC_messageReceive_fragment_826390 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_826390 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_826390 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_826390 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_826390
													.equals(operand));

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
											__DEC_messageSend_enclosingInteraction_19409 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_19409 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_19409 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_19409 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_19409
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
											__DEC_messageSend_fragment_879413 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_879413 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_879413 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_879413 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_879413
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_498229
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_498229 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_498229
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_498229 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_498229
															.next();

													// check object __DEC_messageReceive_receiveEvent_498229 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_498229 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_498229 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_498229
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_269484
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_269484 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_269484
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_269484 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_269484
															.next();

													// check object __DEC_messageSend_receiveEvent_269484 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_269484 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_269484 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_269484
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_61817
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_61817 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_61817
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_61817 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_61817
															.next();

													// check object __DEC_messageReceive_sendEvent_61817 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_61817 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_61817 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_61817
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_58995
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_58995 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_58995
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_58995 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_58995
															.next();

													// check object __DEC_messageSend_sendEvent_58995 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_58995 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_58995 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_58995
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_544676
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_544676 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_544676
															.hasNext()) {
												try {
													__DEC_message_message_544676 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_544676
															.next();

													// check object __DEC_message_message_544676 is really bound
													JavaSDM.ensure(__DEC_message_message_544676 != null);
													// check isomorphic binding between objects __DEC_message_message_544676 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_544676
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_544676 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_544676
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
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
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
										// check object operand is really bound
										JavaSDM.ensure(operand != null);
										// check object sysLine is really bound
										JavaSDM.ensure(sysLine != null);
										// check isomorphic binding between objects sysLine and line 
										JavaSDM.ensure(!sysLine.equals(line));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

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

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link src from _edge_message to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_message.getSrc()));

										// check link trg from _edge_message to message
										JavaSDM.ensure(message
												.equals(_edge_message.getTrg()));

										// check link coveredBy from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link coveredBy from line to operand
										JavaSDM.ensure(line.getCoveredBy()
												.contains(operand));

										// check link coveredBy from combo to sysLine
										JavaSDM.ensure(combo.getCovered()
												.contains(sysLine));

										// check link coveredBy from messageSend to sysLine
										JavaSDM.ensure(messageSend.getCovered()
												.contains(sysLine));

										// check link coveredBy from operand to sysLine
										JavaSDM.ensure(operand.getCovered()
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
														operand, combo,
														messageReceive, line,
														message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_408(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_603370 = null;
		InteractionOperand __DEC_messageReceive_fragment_75852 = null;
		Interaction __DEC_messageSend_enclosingInteraction_308400 = null;
		InteractionOperand __DEC_messageSend_fragment_407370 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_213806 = null;
		Message __DEC_messageReceive_receiveEvent_213806 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285252 = null;
		Message __DEC_messageSend_receiveEvent_285252 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_888051 = null;
		Message __DEC_messageReceive_sendEvent_888051 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_502046 = null;
		Message __DEC_messageSend_sendEvent_502046 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_366874 = null;
		MessageEnd __DEC_message_message_366874 = null;
		Match match = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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

			// check link src from _edge_message to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_message.getSrc()));

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
					// iterate to-many link coveredBy from sysLine to operand
					fujaba__Success = false;

					fujaba__IterSysLineToOperand = new ArrayList(
							sysLine.getCoveredBy()).iterator();

					while (fujaba__IterSysLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterSysLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// iterate to-many link coveredBy from sysLine to combo
							fujaba__Success = false;

							fujaba__IterSysLineToCombo = new ArrayList(
									sysLine.getCoveredBy()).iterator();

							while (fujaba__IterSysLineToCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterSysLineToCombo
											.next();

									// ensure correct type and really bound of object combo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									combo = (CombinedFragment) _TmpObject;
									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// iterate to-many link coveredBy from combo to line
									fujaba__Success = false;

									fujaba__IterComboToLine = new ArrayList(
											combo.getCovered()).iterator();

									while (fujaba__IterComboToLine.hasNext()) {
										try {
											line = (Lifeline) fujaba__IterComboToLine
													.next();

											// check object line is really bound
											JavaSDM.ensure(line != null);
											// check isomorphic binding between objects sysLine and line 
											JavaSDM.ensure(!sysLine
													.equals(line));

											// check link lifeline from line to interaction
											JavaSDM.ensure(interaction
													.equals(line
															.getInteraction()));

											// check link coveredBy from line to operand
											JavaSDM.ensure(line.getCoveredBy()
													.contains(operand));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_enclosingInteraction_603370 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_603370 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_603370 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_603370 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_603370
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
													__DEC_messageReceive_fragment_75852 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_75852 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_75852 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_75852 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_75852
															.equals(operand));

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
													__DEC_messageSend_enclosingInteraction_308400 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_308400 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_308400 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_308400 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_308400
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
													__DEC_messageSend_fragment_407370 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_407370 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_407370 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_407370 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_407370
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_213806
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_213806 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_213806
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_213806 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_213806
																	.next();

															// check object __DEC_messageReceive_receiveEvent_213806 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_213806 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_213806 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_213806
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_285252
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285252 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285252
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_285252 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_285252
																	.next();

															// check object __DEC_messageSend_receiveEvent_285252 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_285252 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_285252 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_285252
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_888051
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_888051 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_888051
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_888051 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_888051
																	.next();

															// check object __DEC_messageReceive_sendEvent_888051 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_888051 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_888051 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_888051
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_502046
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_502046 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_502046
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_502046 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_502046
																	.next();

															// check object __DEC_messageSend_sendEvent_502046 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_502046 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_502046 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_502046
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_366874
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_366874 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_366874
																	.hasNext()) {
														try {
															__DEC_message_message_366874 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_366874
																	.next();

															// check object __DEC_message_message_366874 is really bound
															JavaSDM.ensure(__DEC_message_message_366874 != null);
															// check isomorphic binding between objects __DEC_message_message_366874 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_366874
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_366874 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_366874
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
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
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
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(operand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

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

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link src from _edge_message to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_message
																.getSrc()));

												// check link trg from _edge_message to message
												JavaSDM.ensure(message
														.equals(_edge_message
																.getTrg()));

												// check link coveredBy from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link coveredBy from line to operand
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(operand));

												// check link coveredBy from combo to sysLine
												JavaSDM.ensure(combo
														.getCovered().contains(
																sysLine));

												// check link coveredBy from messageSend to sysLine
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																sysLine));

												// check link coveredBy from operand to sysLine
												JavaSDM.ensure(operand
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
																operand, combo,
																messageReceive,
																line, message,
																interaction);
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
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(CombinedFragment) arguments.get(7),
					(NamedFlow) arguments.get(8),
					(FlowToInteractionFragment) arguments.get(9),
					(Lifeline) arguments.get(10), (UseCase) arguments.get(11),
					(UseCaseToInteraction) arguments.get(12),
					(NormalStep) arguments.get(13),
					(Interaction) arguments.get(14),
					(ActorToLifeline) arguments.get(15));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(ActorToLifeline) arguments.get(6),
					(InteractionOperand) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(NamedFlow) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(MessageOccurrenceSpecification) arguments.get(11),
					(Lifeline) arguments.get(12), (UseCase) arguments.get(13),
					(UseCaseToInteraction) arguments.get(14),
					(Message) arguments.get(15),
					(Interaction) arguments.get(16),
					(ActorToLifeline) arguments.get(17));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_391__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_391((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_392__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_392((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_393__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_393((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_394__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_394((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_395__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_395((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_396__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_396((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_397__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_397((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_398__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_398((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_399__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_399((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_400__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_400((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_401__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_401((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_402__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_402((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_94((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_403__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_403((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_404__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_404((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_405__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_405((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_406__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_406((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_407__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_407((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_408__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_408((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserStepNfToMessageRuleImpl
