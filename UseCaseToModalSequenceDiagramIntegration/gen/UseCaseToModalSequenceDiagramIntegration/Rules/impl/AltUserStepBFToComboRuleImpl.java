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

import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepBFToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Alt User Step BF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltUserStepBFToComboRuleImpl extends AbstractRuleImpl implements
		AltUserStepBFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltUserStepBFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltUserStepBFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
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
					packageDeclaration, actor, sysActor, flow, useCase, step,
					alt, altFlow));

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
				// check object sysActor is really bound
				JavaSDM.ensure(sysActor != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects sysActor and actor 
				JavaSDM.ensure(!sysActor.equals(actor));

				// create object __step_stepAlternative_alt
				__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_actor_actor
				__step_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __alt_ref_altFlow
				__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __flow_steps_step
				__flow_steps_step.setName("steps");
				// assign attribute __step_stepAlternative_alt
				__step_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __step_actor_actor
				__step_actor_actor.setName("actor");
				// assign attribute __alt_ref_altFlow
				__alt_ref_altFlow.setName("ref");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_stepAlternative_alt, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_altFlow, "toBeTranslatedEdges");

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
				__step_actor_actor.setTrg(actor);

				// create link
				__flow_steps_step.setSrc(flow);

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
				// check object sysActor is really bound
				JavaSDM.ensure(sysActor != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects sysActor and actor 
				JavaSDM.ensure(!sysActor.equals(actor));

				// create object __packageDeclaration_actors_sysActor
				__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
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
						__packageDeclaration_actors_sysActor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysActor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_sysActor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__packageDeclaration_actors_sysActor.setTrg(sysActor);

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
			this.registerObjectsToMatch_FWD(match, packageDeclaration, actor,
					sysActor, flow, useCase, step, alt, altFlow);
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
		InteractionOperand operand = null;
		CombinedFragment combo = null;
		NormalStepToCombinedFragment stepToCombo = null;
		InteractionConstraint guard = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		FlowToInteractionFragment altFlowToOperand = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge combo__enclosingInteraction__interaction = null;
		EMoflonEdge sysLine__coveredBy__messageSend = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge combo__covered__sysLine = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge interaction__fragment__combo = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge operand__covered__sysLine = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge guard__specification__spec = null;
		EMoflonEdge messageSend__enclosingInteraction__interaction = null;
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge sysLine__coveredBy__combo = null;
		EMoflonEdge interaction__fragment__messageSend = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge messageSend__covered__sysLine = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge combo__covered__line = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge sysLine__coveredBy__operand = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;

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

			// create object operand
			operand = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionOperand();

			// create object combo
			combo = ModalSequenceDiagramFactory.eINSTANCE
					.createCombinedFragment();

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object guard
			guard = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionConstraint();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object spec
			spec = ModalSequenceDiagramFactory.eINSTANCE.createLiteralString();

			// assign attribute combo
			combo.setInteractionOperator((ModalSequenceDiagram.InteractionOperatorKind) csp
					.getValue("combo", "interactionOperator"));
			// assign attribute guard
			guard.setName((java.lang.String) csp.getValue("guard", "name"));
			// assign attribute spec
			spec.setValue((java.lang.String) csp.getValue("spec", "value"));

			// create link
			altFlowToOperand.setSource(altFlow);

			// create link
			messageSend.getCovered().add(sysLine);

			// create link
			operand.getCovered().add(sysLine);

			// create link
			combo.getCovered().add(sysLine);

			// create link
			interaction.getFragment().add(messageSend);

			// create link
			line.getCoveredBy().add(combo);

			// create link
			stepToCombo.setTarget(combo);

			// create link
			interaction.getFragment().add(combo);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			alternative1ToOperand.setTarget(operand);

			// create link
			line.getCoveredBy().add(operand);

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			messageReceive.setEnclosingInteraction(interaction);

			// create link
			stepToCombo.setSource(step);

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			guard.setSpecification(spec); // add link to one

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
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

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
			// check object flowToInteraction is really bound
			JavaSDM.ensure(flowToInteraction != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
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

			// check isomorphic binding between objects flowToInteraction and actor 
			JavaSDM.ensure(!flowToInteraction.equals(actor));

			// check isomorphic binding between objects guard and actor 
			JavaSDM.ensure(!guard.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

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

			// check isomorphic binding between objects flowToInteraction and actorToLine 
			JavaSDM.ensure(!flowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects guard and actorToLine 
			JavaSDM.ensure(!guard.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

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

			// check isomorphic binding between objects flowToInteraction and alt 
			JavaSDM.ensure(!flowToInteraction.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects interaction and alt 
			JavaSDM.ensure(!interaction.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

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

			// check isomorphic binding between objects sysActor and alt 
			JavaSDM.ensure(!sysActor.equals(alt));

			// check isomorphic binding between objects sysActorToSysLine and alt 
			JavaSDM.ensure(!sysActorToSysLine.equals(alt));

			// check isomorphic binding between objects sysLine and alt 
			JavaSDM.ensure(!sysLine.equals(alt));

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

			// check isomorphic binding between objects flowToInteraction and altFlow 
			JavaSDM.ensure(!flowToInteraction.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects interaction and altFlow 
			JavaSDM.ensure(!interaction.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

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

			// check isomorphic binding between objects sysActor and altFlow 
			JavaSDM.ensure(!sysActor.equals(altFlow));

			// check isomorphic binding between objects sysActorToSysLine and altFlow 
			JavaSDM.ensure(!sysActorToSysLine.equals(altFlow));

			// check isomorphic binding between objects sysLine and altFlow 
			JavaSDM.ensure(!sysLine.equals(altFlow));

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

			// check isomorphic binding between objects flowToInteraction and altFlowToOperand 
			JavaSDM.ensure(!flowToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects guard and altFlowToOperand 
			JavaSDM.ensure(!guard.equals(altFlowToOperand));

			// check isomorphic binding between objects interaction and altFlowToOperand 
			JavaSDM.ensure(!interaction.equals(altFlowToOperand));

			// check isomorphic binding between objects line and altFlowToOperand 
			JavaSDM.ensure(!line.equals(altFlowToOperand));

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

			// check isomorphic binding between objects sysActor and altFlowToOperand 
			JavaSDM.ensure(!sysActor.equals(altFlowToOperand));

			// check isomorphic binding between objects sysActorToSysLine and altFlowToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(altFlowToOperand));

			// check isomorphic binding between objects sysLine and altFlowToOperand 
			JavaSDM.ensure(!sysLine.equals(altFlowToOperand));

			// check isomorphic binding between objects useCase and altFlowToOperand 
			JavaSDM.ensure(!useCase.equals(altFlowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and altFlowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and alternative1ToOperand 
			JavaSDM.ensure(!combo.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and alternative1ToOperand 
			JavaSDM.ensure(!flow.equals(alternative1ToOperand));

			// check isomorphic binding between objects flowToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!flowToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects guard and alternative1ToOperand 
			JavaSDM.ensure(!guard.equals(alternative1ToOperand));

			// check isomorphic binding between objects interaction and alternative1ToOperand 
			JavaSDM.ensure(!interaction.equals(alternative1ToOperand));

			// check isomorphic binding between objects line and alternative1ToOperand 
			JavaSDM.ensure(!line.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects sysActor and alternative1ToOperand 
			JavaSDM.ensure(!sysActor.equals(alternative1ToOperand));

			// check isomorphic binding between objects sysActorToSysLine and alternative1ToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(alternative1ToOperand));

			// check isomorphic binding between objects sysLine and alternative1ToOperand 
			JavaSDM.ensure(!sysLine.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCase and alternative1ToOperand 
			JavaSDM.ensure(!useCase.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCaseToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects flowToInteraction and combo 
			JavaSDM.ensure(!flowToInteraction.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects interaction and combo 
			JavaSDM.ensure(!interaction.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

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

			// check isomorphic binding between objects flowToInteraction and flow 
			JavaSDM.ensure(!flowToInteraction.equals(flow));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

			// check isomorphic binding between objects interaction and flow 
			JavaSDM.ensure(!interaction.equals(flow));

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

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

			// check isomorphic binding between objects guard and flowToInteraction 
			JavaSDM.ensure(!guard.equals(flowToInteraction));

			// check isomorphic binding between objects interaction and flowToInteraction 
			JavaSDM.ensure(!interaction.equals(flowToInteraction));

			// check isomorphic binding between objects line and flowToInteraction 
			JavaSDM.ensure(!line.equals(flowToInteraction));

			// check isomorphic binding between objects messageReceive and flowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(flowToInteraction));

			// check isomorphic binding between objects messageSend and flowToInteraction 
			JavaSDM.ensure(!messageSend.equals(flowToInteraction));

			// check isomorphic binding between objects operand and flowToInteraction 
			JavaSDM.ensure(!operand.equals(flowToInteraction));

			// check isomorphic binding between objects packageDeclaration and flowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(flowToInteraction));

			// check isomorphic binding between objects spec and flowToInteraction 
			JavaSDM.ensure(!spec.equals(flowToInteraction));

			// check isomorphic binding between objects step and flowToInteraction 
			JavaSDM.ensure(!step.equals(flowToInteraction));

			// check isomorphic binding between objects stepToCombo and flowToInteraction 
			JavaSDM.ensure(!stepToCombo.equals(flowToInteraction));

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

			// check isomorphic binding between objects interaction and guard 
			JavaSDM.ensure(!interaction.equals(guard));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

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

			// check isomorphic binding between objects sysActor and guard 
			JavaSDM.ensure(!sysActor.equals(guard));

			// check isomorphic binding between objects sysActorToSysLine and guard 
			JavaSDM.ensure(!sysActorToSysLine.equals(guard));

			// check isomorphic binding between objects sysLine and guard 
			JavaSDM.ensure(!sysLine.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects useCaseToInteraction and guard 
			JavaSDM.ensure(!useCaseToInteraction.equals(guard));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

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

			// check isomorphic binding between objects spec and messageSend 
			JavaSDM.ensure(!spec.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToCombo and messageSend 
			JavaSDM.ensure(!stepToCombo.equals(messageSend));

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

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

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

			// check isomorphic binding between objects spec and packageDeclaration 
			JavaSDM.ensure(!spec.equals(packageDeclaration));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToCombo and packageDeclaration 
			JavaSDM.ensure(!stepToCombo.equals(packageDeclaration));

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

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects sysActor and spec 
			JavaSDM.ensure(!sysActor.equals(spec));

			// check isomorphic binding between objects sysActorToSysLine and spec 
			JavaSDM.ensure(!sysActorToSysLine.equals(spec));

			// check isomorphic binding between objects sysLine and spec 
			JavaSDM.ensure(!sysLine.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

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

			// check isomorphic binding between objects sysActor and stepToCombo 
			JavaSDM.ensure(!sysActor.equals(stepToCombo));

			// check isomorphic binding between objects sysActorToSysLine and stepToCombo 
			JavaSDM.ensure(!sysActorToSysLine.equals(stepToCombo));

			// check isomorphic binding between objects sysLine and stepToCombo 
			JavaSDM.ensure(!sysLine.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

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

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__enclosingInteraction__interaction
			combo__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__sysLine
			combo__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__combo
			interaction__fragment__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__sysLine
			operand__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingInteraction__interaction
			messageSend__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__combo
			sysLine__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageSend
			interaction__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object messageSend__covered__sysLine
			messageSend__covered__sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sysLine__coveredBy__operand
			sysLine__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltUserStepBFToComboRule");
			// assign attribute sysLine__coveredBy__messageSend
			sysLine__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__sysLine
			messageSend__covered__sysLine.setName("covered");
			// assign attribute sysLine__coveredBy__combo
			sysLine__coveredBy__combo.setName("coveredBy");
			// assign attribute combo__covered__sysLine
			combo__covered__sysLine.setName("covered");
			// assign attribute sysLine__coveredBy__operand
			sysLine__coveredBy__operand.setName("coveredBy");
			// assign attribute operand__covered__sysLine
			operand__covered__sysLine.setName("covered");
			// assign attribute combo__enclosingInteraction__interaction
			combo__enclosingInteraction__interaction
					.setName("enclosingInteraction");
			// assign attribute interaction__fragment__combo
			interaction__fragment__combo.setName("fragment");
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
			// assign attribute __step_stepAlternative_alt
			__step_stepAlternative_alt.setName("stepAlternative");
			// assign attribute __step_actor_actor
			__step_actor_actor.setName("actor");
			// assign attribute __alt_ref_altFlow
			__alt_ref_altFlow.setName("ref");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__enclosingInteraction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__sysLine, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sysLine__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			sysLine__coveredBy__messageSend.setSrc(sysLine);

			// create link
			operand__covered__sysLine.setTrg(sysLine);

			// create link
			messageSend__covered__sysLine.setTrg(sysLine);

			// create link
			sysLine__coveredBy__operand.setSrc(sysLine);

			// create link
			combo__covered__sysLine.setTrg(sysLine);

			// create link
			sysLine__coveredBy__combo.setSrc(sysLine);

			// create link
			messageSend__enclosingInteraction__interaction.setSrc(messageSend);

			// create link
			sysLine__coveredBy__messageSend.setTrg(messageSend);

			// create link
			messageSend__covered__sysLine.setSrc(messageSend);

			// create link
			interaction__fragment__messageSend.setTrg(messageSend);

			// create link
			interaction__fragment__combo.setTrg(combo);

			// create link
			combo__covered__sysLine.setSrc(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			sysLine__coveredBy__combo.setTrg(combo);

			// create link
			combo__enclosingInteraction__interaction.setSrc(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			operand__covered__sysLine.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			sysLine__coveredBy__operand.setTrg(operand);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			combo__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			messageSend__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__messageSend.setSrc(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			interaction__fragment__combo.setSrc(interaction);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setSrc(messageReceive);

			// create link
			interaction__fragment__messageReceive.setTrg(messageReceive);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			__step_stepAlternative_alt.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			__alt_ref_altFlow.setSrc(alt);

			// create link
			__step_stepAlternative_alt.setTrg(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			combo__covered__line.setTrg(line);

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
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, packageDeclaration, actor,
				sysActor, sysLine, sysActorToSysLine, messageSend, combo,
				operand, interaction, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, actorToLine, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand);
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
		BasicFlow flow = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		Actor sysActor = null;
		UseCase useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __actorToLine_source_actor = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
		CSP csp = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterSysActorToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		Iterator fujaba__IterFlowToFlowToInteraction = null;
		FlowToInteractionFragment flowToInteraction = null;
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
			ruleresult.setRule("AltUserStepBFToComboRule");

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

					// iterate to-many link source from flow to flowToInteraction
					fujaba__Success = false;

					fujaba__IterFlowToFlowToInteraction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(flow,
											FlowToInteractionFragment.class,
											"source")).iterator();

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
												// check object alt is really bound
												JavaSDM.ensure(alt != null);
												// check object altFlow is really bound
												JavaSDM.ensure(altFlow != null);
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

												// check link ref from alt to altFlow
												JavaSDM.ensure(altFlow
														.equals(alt.getRef()));

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

												// check link stepAlternative from alt to step
												JavaSDM.ensure(step.equals(alt
														.eContainer()));

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

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_actor_actor
												__step_actor_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
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

												// create object __actorToLine_target_line
												__actorToLine_target_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_stepAlternative_alt
												__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __alt_ref_altFlow
												__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
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
												// assign attribute __line_interaction_interaction
												__line_interaction_interaction
														.setName("interaction");
												// assign attribute __interaction_lifeline_line
												__interaction_lifeline_line
														.setName("lifeline");
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
												// assign attribute __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase
														.setName("useCases");
												// assign attribute __actorToLine_source_actor
												__actorToLine_source_actor
														.setName("source");
												// assign attribute __actorToLine_target_line
												__actorToLine_target_line
														.setName("target");
												// assign attribute __step_stepAlternative_alt
												__step_stepAlternative_alt
														.setName("stepAlternative");
												// assign attribute __step_actor_actor
												__step_actor_actor
														.setName("actor");
												// assign attribute __alt_ref_altFlow
												__alt_ref_altFlow
														.setName("ref");

												// create link
												__packageDeclaration_actors_actor
														.setSrc(packageDeclaration);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(packageDeclaration);

												// create link
												__packageDeclaration_actors_sysActor
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_useCases_useCase
														.setSrc(packageDeclaration);

												// create link
												__actorToLine_source_actor
														.setTrg(actor);

												// create link
												__packageDeclaration_actors_actor
														.setTrg(actor);

												// create link
												__step_actor_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

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
												__sysActorToSysLine_target_sysLine
														.setTrg(sysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

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
												__flowToInteraction_target_interaction
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
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

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
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												__flowToInteraction_source_flow
														.setTrg(flow);

												// create link
												__flow_steps_step.setSrc(flow);

												// create link
												__useCase_flows_flow
														.setSrc(useCase);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCase);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

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
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actorToLine);

												// create link
												__actorToLine_source_actor
														.setSrc(actorToLine);

												// create link
												__actorToLine_target_line
														.setSrc(actorToLine);

												// create link
												__step_stepAlternative_alt
														.setSrc(step);

												// create link
												__flow_steps_step.setTrg(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(step);

												// create link
												__step_actor_actor.setSrc(step);

												// create link
												__step_stepAlternative_alt
														.setTrg(alt);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(alt);

												// create link
												__alt_ref_altFlow.setSrc(alt);

												// create link
												__line_interaction_interaction
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
												isApplicableMatch
														.getAllContextElements()
														.add(altFlow);

												// create link
												__alt_ref_altFlow
														.setTrg(altFlow);

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
																__step_actor_actor,
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
																__flowToInteraction_source_flow,
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
																__packageDeclaration_actors_sysActor,
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
																__step_stepAlternative_alt,
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
																__flowToInteraction_target_interaction,
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
																	actor,
																	sysActor,
																	sysLine,
																	sysActorToSysLine,
																	interaction,
																	flowToInteraction,
																	flow,
																	useCase,
																	useCaseToInteraction,
																	actorToLine,
																	step, alt,
																	line,
																	altFlow));

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
																.setRuleName("AltUserStepBFToComboRule");
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
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("actor", actor);
		match.registerObject("sysActor", sysActor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
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
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {
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

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("altFlow", altFlow);
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
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);

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
	public boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
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
			// check object messageReceive is really bound
			JavaSDM.ensure(messageReceive != null);
			// check object messageSend is really bound
			JavaSDM.ensure(messageSend != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
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
					messageSend, combo, operand, interaction, messageReceive,
					line, guard, spec));

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
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// check object messageSend is really bound
				JavaSDM.ensure(messageSend != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __interaction_fragment_combo
				__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_sysLine
				__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_enclosingInteraction_interaction
				__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_sysLine
				__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_operand
				__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_combo
				__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageSend
				__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_sysLine
				__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __sysLine_coveredBy_messageSend
				__sysLine_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_sysLine
				__messageSend_covered_sysLine.setName("covered");
				// assign attribute __sysLine_coveredBy_combo
				__sysLine_coveredBy_combo.setName("coveredBy");
				// assign attribute __combo_covered_sysLine
				__combo_covered_sysLine.setName("covered");
				// assign attribute __sysLine_coveredBy_operand
				__sysLine_coveredBy_operand.setName("coveredBy");
				// assign attribute __operand_covered_sysLine
				__operand_covered_sysLine.setName("covered");
				// assign attribute __combo_enclosingInteraction_interaction
				__combo_enclosingInteraction_interaction
						.setName("enclosingInteraction");
				// assign attribute __interaction_fragment_combo
				__interaction_fragment_combo.setName("fragment");
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

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_sysLine, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sysLine_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				__sysLine_coveredBy_combo.setSrc(sysLine);

				// create link
				__operand_covered_sysLine.setTrg(sysLine);

				// create link
				__sysLine_coveredBy_messageSend.setSrc(sysLine);

				// create link
				__sysLine_coveredBy_operand.setSrc(sysLine);

				// create link
				__combo_covered_sysLine.setTrg(sysLine);

				// create link
				__messageSend_covered_sysLine.setTrg(sysLine);

				// create link
				__interaction_fragment_messageSend.setTrg(messageSend);

				// create link
				__messageSend_covered_sysLine.setSrc(messageSend);

				// create link
				__sysLine_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setSrc(messageSend);

				// create link
				__interaction_fragment_combo.setTrg(combo);

				// create link
				__combo_enclosingInteraction_interaction.setSrc(combo);

				// create link
				__combo_covered_sysLine.setSrc(combo);

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__sysLine_coveredBy_combo.setTrg(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__operand_guard_guard.setSrc(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__operand_covered_sysLine.setSrc(operand);

				// create link
				__sysLine_coveredBy_operand.setTrg(operand);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_fragment_combo.setSrc(interaction);

				// create link
				__interaction_fragment_messageSend.setSrc(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__combo_enclosingInteraction_interaction.setTrg(interaction);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__guard_specification_spec.setSrc(guard);

				// create link
				__operand_guard_guard.setTrg(guard);

				// create link
				__guard_specification_spec.setTrg(spec);

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
				// check object messageReceive is really bound
				JavaSDM.ensure(messageReceive != null);
				// check object messageSend is really bound
				JavaSDM.ensure(messageSend != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check object sysLine is really bound
				JavaSDM.ensure(sysLine != null);
				// check isomorphic binding between objects sysLine and line 
				JavaSDM.ensure(!sysLine.equals(line));

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
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sysLine, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

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
			this.registerObjectsToMatch_BWD(match, sysLine, messageSend, combo,
					operand, interaction, messageReceive, line, guard, spec);
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
		BasicFlow flow = null;
		FlowToInteractionFragment flowToInteraction = null;
		InteractionConstraint guard = null;
		Interaction interaction = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		PackageDeclaration packageDeclaration = null;
		LiteralString spec = null;
		Actor sysActor = null;
		ActorToLifeline sysActorToSysLine = null;
		Lifeline sysLine = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		NormalStepToCombinedFragment stepToCombo = null;
		FlowToInteractionFragment altFlowToOperand = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge step__stepAlternative__alt = null;
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
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToInteraction"));

			// ensure correct type and really bound of object flowToInteraction
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToInteraction = (FlowToInteractionFragment) _TmpObject;
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

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object altFlow
			altFlow = UseCaseDSLFactory.eINSTANCE.createAlternativeFlow();

			// assign attribute alt
			alt.setCondition((java.lang.String) csp
					.getValue("alt", "condition"));
			// assign attribute altFlow
			altFlow.setName((java.lang.String) csp.getValue("altFlow", "name"));

			// create link
			step.setActor(actor);

			// create link
			stepToCombo.setTarget(combo);

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			alternative1ToOperand.setTarget(operand);

			// create link
			flow.getSteps().add(step); // add link

			// create link
			step.getStepAlternative().add(alt); // add link

			// create link
			stepToCombo.setSource(step);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt, altFlow,
					"ref");

			// create link
			alternative1ToOperand.setSource(alt);

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
			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "createdElements");
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
			// check object flowToInteraction is really bound
			JavaSDM.ensure(flowToInteraction != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
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

			// check isomorphic binding between objects flowToInteraction and actor 
			JavaSDM.ensure(!flowToInteraction.equals(actor));

			// check isomorphic binding between objects guard and actor 
			JavaSDM.ensure(!guard.equals(actor));

			// check isomorphic binding between objects interaction and actor 
			JavaSDM.ensure(!interaction.equals(actor));

			// check isomorphic binding between objects line and actor 
			JavaSDM.ensure(!line.equals(actor));

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

			// check isomorphic binding between objects flowToInteraction and actorToLine 
			JavaSDM.ensure(!flowToInteraction.equals(actorToLine));

			// check isomorphic binding between objects guard and actorToLine 
			JavaSDM.ensure(!guard.equals(actorToLine));

			// check isomorphic binding between objects interaction and actorToLine 
			JavaSDM.ensure(!interaction.equals(actorToLine));

			// check isomorphic binding between objects line and actorToLine 
			JavaSDM.ensure(!line.equals(actorToLine));

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

			// check isomorphic binding between objects flowToInteraction and alt 
			JavaSDM.ensure(!flowToInteraction.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects interaction and alt 
			JavaSDM.ensure(!interaction.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

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

			// check isomorphic binding between objects sysActor and alt 
			JavaSDM.ensure(!sysActor.equals(alt));

			// check isomorphic binding between objects sysActorToSysLine and alt 
			JavaSDM.ensure(!sysActorToSysLine.equals(alt));

			// check isomorphic binding between objects sysLine and alt 
			JavaSDM.ensure(!sysLine.equals(alt));

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

			// check isomorphic binding between objects flowToInteraction and altFlow 
			JavaSDM.ensure(!flowToInteraction.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects interaction and altFlow 
			JavaSDM.ensure(!interaction.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

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

			// check isomorphic binding between objects sysActor and altFlow 
			JavaSDM.ensure(!sysActor.equals(altFlow));

			// check isomorphic binding between objects sysActorToSysLine and altFlow 
			JavaSDM.ensure(!sysActorToSysLine.equals(altFlow));

			// check isomorphic binding between objects sysLine and altFlow 
			JavaSDM.ensure(!sysLine.equals(altFlow));

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

			// check isomorphic binding between objects flowToInteraction and altFlowToOperand 
			JavaSDM.ensure(!flowToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects guard and altFlowToOperand 
			JavaSDM.ensure(!guard.equals(altFlowToOperand));

			// check isomorphic binding between objects interaction and altFlowToOperand 
			JavaSDM.ensure(!interaction.equals(altFlowToOperand));

			// check isomorphic binding between objects line and altFlowToOperand 
			JavaSDM.ensure(!line.equals(altFlowToOperand));

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

			// check isomorphic binding between objects sysActor and altFlowToOperand 
			JavaSDM.ensure(!sysActor.equals(altFlowToOperand));

			// check isomorphic binding between objects sysActorToSysLine and altFlowToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(altFlowToOperand));

			// check isomorphic binding between objects sysLine and altFlowToOperand 
			JavaSDM.ensure(!sysLine.equals(altFlowToOperand));

			// check isomorphic binding between objects useCase and altFlowToOperand 
			JavaSDM.ensure(!useCase.equals(altFlowToOperand));

			// check isomorphic binding between objects useCaseToInteraction and altFlowToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(altFlowToOperand));

			// check isomorphic binding between objects combo and alternative1ToOperand 
			JavaSDM.ensure(!combo.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and alternative1ToOperand 
			JavaSDM.ensure(!flow.equals(alternative1ToOperand));

			// check isomorphic binding between objects flowToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!flowToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects guard and alternative1ToOperand 
			JavaSDM.ensure(!guard.equals(alternative1ToOperand));

			// check isomorphic binding between objects interaction and alternative1ToOperand 
			JavaSDM.ensure(!interaction.equals(alternative1ToOperand));

			// check isomorphic binding between objects line and alternative1ToOperand 
			JavaSDM.ensure(!line.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects sysActor and alternative1ToOperand 
			JavaSDM.ensure(!sysActor.equals(alternative1ToOperand));

			// check isomorphic binding between objects sysActorToSysLine and alternative1ToOperand 
			JavaSDM.ensure(!sysActorToSysLine.equals(alternative1ToOperand));

			// check isomorphic binding between objects sysLine and alternative1ToOperand 
			JavaSDM.ensure(!sysLine.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCase and alternative1ToOperand 
			JavaSDM.ensure(!useCase.equals(alternative1ToOperand));

			// check isomorphic binding between objects useCaseToInteraction and alternative1ToOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(alternative1ToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects flowToInteraction and combo 
			JavaSDM.ensure(!flowToInteraction.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects interaction and combo 
			JavaSDM.ensure(!interaction.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

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

			// check isomorphic binding between objects flowToInteraction and flow 
			JavaSDM.ensure(!flowToInteraction.equals(flow));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

			// check isomorphic binding between objects interaction and flow 
			JavaSDM.ensure(!interaction.equals(flow));

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

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

			// check isomorphic binding between objects guard and flowToInteraction 
			JavaSDM.ensure(!guard.equals(flowToInteraction));

			// check isomorphic binding between objects interaction and flowToInteraction 
			JavaSDM.ensure(!interaction.equals(flowToInteraction));

			// check isomorphic binding between objects line and flowToInteraction 
			JavaSDM.ensure(!line.equals(flowToInteraction));

			// check isomorphic binding between objects messageReceive and flowToInteraction 
			JavaSDM.ensure(!messageReceive.equals(flowToInteraction));

			// check isomorphic binding between objects messageSend and flowToInteraction 
			JavaSDM.ensure(!messageSend.equals(flowToInteraction));

			// check isomorphic binding between objects operand and flowToInteraction 
			JavaSDM.ensure(!operand.equals(flowToInteraction));

			// check isomorphic binding between objects packageDeclaration and flowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(flowToInteraction));

			// check isomorphic binding between objects spec and flowToInteraction 
			JavaSDM.ensure(!spec.equals(flowToInteraction));

			// check isomorphic binding between objects step and flowToInteraction 
			JavaSDM.ensure(!step.equals(flowToInteraction));

			// check isomorphic binding between objects stepToCombo and flowToInteraction 
			JavaSDM.ensure(!stepToCombo.equals(flowToInteraction));

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

			// check isomorphic binding between objects interaction and guard 
			JavaSDM.ensure(!interaction.equals(guard));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

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

			// check isomorphic binding between objects sysActor and guard 
			JavaSDM.ensure(!sysActor.equals(guard));

			// check isomorphic binding between objects sysActorToSysLine and guard 
			JavaSDM.ensure(!sysActorToSysLine.equals(guard));

			// check isomorphic binding between objects sysLine and guard 
			JavaSDM.ensure(!sysLine.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects useCaseToInteraction and guard 
			JavaSDM.ensure(!useCaseToInteraction.equals(guard));

			// check isomorphic binding between objects line and interaction 
			JavaSDM.ensure(!line.equals(interaction));

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

			// check isomorphic binding between objects spec and messageSend 
			JavaSDM.ensure(!spec.equals(messageSend));

			// check isomorphic binding between objects step and messageSend 
			JavaSDM.ensure(!step.equals(messageSend));

			// check isomorphic binding between objects stepToCombo and messageSend 
			JavaSDM.ensure(!stepToCombo.equals(messageSend));

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

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

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

			// check isomorphic binding between objects spec and packageDeclaration 
			JavaSDM.ensure(!spec.equals(packageDeclaration));

			// check isomorphic binding between objects step and packageDeclaration 
			JavaSDM.ensure(!step.equals(packageDeclaration));

			// check isomorphic binding between objects stepToCombo and packageDeclaration 
			JavaSDM.ensure(!stepToCombo.equals(packageDeclaration));

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

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects sysActor and spec 
			JavaSDM.ensure(!sysActor.equals(spec));

			// check isomorphic binding between objects sysActorToSysLine and spec 
			JavaSDM.ensure(!sysActorToSysLine.equals(spec));

			// check isomorphic binding between objects sysLine and spec 
			JavaSDM.ensure(!sysLine.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

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

			// check isomorphic binding between objects sysActor and stepToCombo 
			JavaSDM.ensure(!sysActor.equals(stepToCombo));

			// check isomorphic binding between objects sysActorToSysLine and stepToCombo 
			JavaSDM.ensure(!sysActorToSysLine.equals(stepToCombo));

			// check isomorphic binding between objects sysLine and stepToCombo 
			JavaSDM.ensure(!sysLine.equals(stepToCombo));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

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

			// create object __sysLine_coveredBy_operand
			__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_combo
			__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_sysLine
			__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_enclosingInteraction_interaction
			__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageSend
			__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_sysLine
			__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sysLine_coveredBy_combo
			__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_enclosingInteraction_interaction
			__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_sysLine
			__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltUserStepBFToComboRule");
			// assign attribute __sysLine_coveredBy_messageSend
			__sysLine_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_sysLine
			__messageSend_covered_sysLine.setName("covered");
			// assign attribute __sysLine_coveredBy_combo
			__sysLine_coveredBy_combo.setName("coveredBy");
			// assign attribute __combo_covered_sysLine
			__combo_covered_sysLine.setName("covered");
			// assign attribute __sysLine_coveredBy_operand
			__sysLine_coveredBy_operand.setName("coveredBy");
			// assign attribute __operand_covered_sysLine
			__operand_covered_sysLine.setName("covered");
			// assign attribute __combo_enclosingInteraction_interaction
			__combo_enclosingInteraction_interaction
					.setName("enclosingInteraction");
			// assign attribute __interaction_fragment_combo
			__interaction_fragment_combo.setName("fragment");
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
			// assign attribute step__stepAlternative__alt
			step__stepAlternative__alt.setName("stepAlternative");
			// assign attribute step__actor__actor
			step__actor__actor.setName("actor");
			// assign attribute alt__ref__altFlow
			alt__ref__altFlow.setName("ref");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__combo_enclosingInteraction_interaction,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sysLine_coveredBy_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_sysLine, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__operand_covered_sysLine.setTrg(sysLine);

			// create link
			__messageSend_covered_sysLine.setTrg(sysLine);

			// create link
			__sysLine_coveredBy_messageSend.setSrc(sysLine);

			// create link
			__sysLine_coveredBy_operand.setSrc(sysLine);

			// create link
			__sysLine_coveredBy_combo.setSrc(sysLine);

			// create link
			__combo_covered_sysLine.setTrg(sysLine);

			// create link
			__messageSend_enclosingInteraction_interaction.setSrc(messageSend);

			// create link
			__sysLine_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__messageSend_covered_sysLine.setSrc(messageSend);

			// create link
			__interaction_fragment_messageSend.setTrg(messageSend);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			__sysLine_coveredBy_combo.setTrg(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			__combo_enclosingInteraction_interaction.setSrc(combo);

			// create link
			__interaction_fragment_combo.setTrg(combo);

			// create link
			__combo_covered_sysLine.setSrc(combo);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			__operand_covered_sysLine.setSrc(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			__sysLine_coveredBy_operand.setTrg(operand);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__interaction_fragment_messageSend.setSrc(interaction);

			// create link
			__messageSend_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__combo_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_combo.setSrc(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

			// create link
			__operand_guard_guard.setTrg(guard);

			// create link
			__guard_specification_spec.setSrc(guard);

			// create link
			__guard_specification_spec.setTrg(spec);

			// create link
			altFlowToOperand__source__altFlow.setTrg(altFlow);

			// create link
			alt__ref__altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, packageDeclaration, actor,
				sysActor, sysLine, sysActorToSysLine, messageSend, combo,
				operand, interaction, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, actorToLine, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand);
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
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		Lifeline sysLine = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_actors_sysActor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __actorToLine_source_actor = null;
		EMoflonEdge __sysActorToSysLine_source_sysActor = null;
		EMoflonEdge __sysLine_coveredBy_combo = null;
		EMoflonEdge __sysLine_coveredBy_messageSend = null;
		EMoflonEdge __sysLine_coveredBy_operand = null;
		EMoflonEdge __operand_covered_sysLine = null;
		EMoflonEdge __combo_covered_sysLine = null;
		EMoflonEdge __messageSend_covered_sysLine = null;
		EMoflonEdge __sysActorToSysLine_target_sysLine = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __actorToLine_target_line = null;
		EMoflonEdge __guard_specification_spec = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterInteractionToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Actor sysActor = null;
		Iterator fujaba__IterSysLineToSysActorToSysLine = null;
		ActorToLifeline sysActorToSysLine = null;
		BasicFlow flow = null;
		Iterator fujaba__IterInteractionToFlowToInteraction = null;
		FlowToInteractionFragment flowToInteraction = null;
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
			ruleresult.setRule("AltUserStepBFToComboRule");

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

					// iterate to-many link target from interaction to flowToInteraction
					fujaba__Success = false;

					fujaba__IterInteractionToFlowToInteraction = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(interaction,
											FlowToInteractionFragment.class,
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
												// check object flowToInteraction is really bound
												JavaSDM.ensure(flowToInteraction != null);
												// check object guard is really bound
												JavaSDM.ensure(guard != null);
												// check object interaction is really bound
												JavaSDM.ensure(interaction != null);
												// check object line is really bound
												JavaSDM.ensure(line != null);
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
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

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// bind object
												packageDeclaration = sysActor
														.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) sysActor
														.eContainer() : null;

												// check object packageDeclaration is really bound
												JavaSDM.ensure(packageDeclaration != null);

												// check if contained via correct reference
												JavaSDM.ensure(packageDeclaration
														.getActors().contains(
																sysActor));

												// check link actors from actor to packageDeclaration
												JavaSDM.ensure(packageDeclaration
														.equals(actor
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

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
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

												// create object __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_actor
												__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __packageDeclaration_actors_sysActor
												__packageDeclaration_actors_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __actorToLine_source_actor
												__actorToLine_source_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_combo
												__sysLine_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_messageSend
												__sysLine_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysLine_coveredBy_operand
												__sysLine_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_covered_sysLine
												__operand_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_covered_sysLine
												__combo_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_covered_sysLine
												__messageSend_covered_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageSend_enclosingInteraction_interaction
												__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_fragment_messageSend
												__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_fragment_combo
												__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_enclosingInteraction_interaction
												__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_coveredBy_combo
												__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __combo_covered_line
												__combo_covered_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_coveredBy_operand
												__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_covered_line
												__operand_covered_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __operand_guard_guard
												__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __line_interaction_interaction
												__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_lifeline_line
												__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowToInteraction_target_interaction
												__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __interaction_fragment_messageReceive
												__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __messageReceive_enclosingInteraction_interaction
												__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
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

												// create object __guard_specification_spec
												__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
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
												// assign attribute __sysLine_coveredBy_combo
												__sysLine_coveredBy_combo
														.setName("coveredBy");
												// assign attribute __combo_covered_sysLine
												__combo_covered_sysLine
														.setName("covered");
												// assign attribute __sysLine_coveredBy_operand
												__sysLine_coveredBy_operand
														.setName("coveredBy");
												// assign attribute __operand_covered_sysLine
												__operand_covered_sysLine
														.setName("covered");
												// assign attribute __sysActorToSysLine_source_sysActor
												__sysActorToSysLine_source_sysActor
														.setName("source");
												// assign attribute __sysActorToSysLine_target_sysLine
												__sysActorToSysLine_target_sysLine
														.setName("target");
												// assign attribute __combo_enclosingInteraction_interaction
												__combo_enclosingInteraction_interaction
														.setName("enclosingInteraction");
												// assign attribute __interaction_fragment_combo
												__interaction_fragment_combo
														.setName("fragment");
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
												// assign attribute __line_interaction_interaction
												__line_interaction_interaction
														.setName("interaction");
												// assign attribute __interaction_lifeline_line
												__interaction_lifeline_line
														.setName("lifeline");
												// assign attribute __useCase_flows_flow
												__useCase_flows_flow
														.setName("flows");
												// assign attribute __useCaseToInteraction_source_useCase
												__useCaseToInteraction_source_useCase
														.setName("source");
												// assign attribute __useCaseToInteraction_target_interaction
												__useCaseToInteraction_target_interaction
														.setName("target");
												// assign attribute __packageDeclaration_useCases_useCase
												__packageDeclaration_useCases_useCase
														.setName("useCases");
												// assign attribute __actorToLine_source_actor
												__actorToLine_source_actor
														.setName("source");
												// assign attribute __actorToLine_target_line
												__actorToLine_target_line
														.setName("target");
												// assign attribute __line_coveredBy_combo
												__line_coveredBy_combo
														.setName("coveredBy");
												// assign attribute __combo_covered_line
												__combo_covered_line
														.setName("covered");
												// assign attribute __line_coveredBy_operand
												__line_coveredBy_operand
														.setName("coveredBy");
												// assign attribute __operand_covered_line
												__operand_covered_line
														.setName("covered");
												// assign attribute __operand_guard_guard
												__operand_guard_guard
														.setName("guard");
												// assign attribute __guard_specification_spec
												__guard_specification_spec
														.setName("specification");

												// create link
												__packageDeclaration_useCases_useCase
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_actor
														.setSrc(packageDeclaration);

												// create link
												__packageDeclaration_actors_sysActor
														.setSrc(packageDeclaration);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(packageDeclaration);

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
												__sysLine_coveredBy_combo
														.setSrc(sysLine);

												// create link
												__sysLine_coveredBy_messageSend
														.setSrc(sysLine);

												// create link
												__sysLine_coveredBy_operand
														.setSrc(sysLine);

												// create link
												__operand_covered_sysLine
														.setTrg(sysLine);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(sysLine);

												// create link
												__combo_covered_sysLine
														.setTrg(sysLine);

												// create link
												__messageSend_covered_sysLine
														.setTrg(sysLine);

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
												__messageSend_enclosingInteraction_interaction
														.setSrc(messageSend);

												// create link
												__sysLine_coveredBy_messageSend
														.setTrg(messageSend);

												// create link
												__messageSend_covered_sysLine
														.setSrc(messageSend);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageSend);

												// create link
												__interaction_fragment_messageSend
														.setTrg(messageSend);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(combo);

												// create link
												__sysLine_coveredBy_combo
														.setTrg(combo);

												// create link
												__interaction_fragment_combo
														.setTrg(combo);

												// create link
												__combo_covered_sysLine
														.setSrc(combo);

												// create link
												__combo_enclosingInteraction_interaction
														.setSrc(combo);

												// create link
												__line_coveredBy_combo
														.setTrg(combo);

												// create link
												__combo_covered_line
														.setSrc(combo);

												// create link
												__sysLine_coveredBy_operand
														.setTrg(operand);

												// create link
												__line_coveredBy_operand
														.setTrg(operand);

												// create link
												__operand_covered_sysLine
														.setSrc(operand);

												// create link
												__operand_covered_line
														.setSrc(operand);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(operand);

												// create link
												__operand_guard_guard
														.setSrc(operand);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(interaction);

												// create link
												__line_interaction_interaction
														.setTrg(interaction);

												// create link
												__messageSend_enclosingInteraction_interaction
														.setTrg(interaction);

												// create link
												__useCaseToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__interaction_fragment_combo
														.setSrc(interaction);

												// create link
												__interaction_lifeline_line
														.setSrc(interaction);

												// create link
												__flowToInteraction_target_interaction
														.setTrg(interaction);

												// create link
												__interaction_fragment_messageReceive
														.setSrc(interaction);

												// create link
												__messageReceive_enclosingInteraction_interaction
														.setTrg(interaction);

												// create link
												__combo_enclosingInteraction_interaction
														.setTrg(interaction);

												// create link
												__interaction_fragment_messageSend
														.setSrc(interaction);

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
												__messageReceive_enclosingInteraction_interaction
														.setSrc(messageReceive);

												// create link
												__interaction_fragment_messageReceive
														.setTrg(messageReceive);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(messageReceive);

												// create link
												__useCase_flows_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__flowToInteraction_source_flow
														.setTrg(flow);

												// create link
												__packageDeclaration_useCases_useCase
														.setTrg(useCase);

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
												__useCaseToInteraction_source_useCase
														.setSrc(useCaseToInteraction);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(useCaseToInteraction);

												// create link
												__useCaseToInteraction_target_interaction
														.setSrc(useCaseToInteraction);

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
												__combo_covered_line
														.setTrg(line);

												// create link
												__line_coveredBy_combo
														.setSrc(line);

												// create link
												__line_interaction_interaction
														.setSrc(line);

												// create link
												__operand_covered_line
														.setTrg(line);

												// create link
												__interaction_lifeline_line
														.setTrg(line);

												// create link
												__actorToLine_target_line
														.setTrg(line);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(line);

												// create link
												__line_coveredBy_operand
														.setSrc(line);

												// create link
												__operand_guard_guard
														.setTrg(guard);

												// create link
												__guard_specification_spec
														.setSrc(guard);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(guard);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(spec);

												// create link
												__guard_specification_spec
														.setTrg(spec);

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
																__messageReceive_enclosingInteraction_interaction,
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
																__sysLine_coveredBy_combo,
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
																__combo_covered_sysLine,
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
																__operand_covered_sysLine,
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
																__sysActorToSysLine_source_sysActor,
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
																__useCaseToInteraction_source_useCase,
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
																__sysActorToSysLine_target_sysLine,
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
																__interaction_fragment_combo,
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
																__line_interaction_interaction,
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
																__messageSend_enclosingInteraction_interaction,
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
																__sysLine_coveredBy_operand,
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
																__combo_enclosingInteraction_interaction,
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
																__guard_specification_spec,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_BWD(
																	isApplicableMatch,
																	packageDeclaration,
																	actor,
																	sysActor,
																	sysLine,
																	sysActorToSysLine,
																	messageSend,
																	combo,
																	operand,
																	interaction,
																	flowToInteraction,
																	messageReceive,
																	flow,
																	useCase,
																	useCaseToInteraction,
																	actorToLine,
																	line,
																	guard, spec));

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
																.setRuleName("AltUserStepBFToComboRule");
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
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
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
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
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
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", true, csp);
		var_guard_name.setValue(guard.getName());
		var_guard_name.setType("");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("guard", guard);
		isApplicableMatch.registerObject("spec", spec);
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
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);

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
				&& match.getObject("combo")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getCombinedFragment())
				&& match.getObject("operand")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionOperand())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("guard")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionConstraint())
				&& match.getObject("spec")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getLiteralString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_424(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_518963 = null;
		InteractionOperand __DEC_messageReceive_fragment_657675 = null;
		InteractionOperand __DEC_messageSend_fragment_570565 = null;
		Interaction __DEC_operand_enclosingInteraction_77819 = null;
		InteractionOperand __DEC_operand_fragment_855578 = null;
		InteractionOperand __DEC_guard_guard_156513 = null;
		CombinedFragment __DEC_operand_operand_203073 = null;
		Constraint __DEC_spec_specification_627138 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
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

			// check link coveredBy from messageSend to sysLine
			JavaSDM.ensure(messageSend.getCovered().contains(sysLine));

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
					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

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
							// bind object
							guard = operand.getGuard();

							// check object guard is really bound
							JavaSDM.ensure(guard != null);

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

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

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link message from messageReceive
												JavaSDM.ensure(messageReceive
														.getMessage() == null);
												// negative check for link message from messageSend
												JavaSDM.ensure(messageSend
														.getMessage() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_518963 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_518963 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_518963 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_518963 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_518963
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
													__DEC_messageReceive_fragment_657675 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_657675 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_657675 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_657675 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_657675
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
													__DEC_messageSend_fragment_570565 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_570565 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_570565 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_570565 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_570565
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
													__DEC_operand_enclosingInteraction_77819 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_77819 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_77819 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_77819 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_77819
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_855578 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_855578 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_855578 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_855578 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_855578
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
													__DEC_guard_guard_156513 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_156513 is really bound
													JavaSDM.ensure(__DEC_guard_guard_156513 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_156513
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_156513 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_156513
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
													__DEC_operand_operand_203073 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_203073 is really bound
													JavaSDM.ensure(__DEC_operand_operand_203073 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_203073
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_203073 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_203073
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
													__DEC_spec_specification_627138 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_627138 is really bound
													JavaSDM.ensure(__DEC_spec_specification_627138 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_627138
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_627138 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_627138
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link receiveEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link receiveEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link sendEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"sendEvent")
														.size() == 0);
												// negative check for link sendEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"sendEvent")
														.size() == 0);
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
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

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

												// check link operand from operand to combo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(combo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_coveredBy to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_coveredBy to messageSend
												JavaSDM.ensure(messageSend
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
																combo, operand,
																interaction,
																messageReceive,
																line, guard,
																spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_425(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_880173 = null;
		InteractionOperand __DEC_messageReceive_fragment_52682 = null;
		InteractionOperand __DEC_messageSend_fragment_528894 = null;
		Interaction __DEC_operand_enclosingInteraction_882970 = null;
		InteractionOperand __DEC_operand_fragment_212980 = null;
		InteractionOperand __DEC_guard_guard_529272 = null;
		CombinedFragment __DEC_operand_operand_262475 = null;
		Constraint __DEC_spec_specification_69366 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Lifeline sysLine = null;
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
					// bind object
					guard = operand.getGuard();

					// check object guard is really bound
					JavaSDM.ensure(guard != null);

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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
							// bind object
							interaction = combo.getEnclosingInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

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

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// iterate to-many link src from sysLine to _edge_coveredBy
											fujaba__Success = false;

											fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	sysLine,
																	EMoflonEdge.class,
																	"src"))
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
															.equals(_edge_coveredBy
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_880173 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_880173 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_880173 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_880173 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_880173
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
															__DEC_messageReceive_fragment_52682 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_52682 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_52682 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_52682 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_52682
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
															__DEC_messageSend_fragment_528894 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_528894 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_528894 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_528894 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_528894
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
															__DEC_operand_enclosingInteraction_882970 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_882970 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_882970 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_882970 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_882970
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_212980 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_212980 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_212980 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_212980 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_212980
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
															__DEC_guard_guard_529272 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_529272 is really bound
															JavaSDM.ensure(__DEC_guard_guard_529272 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_529272
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_529272 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_529272
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
															__DEC_operand_operand_262475 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_262475 is really bound
															JavaSDM.ensure(__DEC_operand_operand_262475 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_262475
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_262475 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_262475
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
															__DEC_spec_specification_69366 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_69366 is really bound
															JavaSDM.ensure(__DEC_spec_specification_69366 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_69366
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_69366 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_69366
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
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

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_covered to messageSend
														JavaSDM.ensure(messageSend
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

														// check link trg from _edge_coveredBy to messageSend
														JavaSDM.ensure(messageSend
																.equals(_edge_coveredBy
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_426(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_945394 = null;
		InteractionOperand __DEC_messageReceive_fragment_143754 = null;
		InteractionOperand __DEC_messageSend_fragment_151496 = null;
		Interaction __DEC_operand_enclosingInteraction_102822 = null;
		InteractionOperand __DEC_operand_fragment_745084 = null;
		InteractionOperand __DEC_guard_guard_290569 = null;
		CombinedFragment __DEC_operand_operand_183097 = null;
		Constraint __DEC_spec_specification_38868 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
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
					_TmpObject = _edge_coveredBy.getTrg();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;

					// bind object
					interaction = combo.getEnclosingInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

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

							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

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
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link message from messageReceive
												JavaSDM.ensure(messageReceive
														.getMessage() == null);
												// negative check for link message from messageSend
												JavaSDM.ensure(messageSend
														.getMessage() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_945394 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_945394 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_945394 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_945394 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_945394
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
													__DEC_messageReceive_fragment_143754 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_143754 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_143754 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_143754 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_143754
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
													__DEC_messageSend_fragment_151496 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_151496 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_151496 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_151496 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_151496
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
													__DEC_operand_enclosingInteraction_102822 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_102822 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_102822 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_102822 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_102822
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_745084 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_745084 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_745084 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_745084 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_745084
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
													__DEC_guard_guard_290569 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_290569 is really bound
													JavaSDM.ensure(__DEC_guard_guard_290569 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_290569
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_290569 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_290569
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
													__DEC_operand_operand_183097 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_183097 is really bound
													JavaSDM.ensure(__DEC_operand_operand_183097 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_183097
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_183097 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_183097
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
													__DEC_spec_specification_38868 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_38868 is really bound
													JavaSDM.ensure(__DEC_spec_specification_38868 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_38868
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_38868 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_38868
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link receiveEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link receiveEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link sendEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"sendEvent")
														.size() == 0);
												// negative check for link sendEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"sendEvent")
														.size() == 0);
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
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

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

												// check link operand from operand to combo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(combo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
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
																combo, operand,
																interaction,
																messageReceive,
																line, guard,
																spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_427(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_894338 = null;
		InteractionOperand __DEC_messageReceive_fragment_111294 = null;
		InteractionOperand __DEC_messageSend_fragment_303620 = null;
		Interaction __DEC_operand_enclosingInteraction_435384 = null;
		InteractionOperand __DEC_operand_fragment_79720 = null;
		InteractionOperand __DEC_guard_guard_258588 = null;
		CombinedFragment __DEC_operand_operand_140429 = null;
		Constraint __DEC_spec_specification_927821 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
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
					// bind object
					guard = operand.getGuard();

					// check object guard is really bound
					JavaSDM.ensure(guard != null);

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
									interaction = messageSend
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from combo to interaction
									JavaSDM.ensure(interaction.equals(combo
											.getEnclosingInteraction()));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// iterate to-many link src from sysLine to _edge_coveredBy
											fujaba__Success = false;

											fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	sysLine,
																	EMoflonEdge.class,
																	"src"))
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

													// check link trg from _edge_coveredBy to combo
													JavaSDM.ensure(combo
															.equals(_edge_coveredBy
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_894338 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_894338 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_894338 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_894338 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_894338
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
															__DEC_messageReceive_fragment_111294 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_111294 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_111294 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_111294 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_111294
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
															__DEC_messageSend_fragment_303620 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_303620 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_303620 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_303620 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_303620
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
															__DEC_operand_enclosingInteraction_435384 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_435384 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_435384 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_435384 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_435384
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_79720 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_79720 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_79720 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_79720 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_79720
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
															__DEC_guard_guard_258588 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_258588 is really bound
															JavaSDM.ensure(__DEC_guard_guard_258588 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_258588
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_258588 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_258588
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
															__DEC_operand_operand_140429 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_140429 is really bound
															JavaSDM.ensure(__DEC_operand_operand_140429 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_140429
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_140429 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_140429
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
															__DEC_spec_specification_927821 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_927821 is really bound
															JavaSDM.ensure(__DEC_spec_specification_927821 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_927821
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_927821 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_927821
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
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

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_428(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_99074 = null;
		InteractionOperand __DEC_messageReceive_fragment_987414 = null;
		InteractionOperand __DEC_messageSend_fragment_916439 = null;
		Interaction __DEC_operand_enclosingInteraction_703250 = null;
		InteractionOperand __DEC_operand_fragment_543645 = null;
		InteractionOperand __DEC_guard_guard_552526 = null;
		CombinedFragment __DEC_operand_operand_827483 = null;
		Constraint __DEC_spec_specification_222974 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
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

			// bind object
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link coveredBy from operand to sysLine
			JavaSDM.ensure(operand.getCovered().contains(sysLine));

			// iterate to-many link coveredBy from operand to line
			fujaba__Success = false;

			fujaba__IterOperandToLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// check isomorphic binding between objects sysLine and line 
					JavaSDM.ensure(!sysLine.equals(line));

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
							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
									interaction = messageSend
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from combo to interaction
									JavaSDM.ensure(interaction.equals(combo
											.getEnclosingInteraction()));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link message from messageReceive
												JavaSDM.ensure(messageReceive
														.getMessage() == null);
												// negative check for link message from messageSend
												JavaSDM.ensure(messageSend
														.getMessage() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_99074 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_99074 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_99074 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_99074 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_99074
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
													__DEC_messageReceive_fragment_987414 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_987414 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_987414 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_987414 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_987414
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
													__DEC_messageSend_fragment_916439 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_916439 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_916439 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_916439 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_916439
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
													__DEC_operand_enclosingInteraction_703250 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_703250 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_703250 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_703250 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_703250
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_543645 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_543645 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_543645 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_543645 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_543645
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
													__DEC_guard_guard_552526 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_552526 is really bound
													JavaSDM.ensure(__DEC_guard_guard_552526 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_552526
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_552526 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_552526
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
													__DEC_operand_operand_827483 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_827483 is really bound
													JavaSDM.ensure(__DEC_operand_operand_827483 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_827483
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_827483 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_827483
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
													__DEC_spec_specification_222974 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_222974 is really bound
													JavaSDM.ensure(__DEC_spec_specification_222974 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_222974
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_222974 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_222974
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link receiveEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link receiveEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link sendEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"sendEvent")
														.size() == 0);
												// negative check for link sendEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"sendEvent")
														.size() == 0);
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
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

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

												// check link operand from operand to combo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(combo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_coveredBy to sysLine
												JavaSDM.ensure(sysLine
														.equals(_edge_coveredBy
																.getSrc()));

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
																combo, operand,
																interaction,
																messageReceive,
																line, guard,
																spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_429(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_928254 = null;
		InteractionOperand __DEC_messageReceive_fragment_621050 = null;
		InteractionOperand __DEC_messageSend_fragment_168968 = null;
		Interaction __DEC_operand_enclosingInteraction_125846 = null;
		InteractionOperand __DEC_operand_fragment_845436 = null;
		InteractionOperand __DEC_guard_guard_633150 = null;
		CombinedFragment __DEC_operand_operand_993888 = null;
		Constraint __DEC_spec_specification_534247 = null;
		Match match = null;
		Iterator fujaba__IterSysLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Lifeline sysLine = null;
		LiteralString spec = null;
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
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object sysLine
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			sysLine = (Lifeline) _TmpObject;

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
					interaction = messageSend.getEnclosingInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

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

							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

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
									// check link fragment from combo to interaction
									JavaSDM.ensure(interaction.equals(combo
											.getEnclosingInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// iterate to-many link src from sysLine to _edge_coveredBy
											fujaba__Success = false;

											fujaba__IterSysLineTo_edge_coveredBy = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	sysLine,
																	EMoflonEdge.class,
																	"src"))
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

													// check link trg from _edge_coveredBy to operand
													JavaSDM.ensure(operand
															.equals(_edge_coveredBy
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_928254 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_928254 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_928254 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_928254 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_928254
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
															__DEC_messageReceive_fragment_621050 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_621050 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_621050 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_621050 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_621050
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
															__DEC_messageSend_fragment_168968 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_168968 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_168968 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_168968 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_168968
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
															__DEC_operand_enclosingInteraction_125846 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_125846 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_125846 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_125846 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_125846
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_845436 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_845436 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_845436 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_845436 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_845436
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
															__DEC_guard_guard_633150 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_633150 is really bound
															JavaSDM.ensure(__DEC_guard_guard_633150 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_633150
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_633150 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_633150
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
															__DEC_operand_operand_993888 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_993888 is really bound
															JavaSDM.ensure(__DEC_operand_operand_993888 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_993888
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_993888 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_993888
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
															__DEC_spec_specification_534247 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_534247 is really bound
															JavaSDM.ensure(__DEC_spec_specification_534247 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_534247
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_534247 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_534247
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
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

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_430(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_149000 = null;
		InteractionOperand __DEC_messageReceive_fragment_584492 = null;
		InteractionOperand __DEC_messageSend_fragment_361386 = null;
		Interaction __DEC_operand_enclosingInteraction_345582 = null;
		InteractionOperand __DEC_operand_fragment_574792 = null;
		InteractionOperand __DEC_guard_guard_191009 = null;
		CombinedFragment __DEC_operand_operand_145137 = null;
		Constraint __DEC_spec_specification_689728 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterComboToLine = null;
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

			// check object _edge_enclosingInteraction is really bound
			JavaSDM.ensure(_edge_enclosingInteraction != null);
			// bind object
			_TmpObject = _edge_enclosingInteraction.getSrc();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// iterate to-many link coveredBy from combo to line
			fujaba__Success = false;

			fujaba__IterComboToLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterComboToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// iterate to-many link coveredBy from combo to sysLine
					fujaba__Success = false;

					fujaba__IterComboToSysLine = new ArrayList(
							combo.getCovered()).iterator();

					while (fujaba__IterComboToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterComboToSysLine
									.next();

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
									interaction = combo
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// check link trg from _edge_enclosingInteraction to interaction
									JavaSDM.ensure(interaction
											.equals(_edge_enclosingInteraction
													.getTrg()));

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
											// bind object
											guard = operand.getGuard();

											// check object guard is really bound
											JavaSDM.ensure(guard != null);

											// bind object
											_TmpObject = guard
													.getSpecification();

											// ensure correct type and really bound of object spec
											JavaSDM.ensure(_TmpObject instanceof LiteralString);
											spec = (LiteralString) _TmpObject;

											// check link coveredBy from line to operand
											JavaSDM.ensure(line.getCoveredBy()
													.contains(operand));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_149000 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_149000 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_149000 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_149000 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_149000
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
															__DEC_messageReceive_fragment_584492 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_584492 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_584492 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_584492 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_584492
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
															__DEC_messageSend_fragment_361386 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_361386 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_361386 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_361386 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_361386
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
															__DEC_operand_enclosingInteraction_345582 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_345582 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_345582 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_345582 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_345582
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_574792 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_574792 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_574792 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_574792 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_574792
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
															__DEC_guard_guard_191009 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_191009 is really bound
															JavaSDM.ensure(__DEC_guard_guard_191009 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_191009
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_191009 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_191009
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
															__DEC_operand_operand_145137 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_145137 is really bound
															JavaSDM.ensure(__DEC_operand_operand_145137 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_145137
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_145137 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_145137
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
															__DEC_spec_specification_689728 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_689728 is really bound
															JavaSDM.ensure(__DEC_spec_specification_689728 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_689728
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_689728 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_689728
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check object _edge_enclosingInteraction is really bound
														JavaSDM.ensure(_edge_enclosingInteraction != null);
														// check object combo is really bound
														JavaSDM.ensure(combo != null);
														// check object guard is really bound
														JavaSDM.ensure(guard != null);
														// check object interaction is really bound
														JavaSDM.ensure(interaction != null);
														// check object line is really bound
														JavaSDM.ensure(line != null);
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check object sysLine is really bound
														JavaSDM.ensure(sysLine != null);
														// check isomorphic binding between objects sysLine and line 
														JavaSDM.ensure(!sysLine
																.equals(line));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_enclosingInteraction to combo
														JavaSDM.ensure(combo
																.equals(_edge_enclosingInteraction
																		.getSrc()));

														// check link trg from _edge_enclosingInteraction to interaction
														JavaSDM.ensure(interaction
																.equals(_edge_enclosingInteraction
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_431(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_426446 = null;
		InteractionOperand __DEC_messageReceive_fragment_521307 = null;
		InteractionOperand __DEC_messageSend_fragment_979761 = null;
		Interaction __DEC_operand_enclosingInteraction_707915 = null;
		InteractionOperand __DEC_operand_fragment_18232 = null;
		InteractionOperand __DEC_guard_guard_382311 = null;
		CombinedFragment __DEC_operand_operand_901994 = null;
		Constraint __DEC_spec_specification_397084 = null;
		Match match = null;
		Iterator fujaba__IterComboTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterComboToLine = null;
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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getTrg();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// iterate to-many link coveredBy from combo to line
			fujaba__Success = false;

			fujaba__IterComboToLine = new ArrayList(combo.getCovered())
					.iterator();

			while (fujaba__IterComboToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterComboToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// iterate to-many link coveredBy from combo to sysLine
					fujaba__Success = false;

					fujaba__IterComboToSysLine = new ArrayList(
							combo.getCovered()).iterator();

					while (fujaba__IterComboToSysLine.hasNext()) {
						try {
							sysLine = (Lifeline) fujaba__IterComboToSysLine
									.next();

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
									interaction = combo
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// check link src from _edge_fragment to interaction
									JavaSDM.ensure(interaction
											.equals(_edge_fragment.getSrc()));

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
											// bind object
											guard = operand.getGuard();

											// check object guard is really bound
											JavaSDM.ensure(guard != null);

											// bind object
											_TmpObject = guard
													.getSpecification();

											// ensure correct type and really bound of object spec
											JavaSDM.ensure(_TmpObject instanceof LiteralString);
											spec = (LiteralString) _TmpObject;

											// check link coveredBy from line to operand
											JavaSDM.ensure(line.getCoveredBy()
													.contains(operand));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// iterate to-many link src from combo to _edge_enclosingInteraction
													fujaba__Success = false;

													fujaba__IterComboTo_edge_enclosingInteraction = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			combo,
																			EMoflonEdge.class,
																			"src"))
															.iterator();

													while (fujaba__IterComboTo_edge_enclosingInteraction
															.hasNext()) {
														try {
															_edge_enclosingInteraction = (EMoflonEdge) fujaba__IterComboTo_edge_enclosingInteraction
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

																// negative check for link message from messageReceive
																JavaSDM.ensure(messageReceive
																		.getMessage() == null);
																// negative check for link message from messageSend
																JavaSDM.ensure(messageSend
																		.getMessage() == null);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_combo_fragment_426446 = combo
																			.getEnclosingOperand();

																	// check object __DEC_combo_fragment_426446 is really bound
																	JavaSDM.ensure(__DEC_combo_fragment_426446 != null);

																	// check isomorphic binding between objects __DEC_combo_fragment_426446 and operand 
																	JavaSDM.ensure(!__DEC_combo_fragment_426446
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
																	__DEC_messageReceive_fragment_521307 = messageReceive
																			.getEnclosingOperand();

																	// check object __DEC_messageReceive_fragment_521307 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_fragment_521307 != null);

																	// check isomorphic binding between objects __DEC_messageReceive_fragment_521307 and operand 
																	JavaSDM.ensure(!__DEC_messageReceive_fragment_521307
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
																	__DEC_messageSend_fragment_979761 = messageSend
																			.getEnclosingOperand();

																	// check object __DEC_messageSend_fragment_979761 is really bound
																	JavaSDM.ensure(__DEC_messageSend_fragment_979761 != null);

																	// check isomorphic binding between objects __DEC_messageSend_fragment_979761 and operand 
																	JavaSDM.ensure(!__DEC_messageSend_fragment_979761
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
																	__DEC_operand_enclosingInteraction_707915 = operand
																			.getEnclosingInteraction();

																	// check object __DEC_operand_enclosingInteraction_707915 is really bound
																	JavaSDM.ensure(__DEC_operand_enclosingInteraction_707915 != null);

																	// check isomorphic binding between objects __DEC_operand_enclosingInteraction_707915 and interaction 
																	JavaSDM.ensure(!__DEC_operand_enclosingInteraction_707915
																			.equals(interaction));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_operand_fragment_18232 = operand
																			.getEnclosingOperand();

																	// check object __DEC_operand_fragment_18232 is really bound
																	JavaSDM.ensure(__DEC_operand_fragment_18232 != null);

																	// check isomorphic binding between objects __DEC_operand_fragment_18232 and operand 
																	JavaSDM.ensure(!__DEC_operand_fragment_18232
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
																	__DEC_guard_guard_382311 = guard
																			.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																			.eContainer()
																			: null;

																	// check object __DEC_guard_guard_382311 is really bound
																	JavaSDM.ensure(__DEC_guard_guard_382311 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(guard
																			.equals(__DEC_guard_guard_382311
																					.getGuard()));

																	// check isomorphic binding between objects __DEC_guard_guard_382311 and operand 
																	JavaSDM.ensure(!__DEC_guard_guard_382311
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
																	__DEC_operand_operand_901994 = operand
																			.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																			.eContainer()
																			: null;

																	// check object __DEC_operand_operand_901994 is really bound
																	JavaSDM.ensure(__DEC_operand_operand_901994 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_operand_operand_901994
																			.getOperand()
																			.contains(
																					operand));

																	// check isomorphic binding between objects __DEC_operand_operand_901994 and combo 
																	JavaSDM.ensure(!__DEC_operand_operand_901994
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
																	__DEC_spec_specification_397084 = spec
																			.eContainer() instanceof Constraint ? (Constraint) spec
																			.eContainer()
																			: null;

																	// check object __DEC_spec_specification_397084 is really bound
																	JavaSDM.ensure(__DEC_spec_specification_397084 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(spec
																			.equals(__DEC_spec_specification_397084
																					.getSpecification()));

																	// check isomorphic binding between objects __DEC_spec_specification_397084 and guard 
																	JavaSDM.ensure(!__DEC_spec_specification_397084
																			.equals(guard));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link receiveEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link receiveEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check object _edge_enclosingInteraction is really bound
																JavaSDM.ensure(_edge_enclosingInteraction != null);
																// check object _edge_fragment is really bound
																JavaSDM.ensure(_edge_fragment != null);
																// check object combo is really bound
																JavaSDM.ensure(combo != null);
																// check object guard is really bound
																JavaSDM.ensure(guard != null);
																// check object interaction is really bound
																JavaSDM.ensure(interaction != null);
																// check object line is really bound
																JavaSDM.ensure(line != null);
																// check object messageReceive is really bound
																JavaSDM.ensure(messageReceive != null);
																// check object messageSend is really bound
																JavaSDM.ensure(messageSend != null);
																// check object operand is really bound
																JavaSDM.ensure(operand != null);
																// check object spec is really bound
																JavaSDM.ensure(spec != null);
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

																// check link fragment from combo to interaction
																JavaSDM.ensure(interaction
																		.equals(combo
																				.getEnclosingInteraction()));

																// check link fragment from messageReceive to interaction
																JavaSDM.ensure(interaction
																		.equals(messageReceive
																				.getEnclosingInteraction()));

																// check link fragment from messageSend to interaction
																JavaSDM.ensure(interaction
																		.equals(messageSend
																				.getEnclosingInteraction()));

																// check link fragment from operand to interaction
																JavaSDM.ensure(!(interaction
																		.equals(operand
																				.getEnclosingInteraction())));

																// check link fragment from combo to operand
																JavaSDM.ensure(!(operand
																		.equals(combo
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
																JavaSDM.ensure(guard
																		.equals(operand
																				.getGuard()));

																// check link lifeline from line to interaction
																JavaSDM.ensure(interaction
																		.equals(line
																				.getInteraction()));

																// check link operand from operand to combo
																JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				operand,
																				CombinedFragment.class,
																				"$eContainer")
																		.contains(combo)));

																// check link specification from spec to guard
																JavaSDM.ensure(guard
																		.equals(spec
																				.eContainer()));

																// check link src from _edge_enclosingInteraction to combo
																JavaSDM.ensure(combo
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

																// check link trg from _edge_fragment to combo
																JavaSDM.ensure(combo
																		.equals(_edge_fragment
																				.getTrg()));

																// check link coveredBy from line to combo
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				combo));

																// check link coveredBy from line to operand
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				operand));

																// check link coveredBy from combo to sysLine
																JavaSDM.ensure(combo
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from messageSend to sysLine
																JavaSDM.ensure(messageSend
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from operand to sysLine
																JavaSDM.ensure(operand
																		.getCovered()
																		.contains(
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
																				match,
																				sysLine,
																				messageSend,
																				combo,
																				operand,
																				interaction,
																				messageReceive,
																				line,
																				guard,
																				spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_432(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_420939 = null;
		InteractionOperand __DEC_messageReceive_fragment_435686 = null;
		InteractionOperand __DEC_messageSend_fragment_452186 = null;
		Interaction __DEC_operand_enclosingInteraction_295311 = null;
		InteractionOperand __DEC_operand_fragment_791212 = null;
		InteractionOperand __DEC_guard_guard_912441 = null;
		CombinedFragment __DEC_operand_operand_520057 = null;
		Constraint __DEC_spec_specification_971376 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

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
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

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
											JavaSDM.ensure(!sysLine
													.equals(line));

											// check link lifeline from line to interaction
											JavaSDM.ensure(interaction
													.equals(line
															.getInteraction()));

											// check link coveredBy from line to combo
											JavaSDM.ensure(line.getCoveredBy()
													.contains(combo));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_420939 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_420939 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_420939 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_420939 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_420939
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
															__DEC_messageReceive_fragment_435686 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_435686 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_435686 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_435686 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_435686
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
															__DEC_messageSend_fragment_452186 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_452186 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_452186 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_452186 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_452186
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
															__DEC_operand_enclosingInteraction_295311 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_295311 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_295311 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_295311 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_295311
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_791212 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_791212 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_791212 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_791212 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_791212
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
															__DEC_guard_guard_912441 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_912441 is really bound
															JavaSDM.ensure(__DEC_guard_guard_912441 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_912441
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_912441 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_912441
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
															__DEC_operand_operand_520057 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_520057 is really bound
															JavaSDM.ensure(__DEC_operand_operand_520057 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_520057
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_520057 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_520057
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
															__DEC_spec_specification_971376 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_971376 is really bound
															JavaSDM.ensure(__DEC_spec_specification_971376 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_971376
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_971376 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_971376
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check object _edge_enclosingInteraction is really bound
														JavaSDM.ensure(_edge_enclosingInteraction != null);
														// check object combo is really bound
														JavaSDM.ensure(combo != null);
														// check object guard is really bound
														JavaSDM.ensure(guard != null);
														// check object interaction is really bound
														JavaSDM.ensure(interaction != null);
														// check object line is really bound
														JavaSDM.ensure(line != null);
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check object sysLine is really bound
														JavaSDM.ensure(sysLine != null);
														// check isomorphic binding between objects sysLine and line 
														JavaSDM.ensure(!sysLine
																.equals(line));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_enclosingInteraction to messageSend
														JavaSDM.ensure(messageSend
																.equals(_edge_enclosingInteraction
																		.getSrc()));

														// check link trg from _edge_enclosingInteraction to interaction
														JavaSDM.ensure(interaction
																.equals(_edge_enclosingInteraction
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_433(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_982888 = null;
		InteractionOperand __DEC_messageReceive_fragment_423179 = null;
		InteractionOperand __DEC_messageSend_fragment_96319 = null;
		Interaction __DEC_operand_enclosingInteraction_215122 = null;
		InteractionOperand __DEC_operand_fragment_786637 = null;
		InteractionOperand __DEC_guard_guard_467150 = null;
		CombinedFragment __DEC_operand_operand_69474 = null;
		Constraint __DEC_spec_specification_629272 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
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

			// check link src from _edge_fragment to interaction
			JavaSDM.ensure(interaction.equals(_edge_fragment.getSrc()));

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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

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
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

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
											JavaSDM.ensure(!sysLine
													.equals(line));

											// check link lifeline from line to interaction
											JavaSDM.ensure(interaction
													.equals(line
															.getInteraction()));

											// check link coveredBy from line to combo
											JavaSDM.ensure(line.getCoveredBy()
													.contains(combo));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// iterate to-many link src from messageSend to _edge_enclosingInteraction
													fujaba__Success = false;

													fujaba__IterMessageSendTo_edge_enclosingInteraction = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			messageSend,
																			EMoflonEdge.class,
																			"src"))
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

																// negative check for link message from messageReceive
																JavaSDM.ensure(messageReceive
																		.getMessage() == null);
																// negative check for link message from messageSend
																JavaSDM.ensure(messageSend
																		.getMessage() == null);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_combo_fragment_982888 = combo
																			.getEnclosingOperand();

																	// check object __DEC_combo_fragment_982888 is really bound
																	JavaSDM.ensure(__DEC_combo_fragment_982888 != null);

																	// check isomorphic binding between objects __DEC_combo_fragment_982888 and operand 
																	JavaSDM.ensure(!__DEC_combo_fragment_982888
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
																	__DEC_messageReceive_fragment_423179 = messageReceive
																			.getEnclosingOperand();

																	// check object __DEC_messageReceive_fragment_423179 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_fragment_423179 != null);

																	// check isomorphic binding between objects __DEC_messageReceive_fragment_423179 and operand 
																	JavaSDM.ensure(!__DEC_messageReceive_fragment_423179
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
																	__DEC_messageSend_fragment_96319 = messageSend
																			.getEnclosingOperand();

																	// check object __DEC_messageSend_fragment_96319 is really bound
																	JavaSDM.ensure(__DEC_messageSend_fragment_96319 != null);

																	// check isomorphic binding between objects __DEC_messageSend_fragment_96319 and operand 
																	JavaSDM.ensure(!__DEC_messageSend_fragment_96319
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
																	__DEC_operand_enclosingInteraction_215122 = operand
																			.getEnclosingInteraction();

																	// check object __DEC_operand_enclosingInteraction_215122 is really bound
																	JavaSDM.ensure(__DEC_operand_enclosingInteraction_215122 != null);

																	// check isomorphic binding between objects __DEC_operand_enclosingInteraction_215122 and interaction 
																	JavaSDM.ensure(!__DEC_operand_enclosingInteraction_215122
																			.equals(interaction));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_operand_fragment_786637 = operand
																			.getEnclosingOperand();

																	// check object __DEC_operand_fragment_786637 is really bound
																	JavaSDM.ensure(__DEC_operand_fragment_786637 != null);

																	// check isomorphic binding between objects __DEC_operand_fragment_786637 and operand 
																	JavaSDM.ensure(!__DEC_operand_fragment_786637
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
																	__DEC_guard_guard_467150 = guard
																			.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																			.eContainer()
																			: null;

																	// check object __DEC_guard_guard_467150 is really bound
																	JavaSDM.ensure(__DEC_guard_guard_467150 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(guard
																			.equals(__DEC_guard_guard_467150
																					.getGuard()));

																	// check isomorphic binding between objects __DEC_guard_guard_467150 and operand 
																	JavaSDM.ensure(!__DEC_guard_guard_467150
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
																	__DEC_operand_operand_69474 = operand
																			.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																			.eContainer()
																			: null;

																	// check object __DEC_operand_operand_69474 is really bound
																	JavaSDM.ensure(__DEC_operand_operand_69474 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_operand_operand_69474
																			.getOperand()
																			.contains(
																					operand));

																	// check isomorphic binding between objects __DEC_operand_operand_69474 and combo 
																	JavaSDM.ensure(!__DEC_operand_operand_69474
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
																	__DEC_spec_specification_629272 = spec
																			.eContainer() instanceof Constraint ? (Constraint) spec
																			.eContainer()
																			: null;

																	// check object __DEC_spec_specification_629272 is really bound
																	JavaSDM.ensure(__DEC_spec_specification_629272 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(spec
																			.equals(__DEC_spec_specification_629272
																					.getSpecification()));

																	// check isomorphic binding between objects __DEC_spec_specification_629272 and guard 
																	JavaSDM.ensure(!__DEC_spec_specification_629272
																			.equals(guard));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link receiveEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link receiveEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check object _edge_enclosingInteraction is really bound
																JavaSDM.ensure(_edge_enclosingInteraction != null);
																// check object _edge_fragment is really bound
																JavaSDM.ensure(_edge_fragment != null);
																// check object combo is really bound
																JavaSDM.ensure(combo != null);
																// check object guard is really bound
																JavaSDM.ensure(guard != null);
																// check object interaction is really bound
																JavaSDM.ensure(interaction != null);
																// check object line is really bound
																JavaSDM.ensure(line != null);
																// check object messageReceive is really bound
																JavaSDM.ensure(messageReceive != null);
																// check object messageSend is really bound
																JavaSDM.ensure(messageSend != null);
																// check object operand is really bound
																JavaSDM.ensure(operand != null);
																// check object spec is really bound
																JavaSDM.ensure(spec != null);
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

																// check link fragment from combo to interaction
																JavaSDM.ensure(interaction
																		.equals(combo
																				.getEnclosingInteraction()));

																// check link fragment from messageReceive to interaction
																JavaSDM.ensure(interaction
																		.equals(messageReceive
																				.getEnclosingInteraction()));

																// check link fragment from messageSend to interaction
																JavaSDM.ensure(interaction
																		.equals(messageSend
																				.getEnclosingInteraction()));

																// check link fragment from operand to interaction
																JavaSDM.ensure(!(interaction
																		.equals(operand
																				.getEnclosingInteraction())));

																// check link fragment from combo to operand
																JavaSDM.ensure(!(operand
																		.equals(combo
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
																JavaSDM.ensure(guard
																		.equals(operand
																				.getGuard()));

																// check link lifeline from line to interaction
																JavaSDM.ensure(interaction
																		.equals(line
																				.getInteraction()));

																// check link operand from operand to combo
																JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				operand,
																				CombinedFragment.class,
																				"$eContainer")
																		.contains(combo)));

																// check link specification from spec to guard
																JavaSDM.ensure(guard
																		.equals(spec
																				.eContainer()));

																// check link src from _edge_enclosingInteraction to messageSend
																JavaSDM.ensure(messageSend
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

																// check link trg from _edge_fragment to messageSend
																JavaSDM.ensure(messageSend
																		.equals(_edge_fragment
																				.getTrg()));

																// check link coveredBy from line to combo
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				combo));

																// check link coveredBy from line to operand
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				operand));

																// check link coveredBy from combo to sysLine
																JavaSDM.ensure(combo
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from messageSend to sysLine
																JavaSDM.ensure(messageSend
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from operand to sysLine
																JavaSDM.ensure(operand
																		.getCovered()
																		.contains(
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
																				match,
																				sysLine,
																				messageSend,
																				combo,
																				operand,
																				interaction,
																				messageReceive,
																				line,
																				guard,
																				spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_434(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_945283 = null;
		InteractionOperand __DEC_messageReceive_fragment_342848 = null;
		InteractionOperand __DEC_messageSend_fragment_758327 = null;
		Interaction __DEC_operand_enclosingInteraction_641360 = null;
		InteractionOperand __DEC_operand_fragment_939785 = null;
		InteractionOperand __DEC_guard_guard_991392 = null;
		CombinedFragment __DEC_operand_operand_774816 = null;
		Constraint __DEC_spec_specification_849680 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterInteractionToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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
			_TmpObject = _edge_enclosingInteraction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

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

					// iterate to-many link fragment from interaction to combo
					fujaba__Success = false;

					fujaba__IterInteractionToCombo = new ArrayList(
							interaction.getFragment()).iterator();

					while (fujaba__IterInteractionToCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterInteractionToCombo.next();

							// ensure correct type and really bound of object combo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							combo = (CombinedFragment) _TmpObject;
							// iterate to-many link coveredBy from combo to sysLine
							fujaba__Success = false;

							fujaba__IterComboToSysLine = new ArrayList(
									combo.getCovered()).iterator();

							while (fujaba__IterComboToSysLine.hasNext()) {
								try {
									sysLine = (Lifeline) fujaba__IterComboToSysLine
											.next();

									// check object sysLine is really bound
									JavaSDM.ensure(sysLine != null);
									// check link coveredBy from messageSend to sysLine
									JavaSDM.ensure(messageSend.getCovered()
											.contains(sysLine));

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
											// bind object
											guard = operand.getGuard();

											// check object guard is really bound
											JavaSDM.ensure(guard != null);

											// bind object
											_TmpObject = guard
													.getSpecification();

											// ensure correct type and really bound of object spec
											JavaSDM.ensure(_TmpObject instanceof LiteralString);
											spec = (LiteralString) _TmpObject;

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
													// check isomorphic binding between objects sysLine and line 
													JavaSDM.ensure(!sysLine
															.equals(line));

													// check link coveredBy from line to combo
													JavaSDM.ensure(line
															.getCoveredBy()
															.contains(combo));

													// check link coveredBy from line to operand
													JavaSDM.ensure(line
															.getCoveredBy()
															.contains(operand));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_945283 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_945283 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_945283 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_945283 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_945283
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
															__DEC_messageReceive_fragment_342848 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_342848 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_342848 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_342848 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_342848
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
															__DEC_messageSend_fragment_758327 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_758327 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_758327 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_758327 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_758327
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
															__DEC_operand_enclosingInteraction_641360 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_641360 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_641360 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_641360 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_641360
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_939785 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_939785 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_939785 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_939785 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_939785
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
															__DEC_guard_guard_991392 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_991392 is really bound
															JavaSDM.ensure(__DEC_guard_guard_991392 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_991392
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_991392 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_991392
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
															__DEC_operand_operand_774816 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_774816 is really bound
															JavaSDM.ensure(__DEC_operand_operand_774816 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_774816
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_774816 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_774816
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
															__DEC_spec_specification_849680 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_849680 is really bound
															JavaSDM.ensure(__DEC_spec_specification_849680 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_849680
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_849680 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_849680
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check link fragment from operand to operand
														JavaSDM.ensure(!(operand.equals(operand
																.getEnclosingOperand())));

														// check object _edge_enclosingInteraction is really bound
														JavaSDM.ensure(_edge_enclosingInteraction != null);
														// check object combo is really bound
														JavaSDM.ensure(combo != null);
														// check object guard is really bound
														JavaSDM.ensure(guard != null);
														// check object interaction is really bound
														JavaSDM.ensure(interaction != null);
														// check object line is really bound
														JavaSDM.ensure(line != null);
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check object sysLine is really bound
														JavaSDM.ensure(sysLine != null);
														// check isomorphic binding between objects sysLine and line 
														JavaSDM.ensure(!sysLine
																.equals(line));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_enclosingInteraction to messageReceive
														JavaSDM.ensure(messageReceive
																.equals(_edge_enclosingInteraction
																		.getSrc()));

														// check link trg from _edge_enclosingInteraction to interaction
														JavaSDM.ensure(interaction
																.equals(_edge_enclosingInteraction
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_435(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_13854 = null;
		InteractionOperand __DEC_messageReceive_fragment_930824 = null;
		InteractionOperand __DEC_messageSend_fragment_643244 = null;
		Interaction __DEC_operand_enclosingInteraction_110385 = null;
		InteractionOperand __DEC_operand_fragment_309640 = null;
		InteractionOperand __DEC_guard_guard_315821 = null;
		CombinedFragment __DEC_operand_operand_15112 = null;
		Constraint __DEC_spec_specification_300780 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterMessageSendToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToCombo = null;
		CombinedFragment combo = null;
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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getSrc();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// bind object
			_TmpObject = _edge_fragment.getTrg();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// check link fragment from messageReceive to interaction
			JavaSDM.ensure(interaction.equals(messageReceive
					.getEnclosingInteraction()));

			// iterate to-many link fragment from interaction to combo
			fujaba__Success = false;

			fujaba__IterInteractionToCombo = new ArrayList(
					interaction.getFragment()).iterator();

			while (fujaba__IterInteractionToCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterInteractionToCombo.next();

					// ensure correct type and really bound of object combo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					combo = (CombinedFragment) _TmpObject;
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
									// check link coveredBy from combo to sysLine
									JavaSDM.ensure(combo.getCovered().contains(
											sysLine));

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
											// bind object
											guard = operand.getGuard();

											// check object guard is really bound
											JavaSDM.ensure(guard != null);

											// bind object
											_TmpObject = guard
													.getSpecification();

											// ensure correct type and really bound of object spec
											JavaSDM.ensure(_TmpObject instanceof LiteralString);
											spec = (LiteralString) _TmpObject;

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
													// check isomorphic binding between objects sysLine and line 
													JavaSDM.ensure(!sysLine
															.equals(line));

													// check link coveredBy from line to combo
													JavaSDM.ensure(line
															.getCoveredBy()
															.contains(combo));

													// check link coveredBy from line to operand
													JavaSDM.ensure(line
															.getCoveredBy()
															.contains(operand));

													// iterate to-many link trg from interaction to _edge_enclosingInteraction
													fujaba__Success = false;

													fujaba__IterInteractionTo_edge_enclosingInteraction = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			interaction,
																			EMoflonEdge.class,
																			"trg"))
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

																// negative check for link message from messageReceive
																JavaSDM.ensure(messageReceive
																		.getMessage() == null);
																// negative check for link message from messageSend
																JavaSDM.ensure(messageSend
																		.getMessage() == null);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_combo_fragment_13854 = combo
																			.getEnclosingOperand();

																	// check object __DEC_combo_fragment_13854 is really bound
																	JavaSDM.ensure(__DEC_combo_fragment_13854 != null);

																	// check isomorphic binding between objects __DEC_combo_fragment_13854 and operand 
																	JavaSDM.ensure(!__DEC_combo_fragment_13854
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
																	__DEC_messageReceive_fragment_930824 = messageReceive
																			.getEnclosingOperand();

																	// check object __DEC_messageReceive_fragment_930824 is really bound
																	JavaSDM.ensure(__DEC_messageReceive_fragment_930824 != null);

																	// check isomorphic binding between objects __DEC_messageReceive_fragment_930824 and operand 
																	JavaSDM.ensure(!__DEC_messageReceive_fragment_930824
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
																	__DEC_messageSend_fragment_643244 = messageSend
																			.getEnclosingOperand();

																	// check object __DEC_messageSend_fragment_643244 is really bound
																	JavaSDM.ensure(__DEC_messageSend_fragment_643244 != null);

																	// check isomorphic binding between objects __DEC_messageSend_fragment_643244 and operand 
																	JavaSDM.ensure(!__DEC_messageSend_fragment_643244
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
																	__DEC_operand_enclosingInteraction_110385 = operand
																			.getEnclosingInteraction();

																	// check object __DEC_operand_enclosingInteraction_110385 is really bound
																	JavaSDM.ensure(__DEC_operand_enclosingInteraction_110385 != null);

																	// check isomorphic binding between objects __DEC_operand_enclosingInteraction_110385 and interaction 
																	JavaSDM.ensure(!__DEC_operand_enclosingInteraction_110385
																			.equals(interaction));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_operand_fragment_309640 = operand
																			.getEnclosingOperand();

																	// check object __DEC_operand_fragment_309640 is really bound
																	JavaSDM.ensure(__DEC_operand_fragment_309640 != null);

																	// check isomorphic binding between objects __DEC_operand_fragment_309640 and operand 
																	JavaSDM.ensure(!__DEC_operand_fragment_309640
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
																	__DEC_guard_guard_315821 = guard
																			.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																			.eContainer()
																			: null;

																	// check object __DEC_guard_guard_315821 is really bound
																	JavaSDM.ensure(__DEC_guard_guard_315821 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(guard
																			.equals(__DEC_guard_guard_315821
																					.getGuard()));

																	// check isomorphic binding between objects __DEC_guard_guard_315821 and operand 
																	JavaSDM.ensure(!__DEC_guard_guard_315821
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
																	__DEC_operand_operand_15112 = operand
																			.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																			.eContainer()
																			: null;

																	// check object __DEC_operand_operand_15112 is really bound
																	JavaSDM.ensure(__DEC_operand_operand_15112 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_operand_operand_15112
																			.getOperand()
																			.contains(
																					operand));

																	// check isomorphic binding between objects __DEC_operand_operand_15112 and combo 
																	JavaSDM.ensure(!__DEC_operand_operand_15112
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
																	__DEC_spec_specification_300780 = spec
																			.eContainer() instanceof Constraint ? (Constraint) spec
																			.eContainer()
																			: null;

																	// check object __DEC_spec_specification_300780 is really bound
																	JavaSDM.ensure(__DEC_spec_specification_300780 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(spec
																			.equals(__DEC_spec_specification_300780
																					.getSpecification()));

																	// check isomorphic binding between objects __DEC_spec_specification_300780 and guard 
																	JavaSDM.ensure(!__DEC_spec_specification_300780
																			.equals(guard));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link receiveEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link receiveEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"receiveEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageReceive
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageReceive,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// negative check for link sendEvent from messageSend
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				messageSend,
																				Message.class,
																				"sendEvent")
																		.size() == 0);
																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check link fragment from operand to operand
																JavaSDM.ensure(!(operand
																		.equals(operand
																				.getEnclosingOperand())));

																// check object _edge_enclosingInteraction is really bound
																JavaSDM.ensure(_edge_enclosingInteraction != null);
																// check object _edge_fragment is really bound
																JavaSDM.ensure(_edge_fragment != null);
																// check object combo is really bound
																JavaSDM.ensure(combo != null);
																// check object guard is really bound
																JavaSDM.ensure(guard != null);
																// check object interaction is really bound
																JavaSDM.ensure(interaction != null);
																// check object line is really bound
																JavaSDM.ensure(line != null);
																// check object messageReceive is really bound
																JavaSDM.ensure(messageReceive != null);
																// check object messageSend is really bound
																JavaSDM.ensure(messageSend != null);
																// check object operand is really bound
																JavaSDM.ensure(operand != null);
																// check object spec is really bound
																JavaSDM.ensure(spec != null);
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

																// check link fragment from combo to interaction
																JavaSDM.ensure(interaction
																		.equals(combo
																				.getEnclosingInteraction()));

																// check link fragment from messageReceive to interaction
																JavaSDM.ensure(interaction
																		.equals(messageReceive
																				.getEnclosingInteraction()));

																// check link fragment from messageSend to interaction
																JavaSDM.ensure(interaction
																		.equals(messageSend
																				.getEnclosingInteraction()));

																// check link fragment from operand to interaction
																JavaSDM.ensure(!(interaction
																		.equals(operand
																				.getEnclosingInteraction())));

																// check link fragment from combo to operand
																JavaSDM.ensure(!(operand
																		.equals(combo
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
																JavaSDM.ensure(guard
																		.equals(operand
																				.getGuard()));

																// check link lifeline from line to interaction
																JavaSDM.ensure(interaction
																		.equals(line
																				.getInteraction()));

																// check link operand from operand to combo
																JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				operand,
																				CombinedFragment.class,
																				"$eContainer")
																		.contains(combo)));

																// check link specification from spec to guard
																JavaSDM.ensure(guard
																		.equals(spec
																				.eContainer()));

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

																// check link coveredBy from line to combo
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				combo));

																// check link coveredBy from line to operand
																JavaSDM.ensure(line
																		.getCoveredBy()
																		.contains(
																				operand));

																// check link coveredBy from combo to sysLine
																JavaSDM.ensure(combo
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from messageSend to sysLine
																JavaSDM.ensure(messageSend
																		.getCovered()
																		.contains(
																				sysLine));

																// check link coveredBy from operand to sysLine
																JavaSDM.ensure(operand
																		.getCovered()
																		.contains(
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
																				match,
																				sysLine,
																				messageSend,
																				combo,
																				operand,
																				interaction,
																				messageReceive,
																				line,
																				guard,
																				spec);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_99(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_590988 = null;
		NormalStep __DEC_alt_stepAlternative_96780 = null;
		Flow __DEC_step_steps_781615 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_836727 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_836727 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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

					// iterate to-many link stepAlternative from step to alt
					fujaba__Success = false;

					fujaba__IterStepToAlt = new ArrayList(
							step.getStepAlternative()).iterator();

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

							// iterate to-many link useCases from packageDeclaration to useCase
							fujaba__Success = false;

							fujaba__IterPackageDeclarationToUseCase = new ArrayList(
									packageDeclaration.getUseCases())
									.iterator();

							while (fujaba__IterPackageDeclarationToUseCase
									.hasNext()) {
								try {
									useCase = (UseCase) fujaba__IterPackageDeclarationToUseCase
											.next();

									// check object useCase is really bound
									JavaSDM.ensure(useCase != null);
									// check link flows from flow to useCase
									JavaSDM.ensure(useCase.equals(flow
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_altFlow_flows_590988 = altFlow
													.eContainer() instanceof UseCase ? (UseCase) altFlow
													.eContainer() : null;

											// check object __DEC_altFlow_flows_590988 is really bound
											JavaSDM.ensure(__DEC_altFlow_flows_590988 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_altFlow_flows_590988
													.getFlows().contains(
															altFlow));

											// check isomorphic binding between objects __DEC_altFlow_flows_590988 and useCase 
											JavaSDM.ensure(!__DEC_altFlow_flows_590988
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
											__DEC_alt_stepAlternative_96780 = alt
													.eContainer() instanceof NormalStep ? (NormalStep) alt
													.eContainer() : null;

											// check object __DEC_alt_stepAlternative_96780 is really bound
											JavaSDM.ensure(__DEC_alt_stepAlternative_96780 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alt_stepAlternative_96780
													.getStepAlternative()
													.contains(alt));

											// check isomorphic binding between objects __DEC_alt_stepAlternative_96780 and step 
											JavaSDM.ensure(!__DEC_alt_stepAlternative_96780
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
											__DEC_step_steps_781615 = step
													.eContainer() instanceof Flow ? (Flow) step
													.eContainer() : null;

											// check object __DEC_step_steps_781615 is really bound
											JavaSDM.ensure(__DEC_step_steps_781615 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_step_steps_781615
													.getSteps().contains(step));

											// check isomorphic binding between objects __DEC_step_steps_781615 and altFlow 
											JavaSDM.ensure(!__DEC_step_steps_781615
													.equals(altFlow));

											// check isomorphic binding between objects __DEC_step_steps_781615 and flow 
											JavaSDM.ensure(!__DEC_step_steps_781615
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

											// iterate to-many link ref from altFlow to __DEC_altFlow_ref_836727
											fujaba__Success = false;

											fujaba__IterAltFlowTo__DEC_altFlow_ref_836727 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	altFlow,
																	AlternativeFlowAlternative.class,
																	"ref"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterAltFlowTo__DEC_altFlow_ref_836727
															.hasNext()) {
												try {
													__DEC_altFlow_ref_836727 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_836727
															.next();

													// check object __DEC_altFlow_ref_836727 is really bound
													JavaSDM.ensure(__DEC_altFlow_ref_836727 != null);
													// check isomorphic binding between objects __DEC_altFlow_ref_836727 and alt 
													JavaSDM.ensure(!__DEC_altFlow_ref_836727
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
										// check object sysActor is really bound
										JavaSDM.ensure(sysActor != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects sysActor and actor 
										JavaSDM.ensure(!sysActor.equals(actor));

										// check link actor from step to actor
										JavaSDM.ensure(actor.equals(step
												.getActor()));

										// check link ref from alt to altFlow
										JavaSDM.ensure(altFlow.equals(alt
												.getRef()));

										// check link actors from actor to packageDeclaration
										JavaSDM.ensure(packageDeclaration
												.equals(actor.eContainer()));

										// check link actors from sysActor to packageDeclaration
										JavaSDM.ensure(packageDeclaration
												.equals(sysActor.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link flows from altFlow to useCase
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(altFlow,
														UseCase.class,
														"$eContainer")
												.contains(useCase)));

										// check link src from _edge_steps to flow
										JavaSDM.ensure(flow.equals(_edge_steps
												.getSrc()));

										// check link stepAlternative from alt to step
										JavaSDM.ensure(step.equals(alt
												.eContainer()));

										// check link steps from step to flow
										JavaSDM.ensure(flow.equals(step
												.eContainer()));

										// check link steps from step to altFlow
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(step,
														AlternativeFlow.class,
														"$eContainer")
												.contains(altFlow)));

										// check link trg from _edge_steps to step
										JavaSDM.ensure(step.equals(_edge_steps
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
										fujaba__Success = this
												.isAppropriate_FWD(match,
														packageDeclaration,
														actor, sysActor, flow,
														useCase, step, alt,
														altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_100(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_484032 = null;
		NormalStep __DEC_alt_stepAlternative_570494 = null;
		Flow __DEC_step_steps_254901 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_976624 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_976624 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;
		BasicFlow flow = null;
		PackageDeclaration packageDeclaration = null;
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
			packageDeclaration = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getActors().contains(actor));

			// bind object
			_TmpObject = step.eContainer() instanceof BasicFlow ? (BasicFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(step));

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

			// check link stepAlternative from alt to step
			JavaSDM.ensure(step.equals(alt.eContainer()));

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
									__DEC_altFlow_flows_484032 = altFlow
											.eContainer() instanceof UseCase ? (UseCase) altFlow
											.eContainer() : null;

									// check object __DEC_altFlow_flows_484032 is really bound
									JavaSDM.ensure(__DEC_altFlow_flows_484032 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_altFlow_flows_484032
											.getFlows().contains(altFlow));

									// check isomorphic binding between objects __DEC_altFlow_flows_484032 and useCase 
									JavaSDM.ensure(!__DEC_altFlow_flows_484032
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
									__DEC_alt_stepAlternative_570494 = alt
											.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object __DEC_alt_stepAlternative_570494 is really bound
									JavaSDM.ensure(__DEC_alt_stepAlternative_570494 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alt_stepAlternative_570494
											.getStepAlternative().contains(alt));

									// check isomorphic binding between objects __DEC_alt_stepAlternative_570494 and step 
									JavaSDM.ensure(!__DEC_alt_stepAlternative_570494
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
									__DEC_step_steps_254901 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_254901 is really bound
									JavaSDM.ensure(__DEC_step_steps_254901 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_254901
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_254901 and altFlow 
									JavaSDM.ensure(!__DEC_step_steps_254901
											.equals(altFlow));

									// check isomorphic binding between objects __DEC_step_steps_254901 and flow 
									JavaSDM.ensure(!__DEC_step_steps_254901
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

									// iterate to-many link ref from altFlow to __DEC_altFlow_ref_976624
									fujaba__Success = false;

									fujaba__IterAltFlowTo__DEC_altFlow_ref_976624 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															altFlow,
															AlternativeFlowAlternative.class,
															"ref")).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterAltFlowTo__DEC_altFlow_ref_976624
													.hasNext()) {
										try {
											__DEC_altFlow_ref_976624 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_976624
													.next();

											// check object __DEC_altFlow_ref_976624 is really bound
											JavaSDM.ensure(__DEC_altFlow_ref_976624 != null);
											// check isomorphic binding between objects __DEC_altFlow_ref_976624 and alt 
											JavaSDM.ensure(!__DEC_altFlow_ref_976624
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
								// check object sysActor is really bound
								JavaSDM.ensure(sysActor != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects sysActor and actor 
								JavaSDM.ensure(!sysActor.equals(actor));

								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link ref from alt to altFlow
								JavaSDM.ensure(altFlow.equals(alt.getRef()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link actors from sysActor to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(sysActor.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link flows from altFlow to useCase
								JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(altFlow,
												UseCase.class, "$eContainer")
										.contains(useCase)));

								// check link src from _edge_stepAlternative to step
								JavaSDM.ensure(step
										.equals(_edge_stepAlternative.getSrc()));

								// check link stepAlternative from alt to step
								JavaSDM.ensure(step.equals(alt.eContainer()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link steps from step to altFlow
								JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(step,
												AlternativeFlow.class,
												"$eContainer")
										.contains(altFlow)));

								// check link trg from _edge_stepAlternative to alt
								JavaSDM.ensure(alt.equals(_edge_stepAlternative
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
										packageDeclaration, actor, sysActor,
										flow, useCase, step, alt, altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_101(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_763710 = null;
		NormalStep __DEC_alt_stepAlternative_822872 = null;
		Flow __DEC_step_steps_443165 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_855267 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_855267 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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

					// iterate to-many link stepAlternative from step to alt
					fujaba__Success = false;

					fujaba__IterStepToAlt = new ArrayList(
							step.getStepAlternative()).iterator();

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

							// iterate to-many link useCases from packageDeclaration to useCase
							fujaba__Success = false;

							fujaba__IterPackageDeclarationToUseCase = new ArrayList(
									packageDeclaration.getUseCases())
									.iterator();

							while (fujaba__IterPackageDeclarationToUseCase
									.hasNext()) {
								try {
									useCase = (UseCase) fujaba__IterPackageDeclarationToUseCase
											.next();

									// check object useCase is really bound
									JavaSDM.ensure(useCase != null);
									// check link flows from flow to useCase
									JavaSDM.ensure(useCase.equals(flow
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_altFlow_flows_763710 = altFlow
													.eContainer() instanceof UseCase ? (UseCase) altFlow
													.eContainer() : null;

											// check object __DEC_altFlow_flows_763710 is really bound
											JavaSDM.ensure(__DEC_altFlow_flows_763710 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_altFlow_flows_763710
													.getFlows().contains(
															altFlow));

											// check isomorphic binding between objects __DEC_altFlow_flows_763710 and useCase 
											JavaSDM.ensure(!__DEC_altFlow_flows_763710
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
											__DEC_alt_stepAlternative_822872 = alt
													.eContainer() instanceof NormalStep ? (NormalStep) alt
													.eContainer() : null;

											// check object __DEC_alt_stepAlternative_822872 is really bound
											JavaSDM.ensure(__DEC_alt_stepAlternative_822872 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alt_stepAlternative_822872
													.getStepAlternative()
													.contains(alt));

											// check isomorphic binding between objects __DEC_alt_stepAlternative_822872 and step 
											JavaSDM.ensure(!__DEC_alt_stepAlternative_822872
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
											__DEC_step_steps_443165 = step
													.eContainer() instanceof Flow ? (Flow) step
													.eContainer() : null;

											// check object __DEC_step_steps_443165 is really bound
											JavaSDM.ensure(__DEC_step_steps_443165 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_step_steps_443165
													.getSteps().contains(step));

											// check isomorphic binding between objects __DEC_step_steps_443165 and altFlow 
											JavaSDM.ensure(!__DEC_step_steps_443165
													.equals(altFlow));

											// check isomorphic binding between objects __DEC_step_steps_443165 and flow 
											JavaSDM.ensure(!__DEC_step_steps_443165
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

											// iterate to-many link ref from altFlow to __DEC_altFlow_ref_855267
											fujaba__Success = false;

											fujaba__IterAltFlowTo__DEC_altFlow_ref_855267 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	altFlow,
																	AlternativeFlowAlternative.class,
																	"ref"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterAltFlowTo__DEC_altFlow_ref_855267
															.hasNext()) {
												try {
													__DEC_altFlow_ref_855267 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_855267
															.next();

													// check object __DEC_altFlow_ref_855267 is really bound
													JavaSDM.ensure(__DEC_altFlow_ref_855267 != null);
													// check isomorphic binding between objects __DEC_altFlow_ref_855267 and alt 
													JavaSDM.ensure(!__DEC_altFlow_ref_855267
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
										// check object sysActor is really bound
										JavaSDM.ensure(sysActor != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects sysActor and actor 
										JavaSDM.ensure(!sysActor.equals(actor));

										// check link actor from step to actor
										JavaSDM.ensure(actor.equals(step
												.getActor()));

										// check link ref from alt to altFlow
										JavaSDM.ensure(altFlow.equals(alt
												.getRef()));

										// check link actors from actor to packageDeclaration
										JavaSDM.ensure(packageDeclaration
												.equals(actor.eContainer()));

										// check link actors from sysActor to packageDeclaration
										JavaSDM.ensure(packageDeclaration
												.equals(sysActor.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link flows from altFlow to useCase
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(altFlow,
														UseCase.class,
														"$eContainer")
												.contains(useCase)));

										// check link src from _edge_actor to step
										JavaSDM.ensure(step.equals(_edge_actor
												.getSrc()));

										// check link stepAlternative from alt to step
										JavaSDM.ensure(step.equals(alt
												.eContainer()));

										// check link steps from step to flow
										JavaSDM.ensure(flow.equals(step
												.eContainer()));

										// check link steps from step to altFlow
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(step,
														AlternativeFlow.class,
														"$eContainer")
												.contains(altFlow)));

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
										fujaba__Success = this
												.isAppropriate_FWD(match,
														packageDeclaration,
														actor, sysActor, flow,
														useCase, step, alt,
														altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_102(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_955289 = null;
		NormalStep __DEC_alt_stepAlternative_644566 = null;
		Flow __DEC_step_steps_630937 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_833459 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_833459 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterPackageDeclarationToSysActor = null;
		Actor sysActor = null;
		BasicFlow flow = null;
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
			_TmpObject = step.eContainer() instanceof BasicFlow ? (BasicFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			flow = (BasicFlow) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(step));

			// check link trg from _edge_ref to altFlow
			JavaSDM.ensure(altFlow.equals(_edge_ref.getTrg()));

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
									__DEC_altFlow_flows_955289 = altFlow
											.eContainer() instanceof UseCase ? (UseCase) altFlow
											.eContainer() : null;

									// check object __DEC_altFlow_flows_955289 is really bound
									JavaSDM.ensure(__DEC_altFlow_flows_955289 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_altFlow_flows_955289
											.getFlows().contains(altFlow));

									// check isomorphic binding between objects __DEC_altFlow_flows_955289 and useCase 
									JavaSDM.ensure(!__DEC_altFlow_flows_955289
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
									__DEC_alt_stepAlternative_644566 = alt
											.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object __DEC_alt_stepAlternative_644566 is really bound
									JavaSDM.ensure(__DEC_alt_stepAlternative_644566 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alt_stepAlternative_644566
											.getStepAlternative().contains(alt));

									// check isomorphic binding between objects __DEC_alt_stepAlternative_644566 and step 
									JavaSDM.ensure(!__DEC_alt_stepAlternative_644566
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
									__DEC_step_steps_630937 = step.eContainer() instanceof Flow ? (Flow) step
											.eContainer() : null;

									// check object __DEC_step_steps_630937 is really bound
									JavaSDM.ensure(__DEC_step_steps_630937 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_step_steps_630937
											.getSteps().contains(step));

									// check isomorphic binding between objects __DEC_step_steps_630937 and altFlow 
									JavaSDM.ensure(!__DEC_step_steps_630937
											.equals(altFlow));

									// check isomorphic binding between objects __DEC_step_steps_630937 and flow 
									JavaSDM.ensure(!__DEC_step_steps_630937
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

									// iterate to-many link ref from altFlow to __DEC_altFlow_ref_833459
									fujaba__Success = false;

									fujaba__IterAltFlowTo__DEC_altFlow_ref_833459 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															altFlow,
															AlternativeFlowAlternative.class,
															"ref")).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterAltFlowTo__DEC_altFlow_ref_833459
													.hasNext()) {
										try {
											__DEC_altFlow_ref_833459 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_833459
													.next();

											// check object __DEC_altFlow_ref_833459 is really bound
											JavaSDM.ensure(__DEC_altFlow_ref_833459 != null);
											// check isomorphic binding between objects __DEC_altFlow_ref_833459 and alt 
											JavaSDM.ensure(!__DEC_altFlow_ref_833459
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
								// check object sysActor is really bound
								JavaSDM.ensure(sysActor != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects sysActor and actor 
								JavaSDM.ensure(!sysActor.equals(actor));

								// check link actor from step to actor
								JavaSDM.ensure(actor.equals(step.getActor()));

								// check link ref from alt to altFlow
								JavaSDM.ensure(altFlow.equals(alt.getRef()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link actors from sysActor to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(sysActor.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link flows from altFlow to useCase
								JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(altFlow,
												UseCase.class, "$eContainer")
										.contains(useCase)));

								// check link src from _edge_ref to alt
								JavaSDM.ensure(alt.equals(_edge_ref.getSrc()));

								// check link stepAlternative from alt to step
								JavaSDM.ensure(step.equals(alt.eContainer()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link steps from step to altFlow
								JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(step,
												AlternativeFlow.class,
												"$eContainer")
										.contains(altFlow)));

								// check link trg from _edge_ref to altFlow
								JavaSDM.ensure(altFlow.equals(_edge_ref
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
										packageDeclaration, actor, sysActor,
										flow, useCase, step, alt, altFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_436(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_680769 = null;
		InteractionOperand __DEC_messageReceive_fragment_212736 = null;
		InteractionOperand __DEC_messageSend_fragment_18219 = null;
		Interaction __DEC_operand_enclosingInteraction_685421 = null;
		InteractionOperand __DEC_operand_fragment_256737 = null;
		InteractionOperand __DEC_guard_guard_308903 = null;
		CombinedFragment __DEC_operand_operand_10232 = null;
		Constraint __DEC_spec_specification_41158 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
		CombinedFragment combo = null;
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
							interaction = combo.getEnclosingInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

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
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link message from messageReceive
												JavaSDM.ensure(messageReceive
														.getMessage() == null);
												// negative check for link message from messageSend
												JavaSDM.ensure(messageSend
														.getMessage() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_680769 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_680769 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_680769 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_680769 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_680769
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
													__DEC_messageReceive_fragment_212736 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_212736 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_212736 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_212736 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_212736
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
													__DEC_messageSend_fragment_18219 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_18219 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_18219 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_18219 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_18219
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
													__DEC_operand_enclosingInteraction_685421 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_685421 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_685421 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_685421 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_685421
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_256737 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_256737 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_256737 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_256737 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_256737
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
													__DEC_guard_guard_308903 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_308903 is really bound
													JavaSDM.ensure(__DEC_guard_guard_308903 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_308903
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_308903 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_308903
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
													__DEC_operand_operand_10232 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_10232 is really bound
													JavaSDM.ensure(__DEC_operand_operand_10232 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_10232
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_10232 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_10232
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
													__DEC_spec_specification_41158 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_41158 is really bound
													JavaSDM.ensure(__DEC_spec_specification_41158 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_41158
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_41158 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_41158
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link receiveEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link receiveEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link sendEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"sendEvent")
														.size() == 0);
												// negative check for link sendEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"sendEvent")
														.size() == 0);
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
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

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

												// check link operand from operand to combo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(combo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
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
																combo, operand,
																interaction,
																messageReceive,
																line, guard,
																spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_437(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_432987 = null;
		InteractionOperand __DEC_messageReceive_fragment_965964 = null;
		InteractionOperand __DEC_messageSend_fragment_865526 = null;
		Interaction __DEC_operand_enclosingInteraction_891737 = null;
		InteractionOperand __DEC_operand_fragment_732111 = null;
		InteractionOperand __DEC_guard_guard_573001 = null;
		CombinedFragment __DEC_operand_operand_537852 = null;
		Constraint __DEC_spec_specification_886123 = null;
		Match match = null;
		Iterator fujaba__IterComboTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterSysLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToSysLine = null;
		Lifeline sysLine = null;
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
							interaction = combo.getEnclosingInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

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
									// bind object
									guard = operand.getGuard();

									// check object guard is really bound
									JavaSDM.ensure(guard != null);

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// check link coveredBy from line to operand
									JavaSDM.ensure(line.getCoveredBy()
											.contains(operand));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// iterate to-many link trg from combo to _edge_coveredBy
											fujaba__Success = false;

											fujaba__IterComboTo_edge_coveredBy = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	combo,
																	EMoflonEdge.class,
																	"trg"))
													.iterator();

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

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_432987 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_432987 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_432987 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_432987 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_432987
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
															__DEC_messageReceive_fragment_965964 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_965964 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_965964 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_965964 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_965964
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
															__DEC_messageSend_fragment_865526 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_865526 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_865526 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_865526 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_865526
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
															__DEC_operand_enclosingInteraction_891737 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_891737 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_891737 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_891737 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_891737
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_732111 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_732111 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_732111 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_732111 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_732111
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
															__DEC_guard_guard_573001 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_573001 is really bound
															JavaSDM.ensure(__DEC_guard_guard_573001 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_573001
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_573001 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_573001
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
															__DEC_operand_operand_537852 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_537852 is really bound
															JavaSDM.ensure(__DEC_operand_operand_537852 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_537852
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_537852 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_537852
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
															__DEC_spec_specification_886123 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_886123 is really bound
															JavaSDM.ensure(__DEC_spec_specification_886123 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_886123
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_886123 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_886123
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
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

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_438(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_63061 = null;
		InteractionOperand __DEC_messageReceive_fragment_823035 = null;
		InteractionOperand __DEC_messageSend_fragment_650788 = null;
		Interaction __DEC_operand_enclosingInteraction_710163 = null;
		InteractionOperand __DEC_operand_fragment_597960 = null;
		InteractionOperand __DEC_guard_guard_514756 = null;
		CombinedFragment __DEC_operand_operand_767171 = null;
		Constraint __DEC_spec_specification_892063 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		InteractionOperand operand = null;
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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

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
							// bind object
							interaction = combo.getEnclosingInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

							// check link coveredBy from line to combo
							JavaSDM.ensure(line.getCoveredBy().contains(combo));

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
									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// negative check for link message from messageReceive
												JavaSDM.ensure(messageReceive
														.getMessage() == null);
												// negative check for link message from messageSend
												JavaSDM.ensure(messageSend
														.getMessage() == null);
												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_63061 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_63061 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_63061 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_63061 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_63061
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
													__DEC_messageReceive_fragment_823035 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_823035 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_823035 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_823035 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_823035
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
													__DEC_messageSend_fragment_650788 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_650788 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_650788 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_650788 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_650788
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
													__DEC_operand_enclosingInteraction_710163 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_710163 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_710163 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_710163 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_710163
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_597960 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_597960 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_597960 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_597960 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_597960
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
													__DEC_guard_guard_514756 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_514756 is really bound
													JavaSDM.ensure(__DEC_guard_guard_514756 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_514756
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_514756 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_514756
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
													__DEC_operand_operand_767171 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_767171 is really bound
													JavaSDM.ensure(__DEC_operand_operand_767171 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_767171
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_767171 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_767171
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
													__DEC_spec_specification_892063 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_892063 is really bound
													JavaSDM.ensure(__DEC_spec_specification_892063 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_892063
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_892063 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_892063
															.equals(guard));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link receiveEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link receiveEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"receiveEvent")
														.size() == 0);
												// negative check for link sendEvent from messageReceive
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageReceive,
																Message.class,
																"sendEvent")
														.size() == 0);
												// negative check for link sendEvent from messageSend
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																messageSend,
																Message.class,
																"sendEvent")
														.size() == 0);
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
												// check object messageReceive is really bound
												JavaSDM.ensure(messageReceive != null);
												// check object messageSend is really bound
												JavaSDM.ensure(messageSend != null);
												// check object operand is really bound
												JavaSDM.ensure(operand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check object sysLine is really bound
												JavaSDM.ensure(sysLine != null);
												// check isomorphic binding between objects sysLine and line 
												JavaSDM.ensure(!sysLine
														.equals(line));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from messageReceive to interaction
												JavaSDM.ensure(interaction.equals(messageReceive
														.getEnclosingInteraction()));

												// check link fragment from messageSend to interaction
												JavaSDM.ensure(interaction.equals(messageSend
														.getEnclosingInteraction()));

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

												// check link operand from operand to combo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(combo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_coveredBy to line
												JavaSDM.ensure(line
														.equals(_edge_coveredBy
																.getSrc()));

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
																combo, operand,
																interaction,
																messageReceive,
																line, guard,
																spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_439(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_410917 = null;
		InteractionOperand __DEC_messageReceive_fragment_57976 = null;
		InteractionOperand __DEC_messageSend_fragment_527870 = null;
		Interaction __DEC_operand_enclosingInteraction_810783 = null;
		InteractionOperand __DEC_operand_fragment_825942 = null;
		InteractionOperand __DEC_guard_guard_958714 = null;
		CombinedFragment __DEC_operand_operand_955422 = null;
		Constraint __DEC_spec_specification_403214 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		InteractionOperand operand = null;
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

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;

			// bind object
			guard = operand.getGuard();

			// check object guard is really bound
			JavaSDM.ensure(guard != null);

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

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
									// bind object
									interaction = combo
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

									// iterate to-many link fragment from interaction to messageReceive
									fujaba__Success = false;

									fujaba__IterInteractionToMessageReceive = new ArrayList(
											interaction.getFragment())
											.iterator();

									while (fujaba__IterInteractionToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterInteractionToMessageReceive
													.next();

											// ensure correct type and really bound of object messageReceive
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageReceive = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// iterate to-many link trg from operand to _edge_coveredBy
											fujaba__Success = false;

											fujaba__IterOperandTo_edge_coveredBy = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	operand,
																	EMoflonEdge.class,
																	"trg"))
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
													JavaSDM.ensure(line
															.equals(_edge_coveredBy
																	.getSrc()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_410917 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_410917 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_410917 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_410917 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_410917
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
															__DEC_messageReceive_fragment_57976 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_57976 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_57976 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_57976 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_57976
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
															__DEC_messageSend_fragment_527870 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_527870 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_527870 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_527870 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_527870
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
															__DEC_operand_enclosingInteraction_810783 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_810783 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_810783 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_810783 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_810783
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_825942 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_825942 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_825942 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_825942 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_825942
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
															__DEC_guard_guard_958714 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_958714 is really bound
															JavaSDM.ensure(__DEC_guard_guard_958714 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_958714
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_958714 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_958714
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
															__DEC_operand_operand_955422 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_955422 is really bound
															JavaSDM.ensure(__DEC_operand_operand_955422 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_955422
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_955422 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_955422
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
															__DEC_spec_specification_403214 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_403214 is really bound
															JavaSDM.ensure(__DEC_spec_specification_403214 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_403214
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_403214 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_403214
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
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

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_covered to operand
														JavaSDM.ensure(operand
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
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_440(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_581012 = null;
		InteractionOperand __DEC_messageReceive_fragment_772750 = null;
		InteractionOperand __DEC_messageSend_fragment_11147 = null;
		Interaction __DEC_operand_enclosingInteraction_332169 = null;
		InteractionOperand __DEC_operand_fragment_643924 = null;
		InteractionOperand __DEC_guard_guard_674869 = null;
		CombinedFragment __DEC_operand_operand_377755 = null;
		Constraint __DEC_spec_specification_409808 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
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
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link trg from _edge_guard to guard
			JavaSDM.ensure(guard.equals(_edge_guard.getTrg()));

			// iterate to-many link coveredBy from operand to line
			fujaba__Success = false;

			fujaba__IterOperandToLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
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
									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

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
											interaction = messageSend
													.getEnclosingInteraction();

											// check object interaction is really bound
											JavaSDM.ensure(interaction != null);

											// check link fragment from combo to interaction
											JavaSDM.ensure(interaction.equals(combo
													.getEnclosingInteraction()));

											// check link lifeline from line to interaction
											JavaSDM.ensure(interaction
													.equals(line
															.getInteraction()));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_581012 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_581012 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_581012 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_581012 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_581012
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
															__DEC_messageReceive_fragment_772750 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_772750 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_772750 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_772750 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_772750
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
															__DEC_messageSend_fragment_11147 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_11147 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_11147 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_11147 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_11147
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
															__DEC_operand_enclosingInteraction_332169 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_332169 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_332169 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_332169 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_332169
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_643924 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_643924 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_643924 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_643924 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_643924
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
															__DEC_guard_guard_674869 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_674869 is really bound
															JavaSDM.ensure(__DEC_guard_guard_674869 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_674869
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_674869 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_674869
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
															__DEC_operand_operand_377755 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_377755 is really bound
															JavaSDM.ensure(__DEC_operand_operand_377755 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_377755
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_377755 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_377755
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
															__DEC_spec_specification_409808 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_409808 is really bound
															JavaSDM.ensure(__DEC_spec_specification_409808 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_409808
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_409808 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_409808
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check object sysLine is really bound
														JavaSDM.ensure(sysLine != null);
														// check isomorphic binding between objects sysLine and line 
														JavaSDM.ensure(!sysLine
																.equals(line));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_guard to operand
														JavaSDM.ensure(operand
																.equals(_edge_guard
																		.getSrc()));

														// check link trg from _edge_guard to guard
														JavaSDM.ensure(guard
																.equals(_edge_guard
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_441(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_516093 = null;
		InteractionOperand __DEC_messageReceive_fragment_100651 = null;
		InteractionOperand __DEC_messageSend_fragment_145705 = null;
		Interaction __DEC_operand_enclosingInteraction_954411 = null;
		InteractionOperand __DEC_operand_fragment_832159 = null;
		InteractionOperand __DEC_guard_guard_438761 = null;
		CombinedFragment __DEC_operand_operand_948367 = null;
		Constraint __DEC_spec_specification_439949 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterSysLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterSysLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterOperandToSysLine = null;
		Lifeline sysLine = null;
		Iterator fujaba__IterOperandToLine = null;
		Lifeline line = null;
		LiteralString spec = null;
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
			_TmpObject = _edge_specification.getTrg();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

			// check link specification from spec to guard
			JavaSDM.ensure(guard.equals(spec.eContainer()));

			// iterate to-many link coveredBy from operand to line
			fujaba__Success = false;

			fujaba__IterOperandToLine = new ArrayList(operand.getCovered())
					.iterator();

			while (fujaba__IterOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
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
									// bind object
									interaction = combo
											.getEnclosingInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link lifeline from line to interaction
									JavaSDM.ensure(interaction.equals(line
											.getInteraction()));

									// check link coveredBy from line to combo
									JavaSDM.ensure(line.getCoveredBy()
											.contains(combo));

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
											// check link fragment from messageSend to interaction
											JavaSDM.ensure(interaction.equals(messageSend
													.getEnclosingInteraction()));

											// iterate to-many link fragment from interaction to messageReceive
											fujaba__Success = false;

											fujaba__IterInteractionToMessageReceive = new ArrayList(
													interaction.getFragment())
													.iterator();

											while (fujaba__IterInteractionToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterInteractionToMessageReceive
															.next();

													// ensure correct type and really bound of object messageReceive
													JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
													messageReceive = (MessageOccurrenceSpecification) _TmpObject;
													// check isomorphic binding between objects messageSend and messageReceive 
													JavaSDM.ensure(!messageSend
															.equals(messageReceive));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// negative check for link message from messageReceive
														JavaSDM.ensure(messageReceive
																.getMessage() == null);
														// negative check for link message from messageSend
														JavaSDM.ensure(messageSend
																.getMessage() == null);
														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_516093 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_516093 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_516093 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_516093 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_516093
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
															__DEC_messageReceive_fragment_100651 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_100651 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_100651 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_100651 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_100651
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
															__DEC_messageSend_fragment_145705 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_145705 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_145705 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_145705 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_145705
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
															__DEC_operand_enclosingInteraction_954411 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_954411 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_954411 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_954411 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_954411
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_832159 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_832159 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_832159 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_832159 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_832159
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
															__DEC_guard_guard_438761 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_438761 is really bound
															JavaSDM.ensure(__DEC_guard_guard_438761 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_438761
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_438761 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_438761
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
															__DEC_operand_operand_948367 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_948367 is really bound
															JavaSDM.ensure(__DEC_operand_operand_948367 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_948367
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_948367 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_948367
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
															__DEC_spec_specification_439949 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_439949 is really bound
															JavaSDM.ensure(__DEC_spec_specification_439949 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_439949
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_439949 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_439949
																	.equals(guard));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link receiveEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link receiveEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"receiveEvent")
																.size() == 0);
														// negative check for link sendEvent from messageReceive
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageReceive,
																		Message.class,
																		"sendEvent")
																.size() == 0);
														// negative check for link sendEvent from messageSend
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		messageSend,
																		Message.class,
																		"sendEvent")
																.size() == 0);
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
														// check object messageReceive is really bound
														JavaSDM.ensure(messageReceive != null);
														// check object messageSend is really bound
														JavaSDM.ensure(messageSend != null);
														// check object operand is really bound
														JavaSDM.ensure(operand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check object sysLine is really bound
														JavaSDM.ensure(sysLine != null);
														// check isomorphic binding between objects sysLine and line 
														JavaSDM.ensure(!sysLine
																.equals(line));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from messageReceive to interaction
														JavaSDM.ensure(interaction
																.equals(messageReceive
																		.getEnclosingInteraction()));

														// check link fragment from messageSend to interaction
														JavaSDM.ensure(interaction
																.equals(messageSend
																		.getEnclosingInteraction()));

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

														// check link operand from operand to combo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(combo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_specification to guard
														JavaSDM.ensure(guard
																.equals(_edge_specification
																		.getSrc()));

														// check link trg from _edge_specification to spec
														JavaSDM.ensure(spec
																.equals(_edge_specification
																		.getTrg()));

														// check link coveredBy from line to combo
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(combo));

														// check link coveredBy from line to operand
														JavaSDM.ensure(line
																.getCoveredBy()
																.contains(
																		operand));

														// check link coveredBy from combo to sysLine
														JavaSDM.ensure(combo
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from messageSend to sysLine
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(
																		sysLine));

														// check link coveredBy from operand to sysLine
														JavaSDM.ensure(operand
																.getCovered()
																.contains(
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
																		match,
																		sysLine,
																		messageSend,
																		combo,
																		operand,
																		interaction,
																		messageReceive,
																		line,
																		guard,
																		spec);
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
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_LIFELINE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(FlowToInteractionFragment) arguments.get(7),
					(BasicFlow) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(ActorToLifeline) arguments.get(11),
					(NormalStep) arguments.get(12),
					(AlternativeFlowAlternative) arguments.get(13),
					(Lifeline) arguments.get(14),
					(AlternativeFlow) arguments.get(15));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23), (EObject) arguments.get(24));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(CombinedFragment) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(Interaction) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(MessageOccurrenceSpecification) arguments.get(11),
					(BasicFlow) arguments.get(12), (UseCase) arguments.get(13),
					(UseCaseToInteraction) arguments.get(14),
					(ActorToLifeline) arguments.get(15),
					(Lifeline) arguments.get(16),
					(InteractionConstraint) arguments.get(17),
					(LiteralString) arguments.get(18));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23), (EObject) arguments.get(24));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_424__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_424((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_425__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_425((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_426__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_426((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_427__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_427((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_428__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_428((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_429__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_429((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_430__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_430((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_431__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_431((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_432__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_432((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_433__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_433((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_434__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_434((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_435__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_435((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_99((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_100((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_101__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_101((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_102((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_436__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_436((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_437__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_437((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_438__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_438((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_439__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_439((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_440__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_440((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_441__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_441((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltUserStepBFToComboRuleImpl
