/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.DocRootToUCModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.ContinuationRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

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
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.Event;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.Task;
import bpmn2.UserTask;

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
 * An implementation of the model object '<em><b>Continuation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinuationRuleImpl extends AbstractRuleImpl implements
		ContinuationRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getContinuationRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __alt_continuation_nextStep = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_flow = null;
		EMoflonEdge __step_next_nextStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object nextStep is really bound
			JavaSDM.ensure(nextStep != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects step and nextStep 
			JavaSDM.ensure(!step.equals(nextStep));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, alt, flow,
					step, nextStep));

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

				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object nextStep is really bound
				JavaSDM.ensure(nextStep != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check isomorphic binding between objects step and nextStep 
				JavaSDM.ensure(!step.equals(nextStep));

				// create object __alt_continuation_nextStep
				__alt_continuation_nextStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __alt_continuation_nextStep
				__alt_continuation_nextStep.setName("continuation");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_continuation_nextStep, "toBeTranslatedEdges");

				// create link
				__alt_continuation_nextStep.setSrc(alt);

				// create link
				__alt_continuation_nextStep.setTrg(nextStep);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object nextStep is really bound
				JavaSDM.ensure(nextStep != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check isomorphic binding between objects step and nextStep 
				JavaSDM.ensure(!step.equals(nextStep));

				// create object __step_stepAlternative_alt
				__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __alt_ref_flow
				__alt_ref_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __step_next_nextStep
				__step_next_nextStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __alt_ref_flow
				__alt_ref_flow.setName("ref");
				// assign attribute __step_stepAlternative_alt
				__step_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __step_next_nextStep
				__step_next_nextStep.setName("next");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						step, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_stepAlternative_alt, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__step_next_nextStep, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						nextStep, "contextNodes");

				// create link
				__alt_ref_flow.setSrc(alt);

				// create link
				__step_stepAlternative_alt.setTrg(alt);

				// create link
				__alt_ref_flow.setTrg(flow);

				// create link
				__step_stepAlternative_alt.setSrc(step);

				// create link
				__step_next_nextStep.setSrc(step);

				// create link
				__step_next_nextStep.setTrg(nextStep);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, alt, flow, step, nextStep);
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
		AlternativeFlowAlternative alt = null;
		ExclusiveGateway excConvGw = null;
		FlowNodeToStep excConvGwToStep = null;
		AlternativeFlow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		FlowNode nextNode = null;
		FlowNodeToStep nextNodeToNextStep = null;
		Step nextStep = null;
		SequenceFlow outFlow = null;
		NormalStep step = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __alt_continuation_nextStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("excConvGw"));

			// ensure correct type and really bound of object excConvGw
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			excConvGw = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("excConvGwToStep"));

			// ensure correct type and really bound of object excConvGwToStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			excConvGwToStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("nextNode"));

			// ensure correct type and really bound of object nextNode
			JavaSDM.ensure(_TmpObject instanceof FlowNode);
			nextNode = (FlowNode) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("nextNodeToNextStep"));

			// ensure correct type and really bound of object nextNodeToNextStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			nextNodeToNextStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("nextStep"));

			// ensure correct type and really bound of object nextStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			nextStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects nextNode and excConvGw 
			JavaSDM.ensure(!nextNode.equals(excConvGw));

			// check isomorphic binding between objects nextNodeToNextStep and excConvGwToStep 
			JavaSDM.ensure(!nextNodeToNextStep.equals(excConvGwToStep));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects step and nextStep 
			JavaSDM.ensure(!step.equals(nextStep));

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
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object excConvGw is really bound
			JavaSDM.ensure(excConvGw != null);
			// check object excConvGwToStep is really bound
			JavaSDM.ensure(excConvGwToStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object nextNode is really bound
			JavaSDM.ensure(nextNode != null);
			// check object nextNodeToNextStep is really bound
			JavaSDM.ensure(nextNodeToNextStep != null);
			// check object nextStep is really bound
			JavaSDM.ensure(nextStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects excConvGw and alt 
			JavaSDM.ensure(!excConvGw.equals(alt));

			// check isomorphic binding between objects excConvGwToStep and alt 
			JavaSDM.ensure(!excConvGwToStep.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects nextNode and alt 
			JavaSDM.ensure(!nextNode.equals(alt));

			// check isomorphic binding between objects nextNodeToNextStep and alt 
			JavaSDM.ensure(!nextNodeToNextStep.equals(alt));

			// check isomorphic binding between objects nextStep and alt 
			JavaSDM.ensure(!nextStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects excConvGwToStep and excConvGw 
			JavaSDM.ensure(!excConvGwToStep.equals(excConvGw));

			// check isomorphic binding between objects flow and excConvGw 
			JavaSDM.ensure(!flow.equals(excConvGw));

			// check isomorphic binding between objects inFlow and excConvGw 
			JavaSDM.ensure(!inFlow.equals(excConvGw));

			// check isomorphic binding between objects inFlowToFlow and excConvGw 
			JavaSDM.ensure(!inFlowToFlow.equals(excConvGw));

			// check isomorphic binding between objects nextNode and excConvGw 
			JavaSDM.ensure(!nextNode.equals(excConvGw));

			// check isomorphic binding between objects nextNodeToNextStep and excConvGw 
			JavaSDM.ensure(!nextNodeToNextStep.equals(excConvGw));

			// check isomorphic binding between objects nextStep and excConvGw 
			JavaSDM.ensure(!nextStep.equals(excConvGw));

			// check isomorphic binding between objects outFlow and excConvGw 
			JavaSDM.ensure(!outFlow.equals(excConvGw));

			// check isomorphic binding between objects step and excConvGw 
			JavaSDM.ensure(!step.equals(excConvGw));

			// check isomorphic binding between objects flow and excConvGwToStep 
			JavaSDM.ensure(!flow.equals(excConvGwToStep));

			// check isomorphic binding between objects inFlow and excConvGwToStep 
			JavaSDM.ensure(!inFlow.equals(excConvGwToStep));

			// check isomorphic binding between objects inFlowToFlow and excConvGwToStep 
			JavaSDM.ensure(!inFlowToFlow.equals(excConvGwToStep));

			// check isomorphic binding between objects nextNode and excConvGwToStep 
			JavaSDM.ensure(!nextNode.equals(excConvGwToStep));

			// check isomorphic binding between objects nextNodeToNextStep and excConvGwToStep 
			JavaSDM.ensure(!nextNodeToNextStep.equals(excConvGwToStep));

			// check isomorphic binding between objects nextStep and excConvGwToStep 
			JavaSDM.ensure(!nextStep.equals(excConvGwToStep));

			// check isomorphic binding between objects outFlow and excConvGwToStep 
			JavaSDM.ensure(!outFlow.equals(excConvGwToStep));

			// check isomorphic binding between objects step and excConvGwToStep 
			JavaSDM.ensure(!step.equals(excConvGwToStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects nextNode and flow 
			JavaSDM.ensure(!nextNode.equals(flow));

			// check isomorphic binding between objects nextNodeToNextStep and flow 
			JavaSDM.ensure(!nextNodeToNextStep.equals(flow));

			// check isomorphic binding between objects nextStep and flow 
			JavaSDM.ensure(!nextStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects nextNode and inFlow 
			JavaSDM.ensure(!nextNode.equals(inFlow));

			// check isomorphic binding between objects nextNodeToNextStep and inFlow 
			JavaSDM.ensure(!nextNodeToNextStep.equals(inFlow));

			// check isomorphic binding between objects nextStep and inFlow 
			JavaSDM.ensure(!nextStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects step and inFlow 
			JavaSDM.ensure(!step.equals(inFlow));

			// check isomorphic binding between objects nextNode and inFlowToFlow 
			JavaSDM.ensure(!nextNode.equals(inFlowToFlow));

			// check isomorphic binding between objects nextNodeToNextStep and inFlowToFlow 
			JavaSDM.ensure(!nextNodeToNextStep.equals(inFlowToFlow));

			// check isomorphic binding between objects nextStep and inFlowToFlow 
			JavaSDM.ensure(!nextStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects step and inFlowToFlow 
			JavaSDM.ensure(!step.equals(inFlowToFlow));

			// check isomorphic binding between objects nextNodeToNextStep and nextNode 
			JavaSDM.ensure(!nextNodeToNextStep.equals(nextNode));

			// check isomorphic binding between objects nextStep and nextNode 
			JavaSDM.ensure(!nextStep.equals(nextNode));

			// check isomorphic binding between objects outFlow and nextNode 
			JavaSDM.ensure(!outFlow.equals(nextNode));

			// check isomorphic binding between objects step and nextNode 
			JavaSDM.ensure(!step.equals(nextNode));

			// check isomorphic binding between objects nextStep and nextNodeToNextStep 
			JavaSDM.ensure(!nextStep.equals(nextNodeToNextStep));

			// check isomorphic binding between objects outFlow and nextNodeToNextStep 
			JavaSDM.ensure(!outFlow.equals(nextNodeToNextStep));

			// check isomorphic binding between objects step and nextNodeToNextStep 
			JavaSDM.ensure(!step.equals(nextNodeToNextStep));

			// check isomorphic binding between objects outFlow and nextStep 
			JavaSDM.ensure(!outFlow.equals(nextStep));

			// check isomorphic binding between objects step and nextStep 
			JavaSDM.ensure(!step.equals(nextStep));

			// check isomorphic binding between objects step and outFlow 
			JavaSDM.ensure(!step.equals(outFlow));

			// create object __alt_continuation_nextStep
			__alt_continuation_nextStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ContinuationRule");
			// assign attribute __alt_continuation_nextStep
			__alt_continuation_nextStep.setName("continuation");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_continuation_nextStep, "translatedEdges");

			// create link
			__alt_continuation_nextStep.setSrc(alt);

			// create link
			__alt_continuation_nextStep.setTrg(nextStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, inFlow, excConvGw, outFlow,
				nextNode, alt, flow, inFlowToFlow, step, excConvGwToStep,
				nextStep, nextNodeToNextStep);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow flow = null;
		Step nextStep = null;
		NormalStep step = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlow_targetRef_excConvGw = null;
		EMoflonEdge __excConvGw_incoming_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __excConvGw_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_excConvGw = null;
		EMoflonEdge __excConvGwToStep_source_excConvGw = null;
		EMoflonEdge __outFlow_targetRef_nextNode = null;
		EMoflonEdge __nextNode_incoming_outFlow = null;
		EMoflonEdge __nextNodeToNextStep_source_nextNode = null;
		EMoflonEdge __alt_ref_flow = null;
		EMoflonEdge __step_stepAlternative_alt = null;
		EMoflonEdge __alt_continuation_nextStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __excConvGwToStep_target_step = null;
		EMoflonEdge __step_next_nextStep = null;
		EMoflonEdge __nextNodeToNextStep_target_nextStep = null;
		CSP csp = null;
		Iterator fujaba__IterExcConvGwToOutFlow = null;
		SequenceFlow outFlow = null;
		FlowNode nextNode = null;
		Iterator fujaba__IterNextStepToNextNodeToNextStep = null;
		FlowNodeToStep nextNodeToNextStep = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		ExclusiveGateway excConvGw = null;
		Iterator fujaba__IterStepToExcConvGwToStep = null;
		FlowNodeToStep excConvGwToStep = null;

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
			ruleresult.setRule("ContinuationRule");

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
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;
			_TmpObject = (match.getObject("nextStep"));

			// ensure correct type and really bound of object nextStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			nextStep = (Step) _TmpObject;
			_TmpObject = (match.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			step = (NormalStep) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects step and nextStep 
			JavaSDM.ensure(!step.equals(nextStep));

			// iterate to-many link target from step to excConvGwToStep
			fujaba__Success = false;

			fujaba__IterStepToExcConvGwToStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(step,
							FlowNodeToStep.class, "target")).iterator();

			while (fujaba__IterStepToExcConvGwToStep.hasNext()) {
				try {
					excConvGwToStep = (FlowNodeToStep) fujaba__IterStepToExcConvGwToStep
							.next();

					// check object excConvGwToStep is really bound
					JavaSDM.ensure(excConvGwToStep != null);
					// bind object
					_TmpObject = excConvGwToStep.getSource();

					// ensure correct type and really bound of object excConvGw
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					excConvGw = (ExclusiveGateway) _TmpObject;

					// iterate to-many link target from flow to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterFlowToInFlowToFlow = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(flow,
											SequenceFlowToUCFlow.class,
											"target")).iterator();

					while (fujaba__IterFlowToInFlowToFlow.hasNext()) {
						try {
							inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToInFlowToFlow
									.next();

							// check object inFlowToFlow is really bound
							JavaSDM.ensure(inFlowToFlow != null);
							// bind object
							inFlow = inFlowToFlow.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// iterate to-many link target from nextStep to nextNodeToNextStep
							fujaba__Success = false;

							fujaba__IterNextStepToNextNodeToNextStep = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(nextStep,
													FlowNodeToStep.class,
													"target")).iterator();

							while (fujaba__IterNextStepToNextNodeToNextStep
									.hasNext()) {
								try {
									nextNodeToNextStep = (FlowNodeToStep) fujaba__IterNextStepToNextNodeToNextStep
											.next();

									// check object nextNodeToNextStep is really bound
									JavaSDM.ensure(nextNodeToNextStep != null);
									// check isomorphic binding between objects nextNodeToNextStep and excConvGwToStep 
									JavaSDM.ensure(!nextNodeToNextStep
											.equals(excConvGwToStep));

									// bind object
									nextNode = nextNodeToNextStep.getSource();

									// check object nextNode is really bound
									JavaSDM.ensure(nextNode != null);

									// check isomorphic binding between objects nextNode and excConvGw 
									JavaSDM.ensure(!nextNode.equals(excConvGw));

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object alt is really bound
										JavaSDM.ensure(alt != null);
										// check object excConvGw is really bound
										JavaSDM.ensure(excConvGw != null);
										// check object excConvGwToStep is really bound
										JavaSDM.ensure(excConvGwToStep != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object nextNode is really bound
										JavaSDM.ensure(nextNode != null);
										// check object nextNodeToNextStep is really bound
										JavaSDM.ensure(nextNodeToNextStep != null);
										// check object nextStep is really bound
										JavaSDM.ensure(nextStep != null);
										// check object step is really bound
										JavaSDM.ensure(step != null);
										// check isomorphic binding between objects nextNode and excConvGw 
										JavaSDM.ensure(!nextNode
												.equals(excConvGw));

										// check isomorphic binding between objects nextNodeToNextStep and excConvGwToStep 
										JavaSDM.ensure(!nextNodeToNextStep
												.equals(excConvGwToStep));

										// check isomorphic binding between objects step and nextStep 
										JavaSDM.ensure(!step.equals(nextStep));

										// check link continuation from alt to nextStep
										JavaSDM.ensure(nextStep.equals(alt
												.getContinuation()));

										// check link next from step to nextStep
										JavaSDM.ensure(nextStep.equals(step
												.getNext()));

										// check link ref from alt to flow
										JavaSDM.ensure(flow.equals(alt.getRef()));

										// check link source from excConvGwToStep to excConvGw
										JavaSDM.ensure(excConvGw
												.equals(excConvGwToStep
														.getSource()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from nextNodeToNextStep to nextNode
										JavaSDM.ensure(nextNode
												.equals(nextNodeToNextStep
														.getSource()));

										// check link stepAlternative from alt to step
										JavaSDM.ensure(step.equals(alt
												.eContainer()));

										// check link target from excConvGwToStep to step
										JavaSDM.ensure(step
												.equals(excConvGwToStep
														.getTarget()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from nextNodeToNextStep to nextStep
										JavaSDM.ensure(nextStep
												.equals(nextNodeToNextStep
														.getTarget()));

										// check link targetRef from inFlow to excConvGw
										JavaSDM.ensure(excConvGw.equals(inFlow
												.getTargetRef()));

										// iterate to-many link sourceRef from excConvGw to outFlow
										fujaba__Success = false;

										fujaba__IterExcConvGwToOutFlow = new ArrayList(
												excConvGw.getOutgoing())
												.iterator();

										while (fujaba__IterExcConvGwToOutFlow
												.hasNext()) {
											try {
												outFlow = (SequenceFlow) fujaba__IterExcConvGwToOutFlow
														.next();

												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link targetRef from outFlow to nextNode
												JavaSDM.ensure(nextNode.equals(outFlow
														.getTargetRef()));

												// create object __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlow_targetRef_excConvGw
												__inFlow_targetRef_excConvGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __excConvGw_incoming_inFlow
												__excConvGw_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __excConvGw_outgoing_outFlow
												__excConvGw_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __outFlow_sourceRef_excConvGw
												__outFlow_sourceRef_excConvGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __excConvGwToStep_source_excConvGw
												__excConvGwToStep_source_excConvGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __outFlow_targetRef_nextNode
												__outFlow_targetRef_nextNode = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __nextNode_incoming_outFlow
												__nextNode_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __nextNodeToNextStep_source_nextNode
												__nextNodeToNextStep_source_nextNode = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __alt_ref_flow
												__alt_ref_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_stepAlternative_alt
												__step_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __alt_continuation_nextStep
												__alt_continuation_nextStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __excConvGwToStep_target_step
												__excConvGwToStep_target_step = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __step_next_nextStep
												__step_next_nextStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __nextNodeToNextStep_target_nextStep
												__nextNodeToNextStep_target_nextStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __inFlow_targetRef_excConvGw
												__inFlow_targetRef_excConvGw
														.setName("targetRef");
												// assign attribute __excConvGw_incoming_inFlow
												__excConvGw_incoming_inFlow
														.setName("incoming");
												// assign attribute __outFlow_sourceRef_excConvGw
												__outFlow_sourceRef_excConvGw
														.setName("sourceRef");
												// assign attribute __excConvGw_outgoing_outFlow
												__excConvGw_outgoing_outFlow
														.setName("outgoing");
												// assign attribute __outFlow_targetRef_nextNode
												__outFlow_targetRef_nextNode
														.setName("targetRef");
												// assign attribute __nextNode_incoming_outFlow
												__nextNode_incoming_outFlow
														.setName("incoming");
												// assign attribute __alt_ref_flow
												__alt_ref_flow.setName("ref");
												// assign attribute __alt_continuation_nextStep
												__alt_continuation_nextStep
														.setName("continuation");
												// assign attribute __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow
														.setName("source");
												// assign attribute __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow
														.setName("target");
												// assign attribute __step_stepAlternative_alt
												__step_stepAlternative_alt
														.setName("stepAlternative");
												// assign attribute __step_next_nextStep
												__step_next_nextStep
														.setName("next");
												// assign attribute __excConvGwToStep_source_excConvGw
												__excConvGwToStep_source_excConvGw
														.setName("source");
												// assign attribute __excConvGwToStep_target_step
												__excConvGwToStep_target_step
														.setName("target");
												// assign attribute __nextNodeToNextStep_source_nextNode
												__nextNodeToNextStep_source_nextNode
														.setName("source");
												// assign attribute __nextNodeToNextStep_target_nextStep
												__nextNodeToNextStep_target_nextStep
														.setName("target");

												// create link
												__inFlowToFlow_source_inFlow
														.setTrg(inFlow);

												// create link
												__inFlow_targetRef_excConvGw
														.setSrc(inFlow);

												// create link
												__excConvGw_incoming_inFlow
														.setTrg(inFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(excConvGw);

												// create link
												__excConvGw_outgoing_outFlow
														.setSrc(excConvGw);

												// create link
												__outFlow_sourceRef_excConvGw
														.setTrg(excConvGw);

												// create link
												__excConvGw_incoming_inFlow
														.setSrc(excConvGw);

												// create link
												__inFlow_targetRef_excConvGw
														.setTrg(excConvGw);

												// create link
												__excConvGwToStep_source_excConvGw
														.setTrg(excConvGw);

												// create link
												__outFlow_targetRef_nextNode
														.setSrc(outFlow);

												// create link
												__nextNode_incoming_outFlow
														.setTrg(outFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(outFlow);

												// create link
												__excConvGw_outgoing_outFlow
														.setTrg(outFlow);

												// create link
												__outFlow_sourceRef_excConvGw
														.setSrc(outFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(nextNode);

												// create link
												__nextNode_incoming_outFlow
														.setSrc(nextNode);

												// create link
												__outFlow_targetRef_nextNode
														.setTrg(nextNode);

												// create link
												__nextNodeToNextStep_source_nextNode
														.setTrg(nextNode);

												// create link
												__alt_ref_flow.setSrc(alt);

												// create link
												__step_stepAlternative_alt
														.setTrg(alt);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(alt);

												// create link
												__alt_continuation_nextStep
														.setSrc(alt);

												// create link
												__alt_ref_flow.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__inFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												__inFlowToFlow_source_inFlow
														.setSrc(inFlowToFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlowToFlow);

												// create link
												__inFlowToFlow_target_flow
														.setSrc(inFlowToFlow);

												// create link
												__excConvGwToStep_target_step
														.setTrg(step);

												// create link
												__step_next_nextStep
														.setSrc(step);

												// create link
												__step_stepAlternative_alt
														.setSrc(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(excConvGwToStep);

												// create link
												__excConvGwToStep_target_step
														.setSrc(excConvGwToStep);

												// create link
												__excConvGwToStep_source_excConvGw
														.setSrc(excConvGwToStep);

												// create link
												__step_next_nextStep
														.setTrg(nextStep);

												// create link
												__alt_continuation_nextStep
														.setTrg(nextStep);

												// create link
												__nextNodeToNextStep_target_nextStep
														.setTrg(nextStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(nextStep);

												// create link
												__nextNodeToNextStep_target_nextStep
														.setSrc(nextNodeToNextStep);

												// create link
												__nextNodeToNextStep_source_nextNode
														.setSrc(nextNodeToNextStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(nextNodeToNextStep);

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__excConvGwToStep_source_excConvGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlowToFlow_source_inFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__nextNode_incoming_outFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlowToFlow_target_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__nextNodeToNextStep_source_nextNode,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__alt_ref_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__nextNodeToNextStep_target_nextStep,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__excConvGw_outgoing_outFlow,
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
																__step_next_nextStep,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__excConvGw_incoming_inFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__excConvGwToStep_target_step,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlow_targetRef_excConvGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__outFlow_sourceRef_excConvGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__outFlow_targetRef_nextNode,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__alt_continuation_nextStep,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_BWD(
																	isApplicableMatch,
																	inFlow,
																	excConvGw,
																	outFlow,
																	nextNode,
																	alt,
																	flow,
																	inFlowToFlow,
																	step,
																	excConvGwToStep,
																	nextStep,
																	nextNodeToNextStep));

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
																.setRuleName("ContinuationRule");
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
	public void registerObjectsToMatch_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		match.registerObject("alt", alt);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("nextStep", nextStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
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
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_excConvGw_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("excConvGw.gatewayDirection", true, csp);
		var_excConvGw_gatewayDirection
				.setValue(excConvGw.getGatewayDirection());
		var_excConvGw_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_excConvGw_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("excConvGw", excConvGw);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("nextNode", nextNode);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("excConvGwToStep", excConvGwToStep);
		isApplicableMatch.registerObject("nextStep", nextStep);
		isApplicableMatch.registerObject("nextNodeToNextStep",
				nextNodeToNextStep);
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
			EObject inFlow, EObject excConvGw, EObject outFlow,
			EObject nextNode, EObject alt, EObject flow, EObject inFlowToFlow,
			EObject step, EObject excConvGwToStep, EObject nextStep,
			EObject nextNodeToNextStep) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("excConvGw", excConvGw);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("nextNode", nextNode);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("excConvGwToStep", excConvGwToStep);
		ruleresult.registerObject("nextStep", nextStep);
		ruleresult.registerObject("nextNodeToNextStep", nextNodeToNextStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(
			EMoflonEdge _edge_continuation) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;
		NormalStep step = null;
		AlternativeFlow flow = null;
		Step nextStep = null;
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

			// check object _edge_continuation is really bound
			JavaSDM.ensure(_edge_continuation != null);
			// bind object
			_TmpObject = _edge_continuation.getSrc();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// bind object
			nextStep = alt.getContinuation();

			// check object nextStep is really bound
			JavaSDM.ensure(nextStep != null);

			// bind object
			_TmpObject = alt.getRef();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;

			// bind object
			step = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
					.eContainer() : null;

			// check object step is really bound
			JavaSDM.ensure(step != null);

			// check if contained via correct reference
			JavaSDM.ensure(step.getStepAlternative().contains(alt));

			// check isomorphic binding between objects step and nextStep 
			JavaSDM.ensure(!step.equals(nextStep));

			// check link next from step to nextStep
			JavaSDM.ensure(nextStep.equals(step.getNext()));

			// check link trg from _edge_continuation to nextStep
			JavaSDM.ensure(nextStep.equals(_edge_continuation.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check object _edge_continuation is really bound
				JavaSDM.ensure(_edge_continuation != null);
				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object nextStep is really bound
				JavaSDM.ensure(nextStep != null);
				// check object step is really bound
				JavaSDM.ensure(step != null);
				// check isomorphic binding between objects step and nextStep 
				JavaSDM.ensure(!step.equals(nextStep));

				// check link continuation from alt to nextStep
				JavaSDM.ensure(nextStep.equals(alt.getContinuation()));

				// check link next from step to nextStep
				JavaSDM.ensure(nextStep.equals(step.getNext()));

				// check link ref from alt to flow
				JavaSDM.ensure(flow.equals(alt.getRef()));

				// check link src from _edge_continuation to alt
				JavaSDM.ensure(alt.equals(_edge_continuation.getSrc()));

				// check link stepAlternative from alt to step
				JavaSDM.ensure(step.equals(alt.eContainer()));

				// check link trg from _edge_continuation to nextStep
				JavaSDM.ensure(nextStep.equals(_edge_continuation.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, alt, flow,
						step, nextStep);
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
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.CONTINUATION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
			return null;
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_STEP_FLOWNODETOSTEP:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(FlowNode) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5),
					(AlternativeFlow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(Step) arguments.get(10),
					(FlowNodeToStep) arguments.get(11));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CONTINUATION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CONTINUATION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ContinuationRuleImpl
