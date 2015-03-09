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

import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule;
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
 * An implementation of the model object '<em><b>Alt Step To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltStepToComboRuleImpl extends AbstractRuleImpl implements
		AltStepToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltStepToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltStepToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			UseCase useCase, Flow flow, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __useCase_flows_flow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, step, alt,
					altFlow, useCase, flow, actor));

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
				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object altFlow is really bound
				JavaSDM.ensure(altFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

				// create object __step_stepAlternative_alt
				__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __alt_ref_altFlow
				__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_actor_actor
				__step_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __step_stepAlternative_alt
				__step_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __alt_ref_altFlow
				__alt_ref_altFlow.setName("ref");
				// assign attribute __flow_steps_step
				__flow_steps_step.setName("steps");
				// assign attribute __step_actor_actor
				__step_actor_actor.setName("actor");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						altFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_stepAlternative_alt, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_altFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				__step_stepAlternative_alt.setSrc(step);

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__step_actor_actor.setSrc(step);

				// create link
				__step_stepAlternative_alt.setTrg(alt);

				// create link
				__alt_ref_altFlow.setSrc(alt);

				// create link
				__alt_ref_altFlow.setTrg(altFlow);

				// create link
				__flow_steps_step.setSrc(flow);

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
				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object altFlow is really bound
				JavaSDM.ensure(altFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__useCase_flows_flow.setTrg(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, step, alt, altFlow, useCase,
					flow, actor);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		Flow flow = null;
		Interaction interaction = null;
		Lifeline line = null;
		NormalStep step = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStepToMessage stepToMessage = null;
		NormalStepToCombinedFragment stepToCombo = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageReceive = null;
		InteractionConstraint guard = null;
		FlowToInteractionFragment altFlowToOperand = null;
		LiteralString spec = null;
		Message message = null;
		MessageOccurrenceSpecification messageSend = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge combo__operand__operand = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge combo__covered__line = null;
		EMoflonEdge guard__specification__spec = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
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
			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("altFlow"));

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;
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
			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

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

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object combo
			combo = ModalSequenceDiagramFactory.eINSTANCE
					.createCombinedFragment();

			// create object operand
			operand = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionOperand();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object guard
			guard = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionConstraint();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object spec
			spec = ModalSequenceDiagramFactory.eINSTANCE.createLiteralString();

			// create object message
			message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();

			// create object messageSend
			messageSend = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// assign attribute combo
			combo.setInteractionOperator((ModalSequenceDiagram.InteractionOperatorKind) csp
					.getValue("combo", "interactionOperator"));
			// assign attribute guard
			guard.setName((java.lang.String) csp.getValue("guard", "name"));
			// assign attribute spec
			spec.setValue((java.lang.String) csp.getValue("spec", "value"));
			// assign attribute message
			message.setName((java.lang.String) csp.getValue("message", "name"));

			// create link
			stepToMessage.setSource(step);

			// create link
			stepToCombo.setSource(step);

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			combo.getOperand().add(operand); // add link

			// create link
			line.getCoveredBy().add(combo);

			// create link
			stepToCombo.setTarget(combo);

			// create link
			messageReceive.getCovered().add(line);

			// create link
			operand.getCovered().add(line);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			alternative1ToOperand.setTarget(operand);

			// create link
			guard.setSpecification(spec); // add link to one

			// create link
			altFlowToOperand.setSource(altFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(message,
					messageSend, "sendEvent");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(message,
					messageReceive, "receiveEvent");

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

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altFlowToOperand is really bound
			JavaSDM.ensure(altFlowToOperand != null);
			// check object alternative1ToOperand is really bound
			JavaSDM.ensure(alternative1ToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToCombo is really bound
			JavaSDM.ensure(stepToCombo != null);
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
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "translatedElements");
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
			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altFlowToOperand is really bound
			JavaSDM.ensure(altFlowToOperand != null);
			// check object alternative1ToOperand is really bound
			JavaSDM.ensure(alternative1ToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToCombo is really bound
			JavaSDM.ensure(stepToCombo != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects alt and actor 
			JavaSDM.ensure(!alt.equals(actor));

			// check isomorphic binding between objects altFlow and actor 
			JavaSDM.ensure(!altFlow.equals(actor));

			// check isomorphic binding between objects altFlowToOperand and actor 
			JavaSDM.ensure(!altFlowToOperand.equals(actor));

			// check isomorphic binding between objects alternative1ToOperand and actor 
			JavaSDM.ensure(!alternative1ToOperand.equals(actor));

			// check isomorphic binding between objects combo and actor 
			JavaSDM.ensure(!combo.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects guard and actor 
			JavaSDM.ensure(!guard.equals(actor));

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

			// check isomorphic binding between objects spec and actor 
			JavaSDM.ensure(!spec.equals(actor));

			// check isomorphic binding between objects step and actor 
			JavaSDM.ensure(!step.equals(actor));

			// check isomorphic binding between objects stepToCombo and actor 
			JavaSDM.ensure(!stepToCombo.equals(actor));

			// check isomorphic binding between objects stepToMessage and actor 
			JavaSDM.ensure(!stepToMessage.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects alt and actorToLine 
			JavaSDM.ensure(!alt.equals(actorToLine));

			// check isomorphic binding between objects altFlow and actorToLine 
			JavaSDM.ensure(!altFlow.equals(actorToLine));

			// check isomorphic binding between objects altFlowToOperand and actorToLine 
			JavaSDM.ensure(!altFlowToOperand.equals(actorToLine));

			// check isomorphic binding between objects alternative1ToOperand and actorToLine 
			JavaSDM.ensure(!alternative1ToOperand.equals(actorToLine));

			// check isomorphic binding between objects combo and actorToLine 
			JavaSDM.ensure(!combo.equals(actorToLine));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects guard and actorToLine 
			JavaSDM.ensure(!guard.equals(actorToLine));

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

			// check isomorphic binding between objects spec and actorToLine 
			JavaSDM.ensure(!spec.equals(actorToLine));

			// check isomorphic binding between objects step and actorToLine 
			JavaSDM.ensure(!step.equals(actorToLine));

			// check isomorphic binding between objects stepToCombo and actorToLine 
			JavaSDM.ensure(!stepToCombo.equals(actorToLine));

			// check isomorphic binding between objects stepToMessage and actorToLine 
			JavaSDM.ensure(!stepToMessage.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

			// check isomorphic binding between objects altFlow and alt 
			JavaSDM.ensure(!altFlow.equals(alt));

			// check isomorphic binding between objects altFlowToOperand and alt 
			JavaSDM.ensure(!altFlowToOperand.equals(alt));

			// check isomorphic binding between objects alternative1ToOperand and alt 
			JavaSDM.ensure(!alternative1ToOperand.equals(alt));

			// check isomorphic binding between objects combo and alt 
			JavaSDM.ensure(!combo.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects interaction and alt 
			JavaSDM.ensure(!interaction.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

			// check isomorphic binding between objects message and alt 
			JavaSDM.ensure(!message.equals(alt));

			// check isomorphic binding between objects messageReceive and alt 
			JavaSDM.ensure(!messageReceive.equals(alt));

			// check isomorphic binding between objects messageSend and alt 
			JavaSDM.ensure(!messageSend.equals(alt));

			// check isomorphic binding between objects operand and alt 
			JavaSDM.ensure(!operand.equals(alt));

			// check isomorphic binding between objects spec and alt 
			JavaSDM.ensure(!spec.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects stepToCombo and alt 
			JavaSDM.ensure(!stepToCombo.equals(alt));

			// check isomorphic binding between objects stepToMessage and alt 
			JavaSDM.ensure(!stepToMessage.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects useCaseToInteraction and alt 
			JavaSDM.ensure(!useCaseToInteraction.equals(alt));

			// check isomorphic binding between objects altFlowToOperand and altFlow 
			JavaSDM.ensure(!altFlowToOperand.equals(altFlow));

			// check isomorphic binding between objects alternative1ToOperand and altFlow 
			JavaSDM.ensure(!alternative1ToOperand.equals(altFlow));

			// check isomorphic binding between objects combo and altFlow 
			JavaSDM.ensure(!combo.equals(altFlow));

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects interaction and altFlow 
			JavaSDM.ensure(!interaction.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

			// check isomorphic binding between objects message and altFlow 
			JavaSDM.ensure(!message.equals(altFlow));

			// check isomorphic binding between objects messageReceive and altFlow 
			JavaSDM.ensure(!messageReceive.equals(altFlow));

			// check isomorphic binding between objects messageSend and altFlow 
			JavaSDM.ensure(!messageSend.equals(altFlow));

			// check isomorphic binding between objects operand and altFlow 
			JavaSDM.ensure(!operand.equals(altFlow));

			// check isomorphic binding between objects spec and altFlow 
			JavaSDM.ensure(!spec.equals(altFlow));

			// check isomorphic binding between objects step and altFlow 
			JavaSDM.ensure(!step.equals(altFlow));

			// check isomorphic binding between objects stepToCombo and altFlow 
			JavaSDM.ensure(!stepToCombo.equals(altFlow));

			// check isomorphic binding between objects stepToMessage and altFlow 
			JavaSDM.ensure(!stepToMessage.equals(altFlow));

			// check isomorphic binding between objects useCase and altFlow 
			JavaSDM.ensure(!useCase.equals(altFlow));

			// check isomorphic binding between objects useCaseToInteraction and altFlow 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlow));

			// check isomorphic binding between objects alternative1ToOperand and altFlowToOperand 
			JavaSDM.ensure(!alternative1ToOperand.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and altFlowToOperand 
			JavaSDM.ensure(!combo.equals(altFlowToOperand));

			// check isomorphic binding between objects flow and altFlowToOperand 
			JavaSDM.ensure(!flow.equals(altFlowToOperand));

			// check isomorphic binding between objects guard and altFlowToOperand 
			JavaSDM.ensure(!guard.equals(altFlowToOperand));

			// check isomorphic binding between objects interaction and altFlowToOperand 
			JavaSDM.ensure(!interaction.equals(altFlowToOperand));

			// check isomorphic binding between objects line and altFlowToOperand 
			JavaSDM.ensure(!line.equals(altFlowToOperand));

			// check isomorphic binding between objects message and altFlowToOperand 
			JavaSDM.ensure(!message.equals(altFlowToOperand));

			// check isomorphic binding between objects messageReceive and altFlowToOperand 
			JavaSDM.ensure(!messageReceive.equals(altFlowToOperand));

			// check isomorphic binding between objects messageSend and altFlowToOperand 
			JavaSDM.ensure(!messageSend.equals(altFlowToOperand));

			// check isomorphic binding between objects operand and altFlowToOperand 
			JavaSDM.ensure(!operand.equals(altFlowToOperand));

			// check isomorphic binding between objects spec and altFlowToOperand 
			JavaSDM.ensure(!spec.equals(altFlowToOperand));

			// check isomorphic binding between objects step and altFlowToOperand 
			JavaSDM.ensure(!step.equals(altFlowToOperand));

			// check isomorphic binding between objects stepToCombo and altFlowToOperand 
			JavaSDM.ensure(!stepToCombo.equals(altFlowToOperand));

			// check isomorphic binding between objects stepToMessage and altFlowToOperand 
			JavaSDM.ensure(!stepToMessage.equals(altFlowToOperand));

			// check isomorphic binding between objects useCase and altFlowToOperand 
			JavaSDM.ensure(!useCase.equals(altFlowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and altFlowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and alternative1ToOperand 
			JavaSDM.ensure(!combo.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and alternative1ToOperand 
			JavaSDM.ensure(!flow.equals(alternative1ToOperand));

			// check isomorphic binding between objects guard and alternative1ToOperand 
			JavaSDM.ensure(!guard.equals(alternative1ToOperand));

			// check isomorphic binding between objects interaction and alternative1ToOperand 
			JavaSDM.ensure(!interaction.equals(alternative1ToOperand));

			// check isomorphic binding between objects line and alternative1ToOperand 
			JavaSDM.ensure(!line.equals(alternative1ToOperand));

			// check isomorphic binding between objects message and alternative1ToOperand 
			JavaSDM.ensure(!message.equals(alternative1ToOperand));

			// check isomorphic binding between objects messageReceive and alternative1ToOperand 
			JavaSDM.ensure(!messageReceive.equals(alternative1ToOperand));

			// check isomorphic binding between objects messageSend and alternative1ToOperand 
			JavaSDM.ensure(!messageSend.equals(alternative1ToOperand));

			// check isomorphic binding between objects operand and alternative1ToOperand 
			JavaSDM.ensure(!operand.equals(alternative1ToOperand));

			// check isomorphic binding between objects spec and alternative1ToOperand 
			JavaSDM.ensure(!spec.equals(alternative1ToOperand));

			// check isomorphic binding between objects step and alternative1ToOperand 
			JavaSDM.ensure(!step.equals(alternative1ToOperand));

			// check isomorphic binding between objects stepToCombo and alternative1ToOperand 
			JavaSDM.ensure(!stepToCombo.equals(alternative1ToOperand));

			// check isomorphic binding between objects stepToMessage and alternative1ToOperand 
			JavaSDM.ensure(!stepToMessage.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCase and alternative1ToOperand 
			JavaSDM.ensure(!useCase.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCaseToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

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

			// check isomorphic binding between objects spec and combo 
			JavaSDM.ensure(!spec.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToCombo and combo 
			JavaSDM.ensure(!stepToCombo.equals(combo));

			// check isomorphic binding between objects stepToMessage and combo 
			JavaSDM.ensure(!stepToMessage.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects useCaseToInteraction and combo 
			JavaSDM.ensure(!useCaseToInteraction.equals(combo));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

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

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects stepToMessage and flow 
			JavaSDM.ensure(!stepToMessage.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and guard 
			JavaSDM.ensure(!interaction.equals(guard));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

			// check isomorphic binding between objects message and guard 
			JavaSDM.ensure(!message.equals(guard));

			// check isomorphic binding between objects messageReceive and guard 
			JavaSDM.ensure(!messageReceive.equals(guard));

			// check isomorphic binding between objects messageSend and guard 
			JavaSDM.ensure(!messageSend.equals(guard));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects stepToMessage and guard 
			JavaSDM.ensure(!stepToMessage.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects useCaseToInteraction and guard 
			JavaSDM.ensure(!useCaseToInteraction.equals(guard));

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

			// check isomorphic binding between objects spec and interaction 
			JavaSDM.ensure(!spec.equals(interaction));

			// check isomorphic binding between objects step and interaction 
			JavaSDM.ensure(!step.equals(interaction));

			// check isomorphic binding between objects stepToCombo and interaction 
			JavaSDM.ensure(!stepToCombo.equals(interaction));

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

			// check isomorphic binding between objects spec and line 
			JavaSDM.ensure(!spec.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToCombo and line 
			JavaSDM.ensure(!stepToCombo.equals(line));

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

			// check isomorphic binding between objects spec and message 
			JavaSDM.ensure(!spec.equals(message));

			// check isomorphic binding between objects step and message 
			JavaSDM.ensure(!step.equals(message));

			// check isomorphic binding between objects stepToCombo and message 
			JavaSDM.ensure(!stepToCombo.equals(message));

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

			// check isomorphic binding between objects spec and messageReceive 
			JavaSDM.ensure(!spec.equals(messageReceive));

			// check isomorphic binding between objects step and messageReceive 
			JavaSDM.ensure(!step.equals(messageReceive));

			// check isomorphic binding between objects stepToCombo and messageReceive 
			JavaSDM.ensure(!stepToCombo.equals(messageReceive));

			// check isomorphic binding between objects stepToMessage and messageReceive 
			JavaSDM.ensure(!stepToMessage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToInteraction and messageReceive 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageReceive));

			// check isomorphic binding between objects operand and messageSend 
			JavaSDM.ensure(!operand.equals(messageSend));

			// check isomorphic binding between objects spec and messageSend 
			JavaSDM.ensure(!spec.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToCombo and messageSend 
			JavaSDM.ensure(!stepToCombo.equals(messageSend));

			// check isomorphic binding between objects stepToMessage and messageSend 
			JavaSDM.ensure(!stepToMessage.equals(messageSend));

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects stepToMessage and operand 
			JavaSDM.ensure(!stepToMessage.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects stepToMessage and spec 
			JavaSDM.ensure(!stepToMessage.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects stepToMessage and stepToCombo 
			JavaSDM.ensure(!stepToMessage.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltStepToComboRule");
			// assign attribute __step_stepAlternative_alt
			__step_stepAlternative_alt.setName("stepAlternative");
			// assign attribute __alt_ref_altFlow
			__alt_ref_altFlow.setName("ref");
			// assign attribute combo__operand__operand
			combo__operand__operand.setName("operand");
			// assign attribute line__coveredBy__combo
			line__coveredBy__combo.setName("coveredBy");
			// assign attribute combo__covered__line
			combo__covered__line.setName("covered");
			// assign attribute line__coveredBy__operand
			line__coveredBy__operand.setName("coveredBy");
			// assign attribute operand__covered__line
			operand__covered__line.setName("covered");
			// assign attribute stepToCombo__source__step
			stepToCombo__source__step.setName("source");
			// assign attribute stepToCombo__target__combo
			stepToCombo__target__combo.setName("target");
			// assign attribute operand__guard__guard
			operand__guard__guard.setName("guard");
			// assign attribute alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt.setName("source");
			// assign attribute alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand.setName("target");
			// assign attribute guard__specification__spec
			guard__specification__spec.setName("specification");
			// assign attribute altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow.setName("source");
			// assign attribute altFlowToOperand__target__operand
			altFlowToOperand__target__operand.setName("target");
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
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			__step_stepAlternative_alt.setSrc(step);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			__alt_ref_altFlow.setSrc(alt);

			// create link
			__step_stepAlternative_alt.setTrg(alt);

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			// create link
			line__coveredBy__combo.setSrc(line);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			combo__covered__line.setTrg(line);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			guard__specification__spec.setSrc(guard);

			// create link
			operand__guard__guard.setTrg(guard);

			// create link
			guard__specification__spec.setTrg(spec);

			// create link
			altFlowToOperand__source__altFlow.setTrg(altFlow);

			// create link
			__alt_ref_altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

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
			line__coveredBy__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__covered__line.setSrc(messageReceive);

			// create link
			message__receiveEvent__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__message__message.setSrc(messageReceive);

			// create link
			__step_actor_actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, step, alt, combo, line,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand, useCase, useCaseToInteraction, flow,
				message, interaction, stepToMessage, messageSend,
				messageReceive, actor, actorToLine);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		Flow flow = null;
		NormalStep step = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
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
			ruleresult.setRule("AltStepToComboRule");

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
			_TmpObject = (match.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (match.getObject("altFlow"));

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
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
			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

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
								// check object alt is really bound
								JavaSDM.ensure(alt != null);
								// check object altFlow is really bound
								JavaSDM.ensure(altFlow != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object line is really bound
								JavaSDM.ensure(line != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check isomorphic binding between objects flow and altFlow 
								JavaSDM.ensure(!flow.equals(altFlow));

								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link ref from alt to altFlow
								JavaSDM.ensure(altFlow.equals(alt.getRef()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link source from actorToLine to actor
								JavaSDM.ensure(actor.equals(actorToLine
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link stepAlternative from alt to step
								JavaSDM.ensure(step.equals(alt.eContainer()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from actorToLine to line
								JavaSDM.ensure(line.equals(actorToLine
										.getTarget()));

								// check link target from useCaseToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(useCaseToInteraction
												.getTarget()));

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __step_actor_actor
								__step_actor_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __flow_steps_step
								__flow_steps_step = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __step_stepAlternative_alt
								__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __alt_ref_altFlow
								__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __actorToLine_target_line
								__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __interaction_lifeline_line
								__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __line_interaction_interaction
								__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCase_flows_flow
								__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCaseToInteraction_source_useCase
								__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCaseToInteraction_target_interaction
								__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __actorToLine_source_actor
								__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __step_stepAlternative_alt
								__step_stepAlternative_alt
										.setName("stepAlternative");
								// assign attribute __alt_ref_altFlow
								__alt_ref_altFlow.setName("ref");
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

								// create link
								isApplicableMatch.getAllContextElements().add(
										step);

								// create link
								__step_actor_actor.setSrc(step);

								// create link
								__flow_steps_step.setTrg(step);

								// create link
								__step_stepAlternative_alt.setSrc(step);

								// create link
								__alt_ref_altFlow.setSrc(alt);

								// create link
								__step_stepAlternative_alt.setTrg(alt);

								// create link
								isApplicableMatch.getAllContextElements().add(
										alt);

								// create link
								__actorToLine_target_line.setTrg(line);

								// create link
								__interaction_lifeline_line.setTrg(line);

								// create link
								__line_interaction_interaction.setSrc(line);

								// create link
								isApplicableMatch.getAllContextElements().add(
										line);

								// create link
								isApplicableMatch.getAllContextElements().add(
										altFlow);

								// create link
								__alt_ref_altFlow.setTrg(altFlow);

								// create link
								__useCase_flows_flow.setSrc(useCase);

								// create link
								__useCaseToInteraction_source_useCase
										.setTrg(useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								__useCaseToInteraction_target_interaction
										.setSrc(useCaseToInteraction);

								// create link
								__useCaseToInteraction_source_useCase
										.setSrc(useCaseToInteraction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCaseToInteraction);

								// create link
								__flow_steps_step.setSrc(flow);

								// create link
								__useCase_flows_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										interaction);

								// create link
								__useCaseToInteraction_target_interaction
										.setTrg(interaction);

								// create link
								__line_interaction_interaction
										.setTrg(interaction);

								// create link
								__interaction_lifeline_line.setSrc(interaction);

								// create link
								__actorToLine_source_actor.setTrg(actor);

								// create link
								__step_actor_actor.setTrg(actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actorToLine);

								// create link
								__actorToLine_source_actor.setSrc(actorToLine);

								// create link
								__actorToLine_target_line.setSrc(actorToLine);

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
												__actorToLine_target_line,
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
												__alt_ref_altFlow,
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
												__flow_steps_step,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__step_stepAlternative_alt,
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
												__useCaseToInteraction_target_interaction,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch, step,
													alt, line, altFlow,
													useCase,
													useCaseToInteraction, flow,
													interaction, actor,
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
												.setRuleName("AltStepToComboRule");
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
	public void registerObjectsToMatch_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			UseCase useCase, Flow flow, Actor actor) {
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			UseCase useCase, Flow flow, Actor actor) {
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
			NormalStep step, AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			Interaction interaction, Actor actor, ActorToLifeline actorToLine) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("alt");
		literal0.setType("String");

		// Create attribute variables
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", true, csp);
		var_altFlow_name.setValue(altFlow.getName());
		var_altFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", true, csp);
		var_step_name.setValue(step.getName());
		var_step_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("");
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator.setType("EObject");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqInterOperKind);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);
		eq_1.setRuleName("");
		eq_1.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("altFlow", altFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("actor", actor);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject step,
			EObject alt, EObject combo, EObject line, EObject stepToCombo,
			EObject operand, EObject alternative1ToOperand, EObject guard,
			EObject spec, EObject altFlow, EObject altFlowToOperand,
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject messageSend, EObject messageReceive, EObject actor,
			EObject actorToLine) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("step")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getNormalStep())
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative())
				&& match.getObject("altFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, CombinedFragment combo,
			Lifeline line, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
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
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, combo, line,
					operand, guard, spec, message, interaction, messageSend,
					messageReceive));

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
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
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
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
				// assign attribute __line_coveredBy_combo
				__line_coveredBy_combo.setName("coveredBy");
				// assign attribute __combo_covered_line
				__combo_covered_line.setName("covered");
				// assign attribute __line_coveredBy_operand
				__line_coveredBy_operand.setName("coveredBy");
				// assign attribute __operand_covered_line
				__operand_covered_line.setName("covered");
				// assign attribute __operand_guard_guard
				__operand_guard_guard.setName("guard");
				// assign attribute __guard_specification_spec
				__guard_specification_spec.setName("specification");
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
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__operand_guard_guard.setSrc(operand);

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__guard_specification_spec.setSrc(guard);

				// create link
				__operand_guard_guard.setTrg(guard);

				// create link
				__guard_specification_spec.setTrg(spec);

				// create link
				__messageSend_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__message_interaction_interaction.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object combo is really bound
				JavaSDM.ensure(combo != null);
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
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
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
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
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

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
			this.registerObjectsToMatch_BWD(match, combo, line, operand, guard,
					spec, message, interaction, messageSend, messageReceive);
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
		Flow flow = null;
		InteractionConstraint guard = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		AlternativeFlowAlternative alt = null;
		NormalStepToCombinedFragment stepToCombo = null;
		NormalStepToMessage stepToMessage = null;
		AlternativeFlow altFlow = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		FlowToInteractionFragment altFlowToOperand = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge step__stepAlternative__alt = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge altFlowToOperand__target__operand = null;

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("guard"));

			// ensure correct type and really bound of object guard
			JavaSDM.ensure(_TmpObject instanceof InteractionConstraint);
			guard = (InteractionConstraint) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("spec"));

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;
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

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// create object altFlow
			altFlow = UseCaseDSLFactory.eINSTANCE.createAlternativeFlow();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// assign attribute step
			step.setName((java.lang.String) csp.getValue("step", "name"));
			// assign attribute alt
			alt.setCondition((java.lang.String) csp
					.getValue("alt", "condition"));
			// assign attribute altFlow
			altFlow.setName((java.lang.String) csp.getValue("altFlow", "name"));

			// create link
			stepToMessage.setTarget(message);

			// create link
			step.getStepAlternative().add(alt); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(step, actor,
					"actor");

			// create link
			stepToCombo.setSource(step);

			// create link
			stepToMessage.setSource(step);

			// create link
			flow.getSteps().add(step);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt, altFlow,
					"ref");

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			stepToCombo.setTarget(combo);

			// create link
			alternative1ToOperand.setTarget(operand);

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			altFlowToOperand.setSource(altFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altFlowToOperand is really bound
			JavaSDM.ensure(altFlowToOperand != null);
			// check object alternative1ToOperand is really bound
			JavaSDM.ensure(alternative1ToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object message is really bound
			JavaSDM.ensure(message != null);
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToCombo is really bound
			JavaSDM.ensure(stepToCombo != null);
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
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

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
			// check object actorToLine is really bound
			JavaSDM.ensure(actorToLine != null);
			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altFlowToOperand is really bound
			JavaSDM.ensure(altFlowToOperand != null);
			// check object alternative1ToOperand is really bound
			JavaSDM.ensure(alternative1ToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object stepToCombo is really bound
			JavaSDM.ensure(stepToCombo != null);
			// check object stepToMessage is really bound
			JavaSDM.ensure(stepToMessage != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects actorToLine and actor 
			JavaSDM.ensure(!actorToLine.equals(actor));

			// check isomorphic binding between objects alt and actor 
			JavaSDM.ensure(!alt.equals(actor));

			// check isomorphic binding between objects altFlow and actor 
			JavaSDM.ensure(!altFlow.equals(actor));

			// check isomorphic binding between objects altFlowToOperand and actor 
			JavaSDM.ensure(!altFlowToOperand.equals(actor));

			// check isomorphic binding between objects alternative1ToOperand and actor 
			JavaSDM.ensure(!alternative1ToOperand.equals(actor));

			// check isomorphic binding between objects combo and actor 
			JavaSDM.ensure(!combo.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects guard and actor 
			JavaSDM.ensure(!guard.equals(actor));

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

			// check isomorphic binding between objects spec and actor 
			JavaSDM.ensure(!spec.equals(actor));

			// check isomorphic binding between objects step and actor 
			JavaSDM.ensure(!step.equals(actor));

			// check isomorphic binding between objects stepToCombo and actor 
			JavaSDM.ensure(!stepToCombo.equals(actor));

			// check isomorphic binding between objects stepToMessage and actor 
			JavaSDM.ensure(!stepToMessage.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

			// check isomorphic binding between objects alt and actorToLine 
			JavaSDM.ensure(!alt.equals(actorToLine));

			// check isomorphic binding between objects altFlow and actorToLine 
			JavaSDM.ensure(!altFlow.equals(actorToLine));

			// check isomorphic binding between objects altFlowToOperand and actorToLine 
			JavaSDM.ensure(!altFlowToOperand.equals(actorToLine));

			// check isomorphic binding between objects alternative1ToOperand and actorToLine 
			JavaSDM.ensure(!alternative1ToOperand.equals(actorToLine));

			// check isomorphic binding between objects combo and actorToLine 
			JavaSDM.ensure(!combo.equals(actorToLine));

			// check isomorphic binding between objects flow and actorToLine 
			JavaSDM.ensure(!flow.equals(actorToLine));

			// check isomorphic binding between objects guard and actorToLine 
			JavaSDM.ensure(!guard.equals(actorToLine));

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

			// check isomorphic binding between objects spec and actorToLine 
			JavaSDM.ensure(!spec.equals(actorToLine));

			// check isomorphic binding between objects step and actorToLine 
			JavaSDM.ensure(!step.equals(actorToLine));

			// check isomorphic binding between objects stepToCombo and actorToLine 
			JavaSDM.ensure(!stepToCombo.equals(actorToLine));

			// check isomorphic binding between objects stepToMessage and actorToLine 
			JavaSDM.ensure(!stepToMessage.equals(actorToLine));

			// check isomorphic binding between objects useCase and actorToLine 
			JavaSDM.ensure(!useCase.equals(actorToLine));

			// check isomorphic binding between objects useCaseToInteraction and actorToLine 
			JavaSDM.ensure(!useCaseToInteraction.equals(actorToLine));

			// check isomorphic binding between objects altFlow and alt 
			JavaSDM.ensure(!altFlow.equals(alt));

			// check isomorphic binding between objects altFlowToOperand and alt 
			JavaSDM.ensure(!altFlowToOperand.equals(alt));

			// check isomorphic binding between objects alternative1ToOperand and alt 
			JavaSDM.ensure(!alternative1ToOperand.equals(alt));

			// check isomorphic binding between objects combo and alt 
			JavaSDM.ensure(!combo.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects interaction and alt 
			JavaSDM.ensure(!interaction.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

			// check isomorphic binding between objects message and alt 
			JavaSDM.ensure(!message.equals(alt));

			// check isomorphic binding between objects messageReceive and alt 
			JavaSDM.ensure(!messageReceive.equals(alt));

			// check isomorphic binding between objects messageSend and alt 
			JavaSDM.ensure(!messageSend.equals(alt));

			// check isomorphic binding between objects operand and alt 
			JavaSDM.ensure(!operand.equals(alt));

			// check isomorphic binding between objects spec and alt 
			JavaSDM.ensure(!spec.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects stepToCombo and alt 
			JavaSDM.ensure(!stepToCombo.equals(alt));

			// check isomorphic binding between objects stepToMessage and alt 
			JavaSDM.ensure(!stepToMessage.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects useCaseToInteraction and alt 
			JavaSDM.ensure(!useCaseToInteraction.equals(alt));

			// check isomorphic binding between objects altFlowToOperand and altFlow 
			JavaSDM.ensure(!altFlowToOperand.equals(altFlow));

			// check isomorphic binding between objects alternative1ToOperand and altFlow 
			JavaSDM.ensure(!alternative1ToOperand.equals(altFlow));

			// check isomorphic binding between objects combo and altFlow 
			JavaSDM.ensure(!combo.equals(altFlow));

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects interaction and altFlow 
			JavaSDM.ensure(!interaction.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

			// check isomorphic binding between objects message and altFlow 
			JavaSDM.ensure(!message.equals(altFlow));

			// check isomorphic binding between objects messageReceive and altFlow 
			JavaSDM.ensure(!messageReceive.equals(altFlow));

			// check isomorphic binding between objects messageSend and altFlow 
			JavaSDM.ensure(!messageSend.equals(altFlow));

			// check isomorphic binding between objects operand and altFlow 
			JavaSDM.ensure(!operand.equals(altFlow));

			// check isomorphic binding between objects spec and altFlow 
			JavaSDM.ensure(!spec.equals(altFlow));

			// check isomorphic binding between objects step and altFlow 
			JavaSDM.ensure(!step.equals(altFlow));

			// check isomorphic binding between objects stepToCombo and altFlow 
			JavaSDM.ensure(!stepToCombo.equals(altFlow));

			// check isomorphic binding between objects stepToMessage and altFlow 
			JavaSDM.ensure(!stepToMessage.equals(altFlow));

			// check isomorphic binding between objects useCase and altFlow 
			JavaSDM.ensure(!useCase.equals(altFlow));

			// check isomorphic binding between objects useCaseToInteraction and altFlow 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlow));

			// check isomorphic binding between objects alternative1ToOperand and altFlowToOperand 
			JavaSDM.ensure(!alternative1ToOperand.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and altFlowToOperand 
			JavaSDM.ensure(!combo.equals(altFlowToOperand));

			// check isomorphic binding between objects flow and altFlowToOperand 
			JavaSDM.ensure(!flow.equals(altFlowToOperand));

			// check isomorphic binding between objects guard and altFlowToOperand 
			JavaSDM.ensure(!guard.equals(altFlowToOperand));

			// check isomorphic binding between objects interaction and altFlowToOperand 
			JavaSDM.ensure(!interaction.equals(altFlowToOperand));

			// check isomorphic binding between objects line and altFlowToOperand 
			JavaSDM.ensure(!line.equals(altFlowToOperand));

			// check isomorphic binding between objects message and altFlowToOperand 
			JavaSDM.ensure(!message.equals(altFlowToOperand));

			// check isomorphic binding between objects messageReceive and altFlowToOperand 
			JavaSDM.ensure(!messageReceive.equals(altFlowToOperand));

			// check isomorphic binding between objects messageSend and altFlowToOperand 
			JavaSDM.ensure(!messageSend.equals(altFlowToOperand));

			// check isomorphic binding between objects operand and altFlowToOperand 
			JavaSDM.ensure(!operand.equals(altFlowToOperand));

			// check isomorphic binding between objects spec and altFlowToOperand 
			JavaSDM.ensure(!spec.equals(altFlowToOperand));

			// check isomorphic binding between objects step and altFlowToOperand 
			JavaSDM.ensure(!step.equals(altFlowToOperand));

			// check isomorphic binding between objects stepToCombo and altFlowToOperand 
			JavaSDM.ensure(!stepToCombo.equals(altFlowToOperand));

			// check isomorphic binding between objects stepToMessage and altFlowToOperand 
			JavaSDM.ensure(!stepToMessage.equals(altFlowToOperand));

			// check isomorphic binding between objects useCase and altFlowToOperand 
			JavaSDM.ensure(!useCase.equals(altFlowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and altFlowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and alternative1ToOperand 
			JavaSDM.ensure(!combo.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and alternative1ToOperand 
			JavaSDM.ensure(!flow.equals(alternative1ToOperand));

			// check isomorphic binding between objects guard and alternative1ToOperand 
			JavaSDM.ensure(!guard.equals(alternative1ToOperand));

			// check isomorphic binding between objects interaction and alternative1ToOperand 
			JavaSDM.ensure(!interaction.equals(alternative1ToOperand));

			// check isomorphic binding between objects line and alternative1ToOperand 
			JavaSDM.ensure(!line.equals(alternative1ToOperand));

			// check isomorphic binding between objects message and alternative1ToOperand 
			JavaSDM.ensure(!message.equals(alternative1ToOperand));

			// check isomorphic binding between objects messageReceive and alternative1ToOperand 
			JavaSDM.ensure(!messageReceive.equals(alternative1ToOperand));

			// check isomorphic binding between objects messageSend and alternative1ToOperand 
			JavaSDM.ensure(!messageSend.equals(alternative1ToOperand));

			// check isomorphic binding between objects operand and alternative1ToOperand 
			JavaSDM.ensure(!operand.equals(alternative1ToOperand));

			// check isomorphic binding between objects spec and alternative1ToOperand 
			JavaSDM.ensure(!spec.equals(alternative1ToOperand));

			// check isomorphic binding between objects step and alternative1ToOperand 
			JavaSDM.ensure(!step.equals(alternative1ToOperand));

			// check isomorphic binding between objects stepToCombo and alternative1ToOperand 
			JavaSDM.ensure(!stepToCombo.equals(alternative1ToOperand));

			// check isomorphic binding between objects stepToMessage and alternative1ToOperand 
			JavaSDM.ensure(!stepToMessage.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCase and alternative1ToOperand 
			JavaSDM.ensure(!useCase.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCaseToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

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

			// check isomorphic binding between objects spec and combo 
			JavaSDM.ensure(!spec.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToCombo and combo 
			JavaSDM.ensure(!stepToCombo.equals(combo));

			// check isomorphic binding between objects stepToMessage and combo 
			JavaSDM.ensure(!stepToMessage.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects useCaseToInteraction and combo 
			JavaSDM.ensure(!useCaseToInteraction.equals(combo));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

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

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects stepToMessage and flow 
			JavaSDM.ensure(!stepToMessage.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects useCaseToInteraction and flow 
			JavaSDM.ensure(!useCaseToInteraction.equals(flow));

			// check isomorphic binding between objects interaction and guard 
			JavaSDM.ensure(!interaction.equals(guard));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

			// check isomorphic binding between objects message and guard 
			JavaSDM.ensure(!message.equals(guard));

			// check isomorphic binding between objects messageReceive and guard 
			JavaSDM.ensure(!messageReceive.equals(guard));

			// check isomorphic binding between objects messageSend and guard 
			JavaSDM.ensure(!messageSend.equals(guard));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects stepToMessage and guard 
			JavaSDM.ensure(!stepToMessage.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects useCaseToInteraction and guard 
			JavaSDM.ensure(!useCaseToInteraction.equals(guard));

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

			// check isomorphic binding between objects spec and interaction 
			JavaSDM.ensure(!spec.equals(interaction));

			// check isomorphic binding between objects step and interaction 
			JavaSDM.ensure(!step.equals(interaction));

			// check isomorphic binding between objects stepToCombo and interaction 
			JavaSDM.ensure(!stepToCombo.equals(interaction));

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

			// check isomorphic binding between objects spec and line 
			JavaSDM.ensure(!spec.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToCombo and line 
			JavaSDM.ensure(!stepToCombo.equals(line));

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

			// check isomorphic binding between objects spec and message 
			JavaSDM.ensure(!spec.equals(message));

			// check isomorphic binding between objects step and message 
			JavaSDM.ensure(!step.equals(message));

			// check isomorphic binding between objects stepToCombo and message 
			JavaSDM.ensure(!stepToCombo.equals(message));

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

			// check isomorphic binding between objects spec and messageReceive 
			JavaSDM.ensure(!spec.equals(messageReceive));

			// check isomorphic binding between objects step and messageReceive 
			JavaSDM.ensure(!step.equals(messageReceive));

			// check isomorphic binding between objects stepToCombo and messageReceive 
			JavaSDM.ensure(!stepToCombo.equals(messageReceive));

			// check isomorphic binding between objects stepToMessage and messageReceive 
			JavaSDM.ensure(!stepToMessage.equals(messageReceive));

			// check isomorphic binding between objects useCase and messageReceive 
			JavaSDM.ensure(!useCase.equals(messageReceive));

			// check isomorphic binding between objects useCaseToInteraction and messageReceive 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageReceive));

			// check isomorphic binding between objects operand and messageSend 
			JavaSDM.ensure(!operand.equals(messageSend));

			// check isomorphic binding between objects spec and messageSend 
			JavaSDM.ensure(!spec.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToCombo and messageSend 
			JavaSDM.ensure(!stepToCombo.equals(messageSend));

			// check isomorphic binding between objects stepToMessage and messageSend 
			JavaSDM.ensure(!stepToMessage.equals(messageSend));

			// check isomorphic binding between objects useCase and messageSend 
			JavaSDM.ensure(!useCase.equals(messageSend));

			// check isomorphic binding between objects useCaseToInteraction and messageSend 
			JavaSDM.ensure(!useCaseToInteraction.equals(messageSend));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects stepToMessage and operand 
			JavaSDM.ensure(!stepToMessage.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects useCaseToInteraction and operand 
			JavaSDM.ensure(!useCaseToInteraction.equals(operand));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects stepToMessage and spec 
			JavaSDM.ensure(!stepToMessage.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects stepToMessage and step 
			JavaSDM.ensure(!stepToMessage.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects stepToMessage and stepToCombo 
			JavaSDM.ensure(!stepToMessage.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToMessage 
			JavaSDM.ensure(!useCase.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and stepToMessage 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToMessage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltStepToComboRule");
			// assign attribute step__stepAlternative__alt
			step__stepAlternative__alt.setName("stepAlternative");
			// assign attribute alt__ref__altFlow
			alt__ref__altFlow.setName("ref");
			// assign attribute __combo_operand_operand
			__combo_operand_operand.setName("operand");
			// assign attribute __line_coveredBy_combo
			__line_coveredBy_combo.setName("coveredBy");
			// assign attribute __combo_covered_line
			__combo_covered_line.setName("covered");
			// assign attribute __line_coveredBy_operand
			__line_coveredBy_operand.setName("coveredBy");
			// assign attribute __operand_covered_line
			__operand_covered_line.setName("covered");
			// assign attribute stepToCombo__source__step
			stepToCombo__source__step.setName("source");
			// assign attribute stepToCombo__target__combo
			stepToCombo__target__combo.setName("target");
			// assign attribute __operand_guard_guard
			__operand_guard_guard.setName("guard");
			// assign attribute alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt.setName("source");
			// assign attribute alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand.setName("target");
			// assign attribute __guard_specification_spec
			__guard_specification_spec.setName("specification");
			// assign attribute altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow.setName("source");
			// assign attribute altFlowToOperand__target__operand
			altFlowToOperand__target__operand.setName("target");
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
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			__operand_guard_guard.setTrg(guard);

			// create link
			__guard_specification_spec.setSrc(guard);

			// create link
			__guard_specification_spec.setTrg(spec);

			// create link
			alt__ref__altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__source__altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__messageReceive_message_message.setTrg(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			step__actor__actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, step, alt, combo, line,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand, useCase, useCaseToInteraction, flow,
				message, interaction, stepToMessage, messageSend,
				messageReceive, actor, actorToLine);
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
		InteractionConstraint guard = null;
		Interaction interaction = null;
		Lifeline line = null;
		Message message = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_line = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __actorToLine_source_actor = null;
		CSP csp = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
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
			ruleresult.setRule("AltStepToComboRule");

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
			_TmpObject = (match.getObject("guard"));

			// ensure correct type and really bound of object guard
			JavaSDM.ensure(_TmpObject instanceof InteractionConstraint);
			guard = (InteractionConstraint) _TmpObject;
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
			_TmpObject = (match.getObject("spec"));

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;
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
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link source from actorToLine to actor
								JavaSDM.ensure(actor.equals(actorToLine
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link target from actorToLine to line
								JavaSDM.ensure(line.equals(actorToLine
										.getTarget()));

								// check link target from useCaseToInteraction to interaction
								JavaSDM.ensure(interaction
										.equals(useCaseToInteraction
												.getTarget()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

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
										// create object __line_coveredBy_combo
										__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_covered_line
										__combo_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __combo_operand_operand
										__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_operand
										__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_covered_line
										__operand_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageReceive
										__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __actorToLine_target_line
										__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_covered_line
										__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_guard_guard
										__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __guard_specification_spec
										__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_message_message
										__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_receiveEvent_messageReceive
										__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_message_message
										__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_interaction_interaction
										__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_message_message
										__interaction_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __message_sendEvent_messageSend
										__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __actorToLine_source_actor
										__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __combo_operand_operand
										__combo_operand_operand
												.setName("operand");
										// assign attribute __line_coveredBy_combo
										__line_coveredBy_combo
												.setName("coveredBy");
										// assign attribute __combo_covered_line
										__combo_covered_line.setName("covered");
										// assign attribute __line_coveredBy_operand
										__line_coveredBy_operand
												.setName("coveredBy");
										// assign attribute __operand_covered_line
										__operand_covered_line
												.setName("covered");
										// assign attribute __operand_guard_guard
										__operand_guard_guard.setName("guard");
										// assign attribute __guard_specification_spec
										__guard_specification_spec
												.setName("specification");
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

										// create link
										__line_coveredBy_combo.setTrg(combo);

										// create link
										__combo_covered_line.setSrc(combo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__combo_operand_operand.setSrc(combo);

										// create link
										__combo_covered_line.setTrg(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__line_coveredBy_operand.setSrc(line);

										// create link
										__operand_covered_line.setTrg(line);

										// create link
										__line_coveredBy_messageReceive
												.setSrc(line);

										// create link
										__actorToLine_target_line.setTrg(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__line_coveredBy_combo.setSrc(line);

										// create link
										__messageReceive_covered_line
												.setTrg(line);

										// create link
										__line_coveredBy_operand
												.setTrg(operand);

										// create link
										__operand_covered_line.setSrc(operand);

										// create link
										__operand_guard_guard.setSrc(operand);

										// create link
										__combo_operand_operand.setTrg(operand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														operand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														guard);

										// create link
										__operand_guard_guard.setTrg(guard);

										// create link
										__guard_specification_spec
												.setSrc(guard);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														spec);

										// create link
										__guard_specification_spec.setTrg(spec);

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
										__useCase_flows_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__messageReceive_message_message
												.setTrg(message);

										// create link
										__message_receiveEvent_messageReceive
												.setSrc(message);

										// create link
										__messageSend_message_message
												.setTrg(message);

										// create link
										__message_interaction_interaction
												.setSrc(message);

										// create link
										__interaction_message_message
												.setTrg(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														message);

										// create link
										__message_sendEvent_messageSend
												.setSrc(message);

										// create link
										__message_interaction_interaction
												.setTrg(interaction);

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
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__interaction_message_message
												.setSrc(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__message_sendEvent_messageSend
												.setTrg(messageSend);

										// create link
										__messageSend_message_message
												.setSrc(messageSend);

										// create link
										__messageReceive_covered_line
												.setSrc(messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__messageReceive_message_message
												.setSrc(messageReceive);

										// create link
										__line_coveredBy_messageReceive
												.setTrg(messageReceive);

										// create link
										__message_receiveEvent_messageReceive
												.setTrg(messageReceive);

										// create link
										__actorToLine_source_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actorToLine);

										// create link
										__actorToLine_target_line
												.setSrc(actorToLine);

										// create link
										__actorToLine_source_actor
												.setSrc(actorToLine);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__guard_specification_spec,
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
														__useCase_flows_flow,
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
														__actorToLine_source_actor,
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
														__line_coveredBy_combo,
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
														__interaction_lifeline_line,
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
														__useCaseToInteraction_source_useCase,
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
														__messageReceive_covered_line,
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
														__message_interaction_interaction,
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
														__combo_operand_operand,
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
														__operand_guard_guard,
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
														__message_sendEvent_messageSend,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__line_coveredBy_messageReceive,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															combo,
															line,
															operand,
															guard,
															spec,
															useCase,
															useCaseToInteraction,
															flow, message,
															interaction,
															messageSend,
															messageReceive,
															actor, actorToLine));

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
														.setRuleName("AltStepToComboRule");
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
	public void registerObjectsToMatch_BWD(Match match, CombinedFragment combo,
			Lifeline line, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		match.registerObject("combo", combo);
		match.registerObject("line", line);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);
		match.registerObject("messageSend", messageSend);
		match.registerObject("messageReceive", messageReceive);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CombinedFragment combo,
			Lifeline line, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("alt");
		literal0.setType("String");

		// Create attribute variables
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", true, csp);
		var_combo_interactionOperator.setValue(combo.getInteractionOperator());
		var_combo_interactionOperator.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);
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
			CombinedFragment combo, Lifeline line, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			ActorToLifeline actorToLine) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", true, csp);
		var_guard_name.setValue(guard.getName());
		var_guard_name.setType("");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);
		eq_1.setRuleName("");
		eq_1.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("guard", guard);
		isApplicableMatch.registerObject("spec", spec);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("actor", actor);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject step,
			EObject alt, EObject combo, EObject line, EObject stepToCombo,
			EObject operand, EObject alternative1ToOperand, EObject guard,
			EObject spec, EObject altFlow, EObject altFlowToOperand,
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject messageSend, EObject messageReceive, EObject actor,
			EObject actorToLine) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("combo")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getCombinedFragment())
				&& match.getObject("operand")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionOperand())
				&& match.getObject("guard")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionConstraint())
				&& match.getObject("spec")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getLiteralString())
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_10(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_926 = null;
		NormalStep __DEC_alt_stepAlternative_335018 = null;
		Flow __DEC_step_steps_453232 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_778368 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_778368 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;
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

			// check object _edge_stepAlternative is really bound
			JavaSDM.ensure(_edge_stepAlternative != null);
			// bind object
			_TmpObject = _edge_stepAlternative.getSrc();

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

			// bind object
			_TmpObject = _edge_stepAlternative.getTrg();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// bind object
			_TmpObject = alt.getRef();

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// check link stepAlternative from alt to step
			JavaSDM.ensure(step.equals(alt.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_926 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_926 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_926 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_926.getFlows().contains(
							altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_926 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_926.equals(useCase));

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
					__DEC_alt_stepAlternative_335018 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_335018 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_335018 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_335018
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_335018 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_335018
							.equals(step));

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
					__DEC_step_steps_453232 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_453232 is really bound
					JavaSDM.ensure(__DEC_step_steps_453232 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_453232.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_453232 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_453232.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_453232 and flow 
					JavaSDM.ensure(!__DEC_step_steps_453232.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_778368
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_778368 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_778368
									.hasNext()) {
						try {
							__DEC_altFlow_ref_778368 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_778368
									.next();

							// check object __DEC_altFlow_ref_778368 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_778368 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_778368 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_778368
									.equals(alt));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_stepAlternative is really bound
				JavaSDM.ensure(_edge_stepAlternative != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object altFlow is really bound
				JavaSDM.ensure(altFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link ref from alt to altFlow
				JavaSDM.ensure(altFlow.equals(alt.getRef()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link flows from altFlow to useCase
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(altFlow, UseCase.class,
								"$eContainer").contains(useCase)));

				// check link src from _edge_stepAlternative to step
				JavaSDM.ensure(step.equals(_edge_stepAlternative.getSrc()));

				// check link stepAlternative from alt to step
				JavaSDM.ensure(step.equals(alt.eContainer()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link steps from step to altFlow
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(step, AlternativeFlow.class,
								"$eContainer").contains(altFlow)));

				// check link trg from _edge_stepAlternative to alt
				JavaSDM.ensure(alt.equals(_edge_stepAlternative.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, useCase, flow, actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_699242 = null;
		NormalStep __DEC_alt_stepAlternative_438179 = null;
		Flow __DEC_step_steps_894541 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_7111 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_7111 = null;
		Match match = null;
		UseCase useCase = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep step = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;

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

			// check object _edge_ref is really bound
			JavaSDM.ensure(_edge_ref != null);
			// bind object
			_TmpObject = _edge_ref.getSrc();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// bind object
			_TmpObject = alt.getRef();

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;

			// bind object
			step = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
					.eContainer() : null;

			// check object step is really bound
			JavaSDM.ensure(step != null);

			// check if contained via correct reference
			JavaSDM.ensure(step.getStepAlternative().contains(alt));

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

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// bind object
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// check link trg from _edge_ref to altFlow
			JavaSDM.ensure(altFlow.equals(_edge_ref.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_699242 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_699242 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_699242 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_699242.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_699242 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_699242.equals(useCase));

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
					__DEC_alt_stepAlternative_438179 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_438179 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_438179 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_438179
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_438179 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_438179
							.equals(step));

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
					__DEC_step_steps_894541 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_894541 is really bound
					JavaSDM.ensure(__DEC_step_steps_894541 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_894541.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_894541 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_894541.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_894541 and flow 
					JavaSDM.ensure(!__DEC_step_steps_894541.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_7111
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_7111 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_7111
									.hasNext()) {
						try {
							__DEC_altFlow_ref_7111 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_7111
									.next();

							// check object __DEC_altFlow_ref_7111 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_7111 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_7111 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_7111.equals(alt));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_ref is really bound
				JavaSDM.ensure(_edge_ref != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object altFlow is really bound
				JavaSDM.ensure(altFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link ref from alt to altFlow
				JavaSDM.ensure(altFlow.equals(alt.getRef()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link flows from altFlow to useCase
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(altFlow, UseCase.class,
								"$eContainer").contains(useCase)));

				// check link src from _edge_ref to alt
				JavaSDM.ensure(alt.equals(_edge_ref.getSrc()));

				// check link stepAlternative from alt to step
				JavaSDM.ensure(step.equals(alt.eContainer()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link steps from step to altFlow
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(step, AlternativeFlow.class,
								"$eContainer").contains(altFlow)));

				// check link trg from _edge_ref to altFlow
				JavaSDM.ensure(altFlow.equals(_edge_ref.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, useCase, flow, actor);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_38(
			EMoflonEdge _edge_operand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_838342 = null;
		InteractionOperand __DEC_combo_fragment_794278 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_468653 = null;
		InteractionOperand __DEC_messageReceive_fragment_156710 = null;
		Interaction __DEC_messageSend_enclosingInteraction_448832 = null;
		InteractionOperand __DEC_messageSend_fragment_827865 = null;
		Interaction __DEC_operand_enclosingInteraction_956573 = null;
		InteractionOperand __DEC_operand_fragment_738141 = null;
		InteractionOperand __DEC_guard_guard_247949 = null;
		CombinedFragment __DEC_operand_operand_1416 = null;
		Constraint __DEC_spec_specification_461854 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_144606 = null;
		Message __DEC_messageReceive_receiveEvent_144606 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_241646 = null;
		Message __DEC_messageSend_receiveEvent_241646 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_854079 = null;
		Message __DEC_messageReceive_sendEvent_854079 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_214759 = null;
		Message __DEC_messageSend_sendEvent_214759 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_122748 = null;
		MessageEnd __DEC_message_message_122748 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		InteractionOperand operand = null;
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

			// check object _edge_operand is really bound
			JavaSDM.ensure(_edge_operand != null);
			// bind object
			_TmpObject = _edge_operand.getSrc();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// bind object
			_TmpObject = _edge_operand.getTrg();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// check link operand from operand to combo
			JavaSDM.ensure(combo.equals(operand.eContainer()));

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// iterate to-many link covered from combo to line
			fujaba__Success = false;

			fujaba__IterComboToLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterComboToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link covered from operand to line
					JavaSDM.ensure(operand.getCovered().contains(line));

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
							// bind object
							message = messageReceive.getMessage();

							// check object message is really bound
							JavaSDM.ensure(message != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

							// bind object
							_TmpObject = message.getSendEvent();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;

							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_838342 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_838342 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_838342 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_838342 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_838342
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
									__DEC_combo_fragment_794278 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_794278 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_794278 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_794278 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_794278
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
									__DEC_messageReceive_enclosingInteraction_468653 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_468653 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_468653 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_468653 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_468653
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
									__DEC_messageReceive_fragment_156710 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_156710 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_156710 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_156710 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_156710
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
									__DEC_messageSend_enclosingInteraction_448832 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_448832 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_448832 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_448832 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_448832
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
									__DEC_messageSend_fragment_827865 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_827865 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_827865 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_827865 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_827865
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
									__DEC_operand_enclosingInteraction_956573 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_956573 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_956573 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_956573 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_956573
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
									__DEC_operand_fragment_738141 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_738141 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_738141 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_738141 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_738141
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_247949 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_247949 is really bound
									JavaSDM.ensure(__DEC_guard_guard_247949 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_247949
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_247949 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_247949
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
									__DEC_operand_operand_1416 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_1416 is really bound
									JavaSDM.ensure(__DEC_operand_operand_1416 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_1416
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_1416 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_1416
											.equals(combo));

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
									__DEC_spec_specification_461854 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_461854 is really bound
									JavaSDM.ensure(__DEC_spec_specification_461854 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_461854
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_461854 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_461854
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_144606
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_144606 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_144606
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_144606 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_144606
													.next();

											// check object __DEC_messageReceive_receiveEvent_144606 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_144606 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_144606 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_144606
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_241646
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_241646 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_241646
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_241646 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_241646
													.next();

											// check object __DEC_messageSend_receiveEvent_241646 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_241646 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_241646 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_241646
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_854079
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_854079 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_854079
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_854079 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_854079
													.next();

											// check object __DEC_messageReceive_sendEvent_854079 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_854079 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_854079 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_854079
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_214759
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_214759 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_214759
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_214759 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_214759
													.next();

											// check object __DEC_messageSend_sendEvent_214759 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_214759 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_214759 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_214759
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_122748
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_122748 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_122748
													.hasNext()) {
										try {
											__DEC_message_message_122748 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_122748
													.next();

											// check object __DEC_message_message_122748 is really bound
											JavaSDM.ensure(__DEC_message_message_122748 != null);
											// check isomorphic binding between objects __DEC_message_message_122748 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_122748
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_122748 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_122748
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_operand is really bound
								JavaSDM.ensure(_edge_operand != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_operand to combo
								JavaSDM.ensure(combo.equals(_edge_operand
										.getSrc()));

								// check link trg from _edge_operand to operand
								JavaSDM.ensure(operand.equals(_edge_operand
										.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_39(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_111589 = null;
		InteractionOperand __DEC_combo_fragment_350321 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_704386 = null;
		InteractionOperand __DEC_messageReceive_fragment_269607 = null;
		Interaction __DEC_messageSend_enclosingInteraction_92519 = null;
		InteractionOperand __DEC_messageSend_fragment_5762 = null;
		Interaction __DEC_operand_enclosingInteraction_65562 = null;
		InteractionOperand __DEC_operand_fragment_552128 = null;
		InteractionOperand __DEC_guard_guard_969788 = null;
		CombinedFragment __DEC_operand_operand_806568 = null;
		Constraint __DEC_spec_specification_765204 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_290335 = null;
		Message __DEC_messageReceive_receiveEvent_290335 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_55269 = null;
		Message __DEC_messageSend_receiveEvent_55269 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_235023 = null;
		Message __DEC_messageReceive_sendEvent_235023 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192050 = null;
		Message __DEC_messageSend_sendEvent_192050 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_847597 = null;
		MessageEnd __DEC_message_message_847597 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterComboToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// check link covered from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
					// bind object
					message = messageReceive.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// iterate to-many link operand from combo to operand
					fujaba__Success = false;

					fujaba__IterComboToOperand = new ArrayList(
							combo.getOperand()).iterator();

					while (fujaba__IterComboToOperand.hasNext()) {
						try {
							operand = (InteractionOperand) fujaba__IterComboToOperand
									.next();

							// check object operand is really bound
							JavaSDM.ensure(operand != null);
							// bind object
							guard = operand.getGuard();

							// check object guard is really bound
							JavaSDM.ensure(guard != null);

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// check link covered from operand to line
							JavaSDM.ensure(operand.getCovered().contains(line));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_111589 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_111589 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_111589 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_111589 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_111589
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
									__DEC_combo_fragment_350321 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_350321 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_350321 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_350321 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_350321
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
									__DEC_messageReceive_enclosingInteraction_704386 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_704386 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_704386 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_704386 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_704386
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
									__DEC_messageReceive_fragment_269607 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_269607 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_269607 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_269607 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_269607
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
									__DEC_messageSend_enclosingInteraction_92519 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_92519 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_92519 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_92519 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_92519
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
									__DEC_messageSend_fragment_5762 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_5762 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_5762 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_5762 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_5762
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
									__DEC_operand_enclosingInteraction_65562 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_65562 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_65562 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_65562 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_65562
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
									__DEC_operand_fragment_552128 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_552128 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_552128 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_552128 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_552128
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_969788 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_969788 is really bound
									JavaSDM.ensure(__DEC_guard_guard_969788 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_969788
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_969788 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_969788
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
									__DEC_operand_operand_806568 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_806568 is really bound
									JavaSDM.ensure(__DEC_operand_operand_806568 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_806568
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_806568 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_806568
											.equals(combo));

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
									__DEC_spec_specification_765204 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_765204 is really bound
									JavaSDM.ensure(__DEC_spec_specification_765204 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_765204
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_765204 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_765204
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_290335
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_290335 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_290335
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_290335 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_290335
													.next();

											// check object __DEC_messageReceive_receiveEvent_290335 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_290335 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_290335 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_290335
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_55269
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_55269 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_55269
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_55269 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_55269
													.next();

											// check object __DEC_messageSend_receiveEvent_55269 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_55269 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_55269 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_55269
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_235023
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_235023 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_235023
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_235023 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_235023
													.next();

											// check object __DEC_messageReceive_sendEvent_235023 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_235023 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_235023 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_235023
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_192050
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192050 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192050
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_192050 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_192050
													.next();

											// check object __DEC_messageSend_sendEvent_192050 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_192050 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_192050 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_192050
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_847597
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_847597 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_847597
													.hasNext()) {
										try {
											__DEC_message_message_847597 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_847597
													.next();

											// check object __DEC_message_message_847597 is really bound
											JavaSDM.ensure(__DEC_message_message_847597 != null);
											// check isomorphic binding between objects __DEC_message_message_847597 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_847597
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_847597 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_847597
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_coveredBy is really bound
								JavaSDM.ensure(_edge_coveredBy != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to combo
								JavaSDM.ensure(combo.equals(_edge_coveredBy
										.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_40(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_150078 = null;
		InteractionOperand __DEC_combo_fragment_538214 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_77207 = null;
		InteractionOperand __DEC_messageReceive_fragment_991304 = null;
		Interaction __DEC_messageSend_enclosingInteraction_738498 = null;
		InteractionOperand __DEC_messageSend_fragment_660388 = null;
		Interaction __DEC_operand_enclosingInteraction_214340 = null;
		InteractionOperand __DEC_operand_fragment_976852 = null;
		InteractionOperand __DEC_guard_guard_926383 = null;
		CombinedFragment __DEC_operand_operand_927668 = null;
		Constraint __DEC_spec_specification_599575 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_145170 = null;
		Message __DEC_messageReceive_receiveEvent_145170 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516313 = null;
		Message __DEC_messageSend_receiveEvent_516313 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745859 = null;
		Message __DEC_messageReceive_sendEvent_745859 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_935476 = null;
		Message __DEC_messageSend_sendEvent_935476 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_278681 = null;
		MessageEnd __DEC_message_message_278681 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterComboToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterComboTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
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

			// check link covered from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
					// bind object
					message = messageReceive.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// iterate to-many link trg from combo to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterComboTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(combo,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterComboTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterComboTo_edge_coveredBy
									.next();

							// check object _edge_coveredBy is really bound
							JavaSDM.ensure(_edge_coveredBy != null);
							// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
							JavaSDM.ensure(!_edge_coveredBy
									.equals(_edge_covered));

							// check link src from _edge_coveredBy to line
							JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

							// iterate to-many link operand from combo to operand
							fujaba__Success = false;

							fujaba__IterComboToOperand = new ArrayList(
									combo.getOperand()).iterator();

							while (fujaba__IterComboToOperand.hasNext()) {
								try {
									operand = (InteractionOperand) fujaba__IterComboToOperand
											.next();

									// check object operand is really bound
									JavaSDM.ensure(operand != null);
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// check link covered from operand to line
									JavaSDM.ensure(operand.getCovered()
											.contains(line));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_150078 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_150078 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_150078 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_150078 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_150078
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
											__DEC_combo_fragment_538214 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_538214 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_538214 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_538214 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_538214
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
											__DEC_messageReceive_enclosingInteraction_77207 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_77207 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_77207 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_77207 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_77207
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
											__DEC_messageReceive_fragment_991304 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_991304 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_991304 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_991304 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_991304
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
											__DEC_messageSend_enclosingInteraction_738498 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_738498 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_738498 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_738498 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_738498
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
											__DEC_messageSend_fragment_660388 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_660388 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_660388 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_660388 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_660388
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
											__DEC_operand_enclosingInteraction_214340 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_214340 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_214340 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_214340 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_214340
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
											__DEC_operand_fragment_976852 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_976852 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_976852 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_976852 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_976852
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_926383 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_926383 is really bound
											JavaSDM.ensure(__DEC_guard_guard_926383 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_926383
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_926383 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_926383
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
											__DEC_operand_operand_927668 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_927668 is really bound
											JavaSDM.ensure(__DEC_operand_operand_927668 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_927668
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_927668 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_927668
													.equals(combo));

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
											__DEC_spec_specification_599575 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_599575 is really bound
											JavaSDM.ensure(__DEC_spec_specification_599575 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_599575
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_599575 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_599575
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_145170
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_145170 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_145170
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_145170 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_145170
															.next();

													// check object __DEC_messageReceive_receiveEvent_145170 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_145170 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_145170 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_145170
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_516313
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516313 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516313
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_516313 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_516313
															.next();

													// check object __DEC_messageSend_receiveEvent_516313 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_516313 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_516313 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_516313
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_745859
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745859 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745859
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_745859 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_745859
															.next();

													// check object __DEC_messageReceive_sendEvent_745859 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_745859 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_745859 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_745859
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_935476
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_935476 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_935476
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_935476 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_935476
															.next();

													// check object __DEC_messageSend_sendEvent_935476 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_935476 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_935476 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_935476
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_278681
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_278681 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_278681
															.hasNext()) {
												try {
													__DEC_message_message_278681 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_278681
															.next();

													// check object __DEC_message_message_278681 is really bound
													JavaSDM.ensure(__DEC_message_message_278681 != null);
													// check isomorphic binding between objects __DEC_message_message_278681 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_278681
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_278681 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_278681
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_covered is really bound
										JavaSDM.ensure(_edge_covered != null);
										// check object _edge_coveredBy is really bound
										JavaSDM.ensure(_edge_coveredBy != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
										JavaSDM.ensure(!_edge_coveredBy
												.equals(_edge_covered));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_covered to combo
										JavaSDM.ensure(combo
												.equals(_edge_covered.getSrc()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_covered to line
										JavaSDM.ensure(line
												.equals(_edge_covered.getTrg()));

										// check link trg from _edge_coveredBy to combo
										JavaSDM.ensure(combo
												.equals(_edge_coveredBy
														.getTrg()));

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_41(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_314021 = null;
		InteractionOperand __DEC_combo_fragment_213049 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_967507 = null;
		InteractionOperand __DEC_messageReceive_fragment_229808 = null;
		Interaction __DEC_messageSend_enclosingInteraction_117528 = null;
		InteractionOperand __DEC_messageSend_fragment_297190 = null;
		Interaction __DEC_operand_enclosingInteraction_769418 = null;
		InteractionOperand __DEC_operand_fragment_2975 = null;
		InteractionOperand __DEC_guard_guard_978567 = null;
		CombinedFragment __DEC_operand_operand_253104 = null;
		Constraint __DEC_spec_specification_883789 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_762753 = null;
		Message __DEC_messageReceive_receiveEvent_762753 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104229 = null;
		Message __DEC_messageSend_receiveEvent_104229 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_906439 = null;
		Message __DEC_messageReceive_sendEvent_906439 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_611528 = null;
		Message __DEC_messageSend_sendEvent_611528 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_537274 = null;
		MessageEnd __DEC_message_message_537274 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
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
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link covered from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// check link covered from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

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
					// bind object
					message = messageReceive.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_combo_enclosingInteraction_314021 = combo
									.getEnclosingInteraction();

							// check object __DEC_combo_enclosingInteraction_314021 is really bound
							JavaSDM.ensure(__DEC_combo_enclosingInteraction_314021 != null);

							// check isomorphic binding between objects __DEC_combo_enclosingInteraction_314021 and interaction 
							JavaSDM.ensure(!__DEC_combo_enclosingInteraction_314021
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
							__DEC_combo_fragment_213049 = combo
									.getEnclosingOperand();

							// check object __DEC_combo_fragment_213049 is really bound
							JavaSDM.ensure(__DEC_combo_fragment_213049 != null);

							// check isomorphic binding between objects __DEC_combo_fragment_213049 and operand 
							JavaSDM.ensure(!__DEC_combo_fragment_213049
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
							__DEC_messageReceive_enclosingInteraction_967507 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_967507 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_967507 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_967507 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_967507
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
							__DEC_messageReceive_fragment_229808 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_229808 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_229808 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_229808 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_229808
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
							__DEC_messageSend_enclosingInteraction_117528 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_117528 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_117528 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_117528 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_117528
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
							__DEC_messageSend_fragment_297190 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_297190 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_297190 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_297190 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_297190
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
							__DEC_operand_enclosingInteraction_769418 = operand
									.getEnclosingInteraction();

							// check object __DEC_operand_enclosingInteraction_769418 is really bound
							JavaSDM.ensure(__DEC_operand_enclosingInteraction_769418 != null);

							// check isomorphic binding between objects __DEC_operand_enclosingInteraction_769418 and interaction 
							JavaSDM.ensure(!__DEC_operand_enclosingInteraction_769418
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
							__DEC_operand_fragment_2975 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_2975 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_2975 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_2975 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_2975
									.equals(operand));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link packagedElement from guard
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(guard,
										ModalSequenceDiagram.Package.class,
										"packagedElement").size() == 0);
						// negative check for link packagedElement from spec
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(spec,
										ModalSequenceDiagram.Package.class,
										"packagedElement").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_guard_guard_978567 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_978567 is really bound
							JavaSDM.ensure(__DEC_guard_guard_978567 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard
									.equals(__DEC_guard_guard_978567.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_978567 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_978567
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
							__DEC_operand_operand_253104 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_253104 is really bound
							JavaSDM.ensure(__DEC_operand_operand_253104 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_253104
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_253104 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_253104
									.equals(combo));

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
							__DEC_spec_specification_883789 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_883789 is really bound
							JavaSDM.ensure(__DEC_spec_specification_883789 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_883789
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_883789 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_883789
									.equals(guard));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_762753
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_762753 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_762753
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_762753 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_762753
											.next();

									// check object __DEC_messageReceive_receiveEvent_762753 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_762753 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_762753 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_762753
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_104229
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104229 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104229
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_104229 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104229
											.next();

									// check object __DEC_messageSend_receiveEvent_104229 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_104229 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_104229 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_104229
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_906439
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_906439 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_906439
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_906439 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_906439
											.next();

									// check object __DEC_messageReceive_sendEvent_906439 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_906439 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_906439 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_906439
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_611528
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_611528 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_611528
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_611528 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_611528
											.next();

									// check object __DEC_messageSend_sendEvent_611528 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_611528 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_611528 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_611528
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_537274
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_537274 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_537274
											.hasNext()) {
								try {
									__DEC_message_message_537274 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_537274
											.next();

									// check object __DEC_message_message_537274 is really bound
									JavaSDM.ensure(__DEC_message_message_537274 != null);
									// check isomorphic binding between objects __DEC_message_message_537274 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_537274
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_537274 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_537274
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

						// check link fragment from operand to operand
						JavaSDM.ensure(!(operand.equals(operand
								.getEnclosingOperand())));

						// check link fragment from operand to operand
						JavaSDM.ensure(!(operand.equals(operand
								.getEnclosingOperand())));

						// check object _edge_coveredBy is really bound
						JavaSDM.ensure(_edge_coveredBy != null);
						// check object combo is really bound
						JavaSDM.ensure(combo != null);
						// check object guard is really bound
						JavaSDM.ensure(guard != null);
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
						// check object spec is really bound
						JavaSDM.ensure(spec != null);
						// check isomorphic binding between objects messageSend and messageReceive 
						JavaSDM.ensure(!messageSend.equals(messageReceive));

						// check link fragment from combo to interaction
						JavaSDM.ensure(!(interaction.equals(combo
								.getEnclosingInteraction())));

						// check link fragment from messageReceive to interaction
						JavaSDM.ensure(!(interaction.equals(messageReceive
								.getEnclosingInteraction())));

						// check link fragment from messageSend to interaction
						JavaSDM.ensure(!(interaction.equals(messageSend
								.getEnclosingInteraction())));

						// check link fragment from operand to interaction
						JavaSDM.ensure(!(interaction.equals(operand
								.getEnclosingInteraction())));

						// check link fragment from combo to operand
						JavaSDM.ensure(!(operand.equals(combo
								.getEnclosingOperand())));

						// check link fragment from messageReceive to operand
						JavaSDM.ensure(!(operand.equals(messageReceive
								.getEnclosingOperand())));

						// check link fragment from messageSend to operand
						JavaSDM.ensure(!(operand.equals(messageSend
								.getEnclosingOperand())));

						// check link guard from operand to guard
						JavaSDM.ensure(guard.equals(operand.getGuard()));

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

						// check link specification from spec to guard
						JavaSDM.ensure(guard.equals(spec.eContainer()));

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_coveredBy to operand
						JavaSDM.ensure(operand.equals(_edge_coveredBy.getTrg()));

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from messageReceive to line
						JavaSDM.ensure(messageReceive.getCovered().contains(
								line));

						// check link covered from operand to line
						JavaSDM.ensure(operand.getCovered().contains(line));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, combo,
								line, operand, guard, spec, message,
								interaction, messageSend, messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_42(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_186649 = null;
		InteractionOperand __DEC_combo_fragment_538323 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_477255 = null;
		InteractionOperand __DEC_messageReceive_fragment_533869 = null;
		Interaction __DEC_messageSend_enclosingInteraction_503328 = null;
		InteractionOperand __DEC_messageSend_fragment_778155 = null;
		Interaction __DEC_operand_enclosingInteraction_574310 = null;
		InteractionOperand __DEC_operand_fragment_191839 = null;
		InteractionOperand __DEC_guard_guard_492631 = null;
		CombinedFragment __DEC_operand_operand_73729 = null;
		Constraint __DEC_spec_specification_264274 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_888011 = null;
		Message __DEC_messageReceive_receiveEvent_888011 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605521 = null;
		Message __DEC_messageSend_receiveEvent_605521 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_770080 = null;
		Message __DEC_messageReceive_sendEvent_770080 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972335 = null;
		Message __DEC_messageSend_sendEvent_972335 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_28526 = null;
		MessageEnd __DEC_message_message_28526 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
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
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link covered from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// check link covered from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

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
					// bind object
					message = messageReceive.getMessage();

					// check object message is really bound
					JavaSDM.ensure(message != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// check link receiveEvent from message to messageReceive
					JavaSDM.ensure(messageReceive.equals(message
							.getReceiveEvent()));

					// bind object
					_TmpObject = message.getSendEvent();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// check isomorphic binding between objects messageSend and messageReceive 
					JavaSDM.ensure(!messageSend.equals(messageReceive));

					// check link message from messageSend to message
					JavaSDM.ensure(message.equals(messageSend.getMessage()));

					// iterate to-many link trg from operand to _edge_coveredBy
					fujaba__Success = false;

					fujaba__IterOperandTo_edge_coveredBy = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(operand,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterOperandTo_edge_coveredBy.hasNext()) {
						try {
							_edge_coveredBy = (EMoflonEdge) fujaba__IterOperandTo_edge_coveredBy
									.next();

							// check object _edge_coveredBy is really bound
							JavaSDM.ensure(_edge_coveredBy != null);
							// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
							JavaSDM.ensure(!_edge_coveredBy
									.equals(_edge_covered));

							// check link src from _edge_coveredBy to line
							JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_186649 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_186649 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_186649 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_186649 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_186649
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
									__DEC_combo_fragment_538323 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_538323 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_538323 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_538323 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_538323
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
									__DEC_messageReceive_enclosingInteraction_477255 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_477255 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_477255 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_477255 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_477255
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
									__DEC_messageReceive_fragment_533869 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_533869 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_533869 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_533869 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_533869
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
									__DEC_messageSend_enclosingInteraction_503328 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_503328 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_503328 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_503328 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_503328
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
									__DEC_messageSend_fragment_778155 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_778155 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_778155 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_778155 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_778155
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
									__DEC_operand_enclosingInteraction_574310 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_574310 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_574310 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_574310 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_574310
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
									__DEC_operand_fragment_191839 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_191839 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_191839 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_191839 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_191839
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_492631 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_492631 is really bound
									JavaSDM.ensure(__DEC_guard_guard_492631 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_492631
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_492631 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_492631
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
									__DEC_operand_operand_73729 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_73729 is really bound
									JavaSDM.ensure(__DEC_operand_operand_73729 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_73729
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_73729 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_73729
											.equals(combo));

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
									__DEC_spec_specification_264274 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_264274 is really bound
									JavaSDM.ensure(__DEC_spec_specification_264274 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_264274
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_264274 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_264274
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_888011
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_888011 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_888011
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_888011 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_888011
													.next();

											// check object __DEC_messageReceive_receiveEvent_888011 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_888011 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_888011 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_888011
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_605521
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605521 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605521
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_605521 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_605521
													.next();

											// check object __DEC_messageSend_receiveEvent_605521 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_605521 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_605521 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_605521
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_770080
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_770080 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_770080
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_770080 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_770080
													.next();

											// check object __DEC_messageReceive_sendEvent_770080 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_770080 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_770080 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_770080
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_972335
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972335 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972335
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_972335 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_972335
													.next();

											// check object __DEC_messageSend_sendEvent_972335 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_972335 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_972335 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_972335
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_28526
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_28526 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_28526
													.hasNext()) {
										try {
											__DEC_message_message_28526 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_28526
													.next();

											// check object __DEC_message_message_28526 is really bound
											JavaSDM.ensure(__DEC_message_message_28526 != null);
											// check isomorphic binding between objects __DEC_message_message_28526 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_28526
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_28526 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_28526
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_covered is really bound
								JavaSDM.ensure(_edge_covered != null);
								// check object _edge_coveredBy is really bound
								JavaSDM.ensure(_edge_coveredBy != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
								JavaSDM.ensure(!_edge_coveredBy
										.equals(_edge_covered));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_covered to operand
								JavaSDM.ensure(operand.equals(_edge_covered
										.getSrc()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_covered to line
								JavaSDM.ensure(line.equals(_edge_covered
										.getTrg()));

								// check link trg from _edge_coveredBy to operand
								JavaSDM.ensure(operand.equals(_edge_coveredBy
										.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_43(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_876788 = null;
		InteractionOperand __DEC_combo_fragment_327643 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_893459 = null;
		InteractionOperand __DEC_messageReceive_fragment_276590 = null;
		Interaction __DEC_messageSend_enclosingInteraction_255934 = null;
		InteractionOperand __DEC_messageSend_fragment_97473 = null;
		Interaction __DEC_operand_enclosingInteraction_126502 = null;
		InteractionOperand __DEC_operand_fragment_239501 = null;
		InteractionOperand __DEC_guard_guard_911007 = null;
		CombinedFragment __DEC_operand_operand_651473 = null;
		Constraint __DEC_spec_specification_379584 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_330756 = null;
		Message __DEC_messageReceive_receiveEvent_330756 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_966498 = null;
		Message __DEC_messageSend_receiveEvent_966498 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_615676 = null;
		Message __DEC_messageReceive_sendEvent_615676 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_53030 = null;
		Message __DEC_messageSend_sendEvent_53030 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_217128 = null;
		MessageEnd __DEC_message_message_217128 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
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

			// check object _edge_guard is really bound
			JavaSDM.ensure(_edge_guard != null);
			// bind object
			_TmpObject = _edge_guard.getSrc();

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link trg from _edge_guard to guard
			JavaSDM.ensure(guard.equals(_edge_guard.getTrg()));

			// iterate to-many link covered from operand to line
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

					// check link covered from line to combo
					JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
							// bind object
							message = messageReceive.getMessage();

							// check object message is really bound
							JavaSDM.ensure(message != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

							// bind object
							_TmpObject = message.getSendEvent();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;

							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_876788 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_876788 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_876788 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_876788 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_876788
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
									__DEC_combo_fragment_327643 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_327643 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_327643 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_327643 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_327643
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
									__DEC_messageReceive_enclosingInteraction_893459 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_893459 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_893459 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_893459 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_893459
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
									__DEC_messageReceive_fragment_276590 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_276590 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_276590 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_276590 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_276590
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
									__DEC_messageSend_enclosingInteraction_255934 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_255934 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_255934 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_255934 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_255934
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
									__DEC_messageSend_fragment_97473 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_97473 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_97473 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_97473 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_97473
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
									__DEC_operand_enclosingInteraction_126502 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_126502 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_126502 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_126502 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_126502
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
									__DEC_operand_fragment_239501 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_239501 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_239501 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_239501 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_239501
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_911007 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_911007 is really bound
									JavaSDM.ensure(__DEC_guard_guard_911007 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_911007
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_911007 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_911007
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
									__DEC_operand_operand_651473 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_651473 is really bound
									JavaSDM.ensure(__DEC_operand_operand_651473 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_651473
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_651473 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_651473
											.equals(combo));

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
									__DEC_spec_specification_379584 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_379584 is really bound
									JavaSDM.ensure(__DEC_spec_specification_379584 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_379584
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_379584 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_379584
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_330756
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_330756 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_330756
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_330756 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_330756
													.next();

											// check object __DEC_messageReceive_receiveEvent_330756 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_330756 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_330756 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_330756
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_966498
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_966498 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_966498
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_966498 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_966498
													.next();

											// check object __DEC_messageSend_receiveEvent_966498 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_966498 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_966498 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_966498
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_615676
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_615676 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_615676
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_615676 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_615676
													.next();

											// check object __DEC_messageReceive_sendEvent_615676 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_615676 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_615676 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_615676
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_53030
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_53030 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_53030
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_53030 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_53030
													.next();

											// check object __DEC_messageSend_sendEvent_53030 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_53030 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_53030 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_53030
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_217128
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_217128 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_217128
													.hasNext()) {
										try {
											__DEC_message_message_217128 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_217128
													.next();

											// check object __DEC_message_message_217128 is really bound
											JavaSDM.ensure(__DEC_message_message_217128 != null);
											// check isomorphic binding between objects __DEC_message_message_217128 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_217128
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_217128 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_217128
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_guard is really bound
								JavaSDM.ensure(_edge_guard != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_guard to operand
								JavaSDM.ensure(operand.equals(_edge_guard
										.getSrc()));

								// check link trg from _edge_guard to guard
								JavaSDM.ensure(guard.equals(_edge_guard
										.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_605500 = null;
		InteractionOperand __DEC_combo_fragment_117357 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_82624 = null;
		InteractionOperand __DEC_messageReceive_fragment_823577 = null;
		Interaction __DEC_messageSend_enclosingInteraction_237515 = null;
		InteractionOperand __DEC_messageSend_fragment_667687 = null;
		Interaction __DEC_operand_enclosingInteraction_98056 = null;
		InteractionOperand __DEC_operand_fragment_660037 = null;
		InteractionOperand __DEC_guard_guard_861421 = null;
		CombinedFragment __DEC_operand_operand_781996 = null;
		Constraint __DEC_spec_specification_61011 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_657656 = null;
		Message __DEC_messageReceive_receiveEvent_657656 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_468353 = null;
		Message __DEC_messageSend_receiveEvent_468353 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_54911 = null;
		Message __DEC_messageReceive_sendEvent_54911 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_840529 = null;
		Message __DEC_messageSend_sendEvent_840529 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_829403 = null;
		MessageEnd __DEC_message_message_829403 = null;
		Match match = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionOperand operand = null;
		InteractionConstraint guard = null;

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

			// check object _edge_specification is really bound
			JavaSDM.ensure(_edge_specification != null);
			// bind object
			_TmpObject = _edge_specification.getSrc();

			// ensure correct type and really bound of object guard
			JavaSDM.ensure(_TmpObject instanceof InteractionConstraint);
			guard = (InteractionConstraint) _TmpObject;

			// bind object
			operand = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
					.eContainer() : null;

			// check object operand is really bound
			JavaSDM.ensure(operand != null);

			// check if contained via correct reference
			JavaSDM.ensure(guard.equals(operand.getGuard()));

			// bind object
			combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
					.eContainer() : null;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);

			// check if contained via correct reference
			JavaSDM.ensure(combo.getOperand().contains(operand));

			// bind object
			_TmpObject = _edge_specification.getTrg();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link specification from spec to guard
			JavaSDM.ensure(guard.equals(spec.eContainer()));

			// iterate to-many link covered from operand to line
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

					// check link covered from line to combo
					JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
							// bind object
							message = messageReceive.getMessage();

							// check object message is really bound
							JavaSDM.ensure(message != null);

							// check link message from message to interaction
							JavaSDM.ensure(interaction.equals(message
									.getInteraction()));

							// check link receiveEvent from message to messageReceive
							JavaSDM.ensure(messageReceive.equals(message
									.getReceiveEvent()));

							// bind object
							_TmpObject = message.getSendEvent();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;

							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// check link message from messageSend to message
							JavaSDM.ensure(message.equals(messageSend
									.getMessage()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_605500 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_605500 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_605500 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_605500 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_605500
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
									__DEC_combo_fragment_117357 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_117357 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_117357 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_117357 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_117357
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
									__DEC_messageReceive_enclosingInteraction_82624 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_82624 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_82624 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_82624 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_82624
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
									__DEC_messageReceive_fragment_823577 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_823577 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_823577 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_823577 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_823577
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
									__DEC_messageSend_enclosingInteraction_237515 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_237515 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_237515 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_237515 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_237515
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
									__DEC_messageSend_fragment_667687 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_667687 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_667687 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_667687 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_667687
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
									__DEC_operand_enclosingInteraction_98056 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_98056 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_98056 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_98056 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_98056
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
									__DEC_operand_fragment_660037 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_660037 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_660037 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_660037 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_660037
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_861421 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_861421 is really bound
									JavaSDM.ensure(__DEC_guard_guard_861421 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_861421
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_861421 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_861421
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
									__DEC_operand_operand_781996 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_781996 is really bound
									JavaSDM.ensure(__DEC_operand_operand_781996 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_781996
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_781996 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_781996
											.equals(combo));

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
									__DEC_spec_specification_61011 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_61011 is really bound
									JavaSDM.ensure(__DEC_spec_specification_61011 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_61011
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_61011 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_61011
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_657656
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_657656 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_657656
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_657656 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_657656
													.next();

											// check object __DEC_messageReceive_receiveEvent_657656 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_657656 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_657656 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_657656
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_468353
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_468353 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_468353
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_468353 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_468353
													.next();

											// check object __DEC_messageSend_receiveEvent_468353 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_468353 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_468353 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_468353
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_54911
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_54911 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_54911
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_54911 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_54911
													.next();

											// check object __DEC_messageReceive_sendEvent_54911 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_54911 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_54911 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_54911
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_840529
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_840529 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_840529
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_840529 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_840529
													.next();

											// check object __DEC_messageSend_sendEvent_840529 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_840529 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_840529 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_840529
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_829403
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_829403 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_829403
													.hasNext()) {
										try {
											__DEC_message_message_829403 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_829403
													.next();

											// check object __DEC_message_message_829403 is really bound
											JavaSDM.ensure(__DEC_message_message_829403 != null);
											// check isomorphic binding between objects __DEC_message_message_829403 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_829403
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_829403 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_829403
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_specification is really bound
								JavaSDM.ensure(_edge_specification != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_specification to guard
								JavaSDM.ensure(guard.equals(_edge_specification
										.getSrc()));

								// check link trg from _edge_specification to spec
								JavaSDM.ensure(spec.equals(_edge_specification
										.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_766497 = null;
		NormalStep __DEC_alt_stepAlternative_226013 = null;
		Flow __DEC_step_steps_549293 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_977868 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_977868 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
		Actor actor = null;
		NormalStep step = null;
		UseCase useCase = null;
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

			// check link steps from step to flow
			JavaSDM.ensure(flow.equals(step.eContainer()));

			// iterate to-many link stepAlternative from step to alt
			fujaba__Success = false;

			fujaba__IterStepToAlt = new ArrayList(step.getStepAlternative())
					.iterator();

			while (fujaba__IterStepToAlt.hasNext()) {
				try {
					_TmpObject = fujaba__IterStepToAlt.next();

					// ensure correct type and really bound of object alt
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
					alt = (AlternativeFlowAlternative) _TmpObject;
					// bind object
					_TmpObject = alt.getRef();

					// ensure correct type and really bound of object altFlow
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
					altFlow = (AlternativeFlow) _TmpObject;

					// check isomorphic binding between objects flow and altFlow 
					JavaSDM.ensure(!flow.equals(altFlow));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_altFlow_flows_766497 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_766497 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_766497 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_766497
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_766497 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_766497
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
							__DEC_alt_stepAlternative_226013 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_226013 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_226013 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_226013
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_226013 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_226013
									.equals(step));

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
							__DEC_step_steps_549293 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_549293 is really bound
							JavaSDM.ensure(__DEC_step_steps_549293 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_549293.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_549293 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_549293
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_549293 and flow 
							JavaSDM.ensure(!__DEC_step_steps_549293
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_977868
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_977868 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_977868
											.hasNext()) {
								try {
									__DEC_altFlow_ref_977868 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_977868
											.next();

									// check object __DEC_altFlow_ref_977868 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_977868 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_977868 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_977868
											.equals(alt));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

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
						// check object alt is really bound
						JavaSDM.ensure(alt != null);
						// check object altFlow is really bound
						JavaSDM.ensure(altFlow != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects flow and altFlow 
						JavaSDM.ensure(!flow.equals(altFlow));

						// check link actor from step to actor
						JavaSDM.ensure(actor.equals(step.getActor()));

						// check link ref from alt to altFlow
						JavaSDM.ensure(altFlow.equals(alt.getRef()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link flows from altFlow to useCase
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(altFlow, UseCase.class,
										"$eContainer").contains(useCase)));

						// check link src from _edge_steps to flow
						JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

						// check link stepAlternative from alt to step
						JavaSDM.ensure(step.equals(alt.eContainer()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link steps from step to altFlow
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(step,
										AlternativeFlow.class, "$eContainer")
								.contains(altFlow)));

						// check link trg from _edge_steps to step
						JavaSDM.ensure(step.equals(_edge_steps.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								alt, altFlow, useCase, flow, actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_13(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_399520 = null;
		NormalStep __DEC_alt_stepAlternative_92336 = null;
		Flow __DEC_step_steps_625154 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_404907 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_404907 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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

			// iterate to-many link stepAlternative from step to alt
			fujaba__Success = false;

			fujaba__IterStepToAlt = new ArrayList(step.getStepAlternative())
					.iterator();

			while (fujaba__IterStepToAlt.hasNext()) {
				try {
					_TmpObject = fujaba__IterStepToAlt.next();

					// ensure correct type and really bound of object alt
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
					alt = (AlternativeFlowAlternative) _TmpObject;
					// bind object
					_TmpObject = alt.getRef();

					// ensure correct type and really bound of object altFlow
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
					altFlow = (AlternativeFlow) _TmpObject;

					// check isomorphic binding between objects flow and altFlow 
					JavaSDM.ensure(!flow.equals(altFlow));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_altFlow_flows_399520 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_399520 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_399520 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_399520
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_399520 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_399520
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
							__DEC_alt_stepAlternative_92336 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_92336 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_92336 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_92336
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_92336 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_92336
									.equals(step));

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
							__DEC_step_steps_625154 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_625154 is really bound
							JavaSDM.ensure(__DEC_step_steps_625154 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_625154.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_625154 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_625154
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_625154 and flow 
							JavaSDM.ensure(!__DEC_step_steps_625154
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_404907
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_404907 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_404907
											.hasNext()) {
								try {
									__DEC_altFlow_ref_404907 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_404907
											.next();

									// check object __DEC_altFlow_ref_404907 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_404907 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_404907 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_404907
											.equals(alt));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

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
						// check object alt is really bound
						JavaSDM.ensure(alt != null);
						// check object altFlow is really bound
						JavaSDM.ensure(altFlow != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects flow and altFlow 
						JavaSDM.ensure(!flow.equals(altFlow));

						// check link actor from step to actor
						JavaSDM.ensure(actor.equals(step.getActor()));

						// check link ref from alt to altFlow
						JavaSDM.ensure(altFlow.equals(alt.getRef()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link flows from altFlow to useCase
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(altFlow, UseCase.class,
										"$eContainer").contains(useCase)));

						// check link src from _edge_actor to step
						JavaSDM.ensure(step.equals(_edge_actor.getSrc()));

						// check link stepAlternative from alt to step
						JavaSDM.ensure(step.equals(alt.eContainer()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link steps from step to altFlow
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(step,
										AlternativeFlow.class, "$eContainer")
								.contains(altFlow)));

						// check link trg from _edge_actor to actor
						JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								alt, altFlow, useCase, flow, actor);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_45(
			EMoflonEdge _edge_sendEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_673708 = null;
		InteractionOperand __DEC_combo_fragment_718771 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_188063 = null;
		InteractionOperand __DEC_messageReceive_fragment_289470 = null;
		Interaction __DEC_messageSend_enclosingInteraction_809683 = null;
		InteractionOperand __DEC_messageSend_fragment_500683 = null;
		Interaction __DEC_operand_enclosingInteraction_121105 = null;
		InteractionOperand __DEC_operand_fragment_364794 = null;
		InteractionOperand __DEC_guard_guard_758741 = null;
		CombinedFragment __DEC_operand_operand_259082 = null;
		Constraint __DEC_spec_specification_558263 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125766 = null;
		Message __DEC_messageReceive_receiveEvent_125766 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_271534 = null;
		Message __DEC_messageSend_receiveEvent_271534 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_431712 = null;
		Message __DEC_messageReceive_sendEvent_431712 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_694712 = null;
		Message __DEC_messageSend_sendEvent_694712 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_978812 = null;
		MessageEnd __DEC_message_message_978812 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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

			// check object _edge_sendEvent is really bound
			JavaSDM.ensure(_edge_sendEvent != null);
			// bind object
			_TmpObject = _edge_sendEvent.getSrc();

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

					// iterate to-many link covered from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link covered from line to operand
							fujaba__Success = false;

							fujaba__IterLineToOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_673708 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_673708 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_673708 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_673708 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_673708
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
											__DEC_combo_fragment_718771 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_718771 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_718771 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_718771 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_718771
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
											__DEC_messageReceive_enclosingInteraction_188063 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_188063 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_188063 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_188063 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_188063
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
											__DEC_messageReceive_fragment_289470 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_289470 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_289470 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_289470 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_289470
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
											__DEC_messageSend_enclosingInteraction_809683 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_809683 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_809683 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_809683 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_809683
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
											__DEC_messageSend_fragment_500683 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_500683 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_500683 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_500683 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_500683
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
											__DEC_operand_enclosingInteraction_121105 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_121105 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_121105 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_121105 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_121105
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
											__DEC_operand_fragment_364794 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_364794 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_364794 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_364794 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_364794
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_758741 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_758741 is really bound
											JavaSDM.ensure(__DEC_guard_guard_758741 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_758741
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_758741 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_758741
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
											__DEC_operand_operand_259082 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_259082 is really bound
											JavaSDM.ensure(__DEC_operand_operand_259082 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_259082
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_259082 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_259082
													.equals(combo));

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
											__DEC_spec_specification_558263 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_558263 is really bound
											JavaSDM.ensure(__DEC_spec_specification_558263 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_558263
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_558263 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_558263
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_125766
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125766 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125766
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_125766 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_125766
															.next();

													// check object __DEC_messageReceive_receiveEvent_125766 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_125766 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_125766 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_125766
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_271534
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_271534 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_271534
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_271534 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_271534
															.next();

													// check object __DEC_messageSend_receiveEvent_271534 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_271534 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_271534 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_271534
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_431712
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_431712 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_431712
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_431712 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_431712
															.next();

													// check object __DEC_messageReceive_sendEvent_431712 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_431712 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_431712 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_431712
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_694712
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_694712 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_694712
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_694712 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_694712
															.next();

													// check object __DEC_messageSend_sendEvent_694712 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_694712 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_694712 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_694712
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_978812
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_978812 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_978812
															.hasNext()) {
												try {
													__DEC_message_message_978812 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_978812
															.next();

													// check object __DEC_message_message_978812 is really bound
													JavaSDM.ensure(__DEC_message_message_978812 != null);
													// check isomorphic binding between objects __DEC_message_message_978812 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_978812
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_978812 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_978812
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_sendEvent is really bound
										JavaSDM.ensure(_edge_sendEvent != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_sendEvent to message
										JavaSDM.ensure(message
												.equals(_edge_sendEvent
														.getSrc()));

										// check link trg from _edge_sendEvent to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_sendEvent
														.getTrg()));

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_46(
			EMoflonEdge _edge_receiveEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_525423 = null;
		InteractionOperand __DEC_combo_fragment_642649 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_822357 = null;
		InteractionOperand __DEC_messageReceive_fragment_46477 = null;
		Interaction __DEC_messageSend_enclosingInteraction_294054 = null;
		InteractionOperand __DEC_messageSend_fragment_72292 = null;
		Interaction __DEC_operand_enclosingInteraction_104785 = null;
		InteractionOperand __DEC_operand_fragment_781524 = null;
		InteractionOperand __DEC_guard_guard_795765 = null;
		CombinedFragment __DEC_operand_operand_600595 = null;
		Constraint __DEC_spec_specification_404731 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665495 = null;
		Message __DEC_messageReceive_receiveEvent_665495 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_490873 = null;
		Message __DEC_messageSend_receiveEvent_490873 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_416774 = null;
		Message __DEC_messageReceive_sendEvent_416774 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_996585 = null;
		Message __DEC_messageSend_sendEvent_996585 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_386804 = null;
		MessageEnd __DEC_message_message_386804 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_receiveEvent is really bound
			JavaSDM.ensure(_edge_receiveEvent != null);
			// bind object
			_TmpObject = _edge_receiveEvent.getTrg();

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
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

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
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// iterate to-many link covered from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link covered from line to operand
							fujaba__Success = false;

							fujaba__IterLineToOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_525423 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_525423 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_525423 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_525423 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_525423
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
											__DEC_combo_fragment_642649 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_642649 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_642649 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_642649 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_642649
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
											__DEC_messageReceive_enclosingInteraction_822357 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_822357 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_822357 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_822357 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_822357
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
											__DEC_messageReceive_fragment_46477 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_46477 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_46477 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_46477 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_46477
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
											__DEC_messageSend_enclosingInteraction_294054 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_294054 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_294054 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_294054 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_294054
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
											__DEC_messageSend_fragment_72292 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_72292 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_72292 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_72292 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_72292
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
											__DEC_operand_enclosingInteraction_104785 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_104785 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_104785 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_104785 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_104785
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
											__DEC_operand_fragment_781524 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_781524 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_781524 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_781524 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_781524
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_795765 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_795765 is really bound
											JavaSDM.ensure(__DEC_guard_guard_795765 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_795765
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_795765 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_795765
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
											__DEC_operand_operand_600595 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_600595 is really bound
											JavaSDM.ensure(__DEC_operand_operand_600595 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_600595
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_600595 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_600595
													.equals(combo));

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
											__DEC_spec_specification_404731 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_404731 is really bound
											JavaSDM.ensure(__DEC_spec_specification_404731 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_404731
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_404731 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_404731
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_665495
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665495 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665495
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_665495 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665495
															.next();

													// check object __DEC_messageReceive_receiveEvent_665495 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_665495 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_665495 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_665495
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_490873
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_490873 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_490873
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_490873 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_490873
															.next();

													// check object __DEC_messageSend_receiveEvent_490873 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_490873 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_490873 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_490873
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_416774
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_416774 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_416774
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_416774 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_416774
															.next();

													// check object __DEC_messageReceive_sendEvent_416774 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_416774 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_416774 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_416774
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_996585
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_996585 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_996585
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_996585 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_996585
															.next();

													// check object __DEC_messageSend_sendEvent_996585 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_996585 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_996585 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_996585
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_386804
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_386804 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_386804
															.hasNext()) {
												try {
													__DEC_message_message_386804 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_386804
															.next();

													// check object __DEC_message_message_386804 is really bound
													JavaSDM.ensure(__DEC_message_message_386804 != null);
													// check isomorphic binding between objects __DEC_message_message_386804 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_386804
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_386804 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_386804
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_receiveEvent is really bound
										JavaSDM.ensure(_edge_receiveEvent != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_receiveEvent to message
										JavaSDM.ensure(message
												.equals(_edge_receiveEvent
														.getSrc()));

										// check link trg from _edge_receiveEvent to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_receiveEvent
														.getTrg()));

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_47(
			EMoflonEdge _edge_interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_311330 = null;
		InteractionOperand __DEC_combo_fragment_450886 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_762417 = null;
		InteractionOperand __DEC_messageReceive_fragment_170303 = null;
		Interaction __DEC_messageSend_enclosingInteraction_910334 = null;
		InteractionOperand __DEC_messageSend_fragment_904915 = null;
		Interaction __DEC_operand_enclosingInteraction_375040 = null;
		InteractionOperand __DEC_operand_fragment_570848 = null;
		InteractionOperand __DEC_guard_guard_35641 = null;
		CombinedFragment __DEC_operand_operand_407639 = null;
		Constraint __DEC_spec_specification_930955 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775663 = null;
		Message __DEC_messageReceive_receiveEvent_775663 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_119724 = null;
		Message __DEC_messageSend_receiveEvent_119724 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_720775 = null;
		Message __DEC_messageReceive_sendEvent_720775 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_136614 = null;
		Message __DEC_messageSend_sendEvent_136614 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_27913 = null;
		MessageEnd __DEC_message_message_27913 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
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
					// iterate to-many link covered from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
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
									// bind object
									message = messageReceive.getMessage();

									// check object message is really bound
									JavaSDM.ensure(message != null);

									// check link message from message to interaction
									JavaSDM.ensure(interaction.equals(message
											.getInteraction()));

									// check link receiveEvent from message to messageReceive
									JavaSDM.ensure(messageReceive
											.equals(message.getReceiveEvent()));

									// bind object
									_TmpObject = message.getSendEvent();

									// ensure correct type and really bound of object messageSend
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageSend = (MessageOccurrenceSpecification) _TmpObject;

									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link message from messageSend to message
									JavaSDM.ensure(message.equals(messageSend
											.getMessage()));

									// check link src from _edge_interaction to message
									JavaSDM.ensure(message
											.equals(_edge_interaction.getSrc()));

									// iterate to-many link covered from line to operand
									fujaba__Success = false;

									fujaba__IterLineToOperand = new ArrayList(
											line.getCoveredBy()).iterator();

									while (fujaba__IterLineToOperand.hasNext()) {
										try {
											_TmpObject = fujaba__IterLineToOperand
													.next();

											// ensure correct type and really bound of object operand
											JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
											operand = (InteractionOperand) _TmpObject;
											// bind object
											guard = operand.getGuard();

											// check object guard is really bound
											JavaSDM.ensure(guard != null);

											// check link operand from operand to combo
											JavaSDM.ensure(combo.equals(operand
													.eContainer()));

											// bind object
											_TmpObject = guard
													.getSpecification();

											// ensure correct type and really bound of object spec
											JavaSDM.ensure(_TmpObject instanceof LiteralString);
											spec = (LiteralString) _TmpObject;

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_enclosingInteraction_311330 = combo
															.getEnclosingInteraction();

													// check object __DEC_combo_enclosingInteraction_311330 is really bound
													JavaSDM.ensure(__DEC_combo_enclosingInteraction_311330 != null);

													// check isomorphic binding between objects __DEC_combo_enclosingInteraction_311330 and interaction 
													JavaSDM.ensure(!__DEC_combo_enclosingInteraction_311330
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
													__DEC_combo_fragment_450886 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_450886 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_450886 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_450886 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_450886
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
													__DEC_messageReceive_enclosingInteraction_762417 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_762417 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_762417 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_762417 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_762417
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
													__DEC_messageReceive_fragment_170303 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_170303 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_170303 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_170303 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_170303
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
													__DEC_messageSend_enclosingInteraction_910334 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_910334 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_910334 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_910334 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_910334
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
													__DEC_messageSend_fragment_904915 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_904915 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_904915 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_904915 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_904915
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
													__DEC_operand_enclosingInteraction_375040 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_375040 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_375040 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_375040 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_375040
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
													__DEC_operand_fragment_570848 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_570848 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_570848 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_570848 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_570848
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link packagedElement from guard
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																guard,
																ModalSequenceDiagram.Package.class,
																"packagedElement")
														.size() == 0);
												// negative check for link packagedElement from spec
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																spec,
																ModalSequenceDiagram.Package.class,
																"packagedElement")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_guard_guard_35641 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_35641 is really bound
													JavaSDM.ensure(__DEC_guard_guard_35641 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_35641
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_35641 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_35641
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
													__DEC_operand_operand_407639 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_407639 is really bound
													JavaSDM.ensure(__DEC_operand_operand_407639 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_407639
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_407639 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_407639
															.equals(combo));

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
													__DEC_spec_specification_930955 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_930955 is really bound
													JavaSDM.ensure(__DEC_spec_specification_930955 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_930955
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_930955 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_930955
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_775663
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775663 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775663
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_775663 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_775663
																	.next();

															// check object __DEC_messageReceive_receiveEvent_775663 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_775663 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_775663 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_775663
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_119724
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_119724 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_119724
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_119724 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_119724
																	.next();

															// check object __DEC_messageSend_receiveEvent_119724 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_119724 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_119724 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_119724
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_720775
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_720775 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_720775
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_720775 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_720775
																	.next();

															// check object __DEC_messageReceive_sendEvent_720775 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_720775 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_720775 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_720775
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_136614
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_136614 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_136614
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_136614 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_136614
																	.next();

															// check object __DEC_messageSend_sendEvent_136614 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_136614 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_136614 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_136614
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_27913
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_27913 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_27913
																	.hasNext()) {
														try {
															__DEC_message_message_27913 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_27913
																	.next();

															// check object __DEC_message_message_27913 is really bound
															JavaSDM.ensure(__DEC_message_message_27913 != null);
															// check isomorphic binding between objects __DEC_message_message_27913 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_27913
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_27913 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_27913
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

												// check link fragment from operand to operand
												JavaSDM.ensure(!(operand.equals(operand
														.getEnclosingOperand())));

												// check link fragment from operand to operand
												JavaSDM.ensure(!(operand.equals(operand
														.getEnclosingOperand())));

												// check object _edge_interaction is really bound
												JavaSDM.ensure(_edge_interaction != null);
												// check object combo is really bound
												JavaSDM.ensure(combo != null);
												// check object guard is really bound
												JavaSDM.ensure(guard != null);
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
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(!(interaction.equals(combo
														.getEnclosingInteraction())));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(!(interaction.equals(messageReceive
														.getEnclosingInteraction())));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(!(interaction.equals(messageSend
														.getEnclosingInteraction())));

												// check link fragment from operand to interaction
												JavaSDM.ensure(!(interaction.equals(operand
														.getEnclosingInteraction())));

												// check link fragment from combo to operand
												JavaSDM.ensure(!(operand.equals(combo
														.getEnclosingOperand())));

												// check link fragment from messageReceive to operand
												JavaSDM.ensure(!(operand.equals(messageReceive
														.getEnclosingOperand())));

												// check link fragment from messageSend to operand
												JavaSDM.ensure(!(operand.equals(messageSend
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

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

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_interaction to message
												JavaSDM.ensure(message
														.equals(_edge_interaction
																.getSrc()));

												// check link trg from _edge_interaction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_interaction
																.getTrg()));

												// check link covered from line to combo
												JavaSDM.ensure(line
														.getCoveredBy()
														.contains(combo));

												// check link covered from messageReceive to line
												JavaSDM.ensure(messageReceive
														.getCovered().contains(
																line));

												// check link covered from operand to line
												JavaSDM.ensure(operand
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
																match, combo,
																line, operand,
																guard, spec,
																message,
																interaction,
																messageSend,
																messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_48(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_920537 = null;
		InteractionOperand __DEC_combo_fragment_871397 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_209343 = null;
		InteractionOperand __DEC_messageReceive_fragment_358869 = null;
		Interaction __DEC_messageSend_enclosingInteraction_810785 = null;
		InteractionOperand __DEC_messageSend_fragment_618472 = null;
		Interaction __DEC_operand_enclosingInteraction_533638 = null;
		InteractionOperand __DEC_operand_fragment_623389 = null;
		InteractionOperand __DEC_guard_guard_806099 = null;
		CombinedFragment __DEC_operand_operand_788183 = null;
		Constraint __DEC_spec_specification_5119 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_890683 = null;
		Message __DEC_messageReceive_receiveEvent_890683 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_874569 = null;
		Message __DEC_messageSend_receiveEvent_874569 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_355064 = null;
		Message __DEC_messageReceive_sendEvent_355064 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_402777 = null;
		Message __DEC_messageSend_sendEvent_402777 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_480130 = null;
		MessageEnd __DEC_message_message_480130 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
							// iterate to-many link covered from line to combo
							fujaba__Success = false;

							fujaba__IterLineToCombo = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToCombo.next();

									// ensure correct type and really bound of object combo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									combo = (CombinedFragment) _TmpObject;
									// iterate to-many link covered from line to messageReceive
									fujaba__Success = false;

									fujaba__IterLineToMessageReceive = new ArrayList(
											line.getCoveredBy()).iterator();

									while (fujaba__IterLineToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterLineToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// bind object
											message = messageReceive
													.getMessage();

											// check object message is really bound
											JavaSDM.ensure(message != null);

											// check link message from message to interaction
											JavaSDM.ensure(interaction
													.equals(message
															.getInteraction()));

											// check link receiveEvent from message to messageReceive
											JavaSDM.ensure(messageReceive
													.equals(message
															.getReceiveEvent()));

											// bind object
											_TmpObject = message.getSendEvent();

											// ensure correct type and really bound of object messageSend
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageSend = (MessageOccurrenceSpecification) _TmpObject;

											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// check link message from messageSend to message
											JavaSDM.ensure(message
													.equals(messageSend
															.getMessage()));

											// check link src from _edge_interaction to message
											JavaSDM.ensure(message
													.equals(_edge_interaction
															.getSrc()));

											// check link trg from _edge_message to message
											JavaSDM.ensure(message
													.equals(_edge_message
															.getTrg()));

											// iterate to-many link covered from line to operand
											fujaba__Success = false;

											fujaba__IterLineToOperand = new ArrayList(
													line.getCoveredBy())
													.iterator();

											while (fujaba__IterLineToOperand
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterLineToOperand
															.next();

													// ensure correct type and really bound of object operand
													JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
													operand = (InteractionOperand) _TmpObject;
													// bind object
													guard = operand.getGuard();

													// check object guard is really bound
													JavaSDM.ensure(guard != null);

													// check link operand from operand to combo
													JavaSDM.ensure(combo.equals(operand
															.eContainer()));

													// bind object
													_TmpObject = guard
															.getSpecification();

													// ensure correct type and really bound of object spec
													JavaSDM.ensure(_TmpObject instanceof LiteralString);
													spec = (LiteralString) _TmpObject;

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_enclosingInteraction_920537 = combo
																	.getEnclosingInteraction();

															// check object __DEC_combo_enclosingInteraction_920537 is really bound
															JavaSDM.ensure(__DEC_combo_enclosingInteraction_920537 != null);

															// check isomorphic binding between objects __DEC_combo_enclosingInteraction_920537 and interaction 
															JavaSDM.ensure(!__DEC_combo_enclosingInteraction_920537
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
															__DEC_combo_fragment_871397 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_871397 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_871397 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_871397 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_871397
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
															__DEC_messageReceive_enclosingInteraction_209343 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_209343 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_209343 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_209343 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_209343
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
															__DEC_messageReceive_fragment_358869 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_358869 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_358869 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_358869 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_358869
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
															__DEC_messageSend_enclosingInteraction_810785 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_810785 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_810785 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_810785 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_810785
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
															__DEC_messageSend_fragment_618472 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_618472 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_618472 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_618472 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_618472
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
															__DEC_operand_enclosingInteraction_533638 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_533638 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_533638 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_533638 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_533638
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
															__DEC_operand_fragment_623389 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_623389 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_623389 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_623389 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_623389
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link packagedElement from guard
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		guard,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")
																.size() == 0);
														// negative check for link packagedElement from spec
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		spec,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_guard_guard_806099 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_806099 is really bound
															JavaSDM.ensure(__DEC_guard_guard_806099 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_806099
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_806099 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_806099
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
															__DEC_operand_operand_788183 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_788183 is really bound
															JavaSDM.ensure(__DEC_operand_operand_788183 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_788183
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_788183 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_788183
																	.equals(combo));

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
															__DEC_spec_specification_5119 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_5119 is really bound
															JavaSDM.ensure(__DEC_spec_specification_5119 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_5119
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_5119 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_5119
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_890683
															fujaba__Success = false;

															fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_890683 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageReceive,
																					Message.class,
																					"receiveEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_890683
																			.hasNext()) {
																try {
																	__DEC_messageReceive_receiveEvent_890683 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_890683
																			.next();

																	// check object __DEC_messageReceive_receiveEvent_890683 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_receiveEvent_890683 != null);
																	// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_890683 and message 
																	JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_890683
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_874569
															fujaba__Success = false;

															fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_874569 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageSend,
																					Message.class,
																					"receiveEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_874569
																			.hasNext()) {
																try {
																	__DEC_messageSend_receiveEvent_874569 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_874569
																			.next();

																	// check object __DEC_messageSend_receiveEvent_874569 is really bound
																	JavaSDM.ensure(__DEC_messageSend_receiveEvent_874569 != null);
																	// check isomorphic binding between objects __DEC_messageSend_receiveEvent_874569 and message 
																	JavaSDM.ensure(!__DEC_messageSend_receiveEvent_874569
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_355064
															fujaba__Success = false;

															fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_355064 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageReceive,
																					Message.class,
																					"sendEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_355064
																			.hasNext()) {
																try {
																	__DEC_messageReceive_sendEvent_355064 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_355064
																			.next();

																	// check object __DEC_messageReceive_sendEvent_355064 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_sendEvent_355064 != null);
																	// check isomorphic binding between objects __DEC_messageReceive_sendEvent_355064 and message 
																	JavaSDM.ensure(!__DEC_messageReceive_sendEvent_355064
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_402777
															fujaba__Success = false;

															fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_402777 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageSend,
																					Message.class,
																					"sendEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_402777
																			.hasNext()) {
																try {
																	__DEC_messageSend_sendEvent_402777 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_402777
																			.next();

																	// check object __DEC_messageSend_sendEvent_402777 is really bound
																	JavaSDM.ensure(__DEC_messageSend_sendEvent_402777 != null);
																	// check isomorphic binding between objects __DEC_messageSend_sendEvent_402777 and message 
																	JavaSDM.ensure(!__DEC_messageSend_sendEvent_402777
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link message from message to __DEC_message_message_480130
															fujaba__Success = false;

															fujaba__IterMessageTo__DEC_message_message_480130 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					message,
																					MessageEnd.class,
																					"message"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageTo__DEC_message_message_480130
																			.hasNext()) {
																try {
																	__DEC_message_message_480130 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_480130
																			.next();

																	// check object __DEC_message_message_480130 is really bound
																	JavaSDM.ensure(__DEC_message_message_480130 != null);
																	// check isomorphic binding between objects __DEC_message_message_480130 and messageReceive 
																	JavaSDM.ensure(!__DEC_message_message_480130
																			.equals(messageReceive));

																	// check isomorphic binding between objects __DEC_message_message_480130 and messageSend 
																	JavaSDM.ensure(!__DEC_message_message_480130
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

														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check object _edge_interaction is really bound
														JavaSDM.ensure(_edge_interaction != null);
														// check object _edge_message is really bound
														JavaSDM.ensure(_edge_message != null);
														// check object combo is really bound
														JavaSDM.ensure(combo != null);
														// check object guard is really bound
														JavaSDM.ensure(guard != null);
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
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects _edge_message and _edge_interaction 
														JavaSDM.ensure(!_edge_message
																.equals(_edge_interaction));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(!(interaction.equals(combo
																.getEnclosingInteraction())));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(!(interaction
																.equals(messageReceive
																		.getEnclosingInteraction())));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(!(interaction
																.equals(messageSend
																		.getEnclosingInteraction())));

														// check link fragment from operand to interaction
														JavaSDM.ensure(!(interaction.equals(operand
																.getEnclosingInteraction())));

														// check link fragment from combo to operand
														JavaSDM.ensure(!(operand.equals(combo
																.getEnclosingOperand())));

														// check link fragment from messageReceive to operand
														JavaSDM.ensure(!(operand
																.equals(messageReceive
																		.getEnclosingOperand())));

														// check link fragment from messageSend to operand
														JavaSDM.ensure(!(operand
																.equals(messageSend
																		.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

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
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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

														// check link covered from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link covered from messageReceive to line
														JavaSDM.ensure(messageReceive
																.getCovered()
																.contains(line));

														// check link covered from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// create object match
														match = TGGRuntimeFactory.eINSTANCE
																.createMatch();

														// assign attribute match
														match.setRuleName(__eClass
																.getName());
														// statement node 'bookkeeping with generic isAppropriate method'
														fujaba__Success = this
																.isAppropriate_BWD(
																		match,
																		combo,
																		line,
																		operand,
																		guard,
																		spec,
																		message,
																		interaction,
																		messageSend,
																		messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_49(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_927900 = null;
		InteractionOperand __DEC_combo_fragment_843026 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_312758 = null;
		InteractionOperand __DEC_messageReceive_fragment_202417 = null;
		Interaction __DEC_messageSend_enclosingInteraction_58918 = null;
		InteractionOperand __DEC_messageSend_fragment_525177 = null;
		Interaction __DEC_operand_enclosingInteraction_390655 = null;
		InteractionOperand __DEC_operand_fragment_204420 = null;
		InteractionOperand __DEC_guard_guard_55872 = null;
		CombinedFragment __DEC_operand_operand_66513 = null;
		Constraint __DEC_spec_specification_517477 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_275057 = null;
		Message __DEC_messageReceive_receiveEvent_275057 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772023 = null;
		Message __DEC_messageSend_receiveEvent_772023 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_613907 = null;
		Message __DEC_messageReceive_sendEvent_613907 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_756179 = null;
		Message __DEC_messageSend_sendEvent_756179 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_692846 = null;
		MessageEnd __DEC_message_message_692846 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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

					// iterate to-many link covered from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link covered from line to operand
							fujaba__Success = false;

							fujaba__IterLineToOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_927900 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_927900 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_927900 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_927900 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_927900
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
											__DEC_combo_fragment_843026 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_843026 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_843026 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_843026 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_843026
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
											__DEC_messageReceive_enclosingInteraction_312758 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_312758 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_312758 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_312758 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_312758
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
											__DEC_messageReceive_fragment_202417 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_202417 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_202417 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_202417 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_202417
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
											__DEC_messageSend_enclosingInteraction_58918 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_58918 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_58918 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_58918 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_58918
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
											__DEC_messageSend_fragment_525177 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_525177 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_525177 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_525177 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_525177
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
											__DEC_operand_enclosingInteraction_390655 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_390655 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_390655 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_390655 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_390655
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
											__DEC_operand_fragment_204420 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_204420 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_204420 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_204420 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_204420
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_55872 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_55872 is really bound
											JavaSDM.ensure(__DEC_guard_guard_55872 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_55872
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_55872 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_55872
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
											__DEC_operand_operand_66513 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_66513 is really bound
											JavaSDM.ensure(__DEC_operand_operand_66513 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_66513
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_66513 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_66513
													.equals(combo));

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
											__DEC_spec_specification_517477 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_517477 is really bound
											JavaSDM.ensure(__DEC_spec_specification_517477 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_517477
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_517477 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_517477
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_275057
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_275057 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_275057
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_275057 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_275057
															.next();

													// check object __DEC_messageReceive_receiveEvent_275057 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_275057 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_275057 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_275057
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_772023
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772023 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772023
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_772023 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772023
															.next();

													// check object __DEC_messageSend_receiveEvent_772023 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_772023 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_772023 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_772023
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_613907
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_613907 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_613907
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_613907 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_613907
															.next();

													// check object __DEC_messageReceive_sendEvent_613907 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_613907 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_613907 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_613907
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_756179
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_756179 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_756179
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_756179 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_756179
															.next();

													// check object __DEC_messageSend_sendEvent_756179 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_756179 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_756179 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_756179
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_692846
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_692846 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_692846
															.hasNext()) {
												try {
													__DEC_message_message_692846 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_692846
															.next();

													// check object __DEC_message_message_692846 is really bound
													JavaSDM.ensure(__DEC_message_message_692846 != null);
													// check isomorphic binding between objects __DEC_message_message_692846 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_692846
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_692846 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_692846
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_message is really bound
										JavaSDM.ensure(_edge_message != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_message to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_message.getSrc()));

										// check link trg from _edge_message to message
										JavaSDM.ensure(message
												.equals(_edge_message.getTrg()));

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(
			EMoflonEdge _edge_message) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_637044 = null;
		InteractionOperand __DEC_combo_fragment_537685 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_529288 = null;
		InteractionOperand __DEC_messageReceive_fragment_960759 = null;
		Interaction __DEC_messageSend_enclosingInteraction_457170 = null;
		InteractionOperand __DEC_messageSend_fragment_723868 = null;
		Interaction __DEC_operand_enclosingInteraction_138665 = null;
		InteractionOperand __DEC_operand_fragment_138289 = null;
		InteractionOperand __DEC_guard_guard_685393 = null;
		CombinedFragment __DEC_operand_operand_857076 = null;
		Constraint __DEC_spec_specification_578304 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_516258 = null;
		Message __DEC_messageReceive_receiveEvent_516258 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_610438 = null;
		Message __DEC_messageSend_receiveEvent_610438 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_810938 = null;
		Message __DEC_messageReceive_sendEvent_810938 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_570793 = null;
		Message __DEC_messageSend_sendEvent_570793 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_787516 = null;
		MessageEnd __DEC_message_message_787516 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Iterator fujaba__IterMessageReceiveToLine = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check object _edge_message is really bound
			JavaSDM.ensure(_edge_message != null);
			// bind object
			_TmpObject = _edge_message.getSrc();

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
			_TmpObject = message.getSendEvent();

			// ensure correct type and really bound of object messageSend
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageSend = (MessageOccurrenceSpecification) _TmpObject;

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check link message from messageSend to message
			JavaSDM.ensure(message.equals(messageSend.getMessage()));

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
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link message from message to interaction
					JavaSDM.ensure(interaction.equals(message.getInteraction()));

					// iterate to-many link covered from line to combo
					fujaba__Success = false;

					fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
							.iterator();

					while (fujaba__IterLineToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link covered from line to operand
							fujaba__Success = false;

							fujaba__IterLineToOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToOperand
											.next();

									// ensure correct type and really bound of object operand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									operand = (InteractionOperand) _TmpObject;
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// check link operand from operand to combo
									JavaSDM.ensure(combo.equals(operand
											.eContainer()));

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_637044 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_637044 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_637044 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_637044 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_637044
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
											__DEC_combo_fragment_537685 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_537685 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_537685 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_537685 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_537685
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
											__DEC_messageReceive_enclosingInteraction_529288 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_529288 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_529288 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_529288 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_529288
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
											__DEC_messageReceive_fragment_960759 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_960759 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_960759 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_960759 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_960759
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
											__DEC_messageSend_enclosingInteraction_457170 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_457170 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_457170 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_457170 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_457170
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
											__DEC_messageSend_fragment_723868 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_723868 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_723868 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_723868 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_723868
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
											__DEC_operand_enclosingInteraction_138665 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_138665 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_138665 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_138665 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_138665
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
											__DEC_operand_fragment_138289 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_138289 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_138289 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_138289 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_138289
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_685393 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_685393 is really bound
											JavaSDM.ensure(__DEC_guard_guard_685393 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_685393
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_685393 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_685393
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
											__DEC_operand_operand_857076 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_857076 is really bound
											JavaSDM.ensure(__DEC_operand_operand_857076 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_857076
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_857076 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_857076
													.equals(combo));

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
											__DEC_spec_specification_578304 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_578304 is really bound
											JavaSDM.ensure(__DEC_spec_specification_578304 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_578304
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_578304 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_578304
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_516258
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_516258 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_516258
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_516258 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_516258
															.next();

													// check object __DEC_messageReceive_receiveEvent_516258 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_516258 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_516258 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_516258
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_610438
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_610438 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_610438
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_610438 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_610438
															.next();

													// check object __DEC_messageSend_receiveEvent_610438 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_610438 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_610438 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_610438
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_810938
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_810938 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_810938
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_810938 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_810938
															.next();

													// check object __DEC_messageReceive_sendEvent_810938 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_810938 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_810938 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_810938
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_570793
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_570793 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_570793
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_570793 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_570793
															.next();

													// check object __DEC_messageSend_sendEvent_570793 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_570793 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_570793 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_570793
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_787516
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_787516 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_787516
															.hasNext()) {
												try {
													__DEC_message_message_787516 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_787516
															.next();

													// check object __DEC_message_message_787516 is really bound
													JavaSDM.ensure(__DEC_message_message_787516 != null);
													// check isomorphic binding between objects __DEC_message_message_787516 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_787516
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_787516 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_787516
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_message is really bound
										JavaSDM.ensure(_edge_message != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_message to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_message.getSrc()));

										// check link trg from _edge_message to message
										JavaSDM.ensure(message
												.equals(_edge_message.getTrg()));

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_51(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_358478 = null;
		InteractionOperand __DEC_combo_fragment_135089 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_646278 = null;
		InteractionOperand __DEC_messageReceive_fragment_163350 = null;
		Interaction __DEC_messageSend_enclosingInteraction_858617 = null;
		InteractionOperand __DEC_messageSend_fragment_979959 = null;
		Interaction __DEC_operand_enclosingInteraction_144270 = null;
		InteractionOperand __DEC_operand_fragment_926681 = null;
		InteractionOperand __DEC_guard_guard_712467 = null;
		CombinedFragment __DEC_operand_operand_39064 = null;
		Constraint __DEC_spec_specification_89553 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_604156 = null;
		Message __DEC_messageReceive_receiveEvent_604156 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_118370 = null;
		Message __DEC_messageSend_receiveEvent_118370 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611711 = null;
		Message __DEC_messageReceive_sendEvent_611711 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_31950 = null;
		Message __DEC_messageSend_sendEvent_31950 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_980855 = null;
		MessageEnd __DEC_message_message_980855 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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

			// bind object
			message = messageReceive.getMessage();

			// check object message is really bound
			JavaSDM.ensure(message != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

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

			// check link covered from messageReceive to line
			JavaSDM.ensure(messageReceive.getCovered().contains(line));

			// iterate to-many link covered from line to combo
			fujaba__Success = false;

			fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// iterate to-many link covered from line to operand
					fujaba__Success = false;

					fujaba__IterLineToOperand = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// bind object
							guard = operand.getGuard();

							// check object guard is really bound
							JavaSDM.ensure(guard != null);

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_enclosingInteraction_358478 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_358478 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_358478 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_358478 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_358478
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
									__DEC_combo_fragment_135089 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_135089 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_135089 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_135089 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_135089
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
									__DEC_messageReceive_enclosingInteraction_646278 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_646278 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_646278 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_646278 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_646278
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
									__DEC_messageReceive_fragment_163350 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_163350 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_163350 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_163350 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_163350
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
									__DEC_messageSend_enclosingInteraction_858617 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_858617 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_858617 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_858617 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_858617
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
									__DEC_messageSend_fragment_979959 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_979959 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_979959 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_979959 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_979959
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
									__DEC_operand_enclosingInteraction_144270 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_144270 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_144270 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_144270 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_144270
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
									__DEC_operand_fragment_926681 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_926681 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_926681 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_926681 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_926681
											.equals(operand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link packagedElement from guard
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												guard,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// negative check for link packagedElement from spec
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												spec,
												ModalSequenceDiagram.Package.class,
												"packagedElement").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_guard_guard_712467 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_712467 is really bound
									JavaSDM.ensure(__DEC_guard_guard_712467 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_712467
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_712467 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_712467
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
									__DEC_operand_operand_39064 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_39064 is really bound
									JavaSDM.ensure(__DEC_operand_operand_39064 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_39064
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_39064 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_39064
											.equals(combo));

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
									__DEC_spec_specification_89553 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_89553 is really bound
									JavaSDM.ensure(__DEC_spec_specification_89553 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_89553
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_89553 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_89553
											.equals(guard));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_604156
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_604156 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_604156
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_604156 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_604156
													.next();

											// check object __DEC_messageReceive_receiveEvent_604156 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_604156 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_604156 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_604156
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_118370
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_118370 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_118370
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_118370 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_118370
													.next();

											// check object __DEC_messageSend_receiveEvent_118370 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_118370 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_118370 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_118370
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_611711
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611711 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611711
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_611711 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_611711
													.next();

											// check object __DEC_messageReceive_sendEvent_611711 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_611711 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_611711 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_611711
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_31950
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_31950 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_31950
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_31950 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_31950
													.next();

											// check object __DEC_messageSend_sendEvent_31950 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_31950 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_31950 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_31950
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_980855
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_980855 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_980855
													.hasNext()) {
										try {
											__DEC_message_message_980855 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_980855
													.next();

											// check object __DEC_message_message_980855 is really bound
											JavaSDM.ensure(__DEC_message_message_980855 != null);
											// check isomorphic binding between objects __DEC_message_message_980855 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_980855
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_980855 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_980855
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

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check link fragment from operand to operand
								JavaSDM.ensure(!(operand.equals(operand
										.getEnclosingOperand())));

								// check object _edge_coveredBy is really bound
								JavaSDM.ensure(_edge_coveredBy != null);
								// check object combo is really bound
								JavaSDM.ensure(combo != null);
								// check object guard is really bound
								JavaSDM.ensure(guard != null);
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
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check link fragment from combo to interaction
								JavaSDM.ensure(!(interaction.equals(combo
										.getEnclosingInteraction())));

								// check link fragment from messageReceive to interaction
								JavaSDM.ensure(!(interaction
										.equals(messageReceive
												.getEnclosingInteraction())));

								// check link fragment from messageSend to interaction
								JavaSDM.ensure(!(interaction.equals(messageSend
										.getEnclosingInteraction())));

								// check link fragment from operand to interaction
								JavaSDM.ensure(!(interaction.equals(operand
										.getEnclosingInteraction())));

								// check link fragment from combo to operand
								JavaSDM.ensure(!(operand.equals(combo
										.getEnclosingOperand())));

								// check link fragment from messageReceive to operand
								JavaSDM.ensure(!(operand.equals(messageReceive
										.getEnclosingOperand())));

								// check link fragment from messageSend to operand
								JavaSDM.ensure(!(operand.equals(messageSend
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

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

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to messageReceive
								JavaSDM.ensure(messageReceive
										.equals(_edge_coveredBy.getTrg()));

								// check link covered from line to combo
								JavaSDM.ensure(line.getCoveredBy().contains(
										combo));

								// check link covered from messageReceive to line
								JavaSDM.ensure(messageReceive.getCovered()
										.contains(line));

								// check link covered from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										combo, line, operand, guard, spec,
										message, interaction, messageSend,
										messageReceive);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_52(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_combo_enclosingInteraction_509946 = null;
		InteractionOperand __DEC_combo_fragment_568860 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_425941 = null;
		InteractionOperand __DEC_messageReceive_fragment_108088 = null;
		Interaction __DEC_messageSend_enclosingInteraction_918789 = null;
		InteractionOperand __DEC_messageSend_fragment_695128 = null;
		Interaction __DEC_operand_enclosingInteraction_935623 = null;
		InteractionOperand __DEC_operand_fragment_371185 = null;
		InteractionOperand __DEC_guard_guard_187551 = null;
		CombinedFragment __DEC_operand_operand_291794 = null;
		Constraint __DEC_spec_specification_530469 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678175 = null;
		Message __DEC_messageReceive_receiveEvent_678175 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_189328 = null;
		Message __DEC_messageSend_receiveEvent_189328 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857513 = null;
		Message __DEC_messageReceive_sendEvent_857513 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_441535 = null;
		Message __DEC_messageSend_sendEvent_441535 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_435589 = null;
		MessageEnd __DEC_message_message_435589 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link message from message to interaction
			JavaSDM.ensure(interaction.equals(message.getInteraction()));

			// check link covered from messageReceive to line
			JavaSDM.ensure(messageReceive.getCovered().contains(line));

			// iterate to-many link covered from line to combo
			fujaba__Success = false;

			fujaba__IterLineToCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
					// iterate to-many link covered from line to operand
					fujaba__Success = false;

					fujaba__IterLineToOperand = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToOperand.next();

							// ensure correct type and really bound of object operand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							operand = (InteractionOperand) _TmpObject;
							// bind object
							guard = operand.getGuard();

							// check object guard is really bound
							JavaSDM.ensure(guard != null);

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_enclosingInteraction_509946 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_509946 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_509946 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_509946 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_509946
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
											__DEC_combo_fragment_568860 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_568860 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_568860 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_568860 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_568860
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
											__DEC_messageReceive_enclosingInteraction_425941 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_425941 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_425941 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_425941 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_425941
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
											__DEC_messageReceive_fragment_108088 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_108088 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_108088 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_108088 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_108088
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
											__DEC_messageSend_enclosingInteraction_918789 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_918789 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_918789 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_918789 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_918789
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
											__DEC_messageSend_fragment_695128 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_695128 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_695128 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_695128 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_695128
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
											__DEC_operand_enclosingInteraction_935623 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_935623 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_935623 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_935623 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_935623
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
											__DEC_operand_fragment_371185 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_371185 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_371185 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_371185 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_371185
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link packagedElement from guard
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														guard,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// negative check for link packagedElement from spec
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														spec,
														ModalSequenceDiagram.Package.class,
														"packagedElement")
												.size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_guard_guard_187551 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_187551 is really bound
											JavaSDM.ensure(__DEC_guard_guard_187551 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_187551
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_187551 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_187551
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
											__DEC_operand_operand_291794 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_291794 is really bound
											JavaSDM.ensure(__DEC_operand_operand_291794 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_291794
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_291794 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_291794
													.equals(combo));

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
											__DEC_spec_specification_530469 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_530469 is really bound
											JavaSDM.ensure(__DEC_spec_specification_530469 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_530469
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_530469 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_530469
													.equals(guard));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_678175
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678175 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678175
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_678175 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_678175
															.next();

													// check object __DEC_messageReceive_receiveEvent_678175 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_678175 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_678175 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_678175
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_189328
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_189328 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_189328
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_189328 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_189328
															.next();

													// check object __DEC_messageSend_receiveEvent_189328 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_189328 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_189328 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_189328
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_857513
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857513 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857513
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_857513 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_857513
															.next();

													// check object __DEC_messageReceive_sendEvent_857513 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_857513 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_857513 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_857513
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_441535
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_441535 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_441535
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_441535 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_441535
															.next();

													// check object __DEC_messageSend_sendEvent_441535 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_441535 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_441535 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_441535
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_435589
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_435589 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_435589
															.hasNext()) {
												try {
													__DEC_message_message_435589 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_435589
															.next();

													// check object __DEC_message_message_435589 is really bound
													JavaSDM.ensure(__DEC_message_message_435589 != null);
													// check isomorphic binding between objects __DEC_message_message_435589 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_435589
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_435589 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_435589
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

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check link fragment from operand to operand
										JavaSDM.ensure(!(operand.equals(operand
												.getEnclosingOperand())));

										// check object _edge_covered is really bound
										JavaSDM.ensure(_edge_covered != null);
										// check object _edge_coveredBy is really bound
										JavaSDM.ensure(_edge_coveredBy != null);
										// check object combo is really bound
										JavaSDM.ensure(combo != null);
										// check object guard is really bound
										JavaSDM.ensure(guard != null);
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
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
										JavaSDM.ensure(!_edge_coveredBy
												.equals(_edge_covered));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check link fragment from combo to interaction
										JavaSDM.ensure(!(interaction.equals(combo
												.getEnclosingInteraction())));

										// check link fragment from messageReceive to interaction
										JavaSDM.ensure(!(interaction.equals(messageReceive
												.getEnclosingInteraction())));

										// check link fragment from messageSend to interaction
										JavaSDM.ensure(!(interaction.equals(messageSend
												.getEnclosingInteraction())));

										// check link fragment from operand to interaction
										JavaSDM.ensure(!(interaction.equals(operand
												.getEnclosingInteraction())));

										// check link fragment from combo to operand
										JavaSDM.ensure(!(operand.equals(combo
												.getEnclosingOperand())));

										// check link fragment from messageReceive to operand
										JavaSDM.ensure(!(operand
												.equals(messageReceive
														.getEnclosingOperand())));

										// check link fragment from messageSend to operand
										JavaSDM.ensure(!(operand
												.equals(messageSend
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

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

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

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

										// check link covered from line to combo
										JavaSDM.ensure(line.getCoveredBy()
												.contains(combo));

										// check link covered from messageReceive to line
										JavaSDM.ensure(messageReceive
												.getCovered().contains(line));

										// check link covered from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														combo, line, operand,
														guard, spec, message,
														interaction,
														messageSend,
														messageReceive);
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
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Flow flow,
			NormalStep step, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
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
					step, actor));

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
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__useCase_flows_flow.setTrg(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, useCase, flow, step, actor);
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
			Flow flow, NormalStep step, Actor actor) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Flow flow, NormalStep step, Actor actor) {
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
			Actor actor, ActorToLifeline actorToLine) {
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
		return csp;
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
			EObject line, EObject actor, EObject actorToLine) {
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
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
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

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
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
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__messageReceive_message_message,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

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
				__messageSend_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setTrg(interaction);

				// create link
				__interaction_message_message.setSrc(interaction);

				// create link
				__messageSend_message_message.setSrc(messageSend);

				// create link
				__message_sendEvent_messageSend.setTrg(messageSend);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

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
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

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
			Actor actor, ActorToLifeline actorToLine) {
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
		return csp;
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
			EObject line, EObject actor, EObject actorToLine) {
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
		Flow __DEC_step_steps_178395 = null;
		Match match = null;
		Actor actor = null;
		NormalStep step = null;
		UseCase useCase = null;
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

			// check link steps from step to flow
			JavaSDM.ensure(flow.equals(step.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_178395 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_178395 is really bound
					JavaSDM.ensure(__DEC_step_steps_178395 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_178395.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_178395 and flow 
					JavaSDM.ensure(!__DEC_step_steps_178395.equals(flow));

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
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_steps to flow
				JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_steps to step
				JavaSDM.ensure(step.equals(_edge_steps.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, useCase, flow,
						step, actor);
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
		Flow __DEC_step_steps_126427 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_126427 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_126427 is really bound
					JavaSDM.ensure(__DEC_step_steps_126427 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_126427.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_126427 and flow 
					JavaSDM.ensure(!__DEC_step_steps_126427.equals(flow));

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
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link actor from step to actor
				JavaSDM.ensure(actor.equals(step.getActor()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_actor to step
				JavaSDM.ensure(step.equals(_edge_actor.getSrc()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_actor to actor
				JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, useCase, flow,
						step, actor);
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
		Interaction __DEC_messageReceive_enclosingInteraction_418485 = null;
		Interaction __DEC_messageSend_enclosingInteraction_994376 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_671642 = null;
		Message __DEC_messageReceive_receiveEvent_671642 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_425158 = null;
		Message __DEC_messageSend_receiveEvent_425158 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_457521 = null;
		Message __DEC_messageReceive_sendEvent_457521 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_335539 = null;
		Message __DEC_messageSend_sendEvent_335539 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_375968 = null;
		MessageEnd __DEC_message_message_375968 = null;
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
							__DEC_messageReceive_enclosingInteraction_418485 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_418485 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_418485 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_418485 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_418485
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
							__DEC_messageSend_enclosingInteraction_994376 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_994376 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_994376 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_994376 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_994376
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_671642
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_671642 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_671642
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_671642 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_671642
											.next();

									// check object __DEC_messageReceive_receiveEvent_671642 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_671642 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_671642 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_671642
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_425158
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_425158 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_425158
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_425158 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_425158
											.next();

									// check object __DEC_messageSend_receiveEvent_425158 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_425158 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_425158 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_425158
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_457521
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_457521 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_457521
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_457521 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_457521
											.next();

									// check object __DEC_messageReceive_sendEvent_457521 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_457521 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_457521 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_457521
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_335539
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_335539 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_335539
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_335539 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_335539
											.next();

									// check object __DEC_messageSend_sendEvent_335539 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_335539 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_335539 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_335539
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_375968
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_375968 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_375968
											.hasNext()) {
								try {
									__DEC_message_message_375968 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_375968
											.next();

									// check object __DEC_message_message_375968 is really bound
									JavaSDM.ensure(__DEC_message_message_375968 != null);
									// check isomorphic binding between objects __DEC_message_message_375968 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_375968
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_375968 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_375968
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
		Interaction __DEC_messageReceive_enclosingInteraction_810553 = null;
		Interaction __DEC_messageSend_enclosingInteraction_433896 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_749647 = null;
		Message __DEC_messageReceive_receiveEvent_749647 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_278131 = null;
		Message __DEC_messageSend_receiveEvent_278131 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_655332 = null;
		Message __DEC_messageReceive_sendEvent_655332 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_34294 = null;
		Message __DEC_messageSend_sendEvent_34294 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_620675 = null;
		MessageEnd __DEC_message_message_620675 = null;
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

			// check object _edge_receiveEvent is really bound
			JavaSDM.ensure(_edge_receiveEvent != null);
			// bind object
			_TmpObject = _edge_receiveEvent.getSrc();

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
							__DEC_messageReceive_enclosingInteraction_810553 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_810553 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_810553 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_810553 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_810553
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
							__DEC_messageSend_enclosingInteraction_433896 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_433896 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_433896 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_433896 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_433896
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_749647
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_749647 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_749647
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_749647 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_749647
											.next();

									// check object __DEC_messageReceive_receiveEvent_749647 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_749647 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_749647 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_749647
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_278131
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_278131 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_278131
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_278131 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_278131
											.next();

									// check object __DEC_messageSend_receiveEvent_278131 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_278131 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_278131 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_278131
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_655332
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_655332 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_655332
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_655332 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_655332
											.next();

									// check object __DEC_messageReceive_sendEvent_655332 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_655332 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_655332 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_655332
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_34294
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_34294 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_34294
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_34294 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_34294
											.next();

									// check object __DEC_messageSend_sendEvent_34294 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_34294 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_34294 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_34294
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_620675
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_620675 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_620675
											.hasNext()) {
								try {
									__DEC_message_message_620675 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_620675
											.next();

									// check object __DEC_message_message_620675 is really bound
									JavaSDM.ensure(__DEC_message_message_620675 != null);
									// check isomorphic binding between objects __DEC_message_message_620675 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_620675
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_620675 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_620675
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
		Interaction __DEC_messageReceive_enclosingInteraction_17590 = null;
		Interaction __DEC_messageSend_enclosingInteraction_198678 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_596393 = null;
		Message __DEC_messageReceive_receiveEvent_596393 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_626973 = null;
		Message __DEC_messageSend_receiveEvent_626973 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_898503 = null;
		Message __DEC_messageReceive_sendEvent_898503 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_175081 = null;
		Message __DEC_messageSend_sendEvent_175081 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_435655 = null;
		MessageEnd __DEC_message_message_435655 = null;
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
							__DEC_messageReceive_enclosingInteraction_17590 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_17590 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_17590 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_17590 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_17590
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
							__DEC_messageSend_enclosingInteraction_198678 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_198678 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_198678 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_198678 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_198678
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_596393
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_596393 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_596393
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_596393 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_596393
											.next();

									// check object __DEC_messageReceive_receiveEvent_596393 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_596393 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_596393 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_596393
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_626973
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_626973 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_626973
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_626973 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_626973
											.next();

									// check object __DEC_messageSend_receiveEvent_626973 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_626973 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_626973 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_626973
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_898503
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_898503 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_898503
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_898503 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_898503
											.next();

									// check object __DEC_messageReceive_sendEvent_898503 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_898503 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_898503 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_898503
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_175081
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_175081 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_175081
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_175081 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_175081
											.next();

									// check object __DEC_messageSend_sendEvent_175081 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_175081 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_175081 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_175081
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_435655
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_435655 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_435655
											.hasNext()) {
								try {
									__DEC_message_message_435655 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_435655
											.next();

									// check object __DEC_message_message_435655 is really bound
									JavaSDM.ensure(__DEC_message_message_435655 != null);
									// check isomorphic binding between objects __DEC_message_message_435655 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_435655
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_435655 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_435655
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
		Interaction __DEC_messageReceive_enclosingInteraction_593493 = null;
		Interaction __DEC_messageSend_enclosingInteraction_182504 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_761932 = null;
		Message __DEC_messageReceive_receiveEvent_761932 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_602587 = null;
		Message __DEC_messageSend_receiveEvent_602587 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_251347 = null;
		Message __DEC_messageReceive_sendEvent_251347 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147292 = null;
		Message __DEC_messageSend_sendEvent_147292 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_17196 = null;
		MessageEnd __DEC_message_message_17196 = null;
		Match match = null;
		Iterator fujaba__IterMessageTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
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
									__DEC_messageReceive_enclosingInteraction_593493 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_593493 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_593493 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_593493 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_593493
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
									__DEC_messageSend_enclosingInteraction_182504 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_182504 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_182504 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_182504 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_182504
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_761932
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_761932 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_761932
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_761932 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_761932
													.next();

											// check object __DEC_messageReceive_receiveEvent_761932 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_761932 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_761932 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_761932
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_602587
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_602587 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_602587
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_602587 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_602587
													.next();

											// check object __DEC_messageSend_receiveEvent_602587 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_602587 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_602587 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_602587
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_251347
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_251347 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_251347
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_251347 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_251347
													.next();

											// check object __DEC_messageReceive_sendEvent_251347 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_251347 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_251347 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_251347
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_147292
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147292 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147292
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_147292 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_147292
													.next();

											// check object __DEC_messageSend_sendEvent_147292 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_147292 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_147292 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_147292
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_17196
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_17196 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_17196
													.hasNext()) {
										try {
											__DEC_message_message_17196 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_17196
													.next();

											// check object __DEC_message_message_17196 is really bound
											JavaSDM.ensure(__DEC_message_message_17196 != null);
											// check isomorphic binding between objects __DEC_message_message_17196 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_17196
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_17196 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_17196
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
		Interaction __DEC_messageReceive_enclosingInteraction_567487 = null;
		Interaction __DEC_messageSend_enclosingInteraction_871348 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_92830 = null;
		Message __DEC_messageReceive_receiveEvent_92830 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104350 = null;
		Message __DEC_messageSend_receiveEvent_104350 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_213021 = null;
		Message __DEC_messageReceive_sendEvent_213021 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_474744 = null;
		Message __DEC_messageSend_sendEvent_474744 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_766264 = null;
		MessageEnd __DEC_message_message_766264 = null;
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
							__DEC_messageReceive_enclosingInteraction_567487 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_567487 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_567487 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_567487 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_567487
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
							__DEC_messageSend_enclosingInteraction_871348 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_871348 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_871348 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_871348 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_871348
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_92830
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_92830 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_92830
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_92830 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_92830
											.next();

									// check object __DEC_messageReceive_receiveEvent_92830 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_92830 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_92830 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_92830
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_104350
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104350 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104350
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_104350 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_104350
											.next();

									// check object __DEC_messageSend_receiveEvent_104350 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_104350 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_104350 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_104350
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_213021
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_213021 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_213021
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_213021 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_213021
											.next();

									// check object __DEC_messageReceive_sendEvent_213021 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_213021 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_213021 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_213021
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_474744
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_474744 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_474744
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_474744 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_474744
											.next();

									// check object __DEC_messageSend_sendEvent_474744 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_474744 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_474744 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_474744
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_766264
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_766264 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_766264
											.hasNext()) {
								try {
									__DEC_message_message_766264 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_766264
											.next();

									// check object __DEC_message_message_766264 is really bound
									JavaSDM.ensure(__DEC_message_message_766264 != null);
									// check isomorphic binding between objects __DEC_message_message_766264 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_766264
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_766264 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_766264
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
		Interaction __DEC_messageReceive_enclosingInteraction_926079 = null;
		Interaction __DEC_messageSend_enclosingInteraction_226977 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_936631 = null;
		Message __DEC_messageReceive_receiveEvent_936631 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_409665 = null;
		Message __DEC_messageSend_receiveEvent_409665 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_832320 = null;
		Message __DEC_messageReceive_sendEvent_832320 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_125780 = null;
		Message __DEC_messageSend_sendEvent_125780 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_173905 = null;
		MessageEnd __DEC_message_message_173905 = null;
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
							__DEC_messageReceive_enclosingInteraction_926079 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_926079 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_926079 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_926079 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_926079
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
							__DEC_messageSend_enclosingInteraction_226977 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_226977 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_226977 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_226977 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_226977
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_936631
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_936631 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_936631
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_936631 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_936631
											.next();

									// check object __DEC_messageReceive_receiveEvent_936631 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_936631 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_936631 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_936631
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_409665
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_409665 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_409665
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_409665 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_409665
											.next();

									// check object __DEC_messageSend_receiveEvent_409665 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_409665 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_409665 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_409665
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_832320
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_832320 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_832320
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_832320 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_832320
											.next();

									// check object __DEC_messageReceive_sendEvent_832320 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_832320 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_832320 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_832320
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_125780
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_125780 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_125780
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_125780 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_125780
											.next();

									// check object __DEC_messageSend_sendEvent_125780 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_125780 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_125780 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_125780
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_173905
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_173905 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_173905
											.hasNext()) {
								try {
									__DEC_message_message_173905 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_173905
											.next();

									// check object __DEC_message_message_173905 is really bound
									JavaSDM.ensure(__DEC_message_message_173905 != null);
									// check isomorphic binding between objects __DEC_message_message_173905 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_173905
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_173905 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_173905
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
		Interaction __DEC_messageReceive_enclosingInteraction_186545 = null;
		Interaction __DEC_messageSend_enclosingInteraction_547043 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909533 = null;
		Message __DEC_messageReceive_receiveEvent_909533 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_36185 = null;
		Message __DEC_messageSend_receiveEvent_36185 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_783910 = null;
		Message __DEC_messageReceive_sendEvent_783910 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_123670 = null;
		Message __DEC_messageSend_sendEvent_123670 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_498330 = null;
		MessageEnd __DEC_message_message_498330 = null;
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
					__DEC_messageReceive_enclosingInteraction_186545 = messageReceive
							.getEnclosingInteraction();

					// check object __DEC_messageReceive_enclosingInteraction_186545 is really bound
					JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_186545 != null);

					// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_186545 and interaction 
					JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_186545
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
					__DEC_messageSend_enclosingInteraction_547043 = messageSend
							.getEnclosingInteraction();

					// check object __DEC_messageSend_enclosingInteraction_547043 is really bound
					JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_547043 != null);

					// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_547043 and interaction 
					JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_547043
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

					// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_909533
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909533 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909533
									.hasNext()) {
						try {
							__DEC_messageReceive_receiveEvent_909533 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_909533
									.next();

							// check object __DEC_messageReceive_receiveEvent_909533 is really bound
							JavaSDM.ensure(__DEC_messageReceive_receiveEvent_909533 != null);
							// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_909533 and message 
							JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_909533
									.equals(message));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_36185
					fujaba__Success = false;

					fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_36185 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageSend,
											Message.class, "receiveEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_36185
									.hasNext()) {
						try {
							__DEC_messageSend_receiveEvent_36185 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_36185
									.next();

							// check object __DEC_messageSend_receiveEvent_36185 is really bound
							JavaSDM.ensure(__DEC_messageSend_receiveEvent_36185 != null);
							// check isomorphic binding between objects __DEC_messageSend_receiveEvent_36185 and message 
							JavaSDM.ensure(!__DEC_messageSend_receiveEvent_36185
									.equals(message));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_783910
					fujaba__Success = false;

					fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_783910 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageReceive,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_783910
									.hasNext()) {
						try {
							__DEC_messageReceive_sendEvent_783910 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_783910
									.next();

							// check object __DEC_messageReceive_sendEvent_783910 is really bound
							JavaSDM.ensure(__DEC_messageReceive_sendEvent_783910 != null);
							// check isomorphic binding between objects __DEC_messageReceive_sendEvent_783910 and message 
							JavaSDM.ensure(!__DEC_messageReceive_sendEvent_783910
									.equals(message));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_123670
					fujaba__Success = false;

					fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_123670 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(messageSend,
											Message.class, "sendEvent"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_123670
									.hasNext()) {
						try {
							__DEC_messageSend_sendEvent_123670 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_123670
									.next();

							// check object __DEC_messageSend_sendEvent_123670 is really bound
							JavaSDM.ensure(__DEC_messageSend_sendEvent_123670 != null);
							// check isomorphic binding between objects __DEC_messageSend_sendEvent_123670 and message 
							JavaSDM.ensure(!__DEC_messageSend_sendEvent_123670
									.equals(message));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link message from message to __DEC_message_message_498330
					fujaba__Success = false;

					fujaba__IterMessageTo__DEC_message_message_498330 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(message,
											MessageEnd.class, "message"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterMessageTo__DEC_message_message_498330
									.hasNext()) {
						try {
							__DEC_message_message_498330 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_498330
									.next();

							// check object __DEC_message_message_498330 is really bound
							JavaSDM.ensure(__DEC_message_message_498330 != null);
							// check isomorphic binding between objects __DEC_message_message_498330 and messageReceive 
							JavaSDM.ensure(!__DEC_message_message_498330
									.equals(messageReceive));

							// check isomorphic binding between objects __DEC_message_message_498330 and messageSend 
							JavaSDM.ensure(!__DEC_message_message_498330
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
		Interaction __DEC_messageReceive_enclosingInteraction_575604 = null;
		Interaction __DEC_messageSend_enclosingInteraction_520538 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_232993 = null;
		Message __DEC_messageReceive_receiveEvent_232993 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_880112 = null;
		Message __DEC_messageSend_receiveEvent_880112 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_442795 = null;
		Message __DEC_messageReceive_sendEvent_442795 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_216276 = null;
		Message __DEC_messageSend_sendEvent_216276 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_925037 = null;
		MessageEnd __DEC_message_message_925037 = null;
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
							__DEC_messageReceive_enclosingInteraction_575604 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_575604 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_575604 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_575604 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_575604
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
							__DEC_messageSend_enclosingInteraction_520538 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_520538 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_520538 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_520538 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_520538
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_232993
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_232993 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_232993
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_232993 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_232993
											.next();

									// check object __DEC_messageReceive_receiveEvent_232993 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_232993 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_232993 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_232993
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_880112
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_880112 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_880112
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_880112 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_880112
											.next();

									// check object __DEC_messageSend_receiveEvent_880112 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_880112 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_880112 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_880112
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_442795
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_442795 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_442795
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_442795 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_442795
											.next();

									// check object __DEC_messageReceive_sendEvent_442795 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_442795 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_442795 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_442795
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_216276
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_216276 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_216276
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_216276 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_216276
											.next();

									// check object __DEC_messageSend_sendEvent_216276 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_216276 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_216276 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_216276
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_925037
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_925037 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_925037
											.hasNext()) {
								try {
									__DEC_message_message_925037 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_925037
											.next();

									// check object __DEC_message_message_925037 is really bound
									JavaSDM.ensure(__DEC_message_message_925037 != null);
									// check isomorphic binding between objects __DEC_message_message_925037 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_925037
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_925037 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_925037
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
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_LIFELINE_ALTERNATIVEFLOW_USECASE_USECASETOINTERACTION_FLOW_INTERACTION_ACTOR_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(Lifeline) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(UseCase) arguments.get(5),
					(UseCaseToInteraction) arguments.get(6),
					(Flow) arguments.get(7), (Interaction) arguments.get(8),
					(Actor) arguments.get(9),
					(ActorToLifeline) arguments.get(10));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20),
					(EObject) arguments.get(21));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_LIFELINE_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(InteractionConstraint) arguments.get(4),
					(LiteralString) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7),
					(MessageOccurrenceSpecification) arguments.get(8),
					(MessageOccurrenceSpecification) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_LIFELINE_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(InteractionConstraint) arguments.get(4),
					(LiteralString) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7),
					(MessageOccurrenceSpecification) arguments.get(8),
					(MessageOccurrenceSpecification) arguments.get(9));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_LIFELINE_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(InteractionConstraint) arguments.get(4),
					(LiteralString) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7),
					(MessageOccurrenceSpecification) arguments.get(8),
					(MessageOccurrenceSpecification) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_LIFELINE_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(InteractionConstraint) arguments.get(4),
					(LiteralString) arguments.get(5),
					(UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(Flow) arguments.get(8), (Message) arguments.get(9),
					(Interaction) arguments.get(10),
					(MessageOccurrenceSpecification) arguments.get(11),
					(MessageOccurrenceSpecification) arguments.get(12),
					(Actor) arguments.get(13),
					(ActorToLifeline) arguments.get(14));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20),
					(EObject) arguments.get(21));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_38((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_39((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_40((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_41((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_42((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_43((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_13((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_45((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_46((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_47((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_48((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_49((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_51((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_52((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4),
					(Interaction) arguments.get(5),
					(Lifeline) arguments.get(6), (Actor) arguments.get(7),
					(ActorToLifeline) arguments.get(8));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (Message) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(Lifeline) arguments.get(8), (Actor) arguments.get(9),
					(ActorToLifeline) arguments.get(10));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments
					.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltStepToComboRuleImpl
