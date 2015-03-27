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

import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepNFToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule;
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
 * An implementation of the model object '<em><b>Alt Sys Step NF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltSysStepNFToComboRuleImpl extends AbstractRuleImpl implements
		AltSysStepNFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltSysStepNFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltSysStepNFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, NamedFlow flow,
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
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

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
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

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
						__step_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_altFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						altFlow, "toBeTranslatedNodes");

				// create link
				__step_actor_actor.setTrg(actor);

				// create link
				__flow_steps_step.setSrc(flow);

				// create link
				__step_stepAlternative_alt.setSrc(step);

				// create link
				__step_actor_actor.setSrc(step);

				// create link
				__flow_steps_step.setTrg(step);

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and altFlow 
				JavaSDM.ensure(!flow.equals(altFlow));

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
				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");

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
						__packageDeclaration_actors_actor, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_flow.setSrc(useCase);

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
		NamedFlow flow = null;
		FlowToInteractionFragment flowToParentOperand = null;
		Interaction interaction = null;
		Lifeline line = null;
		PackageDeclaration packageDeclaration = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		NormalStep step = null;
		UseCase useCase = null;
		UseCaseToInteraction useCaseToInteraction = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		InteractionOperand operand = null;
		MessageOccurrenceSpecification messageSend = null;
		MessageOccurrenceSpecification messageReceive = null;
		CombinedFragment combo = null;
		NormalStepToCombinedFragment stepToCombo = null;
		StepAlternativeToInteractionOperand alternative1ToOperand = null;
		InteractionConstraint guard = null;
		FlowToInteractionFragment altFlowToOperand = null;
		LiteralString spec = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge line__coveredBy__parentOperand = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge parentOperand__covered__line = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge combo__enclosingOperand__parentOperand = null;
		EMoflonEdge messageSend__enclosingOperand__parentOperand = null;
		EMoflonEdge parentOperand__fragment__messageSend = null;
		EMoflonEdge line__coveredBy__messageSend = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge messageReceive__enclosingOperand__parentOperand = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge messageSend__covered__line = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge combo__operand__operand = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge interaction__fragment__combo = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge guard__specification__spec = null;
		EMoflonEdge parentCombo__covered__line = null;
		EMoflonEdge parentOperand__fragment__combo = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge line__coveredBy__parentCombo = null;
		EMoflonEdge parentOperand__fragment__messageReceive = null;
		EMoflonEdge combo__enclosingInteraction__interaction = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __step_stepAlternative_alt = null;

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
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowToParentOperand"));

			// ensure correct type and really bound of object flowToParentOperand
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToParentOperand = (FlowToInteractionFragment) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("parentCombo"));

			// ensure correct type and really bound of object parentCombo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			parentCombo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parentOperand"));

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;
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
			// create object operand
			operand = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionOperand();

			// create object messageSend
			messageSend = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object messageReceive
			messageReceive = ModalSequenceDiagramFactory.eINSTANCE
					.createMessageOccurrenceSpecification();

			// create object combo
			combo = ModalSequenceDiagramFactory.eINSTANCE
					.createCombinedFragment();

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
			operand.getCovered().add(line);

			// create link
			parentCombo.getCovered().add(line);

			// create link
			parentOperand.getCovered().add(line);

			// create link
			messageSend.getCovered().add(line);

			// create link
			parentOperand.getFragment().add(messageSend);

			// create link
			messageReceive.setEnclosingOperand(parentOperand);

			// create link
			combo.setEnclosingOperand(parentOperand);

			// create link
			combo.getOperand().add(operand); // add link

			// create link
			stepToCombo.setTarget(combo);

			// create link
			interaction.getFragment().add(combo);

			// create link
			stepToCombo.setSource(step);

			// create link
			alternative1ToOperand.setSource(alt);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			alternative1ToOperand.setTarget(operand);

			// create link
			altFlowToOperand.setTarget(operand);

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
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

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
			// check object flowToParentOperand is really bound
			JavaSDM.ensure(flowToParentOperand != null);
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
			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);
			// check object parentOperand is really bound
			JavaSDM.ensure(parentOperand != null);
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

			// check isomorphic binding between objects flowToParentOperand and actor 
			JavaSDM.ensure(!flowToParentOperand.equals(actor));

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

			// check isomorphic binding between objects parentCombo and actor 
			JavaSDM.ensure(!parentCombo.equals(actor));

			// check isomorphic binding between objects parentOperand and actor 
			JavaSDM.ensure(!parentOperand.equals(actor));

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

			// check isomorphic binding between objects flowToParentOperand and alt 
			JavaSDM.ensure(!flowToParentOperand.equals(alt));

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

			// check isomorphic binding between objects parentCombo and alt 
			JavaSDM.ensure(!parentCombo.equals(alt));

			// check isomorphic binding between objects parentOperand and alt 
			JavaSDM.ensure(!parentOperand.equals(alt));

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

			// check isomorphic binding between objects flowToParentOperand and altFlow 
			JavaSDM.ensure(!flowToParentOperand.equals(altFlow));

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

			// check isomorphic binding between objects parentCombo and altFlow 
			JavaSDM.ensure(!parentCombo.equals(altFlow));

			// check isomorphic binding between objects parentOperand and altFlow 
			JavaSDM.ensure(!parentOperand.equals(altFlow));

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

			// check isomorphic binding between objects flowToParentOperand and altFlowToOperand 
			JavaSDM.ensure(!flowToParentOperand.equals(altFlowToOperand));

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

			// check isomorphic binding between objects parentCombo and altFlowToOperand 
			JavaSDM.ensure(!parentCombo.equals(altFlowToOperand));

			// check isomorphic binding between objects parentOperand and altFlowToOperand 
			JavaSDM.ensure(!parentOperand.equals(altFlowToOperand));

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

			// check isomorphic binding between objects flowToParentOperand and alternative1ToOperand 
			JavaSDM.ensure(!flowToParentOperand.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects parentCombo and alternative1ToOperand 
			JavaSDM.ensure(!parentCombo.equals(alternative1ToOperand));

			// check isomorphic binding between objects parentOperand and alternative1ToOperand 
			JavaSDM.ensure(!parentOperand.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects flowToParentOperand and combo 
			JavaSDM.ensure(!flowToParentOperand.equals(combo));

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

			// check isomorphic binding between objects parentCombo and combo 
			JavaSDM.ensure(!parentCombo.equals(combo));

			// check isomorphic binding between objects parentOperand and combo 
			JavaSDM.ensure(!parentOperand.equals(combo));

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

			// check isomorphic binding between objects flowToParentOperand and flow 
			JavaSDM.ensure(!flowToParentOperand.equals(flow));

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

			// check isomorphic binding between objects parentCombo and flow 
			JavaSDM.ensure(!parentCombo.equals(flow));

			// check isomorphic binding between objects parentOperand and flow 
			JavaSDM.ensure(!parentOperand.equals(flow));

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

			// check isomorphic binding between objects guard and flowToParentOperand 
			JavaSDM.ensure(!guard.equals(flowToParentOperand));

			// check isomorphic binding between objects interaction and flowToParentOperand 
			JavaSDM.ensure(!interaction.equals(flowToParentOperand));

			// check isomorphic binding between objects line and flowToParentOperand 
			JavaSDM.ensure(!line.equals(flowToParentOperand));

			// check isomorphic binding between objects messageReceive and flowToParentOperand 
			JavaSDM.ensure(!messageReceive.equals(flowToParentOperand));

			// check isomorphic binding between objects messageSend and flowToParentOperand 
			JavaSDM.ensure(!messageSend.equals(flowToParentOperand));

			// check isomorphic binding between objects operand and flowToParentOperand 
			JavaSDM.ensure(!operand.equals(flowToParentOperand));

			// check isomorphic binding between objects packageDeclaration and flowToParentOperand 
			JavaSDM.ensure(!packageDeclaration.equals(flowToParentOperand));

			// check isomorphic binding between objects parentCombo and flowToParentOperand 
			JavaSDM.ensure(!parentCombo.equals(flowToParentOperand));

			// check isomorphic binding between objects parentOperand and flowToParentOperand 
			JavaSDM.ensure(!parentOperand.equals(flowToParentOperand));

			// check isomorphic binding between objects spec and flowToParentOperand 
			JavaSDM.ensure(!spec.equals(flowToParentOperand));

			// check isomorphic binding between objects step and flowToParentOperand 
			JavaSDM.ensure(!step.equals(flowToParentOperand));

			// check isomorphic binding between objects stepToCombo and flowToParentOperand 
			JavaSDM.ensure(!stepToCombo.equals(flowToParentOperand));

			// check isomorphic binding between objects useCase and flowToParentOperand 
			JavaSDM.ensure(!useCase.equals(flowToParentOperand));

			// check isomorphic binding between objects useCaseToInteraction and flowToParentOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToParentOperand));

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

			// check isomorphic binding between objects parentCombo and guard 
			JavaSDM.ensure(!parentCombo.equals(guard));

			// check isomorphic binding between objects parentOperand and guard 
			JavaSDM.ensure(!parentOperand.equals(guard));

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

			// check isomorphic binding between objects parentCombo and interaction 
			JavaSDM.ensure(!parentCombo.equals(interaction));

			// check isomorphic binding between objects parentOperand and interaction 
			JavaSDM.ensure(!parentOperand.equals(interaction));

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

			// check isomorphic binding between objects parentCombo and line 
			JavaSDM.ensure(!parentCombo.equals(line));

			// check isomorphic binding between objects parentOperand and line 
			JavaSDM.ensure(!parentOperand.equals(line));

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

			// check isomorphic binding between objects parentCombo and messageReceive 
			JavaSDM.ensure(!parentCombo.equals(messageReceive));

			// check isomorphic binding between objects parentOperand and messageReceive 
			JavaSDM.ensure(!parentOperand.equals(messageReceive));

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

			// check isomorphic binding between objects parentCombo and messageSend 
			JavaSDM.ensure(!parentCombo.equals(messageSend));

			// check isomorphic binding between objects parentOperand and messageSend 
			JavaSDM.ensure(!parentOperand.equals(messageSend));

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

			// check isomorphic binding between objects parentCombo and operand 
			JavaSDM.ensure(!parentCombo.equals(operand));

			// check isomorphic binding between objects parentOperand and operand 
			JavaSDM.ensure(!parentOperand.equals(operand));

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

			// check isomorphic binding between objects parentCombo and packageDeclaration 
			JavaSDM.ensure(!parentCombo.equals(packageDeclaration));

			// check isomorphic binding between objects parentOperand and packageDeclaration 
			JavaSDM.ensure(!parentOperand.equals(packageDeclaration));

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

			// check isomorphic binding between objects parentOperand and parentCombo 
			JavaSDM.ensure(!parentOperand.equals(parentCombo));

			// check isomorphic binding between objects spec and parentCombo 
			JavaSDM.ensure(!spec.equals(parentCombo));

			// check isomorphic binding between objects step and parentCombo 
			JavaSDM.ensure(!step.equals(parentCombo));

			// check isomorphic binding between objects stepToCombo and parentCombo 
			JavaSDM.ensure(!stepToCombo.equals(parentCombo));

			// check isomorphic binding between objects useCase and parentCombo 
			JavaSDM.ensure(!useCase.equals(parentCombo));

			// check isomorphic binding between objects useCaseToInteraction and parentCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(parentCombo));

			// check isomorphic binding between objects spec and parentOperand 
			JavaSDM.ensure(!spec.equals(parentOperand));

			// check isomorphic binding between objects step and parentOperand 
			JavaSDM.ensure(!step.equals(parentOperand));

			// check isomorphic binding between objects stepToCombo and parentOperand 
			JavaSDM.ensure(!stepToCombo.equals(parentOperand));

			// check isomorphic binding between objects useCase and parentOperand 
			JavaSDM.ensure(!useCase.equals(parentOperand));

			// check isomorphic binding between objects useCaseToInteraction and parentOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(parentOperand));

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

			// create object line__coveredBy__parentOperand
			line__coveredBy__parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_step
			__flow_steps_step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object parentOperand__covered__line
			parentOperand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__enclosingOperand__parentOperand
			combo__enclosingOperand__parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__enclosingOperand__parentOperand
			messageSend__enclosingOperand__parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parentOperand__fragment__messageSend
			parentOperand__fragment__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__messageSend
			line__coveredBy__messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageReceive__enclosingOperand__parentOperand
			messageReceive__enclosingOperand__parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object messageSend__covered__line
			messageSend__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object interaction__fragment__combo
			interaction__fragment__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parentCombo__covered__line
			parentCombo__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parentOperand__fragment__combo
			parentOperand__fragment__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__parentCombo
			line__coveredBy__parentCombo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parentOperand__fragment__messageReceive
			parentOperand__fragment__messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__enclosingInteraction__interaction
			combo__enclosingInteraction__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __step_actor_actor
			__step_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltSysStepNFToComboRule");
			// assign attribute line__coveredBy__messageSend
			line__coveredBy__messageSend.setName("coveredBy");
			// assign attribute messageSend__covered__line
			messageSend__covered__line.setName("covered");
			// assign attribute parentOperand__fragment__messageSend
			parentOperand__fragment__messageSend.setName("fragment");
			// assign attribute messageSend__enclosingOperand__parentOperand
			messageSend__enclosingOperand__parentOperand
					.setName("enclosingOperand");
			// assign attribute parentOperand__fragment__messageReceive
			parentOperand__fragment__messageReceive.setName("fragment");
			// assign attribute messageReceive__enclosingOperand__parentOperand
			messageReceive__enclosingOperand__parentOperand
					.setName("enclosingOperand");
			// assign attribute line__coveredBy__parentOperand
			line__coveredBy__parentOperand.setName("coveredBy");
			// assign attribute parentOperand__covered__line
			parentOperand__covered__line.setName("covered");
			// assign attribute parentOperand__fragment__combo
			parentOperand__fragment__combo.setName("fragment");
			// assign attribute combo__enclosingOperand__parentOperand
			combo__enclosingOperand__parentOperand.setName("enclosingOperand");
			// assign attribute line__coveredBy__parentCombo
			line__coveredBy__parentCombo.setName("coveredBy");
			// assign attribute parentCombo__covered__line
			parentCombo__covered__line.setName("covered");
			// assign attribute combo__enclosingInteraction__interaction
			combo__enclosingInteraction__interaction
					.setName("enclosingInteraction");
			// assign attribute interaction__fragment__combo
			interaction__fragment__combo.setName("fragment");
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
					line__coveredBy__parentOperand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_step, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parentOperand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__enclosingOperand__parentOperand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__enclosingOperand__parentOperand,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parentOperand__fragment__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__messageSend, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive__enclosingOperand__parentOperand,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction__fragment__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parentCombo__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parentOperand__fragment__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__parentCombo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parentOperand__fragment__messageReceive, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__enclosingInteraction__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			__step_actor_actor.setTrg(actor);

			// create link
			line__coveredBy__parentOperand.setSrc(line);

			// create link
			parentCombo__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageSend.setSrc(line);

			// create link
			line__coveredBy__operand.setSrc(line);

			// create link
			line__coveredBy__parentCombo.setSrc(line);

			// create link
			parentOperand__covered__line.setTrg(line);

			// create link
			messageSend__covered__line.setTrg(line);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			line__coveredBy__messageSend.setTrg(messageSend);

			// create link
			messageSend__covered__line.setSrc(messageSend);

			// create link
			messageSend__enclosingOperand__parentOperand.setSrc(messageSend);

			// create link
			parentOperand__fragment__messageSend.setTrg(messageSend);

			// create link
			__flow_steps_step.setSrc(flow);

			// create link
			parentOperand__fragment__messageReceive.setSrc(parentOperand);

			// create link
			parentOperand__fragment__combo.setSrc(parentOperand);

			// create link
			parentOperand__covered__line.setSrc(parentOperand);

			// create link
			messageSend__enclosingOperand__parentOperand.setTrg(parentOperand);

			// create link
			parentOperand__fragment__messageSend.setSrc(parentOperand);

			// create link
			line__coveredBy__parentOperand.setTrg(parentOperand);

			// create link
			messageReceive__enclosingOperand__parentOperand
					.setTrg(parentOperand);

			// create link
			combo__enclosingOperand__parentOperand.setTrg(parentOperand);

			// create link
			parentOperand__fragment__messageReceive.setTrg(messageReceive);

			// create link
			messageReceive__enclosingOperand__parentOperand
					.setSrc(messageReceive);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			combo__enclosingOperand__parentOperand.setSrc(combo);

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			combo__enclosingInteraction__interaction.setSrc(combo);

			// create link
			parentOperand__fragment__combo.setTrg(combo);

			// create link
			interaction__fragment__combo.setTrg(combo);

			// create link
			parentCombo__covered__line.setSrc(parentCombo);

			// create link
			line__coveredBy__parentCombo.setTrg(parentCombo);

			// create link
			combo__enclosingInteraction__interaction.setTrg(interaction);

			// create link
			interaction__fragment__combo.setSrc(interaction);

			// create link
			__flow_steps_step.setTrg(step);

			// create link
			__step_stepAlternative_alt.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			__step_actor_actor.setSrc(step);

			// create link
			__step_stepAlternative_alt.setTrg(alt);

			// create link
			__alt_ref_altFlow.setSrc(alt);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			line__coveredBy__operand.setTrg(operand);

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

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand);
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
		NamedFlow flow = null;
		PackageDeclaration packageDeclaration = null;
		NormalStep step = null;
		UseCase useCase = null;
		EMoflonEdge __step_actor_actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToParentOperand_source_flow = null;
		EMoflonEdge __parentCombo_operand_parentOperand = null;
		EMoflonEdge __flowToParentOperand_target_parentOperand = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
		EMoflonEdge __useCaseToInteraction_source_useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
		CSP csp = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		Interaction interaction = null;
		Iterator fujaba__IterUseCaseToUseCaseToInteraction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterFlowToFlowToParentOperand = null;
		FlowToInteractionFragment flowToParentOperand = null;

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
			ruleresult.setRule("AltSysStepNFToComboRule");

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
			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// iterate to-many link source from flow to flowToParentOperand
			fujaba__Success = false;

			fujaba__IterFlowToFlowToParentOperand = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							FlowToInteractionFragment.class, "source"))
					.iterator();

			while (fujaba__IterFlowToFlowToParentOperand.hasNext()) {
				try {
					flowToParentOperand = (FlowToInteractionFragment) fujaba__IterFlowToFlowToParentOperand
							.next();

					// check object flowToParentOperand is really bound
					JavaSDM.ensure(flowToParentOperand != null);
					// bind object
					_TmpObject = flowToParentOperand.getTarget();

					// ensure correct type and really bound of object parentOperand
					JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
					parentOperand = (InteractionOperand) _TmpObject;

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
								// check object alt is really bound
								JavaSDM.ensure(alt != null);
								// check object altFlow is really bound
								JavaSDM.ensure(altFlow != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object flowToParentOperand is really bound
								JavaSDM.ensure(flowToParentOperand != null);
								// check object interaction is really bound
								JavaSDM.ensure(interaction != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object parentOperand is really bound
								JavaSDM.ensure(parentOperand != null);
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

								// check link ref from alt to altFlow
								JavaSDM.ensure(altFlow.equals(alt.getRef()));

								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// bind object
								parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
										.eContainer() : null;

								// check object parentCombo is really bound
								JavaSDM.ensure(parentCombo != null);

								// check if contained via correct reference
								JavaSDM.ensure(parentCombo.getOperand()
										.contains(parentOperand));

								// check link source from flowToParentOperand to flow
								JavaSDM.ensure(flow.equals(flowToParentOperand
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link stepAlternative from alt to step
								JavaSDM.ensure(step.equals(alt.eContainer()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from flowToParentOperand to parentOperand
								JavaSDM.ensure(parentOperand
										.equals(flowToParentOperand.getTarget()));

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

										// create object __flow_steps_step
										__flow_steps_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToParentOperand_source_flow
										__flowToParentOperand_source_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentCombo_operand_parentOperand
										__parentCombo_operand_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToParentOperand_target_parentOperand
										__flowToParentOperand_target_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
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

										// assign attribute __flowToParentOperand_source_flow
										__flowToParentOperand_source_flow
												.setName("source");
										// assign attribute __flowToParentOperand_target_parentOperand
										__flowToParentOperand_target_parentOperand
												.setName("target");
										// assign attribute __parentCombo_operand_parentOperand
										__parentCombo_operand_parentOperand
												.setName("operand");
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
										__line_interaction_interaction
												.setSrc(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flowToParentOperand_source_flow
												.setTrg(flow);

										// create link
										__parentCombo_operand_parentOperand
												.setTrg(parentOperand);

										// create link
										__flowToParentOperand_target_parentOperand
												.setTrg(parentOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parentOperand);

										// create link
										__flowToParentOperand_target_parentOperand
												.setSrc(flowToParentOperand);

										// create link
										__flowToParentOperand_source_flow
												.setSrc(flowToParentOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToParentOperand);

										// create link
										__parentCombo_operand_parentOperand
												.setSrc(parentCombo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parentCombo);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

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
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__useCaseToInteraction_target_interaction
												.setSrc(useCaseToInteraction);

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
										__flow_steps_step.setTrg(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										__step_actor_actor.setSrc(step);

										// create link
										__step_stepAlternative_alt.setSrc(step);

										// create link
										__alt_ref_altFlow.setSrc(alt);

										// create link
										__step_stepAlternative_alt.setTrg(alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														altFlow);

										// create link
										__alt_ref_altFlow.setTrg(altFlow);

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
														__parentCombo_operand_parentOperand,
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
														__flowToParentOperand_target_parentOperand,
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
														__flowToParentOperand_source_flow,
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
														__flow_steps_step,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__useCaseToInteraction_source_useCase,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															actor,
															line,
															flow,
															parentOperand,
															flowToParentOperand,
															parentCombo,
															interaction,
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
														.setRuleName("AltSysStepNFToComboRule");
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
			NamedFlow flow, UseCase useCase,
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
			NamedFlow flow, UseCase useCase,
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
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("parentOperand", parentOperand);
		isApplicableMatch.registerObject("flowToParentOperand",
				flowToParentOperand);
		isApplicableMatch.registerObject("parentCombo", parentCombo);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parentOperand", parentOperand);
		ruleresult.registerObject("flowToParentOperand", flowToParentOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("parentCombo", parentCombo);
		ruleresult.registerObject("interaction", interaction);
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
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __parentOperand_covered_line = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __line_coveredBy_parentCombo = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __parentOperand_fragment_combo = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __messageReceive_enclosingOperand_parentOperand = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __line_coveredBy_parentOperand = null;
		EMoflonEdge __messageSend_enclosingOperand_parentOperand = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __parentOperand_fragment_messageSend = null;
		EMoflonEdge __combo_enclosingOperand_parentOperand = null;
		EMoflonEdge __parentCombo_covered_line = null;
		EMoflonEdge __parentOperand_fragment_messageReceive = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __parentCombo_operand_parentOperand = null;
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
			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);
			// check object parentOperand is really bound
			JavaSDM.ensure(parentOperand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// check isomorphic binding between objects parentCombo and combo 
			JavaSDM.ensure(!parentCombo.equals(combo));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check isomorphic binding between objects parentOperand and operand 
			JavaSDM.ensure(!parentOperand.equals(operand));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, line,
					messageSend, parentOperand, messageReceive, combo,
					parentCombo, interaction, operand, guard, spec));

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
				// check object parentCombo is really bound
				JavaSDM.ensure(parentCombo != null);
				// check object parentOperand is really bound
				JavaSDM.ensure(parentOperand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check isomorphic binding between objects parentCombo and combo 
				JavaSDM.ensure(!parentCombo.equals(combo));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// check isomorphic binding between objects parentOperand and operand 
				JavaSDM.ensure(!parentOperand.equals(operand));

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentOperand_covered_line
				__parentOperand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_enclosingInteraction_interaction
				__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_parentCombo
				__line_coveredBy_parentCombo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentOperand_fragment_combo
				__parentOperand_fragment_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageReceive_enclosingOperand_parentOperand
				__messageReceive_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __interaction_fragment_combo
				__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_messageSend
				__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_coveredBy_parentOperand
				__line_coveredBy_parentOperand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_enclosingOperand_parentOperand
				__messageSend_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentOperand_fragment_messageSend
				__parentOperand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_enclosingOperand_parentOperand
				__combo_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentCombo_covered_line
				__parentCombo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentOperand_fragment_messageReceive
				__parentOperand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __messageSend_covered_line
				__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_coveredBy_messageSend
				__line_coveredBy_messageSend.setName("coveredBy");
				// assign attribute __messageSend_covered_line
				__messageSend_covered_line.setName("covered");
				// assign attribute __parentOperand_fragment_messageSend
				__parentOperand_fragment_messageSend.setName("fragment");
				// assign attribute __messageSend_enclosingOperand_parentOperand
				__messageSend_enclosingOperand_parentOperand
						.setName("enclosingOperand");
				// assign attribute __parentOperand_fragment_messageReceive
				__parentOperand_fragment_messageReceive.setName("fragment");
				// assign attribute __messageReceive_enclosingOperand_parentOperand
				__messageReceive_enclosingOperand_parentOperand
						.setName("enclosingOperand");
				// assign attribute __line_coveredBy_parentOperand
				__line_coveredBy_parentOperand.setName("coveredBy");
				// assign attribute __parentOperand_covered_line
				__parentOperand_covered_line.setName("covered");
				// assign attribute __parentOperand_fragment_combo
				__parentOperand_fragment_combo.setName("fragment");
				// assign attribute __combo_enclosingOperand_parentOperand
				__combo_enclosingOperand_parentOperand
						.setName("enclosingOperand");
				// assign attribute __line_coveredBy_parentCombo
				__line_coveredBy_parentCombo.setName("coveredBy");
				// assign attribute __parentCombo_covered_line
				__parentCombo_covered_line.setName("covered");
				// assign attribute __combo_enclosingInteraction_interaction
				__combo_enclosingInteraction_interaction
						.setName("enclosingInteraction");
				// assign attribute __interaction_fragment_combo
				__interaction_fragment_combo.setName("fragment");
				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
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
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageReceive, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentOperand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_enclosingInteraction_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_parentCombo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						messageSend, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentOperand_fragment_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageReceive_enclosingOperand_parentOperand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_fragment_combo, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_messageSend, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_parentOperand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_enclosingOperand_parentOperand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentOperand_fragment_messageSend,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_enclosingOperand_parentOperand,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentCombo_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentOperand_fragment_messageReceive,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__messageSend_covered_line, "toBeTranslatedEdges");

				// create link
				__line_coveredBy_messageSend.setSrc(line);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__line_coveredBy_parentCombo.setSrc(line);

				// create link
				__line_coveredBy_parentOperand.setSrc(line);

				// create link
				__operand_covered_line.setTrg(line);

				// create link
				__messageSend_covered_line.setTrg(line);

				// create link
				__parentOperand_covered_line.setTrg(line);

				// create link
				__parentCombo_covered_line.setTrg(line);

				// create link
				__messageSend_covered_line.setSrc(messageSend);

				// create link
				__parentOperand_fragment_messageSend.setTrg(messageSend);

				// create link
				__messageSend_enclosingOperand_parentOperand
						.setSrc(messageSend);

				// create link
				__line_coveredBy_messageSend.setTrg(messageSend);

				// create link
				__messageReceive_enclosingOperand_parentOperand
						.setTrg(parentOperand);

				// create link
				__line_coveredBy_parentOperand.setTrg(parentOperand);

				// create link
				__messageSend_enclosingOperand_parentOperand
						.setTrg(parentOperand);

				// create link
				__parentOperand_covered_line.setSrc(parentOperand);

				// create link
				__parentOperand_fragment_combo.setSrc(parentOperand);

				// create link
				__combo_enclosingOperand_parentOperand.setTrg(parentOperand);

				// create link
				__parentOperand_fragment_messageReceive.setSrc(parentOperand);

				// create link
				__parentOperand_fragment_messageSend.setSrc(parentOperand);

				// create link
				__parentOperand_fragment_messageReceive.setTrg(messageReceive);

				// create link
				__messageReceive_enclosingOperand_parentOperand
						.setSrc(messageReceive);

				// create link
				__parentOperand_fragment_combo.setTrg(combo);

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__combo_enclosingOperand_parentOperand.setSrc(combo);

				// create link
				__interaction_fragment_combo.setTrg(combo);

				// create link
				__combo_enclosingInteraction_interaction.setSrc(combo);

				// create link
				__parentCombo_covered_line.setSrc(parentCombo);

				// create link
				__line_coveredBy_parentCombo.setTrg(parentCombo);

				// create link
				__interaction_fragment_combo.setSrc(interaction);

				// create link
				__combo_enclosingInteraction_interaction.setTrg(interaction);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__operand_guard_guard.setSrc(operand);

				// create link
				__operand_guard_guard.setTrg(guard);

				// create link
				__guard_specification_spec.setSrc(guard);

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
				// check object parentCombo is really bound
				JavaSDM.ensure(parentCombo != null);
				// check object parentOperand is really bound
				JavaSDM.ensure(parentOperand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check isomorphic binding between objects parentCombo and combo 
				JavaSDM.ensure(!parentCombo.equals(combo));

				// check isomorphic binding between objects messageSend and messageReceive 
				JavaSDM.ensure(!messageSend.equals(messageReceive));

				// check isomorphic binding between objects parentOperand and operand 
				JavaSDM.ensure(!parentOperand.equals(operand));

				// create object __interaction_lifeline_line
				__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parentCombo_operand_parentOperand
				__parentCombo_operand_parentOperand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __line_interaction_interaction
				__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __parentCombo_operand_parentOperand
				__parentCombo_operand_parentOperand.setName("operand");
				// assign attribute __line_interaction_interaction
				__line_interaction_interaction.setName("interaction");
				// assign attribute __interaction_lifeline_line
				__interaction_lifeline_line.setName("lifeline");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__interaction_lifeline_line, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parentCombo_operand_parentOperand, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_interaction_interaction, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parentOperand, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parentCombo, "contextNodes");

				// create link
				__line_interaction_interaction.setSrc(line);

				// create link
				__interaction_lifeline_line.setTrg(line);

				// create link
				__parentCombo_operand_parentOperand.setTrg(parentOperand);

				// create link
				__parentCombo_operand_parentOperand.setSrc(parentCombo);

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
					parentOperand, messageReceive, combo, parentCombo,
					interaction, operand, guard, spec);
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
		FlowToInteractionFragment flowToParentOperand = null;
		InteractionConstraint guard = null;
		Interaction interaction = null;
		Lifeline line = null;
		MessageOccurrenceSpecification messageReceive = null;
		MessageOccurrenceSpecification messageSend = null;
		InteractionOperand operand = null;
		PackageDeclaration packageDeclaration = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge step__stepAlternative__alt = null;
		EMoflonEdge stepToCombo__source__step = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge stepToCombo__target__combo = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_coveredBy_parentOperand = null;
		EMoflonEdge __messageReceive_enclosingOperand_parentOperand = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge flow__steps__step = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge altFlowToOperand__source__altFlow = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __parentOperand_fragment_combo = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge __parentCombo_covered_line = null;
		EMoflonEdge step__actor__actor = null;
		EMoflonEdge __parentOperand_fragment_messageReceive = null;
		EMoflonEdge __parentOperand_fragment_messageSend = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __messageSend_enclosingOperand_parentOperand = null;
		EMoflonEdge __combo_enclosingOperand_parentOperand = null;
		EMoflonEdge __line_coveredBy_parentCombo = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge altFlowToOperand__target__operand = null;
		EMoflonEdge alternative1ToOperand__source__alt = null;
		EMoflonEdge alternative1ToOperand__target__operand = null;
		EMoflonEdge __parentOperand_covered_line = null;

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
			_TmpObject = (isApplicableMatch.getObject("flowToParentOperand"));

			// ensure correct type and really bound of object flowToParentOperand
			JavaSDM.ensure(_TmpObject instanceof FlowToInteractionFragment);
			flowToParentOperand = (FlowToInteractionFragment) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("parentCombo"));

			// ensure correct type and really bound of object parentCombo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			parentCombo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parentOperand"));

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;
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
			// check isomorphic binding between objects parentCombo and combo 
			JavaSDM.ensure(!parentCombo.equals(combo));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check isomorphic binding between objects parentOperand and operand 
			JavaSDM.ensure(!parentOperand.equals(operand));

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
			flow.getSteps().add(step); // add link

			// create link
			stepToCombo.setTarget(combo);

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
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageReceive, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					messageSend, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "createdElements");
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
			// check object flowToParentOperand is really bound
			JavaSDM.ensure(flowToParentOperand != null);
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
			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);
			// check object parentOperand is really bound
			JavaSDM.ensure(parentOperand != null);
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

			// check isomorphic binding between objects flowToParentOperand and actor 
			JavaSDM.ensure(!flowToParentOperand.equals(actor));

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

			// check isomorphic binding between objects parentCombo and actor 
			JavaSDM.ensure(!parentCombo.equals(actor));

			// check isomorphic binding between objects parentOperand and actor 
			JavaSDM.ensure(!parentOperand.equals(actor));

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

			// check isomorphic binding between objects flowToParentOperand and alt 
			JavaSDM.ensure(!flowToParentOperand.equals(alt));

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

			// check isomorphic binding between objects parentCombo and alt 
			JavaSDM.ensure(!parentCombo.equals(alt));

			// check isomorphic binding between objects parentOperand and alt 
			JavaSDM.ensure(!parentOperand.equals(alt));

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

			// check isomorphic binding between objects flowToParentOperand and altFlow 
			JavaSDM.ensure(!flowToParentOperand.equals(altFlow));

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

			// check isomorphic binding between objects parentCombo and altFlow 
			JavaSDM.ensure(!parentCombo.equals(altFlow));

			// check isomorphic binding between objects parentOperand and altFlow 
			JavaSDM.ensure(!parentOperand.equals(altFlow));

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

			// check isomorphic binding between objects flowToParentOperand and altFlowToOperand 
			JavaSDM.ensure(!flowToParentOperand.equals(altFlowToOperand));

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

			// check isomorphic binding between objects parentCombo and altFlowToOperand 
			JavaSDM.ensure(!parentCombo.equals(altFlowToOperand));

			// check isomorphic binding between objects parentOperand and altFlowToOperand 
			JavaSDM.ensure(!parentOperand.equals(altFlowToOperand));

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

			// check isomorphic binding between objects flowToParentOperand and alternative1ToOperand 
			JavaSDM.ensure(!flowToParentOperand.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects parentCombo and alternative1ToOperand 
			JavaSDM.ensure(!parentCombo.equals(alternative1ToOperand));

			// check isomorphic binding between objects parentOperand and alternative1ToOperand 
			JavaSDM.ensure(!parentOperand.equals(alternative1ToOperand));

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

			// check isomorphic binding between objects flowToParentOperand and combo 
			JavaSDM.ensure(!flowToParentOperand.equals(combo));

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

			// check isomorphic binding between objects parentCombo and combo 
			JavaSDM.ensure(!parentCombo.equals(combo));

			// check isomorphic binding between objects parentOperand and combo 
			JavaSDM.ensure(!parentOperand.equals(combo));

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

			// check isomorphic binding between objects flowToParentOperand and flow 
			JavaSDM.ensure(!flowToParentOperand.equals(flow));

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

			// check isomorphic binding between objects parentCombo and flow 
			JavaSDM.ensure(!parentCombo.equals(flow));

			// check isomorphic binding between objects parentOperand and flow 
			JavaSDM.ensure(!parentOperand.equals(flow));

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

			// check isomorphic binding between objects guard and flowToParentOperand 
			JavaSDM.ensure(!guard.equals(flowToParentOperand));

			// check isomorphic binding between objects interaction and flowToParentOperand 
			JavaSDM.ensure(!interaction.equals(flowToParentOperand));

			// check isomorphic binding between objects line and flowToParentOperand 
			JavaSDM.ensure(!line.equals(flowToParentOperand));

			// check isomorphic binding between objects messageReceive and flowToParentOperand 
			JavaSDM.ensure(!messageReceive.equals(flowToParentOperand));

			// check isomorphic binding between objects messageSend and flowToParentOperand 
			JavaSDM.ensure(!messageSend.equals(flowToParentOperand));

			// check isomorphic binding between objects operand and flowToParentOperand 
			JavaSDM.ensure(!operand.equals(flowToParentOperand));

			// check isomorphic binding between objects packageDeclaration and flowToParentOperand 
			JavaSDM.ensure(!packageDeclaration.equals(flowToParentOperand));

			// check isomorphic binding between objects parentCombo and flowToParentOperand 
			JavaSDM.ensure(!parentCombo.equals(flowToParentOperand));

			// check isomorphic binding between objects parentOperand and flowToParentOperand 
			JavaSDM.ensure(!parentOperand.equals(flowToParentOperand));

			// check isomorphic binding between objects spec and flowToParentOperand 
			JavaSDM.ensure(!spec.equals(flowToParentOperand));

			// check isomorphic binding between objects step and flowToParentOperand 
			JavaSDM.ensure(!step.equals(flowToParentOperand));

			// check isomorphic binding between objects stepToCombo and flowToParentOperand 
			JavaSDM.ensure(!stepToCombo.equals(flowToParentOperand));

			// check isomorphic binding between objects useCase and flowToParentOperand 
			JavaSDM.ensure(!useCase.equals(flowToParentOperand));

			// check isomorphic binding between objects useCaseToInteraction and flowToParentOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(flowToParentOperand));

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

			// check isomorphic binding between objects parentCombo and guard 
			JavaSDM.ensure(!parentCombo.equals(guard));

			// check isomorphic binding between objects parentOperand and guard 
			JavaSDM.ensure(!parentOperand.equals(guard));

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

			// check isomorphic binding between objects parentCombo and interaction 
			JavaSDM.ensure(!parentCombo.equals(interaction));

			// check isomorphic binding between objects parentOperand and interaction 
			JavaSDM.ensure(!parentOperand.equals(interaction));

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

			// check isomorphic binding between objects parentCombo and line 
			JavaSDM.ensure(!parentCombo.equals(line));

			// check isomorphic binding between objects parentOperand and line 
			JavaSDM.ensure(!parentOperand.equals(line));

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

			// check isomorphic binding between objects parentCombo and messageReceive 
			JavaSDM.ensure(!parentCombo.equals(messageReceive));

			// check isomorphic binding between objects parentOperand and messageReceive 
			JavaSDM.ensure(!parentOperand.equals(messageReceive));

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

			// check isomorphic binding between objects parentCombo and messageSend 
			JavaSDM.ensure(!parentCombo.equals(messageSend));

			// check isomorphic binding between objects parentOperand and messageSend 
			JavaSDM.ensure(!parentOperand.equals(messageSend));

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

			// check isomorphic binding between objects parentCombo and operand 
			JavaSDM.ensure(!parentCombo.equals(operand));

			// check isomorphic binding between objects parentOperand and operand 
			JavaSDM.ensure(!parentOperand.equals(operand));

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

			// check isomorphic binding between objects parentCombo and packageDeclaration 
			JavaSDM.ensure(!parentCombo.equals(packageDeclaration));

			// check isomorphic binding between objects parentOperand and packageDeclaration 
			JavaSDM.ensure(!parentOperand.equals(packageDeclaration));

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

			// check isomorphic binding between objects parentOperand and parentCombo 
			JavaSDM.ensure(!parentOperand.equals(parentCombo));

			// check isomorphic binding between objects spec and parentCombo 
			JavaSDM.ensure(!spec.equals(parentCombo));

			// check isomorphic binding between objects step and parentCombo 
			JavaSDM.ensure(!step.equals(parentCombo));

			// check isomorphic binding between objects stepToCombo and parentCombo 
			JavaSDM.ensure(!stepToCombo.equals(parentCombo));

			// check isomorphic binding between objects useCase and parentCombo 
			JavaSDM.ensure(!useCase.equals(parentCombo));

			// check isomorphic binding between objects useCaseToInteraction and parentCombo 
			JavaSDM.ensure(!useCaseToInteraction.equals(parentCombo));

			// check isomorphic binding between objects spec and parentOperand 
			JavaSDM.ensure(!spec.equals(parentOperand));

			// check isomorphic binding between objects step and parentOperand 
			JavaSDM.ensure(!step.equals(parentOperand));

			// check isomorphic binding between objects stepToCombo and parentOperand 
			JavaSDM.ensure(!stepToCombo.equals(parentOperand));

			// check isomorphic binding between objects useCase and parentOperand 
			JavaSDM.ensure(!useCase.equals(parentOperand));

			// check isomorphic binding between objects useCaseToInteraction and parentOperand 
			JavaSDM.ensure(!useCaseToInteraction.equals(parentOperand));

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

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__source__step
			stepToCombo__source__step = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object stepToCombo__target__combo
			stepToCombo__target__combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_parentOperand
			__line_coveredBy_parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageReceive_enclosingOperand_parentOperand
			__messageReceive_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_messageSend
			__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__step
			flow__steps__step = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__source__altFlow
			altFlowToOperand__source__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parentOperand_fragment_combo
			__parentOperand_fragment_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_covered_line
			__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __parentCombo_covered_line
			__parentCombo_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__actor__actor
			step__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parentOperand_fragment_messageReceive
			__parentOperand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parentOperand_fragment_messageSend
			__parentOperand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_enclosingInteraction_interaction
			__combo_enclosingInteraction_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __messageSend_enclosingOperand_parentOperand
			__messageSend_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_enclosingOperand_parentOperand
			__combo_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_parentCombo
			__line_coveredBy_parentCombo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __interaction_fragment_combo
			__interaction_fragment_combo = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altFlowToOperand__target__operand
			altFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__source__alt
			alternative1ToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alternative1ToOperand__target__operand
			alternative1ToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parentOperand_covered_line
			__parentOperand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("AltSysStepNFToComboRule");
			// assign attribute __line_coveredBy_messageSend
			__line_coveredBy_messageSend.setName("coveredBy");
			// assign attribute __messageSend_covered_line
			__messageSend_covered_line.setName("covered");
			// assign attribute __parentOperand_fragment_messageSend
			__parentOperand_fragment_messageSend.setName("fragment");
			// assign attribute __messageSend_enclosingOperand_parentOperand
			__messageSend_enclosingOperand_parentOperand
					.setName("enclosingOperand");
			// assign attribute __parentOperand_fragment_messageReceive
			__parentOperand_fragment_messageReceive.setName("fragment");
			// assign attribute __messageReceive_enclosingOperand_parentOperand
			__messageReceive_enclosingOperand_parentOperand
					.setName("enclosingOperand");
			// assign attribute __line_coveredBy_parentOperand
			__line_coveredBy_parentOperand.setName("coveredBy");
			// assign attribute __parentOperand_covered_line
			__parentOperand_covered_line.setName("covered");
			// assign attribute __parentOperand_fragment_combo
			__parentOperand_fragment_combo.setName("fragment");
			// assign attribute __combo_enclosingOperand_parentOperand
			__combo_enclosingOperand_parentOperand.setName("enclosingOperand");
			// assign attribute __line_coveredBy_parentCombo
			__line_coveredBy_parentCombo.setName("coveredBy");
			// assign attribute __parentCombo_covered_line
			__parentCombo_covered_line.setName("covered");
			// assign attribute __combo_enclosingInteraction_interaction
			__combo_enclosingInteraction_interaction
					.setName("enclosingInteraction");
			// assign attribute __interaction_fragment_combo
			__interaction_fragment_combo.setName("fragment");
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
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__source__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					stepToCombo__target__combo, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_parentOperand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageReceive_enclosingOperand_parentOperand,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__step, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__source__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parentOperand_fragment_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parentCombo_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parentOperand_fragment_messageReceive, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parentOperand_fragment_messageSend, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__combo_enclosingInteraction_interaction,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__messageSend_enclosingOperand_parentOperand,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_enclosingOperand_parentOperand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_parentCombo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__interaction_fragment_combo, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternative1ToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parentOperand_covered_line, "translatedEdges");

			// create link
			step__actor__actor.setTrg(actor);

			// create link
			__parentOperand_covered_line.setTrg(line);

			// create link
			__line_coveredBy_messageSend.setSrc(line);

			// create link
			__parentCombo_covered_line.setTrg(line);

			// create link
			__operand_covered_line.setTrg(line);

			// create link
			__line_coveredBy_parentCombo.setSrc(line);

			// create link
			__messageSend_covered_line.setTrg(line);

			// create link
			__line_coveredBy_parentOperand.setSrc(line);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__parentOperand_fragment_messageSend.setTrg(messageSend);

			// create link
			__messageSend_covered_line.setSrc(messageSend);

			// create link
			__messageSend_enclosingOperand_parentOperand.setSrc(messageSend);

			// create link
			__line_coveredBy_messageSend.setTrg(messageSend);

			// create link
			flow__steps__step.setSrc(flow);

			// create link
			__parentOperand_fragment_messageReceive.setSrc(parentOperand);

			// create link
			__combo_enclosingOperand_parentOperand.setTrg(parentOperand);

			// create link
			__line_coveredBy_parentOperand.setTrg(parentOperand);

			// create link
			__parentOperand_fragment_messageSend.setSrc(parentOperand);

			// create link
			__messageSend_enclosingOperand_parentOperand.setTrg(parentOperand);

			// create link
			__parentOperand_fragment_combo.setSrc(parentOperand);

			// create link
			__messageReceive_enclosingOperand_parentOperand
					.setTrg(parentOperand);

			// create link
			__parentOperand_covered_line.setSrc(parentOperand);

			// create link
			__messageReceive_enclosingOperand_parentOperand
					.setSrc(messageReceive);

			// create link
			__parentOperand_fragment_messageReceive.setTrg(messageReceive);

			// create link
			__combo_enclosingOperand_parentOperand.setSrc(combo);

			// create link
			stepToCombo__target__combo.setTrg(combo);

			// create link
			__combo_enclosingInteraction_interaction.setSrc(combo);

			// create link
			__interaction_fragment_combo.setTrg(combo);

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			__parentOperand_fragment_combo.setTrg(combo);

			// create link
			__parentCombo_covered_line.setSrc(parentCombo);

			// create link
			__line_coveredBy_parentCombo.setTrg(parentCombo);

			// create link
			__combo_enclosingInteraction_interaction.setTrg(interaction);

			// create link
			__interaction_fragment_combo.setSrc(interaction);

			// create link
			step__actor__actor.setSrc(step);

			// create link
			flow__steps__step.setTrg(step);

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			stepToCombo__source__step.setTrg(step);

			// create link
			alternative1ToOperand__source__alt.setTrg(alt);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			stepToCombo__source__step.setSrc(stepToCombo);

			// create link
			stepToCombo__target__combo.setSrc(stepToCombo);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			alternative1ToOperand__target__operand.setTrg(operand);

			// create link
			altFlowToOperand__target__operand.setTrg(operand);

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
			altFlowToOperand__source__altFlow.setSrc(altFlowToOperand);

			// create link
			altFlowToOperand__target__operand.setSrc(altFlowToOperand);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand);
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
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		LiteralString spec = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __messageSend_covered_line = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __line_interaction_interaction = null;
		EMoflonEdge __line_coveredBy_parentOperand = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __parentCombo_covered_line = null;
		EMoflonEdge __interaction_lifeline_line = null;
		EMoflonEdge __line_coveredBy_messageSend = null;
		EMoflonEdge __parentOperand_covered_line = null;
		EMoflonEdge __line_coveredBy_parentCombo = null;
		EMoflonEdge __parentOperand_fragment_messageSend = null;
		EMoflonEdge __messageSend_enclosingOperand_parentOperand = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flowToParentOperand_source_flow = null;
		EMoflonEdge __flowToParentOperand_target_parentOperand = null;
		EMoflonEdge __parentOperand_fragment_combo = null;
		EMoflonEdge __parentCombo_operand_parentOperand = null;
		EMoflonEdge __combo_enclosingOperand_parentOperand = null;
		EMoflonEdge __messageReceive_enclosingOperand_parentOperand = null;
		EMoflonEdge __parentOperand_fragment_messageReceive = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __interaction_fragment_combo = null;
		EMoflonEdge __combo_enclosingInteraction_interaction = null;
		EMoflonEdge __useCaseToInteraction_target_interaction = null;
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
		NamedFlow flow = null;
		Iterator fujaba__IterParentOperandToFlowToParentOperand = null;
		FlowToInteractionFragment flowToParentOperand = null;

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
			ruleresult.setRule("AltSysStepNFToComboRule");

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
			_TmpObject = (match.getObject("parentCombo"));

			// ensure correct type and really bound of object parentCombo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			parentCombo = (CombinedFragment) _TmpObject;
			_TmpObject = (match.getObject("parentOperand"));

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;
			_TmpObject = (match.getObject("spec"));

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects parentCombo and combo 
			JavaSDM.ensure(!parentCombo.equals(combo));

			// check isomorphic binding between objects messageSend and messageReceive 
			JavaSDM.ensure(!messageSend.equals(messageReceive));

			// check isomorphic binding between objects parentOperand and operand 
			JavaSDM.ensure(!parentOperand.equals(operand));

			// iterate to-many link target from parentOperand to flowToParentOperand
			fujaba__Success = false;

			fujaba__IterParentOperandToFlowToParentOperand = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							parentOperand, FlowToInteractionFragment.class,
							"target")).iterator();

			while (fujaba__IterParentOperandToFlowToParentOperand.hasNext()) {
				try {
					flowToParentOperand = (FlowToInteractionFragment) fujaba__IterParentOperandToFlowToParentOperand
							.next();

					// check object flowToParentOperand is really bound
					JavaSDM.ensure(flowToParentOperand != null);
					// bind object
					_TmpObject = flowToParentOperand.getSource();

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
								// check object flowToParentOperand is really bound
								JavaSDM.ensure(flowToParentOperand != null);
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
								// check object parentCombo is really bound
								JavaSDM.ensure(parentCombo != null);
								// check object parentOperand is really bound
								JavaSDM.ensure(parentOperand != null);
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check object useCaseToInteraction is really bound
								JavaSDM.ensure(useCaseToInteraction != null);
								// check isomorphic binding between objects parentCombo and combo 
								JavaSDM.ensure(!parentCombo.equals(combo));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check isomorphic binding between objects parentOperand and operand 
								JavaSDM.ensure(!parentOperand.equals(operand));

								// check link fragment from combo to interaction
								JavaSDM.ensure(interaction.equals(combo
										.getEnclosingInteraction()));

								// check link fragment from combo to parentOperand
								JavaSDM.ensure(parentOperand.equals(combo
										.getEnclosingOperand()));

								// check link fragment from messageReceive to parentOperand
								JavaSDM.ensure(parentOperand
										.equals(messageReceive
												.getEnclosingOperand()));

								// check link fragment from messageSend to parentOperand
								JavaSDM.ensure(parentOperand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link operand from parentOperand to parentCombo
								JavaSDM.ensure(parentCombo.equals(parentOperand
										.eContainer()));

								// check link source from flowToParentOperand to flow
								JavaSDM.ensure(flow.equals(flowToParentOperand
										.getSource()));

								// check link source from useCaseToInteraction to useCase
								JavaSDM.ensure(useCase
										.equals(useCaseToInteraction
												.getSource()));

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link target from flowToParentOperand to parentOperand
								JavaSDM.ensure(parentOperand
										.equals(flowToParentOperand.getTarget()));

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

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// check link coveredBy from parentCombo to line
								JavaSDM.ensure(parentCombo.getCovered()
										.contains(line));

								// check link coveredBy from parentOperand to line
								JavaSDM.ensure(parentOperand.getCovered()
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
										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_covered_line
										__messageSend_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __operand_covered_line
										__operand_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_interaction_interaction
										__line_interaction_interaction = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_parentOperand
										__line_coveredBy_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_operand
										__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentCombo_covered_line
										__parentCombo_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __interaction_lifeline_line
										__interaction_lifeline_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_messageSend
										__line_coveredBy_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentOperand_covered_line
										__parentOperand_covered_line = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __line_coveredBy_parentCombo
										__line_coveredBy_parentCombo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentOperand_fragment_messageSend
										__parentOperand_fragment_messageSend = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageSend_enclosingOperand_parentOperand
										__messageSend_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToParentOperand_source_flow
										__flowToParentOperand_source_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowToParentOperand_target_parentOperand
										__flowToParentOperand_target_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentOperand_fragment_combo
										__parentOperand_fragment_combo = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentCombo_operand_parentOperand
										__parentCombo_operand_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __combo_enclosingOperand_parentOperand
										__combo_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __messageReceive_enclosingOperand_parentOperand
										__messageReceive_enclosingOperand_parentOperand = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parentOperand_fragment_messageReceive
										__parentOperand_fragment_messageReceive = TGGRuntimeFactory.eINSTANCE
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

										// create object __useCaseToInteraction_target_interaction
										__useCaseToInteraction_target_interaction = TGGRuntimeFactory.eINSTANCE
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
										// assign attribute __parentOperand_fragment_messageSend
										__parentOperand_fragment_messageSend
												.setName("fragment");
										// assign attribute __messageSend_enclosingOperand_parentOperand
										__messageSend_enclosingOperand_parentOperand
												.setName("enclosingOperand");
										// assign attribute __parentOperand_fragment_messageReceive
										__parentOperand_fragment_messageReceive
												.setName("fragment");
										// assign attribute __messageReceive_enclosingOperand_parentOperand
										__messageReceive_enclosingOperand_parentOperand
												.setName("enclosingOperand");
										// assign attribute __flowToParentOperand_source_flow
										__flowToParentOperand_source_flow
												.setName("source");
										// assign attribute __flowToParentOperand_target_parentOperand
										__flowToParentOperand_target_parentOperand
												.setName("target");
										// assign attribute __line_coveredBy_parentOperand
										__line_coveredBy_parentOperand
												.setName("coveredBy");
										// assign attribute __parentOperand_covered_line
										__parentOperand_covered_line
												.setName("covered");
										// assign attribute __parentOperand_fragment_combo
										__parentOperand_fragment_combo
												.setName("fragment");
										// assign attribute __combo_enclosingOperand_parentOperand
										__combo_enclosingOperand_parentOperand
												.setName("enclosingOperand");
										// assign attribute __parentCombo_operand_parentOperand
										__parentCombo_operand_parentOperand
												.setName("operand");
										// assign attribute __line_coveredBy_parentCombo
										__line_coveredBy_parentCombo
												.setName("coveredBy");
										// assign attribute __parentCombo_covered_line
										__parentCombo_covered_line
												.setName("covered");
										// assign attribute __combo_enclosingInteraction_interaction
										__combo_enclosingInteraction_interaction
												.setName("enclosingInteraction");
										// assign attribute __interaction_fragment_combo
										__interaction_fragment_combo
												.setName("fragment");
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
										__messageSend_covered_line.setTrg(line);

										// create link
										__operand_covered_line.setTrg(line);

										// create link
										__line_interaction_interaction
												.setSrc(line);

										// create link
										__line_coveredBy_parentOperand
												.setSrc(line);

										// create link
										__line_coveredBy_operand.setSrc(line);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														line);

										// create link
										__parentCombo_covered_line.setTrg(line);

										// create link
										__interaction_lifeline_line
												.setTrg(line);

										// create link
										__line_coveredBy_messageSend
												.setSrc(line);

										// create link
										__parentOperand_covered_line
												.setTrg(line);

										// create link
										__line_coveredBy_parentCombo
												.setSrc(line);

										// create link
										__line_coveredBy_messageSend
												.setTrg(messageSend);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageSend);

										// create link
										__parentOperand_fragment_messageSend
												.setTrg(messageSend);

										// create link
										__messageSend_enclosingOperand_parentOperand
												.setSrc(messageSend);

										// create link
										__messageSend_covered_line
												.setSrc(messageSend);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flowToParentOperand_source_flow
												.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flowToParentOperand_target_parentOperand
												.setTrg(parentOperand);

										// create link
										__parentOperand_fragment_messageSend
												.setSrc(parentOperand);

										// create link
										__parentOperand_fragment_combo
												.setSrc(parentOperand);

										// create link
										__parentCombo_operand_parentOperand
												.setTrg(parentOperand);

										// create link
										__parentOperand_covered_line
												.setSrc(parentOperand);

										// create link
										__messageSend_enclosingOperand_parentOperand
												.setTrg(parentOperand);

										// create link
										__combo_enclosingOperand_parentOperand
												.setTrg(parentOperand);

										// create link
										__line_coveredBy_parentOperand
												.setTrg(parentOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parentOperand);

										// create link
										__messageReceive_enclosingOperand_parentOperand
												.setTrg(parentOperand);

										// create link
										__parentOperand_fragment_messageReceive
												.setSrc(parentOperand);

										// create link
										__flowToParentOperand_source_flow
												.setSrc(flowToParentOperand);

										// create link
										__flowToParentOperand_target_parentOperand
												.setSrc(flowToParentOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowToParentOperand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														messageReceive);

										// create link
										__messageReceive_enclosingOperand_parentOperand
												.setSrc(messageReceive);

										// create link
										__parentOperand_fragment_messageReceive
												.setTrg(messageReceive);

										// create link
										__combo_operand_operand.setSrc(combo);

										// create link
										__interaction_fragment_combo
												.setTrg(combo);

										// create link
										__combo_enclosingOperand_parentOperand
												.setSrc(combo);

										// create link
										__combo_enclosingInteraction_interaction
												.setSrc(combo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														combo);

										// create link
										__parentOperand_fragment_combo
												.setTrg(combo);

										// create link
										__parentCombo_operand_parentOperand
												.setSrc(parentCombo);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parentCombo);

										// create link
										__line_coveredBy_parentCombo
												.setTrg(parentCombo);

										// create link
										__parentCombo_covered_line
												.setSrc(parentCombo);

										// create link
										__interaction_lifeline_line
												.setSrc(interaction);

										// create link
										__interaction_fragment_combo
												.setSrc(interaction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														interaction);

										// create link
										__useCaseToInteraction_target_interaction
												.setTrg(interaction);

										// create link
										__combo_enclosingInteraction_interaction
												.setTrg(interaction);

										// create link
										__line_interaction_interaction
												.setTrg(interaction);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										__useCaseToInteraction_source_useCase
												.setTrg(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__useCaseToInteraction_source_useCase
												.setSrc(useCaseToInteraction);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCaseToInteraction);

										// create link
										__useCaseToInteraction_target_interaction
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
										__combo_operand_operand.setTrg(operand);

										// create link
										__line_coveredBy_operand
												.setTrg(operand);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														operand);

										// create link
										__operand_covered_line.setSrc(operand);

										// create link
										__operand_guard_guard.setTrg(guard);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														guard);

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
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parentOperand_fragment_combo,
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
														__parentCombo_operand_parentOperand,
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
														__line_coveredBy_parentOperand,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__flowToParentOperand_target_parentOperand,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__flowToParentOperand_source_flow,
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
														__line_coveredBy_operand,
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
														__combo_enclosingOperand_parentOperand,
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
														__operand_covered_line,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__messageSend_enclosingOperand_parentOperand,
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
														__parentCombo_covered_line,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__line_coveredBy_parentCombo,
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
														__messageReceive_enclosingOperand_parentOperand,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parentOperand_fragment_messageReceive,
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
														__line_interaction_interaction,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parentOperand_covered_line,
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
														__packageDeclaration_actors_actor,
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
														__parentOperand_fragment_messageSend,
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
														__interaction_lifeline_line,
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
															flow,
															parentOperand,
															flowToParentOperand,
															messageReceive,
															combo,
															parentCombo,
															interaction,
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
														.setRuleName("AltSysStepNFToComboRule");
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
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("parentOperand", parentOperand);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("combo", combo);
		match.registerObject("parentCombo", parentCombo);
		match.registerObject("interaction", interaction);
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
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("parentOperand", parentOperand);
		isApplicableMatch.registerObject("flowToParentOperand",
				flowToParentOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("parentCombo", parentCombo);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parentOperand", parentOperand);
		ruleresult.registerObject("flowToParentOperand", flowToParentOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("parentCombo", parentCombo);
		ruleresult.registerObject("interaction", interaction);
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
				&& match.getObject("messageReceive")
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_442(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_501776 = null;
		Interaction __DEC_messageSend_enclosingInteraction_350996 = null;
		Interaction __DEC_operand_enclosingInteraction_851115 = null;
		InteractionOperand __DEC_combo_fragment_554494 = null;
		InteractionOperand __DEC_messageReceive_fragment_998047 = null;
		InteractionOperand __DEC_messageSend_fragment_668612 = null;
		InteractionOperand __DEC_operand_fragment_900294 = null;
		Constraint __DEC_spec_specification_630922 = null;
		InteractionOperand __DEC_guard_guard_299732 = null;
		CombinedFragment __DEC_operand_operand_439213 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
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
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

					// iterate to-many link coveredBy from line to parentCombo
					fujaba__Success = false;

					fujaba__IterLineToParentCombo = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToParentCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToParentCombo.next();

							// ensure correct type and really bound of object parentCombo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							parentCombo = (CombinedFragment) _TmpObject;
							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// bind object
							_TmpObject = _edge_coveredBy.getTrg();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;

							// check link coveredBy from messageSend to line
							JavaSDM.ensure(messageSend.getCovered().contains(
									line));

							// iterate to-many link coveredBy from line to parentOperand
							fujaba__Success = false;

							fujaba__IterLineToParentOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentOperand
											.next();

									// ensure correct type and really bound of object parentOperand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									parentOperand = (InteractionOperand) _TmpObject;
									// check isomorphic binding between objects parentOperand and operand 
									JavaSDM.ensure(!parentOperand
											.equals(operand));

									// check link fragment from combo to parentOperand
									JavaSDM.ensure(parentOperand.equals(combo
											.getEnclosingOperand()));

									// check link fragment from messageSend to parentOperand
									JavaSDM.ensure(parentOperand
											.equals(messageSend
													.getEnclosingOperand()));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
													__DEC_messageReceive_enclosingInteraction_501776 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_501776 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_501776 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_501776 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_501776
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_350996 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_350996 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_350996 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_350996 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_350996
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_851115 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_851115 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_851115 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_851115 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_851115
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_554494 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_554494 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_554494 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_554494 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_554494
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_554494 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_554494
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_998047 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_998047 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_998047 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_998047 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_998047
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_998047 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_998047
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_668612 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_668612 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_668612 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_668612 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_668612
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_668612 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_668612
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_900294 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_900294 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_900294 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_900294 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_900294
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_900294 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_900294
															.equals(parentOperand));

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
													__DEC_spec_specification_630922 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_630922 is really bound
													JavaSDM.ensure(__DEC_spec_specification_630922 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_630922
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_630922 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_630922
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

													// bind object
													__DEC_guard_guard_299732 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_299732 is really bound
													JavaSDM.ensure(__DEC_guard_guard_299732 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_299732
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_299732 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_299732
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_299732 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_299732
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_439213 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_439213 is really bound
													JavaSDM.ensure(__DEC_operand_operand_439213 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_439213
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_439213 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_439213
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_439213 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_439213
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_coveredBy to line
												JavaSDM.ensure(line
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_coveredBy to messageSend
												JavaSDM.ensure(messageSend
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_443(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_436109 = null;
		Interaction __DEC_messageSend_enclosingInteraction_63562 = null;
		Interaction __DEC_operand_enclosingInteraction_837155 = null;
		InteractionOperand __DEC_combo_fragment_533737 = null;
		InteractionOperand __DEC_messageReceive_fragment_95930 = null;
		InteractionOperand __DEC_messageSend_fragment_234266 = null;
		InteractionOperand __DEC_operand_fragment_188754 = null;
		Constraint __DEC_spec_specification_802030 = null;
		InteractionOperand __DEC_guard_guard_766300 = null;
		CombinedFragment __DEC_operand_operand_706329 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Lifeline line = null;
		InteractionOperand parentOperand = null;
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
			parentOperand = messageSend.getEnclosingOperand();

			// check object parentOperand is really bound
			JavaSDM.ensure(parentOperand != null);

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link coveredBy from messageSend to line
			JavaSDM.ensure(messageSend.getCovered().contains(line));

			// check link coveredBy from parentOperand to line
			JavaSDM.ensure(parentOperand.getCovered().contains(line));

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
					// check isomorphic binding between objects parentOperand and operand 
					JavaSDM.ensure(!parentOperand.equals(operand));

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

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// check link fragment from combo to parentOperand
					JavaSDM.ensure(parentOperand.equals(combo
							.getEnclosingOperand()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

					// iterate to-many link coveredBy from line to parentCombo
					fujaba__Success = false;

					fujaba__IterLineToParentCombo = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToParentCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToParentCombo.next();

							// ensure correct type and really bound of object parentCombo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							parentCombo = (CombinedFragment) _TmpObject;
							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link operand from parentOperand to parentCombo
							JavaSDM.ensure(parentCombo.equals(parentOperand
									.eContainer()));

							// iterate to-many link fragment from parentOperand to messageReceive
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageReceive = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageReceive
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageReceive
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
													__DEC_messageReceive_enclosingInteraction_436109 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_436109 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_436109 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_436109 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_436109
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_63562 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_63562 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_63562 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_63562 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_63562
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_837155 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_837155 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_837155 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_837155 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_837155
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_533737 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_533737 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_533737 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_533737 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_533737
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_533737 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_533737
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_95930 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_95930 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_95930 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_95930 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_95930
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_95930 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_95930
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_234266 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_234266 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_234266 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_234266 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_234266
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_234266 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_234266
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_188754 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_188754 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_188754 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_188754 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_188754
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_188754 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_188754
															.equals(parentOperand));

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
													__DEC_spec_specification_802030 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_802030 is really bound
													JavaSDM.ensure(__DEC_spec_specification_802030 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_802030
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_802030 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_802030
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

													// bind object
													__DEC_guard_guard_766300 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_766300 is really bound
													JavaSDM.ensure(__DEC_guard_guard_766300 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_766300
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_766300 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_766300
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_766300 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_766300
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_706329 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_706329 is really bound
													JavaSDM.ensure(__DEC_operand_operand_706329 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_706329
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_706329 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_706329
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_706329 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_706329
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
												JavaSDM.ensure(!_edge_coveredBy
														.equals(_edge_covered));

												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

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

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_444(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_653804 = null;
		Interaction __DEC_messageSend_enclosingInteraction_992847 = null;
		Interaction __DEC_operand_enclosingInteraction_609562 = null;
		InteractionOperand __DEC_combo_fragment_774898 = null;
		InteractionOperand __DEC_messageReceive_fragment_91389 = null;
		InteractionOperand __DEC_messageSend_fragment_202708 = null;
		InteractionOperand __DEC_operand_fragment_235103 = null;
		Constraint __DEC_spec_specification_424445 = null;
		InteractionOperand __DEC_guard_guard_103814 = null;
		CombinedFragment __DEC_operand_operand_337407 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// check link fragment from messageSend to parentOperand
			JavaSDM.ensure(parentOperand.equals(messageSend
					.getEnclosingOperand()));

			// bind object
			parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
					.eContainer() : null;

			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);

			// check if contained via correct reference
			JavaSDM.ensure(parentCombo.getOperand().contains(parentOperand));

			// iterate to-many link coveredBy from parentOperand to line
			fujaba__Success = false;

			fujaba__IterParentOperandToLine = new ArrayList(
					parentOperand.getCovered()).iterator();

			while (fujaba__IterParentOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterParentOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link coveredBy from messageSend to line
					JavaSDM.ensure(messageSend.getCovered().contains(line));

					// check link coveredBy from parentCombo to line
					JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

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

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// iterate to-many link fragment from parentOperand to messageReceive
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageReceive = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageReceive
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageReceive
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
											__DEC_messageReceive_enclosingInteraction_653804 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_653804 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_653804 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_653804 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_653804
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_enclosingInteraction_992847 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_992847 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_992847 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_992847 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_992847
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_609562 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_609562 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_609562 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_609562 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_609562
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_774898 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_774898 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_774898 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_774898 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_774898
													.equals(operand));

											// check isomorphic binding between objects __DEC_combo_fragment_774898 and parentOperand 
											JavaSDM.ensure(!__DEC_combo_fragment_774898
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_91389 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_91389 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_91389 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_91389 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_91389
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageReceive_fragment_91389 and parentOperand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_91389
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_202708 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_202708 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_202708 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_202708 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_202708
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageSend_fragment_202708 and parentOperand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_202708
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_235103 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_235103 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_235103 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_235103 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_235103
													.equals(operand));

											// check isomorphic binding between objects __DEC_operand_fragment_235103 and parentOperand 
											JavaSDM.ensure(!__DEC_operand_fragment_235103
													.equals(parentOperand));

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
											__DEC_spec_specification_424445 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_424445 is really bound
											JavaSDM.ensure(__DEC_spec_specification_424445 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_424445
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_424445 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_424445
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

											// bind object
											__DEC_guard_guard_103814 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_103814 is really bound
											JavaSDM.ensure(__DEC_guard_guard_103814 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_103814
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_103814 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_103814
													.equals(operand));

											// check isomorphic binding between objects __DEC_guard_guard_103814 and parentOperand 
											JavaSDM.ensure(!__DEC_guard_guard_103814
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_337407 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_337407 is really bound
											JavaSDM.ensure(__DEC_operand_operand_337407 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_337407
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_337407 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_337407
													.equals(combo));

											// check isomorphic binding between objects __DEC_operand_operand_337407 and parentCombo 
											JavaSDM.ensure(!__DEC_operand_operand_337407
													.equals(parentCombo));

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
										// check object parentCombo is really bound
										JavaSDM.ensure(parentCombo != null);
										// check object parentOperand is really bound
										JavaSDM.ensure(parentOperand != null);
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects parentCombo and combo 
										JavaSDM.ensure(!parentCombo
												.equals(combo));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check isomorphic binding between objects parentOperand and operand 
										JavaSDM.ensure(!parentOperand
												.equals(operand));

										// check link fragment from combo to interaction
										JavaSDM.ensure(interaction.equals(combo
												.getEnclosingInteraction()));

										// check link fragment from combo to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(combo
														.getEnclosingOperand()));

										// check link fragment from messageReceive to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageSend
														.getEnclosingOperand()));

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

										// check link fragment from operand to parentOperand
										JavaSDM.ensure(!(parentOperand
												.equals(operand
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

										// check link guard from parentOperand to guard
										JavaSDM.ensure(!(guard
												.equals(parentOperand
														.getGuard())));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link operand from parentOperand to parentCombo
										JavaSDM.ensure(parentCombo
												.equals(parentOperand
														.eContainer()));

										// check link operand from operand to parentCombo
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(operand,
														CombinedFragment.class,
														"$eContainer")
												.contains(parentCombo)));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_fragment to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(_edge_fragment.getSrc()));

										// check link trg from _edge_fragment to messageSend
										JavaSDM.ensure(messageSend
												.equals(_edge_fragment.getTrg()));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// check link coveredBy from parentCombo to line
										JavaSDM.ensure(parentCombo.getCovered()
												.contains(line));

										// check link coveredBy from parentOperand to line
										JavaSDM.ensure(parentOperand
												.getCovered().contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														parentOperand,
														messageReceive, combo,
														parentCombo,
														interaction, operand,
														guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_445(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_244492 = null;
		Interaction __DEC_messageSend_enclosingInteraction_389911 = null;
		Interaction __DEC_operand_enclosingInteraction_541888 = null;
		InteractionOperand __DEC_combo_fragment_957979 = null;
		InteractionOperand __DEC_messageReceive_fragment_706804 = null;
		InteractionOperand __DEC_messageSend_fragment_454154 = null;
		InteractionOperand __DEC_operand_fragment_955316 = null;
		Constraint __DEC_spec_specification_65921 = null;
		InteractionOperand __DEC_guard_guard_144356 = null;
		CombinedFragment __DEC_operand_operand_116717 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandTo_edge_fragment = null;
		EMoflonEdge _edge_fragment = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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
			_TmpObject = _edge_enclosingOperand.getTrg();

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// check link fragment from messageSend to parentOperand
			JavaSDM.ensure(parentOperand.equals(messageSend
					.getEnclosingOperand()));

			// bind object
			parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
					.eContainer() : null;

			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);

			// check if contained via correct reference
			JavaSDM.ensure(parentCombo.getOperand().contains(parentOperand));

			// iterate to-many link coveredBy from parentOperand to line
			fujaba__Success = false;

			fujaba__IterParentOperandToLine = new ArrayList(
					parentOperand.getCovered()).iterator();

			while (fujaba__IterParentOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterParentOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link coveredBy from messageSend to line
					JavaSDM.ensure(messageSend.getCovered().contains(line));

					// check link coveredBy from parentCombo to line
					JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

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

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// iterate to-many link fragment from parentOperand to messageReceive
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageReceive = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageReceive
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageReceive
											.next();

									// ensure correct type and really bound of object messageReceive
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageReceive = (MessageOccurrenceSpecification) _TmpObject;
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// iterate to-many link src from parentOperand to _edge_fragment
									fujaba__Success = false;

									fujaba__IterParentOperandTo_edge_fragment = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															parentOperand,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterParentOperandTo_edge_fragment
											.hasNext()) {
										try {
											_edge_fragment = (EMoflonEdge) fujaba__IterParentOperandTo_edge_fragment
													.next();

											// check object _edge_fragment is really bound
											JavaSDM.ensure(_edge_fragment != null);
											// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
											JavaSDM.ensure(!_edge_fragment
													.equals(_edge_enclosingOperand));

											// check link trg from _edge_fragment to messageSend
											JavaSDM.ensure(messageSend
													.equals(_edge_fragment
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
													__DEC_messageReceive_enclosingInteraction_244492 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_244492 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_244492 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_244492 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_244492
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_389911 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_389911 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_389911 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_389911 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_389911
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_541888 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_541888 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_541888 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_541888 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_541888
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_957979 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_957979 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_957979 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_957979 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_957979
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_957979 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_957979
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_706804 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_706804 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_706804 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_706804 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_706804
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_706804 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_706804
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_454154 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_454154 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_454154 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_454154 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_454154
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_454154 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_454154
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_955316 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_955316 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_955316 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_955316 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_955316
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_955316 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_955316
															.equals(parentOperand));

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
													__DEC_spec_specification_65921 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_65921 is really bound
													JavaSDM.ensure(__DEC_spec_specification_65921 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_65921
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_65921 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_65921
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

													// bind object
													__DEC_guard_guard_144356 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_144356 is really bound
													JavaSDM.ensure(__DEC_guard_guard_144356 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_144356
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_144356 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_144356
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_144356 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_144356
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_116717 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_116717 is really bound
													JavaSDM.ensure(__DEC_operand_operand_116717 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_116717
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_116717 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_116717
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_116717 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_116717
															.equals(parentCombo));

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

												// check object _edge_enclosingOperand is really bound
												JavaSDM.ensure(_edge_enclosingOperand != null);
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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
												JavaSDM.ensure(!_edge_fragment
														.equals(_edge_enclosingOperand));

												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_enclosingOperand to messageSend
												JavaSDM.ensure(messageSend
														.equals(_edge_enclosingOperand
																.getSrc()));

												// check link src from _edge_fragment to parentOperand
												JavaSDM.ensure(parentOperand
														.equals(_edge_fragment
																.getSrc()));

												// check link trg from _edge_enclosingOperand to parentOperand
												JavaSDM.ensure(parentOperand
														.equals(_edge_enclosingOperand
																.getTrg()));

												// check link trg from _edge_fragment to messageSend
												JavaSDM.ensure(messageSend
														.equals(_edge_fragment
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_446(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_163583 = null;
		Interaction __DEC_messageSend_enclosingInteraction_129977 = null;
		Interaction __DEC_operand_enclosingInteraction_343141 = null;
		InteractionOperand __DEC_combo_fragment_215994 = null;
		InteractionOperand __DEC_messageReceive_fragment_488296 = null;
		InteractionOperand __DEC_messageSend_fragment_84990 = null;
		InteractionOperand __DEC_operand_fragment_829563 = null;
		Constraint __DEC_spec_specification_295874 = null;
		InteractionOperand __DEC_guard_guard_715879 = null;
		CombinedFragment __DEC_operand_operand_314490 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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
			_TmpObject = _edge_fragment.getSrc();

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// check link fragment from messageReceive to parentOperand
			JavaSDM.ensure(parentOperand.equals(messageReceive
					.getEnclosingOperand()));

			// bind object
			parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
					.eContainer() : null;

			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);

			// check if contained via correct reference
			JavaSDM.ensure(parentCombo.getOperand().contains(parentOperand));

			// iterate to-many link coveredBy from parentOperand to line
			fujaba__Success = false;

			fujaba__IterParentOperandToLine = new ArrayList(
					parentOperand.getCovered()).iterator();

			while (fujaba__IterParentOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterParentOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link coveredBy from parentCombo to line
					JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

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

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// iterate to-many link fragment from parentOperand to messageSend
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageSend = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageSend
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageSend
											.next();

									// ensure correct type and really bound of object messageSend
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageSend = (MessageOccurrenceSpecification) _TmpObject;
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

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
											__DEC_messageReceive_enclosingInteraction_163583 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_163583 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_163583 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_163583 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_163583
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_enclosingInteraction_129977 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_129977 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_129977 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_129977 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_129977
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_343141 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_343141 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_343141 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_343141 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_343141
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_215994 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_215994 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_215994 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_215994 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_215994
													.equals(operand));

											// check isomorphic binding between objects __DEC_combo_fragment_215994 and parentOperand 
											JavaSDM.ensure(!__DEC_combo_fragment_215994
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_488296 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_488296 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_488296 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_488296 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_488296
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageReceive_fragment_488296 and parentOperand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_488296
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_84990 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_84990 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_84990 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_84990 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_84990
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageSend_fragment_84990 and parentOperand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_84990
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_829563 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_829563 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_829563 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_829563 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_829563
													.equals(operand));

											// check isomorphic binding between objects __DEC_operand_fragment_829563 and parentOperand 
											JavaSDM.ensure(!__DEC_operand_fragment_829563
													.equals(parentOperand));

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
											__DEC_spec_specification_295874 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_295874 is really bound
											JavaSDM.ensure(__DEC_spec_specification_295874 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_295874
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_295874 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_295874
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

											// bind object
											__DEC_guard_guard_715879 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_715879 is really bound
											JavaSDM.ensure(__DEC_guard_guard_715879 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_715879
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_715879 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_715879
													.equals(operand));

											// check isomorphic binding between objects __DEC_guard_guard_715879 and parentOperand 
											JavaSDM.ensure(!__DEC_guard_guard_715879
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_314490 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_314490 is really bound
											JavaSDM.ensure(__DEC_operand_operand_314490 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_314490
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_314490 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_314490
													.equals(combo));

											// check isomorphic binding between objects __DEC_operand_operand_314490 and parentCombo 
											JavaSDM.ensure(!__DEC_operand_operand_314490
													.equals(parentCombo));

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
										// check object parentCombo is really bound
										JavaSDM.ensure(parentCombo != null);
										// check object parentOperand is really bound
										JavaSDM.ensure(parentOperand != null);
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects parentCombo and combo 
										JavaSDM.ensure(!parentCombo
												.equals(combo));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check isomorphic binding between objects parentOperand and operand 
										JavaSDM.ensure(!parentOperand
												.equals(operand));

										// check link fragment from combo to interaction
										JavaSDM.ensure(interaction.equals(combo
												.getEnclosingInteraction()));

										// check link fragment from combo to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(combo
														.getEnclosingOperand()));

										// check link fragment from messageReceive to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageSend
														.getEnclosingOperand()));

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

										// check link fragment from operand to parentOperand
										JavaSDM.ensure(!(parentOperand
												.equals(operand
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

										// check link guard from parentOperand to guard
										JavaSDM.ensure(!(guard
												.equals(parentOperand
														.getGuard())));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link operand from parentOperand to parentCombo
										JavaSDM.ensure(parentCombo
												.equals(parentOperand
														.eContainer()));

										// check link operand from operand to parentCombo
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(operand,
														CombinedFragment.class,
														"$eContainer")
												.contains(parentCombo)));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_fragment to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(_edge_fragment.getSrc()));

										// check link trg from _edge_fragment to messageReceive
										JavaSDM.ensure(messageReceive
												.equals(_edge_fragment.getTrg()));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// check link coveredBy from parentCombo to line
										JavaSDM.ensure(parentCombo.getCovered()
												.contains(line));

										// check link coveredBy from parentOperand to line
										JavaSDM.ensure(parentOperand
												.getCovered().contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														parentOperand,
														messageReceive, combo,
														parentCombo,
														interaction, operand,
														guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_447(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_855321 = null;
		Interaction __DEC_messageSend_enclosingInteraction_542788 = null;
		Interaction __DEC_operand_enclosingInteraction_328237 = null;
		InteractionOperand __DEC_combo_fragment_24673 = null;
		InteractionOperand __DEC_messageReceive_fragment_49497 = null;
		InteractionOperand __DEC_messageSend_fragment_558080 = null;
		InteractionOperand __DEC_operand_fragment_249954 = null;
		Constraint __DEC_spec_specification_170541 = null;
		InteractionOperand __DEC_guard_guard_808562 = null;
		CombinedFragment __DEC_operand_operand_29896 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandTo_edge_fragment = null;
		EMoflonEdge _edge_fragment = null;
		Iterator fujaba__IterParentOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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

			// check object _edge_enclosingOperand is really bound
			JavaSDM.ensure(_edge_enclosingOperand != null);
			// bind object
			_TmpObject = _edge_enclosingOperand.getSrc();

			// ensure correct type and really bound of object messageReceive
			JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
			messageReceive = (MessageOccurrenceSpecification) _TmpObject;

			// bind object
			_TmpObject = _edge_enclosingOperand.getTrg();

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// check link fragment from messageReceive to parentOperand
			JavaSDM.ensure(parentOperand.equals(messageReceive
					.getEnclosingOperand()));

			// bind object
			parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
					.eContainer() : null;

			// check object parentCombo is really bound
			JavaSDM.ensure(parentCombo != null);

			// check if contained via correct reference
			JavaSDM.ensure(parentCombo.getOperand().contains(parentOperand));

			// iterate to-many link coveredBy from parentOperand to line
			fujaba__Success = false;

			fujaba__IterParentOperandToLine = new ArrayList(
					parentOperand.getCovered()).iterator();

			while (fujaba__IterParentOperandToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterParentOperandToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// bind object
					interaction = line.getInteraction();

					// check object interaction is really bound
					JavaSDM.ensure(interaction != null);

					// check link coveredBy from parentCombo to line
					JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

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

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// bind object
							_TmpObject = guard.getSpecification();

							// ensure correct type and really bound of object spec
							JavaSDM.ensure(_TmpObject instanceof LiteralString);
							spec = (LiteralString) _TmpObject;

							// iterate to-many link fragment from parentOperand to messageSend
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageSend = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageSend
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageSend
											.next();

									// ensure correct type and really bound of object messageSend
									JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
									messageSend = (MessageOccurrenceSpecification) _TmpObject;
									// check isomorphic binding between objects messageSend and messageReceive 
									JavaSDM.ensure(!messageSend
											.equals(messageReceive));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

									// iterate to-many link src from parentOperand to _edge_fragment
									fujaba__Success = false;

									fujaba__IterParentOperandTo_edge_fragment = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															parentOperand,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterParentOperandTo_edge_fragment
											.hasNext()) {
										try {
											_edge_fragment = (EMoflonEdge) fujaba__IterParentOperandTo_edge_fragment
													.next();

											// check object _edge_fragment is really bound
											JavaSDM.ensure(_edge_fragment != null);
											// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
											JavaSDM.ensure(!_edge_fragment
													.equals(_edge_enclosingOperand));

											// check link trg from _edge_fragment to messageReceive
											JavaSDM.ensure(messageReceive
													.equals(_edge_fragment
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
													__DEC_messageReceive_enclosingInteraction_855321 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_855321 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_855321 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_855321 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_855321
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_542788 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_542788 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_542788 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_542788 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_542788
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_328237 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_328237 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_328237 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_328237 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_328237
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_24673 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_24673 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_24673 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_24673 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_24673
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_24673 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_24673
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_49497 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_49497 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_49497 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_49497 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_49497
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_49497 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_49497
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_558080 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_558080 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_558080 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_558080 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_558080
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_558080 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_558080
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_249954 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_249954 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_249954 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_249954 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_249954
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_249954 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_249954
															.equals(parentOperand));

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
													__DEC_spec_specification_170541 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_170541 is really bound
													JavaSDM.ensure(__DEC_spec_specification_170541 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_170541
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_170541 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_170541
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

													// bind object
													__DEC_guard_guard_808562 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_808562 is really bound
													JavaSDM.ensure(__DEC_guard_guard_808562 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_808562
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_808562 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_808562
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_808562 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_808562
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_29896 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_29896 is really bound
													JavaSDM.ensure(__DEC_operand_operand_29896 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_29896
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_29896 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_29896
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_29896 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_29896
															.equals(parentCombo));

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

												// check object _edge_enclosingOperand is really bound
												JavaSDM.ensure(_edge_enclosingOperand != null);
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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
												JavaSDM.ensure(!_edge_fragment
														.equals(_edge_enclosingOperand));

												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_enclosingOperand to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_enclosingOperand
																.getSrc()));

												// check link src from _edge_fragment to parentOperand
												JavaSDM.ensure(parentOperand
														.equals(_edge_fragment
																.getSrc()));

												// check link trg from _edge_enclosingOperand to parentOperand
												JavaSDM.ensure(parentOperand
														.equals(_edge_enclosingOperand
																.getTrg()));

												// check link trg from _edge_fragment to messageReceive
												JavaSDM.ensure(messageReceive
														.equals(_edge_fragment
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_448(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_504217 = null;
		Interaction __DEC_messageSend_enclosingInteraction_250747 = null;
		Interaction __DEC_operand_enclosingInteraction_106190 = null;
		InteractionOperand __DEC_combo_fragment_197815 = null;
		InteractionOperand __DEC_messageReceive_fragment_415518 = null;
		InteractionOperand __DEC_messageSend_fragment_686973 = null;
		InteractionOperand __DEC_operand_fragment_116881 = null;
		Constraint __DEC_spec_specification_392250 = null;
		InteractionOperand __DEC_guard_guard_342544 = null;
		CombinedFragment __DEC_operand_operand_402647 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
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
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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
							_TmpObject = _edge_coveredBy.getTrg();

							// ensure correct type and really bound of object parentOperand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							parentOperand = (InteractionOperand) _TmpObject;

							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// check link fragment from messageSend to parentOperand
							JavaSDM.ensure(parentOperand.equals(messageSend
									.getEnclosingOperand()));

							// bind object
							parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
									.eContainer() : null;

							// check object parentCombo is really bound
							JavaSDM.ensure(parentCombo != null);

							// check if contained via correct reference
							JavaSDM.ensure(parentCombo.getOperand().contains(
									parentOperand));

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// check link coveredBy from parentCombo to line
							JavaSDM.ensure(parentCombo.getCovered().contains(
									line));

							// check link coveredBy from parentOperand to line
							JavaSDM.ensure(parentOperand.getCovered().contains(
									line));

							// iterate to-many link fragment from parentOperand to messageReceive
							fujaba__Success = false;

							fujaba__IterParentOperandToMessageReceive = new ArrayList(
									parentOperand.getFragment()).iterator();

							while (fujaba__IterParentOperandToMessageReceive
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterParentOperandToMessageReceive
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
											__DEC_messageReceive_enclosingInteraction_504217 = messageReceive
													.getEnclosingInteraction();

											// check object __DEC_messageReceive_enclosingInteraction_504217 is really bound
											JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_504217 != null);

											// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_504217 and interaction 
											JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_504217
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_enclosingInteraction_250747 = messageSend
													.getEnclosingInteraction();

											// check object __DEC_messageSend_enclosingInteraction_250747 is really bound
											JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_250747 != null);

											// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_250747 and interaction 
											JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_250747
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_enclosingInteraction_106190 = operand
													.getEnclosingInteraction();

											// check object __DEC_operand_enclosingInteraction_106190 is really bound
											JavaSDM.ensure(__DEC_operand_enclosingInteraction_106190 != null);

											// check isomorphic binding between objects __DEC_operand_enclosingInteraction_106190 and interaction 
											JavaSDM.ensure(!__DEC_operand_enclosingInteraction_106190
													.equals(interaction));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_combo_fragment_197815 = combo
													.getEnclosingOperand();

											// check object __DEC_combo_fragment_197815 is really bound
											JavaSDM.ensure(__DEC_combo_fragment_197815 != null);

											// check isomorphic binding between objects __DEC_combo_fragment_197815 and operand 
											JavaSDM.ensure(!__DEC_combo_fragment_197815
													.equals(operand));

											// check isomorphic binding between objects __DEC_combo_fragment_197815 and parentOperand 
											JavaSDM.ensure(!__DEC_combo_fragment_197815
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageReceive_fragment_415518 = messageReceive
													.getEnclosingOperand();

											// check object __DEC_messageReceive_fragment_415518 is really bound
											JavaSDM.ensure(__DEC_messageReceive_fragment_415518 != null);

											// check isomorphic binding between objects __DEC_messageReceive_fragment_415518 and operand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_415518
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageReceive_fragment_415518 and parentOperand 
											JavaSDM.ensure(!__DEC_messageReceive_fragment_415518
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_messageSend_fragment_686973 = messageSend
													.getEnclosingOperand();

											// check object __DEC_messageSend_fragment_686973 is really bound
											JavaSDM.ensure(__DEC_messageSend_fragment_686973 != null);

											// check isomorphic binding between objects __DEC_messageSend_fragment_686973 and operand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_686973
													.equals(operand));

											// check isomorphic binding between objects __DEC_messageSend_fragment_686973 and parentOperand 
											JavaSDM.ensure(!__DEC_messageSend_fragment_686973
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_fragment_116881 = operand
													.getEnclosingOperand();

											// check object __DEC_operand_fragment_116881 is really bound
											JavaSDM.ensure(__DEC_operand_fragment_116881 != null);

											// check isomorphic binding between objects __DEC_operand_fragment_116881 and operand 
											JavaSDM.ensure(!__DEC_operand_fragment_116881
													.equals(operand));

											// check isomorphic binding between objects __DEC_operand_fragment_116881 and parentOperand 
											JavaSDM.ensure(!__DEC_operand_fragment_116881
													.equals(parentOperand));

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
											__DEC_spec_specification_392250 = spec
													.eContainer() instanceof Constraint ? (Constraint) spec
													.eContainer() : null;

											// check object __DEC_spec_specification_392250 is really bound
											JavaSDM.ensure(__DEC_spec_specification_392250 != null);

											// check if contained via correct reference
											JavaSDM.ensure(spec
													.equals(__DEC_spec_specification_392250
															.getSpecification()));

											// check isomorphic binding between objects __DEC_spec_specification_392250 and guard 
											JavaSDM.ensure(!__DEC_spec_specification_392250
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

											// bind object
											__DEC_guard_guard_342544 = guard
													.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
													.eContainer() : null;

											// check object __DEC_guard_guard_342544 is really bound
											JavaSDM.ensure(__DEC_guard_guard_342544 != null);

											// check if contained via correct reference
											JavaSDM.ensure(guard
													.equals(__DEC_guard_guard_342544
															.getGuard()));

											// check isomorphic binding between objects __DEC_guard_guard_342544 and operand 
											JavaSDM.ensure(!__DEC_guard_guard_342544
													.equals(operand));

											// check isomorphic binding between objects __DEC_guard_guard_342544 and parentOperand 
											JavaSDM.ensure(!__DEC_guard_guard_342544
													.equals(parentOperand));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_operand_operand_402647 = operand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
													.eContainer() : null;

											// check object __DEC_operand_operand_402647 is really bound
											JavaSDM.ensure(__DEC_operand_operand_402647 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_operand_operand_402647
													.getOperand().contains(
															operand));

											// check isomorphic binding between objects __DEC_operand_operand_402647 and combo 
											JavaSDM.ensure(!__DEC_operand_operand_402647
													.equals(combo));

											// check isomorphic binding between objects __DEC_operand_operand_402647 and parentCombo 
											JavaSDM.ensure(!__DEC_operand_operand_402647
													.equals(parentCombo));

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
										// check object parentCombo is really bound
										JavaSDM.ensure(parentCombo != null);
										// check object parentOperand is really bound
										JavaSDM.ensure(parentOperand != null);
										// check object spec is really bound
										JavaSDM.ensure(spec != null);
										// check isomorphic binding between objects parentCombo and combo 
										JavaSDM.ensure(!parentCombo
												.equals(combo));

										// check isomorphic binding between objects messageSend and messageReceive 
										JavaSDM.ensure(!messageSend
												.equals(messageReceive));

										// check isomorphic binding between objects parentOperand and operand 
										JavaSDM.ensure(!parentOperand
												.equals(operand));

										// check link fragment from combo to interaction
										JavaSDM.ensure(interaction.equals(combo
												.getEnclosingInteraction()));

										// check link fragment from combo to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(combo
														.getEnclosingOperand()));

										// check link fragment from messageReceive to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageReceive
														.getEnclosingOperand()));

										// check link fragment from messageSend to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(messageSend
														.getEnclosingOperand()));

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

										// check link fragment from operand to parentOperand
										JavaSDM.ensure(!(parentOperand
												.equals(operand
														.getEnclosingOperand())));

										// check link guard from operand to guard
										JavaSDM.ensure(guard.equals(operand
												.getGuard()));

										// check link guard from parentOperand to guard
										JavaSDM.ensure(!(guard
												.equals(parentOperand
														.getGuard())));

										// check link lifeline from line to interaction
										JavaSDM.ensure(interaction.equals(line
												.getInteraction()));

										// check link operand from operand to combo
										JavaSDM.ensure(combo.equals(operand
												.eContainer()));

										// check link operand from parentOperand to parentCombo
										JavaSDM.ensure(parentCombo
												.equals(parentOperand
														.eContainer()));

										// check link operand from operand to parentCombo
										JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(operand,
														CombinedFragment.class,
														"$eContainer")
												.contains(parentCombo)));

										// check link specification from spec to guard
										JavaSDM.ensure(guard.equals(spec
												.eContainer()));

										// check link src from _edge_coveredBy to line
										JavaSDM.ensure(line
												.equals(_edge_coveredBy
														.getSrc()));

										// check link trg from _edge_coveredBy to parentOperand
										JavaSDM.ensure(parentOperand
												.equals(_edge_coveredBy
														.getTrg()));

										// check link coveredBy from messageSend to line
										JavaSDM.ensure(messageSend.getCovered()
												.contains(line));

										// check link coveredBy from operand to line
										JavaSDM.ensure(operand.getCovered()
												.contains(line));

										// check link coveredBy from parentCombo to line
										JavaSDM.ensure(parentCombo.getCovered()
												.contains(line));

										// check link coveredBy from parentOperand to line
										JavaSDM.ensure(parentOperand
												.getCovered().contains(line));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match, line,
														messageSend,
														parentOperand,
														messageReceive, combo,
														parentCombo,
														interaction, operand,
														guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_449(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_554689 = null;
		Interaction __DEC_messageSend_enclosingInteraction_718328 = null;
		Interaction __DEC_operand_enclosingInteraction_472492 = null;
		InteractionOperand __DEC_combo_fragment_150505 = null;
		InteractionOperand __DEC_messageReceive_fragment_701866 = null;
		InteractionOperand __DEC_messageSend_fragment_879580 = null;
		InteractionOperand __DEC_operand_fragment_464995 = null;
		Constraint __DEC_spec_specification_917633 = null;
		InteractionOperand __DEC_guard_guard_514844 = null;
		CombinedFragment __DEC_operand_operand_56199 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
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
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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
							parentOperand = messageSend.getEnclosingOperand();

							// check object parentOperand is really bound
							JavaSDM.ensure(parentOperand != null);

							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// check link src from _edge_covered to parentOperand
							JavaSDM.ensure(parentOperand.equals(_edge_covered
									.getSrc()));

							// check link coveredBy from parentOperand to line
							JavaSDM.ensure(parentOperand.getCovered().contains(
									line));

							// iterate to-many link coveredBy from line to parentCombo
							fujaba__Success = false;

							fujaba__IterLineToParentCombo = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentCombo
											.next();

									// ensure correct type and really bound of object parentCombo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									parentCombo = (CombinedFragment) _TmpObject;
									// check isomorphic binding between objects parentCombo and combo 
									JavaSDM.ensure(!parentCombo.equals(combo));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
															.getOppositeReference(
																	line,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

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

													// check link trg from _edge_coveredBy to parentOperand
													JavaSDM.ensure(parentOperand
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
															__DEC_messageReceive_enclosingInteraction_554689 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_554689 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_554689 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_554689 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_554689
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_718328 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_718328 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_718328 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_718328 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_718328
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_472492 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_472492 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_472492 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_472492 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_472492
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_150505 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_150505 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_150505 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_150505 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_150505
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_150505 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_150505
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_701866 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_701866 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_701866 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_701866 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_701866
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_701866 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_701866
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_879580 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_879580 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_879580 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_879580 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_879580
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_879580 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_879580
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_464995 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_464995 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_464995 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_464995 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_464995
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_464995 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_464995
																	.equals(parentOperand));

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
															__DEC_spec_specification_917633 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_917633 is really bound
															JavaSDM.ensure(__DEC_spec_specification_917633 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_917633
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_917633 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_917633
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

															// bind object
															__DEC_guard_guard_514844 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_514844 is really bound
															JavaSDM.ensure(__DEC_guard_guard_514844 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_514844
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_514844 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_514844
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_514844 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_514844
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_56199 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_56199 is really bound
															JavaSDM.ensure(__DEC_operand_operand_56199 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_56199
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_56199 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_56199
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_56199 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_56199
																	.equals(parentCombo));

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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
														JavaSDM.ensure(!_edge_coveredBy
																.equals(_edge_covered));

														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_covered to parentOperand
														JavaSDM.ensure(parentOperand
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

														// check link trg from _edge_coveredBy to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(_edge_coveredBy
																		.getTrg()));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_450(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_922103 = null;
		Interaction __DEC_messageSend_enclosingInteraction_601240 = null;
		Interaction __DEC_operand_enclosingInteraction_775008 = null;
		InteractionOperand __DEC_combo_fragment_45877 = null;
		InteractionOperand __DEC_messageReceive_fragment_480727 = null;
		InteractionOperand __DEC_messageSend_fragment_661268 = null;
		InteractionOperand __DEC_operand_fragment_577174 = null;
		Constraint __DEC_spec_specification_655509 = null;
		InteractionOperand __DEC_guard_guard_736980 = null;
		CombinedFragment __DEC_operand_operand_101227 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		CombinedFragment combo = null;
		InteractionOperand parentOperand = null;

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

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// bind object
			_TmpObject = _edge_fragment.getTrg();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// check link fragment from combo to parentOperand
			JavaSDM.ensure(parentOperand.equals(combo.getEnclosingOperand()));

			// iterate to-many link fragment from parentOperand to messageReceive
			fujaba__Success = false;

			fujaba__IterParentOperandToMessageReceive = new ArrayList(
					parentOperand.getFragment()).iterator();

			while (fujaba__IterParentOperandToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterParentOperandToMessageReceive
							.next();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;
					// bind object
					parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
							.eContainer() : null;

					// check object parentCombo is really bound
					JavaSDM.ensure(parentCombo != null);

					// check if contained via correct reference
					JavaSDM.ensure(parentCombo.getOperand().contains(
							parentOperand));

					// check isomorphic binding between objects parentCombo and combo 
					JavaSDM.ensure(!parentCombo.equals(combo));

					// iterate to-many link coveredBy from parentOperand to line
					fujaba__Success = false;

					fujaba__IterParentOperandToLine = new ArrayList(
							parentOperand.getCovered()).iterator();

					while (fujaba__IterParentOperandToLine.hasNext()) {
						try {
							line = (Lifeline) fujaba__IterParentOperandToLine
									.next();

							// check object line is really bound
							JavaSDM.ensure(line != null);
							// bind object
							interaction = line.getInteraction();

							// check object interaction is really bound
							JavaSDM.ensure(interaction != null);

							// check link fragment from combo to interaction
							JavaSDM.ensure(interaction.equals(combo
									.getEnclosingInteraction()));

							// check link coveredBy from parentCombo to line
							JavaSDM.ensure(parentCombo.getCovered().contains(
									line));

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
									// check isomorphic binding between objects parentOperand and operand 
									JavaSDM.ensure(!parentOperand
											.equals(operand));

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

									// iterate to-many link fragment from parentOperand to messageSend
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageSend = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageSend
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageSend
													.next();

											// ensure correct type and really bound of object messageSend
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageSend = (MessageOccurrenceSpecification) _TmpObject;
											// check isomorphic binding between objects messageSend and messageReceive 
											JavaSDM.ensure(!messageSend
													.equals(messageReceive));

											// check link coveredBy from messageSend to line
											JavaSDM.ensure(messageSend
													.getCovered()
													.contains(line));

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
													__DEC_messageReceive_enclosingInteraction_922103 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_922103 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_922103 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_922103 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_922103
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_601240 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_601240 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_601240 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_601240 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_601240
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_775008 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_775008 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_775008 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_775008 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_775008
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_45877 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_45877 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_45877 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_45877 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_45877
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_45877 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_45877
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_480727 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_480727 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_480727 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_480727 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_480727
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_480727 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_480727
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_661268 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_661268 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_661268 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_661268 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_661268
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_661268 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_661268
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_577174 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_577174 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_577174 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_577174 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_577174
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_577174 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_577174
															.equals(parentOperand));

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
													__DEC_spec_specification_655509 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_655509 is really bound
													JavaSDM.ensure(__DEC_spec_specification_655509 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_655509
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_655509 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_655509
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

													// bind object
													__DEC_guard_guard_736980 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_736980 is really bound
													JavaSDM.ensure(__DEC_guard_guard_736980 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_736980
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_736980 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_736980
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_736980 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_736980
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_101227 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_101227 is really bound
													JavaSDM.ensure(__DEC_operand_operand_101227 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_101227
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_101227 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_101227
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_101227 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_101227
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_fragment to parentOperand
												JavaSDM.ensure(parentOperand
														.equals(_edge_fragment
																.getSrc()));

												// check link trg from _edge_fragment to combo
												JavaSDM.ensure(combo
														.equals(_edge_fragment
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_451(
			EMoflonEdge _edge_enclosingOperand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_198622 = null;
		Interaction __DEC_messageSend_enclosingInteraction_625130 = null;
		Interaction __DEC_operand_enclosingInteraction_477921 = null;
		InteractionOperand __DEC_combo_fragment_821362 = null;
		InteractionOperand __DEC_messageReceive_fragment_252412 = null;
		InteractionOperand __DEC_messageSend_fragment_921886 = null;
		InteractionOperand __DEC_operand_fragment_859418 = null;
		Constraint __DEC_spec_specification_650305 = null;
		InteractionOperand __DEC_guard_guard_27838 = null;
		CombinedFragment __DEC_operand_operand_984094 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandTo_edge_fragment = null;
		EMoflonEdge _edge_fragment = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Interaction interaction = null;
		Iterator fujaba__IterParentOperandToLine = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;
		Iterator fujaba__IterParentOperandToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		InteractionOperand parentOperand = null;
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

			// check object _edge_enclosingOperand is really bound
			JavaSDM.ensure(_edge_enclosingOperand != null);
			// bind object
			_TmpObject = _edge_enclosingOperand.getSrc();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// bind object
			_TmpObject = _edge_enclosingOperand.getTrg();

			// ensure correct type and really bound of object parentOperand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			parentOperand = (InteractionOperand) _TmpObject;

			// check link fragment from combo to parentOperand
			JavaSDM.ensure(parentOperand.equals(combo.getEnclosingOperand()));

			// iterate to-many link fragment from parentOperand to messageReceive
			fujaba__Success = false;

			fujaba__IterParentOperandToMessageReceive = new ArrayList(
					parentOperand.getFragment()).iterator();

			while (fujaba__IterParentOperandToMessageReceive.hasNext()) {
				try {
					_TmpObject = fujaba__IterParentOperandToMessageReceive
							.next();

					// ensure correct type and really bound of object messageReceive
					JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
					messageReceive = (MessageOccurrenceSpecification) _TmpObject;
					// iterate to-many link fragment from parentOperand to messageSend
					fujaba__Success = false;

					fujaba__IterParentOperandToMessageSend = new ArrayList(
							parentOperand.getFragment()).iterator();

					while (fujaba__IterParentOperandToMessageSend.hasNext()) {
						try {
							_TmpObject = fujaba__IterParentOperandToMessageSend
									.next();

							// ensure correct type and really bound of object messageSend
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageSend = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// bind object
							parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
									.eContainer() : null;

							// check object parentCombo is really bound
							JavaSDM.ensure(parentCombo != null);

							// check if contained via correct reference
							JavaSDM.ensure(parentCombo.getOperand().contains(
									parentOperand));

							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

							// iterate to-many link coveredBy from parentOperand to line
							fujaba__Success = false;

							fujaba__IterParentOperandToLine = new ArrayList(
									parentOperand.getCovered()).iterator();

							while (fujaba__IterParentOperandToLine.hasNext()) {
								try {
									line = (Lifeline) fujaba__IterParentOperandToLine
											.next();

									// check object line is really bound
									JavaSDM.ensure(line != null);
									// bind object
									interaction = line.getInteraction();

									// check object interaction is really bound
									JavaSDM.ensure(interaction != null);

									// check link fragment from combo to interaction
									JavaSDM.ensure(interaction.equals(combo
											.getEnclosingInteraction()));

									// check link coveredBy from messageSend to line
									JavaSDM.ensure(messageSend.getCovered()
											.contains(line));

									// check link coveredBy from parentCombo to line
									JavaSDM.ensure(parentCombo.getCovered()
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
											// check isomorphic binding between objects parentOperand and operand 
											JavaSDM.ensure(!parentOperand
													.equals(operand));

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

											// iterate to-many link src from parentOperand to _edge_fragment
											fujaba__Success = false;

											fujaba__IterParentOperandTo_edge_fragment = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	parentOperand,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

											while (fujaba__IterParentOperandTo_edge_fragment
													.hasNext()) {
												try {
													_edge_fragment = (EMoflonEdge) fujaba__IterParentOperandTo_edge_fragment
															.next();

													// check object _edge_fragment is really bound
													JavaSDM.ensure(_edge_fragment != null);
													// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
													JavaSDM.ensure(!_edge_fragment
															.equals(_edge_enclosingOperand));

													// check link trg from _edge_fragment to combo
													JavaSDM.ensure(combo
															.equals(_edge_fragment
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
															__DEC_messageReceive_enclosingInteraction_198622 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_198622 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_198622 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_198622 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_198622
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_625130 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_625130 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_625130 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_625130 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_625130
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_477921 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_477921 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_477921 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_477921 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_477921
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_821362 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_821362 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_821362 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_821362 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_821362
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_821362 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_821362
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_252412 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_252412 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_252412 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_252412 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_252412
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_252412 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_252412
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_921886 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_921886 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_921886 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_921886 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_921886
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_921886 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_921886
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_859418 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_859418 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_859418 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_859418 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_859418
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_859418 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_859418
																	.equals(parentOperand));

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
															__DEC_spec_specification_650305 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_650305 is really bound
															JavaSDM.ensure(__DEC_spec_specification_650305 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_650305
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_650305 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_650305
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

															// bind object
															__DEC_guard_guard_27838 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_27838 is really bound
															JavaSDM.ensure(__DEC_guard_guard_27838 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_27838
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_27838 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_27838
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_27838 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_27838
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_984094 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_984094 is really bound
															JavaSDM.ensure(__DEC_operand_operand_984094 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_984094
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_984094 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_984094
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_984094 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_984094
																	.equals(parentCombo));

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

														// check object _edge_enclosingOperand is really bound
														JavaSDM.ensure(_edge_enclosingOperand != null);
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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects _edge_fragment and _edge_enclosingOperand 
														JavaSDM.ensure(!_edge_fragment
																.equals(_edge_enclosingOperand));

														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_enclosingOperand to combo
														JavaSDM.ensure(combo
																.equals(_edge_enclosingOperand
																		.getSrc()));

														// check link src from _edge_fragment to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(_edge_fragment
																		.getSrc()));

														// check link trg from _edge_enclosingOperand to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(_edge_enclosingOperand
																		.getTrg()));

														// check link trg from _edge_fragment to combo
														JavaSDM.ensure(combo
																.equals(_edge_fragment
																		.getTrg()));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_452(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_236671 = null;
		Interaction __DEC_messageSend_enclosingInteraction_341175 = null;
		Interaction __DEC_operand_enclosingInteraction_623414 = null;
		InteractionOperand __DEC_combo_fragment_531288 = null;
		InteractionOperand __DEC_messageReceive_fragment_735276 = null;
		InteractionOperand __DEC_messageSend_fragment_547769 = null;
		InteractionOperand __DEC_operand_fragment_764922 = null;
		Constraint __DEC_spec_specification_635960 = null;
		InteractionOperand __DEC_guard_guard_563835 = null;
		CombinedFragment __DEC_operand_operand_435782 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		CombinedFragment parentCombo = null;
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

			// ensure correct type and really bound of object parentCombo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			parentCombo = (CombinedFragment) _TmpObject;

			// check link coveredBy from parentCombo to line
			JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
					combo = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// check if contained via correct reference
					JavaSDM.ensure(combo.getOperand().contains(operand));

					// check isomorphic binding between objects parentCombo and combo 
					JavaSDM.ensure(!parentCombo.equals(combo));

					// check link fragment from combo to interaction
					JavaSDM.ensure(interaction.equals(combo
							.getEnclosingInteraction()));

					// bind object
					_TmpObject = guard.getSpecification();

					// ensure correct type and really bound of object spec
					JavaSDM.ensure(_TmpObject instanceof LiteralString);
					spec = (LiteralString) _TmpObject;

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
							// iterate to-many link coveredBy from line to parentOperand
							fujaba__Success = false;

							fujaba__IterLineToParentOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentOperand
											.next();

									// ensure correct type and really bound of object parentOperand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									parentOperand = (InteractionOperand) _TmpObject;
									// check isomorphic binding between objects parentOperand and operand 
									JavaSDM.ensure(!parentOperand
											.equals(operand));

									// check link fragment from combo to parentOperand
									JavaSDM.ensure(parentOperand.equals(combo
											.getEnclosingOperand()));

									// check link fragment from messageSend to parentOperand
									JavaSDM.ensure(parentOperand
											.equals(messageSend
													.getEnclosingOperand()));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
													__DEC_messageReceive_enclosingInteraction_236671 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_236671 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_236671 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_236671 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_236671
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_341175 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_341175 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_341175 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_341175 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_341175
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_623414 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_623414 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_623414 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_623414 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_623414
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_531288 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_531288 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_531288 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_531288 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_531288
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_531288 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_531288
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_735276 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_735276 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_735276 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_735276 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_735276
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_735276 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_735276
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_547769 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_547769 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_547769 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_547769 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_547769
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_547769 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_547769
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_764922 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_764922 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_764922 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_764922 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_764922
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_764922 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_764922
															.equals(parentOperand));

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
													__DEC_spec_specification_635960 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_635960 is really bound
													JavaSDM.ensure(__DEC_spec_specification_635960 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_635960
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_635960 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_635960
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

													// bind object
													__DEC_guard_guard_563835 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_563835 is really bound
													JavaSDM.ensure(__DEC_guard_guard_563835 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_563835
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_563835 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_563835
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_563835 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_563835
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_435782 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_435782 is really bound
													JavaSDM.ensure(__DEC_operand_operand_435782 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_435782
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_435782 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_435782
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_435782 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_435782
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_coveredBy to line
												JavaSDM.ensure(line
														.equals(_edge_coveredBy
																.getSrc()));

												// check link trg from _edge_coveredBy to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(_edge_coveredBy
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_453(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_389735 = null;
		Interaction __DEC_messageSend_enclosingInteraction_809832 = null;
		Interaction __DEC_operand_enclosingInteraction_574611 = null;
		InteractionOperand __DEC_combo_fragment_93577 = null;
		InteractionOperand __DEC_messageReceive_fragment_885771 = null;
		InteractionOperand __DEC_messageSend_fragment_336019 = null;
		InteractionOperand __DEC_operand_fragment_225753 = null;
		Constraint __DEC_spec_specification_303623 = null;
		InteractionOperand __DEC_guard_guard_591041 = null;
		CombinedFragment __DEC_operand_operand_52212 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Lifeline line = null;
		CombinedFragment parentCombo = null;

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

			// ensure correct type and really bound of object parentCombo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			parentCombo = (CombinedFragment) _TmpObject;

			// bind object
			_TmpObject = _edge_covered.getTrg();

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;

			// bind object
			interaction = line.getInteraction();

			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);

			// check link coveredBy from parentCombo to line
			JavaSDM.ensure(parentCombo.getCovered().contains(line));

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
					// iterate to-many link coveredBy from line to parentOperand
					fujaba__Success = false;

					fujaba__IterLineToParentOperand = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToParentOperand.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToParentOperand.next();

							// ensure correct type and really bound of object parentOperand
							JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
							parentOperand = (InteractionOperand) _TmpObject;
							// check link fragment from messageSend to parentOperand
							JavaSDM.ensure(parentOperand.equals(messageSend
									.getEnclosingOperand()));

							// check link operand from parentOperand to parentCombo
							JavaSDM.ensure(parentCombo.equals(parentOperand
									.eContainer()));

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
									// check isomorphic binding between objects parentOperand and operand 
									JavaSDM.ensure(!parentOperand
											.equals(operand));

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
									JavaSDM.ensure(combo.getOperand().contains(
											operand));

									// check isomorphic binding between objects parentCombo and combo 
									JavaSDM.ensure(!parentCombo.equals(combo));

									// check link fragment from combo to interaction
									JavaSDM.ensure(interaction.equals(combo
											.getEnclosingInteraction()));

									// check link fragment from combo to parentOperand
									JavaSDM.ensure(parentOperand.equals(combo
											.getEnclosingOperand()));

									// bind object
									_TmpObject = guard.getSpecification();

									// ensure correct type and really bound of object spec
									JavaSDM.ensure(_TmpObject instanceof LiteralString);
									spec = (LiteralString) _TmpObject;

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
															.getOppositeReference(
																	line,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

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

													// check link trg from _edge_coveredBy to parentCombo
													JavaSDM.ensure(parentCombo
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
															__DEC_messageReceive_enclosingInteraction_389735 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_389735 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_389735 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_389735 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_389735
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_809832 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_809832 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_809832 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_809832 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_809832
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_574611 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_574611 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_574611 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_574611 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_574611
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_93577 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_93577 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_93577 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_93577 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_93577
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_93577 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_93577
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_885771 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_885771 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_885771 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_885771 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_885771
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_885771 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_885771
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_336019 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_336019 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_336019 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_336019 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_336019
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_336019 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_336019
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_225753 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_225753 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_225753 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_225753 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_225753
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_225753 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_225753
																	.equals(parentOperand));

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
															__DEC_spec_specification_303623 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_303623 is really bound
															JavaSDM.ensure(__DEC_spec_specification_303623 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_303623
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_303623 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_303623
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

															// bind object
															__DEC_guard_guard_591041 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_591041 is really bound
															JavaSDM.ensure(__DEC_guard_guard_591041 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_591041
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_591041 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_591041
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_591041 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_591041
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_52212 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_52212 is really bound
															JavaSDM.ensure(__DEC_operand_operand_52212 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_52212
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_52212 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_52212
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_52212 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_52212
																	.equals(parentCombo));

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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
														JavaSDM.ensure(!_edge_coveredBy
																.equals(_edge_covered));

														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

														// check link specification from spec to guard
														JavaSDM.ensure(guard.equals(spec
																.eContainer()));

														// check link src from _edge_covered to parentCombo
														JavaSDM.ensure(parentCombo
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

														// check link trg from _edge_coveredBy to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(_edge_coveredBy
																		.getTrg()));

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_454(
			EMoflonEdge _edge_enclosingInteraction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_788315 = null;
		Interaction __DEC_messageSend_enclosingInteraction_805514 = null;
		Interaction __DEC_operand_enclosingInteraction_894711 = null;
		InteractionOperand __DEC_combo_fragment_804287 = null;
		InteractionOperand __DEC_messageReceive_fragment_975040 = null;
		InteractionOperand __DEC_messageSend_fragment_87217 = null;
		InteractionOperand __DEC_operand_fragment_470300 = null;
		Constraint __DEC_spec_specification_930140 = null;
		InteractionOperand __DEC_guard_guard_517885 = null;
		CombinedFragment __DEC_operand_operand_422790 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		CombinedFragment parentCombo = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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
			_TmpObject = _edge_enclosingInteraction.getTrg();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link fragment from combo to interaction
			JavaSDM.ensure(interaction.equals(combo.getEnclosingInteraction()));

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

									// iterate to-many link coveredBy from line to parentOperand
									fujaba__Success = false;

									fujaba__IterLineToParentOperand = new ArrayList(
											line.getCoveredBy()).iterator();

									while (fujaba__IterLineToParentOperand
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterLineToParentOperand
													.next();

											// ensure correct type and really bound of object parentOperand
											JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
											parentOperand = (InteractionOperand) _TmpObject;
											// check isomorphic binding between objects parentOperand and operand 
											JavaSDM.ensure(!parentOperand
													.equals(operand));

											// check link fragment from combo to parentOperand
											JavaSDM.ensure(parentOperand.equals(combo
													.getEnclosingOperand()));

											// check link fragment from messageSend to parentOperand
											JavaSDM.ensure(parentOperand.equals(messageSend
													.getEnclosingOperand()));

											// bind object
											parentCombo = parentOperand
													.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
													.eContainer() : null;

											// check object parentCombo is really bound
											JavaSDM.ensure(parentCombo != null);

											// check if contained via correct reference
											JavaSDM.ensure(parentCombo
													.getOperand().contains(
															parentOperand));

											// check isomorphic binding between objects parentCombo and combo 
											JavaSDM.ensure(!parentCombo
													.equals(combo));

											// check link coveredBy from parentCombo to line
											JavaSDM.ensure(parentCombo
													.getCovered()
													.contains(line));

											// iterate to-many link fragment from parentOperand to messageReceive
											fujaba__Success = false;

											fujaba__IterParentOperandToMessageReceive = new ArrayList(
													parentOperand.getFragment())
													.iterator();

											while (fujaba__IterParentOperandToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterParentOperandToMessageReceive
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
															__DEC_messageReceive_enclosingInteraction_788315 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_788315 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_788315 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_788315 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_788315
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_805514 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_805514 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_805514 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_805514 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_805514
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_894711 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_894711 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_894711 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_894711 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_894711
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_804287 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_804287 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_804287 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_804287 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_804287
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_804287 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_804287
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_975040 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_975040 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_975040 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_975040 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_975040
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_975040 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_975040
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_87217 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_87217 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_87217 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_87217 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_87217
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_87217 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_87217
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_470300 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_470300 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_470300 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_470300 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_470300
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_470300 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_470300
																	.equals(parentOperand));

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
															__DEC_spec_specification_930140 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_930140 is really bound
															JavaSDM.ensure(__DEC_spec_specification_930140 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_930140
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_930140 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_930140
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

															// bind object
															__DEC_guard_guard_517885 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_517885 is really bound
															JavaSDM.ensure(__DEC_guard_guard_517885 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_517885
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_517885 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_517885
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_517885 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_517885
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_422790 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_422790 is really bound
															JavaSDM.ensure(__DEC_operand_operand_422790 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_422790
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_422790 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_422790
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_422790 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_422790
																	.equals(parentCombo));

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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

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

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_455(
			EMoflonEdge _edge_fragment) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_727631 = null;
		Interaction __DEC_messageSend_enclosingInteraction_155426 = null;
		Interaction __DEC_operand_enclosingInteraction_696076 = null;
		InteractionOperand __DEC_combo_fragment_815424 = null;
		InteractionOperand __DEC_messageReceive_fragment_883658 = null;
		InteractionOperand __DEC_messageSend_fragment_43278 = null;
		InteractionOperand __DEC_operand_fragment_259339 = null;
		Constraint __DEC_spec_specification_929808 = null;
		InteractionOperand __DEC_guard_guard_194386 = null;
		CombinedFragment __DEC_operand_operand_791640 = null;
		Match match = null;
		Iterator fujaba__IterInteractionTo_edge_enclosingInteraction = null;
		EMoflonEdge _edge_enclosingInteraction = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		LiteralString spec = null;
		InteractionConstraint guard = null;
		Iterator fujaba__IterLineToOperand = null;
		InteractionOperand operand = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		Iterator fujaba__IterInteractionToLine = null;
		Lifeline line = null;
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

			// check object _edge_fragment is really bound
			JavaSDM.ensure(_edge_fragment != null);
			// bind object
			_TmpObject = _edge_fragment.getTrg();

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;

			// bind object
			_TmpObject = _edge_fragment.getSrc();

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link fragment from combo to interaction
			JavaSDM.ensure(interaction.equals(combo.getEnclosingInteraction()));

			// iterate to-many link lifeline from interaction to line
			fujaba__Success = false;

			fujaba__IterInteractionToLine = new ArrayList(
					interaction.getLifeline()).iterator();

			while (fujaba__IterInteractionToLine.hasNext()) {
				try {
					line = (Lifeline) fujaba__IterInteractionToLine.next();

					// check object line is really bound
					JavaSDM.ensure(line != null);
					// iterate to-many link coveredBy from line to parentCombo
					fujaba__Success = false;

					fujaba__IterLineToParentCombo = new ArrayList(
							line.getCoveredBy()).iterator();

					while (fujaba__IterLineToParentCombo.hasNext()) {
						try {
							_TmpObject = fujaba__IterLineToParentCombo.next();

							// ensure correct type and really bound of object parentCombo
							JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
							parentCombo = (CombinedFragment) _TmpObject;
							// check isomorphic binding between objects parentCombo and combo 
							JavaSDM.ensure(!parentCombo.equals(combo));

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

									// iterate to-many link coveredBy from line to messageSend
									fujaba__Success = false;

									fujaba__IterLineToMessageSend = new ArrayList(
											line.getCoveredBy()).iterator();

									while (fujaba__IterLineToMessageSend
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterLineToMessageSend
													.next();

											// ensure correct type and really bound of object messageSend
											JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
											messageSend = (MessageOccurrenceSpecification) _TmpObject;
											// iterate to-many link coveredBy from line to parentOperand
											fujaba__Success = false;

											fujaba__IterLineToParentOperand = new ArrayList(
													line.getCoveredBy())
													.iterator();

											while (fujaba__IterLineToParentOperand
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterLineToParentOperand
															.next();

													// ensure correct type and really bound of object parentOperand
													JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
													parentOperand = (InteractionOperand) _TmpObject;
													// check isomorphic binding between objects parentOperand and operand 
													JavaSDM.ensure(!parentOperand
															.equals(operand));

													// check link fragment from combo to parentOperand
													JavaSDM.ensure(parentOperand.equals(combo
															.getEnclosingOperand()));

													// check link fragment from messageSend to parentOperand
													JavaSDM.ensure(parentOperand.equals(messageSend
															.getEnclosingOperand()));

													// check link operand from parentOperand to parentCombo
													JavaSDM.ensure(parentCombo
															.equals(parentOperand
																	.eContainer()));

													// iterate to-many link fragment from parentOperand to messageReceive
													fujaba__Success = false;

													fujaba__IterParentOperandToMessageReceive = new ArrayList(
															parentOperand
																	.getFragment())
															.iterator();

													while (fujaba__IterParentOperandToMessageReceive
															.hasNext()) {
														try {
															_TmpObject = fujaba__IterParentOperandToMessageReceive
																	.next();

															// ensure correct type and really bound of object messageReceive
															JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
															messageReceive = (MessageOccurrenceSpecification) _TmpObject;
															// check isomorphic binding between objects messageSend and messageReceive 
															JavaSDM.ensure(!messageSend
																	.equals(messageReceive));

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

																	// check link src from _edge_enclosingInteraction to combo
																	JavaSDM.ensure(combo
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
																			__DEC_messageReceive_enclosingInteraction_727631 = messageReceive
																					.getEnclosingInteraction();

																			// check object __DEC_messageReceive_enclosingInteraction_727631 is really bound
																			JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_727631 != null);

																			// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_727631 and interaction 
																			JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_727631
																					.equals(interaction));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_messageSend_enclosingInteraction_155426 = messageSend
																					.getEnclosingInteraction();

																			// check object __DEC_messageSend_enclosingInteraction_155426 is really bound
																			JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_155426 != null);

																			// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_155426 and interaction 
																			JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_155426
																					.equals(interaction));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_operand_enclosingInteraction_696076 = operand
																					.getEnclosingInteraction();

																			// check object __DEC_operand_enclosingInteraction_696076 is really bound
																			JavaSDM.ensure(__DEC_operand_enclosingInteraction_696076 != null);

																			// check isomorphic binding between objects __DEC_operand_enclosingInteraction_696076 and interaction 
																			JavaSDM.ensure(!__DEC_operand_enclosingInteraction_696076
																					.equals(interaction));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_combo_fragment_815424 = combo
																					.getEnclosingOperand();

																			// check object __DEC_combo_fragment_815424 is really bound
																			JavaSDM.ensure(__DEC_combo_fragment_815424 != null);

																			// check isomorphic binding between objects __DEC_combo_fragment_815424 and operand 
																			JavaSDM.ensure(!__DEC_combo_fragment_815424
																					.equals(operand));

																			// check isomorphic binding between objects __DEC_combo_fragment_815424 and parentOperand 
																			JavaSDM.ensure(!__DEC_combo_fragment_815424
																					.equals(parentOperand));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_messageReceive_fragment_883658 = messageReceive
																					.getEnclosingOperand();

																			// check object __DEC_messageReceive_fragment_883658 is really bound
																			JavaSDM.ensure(__DEC_messageReceive_fragment_883658 != null);

																			// check isomorphic binding between objects __DEC_messageReceive_fragment_883658 and operand 
																			JavaSDM.ensure(!__DEC_messageReceive_fragment_883658
																					.equals(operand));

																			// check isomorphic binding between objects __DEC_messageReceive_fragment_883658 and parentOperand 
																			JavaSDM.ensure(!__DEC_messageReceive_fragment_883658
																					.equals(parentOperand));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_messageSend_fragment_43278 = messageSend
																					.getEnclosingOperand();

																			// check object __DEC_messageSend_fragment_43278 is really bound
																			JavaSDM.ensure(__DEC_messageSend_fragment_43278 != null);

																			// check isomorphic binding between objects __DEC_messageSend_fragment_43278 and operand 
																			JavaSDM.ensure(!__DEC_messageSend_fragment_43278
																					.equals(operand));

																			// check isomorphic binding between objects __DEC_messageSend_fragment_43278 and parentOperand 
																			JavaSDM.ensure(!__DEC_messageSend_fragment_43278
																					.equals(parentOperand));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_operand_fragment_259339 = operand
																					.getEnclosingOperand();

																			// check object __DEC_operand_fragment_259339 is really bound
																			JavaSDM.ensure(__DEC_operand_fragment_259339 != null);

																			// check isomorphic binding between objects __DEC_operand_fragment_259339 and operand 
																			JavaSDM.ensure(!__DEC_operand_fragment_259339
																					.equals(operand));

																			// check isomorphic binding between objects __DEC_operand_fragment_259339 and parentOperand 
																			JavaSDM.ensure(!__DEC_operand_fragment_259339
																					.equals(parentOperand));

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
																			__DEC_spec_specification_929808 = spec
																					.eContainer() instanceof Constraint ? (Constraint) spec
																					.eContainer()
																					: null;

																			// check object __DEC_spec_specification_929808 is really bound
																			JavaSDM.ensure(__DEC_spec_specification_929808 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(spec
																					.equals(__DEC_spec_specification_929808
																							.getSpecification()));

																			// check isomorphic binding between objects __DEC_spec_specification_929808 and guard 
																			JavaSDM.ensure(!__DEC_spec_specification_929808
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

																			// bind object
																			__DEC_guard_guard_194386 = guard
																					.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																					.eContainer()
																					: null;

																			// check object __DEC_guard_guard_194386 is really bound
																			JavaSDM.ensure(__DEC_guard_guard_194386 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(guard
																					.equals(__DEC_guard_guard_194386
																							.getGuard()));

																			// check isomorphic binding between objects __DEC_guard_guard_194386 and operand 
																			JavaSDM.ensure(!__DEC_guard_guard_194386
																					.equals(operand));

																			// check isomorphic binding between objects __DEC_guard_guard_194386 and parentOperand 
																			JavaSDM.ensure(!__DEC_guard_guard_194386
																					.equals(parentOperand));

																			fujaba__Success = true;
																		} catch (JavaSDMException fujaba__InternalException) {
																			fujaba__Success = false;
																		}

																		fujaba__Success = !(fujaba__Success);

																		JavaSDM.ensure(fujaba__Success);

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_operand_operand_791640 = operand
																					.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																					.eContainer()
																					: null;

																			// check object __DEC_operand_operand_791640 is really bound
																			JavaSDM.ensure(__DEC_operand_operand_791640 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(__DEC_operand_operand_791640
																					.getOperand()
																					.contains(
																							operand));

																			// check isomorphic binding between objects __DEC_operand_operand_791640 and combo 
																			JavaSDM.ensure(!__DEC_operand_operand_791640
																					.equals(combo));

																			// check isomorphic binding between objects __DEC_operand_operand_791640 and parentCombo 
																			JavaSDM.ensure(!__DEC_operand_operand_791640
																					.equals(parentCombo));

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
																		// check object parentCombo is really bound
																		JavaSDM.ensure(parentCombo != null);
																		// check object parentOperand is really bound
																		JavaSDM.ensure(parentOperand != null);
																		// check object spec is really bound
																		JavaSDM.ensure(spec != null);
																		// check isomorphic binding between objects _edge_fragment and _edge_enclosingInteraction 
																		JavaSDM.ensure(!_edge_fragment
																				.equals(_edge_enclosingInteraction));

																		// check isomorphic binding between objects parentCombo and combo 
																		JavaSDM.ensure(!parentCombo
																				.equals(combo));

																		// check isomorphic binding between objects messageSend and messageReceive 
																		JavaSDM.ensure(!messageSend
																				.equals(messageReceive));

																		// check isomorphic binding between objects parentOperand and operand 
																		JavaSDM.ensure(!parentOperand
																				.equals(operand));

																		// check link fragment from combo to interaction
																		JavaSDM.ensure(interaction
																				.equals(combo
																						.getEnclosingInteraction()));

																		// check link fragment from combo to parentOperand
																		JavaSDM.ensure(parentOperand
																				.equals(combo
																						.getEnclosingOperand()));

																		// check link fragment from messageReceive to parentOperand
																		JavaSDM.ensure(parentOperand
																				.equals(messageReceive
																						.getEnclosingOperand()));

																		// check link fragment from messageSend to parentOperand
																		JavaSDM.ensure(parentOperand
																				.equals(messageSend
																						.getEnclosingOperand()));

																		// check link fragment from messageReceive to interaction
																		JavaSDM.ensure(!(interaction
																				.equals(messageReceive
																						.getEnclosingInteraction())));

																		// check link fragment from messageSend to interaction
																		JavaSDM.ensure(!(interaction
																				.equals(messageSend
																						.getEnclosingInteraction())));

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

																		// check link fragment from operand to parentOperand
																		JavaSDM.ensure(!(parentOperand
																				.equals(operand
																						.getEnclosingOperand())));

																		// check link guard from operand to guard
																		JavaSDM.ensure(guard
																				.equals(operand
																						.getGuard()));

																		// check link guard from parentOperand to guard
																		JavaSDM.ensure(!(guard
																				.equals(parentOperand
																						.getGuard())));

																		// check link lifeline from line to interaction
																		JavaSDM.ensure(interaction
																				.equals(line
																						.getInteraction()));

																		// check link operand from operand to combo
																		JavaSDM.ensure(combo
																				.equals(operand
																						.eContainer()));

																		// check link operand from parentOperand to parentCombo
																		JavaSDM.ensure(parentCombo
																				.equals(parentOperand
																						.eContainer()));

																		// check link operand from operand to parentCombo
																		JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																				.getOppositeReference(
																						operand,
																						CombinedFragment.class,
																						"$eContainer")
																				.contains(parentCombo)));

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

																		// check link coveredBy from messageSend to line
																		JavaSDM.ensure(messageSend
																				.getCovered()
																				.contains(
																						line));

																		// check link coveredBy from operand to line
																		JavaSDM.ensure(operand
																				.getCovered()
																				.contains(
																						line));

																		// check link coveredBy from parentCombo to line
																		JavaSDM.ensure(parentCombo
																				.getCovered()
																				.contains(
																						line));

																		// check link coveredBy from parentOperand to line
																		JavaSDM.ensure(parentOperand
																				.getCovered()
																				.contains(
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
																						match,
																						line,
																						messageSend,
																						parentOperand,
																						messageReceive,
																						combo,
																						parentCombo,
																						interaction,
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
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_103(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_180831 = null;
		NormalStep __DEC_alt_stepAlternative_107644 = null;
		Flow __DEC_step_steps_309345 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_969449 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_969449 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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
							__DEC_altFlow_flows_180831 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_180831 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_180831 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_180831
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_180831 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_180831
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
							__DEC_alt_stepAlternative_107644 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_107644 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_107644 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_107644
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_107644 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_107644
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
							__DEC_step_steps_309345 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_309345 is really bound
							JavaSDM.ensure(__DEC_step_steps_309345 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_309345.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_309345 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_309345
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_309345 and flow 
							JavaSDM.ensure(!__DEC_step_steps_309345
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_969449
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_969449 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_969449
											.hasNext()) {
								try {
									__DEC_altFlow_ref_969449 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_969449
											.next();

									// check object __DEC_altFlow_ref_969449 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_969449 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_969449 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_969449
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_104(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_208121 = null;
		NormalStep __DEC_alt_stepAlternative_345185 = null;
		Flow __DEC_step_steps_903542 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_772449 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_772449 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		UseCase useCase = null;
		NamedFlow flow = null;
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

			// check object _edge_stepAlternative is really bound
			JavaSDM.ensure(_edge_stepAlternative != null);
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

			// bind object
			_TmpObject = _edge_stepAlternative.getSrc();

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;

			// check link stepAlternative from alt to step
			JavaSDM.ensure(step.equals(alt.eContainer()));

			// bind object
			_TmpObject = step.eContainer() instanceof NamedFlow ? (NamedFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;

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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_208121 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_208121 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_208121 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_208121.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_208121 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_208121.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_345185 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_345185 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_345185 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_345185
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_345185 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_345185
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
					__DEC_step_steps_903542 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_903542 is really bound
					JavaSDM.ensure(__DEC_step_steps_903542 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_903542.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_903542 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_903542.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_903542 and flow 
					JavaSDM.ensure(!__DEC_step_steps_903542.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_772449
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_772449 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_772449
									.hasNext()) {
						try {
							__DEC_altFlow_ref_772449 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_772449
									.next();

							// check object __DEC_altFlow_ref_772449 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_772449 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_772449 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_772449
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_855182 = null;
		NormalStep __DEC_alt_stepAlternative_376543 = null;
		Flow __DEC_step_steps_376948 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_889610 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_889610 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		Iterator fujaba__IterStepToAlt = null;
		AlternativeFlowAlternative alt = null;
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
							__DEC_altFlow_flows_855182 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_855182 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_855182 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_855182
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_855182 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_855182
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
							__DEC_alt_stepAlternative_376543 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_376543 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_376543 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_376543
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_376543 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_376543
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
							__DEC_step_steps_376948 = step.eContainer() instanceof Flow ? (Flow) step
									.eContainer() : null;

							// check object __DEC_step_steps_376948 is really bound
							JavaSDM.ensure(__DEC_step_steps_376948 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_step_steps_376948.getSteps()
									.contains(step));

							// check isomorphic binding between objects __DEC_step_steps_376948 and altFlow 
							JavaSDM.ensure(!__DEC_step_steps_376948
									.equals(altFlow));

							// check isomorphic binding between objects __DEC_step_steps_376948 and flow 
							JavaSDM.ensure(!__DEC_step_steps_376948
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_889610
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_889610 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_889610
											.hasNext()) {
								try {
									__DEC_altFlow_ref_889610 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_889610
											.next();

									// check object __DEC_altFlow_ref_889610 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_889610 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_889610 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_889610
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_871958 = null;
		NormalStep __DEC_alt_stepAlternative_589102 = null;
		Flow __DEC_step_steps_572155 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_85019 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_85019 = null;
		Match match = null;
		UseCase useCase = null;
		NamedFlow flow = null;
		PackageDeclaration packageDeclaration = null;
		Actor actor = null;
		NormalStep step = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;

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
			_TmpObject = _edge_ref.getTrg();

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_ref.getSrc();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// check link ref from alt to altFlow
			JavaSDM.ensure(altFlow.equals(alt.getRef()));

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
			_TmpObject = step.eContainer() instanceof NamedFlow ? (NamedFlow) step
					.eContainer() : null;

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof NamedFlow);
			flow = (NamedFlow) _TmpObject;

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

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_871958 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_871958 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_871958 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_871958.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_871958 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_871958.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_589102 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_589102 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_589102 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_589102
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_589102 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_589102
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
					__DEC_step_steps_572155 = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object __DEC_step_steps_572155 is really bound
					JavaSDM.ensure(__DEC_step_steps_572155 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_step_steps_572155.getSteps().contains(
							step));

					// check isomorphic binding between objects __DEC_step_steps_572155 and altFlow 
					JavaSDM.ensure(!__DEC_step_steps_572155.equals(altFlow));

					// check isomorphic binding between objects __DEC_step_steps_572155 and flow 
					JavaSDM.ensure(!__DEC_step_steps_572155.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_85019
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_85019 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_85019
									.hasNext()) {
						try {
							__DEC_altFlow_ref_85019 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_85019
									.next();

							// check object __DEC_altFlow_ref_85019 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_85019 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_85019 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_85019.equals(alt));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_456(
			EMoflonEdge _edge_operand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_304660 = null;
		Interaction __DEC_messageSend_enclosingInteraction_326568 = null;
		Interaction __DEC_operand_enclosingInteraction_221008 = null;
		InteractionOperand __DEC_combo_fragment_415876 = null;
		InteractionOperand __DEC_messageReceive_fragment_380078 = null;
		InteractionOperand __DEC_messageSend_fragment_26517 = null;
		InteractionOperand __DEC_operand_fragment_730017 = null;
		Constraint __DEC_spec_specification_381048 = null;
		InteractionOperand __DEC_guard_guard_492913 = null;
		CombinedFragment __DEC_operand_operand_517389 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Interaction interaction = null;
		Iterator fujaba__IterOperandToLine = null;
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
							parentOperand = messageSend.getEnclosingOperand();

							// check object parentOperand is really bound
							JavaSDM.ensure(parentOperand != null);

							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// check link coveredBy from parentOperand to line
							JavaSDM.ensure(parentOperand.getCovered().contains(
									line));

							// iterate to-many link coveredBy from line to parentCombo
							fujaba__Success = false;

							fujaba__IterLineToParentCombo = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentCombo
											.next();

									// ensure correct type and really bound of object parentCombo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									parentCombo = (CombinedFragment) _TmpObject;
									// check isomorphic binding between objects parentCombo and combo 
									JavaSDM.ensure(!parentCombo.equals(combo));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
													__DEC_messageReceive_enclosingInteraction_304660 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_304660 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_304660 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_304660 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_304660
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_326568 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_326568 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_326568 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_326568 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_326568
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_221008 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_221008 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_221008 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_221008 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_221008
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_415876 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_415876 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_415876 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_415876 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_415876
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_415876 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_415876
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_380078 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_380078 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_380078 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_380078 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_380078
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_380078 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_380078
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_26517 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_26517 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_26517 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_26517 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_26517
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_26517 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_26517
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_730017 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_730017 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_730017 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_730017 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_730017
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_730017 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_730017
															.equals(parentOperand));

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
													__DEC_spec_specification_381048 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_381048 is really bound
													JavaSDM.ensure(__DEC_spec_specification_381048 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_381048
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_381048 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_381048
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

													// bind object
													__DEC_guard_guard_492913 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_492913 is really bound
													JavaSDM.ensure(__DEC_guard_guard_492913 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_492913
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_492913 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_492913
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_492913 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_492913
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_517389 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_517389 is really bound
													JavaSDM.ensure(__DEC_operand_operand_517389 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_517389
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_517389 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_517389
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_517389 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_517389
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_operand to combo
												JavaSDM.ensure(combo
														.equals(_edge_operand
																.getSrc()));

												// check link trg from _edge_operand to operand
												JavaSDM.ensure(operand
														.equals(_edge_operand
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_457(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_193944 = null;
		Interaction __DEC_messageSend_enclosingInteraction_395341 = null;
		Interaction __DEC_operand_enclosingInteraction_988415 = null;
		InteractionOperand __DEC_combo_fragment_895899 = null;
		InteractionOperand __DEC_messageReceive_fragment_122278 = null;
		InteractionOperand __DEC_messageSend_fragment_423656 = null;
		InteractionOperand __DEC_operand_fragment_28148 = null;
		Constraint __DEC_spec_specification_161660 = null;
		InteractionOperand __DEC_guard_guard_99659 = null;
		CombinedFragment __DEC_operand_operand_436070 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
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

			// check link fragment from combo to interaction
			JavaSDM.ensure(interaction.equals(combo.getEnclosingInteraction()));

			// bind object
			_TmpObject = guard.getSpecification();

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;

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
					parentOperand = messageSend.getEnclosingOperand();

					// check object parentOperand is really bound
					JavaSDM.ensure(parentOperand != null);

					// check isomorphic binding between objects parentOperand and operand 
					JavaSDM.ensure(!parentOperand.equals(operand));

					// check link fragment from combo to parentOperand
					JavaSDM.ensure(parentOperand.equals(combo
							.getEnclosingOperand()));

					// bind object
					parentCombo = parentOperand.eContainer() instanceof CombinedFragment ? (CombinedFragment) parentOperand
							.eContainer() : null;

					// check object parentCombo is really bound
					JavaSDM.ensure(parentCombo != null);

					// check if contained via correct reference
					JavaSDM.ensure(parentCombo.getOperand().contains(
							parentOperand));

					// check isomorphic binding between objects parentCombo and combo 
					JavaSDM.ensure(!parentCombo.equals(combo));

					// check link coveredBy from parentCombo to line
					JavaSDM.ensure(parentCombo.getCovered().contains(line));

					// check link coveredBy from parentOperand to line
					JavaSDM.ensure(parentOperand.getCovered().contains(line));

					// iterate to-many link fragment from parentOperand to messageReceive
					fujaba__Success = false;

					fujaba__IterParentOperandToMessageReceive = new ArrayList(
							parentOperand.getFragment()).iterator();

					while (fujaba__IterParentOperandToMessageReceive.hasNext()) {
						try {
							_TmpObject = fujaba__IterParentOperandToMessageReceive
									.next();

							// ensure correct type and really bound of object messageReceive
							JavaSDM.ensure(_TmpObject instanceof MessageOccurrenceSpecification);
							messageReceive = (MessageOccurrenceSpecification) _TmpObject;
							// check isomorphic binding between objects messageSend and messageReceive 
							JavaSDM.ensure(!messageSend.equals(messageReceive));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// negative check for link message from messageReceive
								JavaSDM.ensure(messageReceive.getMessage() == null);
								// negative check for link message from messageSend
								JavaSDM.ensure(messageSend.getMessage() == null);
								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_enclosingInteraction_193944 = messageReceive
											.getEnclosingInteraction();

									// check object __DEC_messageReceive_enclosingInteraction_193944 is really bound
									JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_193944 != null);

									// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_193944 and interaction 
									JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_193944
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageSend_enclosingInteraction_395341 = messageSend
											.getEnclosingInteraction();

									// check object __DEC_messageSend_enclosingInteraction_395341 is really bound
									JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_395341 != null);

									// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_395341 and interaction 
									JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_395341
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_operand_enclosingInteraction_988415 = operand
											.getEnclosingInteraction();

									// check object __DEC_operand_enclosingInteraction_988415 is really bound
									JavaSDM.ensure(__DEC_operand_enclosingInteraction_988415 != null);

									// check isomorphic binding between objects __DEC_operand_enclosingInteraction_988415 and interaction 
									JavaSDM.ensure(!__DEC_operand_enclosingInteraction_988415
											.equals(interaction));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_combo_fragment_895899 = combo
											.getEnclosingOperand();

									// check object __DEC_combo_fragment_895899 is really bound
									JavaSDM.ensure(__DEC_combo_fragment_895899 != null);

									// check isomorphic binding between objects __DEC_combo_fragment_895899 and operand 
									JavaSDM.ensure(!__DEC_combo_fragment_895899
											.equals(operand));

									// check isomorphic binding between objects __DEC_combo_fragment_895899 and parentOperand 
									JavaSDM.ensure(!__DEC_combo_fragment_895899
											.equals(parentOperand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageReceive_fragment_122278 = messageReceive
											.getEnclosingOperand();

									// check object __DEC_messageReceive_fragment_122278 is really bound
									JavaSDM.ensure(__DEC_messageReceive_fragment_122278 != null);

									// check isomorphic binding between objects __DEC_messageReceive_fragment_122278 and operand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_122278
											.equals(operand));

									// check isomorphic binding between objects __DEC_messageReceive_fragment_122278 and parentOperand 
									JavaSDM.ensure(!__DEC_messageReceive_fragment_122278
											.equals(parentOperand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_messageSend_fragment_423656 = messageSend
											.getEnclosingOperand();

									// check object __DEC_messageSend_fragment_423656 is really bound
									JavaSDM.ensure(__DEC_messageSend_fragment_423656 != null);

									// check isomorphic binding between objects __DEC_messageSend_fragment_423656 and operand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_423656
											.equals(operand));

									// check isomorphic binding between objects __DEC_messageSend_fragment_423656 and parentOperand 
									JavaSDM.ensure(!__DEC_messageSend_fragment_423656
											.equals(parentOperand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_operand_fragment_28148 = operand
											.getEnclosingOperand();

									// check object __DEC_operand_fragment_28148 is really bound
									JavaSDM.ensure(__DEC_operand_fragment_28148 != null);

									// check isomorphic binding between objects __DEC_operand_fragment_28148 and operand 
									JavaSDM.ensure(!__DEC_operand_fragment_28148
											.equals(operand));

									// check isomorphic binding between objects __DEC_operand_fragment_28148 and parentOperand 
									JavaSDM.ensure(!__DEC_operand_fragment_28148
											.equals(parentOperand));

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
									__DEC_spec_specification_161660 = spec
											.eContainer() instanceof Constraint ? (Constraint) spec
											.eContainer() : null;

									// check object __DEC_spec_specification_161660 is really bound
									JavaSDM.ensure(__DEC_spec_specification_161660 != null);

									// check if contained via correct reference
									JavaSDM.ensure(spec
											.equals(__DEC_spec_specification_161660
													.getSpecification()));

									// check isomorphic binding between objects __DEC_spec_specification_161660 and guard 
									JavaSDM.ensure(!__DEC_spec_specification_161660
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

									// bind object
									__DEC_guard_guard_99659 = guard
											.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
											.eContainer() : null;

									// check object __DEC_guard_guard_99659 is really bound
									JavaSDM.ensure(__DEC_guard_guard_99659 != null);

									// check if contained via correct reference
									JavaSDM.ensure(guard
											.equals(__DEC_guard_guard_99659
													.getGuard()));

									// check isomorphic binding between objects __DEC_guard_guard_99659 and operand 
									JavaSDM.ensure(!__DEC_guard_guard_99659
											.equals(operand));

									// check isomorphic binding between objects __DEC_guard_guard_99659 and parentOperand 
									JavaSDM.ensure(!__DEC_guard_guard_99659
											.equals(parentOperand));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_operand_operand_436070 = operand
											.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
											.eContainer() : null;

									// check object __DEC_operand_operand_436070 is really bound
									JavaSDM.ensure(__DEC_operand_operand_436070 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_operand_operand_436070
											.getOperand().contains(operand));

									// check isomorphic binding between objects __DEC_operand_operand_436070 and combo 
									JavaSDM.ensure(!__DEC_operand_operand_436070
											.equals(combo));

									// check isomorphic binding between objects __DEC_operand_operand_436070 and parentCombo 
									JavaSDM.ensure(!__DEC_operand_operand_436070
											.equals(parentCombo));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link receiveEvent from messageReceive
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(messageReceive,
												Message.class, "receiveEvent")
										.size() == 0);
								// negative check for link receiveEvent from messageSend
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(messageSend,
												Message.class, "receiveEvent")
										.size() == 0);
								// negative check for link sendEvent from messageReceive
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(messageReceive,
												Message.class, "sendEvent")
										.size() == 0);
								// negative check for link sendEvent from messageSend
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(messageSend,
												Message.class, "sendEvent")
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
								// check object parentCombo is really bound
								JavaSDM.ensure(parentCombo != null);
								// check object parentOperand is really bound
								JavaSDM.ensure(parentOperand != null);
								// check object spec is really bound
								JavaSDM.ensure(spec != null);
								// check isomorphic binding between objects parentCombo and combo 
								JavaSDM.ensure(!parentCombo.equals(combo));

								// check isomorphic binding between objects messageSend and messageReceive 
								JavaSDM.ensure(!messageSend
										.equals(messageReceive));

								// check isomorphic binding between objects parentOperand and operand 
								JavaSDM.ensure(!parentOperand.equals(operand));

								// check link fragment from combo to interaction
								JavaSDM.ensure(interaction.equals(combo
										.getEnclosingInteraction()));

								// check link fragment from combo to parentOperand
								JavaSDM.ensure(parentOperand.equals(combo
										.getEnclosingOperand()));

								// check link fragment from messageReceive to parentOperand
								JavaSDM.ensure(parentOperand
										.equals(messageReceive
												.getEnclosingOperand()));

								// check link fragment from messageSend to parentOperand
								JavaSDM.ensure(parentOperand.equals(messageSend
										.getEnclosingOperand()));

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

								// check link fragment from operand to parentOperand
								JavaSDM.ensure(!(parentOperand.equals(operand
										.getEnclosingOperand())));

								// check link guard from operand to guard
								JavaSDM.ensure(guard.equals(operand.getGuard()));

								// check link guard from parentOperand to guard
								JavaSDM.ensure(!(guard.equals(parentOperand
										.getGuard())));

								// check link lifeline from line to interaction
								JavaSDM.ensure(interaction.equals(line
										.getInteraction()));

								// check link operand from operand to combo
								JavaSDM.ensure(combo.equals(operand
										.eContainer()));

								// check link operand from parentOperand to parentCombo
								JavaSDM.ensure(parentCombo.equals(parentOperand
										.eContainer()));

								// check link operand from operand to parentCombo
								JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(operand,
												CombinedFragment.class,
												"$eContainer")
										.contains(parentCombo)));

								// check link specification from spec to guard
								JavaSDM.ensure(guard.equals(spec.eContainer()));

								// check link src from _edge_coveredBy to line
								JavaSDM.ensure(line.equals(_edge_coveredBy
										.getSrc()));

								// check link trg from _edge_coveredBy to operand
								JavaSDM.ensure(operand.equals(_edge_coveredBy
										.getTrg()));

								// check link coveredBy from messageSend to line
								JavaSDM.ensure(messageSend.getCovered()
										.contains(line));

								// check link coveredBy from operand to line
								JavaSDM.ensure(operand.getCovered().contains(
										line));

								// check link coveredBy from parentCombo to line
								JavaSDM.ensure(parentCombo.getCovered()
										.contains(line));

								// check link coveredBy from parentOperand to line
								JavaSDM.ensure(parentOperand.getCovered()
										.contains(line));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										line, messageSend, parentOperand,
										messageReceive, combo, parentCombo,
										interaction, operand, guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_458(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_32878 = null;
		Interaction __DEC_messageSend_enclosingInteraction_728282 = null;
		Interaction __DEC_operand_enclosingInteraction_500490 = null;
		InteractionOperand __DEC_combo_fragment_978694 = null;
		InteractionOperand __DEC_messageReceive_fragment_800477 = null;
		InteractionOperand __DEC_messageSend_fragment_806031 = null;
		InteractionOperand __DEC_operand_fragment_669734 = null;
		Constraint __DEC_spec_specification_149359 = null;
		InteractionOperand __DEC_guard_guard_907878 = null;
		CombinedFragment __DEC_operand_operand_84760 = null;
		Match match = null;
		Iterator fujaba__IterLineTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToMessageSend = null;
		MessageOccurrenceSpecification messageSend = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
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

			// check link fragment from combo to interaction
			JavaSDM.ensure(interaction.equals(combo.getEnclosingInteraction()));

			// check link coveredBy from operand to line
			JavaSDM.ensure(operand.getCovered().contains(line));

			// iterate to-many link coveredBy from line to parentCombo
			fujaba__Success = false;

			fujaba__IterLineToParentCombo = new ArrayList(line.getCoveredBy())
					.iterator();

			while (fujaba__IterLineToParentCombo.hasNext()) {
				try {
					_TmpObject = fujaba__IterLineToParentCombo.next();

					// ensure correct type and really bound of object parentCombo
					JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
					parentCombo = (CombinedFragment) _TmpObject;
					// check isomorphic binding between objects parentCombo and combo 
					JavaSDM.ensure(!parentCombo.equals(combo));

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
							// iterate to-many link coveredBy from line to parentOperand
							fujaba__Success = false;

							fujaba__IterLineToParentOperand = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentOperand.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentOperand
											.next();

									// ensure correct type and really bound of object parentOperand
									JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
									parentOperand = (InteractionOperand) _TmpObject;
									// check isomorphic binding between objects parentOperand and operand 
									JavaSDM.ensure(!parentOperand
											.equals(operand));

									// check link fragment from combo to parentOperand
									JavaSDM.ensure(parentOperand.equals(combo
											.getEnclosingOperand()));

									// check link fragment from messageSend to parentOperand
									JavaSDM.ensure(parentOperand
											.equals(messageSend
													.getEnclosingOperand()));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
															.getOppositeReference(
																	line,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

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
															__DEC_messageReceive_enclosingInteraction_32878 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_32878 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_32878 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_32878 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_32878
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_728282 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_728282 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_728282 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_728282 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_728282
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_500490 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_500490 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_500490 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_500490 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_500490
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_978694 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_978694 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_978694 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_978694 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_978694
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_978694 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_978694
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_800477 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_800477 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_800477 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_800477 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_800477
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_800477 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_800477
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_806031 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_806031 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_806031 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_806031 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_806031
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_806031 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_806031
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_669734 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_669734 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_669734 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_669734 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_669734
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_669734 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_669734
																	.equals(parentOperand));

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
															__DEC_spec_specification_149359 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_149359 is really bound
															JavaSDM.ensure(__DEC_spec_specification_149359 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_149359
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_149359 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_149359
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

															// bind object
															__DEC_guard_guard_907878 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_907878 is really bound
															JavaSDM.ensure(__DEC_guard_guard_907878 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_907878
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_907878 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_907878
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_907878 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_907878
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_84760 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_84760 is really bound
															JavaSDM.ensure(__DEC_operand_operand_84760 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_84760
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_84760 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_84760
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_84760 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_84760
																	.equals(parentCombo));

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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
														JavaSDM.ensure(!_edge_coveredBy
																.equals(_edge_covered));

														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

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

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_459(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_324428 = null;
		Interaction __DEC_messageSend_enclosingInteraction_573251 = null;
		Interaction __DEC_operand_enclosingInteraction_552333 = null;
		InteractionOperand __DEC_combo_fragment_297005 = null;
		InteractionOperand __DEC_messageReceive_fragment_226964 = null;
		InteractionOperand __DEC_messageSend_fragment_811531 = null;
		InteractionOperand __DEC_operand_fragment_313381 = null;
		Constraint __DEC_spec_specification_285683 = null;
		InteractionOperand __DEC_guard_guard_842785 = null;
		CombinedFragment __DEC_operand_operand_57369 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentOperand = null;
		InteractionOperand parentOperand = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
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
							// iterate to-many link coveredBy from line to parentCombo
							fujaba__Success = false;

							fujaba__IterLineToParentCombo = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentCombo
											.next();

									// ensure correct type and really bound of object parentCombo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									parentCombo = (CombinedFragment) _TmpObject;
									// check isomorphic binding between objects parentCombo and combo 
									JavaSDM.ensure(!parentCombo.equals(combo));

									// iterate to-many link coveredBy from line to parentOperand
									fujaba__Success = false;

									fujaba__IterLineToParentOperand = new ArrayList(
											line.getCoveredBy()).iterator();

									while (fujaba__IterLineToParentOperand
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterLineToParentOperand
													.next();

											// ensure correct type and really bound of object parentOperand
											JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
											parentOperand = (InteractionOperand) _TmpObject;
											// check isomorphic binding between objects parentOperand and operand 
											JavaSDM.ensure(!parentOperand
													.equals(operand));

											// check link fragment from combo to parentOperand
											JavaSDM.ensure(parentOperand.equals(combo
													.getEnclosingOperand()));

											// check link fragment from messageSend to parentOperand
											JavaSDM.ensure(parentOperand.equals(messageSend
													.getEnclosingOperand()));

											// check link operand from parentOperand to parentCombo
											JavaSDM.ensure(parentCombo
													.equals(parentOperand
															.eContainer()));

											// iterate to-many link fragment from parentOperand to messageReceive
											fujaba__Success = false;

											fujaba__IterParentOperandToMessageReceive = new ArrayList(
													parentOperand.getFragment())
													.iterator();

											while (fujaba__IterParentOperandToMessageReceive
													.hasNext()) {
												try {
													_TmpObject = fujaba__IterParentOperandToMessageReceive
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
															__DEC_messageReceive_enclosingInteraction_324428 = messageReceive
																	.getEnclosingInteraction();

															// check object __DEC_messageReceive_enclosingInteraction_324428 is really bound
															JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_324428 != null);

															// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_324428 and interaction 
															JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_324428
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_enclosingInteraction_573251 = messageSend
																	.getEnclosingInteraction();

															// check object __DEC_messageSend_enclosingInteraction_573251 is really bound
															JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_573251 != null);

															// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_573251 and interaction 
															JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_573251
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_enclosingInteraction_552333 = operand
																	.getEnclosingInteraction();

															// check object __DEC_operand_enclosingInteraction_552333 is really bound
															JavaSDM.ensure(__DEC_operand_enclosingInteraction_552333 != null);

															// check isomorphic binding between objects __DEC_operand_enclosingInteraction_552333 and interaction 
															JavaSDM.ensure(!__DEC_operand_enclosingInteraction_552333
																	.equals(interaction));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_combo_fragment_297005 = combo
																	.getEnclosingOperand();

															// check object __DEC_combo_fragment_297005 is really bound
															JavaSDM.ensure(__DEC_combo_fragment_297005 != null);

															// check isomorphic binding between objects __DEC_combo_fragment_297005 and operand 
															JavaSDM.ensure(!__DEC_combo_fragment_297005
																	.equals(operand));

															// check isomorphic binding between objects __DEC_combo_fragment_297005 and parentOperand 
															JavaSDM.ensure(!__DEC_combo_fragment_297005
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageReceive_fragment_226964 = messageReceive
																	.getEnclosingOperand();

															// check object __DEC_messageReceive_fragment_226964 is really bound
															JavaSDM.ensure(__DEC_messageReceive_fragment_226964 != null);

															// check isomorphic binding between objects __DEC_messageReceive_fragment_226964 and operand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_226964
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageReceive_fragment_226964 and parentOperand 
															JavaSDM.ensure(!__DEC_messageReceive_fragment_226964
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_messageSend_fragment_811531 = messageSend
																	.getEnclosingOperand();

															// check object __DEC_messageSend_fragment_811531 is really bound
															JavaSDM.ensure(__DEC_messageSend_fragment_811531 != null);

															// check isomorphic binding between objects __DEC_messageSend_fragment_811531 and operand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_811531
																	.equals(operand));

															// check isomorphic binding between objects __DEC_messageSend_fragment_811531 and parentOperand 
															JavaSDM.ensure(!__DEC_messageSend_fragment_811531
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_fragment_313381 = operand
																	.getEnclosingOperand();

															// check object __DEC_operand_fragment_313381 is really bound
															JavaSDM.ensure(__DEC_operand_fragment_313381 != null);

															// check isomorphic binding between objects __DEC_operand_fragment_313381 and operand 
															JavaSDM.ensure(!__DEC_operand_fragment_313381
																	.equals(operand));

															// check isomorphic binding between objects __DEC_operand_fragment_313381 and parentOperand 
															JavaSDM.ensure(!__DEC_operand_fragment_313381
																	.equals(parentOperand));

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
															__DEC_spec_specification_285683 = spec
																	.eContainer() instanceof Constraint ? (Constraint) spec
																	.eContainer()
																	: null;

															// check object __DEC_spec_specification_285683 is really bound
															JavaSDM.ensure(__DEC_spec_specification_285683 != null);

															// check if contained via correct reference
															JavaSDM.ensure(spec
																	.equals(__DEC_spec_specification_285683
																			.getSpecification()));

															// check isomorphic binding between objects __DEC_spec_specification_285683 and guard 
															JavaSDM.ensure(!__DEC_spec_specification_285683
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

															// bind object
															__DEC_guard_guard_842785 = guard
																	.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
																	.eContainer()
																	: null;

															// check object __DEC_guard_guard_842785 is really bound
															JavaSDM.ensure(__DEC_guard_guard_842785 != null);

															// check if contained via correct reference
															JavaSDM.ensure(guard
																	.equals(__DEC_guard_guard_842785
																			.getGuard()));

															// check isomorphic binding between objects __DEC_guard_guard_842785 and operand 
															JavaSDM.ensure(!__DEC_guard_guard_842785
																	.equals(operand));

															// check isomorphic binding between objects __DEC_guard_guard_842785 and parentOperand 
															JavaSDM.ensure(!__DEC_guard_guard_842785
																	.equals(parentOperand));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_operand_operand_57369 = operand
																	.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
																	.eContainer()
																	: null;

															// check object __DEC_operand_operand_57369 is really bound
															JavaSDM.ensure(__DEC_operand_operand_57369 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_operand_operand_57369
																	.getOperand()
																	.contains(
																			operand));

															// check isomorphic binding between objects __DEC_operand_operand_57369 and combo 
															JavaSDM.ensure(!__DEC_operand_operand_57369
																	.equals(combo));

															// check isomorphic binding between objects __DEC_operand_operand_57369 and parentCombo 
															JavaSDM.ensure(!__DEC_operand_operand_57369
																	.equals(parentCombo));

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
														// check object parentCombo is really bound
														JavaSDM.ensure(parentCombo != null);
														// check object parentOperand is really bound
														JavaSDM.ensure(parentOperand != null);
														// check object spec is really bound
														JavaSDM.ensure(spec != null);
														// check isomorphic binding between objects parentCombo and combo 
														JavaSDM.ensure(!parentCombo
																.equals(combo));

														// check isomorphic binding between objects messageSend and messageReceive 
														JavaSDM.ensure(!messageSend
																.equals(messageReceive));

														// check isomorphic binding between objects parentOperand and operand 
														JavaSDM.ensure(!parentOperand
																.equals(operand));

														// check link fragment from combo to interaction
														JavaSDM.ensure(interaction.equals(combo
																.getEnclosingInteraction()));

														// check link fragment from combo to parentOperand
														JavaSDM.ensure(parentOperand.equals(combo
																.getEnclosingOperand()));

														// check link fragment from messageReceive to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageReceive
																		.getEnclosingOperand()));

														// check link fragment from messageSend to parentOperand
														JavaSDM.ensure(parentOperand
																.equals(messageSend
																		.getEnclosingOperand()));

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

														// check link fragment from operand to parentOperand
														JavaSDM.ensure(!(parentOperand.equals(operand
																.getEnclosingOperand())));

														// check link guard from operand to guard
														JavaSDM.ensure(guard.equals(operand
																.getGuard()));

														// check link guard from parentOperand to guard
														JavaSDM.ensure(!(guard
																.equals(parentOperand
																		.getGuard())));

														// check link lifeline from line to interaction
														JavaSDM.ensure(interaction.equals(line
																.getInteraction()));

														// check link operand from operand to combo
														JavaSDM.ensure(combo.equals(operand
																.eContainer()));

														// check link operand from parentOperand to parentCombo
														JavaSDM.ensure(parentCombo
																.equals(parentOperand
																		.eContainer()));

														// check link operand from operand to parentCombo
														JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		operand,
																		CombinedFragment.class,
																		"$eContainer")
																.contains(parentCombo)));

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

														// check link coveredBy from messageSend to line
														JavaSDM.ensure(messageSend
																.getCovered()
																.contains(line));

														// check link coveredBy from operand to line
														JavaSDM.ensure(operand
																.getCovered()
																.contains(line));

														// check link coveredBy from parentCombo to line
														JavaSDM.ensure(parentCombo
																.getCovered()
																.contains(line));

														// check link coveredBy from parentOperand to line
														JavaSDM.ensure(parentOperand
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
																		parentOperand,
																		messageReceive,
																		combo,
																		parentCombo,
																		interaction,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_460(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_messageReceive_enclosingInteraction_917099 = null;
		Interaction __DEC_messageSend_enclosingInteraction_437633 = null;
		Interaction __DEC_operand_enclosingInteraction_563323 = null;
		InteractionOperand __DEC_combo_fragment_60347 = null;
		InteractionOperand __DEC_messageReceive_fragment_10208 = null;
		InteractionOperand __DEC_messageSend_fragment_668406 = null;
		InteractionOperand __DEC_operand_fragment_653040 = null;
		Constraint __DEC_spec_specification_198188 = null;
		InteractionOperand __DEC_guard_guard_133453 = null;
		CombinedFragment __DEC_operand_operand_772395 = null;
		Match match = null;
		Iterator fujaba__IterParentOperandToMessageReceive = null;
		MessageOccurrenceSpecification messageReceive = null;
		Iterator fujaba__IterLineToParentCombo = null;
		CombinedFragment parentCombo = null;
		InteractionOperand parentOperand = null;
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
							parentOperand = messageSend.getEnclosingOperand();

							// check object parentOperand is really bound
							JavaSDM.ensure(parentOperand != null);

							// check isomorphic binding between objects parentOperand and operand 
							JavaSDM.ensure(!parentOperand.equals(operand));

							// check link fragment from combo to parentOperand
							JavaSDM.ensure(parentOperand.equals(combo
									.getEnclosingOperand()));

							// check link coveredBy from parentOperand to line
							JavaSDM.ensure(parentOperand.getCovered().contains(
									line));

							// iterate to-many link coveredBy from line to parentCombo
							fujaba__Success = false;

							fujaba__IterLineToParentCombo = new ArrayList(
									line.getCoveredBy()).iterator();

							while (fujaba__IterLineToParentCombo.hasNext()) {
								try {
									_TmpObject = fujaba__IterLineToParentCombo
											.next();

									// ensure correct type and really bound of object parentCombo
									JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
									parentCombo = (CombinedFragment) _TmpObject;
									// check isomorphic binding between objects parentCombo and combo 
									JavaSDM.ensure(!parentCombo.equals(combo));

									// check link operand from parentOperand to parentCombo
									JavaSDM.ensure(parentCombo
											.equals(parentOperand.eContainer()));

									// iterate to-many link fragment from parentOperand to messageReceive
									fujaba__Success = false;

									fujaba__IterParentOperandToMessageReceive = new ArrayList(
											parentOperand.getFragment())
											.iterator();

									while (fujaba__IterParentOperandToMessageReceive
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterParentOperandToMessageReceive
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
													__DEC_messageReceive_enclosingInteraction_917099 = messageReceive
															.getEnclosingInteraction();

													// check object __DEC_messageReceive_enclosingInteraction_917099 is really bound
													JavaSDM.ensure(__DEC_messageReceive_enclosingInteraction_917099 != null);

													// check isomorphic binding between objects __DEC_messageReceive_enclosingInteraction_917099 and interaction 
													JavaSDM.ensure(!__DEC_messageReceive_enclosingInteraction_917099
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_enclosingInteraction_437633 = messageSend
															.getEnclosingInteraction();

													// check object __DEC_messageSend_enclosingInteraction_437633 is really bound
													JavaSDM.ensure(__DEC_messageSend_enclosingInteraction_437633 != null);

													// check isomorphic binding between objects __DEC_messageSend_enclosingInteraction_437633 and interaction 
													JavaSDM.ensure(!__DEC_messageSend_enclosingInteraction_437633
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_enclosingInteraction_563323 = operand
															.getEnclosingInteraction();

													// check object __DEC_operand_enclosingInteraction_563323 is really bound
													JavaSDM.ensure(__DEC_operand_enclosingInteraction_563323 != null);

													// check isomorphic binding between objects __DEC_operand_enclosingInteraction_563323 and interaction 
													JavaSDM.ensure(!__DEC_operand_enclosingInteraction_563323
															.equals(interaction));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_combo_fragment_60347 = combo
															.getEnclosingOperand();

													// check object __DEC_combo_fragment_60347 is really bound
													JavaSDM.ensure(__DEC_combo_fragment_60347 != null);

													// check isomorphic binding between objects __DEC_combo_fragment_60347 and operand 
													JavaSDM.ensure(!__DEC_combo_fragment_60347
															.equals(operand));

													// check isomorphic binding between objects __DEC_combo_fragment_60347 and parentOperand 
													JavaSDM.ensure(!__DEC_combo_fragment_60347
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageReceive_fragment_10208 = messageReceive
															.getEnclosingOperand();

													// check object __DEC_messageReceive_fragment_10208 is really bound
													JavaSDM.ensure(__DEC_messageReceive_fragment_10208 != null);

													// check isomorphic binding between objects __DEC_messageReceive_fragment_10208 and operand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_10208
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageReceive_fragment_10208 and parentOperand 
													JavaSDM.ensure(!__DEC_messageReceive_fragment_10208
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_messageSend_fragment_668406 = messageSend
															.getEnclosingOperand();

													// check object __DEC_messageSend_fragment_668406 is really bound
													JavaSDM.ensure(__DEC_messageSend_fragment_668406 != null);

													// check isomorphic binding between objects __DEC_messageSend_fragment_668406 and operand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_668406
															.equals(operand));

													// check isomorphic binding between objects __DEC_messageSend_fragment_668406 and parentOperand 
													JavaSDM.ensure(!__DEC_messageSend_fragment_668406
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_fragment_653040 = operand
															.getEnclosingOperand();

													// check object __DEC_operand_fragment_653040 is really bound
													JavaSDM.ensure(__DEC_operand_fragment_653040 != null);

													// check isomorphic binding between objects __DEC_operand_fragment_653040 and operand 
													JavaSDM.ensure(!__DEC_operand_fragment_653040
															.equals(operand));

													// check isomorphic binding between objects __DEC_operand_fragment_653040 and parentOperand 
													JavaSDM.ensure(!__DEC_operand_fragment_653040
															.equals(parentOperand));

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
													__DEC_spec_specification_198188 = spec
															.eContainer() instanceof Constraint ? (Constraint) spec
															.eContainer()
															: null;

													// check object __DEC_spec_specification_198188 is really bound
													JavaSDM.ensure(__DEC_spec_specification_198188 != null);

													// check if contained via correct reference
													JavaSDM.ensure(spec
															.equals(__DEC_spec_specification_198188
																	.getSpecification()));

													// check isomorphic binding between objects __DEC_spec_specification_198188 and guard 
													JavaSDM.ensure(!__DEC_spec_specification_198188
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

													// bind object
													__DEC_guard_guard_133453 = guard
															.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
															.eContainer()
															: null;

													// check object __DEC_guard_guard_133453 is really bound
													JavaSDM.ensure(__DEC_guard_guard_133453 != null);

													// check if contained via correct reference
													JavaSDM.ensure(guard
															.equals(__DEC_guard_guard_133453
																	.getGuard()));

													// check isomorphic binding between objects __DEC_guard_guard_133453 and operand 
													JavaSDM.ensure(!__DEC_guard_guard_133453
															.equals(operand));

													// check isomorphic binding between objects __DEC_guard_guard_133453 and parentOperand 
													JavaSDM.ensure(!__DEC_guard_guard_133453
															.equals(parentOperand));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_operand_operand_772395 = operand
															.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
															.eContainer()
															: null;

													// check object __DEC_operand_operand_772395 is really bound
													JavaSDM.ensure(__DEC_operand_operand_772395 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_operand_operand_772395
															.getOperand()
															.contains(operand));

													// check isomorphic binding between objects __DEC_operand_operand_772395 and combo 
													JavaSDM.ensure(!__DEC_operand_operand_772395
															.equals(combo));

													// check isomorphic binding between objects __DEC_operand_operand_772395 and parentCombo 
													JavaSDM.ensure(!__DEC_operand_operand_772395
															.equals(parentCombo));

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
												// check object parentCombo is really bound
												JavaSDM.ensure(parentCombo != null);
												// check object parentOperand is really bound
												JavaSDM.ensure(parentOperand != null);
												// check object spec is really bound
												JavaSDM.ensure(spec != null);
												// check isomorphic binding between objects parentCombo and combo 
												JavaSDM.ensure(!parentCombo
														.equals(combo));

												// check isomorphic binding between objects messageSend and messageReceive 
												JavaSDM.ensure(!messageSend
														.equals(messageReceive));

												// check isomorphic binding between objects parentOperand and operand 
												JavaSDM.ensure(!parentOperand
														.equals(operand));

												// check link fragment from combo to interaction
												JavaSDM.ensure(interaction.equals(combo
														.getEnclosingInteraction()));

												// check link fragment from combo to parentOperand
												JavaSDM.ensure(parentOperand.equals(combo
														.getEnclosingOperand()));

												// check link fragment from messageReceive to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageReceive
														.getEnclosingOperand()));

												// check link fragment from messageSend to parentOperand
												JavaSDM.ensure(parentOperand.equals(messageSend
														.getEnclosingOperand()));

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

												// check link fragment from operand to parentOperand
												JavaSDM.ensure(!(parentOperand.equals(operand
														.getEnclosingOperand())));

												// check link guard from operand to guard
												JavaSDM.ensure(guard
														.equals(operand
																.getGuard()));

												// check link guard from parentOperand to guard
												JavaSDM.ensure(!(guard
														.equals(parentOperand
																.getGuard())));

												// check link lifeline from line to interaction
												JavaSDM.ensure(interaction.equals(line
														.getInteraction()));

												// check link operand from operand to combo
												JavaSDM.ensure(combo
														.equals(operand
																.eContainer()));

												// check link operand from parentOperand to parentCombo
												JavaSDM.ensure(parentCombo
														.equals(parentOperand
																.eContainer()));

												// check link operand from operand to parentCombo
												JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																operand,
																CombinedFragment.class,
																"$eContainer")
														.contains(parentCombo)));

												// check link specification from spec to guard
												JavaSDM.ensure(guard
														.equals(spec
																.eContainer()));

												// check link src from _edge_specification to guard
												JavaSDM.ensure(guard
														.equals(_edge_specification
																.getSrc()));

												// check link trg from _edge_specification to spec
												JavaSDM.ensure(spec
														.equals(_edge_specification
																.getTrg()));

												// check link coveredBy from messageSend to line
												JavaSDM.ensure(messageSend
														.getCovered().contains(
																line));

												// check link coveredBy from operand to line
												JavaSDM.ensure(operand
														.getCovered().contains(
																line));

												// check link coveredBy from parentCombo to line
												JavaSDM.ensure(parentCombo
														.getCovered().contains(
																line));

												// check link coveredBy from parentOperand to line
												JavaSDM.ensure(parentOperand
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
																parentOperand,
																messageReceive,
																combo,
																parentCombo,
																interaction,
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
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
			return null;
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(NamedFlow) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7), (UseCase) arguments.get(8),
					(UseCaseToInteraction) arguments.get(9),
					(PackageDeclaration) arguments.get(10),
					(NormalStep) arguments.get(11),
					(AlternativeFlowAlternative) arguments.get(12),
					(AlternativeFlow) arguments.get(13));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
			return null;
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(InteractionOperand) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(CombinedFragment) arguments.get(9),
					(Interaction) arguments.get(10),
					(UseCase) arguments.get(11),
					(UseCaseToInteraction) arguments.get(12),
					(PackageDeclaration) arguments.get(13),
					(InteractionOperand) arguments.get(14),
					(InteractionConstraint) arguments.get(15),
					(LiteralString) arguments.get(16));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_442__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_442((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_443__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_443((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_444__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_444((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_445__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_445((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_446__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_446((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_447__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_447((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_448__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_448((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_449__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_449((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_450__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_450((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_451__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_451((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_452__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_452((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_453__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_453((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_454__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_454((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_455__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_455((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_103((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_104((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_456__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_456((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_457__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_457((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_458__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_458((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_459__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_459((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_460__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_460((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltSysStepNFToComboRuleImpl
