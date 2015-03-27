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
import UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule;

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
 * An implementation of the model object '<em><b>System Step NF To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemStepNFToMessageRuleImpl extends AbstractRuleImpl implements
		SystemStepNFToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStepNFToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSystemStepNFToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, NamedFlow flow,
			UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

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
				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

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
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

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
		CombinedFragment combo = null;
		NamedFlow flow = null;
		FlowToInteractionFragment flowToOperand = null;
		Interaction interaction = null;
		Lifeline line = null;
		InteractionOperand operand = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge messageSend__covered__line = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge messageSend__enclosingOperand__operand = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge operand__fragment__messageReceive = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge operand__fragment__messageSend = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge messageReceive__enclosingOperand__operand = null;
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge combo__covered__line = null;
		EMoflonEdge line__coveredBy__messageSend = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
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
			operand.getCovered().add(line);

			// create link
			messageSend.getCovered().add(line);

			// create link
			combo.getCovered().add(line);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(messageSend,
					message, "message");

			// create link
			message.setSendEvent(messageSend);

			// create link
			operand.getFragment().add(messageSend);

			// create link
			messageReceive.setEnclosingOperand(operand);

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
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

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

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__covered__line
			messageSend__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingOperand__operand
			messageSend__enclosingOperand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__fragment__messageReceive
			operand__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__fragment__messageSend
			operand__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object messageReceive__enclosingOperand__operand
			messageReceive__enclosingOperand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageSend
			line__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SystemStepNFToMessageRule");
			// assign attribute line__coveredBy__messageSend
			line__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__line
			messageSend__covered__line.setName("covered");
			// assign attribute operand__fragment__messageSend
			operand__fragment__messageSend.setName("fragment");
			// assign attribute messageSend__enclosingOperand__operand
			messageSend__enclosingOperand__operand.setName("enclosingOperand");
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
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingOperand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingOperand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageSend, "createdEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			line__coveredBy__combo.setSrc(line);

			// create link
			combo__covered__line.setTrg(line);

			// create link
			messageSend__covered__line.setTrg(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageSend.setSrc(line);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			messageSend__enclosingOperand__operand.setSrc(messageSend);

			// create link
			line__coveredBy__messageSend.setTrg(messageSend);

			// create link
			messageSend__covered__line.setSrc(messageSend);

			// create link
			operand__fragment__messageSend.setTrg(messageSend);

			// create link
			messageSend__message__message.setSrc(messageSend);

			// create link
			message__sendEvent__messageSend.setTrg(messageSend);

			// create link
			messageSend__enclosingOperand__operand.setTrg(operand);

			// create link
			messageReceive__enclosingOperand__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			operand__fragment__messageReceive.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			operand__fragment__messageSend.setSrc(operand);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			messageReceive__enclosingOperand__operand.setSrc(messageReceive);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			operand__fragment__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			interaction__message__message.setSrc(interaction);

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
		this.registerObjects_FWD(ruleresult, actor, line, messageSend, operand,
				flow, flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, packageDeclaration);
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
		UseCase useCase = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __flowToOperand_target_operand = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __flowToOperand_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		CSP csp = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterFlowToFlowToOperand = null;
		FlowToInteractionFragment flowToOperand = null;

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
			ruleresult.setRule("SystemStepNFToMessageRule");

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
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from flow to flowToOperand
			fujaba__Success = false;

			fujaba__IterFlowToFlowToOperand = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							FlowToInteractionFragment.class, "source"))
					.iterator();

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
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object flowToOperand is really bound
								JavaSDM.ensure(flowToOperand != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object operand is really bound
								JavaSDM.ensure(operand != null);
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

								// bind object
								combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
										.eContainer() : null;

								// check object combo is really bound
								JavaSDM.ensure(combo != null);

								// check if contained via correct reference
								JavaSDM.ensure(combo.getOperand().contains(
										operand));

								// check link source from flowToOperand to flow
								JavaSDM.ensure(flow.equals(flowToOperand
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from flowToOperand to operand
								JavaSDM.ensure(operand.equals(flowToOperand
										.getTarget()));

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

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToOperand_target_operand
										__flowToOperand_target_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_operand_operand
										__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
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

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __flowToOperand_source_flow
										__flowToOperand_source_flow
												.setName("source");
										// assign attribute __flowToOperand_target_operand
										__flowToOperand_target_operand
												.setName("target");
										// assign attribute __combo_operand_operand
										__combo_operand_operand
												.setName("operand");
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
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														operand);

										// create link
										__flowToOperand_target_operand
												.setTrg(operand);

										// create link
										__combo_operand_operand.setTrg(operand);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flowToOperand_source_flow
												.setTrg(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToOperand);

										// create link
										__flowToOperand_target_operand
												.setSrc(flowToOperand);

										// create link
										__flowToOperand_source_flow
												.setSrc(flowToOperand);

										// create link
										__combo_operand_operand.setSrc(combo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

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
										__flow_steps_step.setTrg(step);

										// create link
										__step_actor_actor.setSrc(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

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
														__flow_steps_step,
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
														__packageDeclaration_useCases_useCase,
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
														__flowToOperand_target_operand,
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
														__flowToOperand_source_flow,
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
														__useCaseToInteraction_source_useCase,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__useCase_flows_flow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															actor,
															line,
															operand,
															flow,
															flowToOperand,
															combo,
															useCase,
															useCaseToInteraction,
															step, interaction,
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
														.setRuleName("SystemStepNFToMessageRule");
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
			NamedFlow flow, UseCase useCase, NormalStep step,
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
			NamedFlow flow, UseCase useCase, NormalStep step,
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
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Interaction interaction, PackageDeclaration packageDeclaration) {
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
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("interaction", interaction);
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
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __operand_fragment_messageSend = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __messageSend_enclosingOperand_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_interaction_interaction = null;

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
					messageSend, operand, messageReceive, combo, message,
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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __messageReceive_enclosingOperand_operand
				__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_line
				__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_fragment_messageReceive
				__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageSend
				__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_fragment_messageSend
				__operand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingOperand_operand
				__messageSend_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_coveredBy_messageSend
				__line_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_line
				__messageSend_covered_line.setName("covered");
				// assign attribute __operand_fragment_messageSend
				__operand_fragment_messageSend.setName("fragment");
				// assign attribute __messageSend_enclosingOperand_operand
				__messageSend_enclosingOperand_operand
						.setName("enclosingOperand");
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
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingOperand_operand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_fragment_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingOperand_operand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__messageSend_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageSend.setSrc(line);

				// create link
				__messageSend_covered_line.setSrc(messageSend);

				// create link
				__messageSend_enclosingOperand_operand.setSrc(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__operand_fragment_messageSend.setTrg(messageSend);

				// create link
				__line_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__operand_fragment_messageReceive.setSrc(operand);

				// create link
				__messageSend_enclosingOperand_operand.setTrg(operand);

				// create link
				__operand_fragment_messageSend.setSrc(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__messageReceive_enclosingOperand_operand.setTrg(operand);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__operand_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__messageReceive_enclosingOperand_operand
						.setSrc(messageReceive);

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__line_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, line, messageSend, operand,
					messageReceive, combo, message, interaction);
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
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		NormalStepToMessage stepToMessage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __operand_fragment_messageSend = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __messageSend_enclosingOperand_operand = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
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
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

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

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingOperand_operand
			__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_line
			__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_fragment_messageReceive
			__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_fragment_messageSend
			__operand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_enclosingOperand_operand
			__messageSend_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageSend
			__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SystemStepNFToMessageRule");
			// assign attribute __line_coveredBy_messageSend
			__line_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_line
			__messageSend_covered_line.setName("covered");
			// assign attribute __operand_fragment_messageSend
			__operand_fragment_messageSend.setName("fragment");
			// assign attribute __messageSend_enclosingOperand_operand
			__messageSend_enclosingOperand_operand.setName("enclosingOperand");
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
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingOperand_operand,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_fragment_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingOperand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__line_coveredBy_messageSend.setSrc(line);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			__messageSend_covered_line.setTrg(line);

			// create link
			__operand_fragment_messageSend.setTrg(messageSend);

			// create link
			__messageSend_covered_line.setSrc(messageSend);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__line_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__messageSend_enclosingOperand_operand.setSrc(messageSend);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			__operand_fragment_messageReceive.setSrc(operand);

			// create link
			__messageSend_enclosingOperand_operand.setTrg(operand);

			// create link
			__operand_fragment_messageSend.setSrc(operand);

			// create link
			__messageReceive_enclosingOperand_operand.setTrg(operand);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			__operand_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_enclosingOperand_operand.setSrc(messageReceive);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			__interaction_message_message.setTrg(message);

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
		this.registerObjects_BWD(ruleresult, actor, line, messageSend, operand,
				flow, flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, packageDeclaration);
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
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __operand_fragment_messageSend = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __messageSend_enclosingOperand_operand = null;
		EMoflonEdge __messageReceive_enclosingOperand_operand = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __flowToOperand_target_operand = null;
		EMoflonEdge __operand_fragment_messageReceive = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToOperand_source_flow = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		CSP csp = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		NamedFlow flow = null;
		Iterator fujaba__IterOperandToFlowToOperand = null;
		FlowToInteractionFragment flowToOperand = null;

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
			ruleresult.setRule("SystemStepNFToMessageRule");

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
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// iterate to-many link target from operand to flowToOperand
			fujaba__Success = false;

			fujaba__IterOperandToFlowToOperand = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							operand, FlowToInteractionFragment.class, "target"))
					.iterator();

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
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link source from flowToOperand to flow
								JavaSDM.ensure(flow.equals(flowToOperand
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link target from flowToOperand to operand
								JavaSDM.ensure(operand.equals(flowToOperand
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

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

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

										// create object __line_coveredBy_messageSend
										__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_combo
										__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_covered_line
										__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_covered_line
										__combo_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_operand
										__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_covered_line
										__operand_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_fragment_messageSend
										__operand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_message_message
										__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_sendEvent_messageSend
										__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_enclosingOperand_operand
										__messageSend_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_enclosingOperand_operand
										__messageReceive_enclosingOperand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_operand_operand
										__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToOperand_target_operand
										__flowToOperand_target_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_fragment_messageReceive
										__operand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
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

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_message_message
										__interaction_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_interaction_interaction
										__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __line_coveredBy_messageSend
										__line_coveredBy_messageSend
												.setName("coveredBy");
										// assign attribute __messageSend_covered_line
										__messageSend_covered_line
												.setName("covered");
										// assign attribute __operand_fragment_messageSend
										__operand_fragment_messageSend
												.setName("fragment");
										// assign attribute __messageSend_enclosingOperand_operand
										__messageSend_enclosingOperand_operand
												.setName("enclosingOperand");
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
										__combo_covered_line.setName("covered");
										// assign attribute __combo_operand_operand
										__combo_operand_operand
												.setName("operand");
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
										__line_coveredBy_messageSend
												.setSrc(line);

										// create link
										__line_coveredBy_combo.setSrc(line);

										// create link
										__messageSend_covered_line.setTrg(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__combo_covered_line.setTrg(line);

										// create link
										__line_coveredBy_operand.setSrc(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__operand_covered_line.setTrg(line);

										// create link
										__line_coveredBy_messageSend
												.setTrg(messageSend);

										// create link
										__operand_fragment_messageSend
												.setTrg(messageSend);

										// create link
										__messageSend_covered_line
												.setSrc(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__messageSend_message_message
												.setSrc(messageSend);

										// create link
										__message_sendEvent_messageSend
												.setTrg(messageSend);

										// create link
										__messageSend_enclosingOperand_operand
												.setSrc(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														operand);

										// create link
										__operand_covered_line.setSrc(operand);

										// create link
										__messageReceive_enclosingOperand_operand
												.setTrg(operand);

										// create link
										__combo_operand_operand.setTrg(operand);

										// create link
										__operand_fragment_messageSend
												.setSrc(operand);

										// create link
										__flowToOperand_target_operand
												.setTrg(operand);

										// create link
										__messageSend_enclosingOperand_operand
												.setTrg(operand);

										// create link
										__operand_fragment_messageReceive
												.setSrc(operand);

										// create link
										__line_coveredBy_operand
												.setTrg(operand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flowToOperand_source_flow
												.setTrg(flow);

										// create link
										__flowToOperand_source_flow
												.setSrc(flowToOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToOperand);

										// create link
										__flowToOperand_target_operand
												.setSrc(flowToOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__message_receiveEvent_messageReceive
												.setTrg(messageReceive);

										// create link
										__operand_fragment_messageReceive
												.setTrg(messageReceive);

										// create link
										__messageReceive_message_message
												.setSrc(messageReceive);

										// create link
										__messageReceive_enclosingOperand_operand
												.setSrc(messageReceive);

										// create link
										__combo_covered_line.setSrc(combo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__line_coveredBy_combo.setTrg(combo);

										// create link
										__combo_operand_operand.setSrc(combo);

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
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										__useCaseToInteraction_target_interaction
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__message_sendEvent_messageSend
												.setSrc(message);

										// create link
										__interaction_message_message
												.setTrg(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														message);

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
										__message_receiveEvent_messageReceive
												.setSrc(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__interaction_message_message
												.setSrc(interaction);

										// create link
										__message_interaction_interaction
												.setTrg(interaction);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

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
														__flowToOperand_target_operand,
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
														__messageReceive_enclosingOperand_operand,
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
														__combo_covered_line,
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
														__messageSend_enclosingOperand_operand,
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
														__line_interaction_interaction,
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
														__interaction_lifeline_line,
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
														__useCase_flows_flow,
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
														__message_interaction_interaction,
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
														__operand_fragment_messageReceive,
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
														__operand_fragment_messageSend,
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
														__message_sendEvent_messageSend,
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
														__line_coveredBy_combo,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__operand_covered_line,
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
															operand,
															flow,
															flowToOperand,
															messageReceive,
															combo,
															useCase,
															useCaseToInteraction,
															message,
															interaction,
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
														.setRuleName("SystemStepNFToMessageRule");
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
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("operand", operand);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("combo", combo);
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration) {
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
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_375(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_700587 = null;
		InteractionOperand __DEC_messageReceive_fragment_735153 = null;
		Interaction __DEC_messageSend_enclosingInteraction_466069 = null;
		InteractionOperand __DEC_messageSend_fragment_969426 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_849608 = null;
		Message __DEC_messageReceive_receiveEvent_849608 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74935 = null;
		Message __DEC_messageSend_receiveEvent_74935 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_264743 = null;
		Message __DEC_messageReceive_sendEvent_264743 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_855944 = null;
		Message __DEC_messageSend_sendEvent_855944 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_854600 = null;
		MessageEnd __DEC_message_message_854600 = null;
		Match match = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link coveredBy from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

			// iterate to-many link coveredBy from line to combo
			fujaba__Success = false;

			fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// iterate to-many link coveredBy from line to operand
					fujaba__Success = false;

					fujaba__IterLineToOperand = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// check link fragment from messageReceive to operand
							JavaSDM.ensure(operand.equals(messageReceive
									.getEnclosingOperand()));

							// check link fragment from messageSend to operand
							JavaSDM.ensure(operand.equals(messageSend
									.getEnclosingOperand()));

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_700587 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_700587 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_700587 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_700587 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_700587
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
									__DEC_messageReceive_fragment_735153 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_735153 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_735153 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_735153 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_735153
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
									__DEC_messageSend_enclosingInteraction_466069 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_466069 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_466069 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_466069 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_466069
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
									__DEC_messageSend_fragment_969426 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_969426 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_969426 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_969426 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_969426
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_849608
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_849608 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_849608
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_849608 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_849608
													.next();

											// check object __DEC_messageReceive_receiveEvent_849608 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_849608 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_849608 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_849608
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_74935
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74935 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74935
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_74935 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_74935
													.next();

											// check object __DEC_messageSend_receiveEvent_74935 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_74935 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_74935 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_74935
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_264743
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_264743 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_264743
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_264743 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_264743
													.next();

											// check object __DEC_messageReceive_sendEvent_264743 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_264743 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_264743 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_264743
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_855944
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_855944 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_855944
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_855944 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_855944
													.next();

											// check object __DEC_messageSend_sendEvent_855944 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_855944 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_855944 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_855944
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_854600
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_854600 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_854600
													.hasNext()) {
										try {
											__DEC_message_message_854600 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_854600
													.next();

											// check object __DEC_message_message_854600 is really bound
											JavaSDM.ensure(__DEC_message_message_854600 != null);
											// check isomorphic binding between objects __DEC_message_message_854600 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_854600
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_854600 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_854600
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
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_coveredBy.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_376(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_294449 = null;
		InteractionOperand __DEC_messageReceive_fragment_971773 = null;
		Interaction __DEC_messageSend_enclosingInteraction_781426 = null;
		InteractionOperand __DEC_messageSend_fragment_74654 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_457070 = null;
		Message __DEC_messageReceive_receiveEvent_457070 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_569450 = null;
		Message __DEC_messageSend_receiveEvent_569450 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_98859 = null;
		Message __DEC_messageReceive_sendEvent_98859 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_201077 = null;
		Message __DEC_messageSend_sendEvent_201077 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_664621 = null;
		MessageEnd __DEC_message_message_664621 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
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
			operand = messageSend.getEnclosingOperand();

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

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
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

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

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link coveredBy from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

			// check link coveredBy from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

			// iterate to-many link coveredBy from line to combo
			fujaba__Success = false;

			fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// check link operand from operand to combo
					JavaSDM.ensure(combo.equals(operand.eContainer()));

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

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_294449 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_294449 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_294449 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_294449 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_294449
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
									__DEC_messageReceive_fragment_971773 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_971773 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_971773 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_971773 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_971773
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
									__DEC_messageSend_enclosingInteraction_781426 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_781426 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_781426 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_781426 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_781426
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
									__DEC_messageSend_fragment_74654 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_74654 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_74654 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_74654 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_74654
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_457070
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_457070 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_457070
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_457070 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_457070
													.next();

											// check object __DEC_messageReceive_receiveEvent_457070 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_457070 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_457070 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_457070
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_569450
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_569450 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_569450
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_569450 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_569450
													.next();

											// check object __DEC_messageSend_receiveEvent_569450 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_569450 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_569450 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_569450
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_98859
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_98859 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_98859
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_98859 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_98859
													.next();

											// check object __DEC_messageReceive_sendEvent_98859 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_98859 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_98859 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_98859
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_201077
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_201077 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_201077
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_201077 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_201077
													.next();

											// check object __DEC_messageSend_sendEvent_201077 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_201077 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_201077 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_201077
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_664621
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_664621 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_664621
													.hasNext()) {
										try {
											__DEC_message_message_664621 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_664621
													.next();

											// check object __DEC_message_message_664621 is really bound
											JavaSDM.ensure(__DEC_message_message_664621 != null);
											// check isomorphic binding between objects __DEC_message_message_664621 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_664621
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_664621 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_664621
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
								// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

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

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_377(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_847128 = null;
		InteractionOperand __DEC_messageReceive_fragment_441235 = null;
		Interaction __DEC_messageSend_enclosingInteraction_143335 = null;
		InteractionOperand __DEC_messageSend_fragment_791924 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_262609 = null;
		Message __DEC_messageReceive_receiveEvent_262609 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_83653 = null;
		Message __DEC_messageSend_receiveEvent_83653 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_180559 = null;
		Message __DEC_messageReceive_sendEvent_180559 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_114359 = null;
		Message __DEC_messageSend_sendEvent_114359 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_364207 = null;
		MessageEnd __DEC_message_message_364207 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
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
			_TmpObject = _edge_fragment.getSrc();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// check link fragment from messageSend to operand
			JavaSDM.ensure(operand.equals(messageSend.getEnclosingOperand()));

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
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

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

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

					// check link coveredBy from messageSend to line
					JavaSDM.ensure(messageSend.getCovered().contains(line));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_847128 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_847128 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_847128 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_847128 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_847128
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
							__DEC_messageReceive_fragment_441235 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_441235 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_441235 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_441235 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_441235
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
							__DEC_messageSend_enclosingInteraction_143335 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_143335 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_143335 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_143335 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_143335
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
							__DEC_messageSend_fragment_791924 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_791924 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_791924 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_791924 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_791924
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_262609
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_262609 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_262609
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_262609 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_262609
											.next();

									// check object __DEC_messageReceive_receiveEvent_262609 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_262609 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_262609 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_262609
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_83653
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_83653 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_83653
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_83653 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_83653
											.next();

									// check object __DEC_messageSend_receiveEvent_83653 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_83653 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_83653 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_83653
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_180559
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_180559 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_180559
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_180559 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_180559
											.next();

									// check object __DEC_messageReceive_sendEvent_180559 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_180559 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_180559 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_180559
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_114359
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_114359 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_114359
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_114359 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_114359
											.next();

									// check object __DEC_messageSend_sendEvent_114359 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_114359 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_114359 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_114359
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_364207
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_364207 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_364207
											.hasNext()) {
								try {
									__DEC_message_message_364207 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_364207
											.next();

									// check object __DEC_message_message_364207 is really bound
									JavaSDM.ensure(__DEC_message_message_364207 != null);
									// check isomorphic binding between objects __DEC_message_message_364207 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_364207
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_364207 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_364207
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to operand
						JavaSDM.ensure(operand.equals(messageReceive
								.getEnclosingOperand()));

						// check link fragment from messageSend to operand
						JavaSDM.ensure(operand.equals(messageSend
								.getEnclosingOperand()));

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

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link src from _edge_fragment to operand
						JavaSDM.ensure(operand.equals(_edge_fragment.getSrc()));

						// check link trg from _edge_fragment to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_fragment
								.getTrg()));

						// check link coveredBy from combo to line
						JavaSDM.ensure(combo.getCovered().contains(line));

						// check link coveredBy from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// check link coveredBy from operand to line
						JavaSDM.ensure(operand.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, operand, messageReceive, combo,
								message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_378(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_909861 = null;
		InteractionOperand __DEC_messageReceive_fragment_266910 = null;
		Interaction __DEC_messageSend_enclosingInteraction_351280 = null;
		InteractionOperand __DEC_messageSend_fragment_536639 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_142387 = null;
		Message __DEC_messageReceive_receiveEvent_142387 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_464459 = null;
		Message __DEC_messageSend_receiveEvent_464459 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_559750 = null;
		Message __DEC_messageReceive_sendEvent_559750 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_438493 = null;
		Message __DEC_messageSend_sendEvent_438493 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_127797 = null;
		MessageEnd __DEC_message_message_127797 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_fragment = null;
		EMoflonEdge _edge_fragment = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
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

			// check object _edge_enclosingOperand is really bound
			JavaSDM.ensure(_edge_enclosingOperand != null);
			// bind object
			_TmpObject = _edge_enclosingOperand.getSrc();

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
			_TmpObject = _edge_enclosingOperand.getTrg();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// check link fragment from messageReceive to operand
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

			// check link fragment from messageSend to operand
			JavaSDM.ensure(operand.equals(messageSend.getEnclosingOperand()));

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

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

					// check link coveredBy from messageSend to line
					JavaSDM.ensure(messageSend.getCovered().contains(line));

					// iterate to-many link src from operand to _edge_fragment
					fujaba__Success = false;

					fujaba__IterOperandTo_edge_fragment = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(operand,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterOperandTo_edge_fragment.hasNext()) {
						try {
							_edge_fragment = (EMoflonEdge) fujaba__IterOperandTo_edge_fragment
									.next();

							// check object _edge_fragment is really bound
							JavaSDM.ensure(_edge_fragment != null);
							// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
							JavaSDM.ensure(!_edge_fragment
									.equals(_edge_enclosingOperand));

							// check link trg from _edge_fragment to messageSend
							JavaSDM.ensure(messageSend.equals(_edge_fragment
									.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_909861 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_909861 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_909861 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_909861 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_909861
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
									__DEC_messageReceive_fragment_266910 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_266910 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_266910 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_266910 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_266910
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
									__DEC_messageSend_enclosingInteraction_351280 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_351280 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_351280 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_351280 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_351280
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
									__DEC_messageSend_fragment_536639 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_536639 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_536639 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_536639 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_536639
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_142387
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_142387 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_142387
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_142387 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_142387
													.next();

											// check object __DEC_messageReceive_receiveEvent_142387 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_142387 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_142387 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_142387
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_464459
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_464459 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_464459
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_464459 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_464459
													.next();

											// check object __DEC_messageSend_receiveEvent_464459 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_464459 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_464459 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_464459
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_559750
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_559750 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_559750
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_559750 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_559750
													.next();

											// check object __DEC_messageReceive_sendEvent_559750 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_559750 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_559750 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_559750
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_438493
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_438493 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_438493
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_438493 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_438493
													.next();

											// check object __DEC_messageSend_sendEvent_438493 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_438493 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_438493 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_438493
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_127797
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_127797 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_127797
													.hasNext()) {
										try {
											__DEC_message_message_127797 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_127797
													.next();

											// check object __DEC_message_message_127797 is really bound
											JavaSDM.ensure(__DEC_message_message_127797 != null);
											// check isomorphic binding between objects __DEC_message_message_127797 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_127797
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_127797 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_127797
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
								// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
								JavaSDM.ensure(!_edge_fragment
										.equals(_edge_enclosingOperand));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_enclosingOperand to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_enclosingOperand.getSrc()));

								// check link src from _edge_fragment to operand
								JavaSDM.ensure(operand.equals(_edge_fragment
										.getSrc()));

								// check link trg from _edge_enclosingOperand to operand
								JavaSDM.ensure(operand
										.equals(_edge_enclosingOperand.getTrg()));

								// check link trg from _edge_fragment to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_fragment.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_379(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_685427 = null;
		InteractionOperand __DEC_messageReceive_fragment_702261 = null;
		Interaction __DEC_messageSend_enclosingInteraction_948774 = null;
		InteractionOperand __DEC_messageSend_fragment_923160 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_185497 = null;
		Message __DEC_messageReceive_receiveEvent_185497 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_882919 = null;
		Message __DEC_messageSend_receiveEvent_882919 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_387345 = null;
		Message __DEC_messageReceive_sendEvent_387345 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_609447 = null;
		Message __DEC_messageSend_sendEvent_609447 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_293733 = null;
		MessageEnd __DEC_message_message_293733 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// iterate to-many link fragment from operand to messageSend
			fujaba__Success = false;

			fujaba__IterOperandToMessageSend = new ArrayList(
					operand.getFragment()).iterator();

			while (fujaba__IterOperandToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterOperandToMessageSend.next();

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

					// check link trg from _edge_fragment to messageReceive
					JavaSDM.ensure(messageReceive.equals(_edge_fragment
							.getTrg()));

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

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link coveredBy from combo to line
							JavaSDM.ensure(combo.getCovered().contains(line));

							// check link coveredBy from messageSend to line
							JavaSDM.ensure(messageSend.getCovered().contains(
									line));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_685427 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_685427 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_685427 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_685427 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_685427
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
									__DEC_messageReceive_fragment_702261 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_702261 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_702261 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_702261 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_702261
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
									__DEC_messageSend_enclosingInteraction_948774 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_948774 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_948774 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_948774 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_948774
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
									__DEC_messageSend_fragment_923160 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_923160 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_923160 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_923160 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_923160
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_185497
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_185497 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_185497
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_185497 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_185497
													.next();

											// check object __DEC_messageReceive_receiveEvent_185497 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_185497 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_185497 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_185497
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_882919
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_882919 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_882919
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_882919 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_882919
													.next();

											// check object __DEC_messageSend_receiveEvent_882919 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_882919 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_882919 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_882919
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_387345
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_387345 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_387345
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_387345 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_387345
													.next();

											// check object __DEC_messageReceive_sendEvent_387345 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_387345 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_387345 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_387345
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_609447
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_609447 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_609447
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_609447 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_609447
													.next();

											// check object __DEC_messageSend_sendEvent_609447 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_609447 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_609447 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_609447
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_293733
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_293733 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_293733
													.hasNext()) {
										try {
											__DEC_message_message_293733 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_293733
													.next();

											// check object __DEC_message_message_293733 is really bound
											JavaSDM.ensure(__DEC_message_message_293733 != null);
											// check isomorphic binding between objects __DEC_message_message_293733 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_293733
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_293733 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_293733
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
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_fragment to operand
								JavaSDM.ensure(operand.equals(_edge_fragment
										.getSrc()));

								// check link trg from _edge_fragment to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_fragment.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_380(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_844984 = null;
		InteractionOperand __DEC_messageReceive_fragment_862229 = null;
		Interaction __DEC_messageSend_enclosingInteraction_566268 = null;
		InteractionOperand __DEC_messageSend_fragment_56244 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_891823 = null;
		Message __DEC_messageReceive_receiveEvent_891823 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_728366 = null;
		Message __DEC_messageSend_receiveEvent_728366 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_245922 = null;
		Message __DEC_messageReceive_sendEvent_245922 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_985364 = null;
		Message __DEC_messageSend_sendEvent_985364 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_451223 = null;
		MessageEnd __DEC_message_message_451223 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
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

					// bind object
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

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

							// check link coveredBy from combo to line
							JavaSDM.ensure(combo.getCovered().contains(line));

							// iterate to-many link fragment from operand to messageSend
							fujaba__Success = false;

							fujaba__IterOperandToMessageSend = new ArrayList(
									operand.getFragment()).iterator();

							while (fujaba__IterOperandToMessageSend.hasNext()) {
								try {
									_TmpObject = fujaba__IterOperandToMessageSend
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

									// check link src from _edge_enclosingOperand to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_enclosingOperand
													.getSrc()));

									// check link trg from _edge_fragment to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(_edge_fragment.getTrg()));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_844984 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_844984 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_844984 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_844984 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_844984
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
											__DEC_messageReceive_fragment_862229 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_862229 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_862229 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_862229 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_862229
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
											__DEC_messageSend_enclosingInteraction_566268 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_566268 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_566268 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_566268 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_566268
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
											__DEC_messageSend_fragment_56244 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_56244 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_56244 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_56244 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_56244
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_891823
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_891823 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_891823
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_891823 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_891823
															.next();

													// check object __DEC_messageReceive_receiveEvent_891823 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_891823 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_891823 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_891823
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_728366
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_728366 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_728366
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_728366 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_728366
															.next();

													// check object __DEC_messageSend_receiveEvent_728366 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_728366 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_728366 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_728366
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_245922
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_245922 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_245922
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_245922 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_245922
															.next();

													// check object __DEC_messageReceive_sendEvent_245922 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_245922 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_245922 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_245922
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_985364
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_985364 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_985364
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_985364 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_985364
															.next();

													// check object __DEC_messageSend_sendEvent_985364 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_985364 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_985364 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_985364
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_451223
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_451223 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_451223
															.hasNext()) {
												try {
													__DEC_message_message_451223 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_451223
															.next();

													// check object __DEC_message_message_451223 is really bound
													JavaSDM.ensure(__DEC_message_message_451223 != null);
													// check isomorphic binding between objects __DEC_message_message_451223 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_451223
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_451223 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_451223
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
										// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
										JavaSDM.ensure(!_edge_fragment
												.equals(_edge_enclosingOperand));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(operand
												.equals(messageSend
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

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

										// check link src from _edge_enclosingOperand to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_enclosingOperand
														.getSrc()));

										// check link src from _edge_fragment to operand
										JavaSDM.ensure(operand
												.equals(_edge_fragment.getSrc()));

										// check link trg from _edge_enclosingOperand to operand
										JavaSDM.ensure(operand
												.equals(_edge_enclosingOperand
														.getTrg()));

										// check link trg from _edge_fragment to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_fragment.getTrg()));

										// check link coveredBy from combo to line
										JavaSDM.ensure(combo.getCovered()
												.contains(line));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend, operand,
														messageReceive, combo,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_381(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_461843 = null;
		InteractionOperand __DEC_messageReceive_fragment_88384 = null;
		Interaction __DEC_messageSend_enclosingInteraction_766757 = null;
		InteractionOperand __DEC_messageSend_fragment_452121 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_755820 = null;
		Message __DEC_messageReceive_receiveEvent_755820 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_733652 = null;
		Message __DEC_messageSend_receiveEvent_733652 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_339197 = null;
		Message __DEC_messageReceive_sendEvent_339197 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_371214 = null;
		Message __DEC_messageSend_sendEvent_371214 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_478746 = null;
		MessageEnd __DEC_message_message_478746 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check link coveredBy from combo to line
			JavaSDM.ensure(combo.getCovered().contains(line));

			// check link coveredBy from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

			// iterate to-many link coveredBy from line to messageSend
			fujaba__Success = false;

			fujaba__IterLineToMessageSend = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageSend.next();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;
					// check link fragment from messageSend to operand
					JavaSDM.ensure(operand.equals(messageSend
							.getEnclosingOperand()));

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

					// check link fragment from messageReceive to operand
					JavaSDM.ensure(operand.equals(messageReceive
							.getEnclosingOperand()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_461843 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_461843 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_461843 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_461843 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_461843
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
							__DEC_messageReceive_fragment_88384 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_88384 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_88384 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_88384 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_88384
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
							__DEC_messageSend_enclosingInteraction_766757 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_766757 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_766757 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_766757 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_766757
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
							__DEC_messageSend_fragment_452121 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_452121 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_452121 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_452121 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_452121
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_755820
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_755820 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_755820
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_755820 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_755820
											.next();

									// check object __DEC_messageReceive_receiveEvent_755820 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_755820 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_755820 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_755820
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_733652
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_733652 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_733652
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_733652 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_733652
											.next();

									// check object __DEC_messageSend_receiveEvent_733652 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_733652 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_733652 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_733652
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_339197
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_339197 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_339197
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_339197 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_339197
											.next();

									// check object __DEC_messageReceive_sendEvent_339197 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_339197 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_339197 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_339197
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_371214
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_371214 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_371214
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_371214 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_371214
											.next();

									// check object __DEC_messageSend_sendEvent_371214 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_371214 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_371214 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_371214
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_478746
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_478746 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_478746
											.hasNext()) {
								try {
									__DEC_message_message_478746 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_478746
											.next();

									// check object __DEC_message_message_478746 is really bound
									JavaSDM.ensure(__DEC_message_message_478746 != null);
									// check isomorphic binding between objects __DEC_message_message_478746 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_478746
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_478746 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_478746
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to operand
						JavaSDM.ensure(operand.equals(messageReceive
								.getEnclosingOperand()));

						// check link fragment from messageSend to operand
						JavaSDM.ensure(operand.equals(messageSend
								.getEnclosingOperand()));

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

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_coveredBy to operand
						JavaSDM.ensure(operand.equals(_edge_coveredBy.getTrg()));

						// check link coveredBy from combo to line
						JavaSDM.ensure(combo.getCovered().contains(line));

						// check link coveredBy from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// check link coveredBy from operand to line
						JavaSDM.ensure(operand.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, operand, messageReceive, combo,
								message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_382(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_760158 = null;
		InteractionOperand __DEC_messageReceive_fragment_461969 = null;
		Interaction __DEC_messageSend_enclosingInteraction_876500 = null;
		InteractionOperand __DEC_messageSend_fragment_63217 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_560323 = null;
		Message __DEC_messageReceive_receiveEvent_560323 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_334113 = null;
		Message __DEC_messageSend_receiveEvent_334113 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_117184 = null;
		Message __DEC_messageReceive_sendEvent_117184 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_688992 = null;
		Message __DEC_messageSend_sendEvent_688992 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_933746 = null;
		MessageEnd __DEC_message_message_933746 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Lifeline line = null;
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

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link coveredBy from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

			// iterate to-many link coveredBy from line to combo
			fujaba__Success = false;

			fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// check link operand from operand to combo
					JavaSDM.ensure(combo.equals(operand.eContainer()));

					// iterate to-many link coveredBy from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check link fragment from messageSend to operand
							JavaSDM.ensure(operand.equals(messageSend
									.getEnclosingOperand()));

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

									// check link trg from _edge_coveredBy to operand
									JavaSDM.ensure(operand
											.equals(_edge_coveredBy.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_760158 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_760158 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_760158 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_760158 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_760158
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
											__DEC_messageReceive_fragment_461969 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_461969 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_461969 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_461969 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_461969
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
											__DEC_messageSend_enclosingInteraction_876500 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_876500 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_876500 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_876500 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_876500
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
											__DEC_messageSend_fragment_63217 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_63217 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_63217 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_63217 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_63217
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_560323
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_560323 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_560323
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_560323 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_560323
															.next();

													// check object __DEC_messageReceive_receiveEvent_560323 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_560323 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_560323 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_560323
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_334113
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_334113 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_334113
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_334113 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_334113
															.next();

													// check object __DEC_messageSend_receiveEvent_334113 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_334113 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_334113 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_334113
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_117184
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_117184 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_117184
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_117184 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_117184
															.next();

													// check object __DEC_messageReceive_sendEvent_117184 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_117184 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_117184 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_117184
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_688992
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_688992 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_688992
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_688992 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_688992
															.next();

													// check object __DEC_messageSend_sendEvent_688992 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_688992 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_688992 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_688992
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_933746
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_933746 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_933746
															.hasNext()) {
												try {
													__DEC_message_message_933746 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_933746
															.next();

													// check object __DEC_message_message_933746 is really bound
													JavaSDM.ensure(__DEC_message_message_933746 != null);
													// check isomorphic binding between objects __DEC_message_message_933746 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_933746
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_933746 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_933746
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
										// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
										JavaSDM.ensure(!_edge_coveredBy
												.equals(_edge_covered));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(operand
												.equals(messageSend
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

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

										// check link coveredBy from combo to line
										JavaSDM.ensure(combo.getCovered()
												.contains(line));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend, operand,
														messageReceive, combo,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_383(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_925277 = null;
		InteractionOperand __DEC_messageReceive_fragment_509938 = null;
		Interaction __DEC_messageSend_enclosingInteraction_536289 = null;
		InteractionOperand __DEC_messageSend_fragment_570621 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_549105 = null;
		Message __DEC_messageReceive_receiveEvent_549105 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_963845 = null;
		Message __DEC_messageSend_receiveEvent_963845 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_916781 = null;
		Message __DEC_messageReceive_sendEvent_916781 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_978431 = null;
		Message __DEC_messageSend_sendEvent_978431 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_905825 = null;
		MessageEnd __DEC_message_message_905825 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
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

			// check link coveredBy from combo to line
			JavaSDM.ensure(combo.getCovered().contains(line));

			// iterate to-many link coveredBy from line to operand
			fujaba__Success = false;

			fujaba__IterLineToOperand = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToOperand.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToOperand.next();

					// ensure correct type and really bound of object operand
					JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
					operand = (InteractionOperand) _TmpObject;
					// check link operand from operand to combo
					JavaSDM.ensure(combo.equals(operand.eContainer()));

					// iterate to-many link coveredBy from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check link fragment from messageSend to operand
							JavaSDM.ensure(operand.equals(messageSend
									.getEnclosingOperand()));

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
									__DEC_messageReceive_enclosingInteraction_925277 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_925277 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_925277 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_925277 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_925277
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
									__DEC_messageReceive_fragment_509938 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_509938 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_509938 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_509938 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_509938
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
									__DEC_messageSend_enclosingInteraction_536289 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_536289 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_536289 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_536289 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_536289
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
									__DEC_messageSend_fragment_570621 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_570621 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_570621 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_570621 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_570621
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_549105
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_549105 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_549105
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_549105 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_549105
													.next();

											// check object __DEC_messageReceive_receiveEvent_549105 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_549105 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_549105 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_549105
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_963845
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_963845 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_963845
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_963845 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_963845
													.next();

											// check object __DEC_messageSend_receiveEvent_963845 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_963845 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_963845 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_963845
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_916781
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_916781 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_916781
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_916781 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_916781
													.next();

											// check object __DEC_messageReceive_sendEvent_916781 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_916781 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_916781 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_916781
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_978431
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_978431 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_978431
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_978431 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_978431
													.next();

											// check object __DEC_messageSend_sendEvent_978431 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_978431 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_978431 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_978431
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_905825
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_905825 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_905825
													.hasNext()) {
										try {
											__DEC_message_message_905825 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_905825
													.next();

											// check object __DEC_message_message_905825 is really bound
											JavaSDM.ensure(__DEC_message_message_905825 != null);
											// check isomorphic binding between objects __DEC_message_message_905825 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_905825
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_905825 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_905825
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
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to combo
								JavaSDM.ensure(combo.equals(_edge_coveredBy
										.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_384(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_430835 = null;
		InteractionOperand __DEC_messageReceive_fragment_122084 = null;
		Interaction __DEC_messageSend_enclosingInteraction_418943 = null;
		InteractionOperand __DEC_messageSend_fragment_86902 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_955813 = null;
		Message __DEC_messageReceive_receiveEvent_955813 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_731163 = null;
		Message __DEC_messageSend_receiveEvent_731163 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_261090 = null;
		Message __DEC_messageReceive_sendEvent_261090 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_116775 = null;
		Message __DEC_messageSend_sendEvent_116775 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_710934 = null;
		MessageEnd __DEC_message_message_710934 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Lifeline line = null;
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

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link coveredBy from combo to line
			JavaSDM.ensure(combo.getCovered().contains(line));

			// iterate to-many link coveredBy from line to messageSend
			fujaba__Success = false;

			fujaba__IterLineToMessageSend = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToMessageSend.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToMessageSend.next();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;
					// bind object
					operand = messageSend.getEnclosingOperand();

					// check object operand is really bound
					JavaSDM.ensure(operand != null);

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

					// check link fragment from messageReceive to operand
					JavaSDM.ensure(operand.equals(messageReceive
							.getEnclosingOperand()));

					// check link message from messageReceive to message
					JavaSDM.ensure(message.equals(messageReceive.getMessage()));

					// check link sendEvent from message to messageSend
					JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

					// check link operand from operand to combo
					JavaSDM.ensure(combo.equals(operand.eContainer()));

					// check link coveredBy from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

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

							// check link trg from _edge_coveredBy to combo
							JavaSDM.ensure(combo.equals(_edge_coveredBy
									.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_430835 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_430835 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_430835 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_430835 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_430835
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
									__DEC_messageReceive_fragment_122084 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_122084 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_122084 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_122084 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_122084
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
									__DEC_messageSend_enclosingInteraction_418943 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_418943 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_418943 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_418943 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_418943
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
									__DEC_messageSend_fragment_86902 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_86902 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_86902 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_86902 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_86902
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_955813
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_955813 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_955813
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_955813 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_955813
													.next();

											// check object __DEC_messageReceive_receiveEvent_955813 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_955813 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_955813 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_955813
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_731163
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_731163 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_731163
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_731163 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_731163
													.next();

											// check object __DEC_messageSend_receiveEvent_731163 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_731163 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_731163 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_731163
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_261090
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_261090 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_261090
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_261090 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_261090
													.next();

											// check object __DEC_messageReceive_sendEvent_261090 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_261090 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_261090 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_261090
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_116775
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_116775 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_116775
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_116775 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_116775
													.next();

											// check object __DEC_messageSend_sendEvent_116775 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_116775 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_116775 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_116775
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_710934
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_710934 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_710934
													.hasNext()) {
										try {
											__DEC_message_message_710934 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_710934
													.next();

											// check object __DEC_message_message_710934 is really bound
											JavaSDM.ensure(__DEC_message_message_710934 != null);
											// check isomorphic binding between objects __DEC_message_message_710934 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_710934
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_710934 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_710934
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
								// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_covered to combo
								JavaSDM.ensure(combo.equals(_edge_covered
										.getSrc()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to line
								JavaSDM.ensure(line.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to combo
								JavaSDM.ensure(combo.equals(_edge_coveredBy
										.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_91(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_781853 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NormalStep step = null;
		UseCase useCase = null;
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
					__DEC_step_steps_781853 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_781853 is really bound
					JavaSDM.ensure(__DEC_step_steps_781853 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_781853.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_781853 and flow 
					JavaSDM.ensure(!__DEC_step_steps_781853.equals(flow));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_92(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_step_steps_647725 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
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
					__DEC_step_steps_647725 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_647725 is really bound
					JavaSDM.ensure(__DEC_step_steps_647725 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_647725.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_647725 and flow 
					JavaSDM.ensure(!__DEC_step_steps_647725.equals(flow));

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_385(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_62065 = null;
		InteractionOperand __DEC_messageReceive_fragment_836170 = null;
		Interaction __DEC_messageSend_enclosingInteraction_857728 = null;
		InteractionOperand __DEC_messageSend_fragment_965017 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_536408 = null;
		Message __DEC_messageReceive_receiveEvent_536408 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_735019 = null;
		Message __DEC_messageSend_receiveEvent_735019 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_123242 = null;
		Message __DEC_messageReceive_sendEvent_123242 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_467780 = null;
		Message __DEC_messageSend_sendEvent_467780 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_525262 = null;
		MessageEnd __DEC_message_message_525262 = null;
		Match match = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
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
			operand = messageSend.getEnclosingOperand();

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

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
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

			// check link message from messageReceive to message
			JavaSDM.ensure(message.equals(messageReceive.getMessage()));

			// check link sendEvent from message to messageSend
			JavaSDM.ensure(messageSend.equals(message.getSendEvent()));

			// check link src from _edge_sendEvent to message
			JavaSDM.ensure(message.equals(_edge_sendEvent.getSrc()));

			// iterate to-many link coveredBy from messageSend to line
			fujaba__Success = false;

			fujaba__IterMessageSendToLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageSendToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link coveredBy from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

					// iterate to-many link coveredBy from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_62065 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_62065 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_62065 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_62065 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_62065
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
									__DEC_messageReceive_fragment_836170 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_836170 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_836170 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_836170 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_836170
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
									__DEC_messageSend_enclosingInteraction_857728 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_857728 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_857728 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_857728 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_857728
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
									__DEC_messageSend_fragment_965017 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_965017 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_965017 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_965017 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_965017
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_536408
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_536408 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_536408
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_536408 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_536408
													.next();

											// check object __DEC_messageReceive_receiveEvent_536408 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_536408 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_536408 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_536408
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_735019
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_735019 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_735019
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_735019 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_735019
													.next();

											// check object __DEC_messageSend_receiveEvent_735019 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_735019 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_735019 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_735019
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_123242
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_123242 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_123242
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_123242 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_123242
													.next();

											// check object __DEC_messageReceive_sendEvent_123242 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_123242 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_123242 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_123242
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_467780
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_467780 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_467780
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_467780 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_467780
													.next();

											// check object __DEC_messageSend_sendEvent_467780 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_467780 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_467780 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_467780
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_525262
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_525262 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_525262
													.hasNext()) {
										try {
											__DEC_message_message_525262 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_525262
													.next();

											// check object __DEC_message_message_525262 is really bound
											JavaSDM.ensure(__DEC_message_message_525262 != null);
											// check isomorphic binding between objects __DEC_message_message_525262 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_525262
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_525262 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_525262
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
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_sendEvent to message
								JavaSDM.ensure(message.equals(_edge_sendEvent
										.getSrc()));

								// check link trg from _edge_sendEvent to messageSend
								JavaSDM.ensure(messageSend
										.equals(_edge_sendEvent.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_386(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_125278 = null;
		InteractionOperand __DEC_messageReceive_fragment_17415 = null;
		Interaction __DEC_messageSend_enclosingInteraction_576275 = null;
		InteractionOperand __DEC_messageSend_fragment_594960 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_154779 = null;
		Message __DEC_messageReceive_receiveEvent_154779 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_789472 = null;
		Message __DEC_messageSend_receiveEvent_789472 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_70022 = null;
		Message __DEC_messageReceive_sendEvent_70022 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_355407 = null;
		Message __DEC_messageSend_sendEvent_355407 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_100118 = null;
		MessageEnd __DEC_message_message_100118 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
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

			// bind object
			operand = messageSend.getEnclosingOperand();

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

			// check link fragment from messageReceive to operand
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// check link trg from _edge_receiveEvent to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_receiveEvent.getTrg()));

			// iterate to-many link coveredBy from messageSend to line
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

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

					// check link coveredBy from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_125278 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_125278 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_125278 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_125278 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_125278
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
							__DEC_messageReceive_fragment_17415 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_17415 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_17415 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_17415 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_17415
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
							__DEC_messageSend_enclosingInteraction_576275 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_576275 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_576275 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_576275 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_576275
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
							__DEC_messageSend_fragment_594960 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_594960 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_594960 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_594960 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_594960
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_154779
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_154779 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_154779
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_154779 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_154779
											.next();

									// check object __DEC_messageReceive_receiveEvent_154779 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_154779 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_154779 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_154779
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_789472
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_789472 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_789472
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_789472 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_789472
											.next();

									// check object __DEC_messageSend_receiveEvent_789472 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_789472 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_789472 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_789472
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_70022
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_70022 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_70022
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_70022 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_70022
											.next();

									// check object __DEC_messageReceive_sendEvent_70022 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_70022 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_70022 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_70022
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_355407
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_355407 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_355407
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_355407 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_355407
											.next();

									// check object __DEC_messageSend_sendEvent_355407 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_355407 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_355407 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_355407
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_100118
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_100118 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_100118
											.hasNext()) {
								try {
									__DEC_message_message_100118 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_100118
											.next();

									// check object __DEC_message_message_100118 is really bound
									JavaSDM.ensure(__DEC_message_message_100118 != null);
									// check isomorphic binding between objects __DEC_message_message_100118 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_100118
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_100118 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_100118
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to operand
						JavaSDM.ensure(operand.equals(messageReceive
								.getEnclosingOperand()));

						// check link fragment from messageSend to operand
						JavaSDM.ensure(operand.equals(messageSend
								.getEnclosingOperand()));

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

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link src from _edge_receiveEvent to message
						JavaSDM.ensure(message.equals(_edge_receiveEvent
								.getSrc()));

						// check link trg from _edge_receiveEvent to messageReceive
						JavaSDM.ensure(messageReceive.equals(_edge_receiveEvent
								.getTrg()));

						// check link coveredBy from combo to line
						JavaSDM.ensure(combo.getCovered().contains(line));

						// check link coveredBy from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// check link coveredBy from operand to line
						JavaSDM.ensure(operand.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, operand, messageReceive, combo,
								message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_387(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_464798 = null;
		InteractionOperand __DEC_messageReceive_fragment_642451 = null;
		Interaction __DEC_messageSend_enclosingInteraction_689808 = null;
		InteractionOperand __DEC_messageSend_fragment_174663 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_966747 = null;
		Message __DEC_messageReceive_receiveEvent_966747 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_629779 = null;
		Message __DEC_messageSend_receiveEvent_629779 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_609510 = null;
		Message __DEC_messageReceive_sendEvent_609510 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_291318 = null;
		Message __DEC_messageSend_sendEvent_291318 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_419867 = null;
		MessageEnd __DEC_message_message_419867 = null;
		Match match = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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

			// check object _edge_interaction is really bound
			JavaSDM.ensure(_edge_interaction != null);
			// bind object
			_TmpObject = _edge_interaction.getTrg();

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
					// iterate to-many link coveredBy from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link coveredBy from line to messageSend
							fujaba__Success = false;

							fujaba__IterLineToMessageSend = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToMessageSend.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToMessageSend
											.next();

									// ensure correct type and really bound of object messageSend
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageSend = (MessageOccurrenceSpecification) _TmpObject;
									// bind object
									operand = messageSend.getEnclosingOperand();

									// check object operand is really bound
									JavaSDM.ensure(operand != null);

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

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// check link src from _edge_interaction to message
									JavaSDM.ensure(message
											.equals(_edge_interaction.getSrc()));

									// check link coveredBy from operand to line
									JavaSDM.ensure(operand.getCovered()
											.contains(line));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_464798 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_464798 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_464798 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_464798 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_464798
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
											__DEC_messageReceive_fragment_642451 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_642451 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_642451 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_642451 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_642451
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
											__DEC_messageSend_enclosingInteraction_689808 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_689808 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_689808 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_689808 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_689808
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
											__DEC_messageSend_fragment_174663 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_174663 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_174663 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_174663 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_174663
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_966747
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_966747 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_966747
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_966747 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_966747
															.next();

													// check object __DEC_messageReceive_receiveEvent_966747 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_966747 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_966747 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_966747
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_629779
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_629779 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_629779
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_629779 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_629779
															.next();

													// check object __DEC_messageSend_receiveEvent_629779 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_629779 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_629779 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_629779
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_609510
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_609510 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_609510
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_609510 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_609510
															.next();

													// check object __DEC_messageReceive_sendEvent_609510 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_609510 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_609510 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_609510
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_291318
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_291318 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_291318
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_291318 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_291318
															.next();

													// check object __DEC_messageSend_sendEvent_291318 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_291318 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_291318 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_291318
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_419867
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_419867 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_419867
															.hasNext()) {
												try {
													__DEC_message_message_419867 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_419867
															.next();

													// check object __DEC_message_message_419867 is really bound
													JavaSDM.ensure(__DEC_message_message_419867 != null);
													// check isomorphic binding between objects __DEC_message_message_419867 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_419867
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_419867 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_419867
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
										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(operand
												.equals(messageSend
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

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

										// check link src from _edge_interaction to message
										JavaSDM.ensure(message
												.equals(_edge_interaction
														.getSrc()));

										// check link trg from _edge_interaction to interaction
										JavaSDM.ensure(interaction
												.equals(_edge_interaction
														.getTrg()));

										// check link coveredBy from combo to line
										JavaSDM.ensure(combo.getCovered()
												.contains(line));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend, operand,
														messageReceive, combo,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_388(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_395571 = null;
		InteractionOperand __DEC_messageReceive_fragment_832809 = null;
		Interaction __DEC_messageSend_enclosingInteraction_791483 = null;
		InteractionOperand __DEC_messageSend_fragment_399386 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_114250 = null;
		Message __DEC_messageReceive_receiveEvent_114250 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_863236 = null;
		Message __DEC_messageSend_receiveEvent_863236 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_7285 = null;
		Message __DEC_messageReceive_sendEvent_7285 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945905 = null;
		Message __DEC_messageSend_sendEvent_945905 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_235912 = null;
		MessageEnd __DEC_message_message_235912 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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
					// iterate to-many link coveredBy from line to messageSend
					fujaba__Success = false;

					fujaba__IterLineToMessageSend = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToMessageSend.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// bind object
							operand = messageSend.getEnclosingOperand();

							// check object operand is really bound
							JavaSDM.ensure(operand != null);

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

							// bind object
							combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object combo is really bound
							JavaSDM.ensure(combo != null);

							// check if contained via correct reference
							JavaSDM.ensure(combo.getOperand().contains(operand));

							// check link trg from _edge_message to message
							JavaSDM.ensure(message.equals(_edge_message
									.getTrg()));

							// check link coveredBy from combo to line
							JavaSDM.ensure(combo.getCovered().contains(line));

							// check link coveredBy from operand to line
							JavaSDM.ensure(operand.getCovered().contains(line));

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_enclosingInteraction_395571 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_395571 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_395571 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_395571 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_395571
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
											__DEC_messageReceive_fragment_832809 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_832809 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_832809 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_832809 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_832809
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
											__DEC_messageSend_enclosingInteraction_791483 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_791483 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_791483 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_791483 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_791483
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
											__DEC_messageSend_fragment_399386 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_399386 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_399386 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_399386 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_399386
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_114250
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_114250 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_114250
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_114250 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_114250
															.next();

													// check object __DEC_messageReceive_receiveEvent_114250 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_114250 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_114250 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_114250
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_863236
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_863236 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_863236
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_863236 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_863236
															.next();

													// check object __DEC_messageSend_receiveEvent_863236 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_863236 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_863236 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_863236
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_7285
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_7285 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_7285
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_7285 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_7285
															.next();

													// check object __DEC_messageReceive_sendEvent_7285 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_7285 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_7285 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_7285
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_945905
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945905 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945905
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_945905 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_945905
															.next();

													// check object __DEC_messageSend_sendEvent_945905 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_945905 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_945905 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_945905
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_235912
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_235912 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_235912
															.hasNext()) {
												try {
													__DEC_message_message_235912 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_235912
															.next();

													// check object __DEC_message_message_235912 is really bound
													JavaSDM.ensure(__DEC_message_message_235912 != null);
													// check isomorphic binding between objects __DEC_message_message_235912 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_235912
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_235912 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_235912
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
										// check isomorphic binding between objects _edge_message and _edge_interaction 
										JavaSDM.ensure(!_edge_message
												.equals(_edge_interaction));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(operand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(operand
												.equals(messageSend
														.getEnclosingOperand()));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

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

										// check link coveredBy from combo to line
										JavaSDM.ensure(combo.getCovered()
												.contains(line));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend, operand,
														messageReceive, combo,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_389(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_746072 = null;
		InteractionOperand __DEC_messageReceive_fragment_241061 = null;
		Interaction __DEC_messageSend_enclosingInteraction_401967 = null;
		InteractionOperand __DEC_messageSend_fragment_542721 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_960341 = null;
		Message __DEC_messageReceive_receiveEvent_960341 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_497403 = null;
		Message __DEC_messageSend_receiveEvent_497403 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827590 = null;
		Message __DEC_messageReceive_sendEvent_827590 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_546833 = null;
		Message __DEC_messageSend_sendEvent_546833 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_729362 = null;
		MessageEnd __DEC_message_message_729362 = null;
		Match match = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		Message message = null;
		InteractionOperand operand = null;
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
			operand = messageSend.getEnclosingOperand();

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

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
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

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

			// check link trg from _edge_message to message
			JavaSDM.ensure(message.equals(_edge_message.getTrg()));

			// iterate to-many link coveredBy from messageSend to line
			fujaba__Success = false;

			fujaba__IterMessageSendToLine = new ArrayList(
					messageSend.getCovered()).iterator();

			while (fujaba__IterMessageSendToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterMessageSendToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

					// check link coveredBy from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_messageReceive_enclosingInteraction_746072 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_746072 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_746072 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_746072 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_746072
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
							__DEC_messageReceive_fragment_241061 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_241061 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_241061 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_241061 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_241061
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
							__DEC_messageSend_enclosingInteraction_401967 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_401967 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_401967 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_401967 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_401967
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
							__DEC_messageSend_fragment_542721 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_542721 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_542721 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_542721 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_542721
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_960341
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_960341 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_960341
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_960341 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_960341
											.next();

									// check object __DEC_messageReceive_receiveEvent_960341 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_960341 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_960341 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_960341
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_497403
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_497403 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_497403
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_497403 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_497403
											.next();

									// check object __DEC_messageSend_receiveEvent_497403 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_497403 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_497403 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_497403
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_827590
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827590 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827590
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_827590 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_827590
											.next();

									// check object __DEC_messageReceive_sendEvent_827590 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_827590 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_827590 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_827590
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_546833
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_546833 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_546833
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_546833 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_546833
											.next();

									// check object __DEC_messageSend_sendEvent_546833 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_546833 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_546833 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_546833
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_729362
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_729362 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_729362
											.hasNext()) {
								try {
									__DEC_message_message_729362 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_729362
											.next();

									// check object __DEC_message_message_729362 is really bound
									JavaSDM.ensure(__DEC_message_message_729362 != null);
									// check isomorphic binding between objects __DEC_message_message_729362 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_729362
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_729362 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_729362
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
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from messageReceive to operand
						JavaSDM.ensure(operand.equals(messageReceive
								.getEnclosingOperand()));

						// check link fragment from messageSend to operand
						JavaSDM.ensure(operand.equals(messageSend
								.getEnclosingOperand()));

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

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link src from _edge_message to messageSend
						JavaSDM.ensure(messageSend.equals(_edge_message
								.getSrc()));

						// check link trg from _edge_message to message
						JavaSDM.ensure(message.equals(_edge_message.getTrg()));

						// check link coveredBy from combo to line
						JavaSDM.ensure(combo.getCovered().contains(line));

						// check link coveredBy from messageSend to line
						JavaSDM.ensure(messageSend.getCovered().contains(line));

						// check link coveredBy from operand to line
						JavaSDM.ensure(operand.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, line,
								messageSend, operand, messageReceive, combo,
								message, interaction);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_390(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_286184 = null;
		InteractionOperand __DEC_messageReceive_fragment_429549 = null;
		Interaction __DEC_messageSend_enclosingInteraction_275895 = null;
		InteractionOperand __DEC_messageSend_fragment_101282 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_620367 = null;
		Message __DEC_messageReceive_receiveEvent_620367 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516581 = null;
		Message __DEC_messageSend_receiveEvent_516581 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_272604 = null;
		Message __DEC_messageReceive_sendEvent_272604 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804850 = null;
		Message __DEC_messageSend_sendEvent_804850 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_538861 = null;
		MessageEnd __DEC_message_message_538861 = null;
		Match match = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
		InteractionOperand operand = null;
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

			// bind object
			operand = messageSend.getEnclosingOperand();

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

			// check link fragment from messageReceive to operand
			JavaSDM.ensure(operand.equals(messageReceive.getEnclosingOperand()));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

			// check link src from _edge_message to messageReceive
			JavaSDM.ensure(messageReceive.equals(_edge_message.getSrc()));

			// iterate to-many link coveredBy from messageSend to line
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

					// check link coveredBy from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

					// iterate to-many link coveredBy from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_286184 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_286184 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_286184 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_286184 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_286184
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
									__DEC_messageReceive_fragment_429549 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_429549 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_429549 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_429549 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_429549
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
									__DEC_messageSend_enclosingInteraction_275895 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_275895 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_275895 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_275895 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_275895
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
									__DEC_messageSend_fragment_101282 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_101282 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_101282 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_101282 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_101282
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_620367
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_620367 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_620367
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_620367 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_620367
													.next();

											// check object __DEC_messageReceive_receiveEvent_620367 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_620367 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_620367 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_620367
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_516581
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516581 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516581
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_516581 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516581
													.next();

											// check object __DEC_messageSend_receiveEvent_516581 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_516581 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_516581 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_516581
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_272604
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_272604 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_272604
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_272604 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_272604
													.next();

											// check object __DEC_messageReceive_sendEvent_272604 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_272604 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_272604 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_272604
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_804850
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804850 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804850
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_804850 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_804850
													.next();

											// check object __DEC_messageSend_sendEvent_804850 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_804850 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_804850 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_804850
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_538861
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_538861 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_538861
													.hasNext()) {
										try {
											__DEC_message_message_538861 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_538861
													.next();

											// check object __DEC_message_message_538861 is really bound
											JavaSDM.ensure(__DEC_message_message_538861 != null);
											// check isomorphic binding between objects __DEC_message_message_538861 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_538861
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_538861 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_538861
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
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(operand.equals(messageReceive
										.getEnclosingOperand()));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(operand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link src from _edge_message to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_message.getSrc()));

								// check link trg from _edge_message to message
								JavaSDM.ensure(message.equals(_edge_message
										.getTrg()));

								// check link coveredBy from combo to line
								JavaSDM.ensure(combo.getCovered()
										.contains(line));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, operand,
										messageReceive, combo, message,
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
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(UseCase) arguments.get(7),
					(UseCaseToInteraction) arguments.get(8),
					(NormalStep) arguments.get(9),
					(Interaction) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(NamedFlow) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(Message) arguments.get(11),
					(Interaction) arguments.get(12),
					(PackageDeclaration) arguments.get(13));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_375__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_375((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_376__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_376((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_377__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_377((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_378__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_378((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_379__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_379((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_380__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_380((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_381__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_381((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_382__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_382((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_383__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_383((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_384__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_384((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_91((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_92((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_385__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_385((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_386__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_386((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_387__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_387((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_388__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_388((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_389__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_389((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_390__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_390((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SystemStepNFToMessageRuleImpl
