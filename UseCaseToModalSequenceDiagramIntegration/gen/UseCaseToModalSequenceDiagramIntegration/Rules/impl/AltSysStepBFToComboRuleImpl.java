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
import UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule;
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
 * An implementation of the model object '<em><b>Alt Sys Step BF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltSysStepBFToComboRuleImpl extends AbstractRuleImpl implements
		AltSysStepBFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltSysStepBFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltSysStepBFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, BasicFlow flow,
			UseCase useCase, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
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
					useCase, packageDeclaration, step, alt, altFlow));

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
						step, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						altFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_altFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				__step_actor_actor.setTrg(actor);

				// create link
				__flow_steps_step.setSrc(flow);

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
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_flow.setSrc(useCase);

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
			this.registerObjectsToMatch_FWD(match, actor, flow, useCase,
					packageDeclaration, step, alt, altFlow);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
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
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		CombinedFragment combo = null;
		MessageOccurrenceSpecification messageReceive = null;
		NormalStepToCombinedFragment stepToCombo = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		InteractionConstraint guard = null;
		FlowToInteractionFragment altFlowToOperand = null;
		LiteralString spec = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge line__coveredBy__combo = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge messageReceive__enclosingInteraction__interaction = null;
		EMoflonEdge interaction__fragment__combo = null;
		EMoflonEdge guard__specification__spec = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge line__coveredBy__messageSend = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge interaction__fragment__messageSend = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge combo__covered__line = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge combo__enclosingInteraction__interaction = null;
		EMoflonEdge messageSend__enclosingInteraction__interaction = null;
		EMoflonEdge messageSend__covered__line = null;
		EMoflonEdge interaction__fragment__messageReceive = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge combo__operand__operand = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
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

			// create object operand
			operand = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionOperand();

			// create object combo
			combo = ModalSequenceDiagramFactory.eINSTANCE
					.createCombinedFragment();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object guard
			guard = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionConstraint();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

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
			messageSend.getCovered().add(line);

			// create link
			operand.getCovered().add(line);

			// create link
			combo.getCovered().add(line);

			// create link
			interaction.getFragment().add(messageSend);

			// create link
			combo.setEnclosingInteraction(interaction);

			// create link
			messageReceive.setEnclosingInteraction(interaction);

			// create link
			combo.getOperand().add(operand); // add link

			// create link
			stepToCombo.setTarget(combo);

			// create link
			stepToCombo.setSource(step);

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			altFlowToOperand.setTarget(operand);

			// create link
			alternative1ToOperand.setTarget(operand);

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
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__combo
			line__coveredBy__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingInteraction__interaction
			messageReceive__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__combo
			interaction__fragment__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageSend
			line__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageSend
			interaction__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__covered__line
			combo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__enclosingInteraction__interaction
			combo__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingInteraction__interaction
			messageSend__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__covered__line
			messageSend__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__messageReceive
			interaction__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltSysStepBFToComboRule");
			// assign attribute line__coveredBy__messageSend
			line__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__line
			messageSend__covered__line.setName("covered");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__enclosingInteraction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingInteraction__interaction,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			line__coveredBy__combo.setSrc(line);

			// create link
			messageSend__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageSend.setSrc(line);

			// create link
			combo__covered__line.setTrg(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			interaction__fragment__messageSend.setTrg(messageSend);

			// create link
			line__coveredBy__messageSend.setTrg(messageSend);

			// create link
			messageSend__enclosingInteraction__interaction.setSrc(messageSend);

			// create link
			messageSend__covered__line.setSrc(messageSend);

			// create link
			messageReceive__enclosingInteraction__interaction
					.setTrg(interaction);

			// create link
			combo__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			messageSend__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__combo.setSrc(interaction);

			// create link
			interaction__fragment__messageSend.setSrc(interaction);

			// create link
			interaction__fragment__messageReceive.setSrc(interaction);

			// create link
			combo__covered__line.setSrc(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			interaction__fragment__combo.setTrg(combo);

			// create link
			line__coveredBy__combo.setTrg(combo);

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			combo__enclosingInteraction__interaction.setSrc(combo);

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
			stepToCombo__source__step.setTrg(step);

			// create link
			__step_stepAlternative_alt.setSrc(step);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			__alt_ref_altFlow.setSrc(alt);

			// create link
			__step_stepAlternative_alt.setTrg(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			alternative1ToOperand__source__alt.setSrc(alternative1ToOperand);

			// create link
			alternative1ToOperand__target__operand
					.setSrc(alternative1ToOperand);

			// create link
			operand__guard__guard.setTrg(guard);

			// create link
			guard__specification__spec.setSrc(guard);

			// create link
			guard__specification__spec.setTrg(spec);

			// create link
			__alt_ref_altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__source__altFlow.setTrg(altFlow);

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
		this.registerObjects_FWD(ruleresult, actor, line, messageSend,
				interaction, combo, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, packageDeclaration, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand);
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
		UseCase useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
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
			ruleresult.setRule("AltSysStepBFToComboRule");

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

								// check link ref from alt to altFlow
								JavaSDM.ensure(altFlow.equals(alt.getRef()));

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

								// check link stepAlternative from alt to step
								JavaSDM.ensure(step.equals(alt.eContainer()));

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
										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __step_actor_actor
										__step_actor_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToInteraction_target_interaction
										__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
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

										// create object __step_stepAlternative_alt
										__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __alt_ref_altFlow
										__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

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
										__useCase_flows_flow.setName("flows");
										// assign attribute __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase
												.setName("source");
										// assign attribute __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction
												.setName("target");
										// assign attribute __flow_steps_step
										__flow_steps_step.setName("steps");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __step_stepAlternative_alt
										__step_stepAlternative_alt
												.setName("stepAlternative");
										// assign attribute __step_actor_actor
										__step_actor_actor.setName("actor");
										// assign attribute __alt_ref_altFlow
										__alt_ref_altFlow.setName("ref");

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__step_actor_actor.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__flowToInteraction_target_interaction
												.setTrg(interaction);

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
										__useCase_flows_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flowToInteraction_source_flow
												.setTrg(flow);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

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
										__step_stepAlternative_alt.setSrc(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										__step_actor_actor.setSrc(step);

										// create link
										__flow_steps_step.setTrg(step);

										// create link
										__alt_ref_altFlow.setSrc(alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alt);

										// create link
										__step_stepAlternative_alt.setTrg(alt);

										// create link
										__alt_ref_altFlow.setTrg(altFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														altFlow);

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
														__useCaseToInteraction_target_interaction,
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
														__packageDeclaration_actors_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__step_stepAlternative_alt,
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
															flowToInteraction,
															flow,
															useCase,
															useCaseToInteraction,
															packageDeclaration,
															step, alt, altFlow));

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
														.setRuleName("AltSysStepBFToComboRule");
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
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
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
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
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
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("alt", alt);
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
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
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
	public boolean isAppropriate_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __messageSend_covered_line = null;
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

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, line,
					messageSend, interaction, combo, messageReceive, operand,
					guard, spec));

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
				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// create object __interaction_fragment_messageSend
				__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingInteraction_interaction
				__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_messageReceive
				__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_enclosingInteraction_interaction
				__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_combo
				__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingInteraction_interaction
				__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageSend
				__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_line
				__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_coveredBy_messageSend
				__line_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_line
				__messageSend_covered_line.setName("covered");
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

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_line, "toBeTranslatedEdges");

				// create link
				__messageSend_covered_line.setTrg(line);

				// create link
				__combo_covered_line.setTrg(line);

				// create link
				__line_coveredBy_messageSend.setSrc(line);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__messageSend_covered_line.setSrc(messageSend);

				// create link
				__line_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__interaction_fragment_messageSend.setTrg(messageSend);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setSrc(messageSend);

				// create link
				__interaction_fragment_messageReceive.setSrc(interaction);

				// create link
				__combo_enclosingInteraction_interaction.setTrg(interaction);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_fragment_messageSend.setSrc(interaction);

				// create link
				__messageSend_enclosingInteraction_interaction
						.setTrg(interaction);

				// create link
				__interaction_fragment_combo.setSrc(interaction);

				// create link
				__combo_enclosingInteraction_interaction.setSrc(combo);

				// create link
				__interaction_fragment_combo.setTrg(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__interaction_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingInteraction_interaction
						.setSrc(messageReceive);

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
			this.registerObjectsToMatch_BWD(match, line, messageSend,
					interaction, combo, messageReceive, operand, guard, spec);
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
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep step = null;
		NormalStepToCombinedFragment stepToCombo = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		FlowToInteractionFragment altFlowToOperand = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge step__stepAlternative__alt = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __line_coveredBy_combo = null;

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

			// create object stepToCombo
			stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createNormalStepToCombinedFragment();

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object altFlow
			altFlow = UseCaseDSLFactory.eINSTANCE.createAlternativeFlow();

			// create object alternative1ToOperand
			alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object altFlowToOperand
			altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

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
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
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

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects useCaseToInteraction and actor 
			JavaSDM.ensure(!useCaseToInteraction.equals(actor));

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

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects useCaseToInteraction and spec 
			JavaSDM.ensure(!useCaseToInteraction.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCaseToInteraction and step 
			JavaSDM.ensure(!useCaseToInteraction.equals(step));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and stepToCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(stepToCombo));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_enclosingInteraction_interaction
			__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_covered_line
			__combo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_combo
			__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_enclosingInteraction_interaction
			__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_line
			__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingInteraction_interaction
			__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_messageSend
			__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageSend
			__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __interaction_fragment_messageReceive
			__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_combo
			__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltSysStepBFToComboRule");
			// assign attribute __line_coveredBy_messageSend
			__line_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_line
			__messageSend_covered_line.setName("covered");
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

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__combo_enclosingInteraction_interaction,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingInteraction_interaction,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_combo, "translatedEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__messageSend_covered_line.setTrg(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__line_coveredBy_messageSend.setSrc(line);

			// create link
			__combo_covered_line.setTrg(line);

			// create link
			__line_coveredBy_combo.setSrc(line);

			// create link
			__interaction_fragment_messageSend.setTrg(messageSend);

			// create link
			__messageSend_enclosingInteraction_interaction.setSrc(messageSend);

			// create link
			__messageSend_covered_line.setSrc(messageSend);

			// create link
			__line_coveredBy_messageSend.setTrg(messageSend);

			// create link
			__interaction_fragment_messageSend.setSrc(interaction);

			// create link
			__interaction_fragment_combo.setSrc(interaction);

			// create link
			__messageSend_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_messageReceive.setSrc(interaction);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setTrg(interaction);

			// create link
			__combo_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__combo_enclosingInteraction_interaction.setSrc(combo);

			// create link
			__combo_covered_line.setSrc(combo);

			// create link
			__interaction_fragment_combo.setTrg(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			__line_coveredBy_combo.setTrg(combo);

			// create link
			__interaction_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__messageReceive_enclosingInteraction_interaction
					.setSrc(messageReceive);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

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
			alt__ref__altFlow.setTrg(altFlow);

			// create link
			altFlowToOperand__source__altFlow.setTrg(altFlow);

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
		this.registerObjects_BWD(ruleresult, actor, line, messageSend,
				interaction, combo, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, packageDeclaration, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand);
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
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __messageSend_enclosingInteraction_interaction = null;
		EMoflonEdge __interaction_fragment_messageSend = null;
		EMoflonEdge __flowToInteraction_target_interaction = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __messageReceive_enclosingInteraction_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __interaction_fragment_messageReceive = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __flowToInteraction_source_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __guard_specification_spec = null;
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
			ruleresult.setRule("AltSysStepBFToComboRule");

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
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
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
								JavaSDM.ensure(interaction.equals(messageSend
										.getEnclosingInteraction()));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link source from flowToInteraction to flow
								JavaSDM.ensure(flow.equals(flowToInteraction
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

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
										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_covered_line
										__combo_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_combo
										__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_operand
										__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_covered_line
										__operand_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_covered_line
										__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageSend
										__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_enclosingInteraction_interaction
										__messageSend_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_fragment_messageSend
										__interaction_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToInteraction_target_interaction
										__flowToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_fragment_combo
										__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_enclosingInteraction_interaction
										__messageReceive_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_fragment_messageReceive
										__interaction_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_enclosingInteraction_interaction
										__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_operand_operand
										__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToInteraction_source_flow
										__flowToInteraction_source_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_guard_guard
										__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __guard_specification_spec
										__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __line_coveredBy_messageSend
										__line_coveredBy_messageSend
												.setName("coveredBy");
										// assign attribute __messageSend_covered_line
										__messageSend_covered_line
												.setName("covered");
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
										__useCase_flows_flow.setName("flows");
										// assign attribute __useCaseToInteraction_source_useCase
										__useCaseToInteraction_source_useCase
												.setName("source");
										// assign attribute __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction
												.setName("target");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
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

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										__combo_covered_line.setTrg(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__line_coveredBy_combo.setSrc(line);

										// create link
										__line_coveredBy_operand.setSrc(line);

										// create link
										__operand_covered_line.setTrg(line);

										// create link
										__messageSend_covered_line.setTrg(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__line_coveredBy_messageSend
												.setSrc(line);

										// create link
										__line_coveredBy_messageSend
												.setTrg(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__messageSend_covered_line
												.setSrc(messageSend);

										// create link
										__messageSend_enclosingInteraction_interaction
												.setSrc(messageSend);

										// create link
										__interaction_fragment_messageSend
												.setTrg(messageSend);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__flowToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__interaction_fragment_combo
												.setSrc(interaction);

										// create link
										__messageReceive_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__interaction_fragment_messageReceive
												.setSrc(interaction);

										// create link
										__interaction_fragment_messageSend
												.setSrc(interaction);

										// create link
										__messageSend_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										__combo_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										__interaction_fragment_combo
												.setTrg(combo);

										// create link
										__combo_covered_line.setSrc(combo);

										// create link
										__combo_enclosingInteraction_interaction
												.setSrc(combo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__line_coveredBy_combo.setTrg(combo);

										// create link
										__combo_operand_operand.setSrc(combo);

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
										__messageReceive_enclosingInteraction_interaction
												.setSrc(messageReceive);

										// create link
										__interaction_fragment_messageReceive
												.setTrg(messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flowToInteraction_source_flow
												.setTrg(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

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
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__operand_guard_guard.setSrc(operand);

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
										isApplicableMatch
												.getAllContextElements().add(
														spec);

										// create link
										__guard_specification_spec.setTrg(spec);

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
														__flowToInteraction_target_interaction,
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
														__interaction_fragment_combo,
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
														__messageSend_enclosingInteraction_interaction,
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
														__packageDeclaration_useCases_useCase,
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
														__line_interaction_interaction,
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
														__guard_specification_spec,
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
														__operand_guard_guard,
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
														__flowToInteraction_source_flow,
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
															combo,
															flowToInteraction,
															messageReceive,
															flow,
															useCase,
															useCaseToInteraction,
															packageDeclaration,
															operand, guard,
															spec));

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
														.setRuleName("AltSysStepBFToComboRule");
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
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("combo", combo);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
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
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("operand", operand);
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
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
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
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
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
								.getLiteralString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_409(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_845593 = null;
		InteractionOperand __DEC_messageReceive_fragment_568572 = null;
		InteractionOperand __DEC_messageSend_fragment_118540 = null;
		Interaction __DEC_operand_enclosingInteraction_323222 = null;
		InteractionOperand __DEC_operand_fragment_285151 = null;
		InteractionOperand __DEC_guard_guard_528509 = null;
		CombinedFragment __DEC_operand_operand_821911 = null;
		Constraint __DEC_spec_specification_947711 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Interaction interaction = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
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
					_TmpObject = _edge_coveredBy.getTrg();

					// ensure correct type and really bound of object messageSend
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageSend = (MessageOccurrenceSpecification) _TmpObject;

					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_845593 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_845593 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_845593 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_845593 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_845593
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_568572 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_568572 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_568572 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_568572 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_568572
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_118540 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_118540 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_118540 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_118540 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_118540
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_323222 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_323222 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_323222 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_323222 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_323222
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_285151 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_285151 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_285151 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_285151 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_285151
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
											__DEC_guard_guard_528509 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_528509 is really bound
											JavaSDM.ensure(__DEC_guard_guard_528509 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_528509
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_528509 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_528509
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_821911 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_821911 is really bound
											JavaSDM.ensure(__DEC_operand_operand_821911 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_821911
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_821911 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_821911
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
											__DEC_spec_specification_947711 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_947711 is really bound
											JavaSDM.ensure(__DEC_spec_specification_947711 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_947711
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_947711 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_947711
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_coveredBy to messageSend
										JavaSDM.ensure(messageSend
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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_410(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_554397 = null;
		InteractionOperand __DEC_messageReceive_fragment_613207 = null;
		InteractionOperand __DEC_messageSend_fragment_867927 = null;
		Interaction __DEC_operand_enclosingInteraction_377906 = null;
		InteractionOperand __DEC_operand_fragment_320959 = null;
		InteractionOperand __DEC_guard_guard_471460 = null;
		CombinedFragment __DEC_operand_operand_277867 = null;
		Constraint __DEC_spec_specification_388450 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		LiteralString spec = null;
		Interaction interaction = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Lifeline line = null;
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

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// check link coveredBy from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

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
					// bind object
					guard = operand.getGuard();

					// check object guard is really bound
					JavaSDM.ensure(guard != null);

					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link operand from operand to combo
							JavaSDM.ensure(combo.equals(operand.eContainer()));

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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

									// iterate to-many link src from line to _edge_coveredBy
									fujaba__Success = false;

									fujaba__IterLineTo_edge_coveredBy = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(line,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterLineTo_edge_coveredBy
											.hasNext()) {
										try {
											_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
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
													__DEC_combo_fragment_554397 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_554397 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_554397 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_554397 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_554397
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_613207 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_613207 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_613207 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_613207 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_613207
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_867927 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_867927 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_867927 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_867927 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_867927
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_377906 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_377906 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_377906 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_377906 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_377906
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_320959 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_320959 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_320959 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_320959 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_320959
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
													__DEC_guard_guard_471460 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_471460 is really bound
													JavaSDM.ensure(__DEC_guard_guard_471460 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_471460
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_471460 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_471460
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_277867 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_277867 is really bound
													JavaSDM.ensure(__DEC_operand_operand_277867 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_277867
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_277867 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_277867
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
													__DEC_spec_specification_388450 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_388450 is really bound
													JavaSDM.ensure(__DEC_spec_specification_388450 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_388450
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_388450 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_388450
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
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

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
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_covered to messageSend
												JavaSDM.ensure(messageSend
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

												// check link trg from _edge_coveredBy to messageSend
												JavaSDM.ensure(messageSend
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from combo to line
												JavaSDM.ensure(combo
														.getCovered().contains(
																line));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
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
																match, line,
																messageSend,
																interaction,
																combo,
																messageReceive,
																operand, guard,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_411(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_516160 = null;
		InteractionOperand __DEC_messageReceive_fragment_749651 = null;
		InteractionOperand __DEC_messageSend_fragment_851282 = null;
		Interaction __DEC_operand_enclosingInteraction_65323 = null;
		InteractionOperand __DEC_operand_fragment_352628 = null;
		InteractionOperand __DEC_guard_guard_70083 = null;
		CombinedFragment __DEC_operand_operand_570293 = null;
		Constraint __DEC_spec_specification_877 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
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

			// bind object
			interaction = combo.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link trg from _edge_enclosingInteraction to interaction
			JavaSDM.ensure(interaction.equals(_edge_enclosingInteraction
					.getTrg()));

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
					// iterate to-many link coveredBy from combo to line
					fujaba__Success = false;

					fujaba__IterComboToLine = new ArrayList(combo.getCovered())
							.iterator();

					while (fujaba__IterComboToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterComboToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

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
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// iterate to-many link coveredBy from line to operand
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
													__DEC_combo_fragment_516160 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_516160 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_516160 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_516160 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_516160
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_749651 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_749651 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_749651 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_749651 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_749651
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_851282 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_851282 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_851282 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_851282 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_851282
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_65323 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_65323 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_65323 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_65323 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_65323
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_352628 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_352628 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_352628 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_352628 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_352628
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
													__DEC_guard_guard_70083 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_70083 is really bound
													JavaSDM.ensure(__DEC_guard_guard_70083 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_70083
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_70083 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_70083
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_570293 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_570293 is really bound
													JavaSDM.ensure(__DEC_operand_operand_570293 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_570293
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_570293 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_570293
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
													__DEC_spec_specification_877 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_877 is really bound
													JavaSDM.ensure(__DEC_spec_specification_877 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_877
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_877 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_877
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
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_enclosingInteraction to combo
												JavaSDM.ensure(combo
														.equals(_edge_enclosingInteraction
																.getSrc()));

												// check link trg from _edge_enclosingInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_enclosingInteraction
																.getTrg()));

												// check link coveredBy from combo to line
												JavaSDM.ensure(combo
														.getCovered().contains(
																line));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
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
																match, line,
																messageSend,
																interaction,
																combo,
																messageReceive,
																operand, guard,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_412(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_520670 = null;
		InteractionOperand __DEC_messageReceive_fragment_105707 = null;
		InteractionOperand __DEC_messageSend_fragment_432018 = null;
		Interaction __DEC_operand_enclosingInteraction_121237 = null;
		InteractionOperand __DEC_operand_fragment_1840 = null;
		InteractionOperand __DEC_guard_guard_154733 = null;
		CombinedFragment __DEC_operand_operand_864402 = null;
		Constraint __DEC_spec_specification_365398 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterComboTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
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

			// iterate to-many link src from combo to _edge_enclosingInteraction
			fujaba__Success = false;

			fujaba__IterComboTo_edge_enclosingInteraction = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(combo,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterComboTo_edge_enclosingInteraction.hasNext()) {
				try {
					_edge_enclosingInteraction = (EMoflonEdge) fujaba__IterComboTo_edge_enclosingInteraction
							.next();

					// check object _edge_enclosingInteraction is really bound
					JavaSDM.ensure(_edge_enclosingInteraction != null);
					// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
					JavaSDM.ensure(!_edge_fragment
							.equals(_edge_enclosingInteraction));

					// iterate to-many link coveredBy from combo to line
					fujaba__Success = false;

					fujaba__IterComboToLine = new ArrayList(combo.getCovered())
							.iterator();

					while (fujaba__IterComboToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterComboToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
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

									// check link trg from _edge_enclosingInteraction to interaction
									JavaSDM.ensure(interaction
											.equals(_edge_enclosingInteraction
													.getTrg()));

									// iterate to-many link coveredBy from line to operand
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
															__DEC_combo_fragment_520670 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_520670 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_520670 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_520670 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_520670
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_105707 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_105707 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_105707 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_105707 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_105707
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_432018 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_432018 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_432018 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_432018 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_432018
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_121237 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_121237 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_121237 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_121237 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_121237
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_1840 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_1840 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_1840 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_1840 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_1840
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
															__DEC_guard_guard_154733 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_154733 is really bound
															JavaSDM.ensure(__DEC_guard_guard_154733 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_154733
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_154733 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_154733
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_864402 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_864402 is really bound
															JavaSDM.ensure(__DEC_operand_operand_864402 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_864402
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_864402 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_864402
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
															__DEC_spec_specification_365398 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_365398 is really bound
															JavaSDM.ensure(__DEC_spec_specification_365398 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_365398
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_365398 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_365398
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
														// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
														JavaSDM.ensure(!_edge_fragment
																.equals(_edge_enclosingInteraction));

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
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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

														// check link coveredBy from combo to line
														JavaSDM.ensure(combo
																.getCovered()
																.contains(line));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
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
																		line,
																		messageSend,
																		interaction,
																		combo,
																		messageReceive,
																		operand,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_413(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_963641 = null;
		InteractionOperand __DEC_messageReceive_fragment_728104 = null;
		InteractionOperand __DEC_messageSend_fragment_160079 = null;
		Interaction __DEC_operand_enclosingInteraction_715392 = null;
		InteractionOperand __DEC_operand_fragment_331344 = null;
		InteractionOperand __DEC_guard_guard_489105 = null;
		CombinedFragment __DEC_operand_operand_380172 = null;
		Constraint __DEC_spec_specification_730722 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// iterate to-many link coveredBy from line to operand
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
													__DEC_combo_fragment_963641 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_963641 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_963641 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_963641 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_963641
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_728104 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_728104 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_728104 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_728104 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_728104
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_160079 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_160079 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_160079 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_160079 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_160079
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_715392 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_715392 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_715392 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_715392 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_715392
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_331344 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_331344 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_331344 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_331344 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_331344
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
													__DEC_guard_guard_489105 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_489105 is really bound
													JavaSDM.ensure(__DEC_guard_guard_489105 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_489105
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_489105 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_489105
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_380172 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_380172 is really bound
													JavaSDM.ensure(__DEC_operand_operand_380172 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_380172
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_380172 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_380172
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
													__DEC_spec_specification_730722 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_730722 is really bound
													JavaSDM.ensure(__DEC_spec_specification_730722 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_730722
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_730722 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_730722
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
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_enclosingInteraction to messageSend
												JavaSDM.ensure(messageSend
														.equals(_edge_enclosingInteraction
																.getSrc()));

												// check link trg from _edge_enclosingInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_enclosingInteraction
																.getTrg()));

												// check link coveredBy from combo to line
												JavaSDM.ensure(combo
														.getCovered().contains(
																line));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
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
																match, line,
																messageSend,
																interaction,
																combo,
																messageReceive,
																operand, guard,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_414(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_88447 = null;
		InteractionOperand __DEC_messageReceive_fragment_926766 = null;
		InteractionOperand __DEC_messageSend_fragment_891358 = null;
		Interaction __DEC_operand_enclosingInteraction_927858 = null;
		InteractionOperand __DEC_operand_fragment_747567 = null;
		InteractionOperand __DEC_guard_guard_248285 = null;
		CombinedFragment __DEC_operand_operand_862099 = null;
		Constraint __DEC_spec_specification_979956 = null;
		Match match = null;
		Iterator fujaba__IterMessageSendTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterMessageSendToLine = null;
		Lifeline line = null;
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
							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// iterate to-many link coveredBy from line to operand
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
															__DEC_combo_fragment_88447 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_88447 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_88447 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_88447 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_88447
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_926766 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_926766 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_926766 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_926766 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_926766
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_891358 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_891358 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_891358 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_891358 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_891358
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_927858 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_927858 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_927858 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_927858 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_927858
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_747567 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_747567 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_747567 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_747567 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_747567
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
															__DEC_guard_guard_248285 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_248285 is really bound
															JavaSDM.ensure(__DEC_guard_guard_248285 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_248285
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_248285 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_248285
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_862099 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_862099 is really bound
															JavaSDM.ensure(__DEC_operand_operand_862099 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_862099
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_862099 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_862099
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
															__DEC_spec_specification_979956 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_979956 is really bound
															JavaSDM.ensure(__DEC_spec_specification_979956 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_979956
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_979956 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_979956
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
														// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
														JavaSDM.ensure(!_edge_fragment
																.equals(_edge_enclosingInteraction));

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
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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

														// check link coveredBy from combo to line
														JavaSDM.ensure(combo
																.getCovered()
																.contains(line));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
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
																		line,
																		messageSend,
																		interaction,
																		combo,
																		messageReceive,
																		operand,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_415(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_825506 = null;
		InteractionOperand __DEC_messageReceive_fragment_341733 = null;
		InteractionOperand __DEC_messageSend_fragment_598514 = null;
		Interaction __DEC_operand_enclosingInteraction_104289 = null;
		InteractionOperand __DEC_operand_fragment_844645 = null;
		InteractionOperand __DEC_guard_guard_344471 = null;
		CombinedFragment __DEC_operand_operand_334112 = null;
		Constraint __DEC_spec_specification_663109 = null;
		Match match = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToCombo = null;
		CombinedFragment combo = null;
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
									// check link coveredBy from combo to line
									JavaSDM.ensure(combo.getCovered().contains(
											line));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

									// iterate to-many link coveredBy from line to operand
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
													__DEC_combo_fragment_825506 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_825506 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_825506 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_825506 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_825506
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_341733 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_341733 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_341733 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_341733 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_341733
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_598514 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_598514 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_598514 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_598514 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_598514
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_104289 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_104289 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_104289 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_104289 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_104289
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_844645 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_844645 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_844645 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_844645 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_844645
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
													__DEC_guard_guard_344471 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_344471 is really bound
													JavaSDM.ensure(__DEC_guard_guard_344471 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_344471
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_344471 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_344471
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_334112 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_334112 is really bound
													JavaSDM.ensure(__DEC_operand_operand_334112 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_334112
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_334112 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_334112
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
													__DEC_spec_specification_663109 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_663109 is really bound
													JavaSDM.ensure(__DEC_spec_specification_663109 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_663109
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_663109 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_663109
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
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_enclosingInteraction to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_enclosingInteraction
																.getSrc()));

												// check link trg from _edge_enclosingInteraction to interaction
												JavaSDM.ensure(interaction
														.equals(_edge_enclosingInteraction
																.getTrg()));

												// check link coveredBy from combo to line
												JavaSDM.ensure(combo
														.getCovered().contains(
																line));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
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
																match, line,
																messageSend,
																interaction,
																combo,
																messageReceive,
																operand, guard,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_416(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_729323 = null;
		InteractionOperand __DEC_messageReceive_fragment_232745 = null;
		InteractionOperand __DEC_messageSend_fragment_373202 = null;
		Interaction __DEC_operand_enclosingInteraction_590084 = null;
		InteractionOperand __DEC_operand_fragment_689849 = null;
		InteractionOperand __DEC_guard_guard_100336 = null;
		CombinedFragment __DEC_operand_operand_639642 = null;
		Constraint __DEC_spec_specification_596001 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionToCombo = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterInteractionToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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
									// check link coveredBy from combo to line
									JavaSDM.ensure(combo.getCovered().contains(
											line));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

									// iterate to-many link coveredBy from line to operand
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
															__DEC_combo_fragment_729323 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_729323 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_729323 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_729323 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_729323
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_232745 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_232745 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_232745 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_232745 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_232745
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_373202 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_373202 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_373202 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_373202 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_373202
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_590084 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_590084 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_590084 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_590084 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_590084
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_689849 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_689849 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_689849 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_689849 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_689849
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
															__DEC_guard_guard_100336 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_100336 is really bound
															JavaSDM.ensure(__DEC_guard_guard_100336 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_100336
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_100336 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_100336
																	.equals(operand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_639642 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_639642 is really bound
															JavaSDM.ensure(__DEC_operand_operand_639642 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_639642
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_639642 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_639642
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
															__DEC_spec_specification_596001 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_596001 is really bound
															JavaSDM.ensure(__DEC_spec_specification_596001 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_596001
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_596001 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_596001
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
														// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
														JavaSDM.ensure(!_edge_fragment
																.equals(_edge_enclosingInteraction));

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
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
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

														// check link coveredBy from combo to line
														JavaSDM.ensure(combo
																.getCovered()
																.contains(line));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
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
																		line,
																		messageSend,
																		interaction,
																		combo,
																		messageReceive,
																		operand,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_95(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_877512 = null;
		NormalStep __DEC_alt_stepAlternative_914073 = null;
		Flow __DEC_step_steps_385373 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_119707 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_119707 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_altFlow_flows_877512 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_877512 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_877512 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_877512
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_877512 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_877512
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
							__DEC_alt_stepAlternative_914073 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_914073 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_914073 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_914073
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_914073 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_914073
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
							__DEC_step_steps_385373 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_385373 is really bound
							JavaSDM.ensure(__DEC_step_steps_385373 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_385373.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_385373 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_385373
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_385373 and flow 
							JavaSDM.ensure(!__DEC_step_steps_385373
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_119707
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_119707 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_119707
											.hasNext()) {
								try {
									__DEC_altFlow_ref_119707 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_119707
											.next();

									// check object __DEC_altFlow_ref_119707 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_119707 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_119707 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_119707
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
						fujaba__Success = this.isAppropriate_FWD(match, actor,
								flow, useCase, packageDeclaration, step, alt,
								altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_96(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_322172 = null;
		NormalStep __DEC_alt_stepAlternative_825 = null;
		Flow __DEC_step_steps_513186 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_695651 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_695651 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;
		UseCase useCase = null;
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
					__DEC_altFlow_flows_322172 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_322172 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_322172 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_322172.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_322172 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_322172.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_825 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_825 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_825 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_825
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_825 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_825.equals(step));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_step_steps_513186 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_513186 is really bound
					JavaSDM.ensure(__DEC_step_steps_513186 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_513186.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_513186 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_513186.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_513186 and flow 
					JavaSDM.ensure(!__DEC_step_steps_513186.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_695651
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_695651 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_695651
									.hasNext()) {
						try {
							__DEC_altFlow_ref_695651 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_695651
									.next();

							// check object __DEC_altFlow_ref_695651 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_695651 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_695651 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_695651
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
				fujaba__Success = this.isAppropriate_FWD(match, actor, flow,
						useCase, packageDeclaration, step, alt, altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_97(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_266847 = null;
		NormalStep __DEC_alt_stepAlternative_343455 = null;
		Flow __DEC_step_steps_491481 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_50426 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_50426 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_altFlow_flows_266847 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_266847 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_266847 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_266847
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_266847 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_266847
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
							__DEC_alt_stepAlternative_343455 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_343455 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_343455 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_343455
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_343455 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_343455
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
							__DEC_step_steps_491481 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_491481 is really bound
							JavaSDM.ensure(__DEC_step_steps_491481 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_491481.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_491481 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_491481
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_491481 and flow 
							JavaSDM.ensure(!__DEC_step_steps_491481
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_50426
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_50426 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_50426
											.hasNext()) {
								try {
									__DEC_altFlow_ref_50426 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_50426
											.next();

									// check object __DEC_altFlow_ref_50426 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_50426 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_50426 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_50426
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
						fujaba__Success = this.isAppropriate_FWD(match, actor,
								flow, useCase, packageDeclaration, step, alt,
								altFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_98(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_928438 = null;
		NormalStep __DEC_alt_stepAlternative_473388 = null;
		Flow __DEC_step_steps_770063 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_525569 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_525569 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
		BasicFlow flow = null;
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
					__DEC_altFlow_flows_928438 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_928438 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_928438 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_928438.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_928438 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_928438.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_473388 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_473388 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_473388 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_473388
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_473388 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_473388
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
					__DEC_step_steps_770063 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_770063 is really bound
					JavaSDM.ensure(__DEC_step_steps_770063 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_770063.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_770063 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_770063.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_770063 and flow 
					JavaSDM.ensure(!__DEC_step_steps_770063.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_525569
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_525569 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_525569
									.hasNext()) {
						try {
							__DEC_altFlow_ref_525569 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_525569
									.next();

							// check object __DEC_altFlow_ref_525569 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_525569 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_525569 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_525569
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
				fujaba__Success = this.isAppropriate_FWD(match, actor, flow,
						useCase, packageDeclaration, step, alt, altFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_417(
			EMoflonEdge _edge_operand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_681526 = null;
		InteractionOperand __DEC_messageReceive_fragment_876449 = null;
		InteractionOperand __DEC_messageSend_fragment_439985 = null;
		Interaction __DEC_operand_enclosingInteraction_927398 = null;
		InteractionOperand __DEC_operand_fragment_61840 = null;
		InteractionOperand __DEC_guard_guard_408018 = null;
		CombinedFragment __DEC_operand_operand_958996 = null;
		Constraint __DEC_spec_specification_361597 = null;
		Match match = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		CombinedFragment combo = null;
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

			// check object _edge_operand is really bound
			JavaSDM.ensure(_edge_operand != null);
			// bind object
			_TmpObject = _edge_operand.getTrg();

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
			_TmpObject = _edge_operand.getSrc();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// bind object
			interaction = combo.getEnclosingInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link operand from operand to combo
			JavaSDM.ensure(combo.equals(operand.eContainer()));

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
					// iterate to-many link coveredBy from combo to line
					fujaba__Success = false;

					fujaba__IterComboToLine = new ArrayList(combo.getCovered())
							.iterator();

					while (fujaba__IterComboToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterComboToLine.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// check link lifeline from line to interaction
							JavaSDM.ensure(interaction.equals(line
									.getInteraction()));

							// check link coveredBy from operand to line
							JavaSDM.ensure(operand.getCovered().contains(line));

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
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link fragment from messageSend to interaction
									JavaSDM.ensure(interaction
											.equals(messageSend
													.getEnclosingInteraction()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// negative check for link message from messageReceive
										JavaSDM.ensure(messageReceive
												.getMessage() == null);
										// negative check for link message from messageSend
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_681526 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_681526 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_681526 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_681526 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_681526
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_876449 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_876449 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_876449 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_876449 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_876449
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_439985 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_439985 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_439985 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_439985 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_439985
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_927398 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_927398 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_927398 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_927398 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_927398
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_61840 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_61840 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_61840 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_61840 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_61840
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
											__DEC_guard_guard_408018 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_408018 is really bound
											JavaSDM.ensure(__DEC_guard_guard_408018 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_408018
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_408018 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_408018
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_958996 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_958996 is really bound
											JavaSDM.ensure(__DEC_operand_operand_958996 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_958996
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_958996 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_958996
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
											__DEC_spec_specification_361597 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_361597 is really bound
											JavaSDM.ensure(__DEC_spec_specification_361597 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_361597
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_361597 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_361597
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_operand to combo
										JavaSDM.ensure(combo
												.equals(_edge_operand.getSrc()));

										// check link trg from _edge_operand to operand
										JavaSDM.ensure(operand
												.equals(_edge_operand.getTrg()));

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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_418(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_759924 = null;
		InteractionOperand __DEC_messageReceive_fragment_970540 = null;
		InteractionOperand __DEC_messageSend_fragment_210108 = null;
		Interaction __DEC_operand_enclosingInteraction_380577 = null;
		InteractionOperand __DEC_operand_fragment_837421 = null;
		InteractionOperand __DEC_guard_guard_585100 = null;
		CombinedFragment __DEC_operand_operand_610006 = null;
		Constraint __DEC_spec_specification_474834 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

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

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_759924 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_759924 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_759924 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_759924 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_759924
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_970540 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_970540 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_970540 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_970540 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_970540
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_210108 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_210108 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_210108 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_210108 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_210108
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_380577 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_380577 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_380577 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_380577 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_380577
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_837421 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_837421 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_837421 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_837421 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_837421
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
											__DEC_guard_guard_585100 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_585100 is really bound
											JavaSDM.ensure(__DEC_guard_guard_585100 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_585100
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_585100 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_585100
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_610006 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_610006 is really bound
											JavaSDM.ensure(__DEC_operand_operand_610006 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_610006
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_610006 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_610006
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
											__DEC_spec_specification_474834 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_474834 is really bound
											JavaSDM.ensure(__DEC_spec_specification_474834 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_474834
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_474834 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_474834
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_coveredBy to combo
										JavaSDM.ensure(combo
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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_419(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_622776 = null;
		InteractionOperand __DEC_messageReceive_fragment_361231 = null;
		InteractionOperand __DEC_messageSend_fragment_348118 = null;
		Interaction __DEC_operand_enclosingInteraction_467109 = null;
		InteractionOperand __DEC_operand_fragment_519424 = null;
		InteractionOperand __DEC_guard_guard_452726 = null;
		CombinedFragment __DEC_operand_operand_945137 = null;
		Constraint __DEC_spec_specification_561530 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

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

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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

									// iterate to-many link src from line to _edge_coveredBy
									fujaba__Success = false;

									fujaba__IterLineTo_edge_coveredBy = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(line,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterLineTo_edge_coveredBy
											.hasNext()) {
										try {
											_edge_coveredBy = (EMoflonEdge) fujaba__IterLineTo_edge_coveredBy
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
													__DEC_combo_fragment_622776 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_622776 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_622776 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_622776 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_622776
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_361231 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_361231 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_361231 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_361231 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_361231
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_348118 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_348118 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_348118 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_348118 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_348118
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_467109 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_467109 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_467109 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_467109 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_467109
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_519424 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_519424 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_519424 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_519424 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_519424
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
													__DEC_guard_guard_452726 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_452726 is really bound
													JavaSDM.ensure(__DEC_guard_guard_452726 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_452726
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_452726 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_452726
															.equals(operand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_945137 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_945137 is really bound
													JavaSDM.ensure(__DEC_operand_operand_945137 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_945137
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_945137 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_945137
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
													__DEC_spec_specification_561530 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_561530 is really bound
													JavaSDM.ensure(__DEC_spec_specification_561530 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_561530
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_561530 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_561530
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
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

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
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
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

												// check link coveredBy from combo to line
												JavaSDM.ensure(combo
														.getCovered().contains(
																line));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
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
																match, line,
																messageSend,
																interaction,
																combo,
																messageReceive,
																operand, guard,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_420(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_418624 = null;
		InteractionOperand __DEC_messageReceive_fragment_543448 = null;
		InteractionOperand __DEC_messageSend_fragment_273285 = null;
		Interaction __DEC_operand_enclosingInteraction_805255 = null;
		InteractionOperand __DEC_operand_fragment_271490 = null;
		InteractionOperand __DEC_guard_guard_654490 = null;
		CombinedFragment __DEC_operand_operand_486843 = null;
		Constraint __DEC_spec_specification_574377 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToCombo = null;
		CombinedFragment combo = null;
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
							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_418624 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_418624 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_418624 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_418624 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_418624
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_543448 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_543448 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_543448 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_543448 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_543448
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_273285 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_273285 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_273285 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_273285 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_273285
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_805255 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_805255 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_805255 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_805255 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_805255
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_271490 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_271490 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_271490 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_271490 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_271490
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
											__DEC_guard_guard_654490 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_654490 is really bound
											JavaSDM.ensure(__DEC_guard_guard_654490 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_654490
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_654490 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_654490
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_486843 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_486843 is really bound
											JavaSDM.ensure(__DEC_operand_operand_486843 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_486843
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_486843 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_486843
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
											__DEC_spec_specification_574377 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_574377 is really bound
											JavaSDM.ensure(__DEC_spec_specification_574377 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_574377
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_574377 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_574377
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_421(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_593129 = null;
		InteractionOperand __DEC_messageReceive_fragment_45090 = null;
		InteractionOperand __DEC_messageSend_fragment_556773 = null;
		Interaction __DEC_operand_enclosingInteraction_375020 = null;
		InteractionOperand __DEC_operand_fragment_712513 = null;
		InteractionOperand __DEC_guard_guard_585468 = null;
		CombinedFragment __DEC_operand_operand_305779 = null;
		Constraint __DEC_spec_specification_219847 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Interaction interaction = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link fragment from messageSend to interaction
					JavaSDM.ensure(interaction.equals(messageSend
							.getEnclosingInteraction()));

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
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

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

										// negative check for link message from messageReceive
										JavaSDM.ensure(messageReceive
												.getMessage() == null);
										// negative check for link message from messageSend
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_593129 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_593129 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_593129 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_593129 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_593129
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_45090 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_45090 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_45090 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_45090 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_45090
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_556773 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_556773 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_556773 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_556773 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_556773
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_375020 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_375020 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_375020 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_375020 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_375020
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_712513 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_712513 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_712513 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_712513 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_712513
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
											__DEC_guard_guard_585468 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_585468 is really bound
											JavaSDM.ensure(__DEC_guard_guard_585468 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_585468
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_585468 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_585468
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_305779 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_305779 is really bound
											JavaSDM.ensure(__DEC_operand_operand_305779 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_305779
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_305779 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_305779
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
											__DEC_spec_specification_219847 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_219847 is really bound
											JavaSDM.ensure(__DEC_spec_specification_219847 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_219847
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_219847 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_219847
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
										JavaSDM.ensure(!_edge_coveredBy
												.equals(_edge_covered));

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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_422(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_509708 = null;
		InteractionOperand __DEC_messageReceive_fragment_275194 = null;
		InteractionOperand __DEC_messageSend_fragment_263713 = null;
		Interaction __DEC_operand_enclosingInteraction_904660 = null;
		InteractionOperand __DEC_operand_fragment_291914 = null;
		InteractionOperand __DEC_guard_guard_499181 = null;
		CombinedFragment __DEC_operand_operand_56963 = null;
		Constraint __DEC_spec_specification_521953 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

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
							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_509708 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_509708 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_509708 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_509708 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_509708
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_275194 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_275194 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_275194 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_275194 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_275194
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_263713 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_263713 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_263713 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_263713 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_263713
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_904660 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_904660 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_904660 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_904660 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_904660
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_291914 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_291914 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_291914 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_291914 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_291914
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
											__DEC_guard_guard_499181 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_499181 is really bound
											JavaSDM.ensure(__DEC_guard_guard_499181 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_499181
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_499181 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_499181
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_56963 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_56963 is really bound
											JavaSDM.ensure(__DEC_operand_operand_56963 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_56963
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_56963 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_56963
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
											__DEC_spec_specification_521953 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_521953 is really bound
											JavaSDM.ensure(__DEC_spec_specification_521953 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_521953
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_521953 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_521953
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_guard to operand
										JavaSDM.ensure(operand
												.equals(_edge_guard.getSrc()));

										// check link trg from _edge_guard to guard
										JavaSDM.ensure(guard.equals(_edge_guard
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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_423(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_combo_fragment_167831 = null;
		InteractionOperand __DEC_messageReceive_fragment_594778 = null;
		InteractionOperand __DEC_messageSend_fragment_486677 = null;
		Interaction __DEC_operand_enclosingInteraction_636090 = null;
		InteractionOperand __DEC_operand_fragment_106325 = null;
		InteractionOperand __DEC_guard_guard_962219 = null;
		CombinedFragment __DEC_operand_operand_801098 = null;
		Constraint __DEC_spec_specification_952397 = null;
		Match match = null;
		Iterator fujaba__IterInteractionToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link coveredBy from combo to line
					JavaSDM.ensure(combo.getCovered().contains(line));

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
							// check link fragment from messageSend to interaction
							JavaSDM.ensure(interaction.equals(messageSend
									.getEnclosingInteraction()));

							// iterate to-many link fragment from interaction to messageReceive
							fujaba__Success = false;

							fujaba__IterInteractionToMessageReceive = new ArrayList(
									interaction.getFragment()).iterator();

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
										JavaSDM.ensure(messageSend.getMessage() == null);
										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_167831 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_167831 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_167831 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_167831 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_167831
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_594778 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_594778 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_594778 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_594778 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_594778
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_486677 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_486677 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_486677 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_486677 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_486677
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_636090 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_636090 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_636090 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_636090 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_636090
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_106325 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_106325 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_106325 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_106325 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_106325
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
											__DEC_guard_guard_962219 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_962219 is really bound
											JavaSDM.ensure(__DEC_guard_guard_962219 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_962219
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_962219 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_962219
													.equals(operand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_801098 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_801098 is really bound
											JavaSDM.ensure(__DEC_operand_operand_801098 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_801098
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_801098 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_801098
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
											__DEC_spec_specification_952397 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_952397 is really bound
											JavaSDM.ensure(__DEC_spec_specification_952397 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_952397
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_952397 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_952397
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
														"receiveEvent").size() == 0);
										// negative check for link receiveEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"receiveEvent").size() == 0);
										// negative check for link sendEvent from messageReceive
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageReceive,
														Message.class,
														"sendEvent").size() == 0);
										// negative check for link sendEvent from messageSend
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														messageSend,
														Message.class,
														"sendEvent").size() == 0);
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
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

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
														messageSend,
														interaction, combo,
														messageReceive,
														operand, guard, spec);
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
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(FlowToInteractionFragment) arguments.get(4),
					(BasicFlow) arguments.get(5), (UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(PackageDeclaration) arguments.get(8),
					(NormalStep) arguments.get(9),
					(AlternativeFlowAlternative) arguments.get(10),
					(AlternativeFlow) arguments.get(11));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Interaction) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(BasicFlow) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(PackageDeclaration) arguments.get(11),
					(InteractionOperand) arguments.get(12),
					(InteractionConstraint) arguments.get(13),
					(LiteralString) arguments.get(14));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_409__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_409((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_410__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_410((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_411__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_411((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_412__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_412((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_413__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_413((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_414__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_414((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_415__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_415((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_416__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_416((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_95((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_96__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_96((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_97__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_97((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_98__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_98((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_417__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_417((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_418__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_418((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_419__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_419((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_420__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_420((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_421__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_421((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_422__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_422((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_423__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_423((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltSysStepBFToComboRuleImpl
