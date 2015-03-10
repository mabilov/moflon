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
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

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
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
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
					altFlow, useCase, flow, actor, packageDeclaration));

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
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

				// create object __alt_ref_altFlow
				__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_stepAlternative_alt
				__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
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
						__alt_ref_altFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_stepAlternative_alt, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						altFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				__step_actor_actor.setSrc(step);

				// create link
				__step_stepAlternative_alt.setSrc(step);

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__alt_ref_altFlow.setSrc(alt);

				// create link
				__step_stepAlternative_alt.setTrg(alt);

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
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

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
						packageDeclaration, "contextNodes");

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
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

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
			this.registerObjectsToMatch_FWD(match, step, alt, altFlow, useCase,
					flow, actor, packageDeclaration);
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
		PackageDeclaration packageDeclaration = null;
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
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge combo__operand__operand = null;
		EMoflonEdge messageReceive__message__message = null;
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge stepToMessage__source__step = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge guard__specification__spec = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge interaction__message__message = null;
		EMoflonEdge messageSend__message__message = null;
		EMoflonEdge message__sendEvent__messageSend = null;
		EMoflonEdge messageReceive__covered__line = null;
		EMoflonEdge line__coveredBy__messageReceive = null;
		EMoflonEdge message__receiveEvent__messageReceive = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge message__interaction__interaction = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge combo__covered__line = null;

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
			operand.getCovered().add(line);

			// create link
			messageReceive.getCovered().add(line);

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
			stepToMessage.setTarget(message);

			// create link
			messageReceive.setMessage(message);

			// create link
			messageSend.setMessage(message);

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
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

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
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
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

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

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

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

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

			// check isomorphic binding between objects packageDeclaration and alt 
			JavaSDM.ensure(!packageDeclaration.equals(alt));

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

			// check isomorphic binding between objects packageDeclaration and altFlow 
			JavaSDM.ensure(!packageDeclaration.equals(altFlow));

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

			// check isomorphic binding between objects packageDeclaration and altFlowToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(altFlowToOperand));

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

			// check isomorphic binding between objects packageDeclaration and alternative1ToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects packageDeclaration and combo 
			JavaSDM.ensure(!packageDeclaration.equals(combo));

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

			// check isomorphic binding between objects packageDeclaration and flow 
			JavaSDM.ensure(!packageDeclaration.equals(flow));

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

			// check isomorphic binding between objects packageDeclaration and guard 
			JavaSDM.ensure(!packageDeclaration.equals(guard));

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

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

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

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

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

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

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

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

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

			// check isomorphic binding between objects packageDeclaration and messageSend 
			JavaSDM.ensure(!packageDeclaration.equals(messageSend));

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

			// check isomorphic binding between objects packageDeclaration and operand 
			JavaSDM.ensure(!packageDeclaration.equals(operand));

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

			// check isomorphic binding between objects spec and packageDeclaration 
			JavaSDM.ensure(!spec.equals(packageDeclaration));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToCombo and packageDeclaration 
			JavaSDM.ensure(!stepToCombo.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

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

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__message__message
			messageReceive__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__message__message
			interaction__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__message__message
			messageSend__message__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__sendEvent__messageSend
			message__sendEvent__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__covered__line
			messageReceive__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageReceive
			line__coveredBy__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__receiveEvent__messageReceive
			message__receiveEvent__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object message__interaction__interaction
			message__interaction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
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
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__message__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__sendEvent__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__receiveEvent__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message__interaction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			stepToMessage__source__step.setTrg(step);

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
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			combo__covered__line.setTrg(line);

			// create link
			messageReceive__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageReceive.setSrc(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			line__coveredBy__combo.setSrc(line);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

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
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			messageReceive__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setSrc(message);

			// create link
			message__sendEvent__messageSend.setSrc(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			message__receiveEvent__messageReceive.setSrc(message);

			// create link
			interaction__message__message.setTrg(message);

			// create link
			messageSend__message__message.setTrg(message);

			// create link
			message__interaction__interaction.setTrg(interaction);

			// create link
			interaction__message__message.setSrc(interaction);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

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
				messageReceive, actor, actorToLine, packageDeclaration);
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
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __actorToLine_source_actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
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
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
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

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __flow_steps_step
								__flow_steps_step = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __step_stepAlternative_alt
								__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __step_actor_actor
								__step_actor_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __alt_ref_altFlow
								__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
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

								// create object __useCaseToInteraction_source_useCase
								__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCase_flows_flow
								__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCaseToInteraction_target_interaction
								__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __actorToLine_source_actor
								__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
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
								// assign attribute __packageDeclaration_actors_actor
								__packageDeclaration_actors_actor
										.setName("actors");
								// assign attribute __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase
										.setName("useCases");

								// create link
								isApplicableMatch.getAllContextElements().add(
										step);

								// create link
								__flow_steps_step.setTrg(step);

								// create link
								__step_stepAlternative_alt.setSrc(step);

								// create link
								__step_actor_actor.setSrc(step);

								// create link
								__alt_ref_altFlow.setSrc(alt);

								// create link
								__step_stepAlternative_alt.setTrg(alt);

								// create link
								isApplicableMatch.getAllContextElements().add(
										alt);

								// create link
								isApplicableMatch.getAllContextElements().add(
										line);

								// create link
								__line_interaction_interaction.setSrc(line);

								// create link
								__interaction_lifeline_line.setTrg(line);

								// create link
								__actorToLine_target_line.setTrg(line);

								// create link
								__alt_ref_altFlow.setTrg(altFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										altFlow);

								// create link
								__useCaseToInteraction_source_useCase
										.setTrg(useCase);

								// create link
								__useCase_flows_flow.setSrc(useCase);

								// create link
								__packageDeclaration_useCases_useCase
										.setTrg(useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCaseToInteraction);

								// create link
								__useCaseToInteraction_target_interaction
										.setSrc(useCaseToInteraction);

								// create link
								__useCaseToInteraction_source_useCase
										.setSrc(useCaseToInteraction);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__useCase_flows_flow.setTrg(flow);

								// create link
								__flow_steps_step.setSrc(flow);

								// create link
								__interaction_lifeline_line.setSrc(interaction);

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
								__actorToLine_source_actor.setTrg(actor);

								// create link
								__packageDeclaration_actors_actor.setTrg(actor);

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
												__actorToLine_source_actor,
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
												__useCaseToInteraction_target_interaction,
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
												__useCaseToInteraction_source_useCase,
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
												__step_actor_actor,
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
												__interaction_lifeline_line,
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
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			UseCase useCase, Flow flow, Actor actor,
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
			NormalStep step, AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			Interaction interaction, Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject step,
			EObject alt, EObject combo, EObject line, EObject stepToCombo,
			EObject operand, EObject alternative1ToOperand, EObject guard,
			EObject spec, EObject altFlow, EObject altFlowToOperand,
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject messageSend, EObject messageReceive, EObject actor,
			EObject actorToLine, EObject packageDeclaration) {
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
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;

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

				// create object __message_interaction_interaction
				__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_receiveEvent_messageReceive
				__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_covered_line
				__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_message_message
				__interaction_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __message_sendEvent_messageSend
				__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_message_message
				__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_message_message
				__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageReceive
				__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
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
						__message_interaction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_receiveEvent_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__message_sendEvent_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						message, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

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
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_message_message, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageReceive, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageReceive.setSrc(line);

				// create link
				__messageReceive_covered_line.setTrg(line);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__operand_guard_guard.setSrc(operand);

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__operand_guard_guard.setTrg(guard);

				// create link
				__guard_specification_spec.setSrc(guard);

				// create link
				__guard_specification_spec.setTrg(spec);

				// create link
				__messageReceive_message_message.setTrg(message);

				// create link
				__message_receiveEvent_messageReceive.setSrc(message);

				// create link
				__message_sendEvent_messageSend.setSrc(message);

				// create link
				__interaction_message_message.setTrg(message);

				// create link
				__message_interaction_interaction.setSrc(message);

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
				__line_coveredBy_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_covered_line.setSrc(messageReceive);

				// create link
				__messageReceive_message_message.setSrc(messageReceive);

				// create link
				__message_receiveEvent_messageReceive.setTrg(messageReceive);

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
						__line_interaction_interaction, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__interaction_lifeline_line.setSrc(interaction);

				// create link
				__line_interaction_interaction.setTrg(interaction);

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
		PackageDeclaration packageDeclaration = null;
		LiteralString spec = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		AlternativeFlowAlternative alt = null;
		NormalStepToMessage stepToMessage = null;
		NormalStepToCombinedFragment stepToCombo = null;
		AlternativeFlow altFlow = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		FlowToInteractionFragment altFlowToOperand = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge step__stepAlternative__alt = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge stepToMessage__target__message = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __messageSend_message_message = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge stepToCombo__source__step = null;
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
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
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

			// create object stepToMessage
			stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToMessage();

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

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
			flow.getSteps().add(step);

			// create link
			stepToMessage.setSource(step);

			// create link
			stepToCombo.setSource(step);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt, altFlow,
					"ref");

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			stepToCombo.setTarget(combo);

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			alternative1ToOperand.setTarget(operand);

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
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					message, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "translatedElements");

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
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
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

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

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

			// check isomorphic binding between objects packageDeclaration and actorToLine 
			JavaSDM.ensure(!packageDeclaration.equals(actorToLine));

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

			// check isomorphic binding between objects packageDeclaration and alt 
			JavaSDM.ensure(!packageDeclaration.equals(alt));

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

			// check isomorphic binding between objects packageDeclaration and altFlow 
			JavaSDM.ensure(!packageDeclaration.equals(altFlow));

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

			// check isomorphic binding between objects packageDeclaration and altFlowToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(altFlowToOperand));

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

			// check isomorphic binding between objects packageDeclaration and alternative1ToOperand 
			JavaSDM.ensure(!packageDeclaration.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects packageDeclaration and combo 
			JavaSDM.ensure(!packageDeclaration.equals(combo));

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

			// check isomorphic binding between objects packageDeclaration and flow 
			JavaSDM.ensure(!packageDeclaration.equals(flow));

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

			// check isomorphic binding between objects packageDeclaration and guard 
			JavaSDM.ensure(!packageDeclaration.equals(guard));

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

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

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

			// check isomorphic binding between objects packageDeclaration and line 
			JavaSDM.ensure(!packageDeclaration.equals(line));

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

			// check isomorphic binding between objects packageDeclaration and message 
			JavaSDM.ensure(!packageDeclaration.equals(message));

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

			// check isomorphic binding between objects packageDeclaration and messageReceive 
			JavaSDM.ensure(!packageDeclaration.equals(messageReceive));

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

			// check isomorphic binding between objects packageDeclaration and messageSend 
			JavaSDM.ensure(!packageDeclaration.equals(messageSend));

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

			// check isomorphic binding between objects packageDeclaration and operand 
			JavaSDM.ensure(!packageDeclaration.equals(operand));

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

			// check isomorphic binding between objects spec and packageDeclaration 
			JavaSDM.ensure(!spec.equals(packageDeclaration));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToCombo and packageDeclaration 
			JavaSDM.ensure(!stepToCombo.equals(packageDeclaration));

			// check isomorphic binding between objects stepToMessage and packageDeclaration 
			JavaSDM.ensure(!stepToMessage.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

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

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_message_message
			__messageReceive_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__target__message
			stepToMessage__target__message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_interaction_interaction
			__message_interaction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_covered_line
			__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageReceive
			__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __interaction_message_message
			__interaction_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_message_message
			__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __message_receiveEvent_messageReceive
			__message_receiveEvent_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __message_sendEvent_messageSend
			__message_sendEvent_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToMessage__source__step
			stepToMessage__source__step = TGGRuntimeFactory.eINSTANCE
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
					step__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__target__message, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_interaction_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_message_message, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_receiveEvent_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__message_sendEvent_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToMessage__source__step, "createdEdges");

			// create link
			stepToMessage__source__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			__line_coveredBy_messageReceive.setSrc(line);

			// create link
			__messageReceive_covered_line.setTrg(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

			// create link
			__guard_specification_spec.setSrc(guard);

			// create link
			__operand_guard_guard.setTrg(guard);

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
			__messageReceive_message_message.setTrg(message);

			// create link
			stepToMessage__target__message.setTrg(message);

			// create link
			__interaction_message_message.setTrg(message);

			// create link
			__message_interaction_interaction.setSrc(message);

			// create link
			__messageSend_message_message.setTrg(message);

			// create link
			__message_receiveEvent_messageReceive.setSrc(message);

			// create link
			__message_sendEvent_messageSend.setSrc(message);

			// create link
			__message_interaction_interaction.setTrg(interaction);

			// create link
			__interaction_message_message.setSrc(interaction);

			// create link
			stepToMessage__source__step.setSrc(stepToMessage);

			// create link
			stepToMessage__target__message.setSrc(stepToMessage);

			// create link
			__messageSend_message_message.setSrc(messageSend);

			// create link
			__message_sendEvent_messageSend.setTrg(messageSend);

			// create link
			__line_coveredBy_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_message_message.setSrc(messageReceive);

			// create link
			__message_receiveEvent_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_covered_line.setSrc(messageReceive);

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
				messageReceive, actor, actorToLine, packageDeclaration);
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
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __messageReceive_covered_line = null;
		EMoflonEdge __line_coveredBy_messageReceive = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __messageReceive_message_message = null;
		EMoflonEdge __message_interaction_interaction = null;
		EMoflonEdge __message_sendEvent_messageSend = null;
		EMoflonEdge __interaction_message_message = null;
		EMoflonEdge __message_receiveEvent_messageReceive = null;
		EMoflonEdge __messageSend_message_message = null;
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
										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __combo_covered_line
										__combo_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_combo
										__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_operand_operand
										__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_covered_line
										__messageReceive_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageReceive
										__line_coveredBy_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_operand
										__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __actorToLine_target_line
										__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_covered_line
										__operand_covered_line = TGGRuntimeFactory.eINSTANCE
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

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
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

										// create object __messageSend_message_message
										__messageSend_message_message = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
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
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__combo_covered_line.setSrc(combo);

										// create link
										__line_coveredBy_combo.setTrg(combo);

										// create link
										__combo_operand_operand.setSrc(combo);

										// create link
										__messageReceive_covered_line
												.setTrg(line);

										// create link
										__line_coveredBy_messageReceive
												.setSrc(line);

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
										__line_coveredBy_combo.setSrc(line);

										// create link
										__actorToLine_target_line.setTrg(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__operand_covered_line.setTrg(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														operand);

										// create link
										__combo_operand_operand.setTrg(operand);

										// create link
										__line_coveredBy_operand
												.setTrg(operand);

										// create link
										__operand_guard_guard.setSrc(operand);

										// create link
										__operand_covered_line.setSrc(operand);

										// create link
										__guard_specification_spec
												.setSrc(guard);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														guard);

										// create link
										__operand_guard_guard.setTrg(guard);

										// create link
										__guard_specification_spec.setTrg(spec);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														spec);

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
										__messageReceive_message_message
												.setTrg(message);

										// create link
										__message_interaction_interaction
												.setSrc(message);

										// create link
										__message_sendEvent_messageSend
												.setSrc(message);

										// create link
										__interaction_message_message
												.setTrg(message);

										// create link
										__message_receiveEvent_messageReceive
												.setSrc(message);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														message);

										// create link
										__messageSend_message_message
												.setTrg(message);

										// create link
										__message_interaction_interaction
												.setTrg(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__interaction_message_message
												.setSrc(interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__line_interaction_interaction
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
										__message_receiveEvent_messageReceive
												.setTrg(messageReceive);

										// create link
										__messageReceive_covered_line
												.setSrc(messageReceive);

										// create link
										__messageReceive_message_message
												.setSrc(messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__line_coveredBy_messageReceive
												.setTrg(messageReceive);

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										__actorToLine_source_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__actorToLine_target_line
												.setSrc(actorToLine);

										// create link
										__actorToLine_source_actor
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
														__line_coveredBy_operand,
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
														__actorToLine_source_actor,
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
														__line_coveredBy_combo,
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
														__combo_covered_line,
														"allContextElements");

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
														__packageDeclaration_actors_actor,
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
														__message_receiveEvent_messageReceive,
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
														__operand_covered_line,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__interaction_message_message,
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
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject step,
			EObject alt, EObject combo, EObject line, EObject stepToCombo,
			EObject operand, EObject alternative1ToOperand, EObject guard,
			EObject spec, EObject altFlow, EObject altFlowToOperand,
			EObject useCase, EObject useCaseToInteraction, EObject flow,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject messageSend, EObject messageReceive, EObject actor,
			EObject actorToLine, EObject packageDeclaration) {
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
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
		UseCase __DEC_altFlow_flows_147984 = null;
		NormalStep __DEC_alt_stepAlternative_927366 = null;
		Flow __DEC_step_steps_338414 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_470922 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_470922 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
		Flow flow = null;
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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_147984 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_147984 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_147984 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_147984.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_147984 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_147984.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_927366 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_927366 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_927366 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_927366
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_927366 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_927366
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
					__DEC_step_steps_338414 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_338414 is really bound
					JavaSDM.ensure(__DEC_step_steps_338414 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_338414.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_338414 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_338414.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_338414 and flow 
					JavaSDM.ensure(!__DEC_step_steps_338414.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_470922
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_470922 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_470922
									.hasNext()) {
						try {
							__DEC_altFlow_ref_470922 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_470922
									.next();

							// check object __DEC_altFlow_ref_470922 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_470922 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_470922 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_470922
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
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
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

				// check link actors from actor to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

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

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, useCase, flow, actor, packageDeclaration);
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
		UseCase __DEC_altFlow_flows_285632 = null;
		NormalStep __DEC_alt_stepAlternative_618809 = null;
		Flow __DEC_step_steps_606981 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_450064 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_450064 = null;
		Match match = null;
		UseCase useCase = null;
		Flow flow = null;
		PackageDeclaration packageDeclaration = null;
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
			packageDeclaration = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getActors().contains(actor));

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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_285632 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_285632 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_285632 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_285632.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_285632 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_285632.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_618809 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_618809 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_618809 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_618809
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_618809 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_618809
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
					__DEC_step_steps_606981 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_606981 is really bound
					JavaSDM.ensure(__DEC_step_steps_606981 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_606981.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_606981 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_606981.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_606981 and flow 
					JavaSDM.ensure(!__DEC_step_steps_606981.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_450064
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_450064 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_450064
									.hasNext()) {
						try {
							__DEC_altFlow_ref_450064 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_450064
									.next();

							// check object __DEC_altFlow_ref_450064 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_450064 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_450064 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_450064
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
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
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

				// check link actors from actor to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

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

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, useCase, flow, actor, packageDeclaration);
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
		Interaction __DEC_combo_enclosingInteraction_333790 = null;
		InteractionOperand __DEC_combo_fragment_407617 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_205034 = null;
		InteractionOperand __DEC_messageReceive_fragment_434932 = null;
		Interaction __DEC_messageSend_enclosingInteraction_361155 = null;
		InteractionOperand __DEC_messageSend_fragment_796894 = null;
		Interaction __DEC_operand_enclosingInteraction_167362 = null;
		InteractionOperand __DEC_operand_fragment_223236 = null;
		InteractionOperand __DEC_guard_guard_484448 = null;
		CombinedFragment __DEC_operand_operand_643929 = null;
		Constraint __DEC_spec_specification_129327 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_44951 = null;
		Message __DEC_messageReceive_receiveEvent_44951 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_348978 = null;
		Message __DEC_messageSend_receiveEvent_348978 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_616574 = null;
		Message __DEC_messageReceive_sendEvent_616574 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_381792 = null;
		Message __DEC_messageSend_sendEvent_381792 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_794707 = null;
		MessageEnd __DEC_message_message_794707 = null;
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
									__DEC_combo_enclosingInteraction_333790 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_333790 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_333790 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_333790 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_333790
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
									__DEC_combo_fragment_407617 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_407617 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_407617 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_407617 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_407617
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
									__DEC_messageReceive_enclosingInteraction_205034 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_205034 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_205034 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_205034 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_205034
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
									__DEC_messageReceive_fragment_434932 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_434932 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_434932 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_434932 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_434932
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
									__DEC_messageSend_enclosingInteraction_361155 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_361155 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_361155 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_361155 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_361155
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
									__DEC_messageSend_fragment_796894 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_796894 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_796894 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_796894 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_796894
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
									__DEC_operand_enclosingInteraction_167362 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_167362 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_167362 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_167362 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_167362
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
									__DEC_operand_fragment_223236 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_223236 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_223236 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_223236 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_223236
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
									__DEC_guard_guard_484448 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_484448 is really bound
									JavaSDM.ensure(__DEC_guard_guard_484448 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_484448
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_484448 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_484448
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
									__DEC_operand_operand_643929 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_643929 is really bound
									JavaSDM.ensure(__DEC_operand_operand_643929 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_643929
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_643929 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_643929
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
									__DEC_spec_specification_129327 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_129327 is really bound
									JavaSDM.ensure(__DEC_spec_specification_129327 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_129327
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_129327 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_129327
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_44951
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_44951 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_44951
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_44951 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_44951
													.next();

											// check object __DEC_messageReceive_receiveEvent_44951 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_44951 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_44951 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_44951
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_348978
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_348978 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_348978
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_348978 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_348978
													.next();

											// check object __DEC_messageSend_receiveEvent_348978 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_348978 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_348978 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_348978
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_616574
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_616574 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_616574
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_616574 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_616574
													.next();

											// check object __DEC_messageReceive_sendEvent_616574 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_616574 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_616574 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_616574
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_381792
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_381792 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_381792
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_381792 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_381792
													.next();

											// check object __DEC_messageSend_sendEvent_381792 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_381792 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_381792 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_381792
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_794707
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_794707 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_794707
													.hasNext()) {
										try {
											__DEC_message_message_794707 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_794707
													.next();

											// check object __DEC_message_message_794707 is really bound
											JavaSDM.ensure(__DEC_message_message_794707 != null);
											// check isomorphic binding between objects __DEC_message_message_794707 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_794707
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_794707 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_794707
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
		Interaction __DEC_combo_enclosingInteraction_479976 = null;
		InteractionOperand __DEC_combo_fragment_929785 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_695410 = null;
		InteractionOperand __DEC_messageReceive_fragment_812100 = null;
		Interaction __DEC_messageSend_enclosingInteraction_654133 = null;
		InteractionOperand __DEC_messageSend_fragment_10470 = null;
		Interaction __DEC_operand_enclosingInteraction_477709 = null;
		InteractionOperand __DEC_operand_fragment_720547 = null;
		InteractionOperand __DEC_guard_guard_675339 = null;
		CombinedFragment __DEC_operand_operand_309835 = null;
		Constraint __DEC_spec_specification_629149 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_793977 = null;
		Message __DEC_messageReceive_receiveEvent_793977 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_19244 = null;
		Message __DEC_messageSend_receiveEvent_19244 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_320017 = null;
		Message __DEC_messageReceive_sendEvent_320017 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_462528 = null;
		Message __DEC_messageSend_sendEvent_462528 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_126278 = null;
		MessageEnd __DEC_message_message_126278 = null;
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
									__DEC_combo_enclosingInteraction_479976 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_479976 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_479976 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_479976 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_479976
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
									__DEC_combo_fragment_929785 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_929785 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_929785 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_929785 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_929785
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
									__DEC_messageReceive_enclosingInteraction_695410 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_695410 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_695410 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_695410 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_695410
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
									__DEC_messageReceive_fragment_812100 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_812100 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_812100 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_812100 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_812100
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
									__DEC_messageSend_enclosingInteraction_654133 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_654133 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_654133 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_654133 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_654133
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
									__DEC_messageSend_fragment_10470 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_10470 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_10470 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_10470 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_10470
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
									__DEC_operand_enclosingInteraction_477709 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_477709 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_477709 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_477709 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_477709
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
									__DEC_operand_fragment_720547 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_720547 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_720547 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_720547 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_720547
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
									__DEC_guard_guard_675339 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_675339 is really bound
									JavaSDM.ensure(__DEC_guard_guard_675339 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_675339
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_675339 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_675339
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
									__DEC_operand_operand_309835 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_309835 is really bound
									JavaSDM.ensure(__DEC_operand_operand_309835 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_309835
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_309835 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_309835
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
									__DEC_spec_specification_629149 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_629149 is really bound
									JavaSDM.ensure(__DEC_spec_specification_629149 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_629149
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_629149 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_629149
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_793977
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_793977 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_793977
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_793977 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_793977
													.next();

											// check object __DEC_messageReceive_receiveEvent_793977 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_793977 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_793977 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_793977
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_19244
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_19244 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_19244
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_19244 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_19244
													.next();

											// check object __DEC_messageSend_receiveEvent_19244 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_19244 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_19244 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_19244
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_320017
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_320017 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_320017
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_320017 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_320017
													.next();

											// check object __DEC_messageReceive_sendEvent_320017 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_320017 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_320017 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_320017
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_462528
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_462528 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_462528
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_462528 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_462528
													.next();

											// check object __DEC_messageSend_sendEvent_462528 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_462528 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_462528 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_462528
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_126278
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_126278 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_126278
													.hasNext()) {
										try {
											__DEC_message_message_126278 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_126278
													.next();

											// check object __DEC_message_message_126278 is really bound
											JavaSDM.ensure(__DEC_message_message_126278 != null);
											// check isomorphic binding between objects __DEC_message_message_126278 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_126278
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_126278 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_126278
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
		Interaction __DEC_combo_enclosingInteraction_250469 = null;
		InteractionOperand __DEC_combo_fragment_548352 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_309211 = null;
		InteractionOperand __DEC_messageReceive_fragment_186340 = null;
		Interaction __DEC_messageSend_enclosingInteraction_396470 = null;
		InteractionOperand __DEC_messageSend_fragment_344715 = null;
		Interaction __DEC_operand_enclosingInteraction_318186 = null;
		InteractionOperand __DEC_operand_fragment_372242 = null;
		InteractionOperand __DEC_guard_guard_399037 = null;
		CombinedFragment __DEC_operand_operand_898836 = null;
		Constraint __DEC_spec_specification_649057 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_734965 = null;
		Message __DEC_messageReceive_receiveEvent_734965 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_229371 = null;
		Message __DEC_messageSend_receiveEvent_229371 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_55497 = null;
		Message __DEC_messageReceive_sendEvent_55497 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_738403 = null;
		Message __DEC_messageSend_sendEvent_738403 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_531223 = null;
		MessageEnd __DEC_message_message_531223 = null;
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
											__DEC_combo_enclosingInteraction_250469 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_250469 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_250469 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_250469 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_250469
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
											__DEC_combo_fragment_548352 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_548352 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_548352 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_548352 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_548352
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
											__DEC_messageReceive_enclosingInteraction_309211 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_309211 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_309211 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_309211 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_309211
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
											__DEC_messageReceive_fragment_186340 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_186340 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_186340 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_186340 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_186340
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
											__DEC_messageSend_enclosingInteraction_396470 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_396470 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_396470 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_396470 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_396470
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
											__DEC_messageSend_fragment_344715 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_344715 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_344715 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_344715 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_344715
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
											__DEC_operand_enclosingInteraction_318186 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_318186 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_318186 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_318186 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_318186
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
											__DEC_operand_fragment_372242 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_372242 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_372242 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_372242 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_372242
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
											__DEC_guard_guard_399037 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_399037 is really bound
											JavaSDM.ensure(__DEC_guard_guard_399037 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_399037
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_399037 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_399037
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
											__DEC_operand_operand_898836 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_898836 is really bound
											JavaSDM.ensure(__DEC_operand_operand_898836 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_898836
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_898836 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_898836
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
											__DEC_spec_specification_649057 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_649057 is really bound
											JavaSDM.ensure(__DEC_spec_specification_649057 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_649057
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_649057 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_649057
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_734965
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_734965 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_734965
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_734965 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_734965
															.next();

													// check object __DEC_messageReceive_receiveEvent_734965 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_734965 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_734965 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_734965
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_229371
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_229371 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_229371
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_229371 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_229371
															.next();

													// check object __DEC_messageSend_receiveEvent_229371 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_229371 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_229371 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_229371
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_55497
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_55497 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_55497
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_55497 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_55497
															.next();

													// check object __DEC_messageReceive_sendEvent_55497 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_55497 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_55497 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_55497
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_738403
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_738403 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_738403
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_738403 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_738403
															.next();

													// check object __DEC_messageSend_sendEvent_738403 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_738403 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_738403 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_738403
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_531223
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_531223 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_531223
															.hasNext()) {
												try {
													__DEC_message_message_531223 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_531223
															.next();

													// check object __DEC_message_message_531223 is really bound
													JavaSDM.ensure(__DEC_message_message_531223 != null);
													// check isomorphic binding between objects __DEC_message_message_531223 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_531223
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_531223 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_531223
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
		Interaction __DEC_combo_enclosingInteraction_615668 = null;
		InteractionOperand __DEC_combo_fragment_869545 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_579435 = null;
		InteractionOperand __DEC_messageReceive_fragment_977110 = null;
		Interaction __DEC_messageSend_enclosingInteraction_394364 = null;
		InteractionOperand __DEC_messageSend_fragment_186250 = null;
		Interaction __DEC_operand_enclosingInteraction_539308 = null;
		InteractionOperand __DEC_operand_fragment_460839 = null;
		InteractionOperand __DEC_guard_guard_781147 = null;
		CombinedFragment __DEC_operand_operand_498780 = null;
		Constraint __DEC_spec_specification_995162 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_862052 = null;
		Message __DEC_messageReceive_receiveEvent_862052 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_517097 = null;
		Message __DEC_messageSend_receiveEvent_517097 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_249005 = null;
		Message __DEC_messageReceive_sendEvent_249005 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_593691 = null;
		Message __DEC_messageSend_sendEvent_593691 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_196782 = null;
		MessageEnd __DEC_message_message_196782 = null;
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
							__DEC_combo_enclosingInteraction_615668 = combo
									.getEnclosingInteraction();

							// check object __DEC_combo_enclosingInteraction_615668 is really bound
							JavaSDM.ensure(__DEC_combo_enclosingInteraction_615668 != null);

							// check isomorphic binding between objects __DEC_combo_enclosingInteraction_615668 and interaction 
							JavaSDM.ensure(!__DEC_combo_enclosingInteraction_615668
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
							__DEC_combo_fragment_869545 = combo
									.getEnclosingOperand();

							// check object __DEC_combo_fragment_869545 is really bound
							JavaSDM.ensure(__DEC_combo_fragment_869545 != null);

							// check isomorphic binding between objects __DEC_combo_fragment_869545 and operand 
							JavaSDM.ensure(!__DEC_combo_fragment_869545
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
							__DEC_messageReceive_enclosingInteraction_579435 = messageReceive
									.getEnclosingInteraction();

							// check object __DEC_messageReceive_enclosingInteraction_579435 is really bound
							JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_579435 != null);

							// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_579435 and interaction 
							JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_579435
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
							__DEC_messageReceive_fragment_977110 = messageReceive
									.getEnclosingOperand();

							// check object __DEC_messageReceive_fragment_977110 is really bound
							JavaSDM.ensure(__DEC_messageReceive_fragment_977110 != null);

							// check isomorphic binding between objects __DEC_messageReceive_fragment_977110 and operand 
							JavaSDM.ensure(!__DEC_messageReceive_fragment_977110
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
							__DEC_messageSend_enclosingInteraction_394364 = messageSend
									.getEnclosingInteraction();

							// check object __DEC_messageSend_enclosingInteraction_394364 is really bound
							JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_394364 != null);

							// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_394364 and interaction 
							JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_394364
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
							__DEC_messageSend_fragment_186250 = messageSend
									.getEnclosingOperand();

							// check object __DEC_messageSend_fragment_186250 is really bound
							JavaSDM.ensure(__DEC_messageSend_fragment_186250 != null);

							// check isomorphic binding between objects __DEC_messageSend_fragment_186250 and operand 
							JavaSDM.ensure(!__DEC_messageSend_fragment_186250
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
							__DEC_operand_enclosingInteraction_539308 = operand
									.getEnclosingInteraction();

							// check object __DEC_operand_enclosingInteraction_539308 is really bound
							JavaSDM.ensure(__DEC_operand_enclosingInteraction_539308 != null);

							// check isomorphic binding between objects __DEC_operand_enclosingInteraction_539308 and interaction 
							JavaSDM.ensure(!__DEC_operand_enclosingInteraction_539308
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
							__DEC_operand_fragment_460839 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_460839 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_460839 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_460839 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_460839
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
							__DEC_guard_guard_781147 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_781147 is really bound
							JavaSDM.ensure(__DEC_guard_guard_781147 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard
									.equals(__DEC_guard_guard_781147.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_781147 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_781147
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
							__DEC_operand_operand_498780 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_498780 is really bound
							JavaSDM.ensure(__DEC_operand_operand_498780 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_498780
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_498780 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_498780
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
							__DEC_spec_specification_995162 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_995162 is really bound
							JavaSDM.ensure(__DEC_spec_specification_995162 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_995162
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_995162 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_995162
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

							// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_862052
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_862052 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_862052
											.hasNext()) {
								try {
									__DEC_messageReceive_receiveEvent_862052 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_862052
											.next();

									// check object __DEC_messageReceive_receiveEvent_862052 is really bound
									JavaSDM.ensure(__DEC_messageReceive_receiveEvent_862052 != null);
									// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_862052 and message 
									JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_862052
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_517097
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_517097 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class,
													"receiveEvent")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_517097
											.hasNext()) {
								try {
									__DEC_messageSend_receiveEvent_517097 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_517097
											.next();

									// check object __DEC_messageSend_receiveEvent_517097 is really bound
									JavaSDM.ensure(__DEC_messageSend_receiveEvent_517097 != null);
									// check isomorphic binding between objects __DEC_messageSend_receiveEvent_517097 and message 
									JavaSDM.ensure(!__DEC_messageSend_receiveEvent_517097
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_249005
							fujaba__Success = false;

							fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_249005 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													messageReceive,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_249005
											.hasNext()) {
								try {
									__DEC_messageReceive_sendEvent_249005 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_249005
											.next();

									// check object __DEC_messageReceive_sendEvent_249005 is really bound
									JavaSDM.ensure(__DEC_messageReceive_sendEvent_249005 != null);
									// check isomorphic binding between objects __DEC_messageReceive_sendEvent_249005 and message 
									JavaSDM.ensure(!__DEC_messageReceive_sendEvent_249005
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_593691
							fujaba__Success = false;

							fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_593691 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(messageSend,
													Message.class, "sendEvent"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_593691
											.hasNext()) {
								try {
									__DEC_messageSend_sendEvent_593691 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_593691
											.next();

									// check object __DEC_messageSend_sendEvent_593691 is really bound
									JavaSDM.ensure(__DEC_messageSend_sendEvent_593691 != null);
									// check isomorphic binding between objects __DEC_messageSend_sendEvent_593691 and message 
									JavaSDM.ensure(!__DEC_messageSend_sendEvent_593691
											.equals(message));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link message from message to __DEC_message_message_196782
							fujaba__Success = false;

							fujaba__IterMessageTo__DEC_message_message_196782 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(message,
													MessageEnd.class, "message"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterMessageTo__DEC_message_message_196782
											.hasNext()) {
								try {
									__DEC_message_message_196782 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_196782
											.next();

									// check object __DEC_message_message_196782 is really bound
									JavaSDM.ensure(__DEC_message_message_196782 != null);
									// check isomorphic binding between objects __DEC_message_message_196782 and messageReceive 
									JavaSDM.ensure(!__DEC_message_message_196782
											.equals(messageReceive));

									// check isomorphic binding between objects __DEC_message_message_196782 and messageSend 
									JavaSDM.ensure(!__DEC_message_message_196782
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
		Interaction __DEC_combo_enclosingInteraction_393370 = null;
		InteractionOperand __DEC_combo_fragment_245242 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_414723 = null;
		InteractionOperand __DEC_messageReceive_fragment_938678 = null;
		Interaction __DEC_messageSend_enclosingInteraction_133335 = null;
		InteractionOperand __DEC_messageSend_fragment_652784 = null;
		Interaction __DEC_operand_enclosingInteraction_443822 = null;
		InteractionOperand __DEC_operand_fragment_771682 = null;
		InteractionOperand __DEC_guard_guard_642052 = null;
		CombinedFragment __DEC_operand_operand_147525 = null;
		Constraint __DEC_spec_specification_468369 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_887902 = null;
		Message __DEC_messageReceive_receiveEvent_887902 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_781132 = null;
		Message __DEC_messageSend_receiveEvent_781132 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_201103 = null;
		Message __DEC_messageReceive_sendEvent_201103 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_280014 = null;
		Message __DEC_messageSend_sendEvent_280014 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_698790 = null;
		MessageEnd __DEC_message_message_698790 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		MessageOccurrenceSpecification messageSend = null;
		Message message = null;
		Iterator fujaba__IterLineToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
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

			// check object _edge_covered is really bound
			JavaSDM.ensure(_edge_covered != null);
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
									__DEC_combo_enclosingInteraction_393370 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_393370 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_393370 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_393370 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_393370
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
									__DEC_combo_fragment_245242 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_245242 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_245242 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_245242 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_245242
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
									__DEC_messageReceive_enclosingInteraction_414723 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_414723 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_414723 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_414723 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_414723
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
									__DEC_messageReceive_fragment_938678 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_938678 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_938678 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_938678 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_938678
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
									__DEC_messageSend_enclosingInteraction_133335 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_133335 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_133335 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_133335 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_133335
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
									__DEC_messageSend_fragment_652784 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_652784 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_652784 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_652784 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_652784
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
									__DEC_operand_enclosingInteraction_443822 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_443822 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_443822 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_443822 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_443822
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
									__DEC_operand_fragment_771682 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_771682 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_771682 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_771682 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_771682
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
									__DEC_guard_guard_642052 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_642052 is really bound
									JavaSDM.ensure(__DEC_guard_guard_642052 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_642052
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_642052 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_642052
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
									__DEC_operand_operand_147525 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_147525 is really bound
									JavaSDM.ensure(__DEC_operand_operand_147525 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_147525
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_147525 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_147525
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
									__DEC_spec_specification_468369 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_468369 is really bound
									JavaSDM.ensure(__DEC_spec_specification_468369 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_468369
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_468369 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_468369
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_887902
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_887902 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_887902
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_887902 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_887902
													.next();

											// check object __DEC_messageReceive_receiveEvent_887902 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_887902 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_887902 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_887902
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_781132
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_781132 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_781132
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_781132 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_781132
													.next();

											// check object __DEC_messageSend_receiveEvent_781132 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_781132 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_781132 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_781132
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_201103
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_201103 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_201103
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_201103 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_201103
													.next();

											// check object __DEC_messageReceive_sendEvent_201103 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_201103 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_201103 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_201103
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_280014
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_280014 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_280014
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_280014 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_280014
													.next();

											// check object __DEC_messageSend_sendEvent_280014 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_280014 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_280014 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_280014
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_698790
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_698790 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_698790
													.hasNext()) {
										try {
											__DEC_message_message_698790 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_698790
													.next();

											// check object __DEC_message_message_698790 is really bound
											JavaSDM.ensure(__DEC_message_message_698790 != null);
											// check isomorphic binding between objects __DEC_message_message_698790 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_698790
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_698790 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_698790
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
		Interaction __DEC_combo_enclosingInteraction_23878 = null;
		InteractionOperand __DEC_combo_fragment_682822 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_640506 = null;
		InteractionOperand __DEC_messageReceive_fragment_747001 = null;
		Interaction __DEC_messageSend_enclosingInteraction_488371 = null;
		InteractionOperand __DEC_messageSend_fragment_641243 = null;
		Interaction __DEC_operand_enclosingInteraction_770109 = null;
		InteractionOperand __DEC_operand_fragment_498821 = null;
		InteractionOperand __DEC_guard_guard_90598 = null;
		CombinedFragment __DEC_operand_operand_187009 = null;
		Constraint __DEC_spec_specification_432506 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_547064 = null;
		Message __DEC_messageReceive_receiveEvent_547064 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772177 = null;
		Message __DEC_messageSend_receiveEvent_772177 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_932554 = null;
		Message __DEC_messageReceive_sendEvent_932554 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_164090 = null;
		Message __DEC_messageSend_sendEvent_164090 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_693277 = null;
		MessageEnd __DEC_message_message_693277 = null;
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
									__DEC_combo_enclosingInteraction_23878 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_23878 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_23878 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_23878 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_23878
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
									__DEC_combo_fragment_682822 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_682822 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_682822 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_682822 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_682822
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
									__DEC_messageReceive_enclosingInteraction_640506 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_640506 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_640506 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_640506 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_640506
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
									__DEC_messageReceive_fragment_747001 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_747001 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_747001 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_747001 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_747001
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
									__DEC_messageSend_enclosingInteraction_488371 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_488371 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_488371 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_488371 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_488371
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
									__DEC_messageSend_fragment_641243 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_641243 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_641243 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_641243 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_641243
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
									__DEC_operand_enclosingInteraction_770109 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_770109 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_770109 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_770109 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_770109
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
									__DEC_operand_fragment_498821 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_498821 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_498821 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_498821 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_498821
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
									__DEC_guard_guard_90598 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_90598 is really bound
									JavaSDM.ensure(__DEC_guard_guard_90598 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_90598
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_90598 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_90598
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
									__DEC_operand_operand_187009 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_187009 is really bound
									JavaSDM.ensure(__DEC_operand_operand_187009 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_187009
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_187009 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_187009
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
									__DEC_spec_specification_432506 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_432506 is really bound
									JavaSDM.ensure(__DEC_spec_specification_432506 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_432506
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_432506 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_432506
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_547064
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_547064 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_547064
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_547064 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_547064
													.next();

											// check object __DEC_messageReceive_receiveEvent_547064 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_547064 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_547064 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_547064
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_772177
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772177 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772177
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_772177 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_772177
													.next();

											// check object __DEC_messageSend_receiveEvent_772177 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_772177 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_772177 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_772177
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_932554
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_932554 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_932554
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_932554 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_932554
													.next();

											// check object __DEC_messageReceive_sendEvent_932554 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_932554 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_932554 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_932554
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_164090
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_164090 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_164090
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_164090 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_164090
													.next();

											// check object __DEC_messageSend_sendEvent_164090 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_164090 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_164090 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_164090
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_693277
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_693277 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_693277
													.hasNext()) {
										try {
											__DEC_message_message_693277 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_693277
													.next();

											// check object __DEC_message_message_693277 is really bound
											JavaSDM.ensure(__DEC_message_message_693277 != null);
											// check isomorphic binding between objects __DEC_message_message_693277 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_693277
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_693277 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_693277
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
		Interaction __DEC_combo_enclosingInteraction_562221 = null;
		InteractionOperand __DEC_combo_fragment_433398 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_713382 = null;
		InteractionOperand __DEC_messageReceive_fragment_640741 = null;
		Interaction __DEC_messageSend_enclosingInteraction_763732 = null;
		InteractionOperand __DEC_messageSend_fragment_994216 = null;
		Interaction __DEC_operand_enclosingInteraction_401161 = null;
		InteractionOperand __DEC_operand_fragment_77919 = null;
		InteractionOperand __DEC_guard_guard_751816 = null;
		CombinedFragment __DEC_operand_operand_855051 = null;
		Constraint __DEC_spec_specification_515286 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_150898 = null;
		Message __DEC_messageReceive_receiveEvent_150898 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718282 = null;
		Message __DEC_messageSend_receiveEvent_718282 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_782647 = null;
		Message __DEC_messageReceive_sendEvent_782647 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_361228 = null;
		Message __DEC_messageSend_sendEvent_361228 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_677666 = null;
		MessageEnd __DEC_message_message_677666 = null;
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
									__DEC_combo_enclosingInteraction_562221 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_562221 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_562221 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_562221 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_562221
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
									__DEC_combo_fragment_433398 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_433398 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_433398 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_433398 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_433398
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
									__DEC_messageReceive_enclosingInteraction_713382 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_713382 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_713382 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_713382 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_713382
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
									__DEC_messageReceive_fragment_640741 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_640741 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_640741 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_640741 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_640741
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
									__DEC_messageSend_enclosingInteraction_763732 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_763732 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_763732 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_763732 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_763732
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
									__DEC_messageSend_fragment_994216 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_994216 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_994216 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_994216 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_994216
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
									__DEC_operand_enclosingInteraction_401161 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_401161 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_401161 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_401161 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_401161
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
									__DEC_operand_fragment_77919 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_77919 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_77919 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_77919 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_77919
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
									__DEC_guard_guard_751816 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_751816 is really bound
									JavaSDM.ensure(__DEC_guard_guard_751816 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_751816
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_751816 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_751816
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
									__DEC_operand_operand_855051 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_855051 is really bound
									JavaSDM.ensure(__DEC_operand_operand_855051 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_855051
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_855051 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_855051
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
									__DEC_spec_specification_515286 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_515286 is really bound
									JavaSDM.ensure(__DEC_spec_specification_515286 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_515286
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_515286 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_515286
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_150898
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_150898 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_150898
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_150898 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_150898
													.next();

											// check object __DEC_messageReceive_receiveEvent_150898 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_150898 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_150898 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_150898
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_718282
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718282 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718282
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_718282 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_718282
													.next();

											// check object __DEC_messageSend_receiveEvent_718282 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_718282 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_718282 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_718282
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_782647
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_782647 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_782647
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_782647 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_782647
													.next();

											// check object __DEC_messageReceive_sendEvent_782647 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_782647 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_782647 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_782647
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_361228
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_361228 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_361228
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_361228 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_361228
													.next();

											// check object __DEC_messageSend_sendEvent_361228 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_361228 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_361228 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_361228
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_677666
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_677666 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_677666
													.hasNext()) {
										try {
											__DEC_message_message_677666 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_677666
													.next();

											// check object __DEC_message_message_677666 is really bound
											JavaSDM.ensure(__DEC_message_message_677666 != null);
											// check isomorphic binding between objects __DEC_message_message_677666 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_677666
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_677666 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_677666
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
		UseCase __DEC_altFlow_flows_389762 = null;
		NormalStep __DEC_alt_stepAlternative_306871 = null;
		Flow __DEC_step_steps_809252 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_668786 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_668786 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
		PackageDeclaration packageDeclaration = null;
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
							__DEC_altFlow_flows_389762 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_389762 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_389762 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_389762
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_389762 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_389762
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
							__DEC_alt_stepAlternative_306871 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_306871 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_306871 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_306871
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_306871 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_306871
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
							__DEC_step_steps_809252 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_809252 is really bound
							JavaSDM.ensure(__DEC_step_steps_809252 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_809252.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_809252 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_809252
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_809252 and flow 
							JavaSDM.ensure(!__DEC_step_steps_809252
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_668786
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_668786 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_668786
											.hasNext()) {
								try {
									__DEC_altFlow_ref_668786 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_668786
											.next();

									// check object __DEC_altFlow_ref_668786 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_668786 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_668786 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_668786
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
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
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

						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

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

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								alt, altFlow, useCase, flow, actor,
								packageDeclaration);
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
		UseCase __DEC_altFlow_flows_261316 = null;
		NormalStep __DEC_alt_stepAlternative_977155 = null;
		Flow __DEC_step_steps_523628 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_88093 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_88093 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
		Flow flow = null;
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

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

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
							__DEC_altFlow_flows_261316 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_261316 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_261316 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_261316
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_261316 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_261316
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
							__DEC_alt_stepAlternative_977155 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_977155 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_977155 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_977155
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_977155 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_977155
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
							__DEC_step_steps_523628 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_523628 is really bound
							JavaSDM.ensure(__DEC_step_steps_523628 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_523628.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_523628 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_523628
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_523628 and flow 
							JavaSDM.ensure(!__DEC_step_steps_523628
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_88093
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_88093 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_88093
											.hasNext()) {
								try {
									__DEC_altFlow_ref_88093 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_88093
											.next();

									// check object __DEC_altFlow_ref_88093 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_88093 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_88093 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_88093
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
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
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

						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

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

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								alt, altFlow, useCase, flow, actor,
								packageDeclaration);
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
		Interaction __DEC_combo_enclosingInteraction_622672 = null;
		InteractionOperand __DEC_combo_fragment_583531 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_830845 = null;
		InteractionOperand __DEC_messageReceive_fragment_199054 = null;
		Interaction __DEC_messageSend_enclosingInteraction_175725 = null;
		InteractionOperand __DEC_messageSend_fragment_236499 = null;
		Interaction __DEC_operand_enclosingInteraction_173813 = null;
		InteractionOperand __DEC_operand_fragment_243644 = null;
		InteractionOperand __DEC_guard_guard_644038 = null;
		CombinedFragment __DEC_operand_operand_483061 = null;
		Constraint __DEC_spec_specification_270923 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_411466 = null;
		Message __DEC_messageReceive_receiveEvent_411466 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_457889 = null;
		Message __DEC_messageSend_receiveEvent_457889 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_285769 = null;
		Message __DEC_messageReceive_sendEvent_285769 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_803121 = null;
		Message __DEC_messageSend_sendEvent_803121 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_577247 = null;
		MessageEnd __DEC_message_message_577247 = null;
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
											__DEC_combo_enclosingInteraction_622672 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_622672 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_622672 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_622672 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_622672
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
											__DEC_combo_fragment_583531 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_583531 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_583531 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_583531 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_583531
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
											__DEC_messageReceive_enclosingInteraction_830845 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_830845 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_830845 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_830845 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_830845
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
											__DEC_messageReceive_fragment_199054 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_199054 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_199054 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_199054 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_199054
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
											__DEC_messageSend_enclosingInteraction_175725 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_175725 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_175725 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_175725 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_175725
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
											__DEC_messageSend_fragment_236499 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_236499 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_236499 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_236499 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_236499
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
											__DEC_operand_enclosingInteraction_173813 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_173813 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_173813 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_173813 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_173813
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
											__DEC_operand_fragment_243644 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_243644 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_243644 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_243644 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_243644
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
											__DEC_guard_guard_644038 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_644038 is really bound
											JavaSDM.ensure(__DEC_guard_guard_644038 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_644038
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_644038 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_644038
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
											__DEC_operand_operand_483061 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_483061 is really bound
											JavaSDM.ensure(__DEC_operand_operand_483061 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_483061
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_483061 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_483061
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
											__DEC_spec_specification_270923 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_270923 is really bound
											JavaSDM.ensure(__DEC_spec_specification_270923 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_270923
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_270923 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_270923
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_411466
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_411466 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_411466
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_411466 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_411466
															.next();

													// check object __DEC_messageReceive_receiveEvent_411466 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_411466 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_411466 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_411466
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_457889
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_457889 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_457889
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_457889 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_457889
															.next();

													// check object __DEC_messageSend_receiveEvent_457889 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_457889 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_457889 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_457889
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_285769
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_285769 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_285769
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_285769 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_285769
															.next();

													// check object __DEC_messageReceive_sendEvent_285769 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_285769 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_285769 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_285769
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_803121
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_803121 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_803121
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_803121 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_803121
															.next();

													// check object __DEC_messageSend_sendEvent_803121 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_803121 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_803121 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_803121
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_577247
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_577247 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_577247
															.hasNext()) {
												try {
													__DEC_message_message_577247 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_577247
															.next();

													// check object __DEC_message_message_577247 is really bound
													JavaSDM.ensure(__DEC_message_message_577247 != null);
													// check isomorphic binding between objects __DEC_message_message_577247 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_577247
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_577247 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_577247
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
		Interaction __DEC_combo_enclosingInteraction_367842 = null;
		InteractionOperand __DEC_combo_fragment_354070 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_993557 = null;
		InteractionOperand __DEC_messageReceive_fragment_978836 = null;
		Interaction __DEC_messageSend_enclosingInteraction_368559 = null;
		InteractionOperand __DEC_messageSend_fragment_82887 = null;
		Interaction __DEC_operand_enclosingInteraction_447536 = null;
		InteractionOperand __DEC_operand_fragment_925753 = null;
		InteractionOperand __DEC_guard_guard_510551 = null;
		CombinedFragment __DEC_operand_operand_500120 = null;
		Constraint __DEC_spec_specification_917466 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_11317 = null;
		Message __DEC_messageReceive_receiveEvent_11317 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884285 = null;
		Message __DEC_messageSend_receiveEvent_884285 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_658988 = null;
		Message __DEC_messageReceive_sendEvent_658988 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_650027 = null;
		Message __DEC_messageSend_sendEvent_650027 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_91729 = null;
		MessageEnd __DEC_message_message_91729 = null;
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
											__DEC_combo_enclosingInteraction_367842 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_367842 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_367842 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_367842 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_367842
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
											__DEC_combo_fragment_354070 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_354070 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_354070 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_354070 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_354070
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
											__DEC_messageReceive_enclosingInteraction_993557 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_993557 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_993557 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_993557 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_993557
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
											__DEC_messageReceive_fragment_978836 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_978836 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_978836 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_978836 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_978836
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
											__DEC_messageSend_enclosingInteraction_368559 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_368559 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_368559 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_368559 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_368559
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
											__DEC_messageSend_fragment_82887 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_82887 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_82887 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_82887 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_82887
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
											__DEC_operand_enclosingInteraction_447536 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_447536 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_447536 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_447536 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_447536
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
											__DEC_operand_fragment_925753 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_925753 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_925753 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_925753 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_925753
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
											__DEC_guard_guard_510551 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_510551 is really bound
											JavaSDM.ensure(__DEC_guard_guard_510551 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_510551
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_510551 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_510551
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
											__DEC_operand_operand_500120 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_500120 is really bound
											JavaSDM.ensure(__DEC_operand_operand_500120 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_500120
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_500120 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_500120
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
											__DEC_spec_specification_917466 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_917466 is really bound
											JavaSDM.ensure(__DEC_spec_specification_917466 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_917466
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_917466 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_917466
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_11317
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_11317 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_11317
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_11317 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_11317
															.next();

													// check object __DEC_messageReceive_receiveEvent_11317 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_11317 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_11317 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_11317
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_884285
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884285 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884285
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_884285 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_884285
															.next();

													// check object __DEC_messageSend_receiveEvent_884285 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_884285 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_884285 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_884285
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_658988
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_658988 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_658988
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_658988 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_658988
															.next();

													// check object __DEC_messageReceive_sendEvent_658988 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_658988 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_658988 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_658988
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_650027
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_650027 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_650027
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_650027 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_650027
															.next();

													// check object __DEC_messageSend_sendEvent_650027 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_650027 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_650027 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_650027
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_91729
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_91729 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_91729
															.hasNext()) {
												try {
													__DEC_message_message_91729 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_91729
															.next();

													// check object __DEC_message_message_91729 is really bound
													JavaSDM.ensure(__DEC_message_message_91729 != null);
													// check isomorphic binding between objects __DEC_message_message_91729 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_91729
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_91729 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_91729
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
		Interaction __DEC_combo_enclosingInteraction_700739 = null;
		InteractionOperand __DEC_combo_fragment_700151 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_264971 = null;
		InteractionOperand __DEC_messageReceive_fragment_213237 = null;
		Interaction __DEC_messageSend_enclosingInteraction_588648 = null;
		InteractionOperand __DEC_messageSend_fragment_910687 = null;
		Interaction __DEC_operand_enclosingInteraction_660896 = null;
		InteractionOperand __DEC_operand_fragment_520394 = null;
		InteractionOperand __DEC_guard_guard_512338 = null;
		CombinedFragment __DEC_operand_operand_847425 = null;
		Constraint __DEC_spec_specification_857111 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_188823 = null;
		Message __DEC_messageReceive_receiveEvent_188823 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_312622 = null;
		Message __DEC_messageSend_receiveEvent_312622 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_426394 = null;
		Message __DEC_messageReceive_sendEvent_426394 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_308503 = null;
		Message __DEC_messageSend_sendEvent_308503 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_522337 = null;
		MessageEnd __DEC_message_message_522337 = null;
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
													__DEC_combo_enclosingInteraction_700739 = combo
															.getEnclosingInteraction();

													// check object __DEC_combo_enclosingInteraction_700739 is really bound
													JavaSDM.ensure(__DEC_combo_enclosingInteraction_700739 != null);

													// check isomorphic binding between objects __DEC_combo_enclosingInteraction_700739 and interaction 
													JavaSDM.ensure(!__DEC_combo_enclosingInteraction_700739
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
													__DEC_combo_fragment_700151 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_700151 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_700151 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_700151 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_700151
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
													__DEC_messageReceive_enclosingInteraction_264971 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_264971 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_264971 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_264971 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_264971
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
													__DEC_messageReceive_fragment_213237 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_213237 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_213237 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_213237 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_213237
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
													__DEC_messageSend_enclosingInteraction_588648 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_588648 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_588648 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_588648 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_588648
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
													__DEC_messageSend_fragment_910687 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_910687 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_910687 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_910687 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_910687
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
													__DEC_operand_enclosingInteraction_660896 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_660896 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_660896 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_660896 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_660896
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
													__DEC_operand_fragment_520394 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_520394 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_520394 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_520394 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_520394
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
													__DEC_guard_guard_512338 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_512338 is really bound
													JavaSDM.ensure(__DEC_guard_guard_512338 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_512338
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_512338 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_512338
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
													__DEC_operand_operand_847425 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_847425 is really bound
													JavaSDM.ensure(__DEC_operand_operand_847425 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_847425
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_847425 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_847425
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
													__DEC_spec_specification_857111 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_857111 is really bound
													JavaSDM.ensure(__DEC_spec_specification_857111 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_857111
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_857111 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_857111
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

													// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_188823
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_188823 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_188823
																	.hasNext()) {
														try {
															__DEC_messageReceive_receiveEvent_188823 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_188823
																	.next();

															// check object __DEC_messageReceive_receiveEvent_188823 is really bound
															JavaSDM.ensure(__DEC_messageReceive_receiveEvent_188823 != null);
															// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_188823 and message 
															JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_188823
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_312622
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_312622 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"receiveEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_312622
																	.hasNext()) {
														try {
															__DEC_messageSend_receiveEvent_312622 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_312622
																	.next();

															// check object __DEC_messageSend_receiveEvent_312622 is really bound
															JavaSDM.ensure(__DEC_messageSend_receiveEvent_312622 != null);
															// check isomorphic binding between objects __DEC_messageSend_receiveEvent_312622 and message 
															JavaSDM.ensure(!__DEC_messageSend_receiveEvent_312622
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_426394
													fujaba__Success = false;

													fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_426394 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageReceive,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_426394
																	.hasNext()) {
														try {
															__DEC_messageReceive_sendEvent_426394 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_426394
																	.next();

															// check object __DEC_messageReceive_sendEvent_426394 is really bound
															JavaSDM.ensure(__DEC_messageReceive_sendEvent_426394 != null);
															// check isomorphic binding between objects __DEC_messageReceive_sendEvent_426394 and message 
															JavaSDM.ensure(!__DEC_messageReceive_sendEvent_426394
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_308503
													fujaba__Success = false;

													fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_308503 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			Message.class,
																			"sendEvent"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_308503
																	.hasNext()) {
														try {
															__DEC_messageSend_sendEvent_308503 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_308503
																	.next();

															// check object __DEC_messageSend_sendEvent_308503 is really bound
															JavaSDM.ensure(__DEC_messageSend_sendEvent_308503 != null);
															// check isomorphic binding between objects __DEC_messageSend_sendEvent_308503 and message 
															JavaSDM.ensure(!__DEC_messageSend_sendEvent_308503
																	.equals(message));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}
													}
													JavaSDM.ensure(fujaba__Success);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link message from message to __DEC_message_message_522337
													fujaba__Success = false;

													fujaba__IterMessageTo__DEC_message_message_522337 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			message,
																			MessageEnd.class,
																			"message"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterMessageTo__DEC_message_message_522337
																	.hasNext()) {
														try {
															__DEC_message_message_522337 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_522337
																	.next();

															// check object __DEC_message_message_522337 is really bound
															JavaSDM.ensure(__DEC_message_message_522337 != null);
															// check isomorphic binding between objects __DEC_message_message_522337 and messageReceive 
															JavaSDM.ensure(!__DEC_message_message_522337
																	.equals(messageReceive));

															// check isomorphic binding between objects __DEC_message_message_522337 and messageSend 
															JavaSDM.ensure(!__DEC_message_message_522337
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
		Interaction __DEC_combo_enclosingInteraction_817991 = null;
		InteractionOperand __DEC_combo_fragment_115221 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_382493 = null;
		InteractionOperand __DEC_messageReceive_fragment_592288 = null;
		Interaction __DEC_messageSend_enclosingInteraction_307660 = null;
		InteractionOperand __DEC_messageSend_fragment_739260 = null;
		Interaction __DEC_operand_enclosingInteraction_785979 = null;
		InteractionOperand __DEC_operand_fragment_356351 = null;
		InteractionOperand __DEC_guard_guard_529627 = null;
		CombinedFragment __DEC_operand_operand_308017 = null;
		Constraint __DEC_spec_specification_585888 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_875034 = null;
		Message __DEC_messageReceive_receiveEvent_875034 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_663595 = null;
		Message __DEC_messageSend_receiveEvent_663595 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_681014 = null;
		Message __DEC_messageReceive_sendEvent_681014 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_610425 = null;
		Message __DEC_messageSend_sendEvent_610425 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_744340 = null;
		MessageEnd __DEC_message_message_744340 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_interaction = null;
		EMoflonEdge _edge_interaction = null;
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

									// check link trg from _edge_message to message
									JavaSDM.ensure(message.equals(_edge_message
											.getTrg()));

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

											// iterate to-many link trg from interaction to _edge_interaction
											fujaba__Success = false;

											fujaba__IterInteractionTo_edge_interaction = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	interaction,
																	EMoflonEdge.class,
																	"trg"))
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
															.equals(_edge_interaction
																	.getSrc()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_enclosingInteraction_817991 = combo
																	.getEnclosingInteraction();

															// check object __DEC_combo_enclosingInteraction_817991 is really bound
															JavaSDM.ensure(__DEC_combo_enclosingInteraction_817991 != null);

															// check isomorphic binding between objects __DEC_combo_enclosingInteraction_817991 and interaction 
															JavaSDM.ensure(!__DEC_combo_enclosingInteraction_817991
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
															__DEC_combo_fragment_115221 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_115221 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_115221 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_115221 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_115221
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
															__DEC_messageReceive_enclosingInteraction_382493 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_382493 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_382493 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_382493 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_382493
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
															__DEC_messageReceive_fragment_592288 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_592288 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_592288 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_592288 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_592288
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
															__DEC_messageSend_enclosingInteraction_307660 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_307660 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_307660 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_307660 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_307660
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
															__DEC_messageSend_fragment_739260 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_739260 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_739260 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_739260 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_739260
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
															__DEC_operand_enclosingInteraction_785979 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_785979 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_785979 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_785979 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_785979
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
															__DEC_operand_fragment_356351 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_356351 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_356351 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_356351 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_356351
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
															__DEC_guard_guard_529627 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_529627 is really bound
															JavaSDM.ensure(__DEC_guard_guard_529627 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_529627
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_529627 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_529627
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
															__DEC_operand_operand_308017 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_308017 is really bound
															JavaSDM.ensure(__DEC_operand_operand_308017 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_308017
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_308017 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_308017
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
															__DEC_spec_specification_585888 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_585888 is really bound
															JavaSDM.ensure(__DEC_spec_specification_585888 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_585888
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_585888 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_585888
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

															// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_875034
															fujaba__Success = false;

															fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_875034 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageReceive,
																					Message.class,
																					"receiveEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_875034
																			.hasNext()) {
																try {
																	__DEC_messageReceive_receiveEvent_875034 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_875034
																			.next();

																	// check object __DEC_messageReceive_receiveEvent_875034 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_receiveEvent_875034 != null);
																	// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_875034 and message 
																	JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_875034
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_663595
															fujaba__Success = false;

															fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_663595 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageSend,
																					Message.class,
																					"receiveEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_663595
																			.hasNext()) {
																try {
																	__DEC_messageSend_receiveEvent_663595 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_663595
																			.next();

																	// check object __DEC_messageSend_receiveEvent_663595 is really bound
																	JavaSDM.ensure(__DEC_messageSend_receiveEvent_663595 != null);
																	// check isomorphic binding between objects __DEC_messageSend_receiveEvent_663595 and message 
																	JavaSDM.ensure(!__DEC_messageSend_receiveEvent_663595
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_681014
															fujaba__Success = false;

															fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_681014 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageReceive,
																					Message.class,
																					"sendEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_681014
																			.hasNext()) {
																try {
																	__DEC_messageReceive_sendEvent_681014 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_681014
																			.next();

																	// check object __DEC_messageReceive_sendEvent_681014 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_sendEvent_681014 != null);
																	// check isomorphic binding between objects __DEC_messageReceive_sendEvent_681014 and message 
																	JavaSDM.ensure(!__DEC_messageReceive_sendEvent_681014
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_610425
															fujaba__Success = false;

															fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_610425 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					messageSend,
																					Message.class,
																					"sendEvent"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_610425
																			.hasNext()) {
																try {
																	__DEC_messageSend_sendEvent_610425 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_610425
																			.next();

																	// check object __DEC_messageSend_sendEvent_610425 is really bound
																	JavaSDM.ensure(__DEC_messageSend_sendEvent_610425 != null);
																	// check isomorphic binding between objects __DEC_messageSend_sendEvent_610425 and message 
																	JavaSDM.ensure(!__DEC_messageSend_sendEvent_610425
																			.equals(message));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}
															}
															JavaSDM.ensure(fujaba__Success);

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link message from message to __DEC_message_message_744340
															fujaba__Success = false;

															fujaba__IterMessageTo__DEC_message_message_744340 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					message,
																					MessageEnd.class,
																					"message"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterMessageTo__DEC_message_message_744340
																			.hasNext()) {
																try {
																	__DEC_message_message_744340 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_744340
																			.next();

																	// check object __DEC_message_message_744340 is really bound
																	JavaSDM.ensure(__DEC_message_message_744340 != null);
																	// check isomorphic binding between objects __DEC_message_message_744340 and messageReceive 
																	JavaSDM.ensure(!__DEC_message_message_744340
																			.equals(messageReceive));

																	// check isomorphic binding between objects __DEC_message_message_744340 and messageSend 
																	JavaSDM.ensure(!__DEC_message_message_744340
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
		Interaction __DEC_combo_enclosingInteraction_571027 = null;
		InteractionOperand __DEC_combo_fragment_173498 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_705555 = null;
		InteractionOperand __DEC_messageReceive_fragment_76511 = null;
		Interaction __DEC_messageSend_enclosingInteraction_160668 = null;
		InteractionOperand __DEC_messageSend_fragment_363851 = null;
		Interaction __DEC_operand_enclosingInteraction_540895 = null;
		InteractionOperand __DEC_operand_fragment_965220 = null;
		InteractionOperand __DEC_guard_guard_273145 = null;
		CombinedFragment __DEC_operand_operand_461093 = null;
		Constraint __DEC_spec_specification_841735 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_403022 = null;
		Message __DEC_messageReceive_receiveEvent_403022 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_308194 = null;
		Message __DEC_messageSend_receiveEvent_308194 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_336438 = null;
		Message __DEC_messageReceive_sendEvent_336438 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_140662 = null;
		Message __DEC_messageSend_sendEvent_140662 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_317351 = null;
		MessageEnd __DEC_message_message_317351 = null;
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
											__DEC_combo_enclosingInteraction_571027 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_571027 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_571027 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_571027 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_571027
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
											__DEC_combo_fragment_173498 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_173498 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_173498 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_173498 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_173498
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
											__DEC_messageReceive_enclosingInteraction_705555 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_705555 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_705555 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_705555 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_705555
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
											__DEC_messageReceive_fragment_76511 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_76511 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_76511 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_76511 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_76511
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
											__DEC_messageSend_enclosingInteraction_160668 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_160668 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_160668 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_160668 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_160668
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
											__DEC_messageSend_fragment_363851 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_363851 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_363851 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_363851 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_363851
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
											__DEC_operand_enclosingInteraction_540895 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_540895 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_540895 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_540895 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_540895
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
											__DEC_operand_fragment_965220 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_965220 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_965220 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_965220 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_965220
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
											__DEC_guard_guard_273145 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_273145 is really bound
											JavaSDM.ensure(__DEC_guard_guard_273145 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_273145
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_273145 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_273145
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
											__DEC_operand_operand_461093 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_461093 is really bound
											JavaSDM.ensure(__DEC_operand_operand_461093 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_461093
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_461093 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_461093
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
											__DEC_spec_specification_841735 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_841735 is really bound
											JavaSDM.ensure(__DEC_spec_specification_841735 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_841735
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_841735 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_841735
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_403022
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_403022 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_403022
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_403022 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_403022
															.next();

													// check object __DEC_messageReceive_receiveEvent_403022 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_403022 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_403022 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_403022
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_308194
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_308194 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_308194
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_308194 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_308194
															.next();

													// check object __DEC_messageSend_receiveEvent_308194 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_308194 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_308194 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_308194
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_336438
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_336438 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_336438
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_336438 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_336438
															.next();

													// check object __DEC_messageReceive_sendEvent_336438 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_336438 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_336438 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_336438
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_140662
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_140662 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_140662
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_140662 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_140662
															.next();

													// check object __DEC_messageSend_sendEvent_140662 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_140662 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_140662 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_140662
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_317351
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_317351 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_317351
															.hasNext()) {
												try {
													__DEC_message_message_317351 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_317351
															.next();

													// check object __DEC_message_message_317351 is really bound
													JavaSDM.ensure(__DEC_message_message_317351 != null);
													// check isomorphic binding between objects __DEC_message_message_317351 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_317351
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_317351 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_317351
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
		Interaction __DEC_combo_enclosingInteraction_448553 = null;
		InteractionOperand __DEC_combo_fragment_615221 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_48622 = null;
		InteractionOperand __DEC_messageReceive_fragment_516135 = null;
		Interaction __DEC_messageSend_enclosingInteraction_256360 = null;
		InteractionOperand __DEC_messageSend_fragment_138986 = null;
		Interaction __DEC_operand_enclosingInteraction_575267 = null;
		InteractionOperand __DEC_operand_fragment_141832 = null;
		InteractionOperand __DEC_guard_guard_275906 = null;
		CombinedFragment __DEC_operand_operand_628147 = null;
		Constraint __DEC_spec_specification_884380 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665366 = null;
		Message __DEC_messageReceive_receiveEvent_665366 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_774412 = null;
		Message __DEC_messageSend_receiveEvent_774412 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_462693 = null;
		Message __DEC_messageReceive_sendEvent_462693 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_591841 = null;
		Message __DEC_messageSend_sendEvent_591841 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_530703 = null;
		MessageEnd __DEC_message_message_530703 = null;
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
											__DEC_combo_enclosingInteraction_448553 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_448553 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_448553 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_448553 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_448553
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
											__DEC_combo_fragment_615221 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_615221 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_615221 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_615221 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_615221
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
											__DEC_messageReceive_enclosingInteraction_48622 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_48622 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_48622 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_48622 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_48622
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
											__DEC_messageReceive_fragment_516135 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_516135 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_516135 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_516135 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_516135
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
											__DEC_messageSend_enclosingInteraction_256360 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_256360 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_256360 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_256360 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_256360
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
											__DEC_messageSend_fragment_138986 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_138986 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_138986 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_138986 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_138986
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
											__DEC_operand_enclosingInteraction_575267 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_575267 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_575267 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_575267 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_575267
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
											__DEC_operand_fragment_141832 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_141832 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_141832 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_141832 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_141832
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
											__DEC_guard_guard_275906 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_275906 is really bound
											JavaSDM.ensure(__DEC_guard_guard_275906 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_275906
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_275906 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_275906
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
											__DEC_operand_operand_628147 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_628147 is really bound
											JavaSDM.ensure(__DEC_operand_operand_628147 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_628147
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_628147 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_628147
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
											__DEC_spec_specification_884380 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_884380 is really bound
											JavaSDM.ensure(__DEC_spec_specification_884380 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_884380
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_884380 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_884380
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_665366
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665366 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665366
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_665366 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_665366
															.next();

													// check object __DEC_messageReceive_receiveEvent_665366 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_665366 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_665366 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_665366
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_774412
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_774412 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_774412
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_774412 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_774412
															.next();

													// check object __DEC_messageSend_receiveEvent_774412 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_774412 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_774412 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_774412
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_462693
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_462693 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_462693
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_462693 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_462693
															.next();

													// check object __DEC_messageReceive_sendEvent_462693 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_462693 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_462693 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_462693
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_591841
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_591841 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_591841
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_591841 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_591841
															.next();

													// check object __DEC_messageSend_sendEvent_591841 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_591841 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_591841 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_591841
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_530703
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_530703 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_530703
															.hasNext()) {
												try {
													__DEC_message_message_530703 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_530703
															.next();

													// check object __DEC_message_message_530703 is really bound
													JavaSDM.ensure(__DEC_message_message_530703 != null);
													// check isomorphic binding between objects __DEC_message_message_530703 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_530703
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_530703 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_530703
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
		Interaction __DEC_combo_enclosingInteraction_554802 = null;
		InteractionOperand __DEC_combo_fragment_730429 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_562004 = null;
		InteractionOperand __DEC_messageReceive_fragment_37980 = null;
		Interaction __DEC_messageSend_enclosingInteraction_611679 = null;
		InteractionOperand __DEC_messageSend_fragment_792910 = null;
		Interaction __DEC_operand_enclosingInteraction_612415 = null;
		InteractionOperand __DEC_operand_fragment_804938 = null;
		InteractionOperand __DEC_guard_guard_158520 = null;
		CombinedFragment __DEC_operand_operand_496388 = null;
		Constraint __DEC_spec_specification_630485 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730977 = null;
		Message __DEC_messageReceive_receiveEvent_730977 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_140194 = null;
		Message __DEC_messageSend_receiveEvent_140194 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_653323 = null;
		Message __DEC_messageReceive_sendEvent_653323 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_792076 = null;
		Message __DEC_messageSend_sendEvent_792076 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_289273 = null;
		MessageEnd __DEC_message_message_289273 = null;
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
									__DEC_combo_enclosingInteraction_554802 = combo
											.getEnclosingInteraction();

									// check object __DEC_combo_enclosingInteraction_554802 is really bound
									JavaSDM.ensure(__DEC_combo_enclosingInteraction_554802 != null);

									// check isomorphic binding between objects __DEC_combo_enclosingInteraction_554802 and interaction 
									JavaSDM.ensure(!__DEC_combo_enclosingInteraction_554802
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
									__DEC_combo_fragment_730429 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_730429 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_730429 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_730429 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_730429
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
									__DEC_messageReceive_enclosingInteraction_562004 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_562004 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_562004 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_562004 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_562004
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
									__DEC_messageReceive_fragment_37980 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_37980 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_37980 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_37980 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_37980
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
									__DEC_messageSend_enclosingInteraction_611679 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_611679 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_611679 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_611679 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_611679
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
									__DEC_messageSend_fragment_792910 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_792910 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_792910 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_792910 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_792910
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
									__DEC_operand_enclosingInteraction_612415 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_612415 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_612415 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_612415 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_612415
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
									__DEC_operand_fragment_804938 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_804938 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_804938 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_804938 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_804938
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
									__DEC_guard_guard_158520 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_158520 is really bound
									JavaSDM.ensure(__DEC_guard_guard_158520 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_158520
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_158520 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_158520
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
									__DEC_operand_operand_496388 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_496388 is really bound
									JavaSDM.ensure(__DEC_operand_operand_496388 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_496388
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_496388 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_496388
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
									__DEC_spec_specification_630485 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_630485 is really bound
									JavaSDM.ensure(__DEC_spec_specification_630485 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_630485
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_630485 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_630485
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

									// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_730977
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730977 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730977
													.hasNext()) {
										try {
											__DEC_messageReceive_receiveEvent_730977 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_730977
													.next();

											// check object __DEC_messageReceive_receiveEvent_730977 is really bound
											JavaSDM.ensure(__DEC_messageReceive_receiveEvent_730977 != null);
											// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_730977 and message 
											JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_730977
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_140194
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_140194 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"receiveEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_140194
													.hasNext()) {
										try {
											__DEC_messageSend_receiveEvent_140194 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_140194
													.next();

											// check object __DEC_messageSend_receiveEvent_140194 is really bound
											JavaSDM.ensure(__DEC_messageSend_receiveEvent_140194 != null);
											// check isomorphic binding between objects __DEC_messageSend_receiveEvent_140194 and message 
											JavaSDM.ensure(!__DEC_messageSend_receiveEvent_140194
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_653323
									fujaba__Success = false;

									fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_653323 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageReceive,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_653323
													.hasNext()) {
										try {
											__DEC_messageReceive_sendEvent_653323 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_653323
													.next();

											// check object __DEC_messageReceive_sendEvent_653323 is really bound
											JavaSDM.ensure(__DEC_messageReceive_sendEvent_653323 != null);
											// check isomorphic binding between objects __DEC_messageReceive_sendEvent_653323 and message 
											JavaSDM.ensure(!__DEC_messageReceive_sendEvent_653323
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_792076
									fujaba__Success = false;

									fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_792076 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															messageSend,
															Message.class,
															"sendEvent"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_792076
													.hasNext()) {
										try {
											__DEC_messageSend_sendEvent_792076 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_792076
													.next();

											// check object __DEC_messageSend_sendEvent_792076 is really bound
											JavaSDM.ensure(__DEC_messageSend_sendEvent_792076 != null);
											// check isomorphic binding between objects __DEC_messageSend_sendEvent_792076 and message 
											JavaSDM.ensure(!__DEC_messageSend_sendEvent_792076
													.equals(message));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link message from message to __DEC_message_message_289273
									fujaba__Success = false;

									fujaba__IterMessageTo__DEC_message_message_289273 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															message,
															MessageEnd.class,
															"message"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterMessageTo__DEC_message_message_289273
													.hasNext()) {
										try {
											__DEC_message_message_289273 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_289273
													.next();

											// check object __DEC_message_message_289273 is really bound
											JavaSDM.ensure(__DEC_message_message_289273 != null);
											// check isomorphic binding between objects __DEC_message_message_289273 and messageReceive 
											JavaSDM.ensure(!__DEC_message_message_289273
													.equals(messageReceive));

											// check isomorphic binding between objects __DEC_message_message_289273 and messageSend 
											JavaSDM.ensure(!__DEC_message_message_289273
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
		Interaction __DEC_combo_enclosingInteraction_744246 = null;
		InteractionOperand __DEC_combo_fragment_847684 = null;
		Interaction __DEC_messageReceive_enclosingInteraction_335807 = null;
		InteractionOperand __DEC_messageReceive_fragment_869444 = null;
		Interaction __DEC_messageSend_enclosingInteraction_198370 = null;
		InteractionOperand __DEC_messageSend_fragment_679497 = null;
		Interaction __DEC_operand_enclosingInteraction_64995 = null;
		InteractionOperand __DEC_operand_fragment_422135 = null;
		InteractionOperand __DEC_guard_guard_713258 = null;
		CombinedFragment __DEC_operand_operand_105472 = null;
		Constraint __DEC_spec_specification_689289 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_255601 = null;
		Message __DEC_messageReceive_receiveEvent_255601 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_763145 = null;
		Message __DEC_messageSend_receiveEvent_763145 = null;
		Iterator fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_846635 = null;
		Message __DEC_messageReceive_sendEvent_846635 = null;
		Iterator fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_542946 = null;
		Message __DEC_messageSend_sendEvent_542946 = null;
		Iterator fujaba__IterMessageTo__DEC_message_message_936544 = null;
		MessageEnd __DEC_message_message_936544 = null;
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
											__DEC_combo_enclosingInteraction_744246 = combo
													.getEnclosingInteraction();

											// check object __DEC_combo_enclosingInteraction_744246 is really bound
											JavaSDM.ensure(__DEC_combo_enclosingInteraction_744246 != null);

											// check isomorphic binding between objects __DEC_combo_enclosingInteraction_744246 and interaction 
											JavaSDM.ensure(!__DEC_combo_enclosingInteraction_744246
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
											__DEC_combo_fragment_847684 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_847684 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_847684 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_847684 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_847684
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
											__DEC_messageReceive_enclosingInteraction_335807 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_335807 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_335807 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_335807 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_335807
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
											__DEC_messageReceive_fragment_869444 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_869444 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_869444 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_869444 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_869444
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
											__DEC_messageSend_enclosingInteraction_198370 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_198370 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_198370 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_198370 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_198370
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
											__DEC_messageSend_fragment_679497 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_679497 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_679497 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_679497 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_679497
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
											__DEC_operand_enclosingInteraction_64995 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_64995 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_64995 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_64995 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_64995
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
											__DEC_operand_fragment_422135 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_422135 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_422135 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_422135 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_422135
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
											__DEC_guard_guard_713258 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_713258 is really bound
											JavaSDM.ensure(__DEC_guard_guard_713258 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_713258
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_713258 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_713258
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
											__DEC_operand_operand_105472 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_105472 is really bound
											JavaSDM.ensure(__DEC_operand_operand_105472 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_105472
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_105472 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_105472
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
											__DEC_spec_specification_689289 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_689289 is really bound
											JavaSDM.ensure(__DEC_spec_specification_689289 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_689289
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_689289 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_689289
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

											// iterate to-many link receiveEvent from messageReceive to __DEC_messageReceive_receiveEvent_255601
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_255601 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_255601
															.hasNext()) {
												try {
													__DEC_messageReceive_receiveEvent_255601 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_receiveEvent_255601
															.next();

													// check object __DEC_messageReceive_receiveEvent_255601 is really bound
													JavaSDM.ensure(__DEC_messageReceive_receiveEvent_255601 != null);
													// check isomorphic binding between objects __DEC_messageReceive_receiveEvent_255601 and message 
													JavaSDM.ensure(!__DEC_messageReceive_receiveEvent_255601
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link receiveEvent from messageSend to __DEC_messageSend_receiveEvent_763145
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_763145 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"receiveEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_763145
															.hasNext()) {
												try {
													__DEC_messageSend_receiveEvent_763145 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_receiveEvent_763145
															.next();

													// check object __DEC_messageSend_receiveEvent_763145 is really bound
													JavaSDM.ensure(__DEC_messageSend_receiveEvent_763145 != null);
													// check isomorphic binding between objects __DEC_messageSend_receiveEvent_763145 and message 
													JavaSDM.ensure(!__DEC_messageSend_receiveEvent_763145
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageReceive to __DEC_messageReceive_sendEvent_846635
											fujaba__Success = false;

											fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_846635 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageReceive,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_846635
															.hasNext()) {
												try {
													__DEC_messageReceive_sendEvent_846635 = (Message) fujaba__IterMessageReceiveTo__DEC_messageReceive_sendEvent_846635
															.next();

													// check object __DEC_messageReceive_sendEvent_846635 is really bound
													JavaSDM.ensure(__DEC_messageReceive_sendEvent_846635 != null);
													// check isomorphic binding between objects __DEC_messageReceive_sendEvent_846635 and message 
													JavaSDM.ensure(!__DEC_messageReceive_sendEvent_846635
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link sendEvent from messageSend to __DEC_messageSend_sendEvent_542946
											fujaba__Success = false;

											fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_542946 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	messageSend,
																	Message.class,
																	"sendEvent"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_542946
															.hasNext()) {
												try {
													__DEC_messageSend_sendEvent_542946 = (Message) fujaba__IterMessageSendTo__DEC_messageSend_sendEvent_542946
															.next();

													// check object __DEC_messageSend_sendEvent_542946 is really bound
													JavaSDM.ensure(__DEC_messageSend_sendEvent_542946 != null);
													// check isomorphic binding between objects __DEC_messageSend_sendEvent_542946 and message 
													JavaSDM.ensure(!__DEC_messageSend_sendEvent_542946
															.equals(message));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link message from message to __DEC_message_message_936544
											fujaba__Success = false;

											fujaba__IterMessageTo__DEC_message_message_936544 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	message,
																	MessageEnd.class,
																	"message"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterMessageTo__DEC_message_message_936544
															.hasNext()) {
												try {
													__DEC_message_message_936544 = (MessageEnd) fujaba__IterMessageTo__DEC_message_message_936544
															.next();

													// check object __DEC_message_message_936544 is really bound
													JavaSDM.ensure(__DEC_message_message_936544 != null);
													// check isomorphic binding between objects __DEC_message_message_936544 and messageReceive 
													JavaSDM.ensure(!__DEC_message_message_936544
															.equals(messageReceive));

													// check isomorphic binding between objects __DEC_message_message_936544 and messageSend 
													JavaSDM.ensure(!__DEC_message_message_936544
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
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
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
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6),
					(PackageDeclaration) arguments.get(7));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6),
					(PackageDeclaration) arguments.get(7));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6),
					(PackageDeclaration) arguments.get(7));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_LIFELINE_ALTERNATIVEFLOW_USECASE_USECASETOINTERACTION_FLOW_INTERACTION_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
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
					(ActorToLifeline) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22));
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_LIFELINE_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
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
					(ActorToLifeline) arguments.get(14),
					(PackageDeclaration) arguments.get(15));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22));
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4),
					(Interaction) arguments.get(5),
					(Lifeline) arguments.get(6), (Actor) arguments.get(7),
					(ActorToLifeline) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
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
