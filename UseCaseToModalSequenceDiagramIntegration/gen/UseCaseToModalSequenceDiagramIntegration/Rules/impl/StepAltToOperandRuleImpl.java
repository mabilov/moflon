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

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule;

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
 * An implementation of the model object '<em><b>Step Alt To Operand Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StepAltToOperandRuleImpl extends AbstractRuleImpl implements
		StepAltToOperandRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepAltToOperandRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getStepAltToOperandRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCase_flows_altFlow = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_step = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

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
					altFlow, flow, useCase));

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

				// create object __useCase_flows_altFlow
				__useCase_flows_altFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_stepAlternative_alt
				__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __alt_ref_altFlow
				__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __step_stepAlternative_alt
				__step_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __alt_ref_altFlow
				__alt_ref_altFlow.setName("ref");
				// assign attribute __useCase_flows_altFlow
				__useCase_flows_altFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						altFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_altFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_stepAlternative_alt, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_altFlow, "toBeTranslatedEdges");

				// create link
				__step_stepAlternative_alt.setSrc(step);

				// create link
				__step_stepAlternative_alt.setTrg(alt);

				// create link
				__alt_ref_altFlow.setSrc(alt);

				// create link
				__alt_ref_altFlow.setTrg(altFlow);

				// create link
				__useCase_flows_altFlow.setTrg(altFlow);

				// create link
				__useCase_flows_altFlow.setSrc(useCase);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

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

				// create object __flow_steps_step
				__flow_steps_step = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __flow_steps_step
				__flow_steps_step.setName("steps");
				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_step, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "contextNodes");

				// create link
				__flow_steps_step.setTrg(step);

				// create link
				__flow_steps_step.setSrc(flow);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, step, alt, altFlow, flow,
					useCase);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		CombinedFragment combo = null;
		Flow flow = null;
		Lifeline line = null;
		NormalStep step = null;
		NormalStepToCombinedFragment stepToCombo = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		InteractionOperand operand = null;
		StepAlternativeToInteractionOperand altToOperand = null;
		InteractionConstraint guard = null;
		LiteralString spec = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge operand__covered__line = null;
		EMoflonEdge altToOperand__target__operand = null;
		EMoflonEdge line__coveredBy__operand = null;
		EMoflonEdge combo__operand__operand = null;
		EMoflonEdge __useCase_flows_altFlow = null;
		EMoflonEdge altToOperand__source__alt = null;
		EMoflonEdge operand__guard__guard = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge guard__specification__spec = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("altFlow"));

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("combo"));

			// ensure correct type and really bound of object combo
			JavaSDM.ensure(_TmpObject instanceof CombinedFragment);
			combo = (CombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("stepToCombo"));

			// ensure correct type and really bound of object stepToCombo
			JavaSDM.ensure(_TmpObject instanceof NormalStepToCombinedFragment);
			stepToCombo = (NormalStepToCombinedFragment) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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

			// create object altToOperand
			altToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// create object guard
			guard = ModalSequenceDiagramFactory.eINSTANCE
					.createInteractionConstraint();

			// create object spec
			spec = ModalSequenceDiagramFactory.eINSTANCE.createLiteralString();

			// assign attribute guard
			guard.setName((java.lang.String) csp.getValue("guard", "name"));
			// assign attribute spec
			spec.setValue((java.lang.String) csp.getValue("spec", "value"));

			// create link
			combo.getOperand().add(operand); // add link

			// create link
			altToOperand.setSource(alt);

			// create link
			operand.setGuard(guard); // add link to one

			// create link
			line.getCoveredBy().add(operand);

			// create link
			altToOperand.setTarget(operand);

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
			// check object altToOperand is really bound
			JavaSDM.ensure(altToOperand != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					spec, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altToOperand is really bound
			JavaSDM.ensure(altToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects altFlow and alt 
			JavaSDM.ensure(!altFlow.equals(alt));

			// check isomorphic binding between objects altToOperand and alt 
			JavaSDM.ensure(!altToOperand.equals(alt));

			// check isomorphic binding between objects combo and alt 
			JavaSDM.ensure(!combo.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

			// check isomorphic binding between objects operand and alt 
			JavaSDM.ensure(!operand.equals(alt));

			// check isomorphic binding between objects spec and alt 
			JavaSDM.ensure(!spec.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects stepToCombo and alt 
			JavaSDM.ensure(!stepToCombo.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects altToOperand and altFlow 
			JavaSDM.ensure(!altToOperand.equals(altFlow));

			// check isomorphic binding between objects combo and altFlow 
			JavaSDM.ensure(!combo.equals(altFlow));

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

			// check isomorphic binding between objects operand and altFlow 
			JavaSDM.ensure(!operand.equals(altFlow));

			// check isomorphic binding between objects spec and altFlow 
			JavaSDM.ensure(!spec.equals(altFlow));

			// check isomorphic binding between objects step and altFlow 
			JavaSDM.ensure(!step.equals(altFlow));

			// check isomorphic binding between objects stepToCombo and altFlow 
			JavaSDM.ensure(!stepToCombo.equals(altFlow));

			// check isomorphic binding between objects useCase and altFlow 
			JavaSDM.ensure(!useCase.equals(altFlow));

			// check isomorphic binding between objects combo and altToOperand 
			JavaSDM.ensure(!combo.equals(altToOperand));

			// check isomorphic binding between objects flow and altToOperand 
			JavaSDM.ensure(!flow.equals(altToOperand));

			// check isomorphic binding between objects guard and altToOperand 
			JavaSDM.ensure(!guard.equals(altToOperand));

			// check isomorphic binding between objects line and altToOperand 
			JavaSDM.ensure(!line.equals(altToOperand));

			// check isomorphic binding between objects operand and altToOperand 
			JavaSDM.ensure(!operand.equals(altToOperand));

			// check isomorphic binding between objects spec and altToOperand 
			JavaSDM.ensure(!spec.equals(altToOperand));

			// check isomorphic binding between objects step and altToOperand 
			JavaSDM.ensure(!step.equals(altToOperand));

			// check isomorphic binding between objects stepToCombo and altToOperand 
			JavaSDM.ensure(!stepToCombo.equals(altToOperand));

			// check isomorphic binding between objects useCase and altToOperand 
			JavaSDM.ensure(!useCase.equals(altToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

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

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects operand and line 
			JavaSDM.ensure(!operand.equals(line));

			// check isomorphic binding between objects spec and line 
			JavaSDM.ensure(!spec.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToCombo and line 
			JavaSDM.ensure(!stepToCombo.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

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

			// create object operand__covered__line
			operand__covered__line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altToOperand__target__operand
			altToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object line__coveredBy__operand
			line__coveredBy__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object combo__operand__operand
			combo__operand__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_altFlow
			__useCase_flows_altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altToOperand__source__alt
			altToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object operand__guard__guard
			operand__guard__guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_altFlow
			__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object __step_stepAlternative_alt
			__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object guard__specification__spec
			guard__specification__spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("StepAltToOperandRule");
			// assign attribute combo__operand__operand
			combo__operand__operand.setName("operand");
			// assign attribute __step_stepAlternative_alt
			__step_stepAlternative_alt.setName("stepAlternative");
			// assign attribute __alt_ref_altFlow
			__alt_ref_altFlow.setName("ref");
			// assign attribute operand__guard__guard
			operand__guard__guard.setName("guard");
			// assign attribute line__coveredBy__operand
			line__coveredBy__operand.setName("coveredBy");
			// assign attribute operand__covered__line
			operand__covered__line.setName("covered");
			// assign attribute altToOperand__source__alt
			altToOperand__source__alt.setName("source");
			// assign attribute altToOperand__target__operand
			altToOperand__target__operand.setName("target");
			// assign attribute guard__specification__spec
			guard__specification__spec.setName("specification");
			// assign attribute __useCase_flows_altFlow
			__useCase_flows_altFlow.setName("flows");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__covered__line, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					line__coveredBy__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					combo__operand__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand__guard__guard, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_altFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__step_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					guard__specification__spec, "createdEdges");

			// create link
			combo__operand__operand.setSrc(combo);

			// create link
			__step_stepAlternative_alt.setSrc(step);

			// create link
			altToOperand__source__alt.setTrg(alt);

			// create link
			__alt_ref_altFlow.setSrc(alt);

			// create link
			__step_stepAlternative_alt.setTrg(alt);

			// create link
			line__coveredBy__operand.setTrg(operand);

			// create link
			operand__covered__line.setSrc(operand);

			// create link
			altToOperand__target__operand.setTrg(operand);

			// create link
			combo__operand__operand.setTrg(operand);

			// create link
			operand__guard__guard.setSrc(operand);

			// create link
			altToOperand__source__alt.setSrc(altToOperand);

			// create link
			altToOperand__target__operand.setSrc(altToOperand);

			// create link
			operand__guard__guard.setTrg(guard);

			// create link
			guard__specification__spec.setSrc(guard);

			// create link
			guard__specification__spec.setTrg(spec);

			// create link
			__alt_ref_altFlow.setTrg(altFlow);

			// create link
			__useCase_flows_altFlow.setTrg(altFlow);

			// create link
			__useCase_flows_altFlow.setSrc(useCase);

			// create link
			operand__covered__line.setTrg(line);

			// create link
			line__coveredBy__operand.setSrc(line);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, combo, step, stepToCombo, alt,
				operand, altToOperand, guard, spec, altFlow, flow, useCase,
				line);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		Flow flow = null;
		NormalStep step = null;
		UseCase useCase = null;
		EMoflonEdge __stepToCombo_target_combo = null;
		EMoflonEdge __combo_covered_line = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __stepToCombo_source_step = null;
		EMoflonEdge __alt_ref_altFlow = null;
		EMoflonEdge __useCase_flows_altFlow = null;
		EMoflonEdge __useCase_flows_flow = null;
		CSP csp = null;
		Iterator fujaba__IterComboToLine = null;
		Lifeline line = null;
		CombinedFragment combo = null;
		Iterator fujaba__IterStepToStepToCombo = null;
		NormalStepToCombinedFragment stepToCombo = null;

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
			ruleresult.setRule("StepAltToOperandRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

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

			// iterate to-many link source from step to stepToCombo
			fujaba__Success = false;

			fujaba__IterStepToStepToCombo = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(step,
							NormalStepToCombinedFragment.class, "source"))
					.iterator();

			while (fujaba__IterStepToStepToCombo.hasNext()) {
				try {
					stepToCombo = (NormalStepToCombinedFragment) fujaba__IterStepToStepToCombo
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

						// check object alt is really bound
						JavaSDM.ensure(alt != null);
						// check object altFlow is really bound
						JavaSDM.ensure(altFlow != null);
						// check object combo is really bound
						JavaSDM.ensure(combo != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object step is really bound
						JavaSDM.ensure(step != null);
						// check object stepToCombo is really bound
						JavaSDM.ensure(stepToCombo != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects flow and altFlow 
						JavaSDM.ensure(!flow.equals(altFlow));

						// check link ref from alt to altFlow
						JavaSDM.ensure(altFlow.equals(alt.getRef()));

						// check link flows from altFlow to useCase
						JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link source from stepToCombo to step
						JavaSDM.ensure(step.equals(stepToCombo.getSource()));

						// check link stepAlternative from alt to step
						JavaSDM.ensure(step.equals(alt.eContainer()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link target from stepToCombo to combo
						JavaSDM.ensure(combo.equals(stepToCombo.getTarget()));

						// iterate to-many link covered from combo to line
						fujaba__Success = false;

						fujaba__IterComboToLine = new ArrayList(
								combo.getCovered()).iterator();

						while (fujaba__IterComboToLine.hasNext()) {
							try {
								line = (Lifeline) fujaba__IterComboToLine
										.next();

								// check object line is really bound
								JavaSDM.ensure(line != null);
								// create object __stepToCombo_target_combo
								__stepToCombo_target_combo = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __combo_covered_line
								__combo_covered_line = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __line_coveredBy_combo
								__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __step_stepAlternative_alt
								__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __flow_steps_step
								__flow_steps_step = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __stepToCombo_source_step
								__stepToCombo_source_step = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __alt_ref_altFlow
								__alt_ref_altFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCase_flows_altFlow
								__useCase_flows_altFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCase_flows_flow
								__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __line_coveredBy_combo
								__line_coveredBy_combo.setName("coveredBy");
								// assign attribute __combo_covered_line
								__combo_covered_line.setName("covered");
								// assign attribute __step_stepAlternative_alt
								__step_stepAlternative_alt
										.setName("stepAlternative");
								// assign attribute __stepToCombo_source_step
								__stepToCombo_source_step.setName("source");
								// assign attribute __stepToCombo_target_combo
								__stepToCombo_target_combo.setName("target");
								// assign attribute __alt_ref_altFlow
								__alt_ref_altFlow.setName("ref");
								// assign attribute __flow_steps_step
								__flow_steps_step.setName("steps");
								// assign attribute __useCase_flows_flow
								__useCase_flows_flow.setName("flows");
								// assign attribute __useCase_flows_altFlow
								__useCase_flows_altFlow.setName("flows");

								// create link
								__stepToCombo_target_combo.setTrg(combo);

								// create link
								__combo_covered_line.setSrc(combo);

								// create link
								isApplicableMatch.getAllContextElements().add(
										combo);

								// create link
								__line_coveredBy_combo.setTrg(combo);

								// create link
								isApplicableMatch.getAllContextElements().add(
										step);

								// create link
								__step_stepAlternative_alt.setSrc(step);

								// create link
								__flow_steps_step.setTrg(step);

								// create link
								__stepToCombo_source_step.setTrg(step);

								// create link
								__stepToCombo_source_step.setSrc(stepToCombo);

								// create link
								isApplicableMatch.getAllContextElements().add(
										stepToCombo);

								// create link
								__stepToCombo_target_combo.setSrc(stepToCombo);

								// create link
								__step_stepAlternative_alt.setTrg(alt);

								// create link
								isApplicableMatch.getAllContextElements().add(
										alt);

								// create link
								__alt_ref_altFlow.setSrc(alt);

								// create link
								__alt_ref_altFlow.setTrg(altFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										altFlow);

								// create link
								__useCase_flows_altFlow.setTrg(altFlow);

								// create link
								__flow_steps_step.setSrc(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__useCase_flows_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								__useCase_flows_flow.setSrc(useCase);

								// create link
								__useCase_flows_altFlow.setSrc(useCase);

								// create link
								__line_coveredBy_combo.setSrc(line);

								// create link
								__combo_covered_line.setTrg(line);

								// create link
								isApplicableMatch.getAllContextElements().add(
										line);

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
												__combo_covered_line,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__stepToCombo_target_combo,
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
												__stepToCombo_source_step,
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
												__useCase_flows_flow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__useCase_flows_altFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__line_coveredBy_combo,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch, combo,
													step, stepToCombo, alt,
													altFlow, flow, useCase,
													line));

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
												.setRuleName("StepAltToOperandRule");
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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
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
			CombinedFragment combo, NormalStep step,
			NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", true, csp);
		var_altFlow_name.setValue(altFlow.getName());
		var_altFlow_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_alt_condition, var_spec_value);
		eq_0.setRuleName("");
		eq_0.solve(var_altFlow_name, var_guard_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("altFlow", altFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("line", line);
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
			EObject combo, EObject step, EObject stepToCombo, EObject alt,
			EObject operand, EObject altToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject flow, EObject useCase, EObject line) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("altToOperand", altToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
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
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __combo_covered_line = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
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
					operand, guard, spec, line));

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
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// create object __line_coveredBy_operand
				__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_guard_guard
				__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __guard_specification_spec
				__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __operand_covered_line
				__operand_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_operand_operand
				__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __combo_operand_operand
				__combo_operand_operand.setName("operand");
				// assign attribute __operand_guard_guard
				__operand_guard_guard.setName("guard");
				// assign attribute __line_coveredBy_operand
				__line_coveredBy_operand.setName("coveredBy");
				// assign attribute __operand_covered_line
				__operand_covered_line.setName("covered");
				// assign attribute __guard_specification_spec
				__guard_specification_spec.setName("specification");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_operand, "toBeTranslatedEdges");

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
						__operand_guard_guard, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__guard_specification_spec, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__operand_covered_line, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_operand_operand, "toBeTranslatedEdges");

				// create link
				__combo_operand_operand.setSrc(combo);

				// create link
				__operand_covered_line.setSrc(operand);

				// create link
				__operand_guard_guard.setSrc(operand);

				// create link
				__line_coveredBy_operand.setTrg(operand);

				// create link
				__combo_operand_operand.setTrg(operand);

				// create link
				__guard_specification_spec.setSrc(guard);

				// create link
				__operand_guard_guard.setTrg(guard);

				// create link
				__guard_specification_spec.setTrg(spec);

				// create link
				__line_coveredBy_operand.setSrc(line);

				// create link
				__operand_covered_line.setTrg(line);

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
				// check object line is really bound
				JavaSDM.ensure(line != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object operand is really bound
				JavaSDM.ensure(operand != null);
				// check object spec is really bound
				JavaSDM.ensure(spec != null);
				// create object __line_coveredBy_combo
				__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __combo_covered_line
				__combo_covered_line = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __line_coveredBy_combo
				__line_coveredBy_combo.setName("coveredBy");
				// assign attribute __combo_covered_line
				__combo_covered_line.setName("covered");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						combo, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						line, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__line_coveredBy_combo, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__combo_covered_line, "contextEdges");

				// create link
				__line_coveredBy_combo.setTrg(combo);

				// create link
				__combo_covered_line.setSrc(combo);

				// create link
				__line_coveredBy_combo.setSrc(line);

				// create link
				__combo_covered_line.setTrg(line);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, combo, operand, guard, spec,
					line);
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
		Lifeline line = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		NormalStep step = null;
		NormalStepToCombinedFragment stepToCombo = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
		StepAlternativeToInteractionOperand altToOperand = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge alt__ref__altFlow = null;
		EMoflonEdge altToOperand__target__operand = null;
		EMoflonEdge altToOperand__source__alt = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge useCase__flows__altFlow = null;
		EMoflonEdge step__stepAlternative__alt = null;

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
			_TmpObject = (isApplicableMatch.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
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
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("stepToCombo"));

			// ensure correct type and really bound of object stepToCombo
			JavaSDM.ensure(_TmpObject instanceof NormalStepToCombinedFragment);
			stepToCombo = (NormalStepToCombinedFragment) _TmpObject;
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
			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object altFlow
			altFlow = UseCaseDSLFactory.eINSTANCE.createAlternativeFlow();

			// create object altToOperand
			altToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createStepAlternativeToInteractionOperand();

			// assign attribute alt
			alt.setCondition((java.lang.String) csp
					.getValue("alt", "condition"));
			// assign attribute altFlow
			altFlow.setName((java.lang.String) csp.getValue("altFlow", "name"));

			// create link
			step.getStepAlternative().add(alt); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt, altFlow,
					"ref");

			// create link
			altToOperand.setSource(alt);

			// create link
			altToOperand.setTarget(operand);

			// create link
			useCase.getFlows().add(altFlow);

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
			// check object altToOperand is really bound
			JavaSDM.ensure(altToOperand != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object operand is really bound
			JavaSDM.ensure(operand != null);
			// check object spec is really bound
			JavaSDM.ensure(spec != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					operand, "translatedElements");

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
					guard, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object altFlow is really bound
			JavaSDM.ensure(altFlow != null);
			// check object altToOperand is really bound
			JavaSDM.ensure(altToOperand != null);
			// check object combo is really bound
			JavaSDM.ensure(combo != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object guard is really bound
			JavaSDM.ensure(guard != null);
			// check object line is really bound
			JavaSDM.ensure(line != null);
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
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects altFlow and alt 
			JavaSDM.ensure(!altFlow.equals(alt));

			// check isomorphic binding between objects altToOperand and alt 
			JavaSDM.ensure(!altToOperand.equals(alt));

			// check isomorphic binding between objects combo and alt 
			JavaSDM.ensure(!combo.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects guard and alt 
			JavaSDM.ensure(!guard.equals(alt));

			// check isomorphic binding between objects line and alt 
			JavaSDM.ensure(!line.equals(alt));

			// check isomorphic binding between objects operand and alt 
			JavaSDM.ensure(!operand.equals(alt));

			// check isomorphic binding between objects spec and alt 
			JavaSDM.ensure(!spec.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects stepToCombo and alt 
			JavaSDM.ensure(!stepToCombo.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects altToOperand and altFlow 
			JavaSDM.ensure(!altToOperand.equals(altFlow));

			// check isomorphic binding between objects combo and altFlow 
			JavaSDM.ensure(!combo.equals(altFlow));

			// check isomorphic binding between objects flow and altFlow 
			JavaSDM.ensure(!flow.equals(altFlow));

			// check isomorphic binding between objects guard and altFlow 
			JavaSDM.ensure(!guard.equals(altFlow));

			// check isomorphic binding between objects line and altFlow 
			JavaSDM.ensure(!line.equals(altFlow));

			// check isomorphic binding between objects operand and altFlow 
			JavaSDM.ensure(!operand.equals(altFlow));

			// check isomorphic binding between objects spec and altFlow 
			JavaSDM.ensure(!spec.equals(altFlow));

			// check isomorphic binding between objects step and altFlow 
			JavaSDM.ensure(!step.equals(altFlow));

			// check isomorphic binding between objects stepToCombo and altFlow 
			JavaSDM.ensure(!stepToCombo.equals(altFlow));

			// check isomorphic binding between objects useCase and altFlow 
			JavaSDM.ensure(!useCase.equals(altFlow));

			// check isomorphic binding between objects combo and altToOperand 
			JavaSDM.ensure(!combo.equals(altToOperand));

			// check isomorphic binding between objects flow and altToOperand 
			JavaSDM.ensure(!flow.equals(altToOperand));

			// check isomorphic binding between objects guard and altToOperand 
			JavaSDM.ensure(!guard.equals(altToOperand));

			// check isomorphic binding between objects line and altToOperand 
			JavaSDM.ensure(!line.equals(altToOperand));

			// check isomorphic binding between objects operand and altToOperand 
			JavaSDM.ensure(!operand.equals(altToOperand));

			// check isomorphic binding between objects spec and altToOperand 
			JavaSDM.ensure(!spec.equals(altToOperand));

			// check isomorphic binding between objects step and altToOperand 
			JavaSDM.ensure(!step.equals(altToOperand));

			// check isomorphic binding between objects stepToCombo and altToOperand 
			JavaSDM.ensure(!stepToCombo.equals(altToOperand));

			// check isomorphic binding between objects useCase and altToOperand 
			JavaSDM.ensure(!useCase.equals(altToOperand));

			// check isomorphic binding between objects flow and combo 
			JavaSDM.ensure(!flow.equals(combo));

			// check isomorphic binding between objects guard and combo 
			JavaSDM.ensure(!guard.equals(combo));

			// check isomorphic binding between objects line and combo 
			JavaSDM.ensure(!line.equals(combo));

			// check isomorphic binding between objects operand and combo 
			JavaSDM.ensure(!operand.equals(combo));

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

			// check isomorphic binding between objects line and flow 
			JavaSDM.ensure(!line.equals(flow));

			// check isomorphic binding between objects operand and flow 
			JavaSDM.ensure(!operand.equals(flow));

			// check isomorphic binding between objects spec and flow 
			JavaSDM.ensure(!spec.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects stepToCombo and flow 
			JavaSDM.ensure(!stepToCombo.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects line and guard 
			JavaSDM.ensure(!line.equals(guard));

			// check isomorphic binding between objects operand and guard 
			JavaSDM.ensure(!operand.equals(guard));

			// check isomorphic binding between objects spec and guard 
			JavaSDM.ensure(!spec.equals(guard));

			// check isomorphic binding between objects step and guard 
			JavaSDM.ensure(!step.equals(guard));

			// check isomorphic binding between objects stepToCombo and guard 
			JavaSDM.ensure(!stepToCombo.equals(guard));

			// check isomorphic binding between objects useCase and guard 
			JavaSDM.ensure(!useCase.equals(guard));

			// check isomorphic binding between objects operand and line 
			JavaSDM.ensure(!operand.equals(line));

			// check isomorphic binding between objects spec and line 
			JavaSDM.ensure(!spec.equals(line));

			// check isomorphic binding between objects step and line 
			JavaSDM.ensure(!step.equals(line));

			// check isomorphic binding between objects stepToCombo and line 
			JavaSDM.ensure(!stepToCombo.equals(line));

			// check isomorphic binding between objects useCase and line 
			JavaSDM.ensure(!useCase.equals(line));

			// check isomorphic binding between objects spec and operand 
			JavaSDM.ensure(!spec.equals(operand));

			// check isomorphic binding between objects step and operand 
			JavaSDM.ensure(!step.equals(operand));

			// check isomorphic binding between objects stepToCombo and operand 
			JavaSDM.ensure(!stepToCombo.equals(operand));

			// check isomorphic binding between objects useCase and operand 
			JavaSDM.ensure(!useCase.equals(operand));

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

			// create object alt__ref__altFlow
			alt__ref__altFlow = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();

			// create object altToOperand__target__operand
			altToOperand__target__operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object altToOperand__source__alt
			altToOperand__source__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_guard_guard
			__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __combo_operand_operand
			__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __line_coveredBy_operand
			__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __operand_covered_line
			__operand_covered_line = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __guard_specification_spec
			__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__altFlow
			useCase__flows__altFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object step__stepAlternative__alt
			step__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("StepAltToOperandRule");
			// assign attribute __combo_operand_operand
			__combo_operand_operand.setName("operand");
			// assign attribute step__stepAlternative__alt
			step__stepAlternative__alt.setName("stepAlternative");
			// assign attribute alt__ref__altFlow
			alt__ref__altFlow.setName("ref");
			// assign attribute __operand_guard_guard
			__operand_guard_guard.setName("guard");
			// assign attribute __line_coveredBy_operand
			__line_coveredBy_operand.setName("coveredBy");
			// assign attribute __operand_covered_line
			__operand_covered_line.setName("covered");
			// assign attribute altToOperand__source__alt
			altToOperand__source__alt.setName("source");
			// assign attribute altToOperand__target__operand
			altToOperand__target__operand.setName("target");
			// assign attribute __guard_specification_spec
			__guard_specification_spec.setName("specification");
			// assign attribute useCase__flows__altFlow
			useCase__flows__altFlow.setName("flows");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand__target__operand, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					altToOperand__source__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_guard_guard, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__combo_operand_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__line_coveredBy_operand, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__operand_covered_line, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__guard_specification_spec, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__altFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					step__stepAlternative__alt, "createdEdges");

			// create link
			__combo_operand_operand.setSrc(combo);

			// create link
			step__stepAlternative__alt.setSrc(step);

			// create link
			altToOperand__source__alt.setTrg(alt);

			// create link
			step__stepAlternative__alt.setTrg(alt);

			// create link
			alt__ref__altFlow.setSrc(alt);

			// create link
			__operand_covered_line.setSrc(operand);

			// create link
			altToOperand__target__operand.setTrg(operand);

			// create link
			__operand_guard_guard.setSrc(operand);

			// create link
			__combo_operand_operand.setTrg(operand);

			// create link
			__line_coveredBy_operand.setTrg(operand);

			// create link
			altToOperand__target__operand.setSrc(altToOperand);

			// create link
			altToOperand__source__alt.setSrc(altToOperand);

			// create link
			__operand_guard_guard.setTrg(guard);

			// create link
			__guard_specification_spec.setSrc(guard);

			// create link
			__guard_specification_spec.setTrg(spec);

			// create link
			alt__ref__altFlow.setTrg(altFlow);

			// create link
			useCase__flows__altFlow.setTrg(altFlow);

			// create link
			useCase__flows__altFlow.setSrc(useCase);

			// create link
			__line_coveredBy_operand.setSrc(line);

			// create link
			__operand_covered_line.setTrg(line);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, combo, step, stepToCombo, alt,
				operand, altToOperand, guard, spec, altFlow, flow, useCase,
				line);
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
		Lifeline line = null;
		InteractionOperand operand = null;
		LiteralString spec = null;
		EMoflonEdge __combo_covered_line = null;
		EMoflonEdge __combo_operand_operand = null;
		EMoflonEdge __line_coveredBy_combo = null;
		EMoflonEdge __stepToCombo_target_combo = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __stepToCombo_source_step = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __operand_guard_guard = null;
		EMoflonEdge __operand_covered_line = null;
		EMoflonEdge __line_coveredBy_operand = null;
		EMoflonEdge __guard_specification_spec = null;
		EMoflonEdge __useCase_flows_flow = null;
		CSP csp = null;
		UseCase useCase = null;
		Flow flow = null;
		NormalStep step = null;
		Iterator fujaba__IterComboToStepToCombo = null;
		NormalStepToCombinedFragment stepToCombo = null;

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
			ruleresult.setRule("StepAltToOperandRule");

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
			_TmpObject = (match.getObject("line"));

			// ensure correct type and really bound of object line
			JavaSDM.ensure(_TmpObject instanceof Lifeline);
			line = (Lifeline) _TmpObject;
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
							NormalStepToCombinedFragment.class, "target"))
					.iterator();

			while (fujaba__IterComboToStepToCombo.hasNext()) {
				try {
					stepToCombo = (NormalStepToCombinedFragment) fujaba__IterComboToStepToCombo
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
						// check object line is really bound
						JavaSDM.ensure(line != null);
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

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from line to operand
						JavaSDM.ensure(line.getCoveredBy().contains(operand));

						// create object __combo_covered_line
						__combo_covered_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __combo_operand_operand
						__combo_operand_operand = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_coveredBy_combo
						__line_coveredBy_combo = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __stepToCombo_target_combo
						__stepToCombo_target_combo = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __stepToCombo_source_step
						__stepToCombo_source_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __flow_steps_step
						__flow_steps_step = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __operand_guard_guard
						__operand_guard_guard = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __operand_covered_line
						__operand_covered_line = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __line_coveredBy_operand
						__line_coveredBy_operand = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __guard_specification_spec
						__guard_specification_spec = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_flow
						__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __combo_operand_operand
						__combo_operand_operand.setName("operand");
						// assign attribute __line_coveredBy_combo
						__line_coveredBy_combo.setName("coveredBy");
						// assign attribute __combo_covered_line
						__combo_covered_line.setName("covered");
						// assign attribute __stepToCombo_source_step
						__stepToCombo_source_step.setName("source");
						// assign attribute __stepToCombo_target_combo
						__stepToCombo_target_combo.setName("target");
						// assign attribute __operand_guard_guard
						__operand_guard_guard.setName("guard");
						// assign attribute __line_coveredBy_operand
						__line_coveredBy_operand.setName("coveredBy");
						// assign attribute __operand_covered_line
						__operand_covered_line.setName("covered");
						// assign attribute __guard_specification_spec
						__guard_specification_spec.setName("specification");
						// assign attribute __flow_steps_step
						__flow_steps_step.setName("steps");
						// assign attribute __useCase_flows_flow
						__useCase_flows_flow.setName("flows");

						// create link
						__combo_covered_line.setSrc(combo);

						// create link
						__combo_operand_operand.setSrc(combo);

						// create link
						__line_coveredBy_combo.setTrg(combo);

						// create link
						__stepToCombo_target_combo.setTrg(combo);

						// create link
						isApplicableMatch.getAllContextElements().add(combo);

						// create link
						__stepToCombo_source_step.setTrg(step);

						// create link
						__flow_steps_step.setTrg(step);

						// create link
						isApplicableMatch.getAllContextElements().add(step);

						// create link
						__stepToCombo_target_combo.setSrc(stepToCombo);

						// create link
						isApplicableMatch.getAllContextElements().add(
								stepToCombo);

						// create link
						__stepToCombo_source_step.setSrc(stepToCombo);

						// create link
						__combo_operand_operand.setTrg(operand);

						// create link
						__operand_guard_guard.setSrc(operand);

						// create link
						isApplicableMatch.getAllContextElements().add(operand);

						// create link
						__operand_covered_line.setSrc(operand);

						// create link
						__line_coveredBy_operand.setTrg(operand);

						// create link
						isApplicableMatch.getAllContextElements().add(guard);

						// create link
						__operand_guard_guard.setTrg(guard);

						// create link
						__guard_specification_spec.setSrc(guard);

						// create link
						__guard_specification_spec.setTrg(spec);

						// create link
						isApplicableMatch.getAllContextElements().add(spec);

						// create link
						__useCase_flows_flow.setTrg(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__flow_steps_step.setSrc(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__useCase_flows_flow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(line);

						// create link
						__line_coveredBy_combo.setSrc(line);

						// create link
						__operand_covered_line.setTrg(line);

						// create link
						__line_coveredBy_operand.setSrc(line);

						// create link
						__combo_covered_line.setTrg(line);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __line_coveredBy_operand,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __operand_covered_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __operand_guard_guard,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __guard_specification_spec,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_flow,
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

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __combo_covered_line,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __combo_operand_operand,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __line_coveredBy_combo,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, combo, step,
									stepToCombo, operand, guard, spec, flow,
									useCase, line));

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
										.setRuleName("StepAltToOperandRule");
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
			LiteralString spec, Lifeline line) {
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
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
			CombinedFragment combo, NormalStep step,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", true, csp);
		var_guard_name.setValue(guard.getName());
		var_guard_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_alt_condition, var_spec_value);
		eq_0.setRuleName("");
		eq_0.solve(var_altFlow_name, var_guard_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("guard", guard);
		isApplicableMatch.registerObject("spec", spec);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("line", line);
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
			EObject combo, EObject step, EObject stepToCombo, EObject alt,
			EObject operand, EObject altToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject flow, EObject useCase, EObject line) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("altToOperand", altToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("line", line);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_104(
			EMoflonEdge _edge_operand) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_493811 = null;
		InteractionOperand __DEC_guard_guard_84480 = null;
		CombinedFragment __DEC_operand_operand_984003 = null;
		Constraint __DEC_spec_specification_913567 = null;
		Match match = null;
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
					// check link covered from line to operand
					JavaSDM.ensure(line.getCoveredBy().contains(operand));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from operand
						JavaSDM.ensure(operand.getEnclosingInteraction() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_fragment_493811 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_493811 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_493811 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_493811 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_493811
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
							__DEC_guard_guard_84480 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_84480 is really bound
							JavaSDM.ensure(__DEC_guard_guard_84480 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard.equals(__DEC_guard_guard_84480
									.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_84480 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_84480
									.equals(operand));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_operand_984003 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_984003 is really bound
							JavaSDM.ensure(__DEC_operand_operand_984003 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_984003
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_984003 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_984003
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
							__DEC_spec_specification_913567 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_913567 is really bound
							JavaSDM.ensure(__DEC_spec_specification_913567 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_913567
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_913567 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_913567
									.equals(guard));

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
						// check object line is really bound
						JavaSDM.ensure(line != null);
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

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from line to operand
						JavaSDM.ensure(line.getCoveredBy().contains(operand));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, combo,
								operand, guard, spec, line);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_25(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_737883 = null;
		NormalStep __DEC_alt_stepAlternative_68381 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_247561 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_247561 = null;
		Match match = null;
		AlternativeFlow altFlow = null;
		AlternativeFlowAlternative alt = null;
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

			// check link flows from altFlow to useCase
			JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

			// check link stepAlternative from alt to step
			JavaSDM.ensure(step.equals(alt.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_737883 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_737883 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_737883 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_737883.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_737883 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_737883.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_68381 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_68381 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_68381 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_68381
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_68381 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_68381
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

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_247561
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_247561 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_247561
									.hasNext()) {
						try {
							__DEC_altFlow_ref_247561 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_247561
									.next();

							// check object __DEC_altFlow_ref_247561 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_247561 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_247561 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_247561
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

				// check link ref from alt to altFlow
				JavaSDM.ensure(altFlow.equals(alt.getRef()));

				// check link flows from altFlow to useCase
				JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_stepAlternative to step
				JavaSDM.ensure(step.equals(_edge_stepAlternative.getSrc()));

				// check link stepAlternative from alt to step
				JavaSDM.ensure(step.equals(alt.eContainer()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_stepAlternative to alt
				JavaSDM.ensure(alt.equals(_edge_stepAlternative.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, flow, useCase);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_26(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_990263 = null;
		NormalStep __DEC_alt_stepAlternative_667192 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_416647 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_416647 = null;
		Match match = null;
		UseCase useCase = null;
		Flow flow = null;
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

			// check link flows from altFlow to useCase
			JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

			// check link trg from _edge_ref to altFlow
			JavaSDM.ensure(altFlow.equals(_edge_ref.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_altFlow_flows_990263 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
							.eContainer() : null;

					// check object __DEC_altFlow_flows_990263 is really bound
					JavaSDM.ensure(__DEC_altFlow_flows_990263 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_altFlow_flows_990263.getFlows()
							.contains(altFlow));

					// check isomorphic binding between objects __DEC_altFlow_flows_990263 and useCase 
					JavaSDM.ensure(!__DEC_altFlow_flows_990263.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_alt_stepAlternative_667192 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object __DEC_alt_stepAlternative_667192 is really bound
					JavaSDM.ensure(__DEC_alt_stepAlternative_667192 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_alt_stepAlternative_667192
							.getStepAlternative().contains(alt));

					// check isomorphic binding between objects __DEC_alt_stepAlternative_667192 and step 
					JavaSDM.ensure(!__DEC_alt_stepAlternative_667192
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

					// iterate to-many link ref from altFlow to __DEC_altFlow_ref_416647
					fujaba__Success = false;

					fujaba__IterAltFlowTo__DEC_altFlow_ref_416647 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(altFlow,
											AlternativeFlowAlternative.class,
											"ref")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterAltFlowTo__DEC_altFlow_ref_416647
									.hasNext()) {
						try {
							__DEC_altFlow_ref_416647 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_416647
									.next();

							// check object __DEC_altFlow_ref_416647 is really bound
							JavaSDM.ensure(__DEC_altFlow_ref_416647 != null);
							// check isomorphic binding between objects __DEC_altFlow_ref_416647 and alt 
							JavaSDM.ensure(!__DEC_altFlow_ref_416647
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

				// check link ref from alt to altFlow
				JavaSDM.ensure(altFlow.equals(alt.getRef()));

				// check link flows from altFlow to useCase
				JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link src from _edge_ref to alt
				JavaSDM.ensure(alt.equals(_edge_ref.getSrc()));

				// check link stepAlternative from alt to step
				JavaSDM.ensure(step.equals(alt.eContainer()));

				// check link steps from step to flow
				JavaSDM.ensure(flow.equals(step.eContainer()));

				// check link trg from _edge_ref to altFlow
				JavaSDM.ensure(altFlow.equals(_edge_ref.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, step, alt,
						altFlow, flow, useCase);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_105(
			EMoflonEdge _edge_guard) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_362438 = null;
		InteractionOperand __DEC_guard_guard_971461 = null;
		CombinedFragment __DEC_operand_operand_235970 = null;
		Constraint __DEC_spec_specification_186702 = null;
		Match match = null;
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
					// check link covered from line to combo
					JavaSDM.ensure(line.getCoveredBy().contains(combo));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from operand
						JavaSDM.ensure(operand.getEnclosingInteraction() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_fragment_362438 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_362438 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_362438 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_362438 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_362438
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
							__DEC_guard_guard_971461 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_971461 is really bound
							JavaSDM.ensure(__DEC_guard_guard_971461 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard
									.equals(__DEC_guard_guard_971461.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_971461 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_971461
									.equals(operand));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_operand_235970 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_235970 is really bound
							JavaSDM.ensure(__DEC_operand_operand_235970 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_235970
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_235970 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_235970
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
							__DEC_spec_specification_186702 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_186702 is really bound
							JavaSDM.ensure(__DEC_spec_specification_186702 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_186702
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_186702 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_186702
									.equals(guard));

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
						// check object line is really bound
						JavaSDM.ensure(line != null);
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

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from line to operand
						JavaSDM.ensure(line.getCoveredBy().contains(operand));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, combo,
								operand, guard, spec, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_106(
			EMoflonEdge _edge_coveredBy) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_353499 = null;
		InteractionOperand __DEC_guard_guard_769704 = null;
		CombinedFragment __DEC_operand_operand_577762 = null;
		Constraint __DEC_spec_specification_592700 = null;
		Match match = null;
		LiteralString spec = null;
		CombinedFragment combo = null;
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

			// check link covered from line to operand
			JavaSDM.ensure(line.getCoveredBy().contains(operand));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from operand
				JavaSDM.ensure(operand.getEnclosingInteraction() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_fragment_353499 = operand
							.getEnclosingOperand();

					// check object __DEC_operand_fragment_353499 is really bound
					JavaSDM.ensure(__DEC_operand_fragment_353499 != null);

					// check isomorphic binding between objects __DEC_operand_fragment_353499 and operand 
					JavaSDM.ensure(!__DEC_operand_fragment_353499
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
					__DEC_guard_guard_769704 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
							.eContainer() : null;

					// check object __DEC_guard_guard_769704 is really bound
					JavaSDM.ensure(__DEC_guard_guard_769704 != null);

					// check if contained via correct reference
					JavaSDM.ensure(guard.equals(__DEC_guard_guard_769704
							.getGuard()));

					// check isomorphic binding between objects __DEC_guard_guard_769704 and operand 
					JavaSDM.ensure(!__DEC_guard_guard_769704.equals(operand));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_operand_operand_577762 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
							.eContainer() : null;

					// check object __DEC_operand_operand_577762 is really bound
					JavaSDM.ensure(__DEC_operand_operand_577762 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_operand_operand_577762.getOperand()
							.contains(operand));

					// check isomorphic binding between objects __DEC_operand_operand_577762 and combo 
					JavaSDM.ensure(!__DEC_operand_operand_577762.equals(combo));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_spec_specification_592700 = spec.eContainer() instanceof Constraint ? (Constraint) spec
							.eContainer() : null;

					// check object __DEC_spec_specification_592700 is really bound
					JavaSDM.ensure(__DEC_spec_specification_592700 != null);

					// check if contained via correct reference
					JavaSDM.ensure(spec.equals(__DEC_spec_specification_592700
							.getSpecification()));

					// check isomorphic binding between objects __DEC_spec_specification_592700 and guard 
					JavaSDM.ensure(!__DEC_spec_specification_592700
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

				// check object _edge_coveredBy is really bound
				JavaSDM.ensure(_edge_coveredBy != null);
				// check object combo is really bound
				JavaSDM.ensure(combo != null);
				// check object guard is really bound
				JavaSDM.ensure(guard != null);
				// check object line is really bound
				JavaSDM.ensure(line != null);
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

				// check link src from _edge_coveredBy to line
				JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

				// check link trg from _edge_coveredBy to operand
				JavaSDM.ensure(operand.equals(_edge_coveredBy.getTrg()));

				// check link covered from line to combo
				JavaSDM.ensure(line.getCoveredBy().contains(combo));

				// check link covered from line to operand
				JavaSDM.ensure(line.getCoveredBy().contains(operand));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, combo, operand,
						guard, spec, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_107(
			EMoflonEdge _edge_covered) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_329356 = null;
		InteractionOperand __DEC_guard_guard_394811 = null;
		CombinedFragment __DEC_operand_operand_197648 = null;
		Constraint __DEC_spec_specification_212139 = null;
		Match match = null;
		Iterator fujaba__IterOperandTo_edge_coveredBy = null;
		EMoflonEdge _edge_coveredBy = null;
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

			// check link covered from line to combo
			JavaSDM.ensure(line.getCoveredBy().contains(combo));

			// check link covered from line to operand
			JavaSDM.ensure(line.getCoveredBy().contains(operand));

			// iterate to-many link trg from operand to _edge_coveredBy
			fujaba__Success = false;

			fujaba__IterOperandTo_edge_coveredBy = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							operand, EMoflonEdge.class, "trg")).iterator();

			while (fujaba__IterOperandTo_edge_coveredBy.hasNext()) {
				try {
					_edge_coveredBy = (EMoflonEdge) fujaba__IterOperandTo_edge_coveredBy
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

						// negative check for link fragment from operand
						JavaSDM.ensure(operand.getEnclosingInteraction() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_fragment_329356 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_329356 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_329356 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_329356 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_329356
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
							__DEC_guard_guard_394811 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_394811 is really bound
							JavaSDM.ensure(__DEC_guard_guard_394811 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard
									.equals(__DEC_guard_guard_394811.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_394811 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_394811
									.equals(operand));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_operand_197648 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_197648 is really bound
							JavaSDM.ensure(__DEC_operand_operand_197648 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_197648
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_197648 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_197648
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
							__DEC_spec_specification_212139 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_212139 is really bound
							JavaSDM.ensure(__DEC_spec_specification_212139 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_212139
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_212139 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_212139
									.equals(guard));

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
						// check object line is really bound
						JavaSDM.ensure(line != null);
						// check object operand is really bound
						JavaSDM.ensure(operand != null);
						// check object spec is really bound
						JavaSDM.ensure(spec != null);
						// check isomorphic binding between objects _edge_coveredBy and _edge_covered 
						JavaSDM.ensure(!_edge_coveredBy.equals(_edge_covered));

						// check link guard from operand to guard
						JavaSDM.ensure(guard.equals(operand.getGuard()));

						// check link operand from operand to combo
						JavaSDM.ensure(combo.equals(operand.eContainer()));

						// check link specification from spec to guard
						JavaSDM.ensure(guard.equals(spec.eContainer()));

						// check link src from _edge_covered to operand
						JavaSDM.ensure(operand.equals(_edge_covered.getSrc()));

						// check link src from _edge_coveredBy to line
						JavaSDM.ensure(line.equals(_edge_coveredBy.getSrc()));

						// check link trg from _edge_covered to line
						JavaSDM.ensure(line.equals(_edge_covered.getTrg()));

						// check link trg from _edge_coveredBy to operand
						JavaSDM.ensure(operand.equals(_edge_coveredBy.getTrg()));

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from line to operand
						JavaSDM.ensure(line.getCoveredBy().contains(operand));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, combo,
								operand, guard, spec, line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_108(
			EMoflonEdge _edge_specification) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		InteractionOperand __DEC_operand_fragment_36655 = null;
		InteractionOperand __DEC_guard_guard_118423 = null;
		CombinedFragment __DEC_operand_operand_518284 = null;
		Constraint __DEC_spec_specification_420996 = null;
		Match match = null;
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
					// check link covered from line to combo
					JavaSDM.ensure(line.getCoveredBy().contains(combo));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// negative check for link fragment from operand
						JavaSDM.ensure(operand.getEnclosingInteraction() == null);
						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_fragment_36655 = operand
									.getEnclosingOperand();

							// check object __DEC_operand_fragment_36655 is really bound
							JavaSDM.ensure(__DEC_operand_fragment_36655 != null);

							// check isomorphic binding between objects __DEC_operand_fragment_36655 and operand 
							JavaSDM.ensure(!__DEC_operand_fragment_36655
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
							__DEC_guard_guard_118423 = guard.eContainer() instanceof InteractionOperand ? (InteractionOperand) guard
									.eContainer() : null;

							// check object __DEC_guard_guard_118423 is really bound
							JavaSDM.ensure(__DEC_guard_guard_118423 != null);

							// check if contained via correct reference
							JavaSDM.ensure(guard
									.equals(__DEC_guard_guard_118423.getGuard()));

							// check isomorphic binding between objects __DEC_guard_guard_118423 and operand 
							JavaSDM.ensure(!__DEC_guard_guard_118423
									.equals(operand));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_operand_operand_518284 = operand.eContainer() instanceof CombinedFragment ? (CombinedFragment) operand
									.eContainer() : null;

							// check object __DEC_operand_operand_518284 is really bound
							JavaSDM.ensure(__DEC_operand_operand_518284 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_operand_operand_518284
									.getOperand().contains(operand));

							// check isomorphic binding between objects __DEC_operand_operand_518284 and combo 
							JavaSDM.ensure(!__DEC_operand_operand_518284
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
							__DEC_spec_specification_420996 = spec.eContainer() instanceof Constraint ? (Constraint) spec
									.eContainer() : null;

							// check object __DEC_spec_specification_420996 is really bound
							JavaSDM.ensure(__DEC_spec_specification_420996 != null);

							// check if contained via correct reference
							JavaSDM.ensure(spec
									.equals(__DEC_spec_specification_420996
											.getSpecification()));

							// check isomorphic binding between objects __DEC_spec_specification_420996 and guard 
							JavaSDM.ensure(!__DEC_spec_specification_420996
									.equals(guard));

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
						// check object line is really bound
						JavaSDM.ensure(line != null);
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
						JavaSDM.ensure(guard.equals(_edge_specification
								.getSrc()));

						// check link trg from _edge_specification to spec
						JavaSDM.ensure(spec.equals(_edge_specification.getTrg()));

						// check link covered from line to combo
						JavaSDM.ensure(line.getCoveredBy().contains(combo));

						// check link covered from line to operand
						JavaSDM.ensure(line.getCoveredBy().contains(operand));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match, combo,
								operand, guard, spec, line);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_altFlow_flows_921259 = null;
		NormalStep __DEC_alt_stepAlternative_43990 = null;
		Iterator fujaba__IterAltFlowTo__DEC_altFlow_ref_55638 = null;
		AlternativeFlowAlternative __DEC_altFlow_ref_55638 = null;
		Match match = null;
		Flow flow = null;
		NormalStep step = null;
		Iterator fujaba__IterAltFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow altFlow = null;
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

			// ensure correct type and really bound of object altFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			altFlow = (AlternativeFlow) _TmpObject;

			// check link flows from altFlow to useCase
			JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

			// iterate to-many link ref from altFlow to alt
			fujaba__Success = false;

			fujaba__IterAltFlowToAlt = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							altFlow, AlternativeFlowAlternative.class, "ref"))
					.iterator();

			while (fujaba__IterAltFlowToAlt.hasNext()) {
				try {
					alt = (AlternativeFlowAlternative) fujaba__IterAltFlowToAlt
							.next();

					// check object alt is really bound
					JavaSDM.ensure(alt != null);
					// bind object
					step = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
							.eContainer() : null;

					// check object step is really bound
					JavaSDM.ensure(step != null);

					// check if contained via correct reference
					JavaSDM.ensure(step.getStepAlternative().contains(alt));

					// bind object
					flow = step.eContainer() instanceof Flow ? (Flow) step
							.eContainer() : null;

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// check if contained via correct reference
					JavaSDM.ensure(flow.getSteps().contains(step));

					// check isomorphic binding between objects flow and altFlow 
					JavaSDM.ensure(!flow.equals(altFlow));

					// check link flows from flow to useCase
					JavaSDM.ensure(useCase.equals(flow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_altFlow_flows_921259 = altFlow.eContainer() instanceof UseCase ? (UseCase) altFlow
									.eContainer() : null;

							// check object __DEC_altFlow_flows_921259 is really bound
							JavaSDM.ensure(__DEC_altFlow_flows_921259 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_altFlow_flows_921259
									.getFlows().contains(altFlow));

							// check isomorphic binding between objects __DEC_altFlow_flows_921259 and useCase 
							JavaSDM.ensure(!__DEC_altFlow_flows_921259
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
							__DEC_alt_stepAlternative_43990 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_43990 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_43990 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_43990
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_43990 and step 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_43990
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

							// iterate to-many link ref from altFlow to __DEC_altFlow_ref_55638
							fujaba__Success = false;

							fujaba__IterAltFlowTo__DEC_altFlow_ref_55638 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													altFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAltFlowTo__DEC_altFlow_ref_55638
											.hasNext()) {
								try {
									__DEC_altFlow_ref_55638 = (AlternativeFlowAlternative) fujaba__IterAltFlowTo__DEC_altFlow_ref_55638
											.next();

									// check object __DEC_altFlow_ref_55638 is really bound
									JavaSDM.ensure(__DEC_altFlow_ref_55638 != null);
									// check isomorphic binding between objects __DEC_altFlow_ref_55638 and alt 
									JavaSDM.ensure(!__DEC_altFlow_ref_55638
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

						// check object _edge_flows is really bound
						JavaSDM.ensure(_edge_flows != null);
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

						// check link ref from alt to altFlow
						JavaSDM.ensure(altFlow.equals(alt.getRef()));

						// check link flows from altFlow to useCase
						JavaSDM.ensure(useCase.equals(altFlow.eContainer()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link src from _edge_flows to useCase
						JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

						// check link stepAlternative from alt to step
						JavaSDM.ensure(step.equals(alt.eContainer()));

						// check link steps from step to flow
						JavaSDM.ensure(flow.equals(step.eContainer()));

						// check link trg from _edge_flows to altFlow
						JavaSDM.ensure(altFlow.equals(_edge_flows.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, step,
								alt, altFlow, flow, useCase);
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
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(Flow) arguments.get(4), (UseCase) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(Flow) arguments.get(4), (UseCase) arguments.get(5));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(AlternativeFlowAlternative) arguments.get(2),
					(AlternativeFlow) arguments.get(3),
					(Flow) arguments.get(4), (UseCase) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE_LIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(NormalStep) arguments.get(2),
					(NormalStepToCombinedFragment) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(Flow) arguments.get(6), (UseCase) arguments.get(7),
					(Lifeline) arguments.get(8));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_FLOW_USECASE_LIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(NormalStep) arguments.get(2),
					(NormalStepToCombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(InteractionConstraint) arguments.get(5),
					(LiteralString) arguments.get(6), (Flow) arguments.get(7),
					(UseCase) arguments.get(8), (Lifeline) arguments.get(9));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_104((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_26((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_105((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_106((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_107__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_107((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_108__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_108((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StepAltToOperandRuleImpl
