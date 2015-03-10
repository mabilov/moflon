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

import UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule;
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
 * An implementation of the model object '<em><b>Parallel Flow To Operand Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelFlowToOperandRuleImpl extends AbstractRuleImpl implements
		ParallelFlowToOperandRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelFlowToOperandRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelFlowToOperandRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __step_invokedFlows_parFlow = null;
		EMoflonEdge __useCase_flows_parFlow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCase_flows_flow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object parFlow is really bound
			JavaSDM.ensure(parFlow != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, step, parFlow,
					useCase, flow));

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

				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parFlow is really bound
				JavaSDM.ensure(parFlow != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parFlow and flow 
				JavaSDM.ensure(!parFlow.equals(flow));

				// create object __step_invokedFlows_parFlow
				__step_invokedFlows_parFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_parFlow
				__useCase_flows_parFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __step_invokedFlows_parFlow
				__step_invokedFlows_parFlow.setName("invokedFlows");
				// assign attribute __useCase_flows_parFlow
				__useCase_flows_parFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_invokedFlows_parFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_parFlow, "toBeTranslatedEdges");

				// create link
				__step_invokedFlows_parFlow.setSrc(step);

				// create link
				__step_invokedFlows_parFlow.setTrg(parFlow);

				// create link
				__useCase_flows_parFlow.setTrg(parFlow);

				// create link
				__useCase_flows_parFlow.setSrc(useCase);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parFlow is really bound
				JavaSDM.ensure(parFlow != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parFlow and flow 
				JavaSDM.ensure(!parFlow.equals(flow));

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __flow_steps_step
				__flow_steps_step.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__flow_steps_step.setSrc(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, step, parFlow, useCase, flow);
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
		CombinedFragment combo = null;
		Flow flow = null;
		ParallelFlow parFlow = null;
		ParallelStep step = null;
		ParallelStepToCombinedFragment stepToCombo = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		InteractionOperand operand = null;
		FlowToInteractionFragment parFlowToOperand = null;
		InteractionConstraint guard = null;
		LiteralString spec = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge combo__operand__operand = null;
		EMoflonEdge parFlowToOperand__source__parFlow = null;
		EMoflonEdge __step_invokedFlows_parFlow = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge parFlowToOperand__target__operand = null;
		EMoflonEdge __useCase_flows_parFlow = null;
		EMoflonEdge guard__specification__spec = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("combo"));

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parFlow"));

			// ensure correct type and really bound of object parFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parFlow = (ParallelFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			step = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("stepToCombo"));

			// ensure correct type and really bound of object stepToCombo
			JavaSDM.ensure(_TmpObject instanceof ParallelStepToCombinedFragment);
			stepToCombo = (ParallelStepToCombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

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

			// create object parFlowToOperand
			parFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// create object guard
			guard = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionConstraint();

			// create object spec
			spec = ModalSequenceDiagramFactory.eINSTANCE.createLiteralString();

			// assign attribute spec
			spec.setValue((java.lang.String) csp.getValue("spec", "value"));

			// create link
			combo.getOperand().add(operand); // add link

			// create link
			parFlowToOperand.setSource(parFlow);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			parFlowToOperand.setTarget(operand);

			// create link
			guard.setSpecification(spec); // add link to one

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object parFlow is really bound
			JavaSDM.ensure(parFlow != null);
			// check object parFlowToOperand is really bound
			JavaSDM.ensure(parFlowToOperand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object parFlow is really bound
			JavaSDM.ensure(parFlow != null);
			// check object parFlowToOperand is really bound
			JavaSDM.ensure(parFlowToOperand != null);
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
			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

			// check isomorphic binding between objects parFlow and combo 
			JavaSDM.ensure(!parFlow.equals(combo));

			// check isomorphic binding between objects parFlowToOperand and combo 
			JavaSDM.ensure(!parFlowToOperand.equals(combo));

			// check isomorphic binding between objects spec and combo 
			JavaSDM.ensure(!spec.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToCombo and combo 
			JavaSDM.ensure(!stepToCombo.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

			// check isomorphic binding between objects parFlowToOperand and flow 
			JavaSDM.ensure(!parFlowToOperand.equals(flow));

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects parFlow and guard 
			JavaSDM.ensure(!parFlow.equals(guard));

			// check isomorphic binding between objects parFlowToOperand and guard 
			JavaSDM.ensure(!parFlowToOperand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects parFlow and operand 
			JavaSDM.ensure(!parFlow.equals(operand));

			// check isomorphic binding between objects parFlowToOperand and operand 
			JavaSDM.ensure(!parFlowToOperand.equals(operand));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects parFlowToOperand and parFlow 
			JavaSDM.ensure(!parFlowToOperand.equals(parFlow));

			// check isomorphic binding between objects spec and parFlow 
			JavaSDM.ensure(!spec.equals(parFlow));

			// check isomorphic binding between objects step and parFlow 
			JavaSDM.ensure(!step.equals(parFlow));

			// check isomorphic binding between objects stepToCombo and parFlow 
			JavaSDM.ensure(!stepToCombo.equals(parFlow));

			// check isomorphic binding between objects useCase and parFlow 
			JavaSDM.ensure(!useCase.equals(parFlow));

			// check isomorphic binding between objects spec and parFlowToOperand 
			JavaSDM.ensure(!spec.equals(parFlowToOperand));

			// check isomorphic binding between objects step and parFlowToOperand 
			JavaSDM.ensure(!step.equals(parFlowToOperand));

			// check isomorphic binding between objects stepToCombo and parFlowToOperand 
			JavaSDM.ensure(!stepToCombo.equals(parFlowToOperand));

			// check isomorphic binding between objects useCase and parFlowToOperand 
			JavaSDM.ensure(!useCase.equals(parFlowToOperand));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parFlowToOperand__source__parFlow
			parFlowToOperand__source__parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __step_invokedFlows_parFlow
			__step_invokedFlows_parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parFlowToOperand__target__operand
			parFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_parFlow
			__useCase_flows_parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelFlowToOperandRule");
			// assign attribute combo__operand__operand
			combo__operand__operand.setName("operand");
			// assign attribute __step_invokedFlows_parFlow
			__step_invokedFlows_parFlow.setName("invokedFlows");
			// assign attribute __useCase_flows_parFlow
			__useCase_flows_parFlow.setName("flows");
			// assign attribute operand__guard__guard
			operand__guard__guard.setName("guard");
			// assign attribute parFlowToOperand__source__parFlow
			parFlowToOperand__source__parFlow.setName("source");
			// assign attribute parFlowToOperand__target__operand
			parFlowToOperand__target__operand.setName("target");
			// assign attribute guard__specification__spec
			guard__specification__spec.setName("specification");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand__source__parFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_invokedFlows_parFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_parFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			__step_invokedFlows_parFlow.setSrc(step);

			// create link
			__step_invokedFlows_parFlow.setTrg(parFlow);

			// create link
			__useCase_flows_parFlow.setTrg(parFlow);

			// create link
			parFlowToOperand__source__parFlow.setTrg(parFlow);

			// create link
			__useCase_flows_parFlow.setSrc(useCase);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			parFlowToOperand__target__operand.setTrg(operand);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			parFlowToOperand__source__parFlow.setSrc(parFlowToOperand);

			// create link
			parFlowToOperand__target__operand.setSrc(parFlowToOperand);

			// create link
			operand__guard__guard.setTrg(guard);

			// create link
			guard__specification__spec.setSrc(guard);

			// create link
			guard__specification__spec.setTrg(spec);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, combo, step, stepToCombo, parFlow,
				useCase, flow, operand, parFlowToOperand, guard, spec);
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
		Flow flow = null;
		ParallelFlow parFlow = null;
		ParallelStep step = null;
		UseCase useCase = null;
		EMoflonEdge __stepToCombo_target_combo = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __step_invokedFlows_parFlow = null;
		EMoflonEdge __stepToCombo_source_step = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __useCase_flows_parFlow = null;
		EMoflonEdge __useCase_flows_flow = null;
		CSP csp = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterStepToStepToCombo = null;
		ParallelStepToCombinedFragment stepToCombo = null;

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
			ruleresult.setRule("ParallelFlowToOperandRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("parFlow"));

			// ensure correct type and really bound of object parFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parFlow = (ParallelFlow) _TmpObject;
			_TmpObject = (match.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			step = (ParallelStep) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

			// iterate to-many link source from step to stepToCombo
			fujaba__Success = false;

			fujaba__IterStepToStepToCombo = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(step,
							ParallelStepToCombinedFragment.class, "source"))
					.iterator();

			while (fujaba__IterStepToStepToCombo.hasNext()) {
				try {
					stepToCombo = (ParallelStepToCombinedFragment) fujaba__IterStepToStepToCombo
							.next();

					// check object stepToCombo is really bound
					JavaSDM.ensure(stepToCombo != null);
					// bind object
					combo = stepToCombo.getTarget();

					// check object combo is really bound
					JavaSDM.ensure(combo != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object combo is really bound
						JavaSDM.ensure(combo != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object parFlow is really bound
						JavaSDM.ensure(parFlow != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object stepToCombo is really bound
						JavaSDM.ensure(stepToCombo != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects parFlow and flow 
						JavaSDM.ensure(!parFlow.equals(flow));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link flows from parFlow to useCase
						JavaSDM.ensure(useCase.equals(parFlow.eContainer()));

						// check link source from stepToCombo to step
						JavaSDM.ensure(step.equals(stepToCombo.getSource()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link target from stepToCombo to combo
						JavaSDM.ensure(combo.equals(stepToCombo.getTarget()));

						// check link invokedFlows from parFlow to step
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parFlow,
										ParallelStep.class, "invokedFlows")
								.contains(step));

						// create object __stepToCombo_target_combo
						__stepToCombo_target_combo = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __step_invokedFlows_parFlow
						__step_invokedFlows_parFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __stepToCombo_source_step
						__stepToCombo_source_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __flow_steps_step
						__flow_steps_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_parFlow
						__useCase_flows_parFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_flow
						__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __step_invokedFlows_parFlow
						__step_invokedFlows_parFlow.setName("invokedFlows");
						// assign attribute __stepToCombo_source_step
						__stepToCombo_source_step.setName("source");
						// assign attribute __stepToCombo_target_combo
						__stepToCombo_target_combo.setName("target");
						// assign attribute __useCase_flows_flow
						__useCase_flows_flow.setName("flows");
						// assign attribute __useCase_flows_parFlow
						__useCase_flows_parFlow.setName("flows");
						// assign attribute __flow_steps_step
						__flow_steps_step.setName("steps");

						// create link
						__stepToCombo_target_combo.setTrg(combo);

						// create link
						isApplicableMatch.getAllContextElements().add(combo);

						// create link
						__step_invokedFlows_parFlow.setSrc(step);

						// create link
						isApplicableMatch.getAllContextElements().add(step);

						// create link
						__stepToCombo_source_step.setTrg(step);

						// create link
						__flow_steps_step.setTrg(step);

						// create link
						isApplicableMatch.getAllContextElements().add(
								stepToCombo);

						// create link
						__stepToCombo_source_step.setSrc(stepToCombo);

						// create link
						__stepToCombo_target_combo.setSrc(stepToCombo);

						// create link
						__step_invokedFlows_parFlow.setTrg(parFlow);

						// create link
						__useCase_flows_parFlow.setTrg(parFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(parFlow);

						// create link
						__useCase_flows_flow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__useCase_flows_parFlow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__flow_steps_step.setSrc(flow);

						// create link
						__useCase_flows_flow.setTrg(flow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_flow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __step_invokedFlows_parFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_parFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __flow_steps_step,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __stepToCombo_target_combo,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __stepToCombo_source_step,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, combo, step,
									stepToCombo, parFlow, useCase, flow));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_FWD(csp);
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
										.setRuleName("ParallelFlowToOperandRule");
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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("parFlow", parFlow);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
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
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"parFlow.name", true, csp);
		var_parFlow_name.setValue(parFlow.getName());
		var_parFlow_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parFlow_name, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("parFlow", parFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
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
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("parFlow", parFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("parFlowToOperand", parFlowToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("parFlow")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __combo_operand_operand = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, combo,
					operand, guard, spec));

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
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
				// assign attribute __operand_guard_guard
				__operand_guard_guard.setName("guard");
				// assign attribute __guard_specification_spec
				__guard_specification_spec.setName("specification");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						spec, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						operand, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						guard, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				__combo_operand_operand.setSrc(combo);

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
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, combo, operand, guard, spec);
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
		CombinedFragment combo = null;
		Flow flow = null;
		InteractionConstraint guard = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		ParallelStep step = null;
		ParallelStepToCombinedFragment stepToCombo = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		ParallelFlow parFlow = null;
		FlowToInteractionFragment parFlowToOperand = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge useCase__flows__parFlow = null;
		EMoflonEdge parFlowToOperand__target__operand = null;
		EMoflonEdge parFlowToOperand__source__parFlow = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge step__invokedFlows__parFlow = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __combo_operand_operand = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

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
			_TmpObject = (isApplicableMatch.getObject("operand"));

			// ensure correct type and really bound of object operand
			JavaSDM.ensure(_TmpObject instanceof InteractionOperand);
			operand = (InteractionOperand) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("spec"));

			// ensure correct type and really bound of object spec
			JavaSDM.ensure(_TmpObject instanceof LiteralString);
			spec = (LiteralString) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			step = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("stepToCombo"));

			// ensure correct type and really bound of object stepToCombo
			JavaSDM.ensure(_TmpObject instanceof ParallelStepToCombinedFragment);
			stepToCombo = (ParallelStepToCombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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
			// create object parFlow
			parFlow = UseCaseDSLFactory.eINSTANCE.createParallelFlow();

			// create object parFlowToOperand
			parFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// assign attribute parFlow
			parFlow.setName((java.lang.String) csp.getValue("parFlow", "name"));

			// create link
			parFlowToOperand.setTarget(operand);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(step, parFlow,
					"invokedFlows");

			// create link
			useCase.getFlows().add(parFlow);

			// create link
			parFlowToOperand.setSource(parFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object parFlow is really bound
			JavaSDM.ensure(parFlow != null);
			// check object parFlowToOperand is really bound
			JavaSDM.ensure(parFlowToOperand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object parFlow is really bound
			JavaSDM.ensure(parFlow != null);
			// check object parFlowToOperand is really bound
			JavaSDM.ensure(parFlowToOperand != null);
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
			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

			// check isomorphic binding between objects parFlow and combo 
			JavaSDM.ensure(!parFlow.equals(combo));

			// check isomorphic binding between objects parFlowToOperand and combo 
			JavaSDM.ensure(!parFlowToOperand.equals(combo));

			// check isomorphic binding between objects spec and combo 
			JavaSDM.ensure(!spec.equals(combo));

			// check isomorphic binding between objects step and combo 
			JavaSDM.ensure(!step.equals(combo));

			// check isomorphic binding between objects stepToCombo and combo 
			JavaSDM.ensure(!stepToCombo.equals(combo));

			// check isomorphic binding between objects useCase and combo 
			JavaSDM.ensure(!useCase.equals(combo));

			// check isomorphic binding between objects guard and flow 
			JavaSDM.ensure(!guard.equals(flow));

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

			// check isomorphic binding between objects parFlowToOperand and flow 
			JavaSDM.ensure(!parFlowToOperand.equals(flow));

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects parFlow and guard 
			JavaSDM.ensure(!parFlow.equals(guard));

			// check isomorphic binding between objects parFlowToOperand and guard 
			JavaSDM.ensure(!parFlowToOperand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects parFlow and operand 
			JavaSDM.ensure(!parFlow.equals(operand));

			// check isomorphic binding between objects parFlowToOperand and operand 
			JavaSDM.ensure(!parFlowToOperand.equals(operand));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

			// check isomorphic binding between objects parFlowToOperand and parFlow 
			JavaSDM.ensure(!parFlowToOperand.equals(parFlow));

			// check isomorphic binding between objects spec and parFlow 
			JavaSDM.ensure(!spec.equals(parFlow));

			// check isomorphic binding between objects step and parFlow 
			JavaSDM.ensure(!step.equals(parFlow));

			// check isomorphic binding between objects stepToCombo and parFlow 
			JavaSDM.ensure(!stepToCombo.equals(parFlow));

			// check isomorphic binding between objects useCase and parFlow 
			JavaSDM.ensure(!useCase.equals(parFlow));

			// check isomorphic binding between objects spec and parFlowToOperand 
			JavaSDM.ensure(!spec.equals(parFlowToOperand));

			// check isomorphic binding between objects step and parFlowToOperand 
			JavaSDM.ensure(!step.equals(parFlowToOperand));

			// check isomorphic binding between objects stepToCombo and parFlowToOperand 
			JavaSDM.ensure(!stepToCombo.equals(parFlowToOperand));

			// check isomorphic binding between objects useCase and parFlowToOperand 
			JavaSDM.ensure(!useCase.equals(parFlowToOperand));

			// check isomorphic binding between objects step and spec 
			JavaSDM.ensure(!step.equals(spec));

			// check isomorphic binding between objects stepToCombo and spec 
			JavaSDM.ensure(!stepToCombo.equals(spec));

			// check isomorphic binding between objects useCase and spec 
			JavaSDM.ensure(!useCase.equals(spec));

			// check isomorphic binding between objects stepToCombo and step 
			JavaSDM.ensure(!stepToCombo.equals(step));

			// check isomorphic binding between objects useCase and step 
			JavaSDM.ensure(!useCase.equals(step));

			// check isomorphic binding between objects useCase and stepToCombo 
			JavaSDM.ensure(!useCase.equals(stepToCombo));

			// create object useCase__flows__parFlow
			useCase__flows__parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parFlowToOperand__target__operand
			parFlowToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parFlowToOperand__source__parFlow
			parFlowToOperand__source__parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__invokedFlows__parFlow
			step__invokedFlows__parFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelFlowToOperandRule");
			// assign attribute __combo_operand_operand
			__combo_operand_operand.setName("operand");
			// assign attribute step__invokedFlows__parFlow
			step__invokedFlows__parFlow.setName("invokedFlows");
			// assign attribute useCase__flows__parFlow
			useCase__flows__parFlow.setName("flows");
			// assign attribute __operand_guard_guard
			__operand_guard_guard.setName("guard");
			// assign attribute parFlowToOperand__source__parFlow
			parFlowToOperand__source__parFlow.setName("source");
			// assign attribute parFlowToOperand__target__operand
			parFlowToOperand__target__operand.setName("target");
			// assign attribute __guard_specification_spec
			__guard_specification_spec.setName("specification");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__parFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parFlowToOperand__source__parFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__invokedFlows__parFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			step__invokedFlows__parFlow.setSrc(step);

			// create link
			parFlowToOperand__source__parFlow.setTrg(parFlow);

			// create link
			useCase__flows__parFlow.setTrg(parFlow);

			// create link
			step__invokedFlows__parFlow.setTrg(parFlow);

			// create link
			useCase__flows__parFlow.setSrc(useCase);

			// create link
			parFlowToOperand__target__operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			parFlowToOperand__source__parFlow.setSrc(parFlowToOperand);

			// create link
			parFlowToOperand__target__operand.setSrc(parFlowToOperand);

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

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, combo, step, stepToCombo, parFlow,
				useCase, flow, operand, parFlowToOperand, guard, spec);
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
		InteractionOperand operand = null;
		LiteralString spec = null;
		EMoflonEdge __stepToCombo_target_combo = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __stepToCombo_source_step = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __guard_specification_spec = null;
		CSP csp = null;
		UseCase useCase = null;
		Flow flow = null;
		ParallelStep step = null;
		Iterator fujaba__IterComboToStepToCombo = null;
		ParallelStepToCombinedFragment stepToCombo = null;

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
			ruleresult.setRule("ParallelFlowToOperandRule");

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
			// iterate to-many link target from combo to stepToCombo
			fujaba__Success = false;

			fujaba__IterComboToStepToCombo = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(combo,
							ParallelStepToCombinedFragment.class, "target"))
					.iterator();

			while (fujaba__IterComboToStepToCombo.hasNext()) {
				try {
					stepToCombo = (ParallelStepToCombinedFragment) fujaba__IterComboToStepToCombo
							.next();

					// check object stepToCombo is really bound
					JavaSDM.ensure(stepToCombo != null);
					// bind object
					step = stepToCombo.getSource();

					// check object step is really bound
					JavaSDM.ensure(step != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object combo is really bound
						JavaSDM.ensure(combo != null);
						// check object guard is really bound
						JavaSDM.ensure(guard != null);
						// check object operand is really bound
						JavaSDM.ensure(operand != null);
						// check object spec is really bound
						JavaSDM.ensure(spec != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object stepToCombo is really bound
						JavaSDM.ensure(stepToCombo != null);
						// check link guard from operand to guard
						JavaSDM.ensure(guard.equals(operand.getGuard()));

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link source from stepToCombo to step
						JavaSDM.ensure(step.equals(stepToCombo.getSource()));

						// check link specification from spec to guard
						JavaSDM.ensure(guard.equals(spec.eContainer()));

						// bind object
						flow = step.eContainer() instanceof Flow ? (Flow) step
								.eContainer() : null;

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

						// check link target from stepToCombo to combo
						JavaSDM.ensure(combo.equals(stepToCombo.getTarget()));

						// create object __stepToCombo_target_combo
						__stepToCombo_target_combo = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __combo_operand_operand
						__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __flow_steps_step
						__flow_steps_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __stepToCombo_source_step
						__stepToCombo_source_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_flow
						__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __operand_guard_guard
						__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __guard_specification_spec
						__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __combo_operand_operand
						__combo_operand_operand.setName("operand");
						// assign attribute __stepToCombo_source_step
						__stepToCombo_source_step.setName("source");
						// assign attribute __stepToCombo_target_combo
						__stepToCombo_target_combo.setName("target");
						// assign attribute __useCase_flows_flow
						__useCase_flows_flow.setName("flows");
						// assign attribute __flow_steps_step
						__flow_steps_step.setName("steps");
						// assign attribute __operand_guard_guard
						__operand_guard_guard.setName("guard");
						// assign attribute __guard_specification_spec
						__guard_specification_spec.setName("specification");

						// create link
						__stepToCombo_target_combo.setTrg(combo);

						// create link
						isApplicableMatch.getAllContextElements().add(combo);

						// create link
						__combo_operand_operand.setSrc(combo);

						// create link
						__flow_steps_step.setTrg(step);

						// create link
						__stepToCombo_source_step.setTrg(step);

						// create link
						isApplicableMatch.getAllContextElements().add(step);

						// create link
						isApplicableMatch.getAllContextElements().add(
								stepToCombo);

						// create link
						__stepToCombo_source_step.setSrc(stepToCombo);

						// create link
						__stepToCombo_target_combo.setSrc(stepToCombo);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__useCase_flows_flow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__flow_steps_step.setSrc(flow);

						// create link
						__useCase_flows_flow.setTrg(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(operand);

						// create link
						__combo_operand_operand.setTrg(operand);

						// create link
						__operand_guard_guard.setSrc(operand);

						// create link
						__guard_specification_spec.setSrc(guard);

						// create link
						isApplicableMatch.getAllContextElements().add(guard);

						// create link
						__operand_guard_guard.setTrg(guard);

						// create link
						__guard_specification_spec.setTrg(spec);

						// create link
						isApplicableMatch.getAllContextElements().add(spec);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __stepToCombo_source_step,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __combo_operand_operand,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_flow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __guard_specification_spec,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __stepToCombo_target_combo,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __operand_guard_guard,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __flow_steps_step,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, combo, step,
									stepToCombo, useCase, flow, operand, guard,
									spec));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_BWD(csp);
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
										.setRuleName("ParallelFlowToOperandRule");
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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
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
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_parFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"parFlow.name", csp);
		var_parFlow_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parFlow_name, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
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
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("parFlow", parFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("parFlowToOperand", parFlowToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_76(
			EMoflonEdge _edge_operand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_678635 = null;
		InteractionOperand __DEC_guard_guard_620025 = null;
		CombinedFragment __DEC_operand_operand_429925 = null;
		Constraint __DEC_spec_specification_514016 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from operand
				JavaSDM.ensure(operand.getEnclosingInteraction() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_fragment_678635 = operand
							.getEnclosingOperand();

					// check object __DEC_operand_fragment_678635 is really bound
					JavaSDM.ensure(__DEC_operand_fragment_678635 != null);

					// check isomorphic binding between objects __DEC_operand_fragment_678635 and operand 
					JavaSDM.ensure(!__DEC_operand_fragment_678635
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
					__DEC_guard_guard_620025 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
							.eContainer() : null;

					// check object __DEC_guard_guard_620025 is really bound
					JavaSDM.ensure(__DEC_guard_guard_620025 != null);

					// check if contained via correct reference
					JavaSDM.ensure(guard.equals(__DEC_guard_guard_620025
							.getGuard()));

					// check isomorphic binding between objects __DEC_guard_guard_620025 and operand 
					JavaSDM.ensure(!__DEC_guard_guard_620025.equals(operand));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_operand_429925 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object __DEC_operand_operand_429925 is really bound
					JavaSDM.ensure(__DEC_operand_operand_429925 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_operand_operand_429925.getOperand()
							.contains(operand));

					// check isomorphic binding between objects __DEC_operand_operand_429925 and combo 
					JavaSDM.ensure(!__DEC_operand_operand_429925.equals(combo));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_spec_specification_514016 = spec.eContainer() instanceof Constraint ? (Constraint) spec
							.eContainer() : null;

					// check object __DEC_spec_specification_514016 is really bound
					JavaSDM.ensure(__DEC_spec_specification_514016 != null);

					// check if contained via correct reference
					JavaSDM.ensure(spec.equals(__DEC_spec_specification_514016
							.getSpecification()));

					// check isomorphic binding between objects __DEC_spec_specification_514016 and guard 
					JavaSDM.ensure(!__DEC_spec_specification_514016
							.equals(guard));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check object _edge_operand is really bound
				JavaSDM.ensure(_edge_operand != null);
				// check object combo is really bound
				JavaSDM.ensure(combo != null);
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check link guard from operand to guard
				JavaSDM.ensure(guard.equals(operand.getGuard()));

				// check link operand from operand to combo
				JavaSDM.ensure(combo.equals(operand.eContainer()));

				// check link specification from spec to guard
				JavaSDM.ensure(guard.equals(spec.eContainer()));

				// check link src from _edge_operand to combo
				JavaSDM.ensure(combo.equals(_edge_operand.getSrc()));

				// check link trg from _edge_operand to operand
				JavaSDM.ensure(operand.equals(_edge_operand.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, combo, operand,
						guard, spec);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(
			EMoflonEdge _edge_invokedFlows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_parFlow_flows_188222 = null;
		Iterator fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_79296 = null;
		ParallelStep __DEC_parFlow_invokedFlows_79296 = null;
		Match match = null;
		UseCase useCase = null;
		ParallelFlow parFlow = null;
		Flow flow = null;
		ParallelStep step = null;

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

			// check object _edge_invokedFlows is really bound
			JavaSDM.ensure(_edge_invokedFlows != null);
			// bind object
			_TmpObject = _edge_invokedFlows.getSrc();

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			step = (ParallelStep) _TmpObject;

			// bind object
			flow = step.eContainer() instanceof Flow ? (Flow) step.eContainer()
					: null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(step));

			// bind object
			_TmpObject = _edge_invokedFlows.getTrg();

			// ensure correct type and really bound of object parFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parFlow = (ParallelFlow) _TmpObject;

			// check isomorphic binding between objects parFlow and flow 
			JavaSDM.ensure(!parFlow.equals(flow));

			// bind object
			useCase = parFlow.eContainer() instanceof UseCase ? (UseCase) parFlow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(parFlow));

			// check link flows from flow to useCase
			JavaSDM.ensure(useCase.equals(flow.eContainer()));

			// check link invokedFlows from parFlow to step
			JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil.getOppositeReference(
					parFlow, ParallelStep.class, "invokedFlows").contains(step));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_parFlow_flows_188222 = parFlow.eContainer() instanceof UseCase ? (UseCase) parFlow
							.eContainer() : null;

					// check object __DEC_parFlow_flows_188222 is really bound
					JavaSDM.ensure(__DEC_parFlow_flows_188222 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_parFlow_flows_188222.getFlows()
							.contains(parFlow));

					// check isomorphic binding between objects __DEC_parFlow_flows_188222 and useCase 
					JavaSDM.ensure(!__DEC_parFlow_flows_188222.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link ref from parFlow
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parFlow,
								AlternativeFlowAlternative.class, "ref").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link invokedFlows from parFlow to __DEC_parFlow_invokedFlows_79296
					fujaba__Success = false;

					fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_79296 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parFlow,
											ParallelStep.class, "invokedFlows"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_79296
									.hasNext()) {
						try {
							__DEC_parFlow_invokedFlows_79296 = (ParallelStep) fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_79296
									.next();

							// check object __DEC_parFlow_invokedFlows_79296 is really bound
							JavaSDM.ensure(__DEC_parFlow_invokedFlows_79296 != null);
							// check isomorphic binding between objects __DEC_parFlow_invokedFlows_79296 and step 
							JavaSDM.ensure(!__DEC_parFlow_invokedFlows_79296
									.equals(step));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_invokedFlows is really bound
				JavaSDM.ensure(_edge_invokedFlows != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object parFlow is really bound
				JavaSDM.ensure(parFlow != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parFlow and flow 
				JavaSDM.ensure(!parFlow.equals(flow));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link flows from parFlow to useCase
				JavaSDM.ensure(useCase.equals(parFlow.eContainer()));

				// check link src from _edge_invokedFlows to step
				JavaSDM.ensure(step.equals(_edge_invokedFlows.getSrc()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_invokedFlows to parFlow
				JavaSDM.ensure(parFlow.equals(_edge_invokedFlows.getTrg()));

				// check link invokedFlows from parFlow to step
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parFlow, ParallelStep.class,
								"invokedFlows").contains(step));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, parFlow,
						useCase, flow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_20(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_parFlow_flows_421403 = null;
		Iterator fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_69925 = null;
		ParallelStep __DEC_parFlow_invokedFlows_69925 = null;
		Match match = null;
		Flow flow = null;
		Iterator fujaba__IterParFlowToStep = null;
		ParallelStep step = null;
		ParallelFlow parFlow = null;
		UseCase useCase = null;

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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object parFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parFlow = (ParallelFlow) _TmpObject;

			// check link flows from parFlow to useCase
			JavaSDM.ensure(useCase.equals(parFlow.eContainer()));

			// iterate to-many link invokedFlows from parFlow to step
			fujaba__Success = false;

			fujaba__IterParFlowToStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							parFlow, ParallelStep.class, "invokedFlows"))
					.iterator();

			while (fujaba__IterParFlowToStep.hasNext()) {
				try {
					step = (ParallelStep) fujaba__IterParFlowToStep.next();

					// check object step is really bound
					JavaSDM.ensure(step != null);
					// bind object
					flow = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// check if contained via correct reference
					JavaSDM.ensure(flow.getSteps().contains(step));

					// check isomorphic binding between objects parFlow and flow 
					JavaSDM.ensure(!parFlow.equals(flow));

					// check link flows from flow to useCase
					JavaSDM.ensure(useCase.equals(flow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_parFlow_flows_421403 = parFlow.eContainer() instanceof UseCase ? (UseCase) parFlow
									.eContainer() : null;

							// check object __DEC_parFlow_flows_421403 is really bound
							JavaSDM.ensure(__DEC_parFlow_flows_421403 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_parFlow_flows_421403
									.getFlows().contains(parFlow));

							// check isomorphic binding between objects __DEC_parFlow_flows_421403 and useCase 
							JavaSDM.ensure(!__DEC_parFlow_flows_421403
									.equals(useCase));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link ref from parFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parFlow,
										AlternativeFlowAlternative.class, "ref")
								.size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link invokedFlows from parFlow to __DEC_parFlow_invokedFlows_69925
							fujaba__Success = false;

							fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_69925 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(parFlow,
													ParallelStep.class,
													"invokedFlows")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_69925
											.hasNext()) {
								try {
									__DEC_parFlow_invokedFlows_69925 = (ParallelStep) fujaba__IterParFlowTo__DEC_parFlow_invokedFlows_69925
											.next();

									// check object __DEC_parFlow_invokedFlows_69925 is really bound
									JavaSDM.ensure(__DEC_parFlow_invokedFlows_69925 != null);
									// check isomorphic binding between objects __DEC_parFlow_invokedFlows_69925 and step 
									JavaSDM.ensure(!__DEC_parFlow_invokedFlows_69925
											.equals(step));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flows is really bound
						JavaSDM.ensure(_edge_flows != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object parFlow is really bound
						JavaSDM.ensure(parFlow != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects parFlow and flow 
						JavaSDM.ensure(!parFlow.equals(flow));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link flows from parFlow to useCase
						JavaSDM.ensure(useCase.equals(parFlow.eContainer()));

						// check link src from _edge_flows to useCase
						JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link trg from _edge_flows to parFlow
						JavaSDM.ensure(parFlow.equals(_edge_flows.getTrg()));

						// check link invokedFlows from parFlow to step
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parFlow,
										ParallelStep.class, "invokedFlows")
								.contains(step));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								parFlow, useCase, flow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_77(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_898335 = null;
		InteractionOperand __DEC_guard_guard_790769 = null;
		CombinedFragment __DEC_operand_operand_504530 = null;
		Constraint __DEC_spec_specification_915226 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from operand
				JavaSDM.ensure(operand.getEnclosingInteraction() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_fragment_898335 = operand
							.getEnclosingOperand();

					// check object __DEC_operand_fragment_898335 is really bound
					JavaSDM.ensure(__DEC_operand_fragment_898335 != null);

					// check isomorphic binding between objects __DEC_operand_fragment_898335 and operand 
					JavaSDM.ensure(!__DEC_operand_fragment_898335
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
					__DEC_guard_guard_790769 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
							.eContainer() : null;

					// check object __DEC_guard_guard_790769 is really bound
					JavaSDM.ensure(__DEC_guard_guard_790769 != null);

					// check if contained via correct reference
					JavaSDM.ensure(guard.equals(__DEC_guard_guard_790769
							.getGuard()));

					// check isomorphic binding between objects __DEC_guard_guard_790769 and operand 
					JavaSDM.ensure(!__DEC_guard_guard_790769.equals(operand));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_operand_504530 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object __DEC_operand_operand_504530 is really bound
					JavaSDM.ensure(__DEC_operand_operand_504530 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_operand_operand_504530.getOperand()
							.contains(operand));

					// check isomorphic binding between objects __DEC_operand_operand_504530 and combo 
					JavaSDM.ensure(!__DEC_operand_operand_504530.equals(combo));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_spec_specification_915226 = spec.eContainer() instanceof Constraint ? (Constraint) spec
							.eContainer() : null;

					// check object __DEC_spec_specification_915226 is really bound
					JavaSDM.ensure(__DEC_spec_specification_915226 != null);

					// check if contained via correct reference
					JavaSDM.ensure(spec.equals(__DEC_spec_specification_915226
							.getSpecification()));

					// check isomorphic binding between objects __DEC_spec_specification_915226 and guard 
					JavaSDM.ensure(!__DEC_spec_specification_915226
							.equals(guard));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check object _edge_guard is really bound
				JavaSDM.ensure(_edge_guard != null);
				// check object combo is really bound
				JavaSDM.ensure(combo != null);
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check link guard from operand to guard
				JavaSDM.ensure(guard.equals(operand.getGuard()));

				// check link operand from operand to combo
				JavaSDM.ensure(combo.equals(operand.eContainer()));

				// check link specification from spec to guard
				JavaSDM.ensure(guard.equals(spec.eContainer()));

				// check link src from _edge_guard to operand
				JavaSDM.ensure(operand.equals(_edge_guard.getSrc()));

				// check link trg from _edge_guard to guard
				JavaSDM.ensure(guard.equals(_edge_guard.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, combo, operand,
						guard, spec);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_78(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_839548 = null;
		InteractionOperand __DEC_guard_guard_381504 = null;
		CombinedFragment __DEC_operand_operand_844245 = null;
		Constraint __DEC_spec_specification_365032 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from operand
				JavaSDM.ensure(operand.getEnclosingInteraction() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_fragment_839548 = operand
							.getEnclosingOperand();

					// check object __DEC_operand_fragment_839548 is really bound
					JavaSDM.ensure(__DEC_operand_fragment_839548 != null);

					// check isomorphic binding between objects __DEC_operand_fragment_839548 and operand 
					JavaSDM.ensure(!__DEC_operand_fragment_839548
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
					__DEC_guard_guard_381504 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
							.eContainer() : null;

					// check object __DEC_guard_guard_381504 is really bound
					JavaSDM.ensure(__DEC_guard_guard_381504 != null);

					// check if contained via correct reference
					JavaSDM.ensure(guard.equals(__DEC_guard_guard_381504
							.getGuard()));

					// check isomorphic binding between objects __DEC_guard_guard_381504 and operand 
					JavaSDM.ensure(!__DEC_guard_guard_381504.equals(operand));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_operand_844245 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object __DEC_operand_operand_844245 is really bound
					JavaSDM.ensure(__DEC_operand_operand_844245 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_operand_operand_844245.getOperand()
							.contains(operand));

					// check isomorphic binding between objects __DEC_operand_operand_844245 and combo 
					JavaSDM.ensure(!__DEC_operand_operand_844245.equals(combo));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_spec_specification_365032 = spec.eContainer() instanceof Constraint ? (Constraint) spec
							.eContainer() : null;

					// check object __DEC_spec_specification_365032 is really bound
					JavaSDM.ensure(__DEC_spec_specification_365032 != null);

					// check if contained via correct reference
					JavaSDM.ensure(spec.equals(__DEC_spec_specification_365032
							.getSpecification()));

					// check isomorphic binding between objects __DEC_spec_specification_365032 and guard 
					JavaSDM.ensure(!__DEC_spec_specification_365032
							.equals(guard));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check link fragment from operand to operand
				JavaSDM.ensure(!(operand.equals(operand.getEnclosingOperand())));

				// check object _edge_specification is really bound
				JavaSDM.ensure(_edge_specification != null);
				// check object combo is really bound
				JavaSDM.ensure(combo != null);
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// check link guard from operand to guard
				JavaSDM.ensure(guard.equals(operand.getGuard()));

				// check link operand from operand to combo
				JavaSDM.ensure(combo.equals(operand.eContainer()));

				// check link specification from spec to guard
				JavaSDM.ensure(guard.equals(spec.eContainer()));

				// check link src from _edge_specification to guard
				JavaSDM.ensure(guard.equals(_edge_specification.getSrc()));

				// check link trg from _edge_specification to spec
				JavaSDM.ensure(spec.equals(_edge_specification.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, combo, operand,
						guard, spec);
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
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_PARALLELFLOW_USECASE_FLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(ParallelStep) arguments.get(2),
					(ParallelStepToCombinedFragment) arguments.get(3),
					(ParallelFlow) arguments.get(4),
					(UseCase) arguments.get(5), (Flow) arguments.get(6));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_USECASE_FLOW_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(ParallelStep) arguments.get(2),
					(ParallelStepToCombinedFragment) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_76((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_20((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_77((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_78((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelFlowToOperandRuleImpl
