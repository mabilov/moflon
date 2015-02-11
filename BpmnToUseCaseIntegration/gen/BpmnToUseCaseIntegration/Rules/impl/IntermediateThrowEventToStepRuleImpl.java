/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
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
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.UserTask;
import bpmn2.Process;

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
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Throw Event To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntermediateThrowEventToStepRuleImpl extends AbstractRuleImpl
		implements IntermediateThrowEventToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateThrowEventToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getIntermediateThrowEventToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, IntermediateThrowEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __event_incoming_inFlow = null;
		EMoflonEdge __outFlow_sourceRef_event = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, event, inFlow,
					process, outFlow));

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

				// check object event is really bound
				JavaSDM.ensure(event != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __event_incoming_inFlow
				__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_event
				__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __event_outgoing_outFlow
				__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_event
				__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_event
				__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_event
				__process_flowElements_event.setName("flowElements");
				// assign attribute __inFlow_targetRef_event
				__inFlow_targetRef_event.setName("targetRef");
				// assign attribute __event_incoming_inFlow
				__event_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_event
				__outFlow_sourceRef_event.setName("sourceRef");
				// assign attribute __event_outgoing_outFlow
				__event_outgoing_outFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__event_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_event, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__event_outgoing_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						event, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_event, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_event, "toBeTranslatedEdges");

				// create link
				__event_incoming_inFlow.setSrc(event);

				// create link
				__outFlow_sourceRef_event.setTrg(event);

				// create link
				__inFlow_targetRef_event.setTrg(event);

				// create link
				__process_flowElements_event.setTrg(event);

				// create link
				__event_outgoing_outFlow.setSrc(event);

				// create link
				__inFlow_targetRef_event.setSrc(inFlow);

				// create link
				__event_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_event.setSrc(process);

				// create link
				__outFlow_sourceRef_event.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__event_outgoing_outFlow.setTrg(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object event is really bound
				JavaSDM.ensure(event != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, event, inFlow, process,
					outFlow);
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
		IntermediateThrowEvent event = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		SequenceFlow outFlow = null;
		Step prevStep = null;
		Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep eventToNormalStep = null;
		NormalStep normalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __event_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge eventToNormalStep__target__normalStep = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge eventToNormalStep__source__event = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge __outFlow_sourceRef_event = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge prevStep__next__normalStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("event"));

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object eventToNormalStep
			eventToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getAttributeVariable(
					"normalStep", "name").getValue());
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getAttributeVariable(
					"normalStep", "label").getValue());

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setTarget(flow);

			// create link
			eventToNormalStep.setSource(event);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(prevStep,
					normalStep, "next");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(normalStep,
					actor, "actor");

			// create link
			eventToNormalStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			flow.getSteps().add(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects event and actor 
			JavaSDM.ensure(!event.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and actor 
			JavaSDM.ensure(!eventToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and event 
			JavaSDM.ensure(!eventToNormalStep.equals(event));

			// check isomorphic binding between objects flow and event 
			JavaSDM.ensure(!flow.equals(event));

			// check isomorphic binding between objects inFlow and event 
			JavaSDM.ensure(!inFlow.equals(event));

			// check isomorphic binding between objects inFlowToFlow and event 
			JavaSDM.ensure(!inFlowToFlow.equals(event));

			// check isomorphic binding between objects inFlowToPrevStep and event 
			JavaSDM.ensure(!inFlowToPrevStep.equals(event));

			// check isomorphic binding between objects normalStep and event 
			JavaSDM.ensure(!normalStep.equals(event));

			// check isomorphic binding between objects outFlow and event 
			JavaSDM.ensure(!outFlow.equals(event));

			// check isomorphic binding between objects outFlowToFlow and event 
			JavaSDM.ensure(!outFlowToFlow.equals(event));

			// check isomorphic binding between objects outFlowToNormalStep and event 
			JavaSDM.ensure(!outFlowToNormalStep.equals(event));

			// check isomorphic binding between objects prevStep and event 
			JavaSDM.ensure(!prevStep.equals(event));

			// check isomorphic binding between objects process and event 
			JavaSDM.ensure(!process.equals(event));

			// check isomorphic binding between objects processToActor and event 
			JavaSDM.ensure(!processToActor.equals(event));

			// check isomorphic binding between objects flow and eventToNormalStep 
			JavaSDM.ensure(!flow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and eventToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventToNormalStep));

			// check isomorphic binding between objects normalStep and eventToNormalStep 
			JavaSDM.ensure(!normalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and eventToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects prevStep and eventToNormalStep 
			JavaSDM.ensure(!prevStep.equals(eventToNormalStep));

			// check isomorphic binding between objects process and eventToNormalStep 
			JavaSDM.ensure(!process.equals(eventToNormalStep));

			// check isomorphic binding between objects processToActor and eventToNormalStep 
			JavaSDM.ensure(!processToActor.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects prevStep and outFlow 
			JavaSDM.ensure(!prevStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToNormalStep 
			JavaSDM.ensure(!prevStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object __event_incoming_inFlow
			__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_event
			__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __event_outgoing_outFlow
			__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_event
			__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__source__event
			eventToNormalStep__source__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_event
			__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object prevStep__next__normalStep
			prevStep__next__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("IntermediateThrowEventToStepRule");
			// assign attribute prevStep__next__normalStep
			prevStep__next__normalStep.setName("next");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_event
			__process_flowElements_event.setName("flowElements");
			// assign attribute __inFlow_targetRef_event
			__inFlow_targetRef_event.setName("targetRef");
			// assign attribute __event_incoming_inFlow
			__event_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_event
			__outFlow_sourceRef_event.setName("sourceRef");
			// assign attribute __event_outgoing_outFlow
			__event_outgoing_outFlow.setName("outgoing");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute eventToNormalStep__source__event
			eventToNormalStep__source__event.setName("source");
			// assign attribute eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__event_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__event_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__source__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					prevStep__next__normalStep, "createdEdges");

			// create link
			eventToNormalStep__source__event.setTrg(event);

			// create link
			__event_outgoing_outFlow.setSrc(event);

			// create link
			__outFlow_sourceRef_event.setTrg(event);

			// create link
			__process_flowElements_event.setTrg(event);

			// create link
			__inFlow_targetRef_event.setTrg(event);

			// create link
			__event_incoming_inFlow.setSrc(event);

			// create link
			__inFlow_targetRef_event.setSrc(inFlow);

			// create link
			__event_incoming_inFlow.setTrg(inFlow);

			// create link
			prevStep__next__normalStep.setSrc(prevStep);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			eventToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			prevStep__next__normalStep.setTrg(normalStep);

			// create link
			__process_flowElements_event.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_event.setSrc(outFlow);

			// create link
			__event_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			eventToNormalStep__target__normalStep.setSrc(eventToNormalStep);

			// create link
			eventToNormalStep__source__event.setSrc(eventToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, event, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, outFlow, actor,
				processToActor, eventToNormalStep, outFlowToNormalStep, flow,
				inFlowToFlow, outFlowToFlow);
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
		IntermediateThrowEvent event = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge __outFlow_sourceRef_event = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __event_incoming_inFlow = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Step prevStep = null;
		Iterator fujaba__IterInFlowToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

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
			ruleresult.setRule("IntermediateThrowEventToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("event"));

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from inFlow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterInFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							SequenceFlowToUCFlow.class, "source")).iterator();

			while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					flow = inFlowToFlow.getTarget();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// iterate to-many link source from inFlow to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToStep.class, "source"))
							.iterator();

					while (fujaba__IterInFlowToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// bind object
							prevStep = inFlowToPrevStep.getTarget();

							// check object prevStep is really bound
							JavaSDM.ensure(prevStep != null);

							// iterate to-many link source from process to processToActor
							fujaba__Success = false;

							fujaba__IterProcessToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToActor.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToActor
									.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									actor = processToActor.getTarget();

									// check object actor is really bound
									JavaSDM.ensure(actor != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object event is really bound
										JavaSDM.ensure(event != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from event to process
										JavaSDM.ensure(process.equals(event
												.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link sourceRef from outFlow to event
										JavaSDM.ensure(event.equals(outFlow
												.getSourceRef()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// check link targetRef from inFlow to event
										JavaSDM.ensure(event.equals(inFlow
												.getTargetRef()));

										// create object __inFlow_targetRef_event
										__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_event
										__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_event
										__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __event_incoming_inFlow
										__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __event_outgoing_outFlow
										__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_source_process
										__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_target_actor
										__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_event
										__process_flowElements_event
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_event
										__inFlow_targetRef_event
												.setName("targetRef");
										// assign attribute __event_incoming_inFlow
										__event_incoming_inFlow
												.setName("incoming");
										// assign attribute __outFlow_sourceRef_event
										__outFlow_sourceRef_event
												.setName("sourceRef");
										// assign attribute __event_outgoing_outFlow
										__event_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __processToActor_source_process
										__processToActor_source_process
												.setName("source");
										// assign attribute __processToActor_target_actor
										__processToActor_target_actor
												.setName("target");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");

										// create link
										__inFlow_targetRef_event.setTrg(event);

										// create link
										__process_flowElements_event
												.setTrg(event);

										// create link
										__outFlow_sourceRef_event.setTrg(event);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														event);

										// create link
										__event_incoming_inFlow.setSrc(event);

										// create link
										__event_outgoing_outFlow.setSrc(event);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__event_incoming_inFlow.setTrg(inFlow);

										// create link
										__inFlow_targetRef_event.setSrc(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										__process_flowElements_event
												.setSrc(process);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__outFlow_sourceRef_event
												.setSrc(outFlow);

										// create link
										__event_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_source_inFlow,
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
														__process_flowElements_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_event,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__event_outgoing_outFlow,
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
														__process_flowElements_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlow_targetRef_event,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_sourceRef_event,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__event_incoming_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_target_prevStep,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															event, inFlow,
															prevStep,
															inFlowToPrevStep,
															process, outFlow,
															actor,
															processToActor,
															flow, inFlowToFlow));

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
												// assign attribute ruleresult
												ruleresult.setSuccess(true);
												// assign attribute isApplicableMatch
												isApplicableMatch
														.setRuleName("IntermediateThrowEventToStepRule");

												// create link
												isApplicableMatch
														.setIsApplicableRuleResult(ruleresult);

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			IntermediateThrowEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow) {
		match.registerObject("event", event);
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			IntermediateThrowEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow) {
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
			IntermediateThrowEvent event, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", true, csp);
		var_event_id.setValue(event.getId());
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", true, csp);
		var_event_name.setValue(event.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("event", event);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
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
			EObject event, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep, EObject process,
			EObject outFlow, EObject actor, EObject processToActor,
			EObject eventToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow) {
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("eventToNormalStep", eventToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("event")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getIntermediateThrowEvent())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, prevStep,
					normalStep, actor, flow));

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

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create object __prevStep_next_normalStep
				__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __prevStep_next_normalStep
				__prevStep_next_normalStep.setName("next");
				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__prevStep_next_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				__prevStep_next_normalStep.setSrc(prevStep);

				// create link
				__prevStep_next_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setTrg(actor);

				// create link
				__flow_steps_normalStep.setSrc(flow);

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
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						prevStep, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, prevStep, normalStep, actor,
					flow);
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
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		IntermediateThrowEvent event = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep eventToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge eventToNormalStep__target__normalStep = null;
		EMoflonEdge inFlow__targetRef__event = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge process__flowElements__event = null;
		EMoflonEdge event__incoming__inFlow = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge event__outgoing__outFlow = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge eventToNormalStep__source__event = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge outFlow__sourceRef__event = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object event
			event = Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object eventToNormalStep
			eventToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute event
			event.setId((java.lang.String) csp.getAttributeVariable("event",
					"id").getValue());
			// assign attribute event
			event.setName((java.lang.String) csp.getAttributeVariable("event",
					"name").getValue());

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			eventToNormalStep.setTarget(normalStep);

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			outFlowToFlow.setTarget(flow);

			// create link
			inFlow.setTargetRef(event);

			// create link
			outFlow.setSourceRef(event);

			// create link
			process.getFlowElements().add(event);

			// create link
			eventToNormalStep.setSource(event);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects event and actor 
			JavaSDM.ensure(!event.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and actor 
			JavaSDM.ensure(!eventToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and event 
			JavaSDM.ensure(!eventToNormalStep.equals(event));

			// check isomorphic binding between objects flow and event 
			JavaSDM.ensure(!flow.equals(event));

			// check isomorphic binding between objects inFlow and event 
			JavaSDM.ensure(!inFlow.equals(event));

			// check isomorphic binding between objects inFlowToFlow and event 
			JavaSDM.ensure(!inFlowToFlow.equals(event));

			// check isomorphic binding between objects inFlowToPrevStep and event 
			JavaSDM.ensure(!inFlowToPrevStep.equals(event));

			// check isomorphic binding between objects normalStep and event 
			JavaSDM.ensure(!normalStep.equals(event));

			// check isomorphic binding between objects outFlow and event 
			JavaSDM.ensure(!outFlow.equals(event));

			// check isomorphic binding between objects outFlowToFlow and event 
			JavaSDM.ensure(!outFlowToFlow.equals(event));

			// check isomorphic binding between objects outFlowToNormalStep and event 
			JavaSDM.ensure(!outFlowToNormalStep.equals(event));

			// check isomorphic binding between objects prevStep and event 
			JavaSDM.ensure(!prevStep.equals(event));

			// check isomorphic binding between objects process and event 
			JavaSDM.ensure(!process.equals(event));

			// check isomorphic binding between objects processToActor and event 
			JavaSDM.ensure(!processToActor.equals(event));

			// check isomorphic binding between objects flow and eventToNormalStep 
			JavaSDM.ensure(!flow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and eventToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventToNormalStep));

			// check isomorphic binding between objects normalStep and eventToNormalStep 
			JavaSDM.ensure(!normalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and eventToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects prevStep and eventToNormalStep 
			JavaSDM.ensure(!prevStep.equals(eventToNormalStep));

			// check isomorphic binding between objects process and eventToNormalStep 
			JavaSDM.ensure(!process.equals(eventToNormalStep));

			// check isomorphic binding between objects processToActor and eventToNormalStep 
			JavaSDM.ensure(!processToActor.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects prevStep and outFlow 
			JavaSDM.ensure(!prevStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToNormalStep 
			JavaSDM.ensure(!prevStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__event
			inFlow__targetRef__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__event
			process__flowElements__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object event__incoming__inFlow
			event__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object event__outgoing__outFlow
			event__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __prevStep_next_normalStep
			__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__source__event
			eventToNormalStep__source__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__event
			outFlow__sourceRef__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("IntermediateThrowEventToStepRule");
			// assign attribute __prevStep_next_normalStep
			__prevStep_next_normalStep.setName("next");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute process__flowElements__event
			process__flowElements__event.setName("flowElements");
			// assign attribute inFlow__targetRef__event
			inFlow__targetRef__event.setName("targetRef");
			// assign attribute event__incoming__inFlow
			event__incoming__inFlow.setName("incoming");
			// assign attribute outFlow__sourceRef__event
			outFlow__sourceRef__event.setName("sourceRef");
			// assign attribute event__outgoing__outFlow
			event__outgoing__outFlow.setName("outgoing");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute eventToNormalStep__source__event
			eventToNormalStep__source__event.setName("source");
			// assign attribute eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__prevStep_next_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__source__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			outFlow__sourceRef__event.setTrg(event);

			// create link
			inFlow__targetRef__event.setTrg(event);

			// create link
			event__incoming__inFlow.setSrc(event);

			// create link
			event__outgoing__outFlow.setSrc(event);

			// create link
			eventToNormalStep__source__event.setTrg(event);

			// create link
			process__flowElements__event.setTrg(event);

			// create link
			inFlow__targetRef__event.setSrc(inFlow);

			// create link
			event__incoming__inFlow.setTrg(inFlow);

			// create link
			__prevStep_next_normalStep.setSrc(prevStep);

			// create link
			__prevStep_next_normalStep.setTrg(normalStep);

			// create link
			eventToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			process__flowElements__event.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			event__outgoing__outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__event.setSrc(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			eventToNormalStep__target__normalStep.setSrc(eventToNormalStep);

			// create link
			eventToNormalStep__source__event.setSrc(eventToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, event, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, outFlow, actor,
				processToActor, eventToNormalStep, outFlowToNormalStep, flow,
				inFlowToFlow, outFlowToFlow);
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
		Actor actor = null;
		Flow flow = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterPrevStepToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

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
			ruleresult.setRule("IntermediateThrowEventToStepRule");

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
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// iterate to-many link target from flow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							SequenceFlowToUCFlow.class, "target")).iterator();

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

					// iterate to-many link target from prevStep to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterPrevStepToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(prevStep,
											SequenceFlowToStep.class, "target"))
							.iterator();

					while (fujaba__IterPrevStepToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterPrevStepToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// check link source from inFlowToPrevStep to inFlow
							JavaSDM.ensure(inFlow.equals(inFlowToPrevStep
									.getSource()));

							// iterate to-many link target from actor to processToActor
							fujaba__Success = false;

							fujaba__IterActorToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(actor,
													ProcessToActor.class,
													"target")).iterator();

							while (fujaba__IterActorToProcessToActor.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterActorToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									process = processToActor.getSource();

									// check object process is really bound
									JavaSDM.ensure(process != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check isomorphic binding between objects prevStep and normalStep 
										JavaSDM.ensure(!prevStep
												.equals(normalStep));

										// check link actor from normalStep to actor
										JavaSDM.ensure(actor.equals(normalStep
												.getActor()));

										// check link next from prevStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(prevStep.getNext()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __prevStep_next_normalStep
										__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_actor_actor
										__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_source_process
										__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_target_actor
										__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __prevStep_next_normalStep
										__prevStep_next_normalStep
												.setName("next");
										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __processToActor_source_process
										__processToActor_source_process
												.setName("source");
										// assign attribute __processToActor_target_actor
										__processToActor_target_actor
												.setName("target");
										// assign attribute __normalStep_actor_actor
										__normalStep_actor_actor
												.setName("actor");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										__prevStep_next_normalStep
												.setSrc(prevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										__normalStep_actor_actor
												.setSrc(normalStep);

										// create link
										__prevStep_next_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__normalStep_actor_actor.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_source_inFlow,
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
														__flow_steps_normalStep,
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
														__processToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__normalStep_actor_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_target_prevStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__prevStep_next_normalStep,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															inFlow, prevStep,
															inFlowToPrevStep,
															normalStep,
															process, actor,
															processToActor,
															flow, inFlowToFlow));

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
												// assign attribute ruleresult
												ruleresult.setSuccess(true);
												// assign attribute isApplicableMatch
												isApplicableMatch
														.setRuleName("IntermediateThrowEventToStepRule");

												// create link
												isApplicableMatch
														.setIsApplicableRuleResult(ruleresult);

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("normalStep", normalStep);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", csp);
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
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
			EObject event, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep, EObject process,
			EObject outFlow, EObject actor, EObject processToActor,
			EObject eventToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow) {
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("eventToNormalStep", eventToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("normalStep").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_199(
			EMoflonEdge _edge_next) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_933068 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_402365 = null;
		Step __DEC_normalStep_next_402365 = null;
		Match match = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Step prevStep = null;

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

			// check object _edge_next is really bound
			JavaSDM.ensure(_edge_next != null);
			// bind object
			_TmpObject = _edge_next.getSrc();

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;

			// bind object
			_TmpObject = prevStep.getNext();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_next to normalStep
			JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_933068 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_933068 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_933068 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_933068.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_933068 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_933068.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_402365
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_402365 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_402365
									.hasNext()) {
						try {
							__DEC_normalStep_next_402365 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_402365
									.next();

							// check object __DEC_normalStep_next_402365 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_402365 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_402365 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_402365
									.equals(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_next_402365 and prevStep 
							JavaSDM.ensure(!__DEC_normalStep_next_402365
									.equals(prevStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_next is really bound
				JavaSDM.ensure(_edge_next != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link next from prevStep to normalStep
				JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

				// check link src from _edge_next to prevStep
				JavaSDM.ensure(prevStep.equals(_edge_next.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_next to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, prevStep,
						normalStep, actor, flow);
				if (fujaba__Success) {
					// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_468(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_808507 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_792259 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_546431 = null;
		SequenceFlow __DEC_event_targetRef_546431 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEvent = null;
		IntermediateThrowEvent event = null;
		Process process = null;
		SequenceFlow outFlow = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// iterate to-many link flowElements from process to event
			fujaba__Success = false;

			fujaba__IterProcessToEvent = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEvent.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEvent.next();

					// ensure correct type and really bound of object event
					JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
					event = (IntermediateThrowEvent) _TmpObject;
					// check link sourceRef from outFlow to event
					JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

					// iterate to-many link flowElements from process to inFlow
					fujaba__Success = false;

					fujaba__IterProcessToInFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToInFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToInFlow.next();

							// ensure correct type and really bound of object inFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							inFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link targetRef from inFlow to event
							JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_808507 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_808507 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_808507 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_808507
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_808507 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_808507
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_792259 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_792259 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_792259 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_792259
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_792259 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_792259
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link default from outFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(outFlow,
												ExclusiveGateway.class,
												"default").size() == 0);
								// negative check for link flowNodeRefs from event
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(event,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_546431
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_546431 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_546431
													.hasNext()) {
										try {
											__DEC_event_targetRef_546431 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_546431
													.next();

											// check object __DEC_event_targetRef_546431 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_546431 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_546431 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_546431
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_546431 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_546431
													.equals(outFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_flowElements is really bound
								JavaSDM.ensure(_edge_flowElements != null);
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_flowElements to outFlow
								JavaSDM.ensure(outFlow
										.equals(_edge_flowElements.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, inFlow, process, outFlow);
								if (fujaba__Success) {
									// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_469(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_38570 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_910914 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_667617 = null;
		SequenceFlow __DEC_event_targetRef_667617 = null;
		Match match = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		IntermediateThrowEvent event = null;
		Process process = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// check link flowElements from event to process
			JavaSDM.ensure(process.equals(event.eContainer()));

			// iterate to-many link sourceRef from event to outFlow
			fujaba__Success = false;

			fujaba__IterEventToOutFlow = new ArrayList(event.getOutgoing())
					.iterator();

			while (fujaba__IterEventToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterEventToOutFlow.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link targetRef from event to inFlow
					fujaba__Success = false;

					fujaba__IterEventToInFlow = new ArrayList(
							event.getIncoming()).iterator();

					while (fujaba__IterEventToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_38570 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_38570 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_38570 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_38570
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_38570 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_38570
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_910914 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_910914 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_910914 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_910914
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_910914 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_910914
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link default from outFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(outFlow,
												ExclusiveGateway.class,
												"default").size() == 0);
								// negative check for link flowNodeRefs from event
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(event,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_667617
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_667617 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_667617
													.hasNext()) {
										try {
											__DEC_event_targetRef_667617 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_667617
													.next();

											// check object __DEC_event_targetRef_667617 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_667617 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_667617 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_667617
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_667617 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_667617
													.equals(outFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_flowElements is really bound
								JavaSDM.ensure(_edge_flowElements != null);
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_flowElements to event
								JavaSDM.ensure(event.equals(_edge_flowElements
										.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, inFlow, process, outFlow);
								if (fujaba__Success) {
									// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_470(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_549985 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_446920 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_298463 = null;
		SequenceFlow __DEC_event_targetRef_298463 = null;
		Match match = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		IntermediateThrowEvent event = null;
		SequenceFlow inFlow = null;

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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof Process ? (Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to event
			JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

			// iterate to-many link sourceRef from event to outFlow
			fujaba__Success = false;

			fujaba__IterEventToOutFlow = new ArrayList(event.getOutgoing())
					.iterator();

			while (fujaba__IterEventToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterEventToOutFlow.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_event_flowElements_549985 = event
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
									.eContainer() : null;

							// check object __DEC_event_flowElements_549985 is really bound
							JavaSDM.ensure(__DEC_event_flowElements_549985 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_event_flowElements_549985
									.getFlowElements().contains(event));

							// check isomorphic binding between objects __DEC_event_flowElements_549985 and process 
							JavaSDM.ensure(!__DEC_event_flowElements_549985
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_446920 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_446920 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_446920 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_446920
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_446920 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_446920
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from outFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(outFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// negative check for link flowNodeRefs from event
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(event, Lane.class,
										"flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from event to __DEC_event_targetRef_298463
							fujaba__Success = false;

							fujaba__IterEventTo__DEC_event_targetRef_298463 = new ArrayList(
									event.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventTo__DEC_event_targetRef_298463
											.hasNext()) {
								try {
									__DEC_event_targetRef_298463 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_298463
											.next();

									// check object __DEC_event_targetRef_298463 is really bound
									JavaSDM.ensure(__DEC_event_targetRef_298463 != null);
									// check isomorphic binding between objects __DEC_event_targetRef_298463 and inFlow 
									JavaSDM.ensure(!__DEC_event_targetRef_298463
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_event_targetRef_298463 and outFlow 
									JavaSDM.ensure(!__DEC_event_targetRef_298463
											.equals(outFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_targetRef is really bound
						JavaSDM.ensure(_edge_targetRef != null);
						// check object event is really bound
						JavaSDM.ensure(event != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from event to process
						JavaSDM.ensure(process.equals(event.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to event
						JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to event
						JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

						// check link targetRef from outFlow to event
						JavaSDM.ensure(!(event.equals(outFlow.getTargetRef())));

						// check link trg from _edge_targetRef to event
						JavaSDM.ensure(event.equals(_edge_targetRef.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, event,
								inFlow, process, outFlow);
						if (fujaba__Success) {
							// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_471(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_745358 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_37363 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_488421 = null;
		SequenceFlow __DEC_event_targetRef_488421 = null;
		Match match = null;
		Iterator fujaba__IterEventTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		IntermediateThrowEvent event = null;

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

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof Process ? (Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to event
			JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

			// iterate to-many link sourceRef from event to outFlow
			fujaba__Success = false;

			fujaba__IterEventToOutFlow = new ArrayList(event.getOutgoing())
					.iterator();

			while (fujaba__IterEventToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterEventToOutFlow.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link trg from event to _edge_targetRef
					fujaba__Success = false;

					fujaba__IterEventTo_edge_targetRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(event,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterEventTo_edge_targetRef.hasNext()) {
						try {
							_edge_targetRef = (EMoflonEdge) fujaba__IterEventTo_edge_targetRef
									.next();

							// check object _edge_targetRef is really bound
							JavaSDM.ensure(_edge_targetRef != null);
							// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
							JavaSDM.ensure(!_edge_targetRef
									.equals(_edge_incoming));

							// check link src from _edge_targetRef to inFlow
							JavaSDM.ensure(inFlow.equals(_edge_targetRef
									.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_745358 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_745358 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_745358 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_745358
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_745358 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_745358
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_37363 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_37363 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_37363 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_37363
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_37363 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_37363
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link default from outFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(outFlow,
												ExclusiveGateway.class,
												"default").size() == 0);
								// negative check for link flowNodeRefs from event
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(event,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_488421
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_488421 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_488421
													.hasNext()) {
										try {
											__DEC_event_targetRef_488421 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_488421
													.next();

											// check object __DEC_event_targetRef_488421 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_488421 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_488421 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_488421
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_488421 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_488421
													.equals(outFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_incoming is really bound
								JavaSDM.ensure(_edge_incoming != null);
								// check object _edge_targetRef is really bound
								JavaSDM.ensure(_edge_targetRef != null);
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
								JavaSDM.ensure(!_edge_targetRef
										.equals(_edge_incoming));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_incoming to event
								JavaSDM.ensure(event.equals(_edge_incoming
										.getSrc()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_incoming to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_incoming
										.getTrg()));

								// check link trg from _edge_targetRef to event
								JavaSDM.ensure(event.equals(_edge_targetRef
										.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, inFlow, process, outFlow);
								if (fujaba__Success) {
									// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_472(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_429145 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_680858 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_731656 = null;
		SequenceFlow __DEC_event_targetRef_731656 = null;
		Match match = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		IntermediateThrowEvent event = null;
		SequenceFlow outFlow = null;

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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof Process ? (Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to event
			JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

			// iterate to-many link targetRef from event to inFlow
			fujaba__Success = false;

			fujaba__IterEventToInFlow = new ArrayList(event.getIncoming())
					.iterator();

			while (fujaba__IterEventToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterEventToInFlow.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_event_flowElements_429145 = event
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
									.eContainer() : null;

							// check object __DEC_event_flowElements_429145 is really bound
							JavaSDM.ensure(__DEC_event_flowElements_429145 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_event_flowElements_429145
									.getFlowElements().contains(event));

							// check isomorphic binding between objects __DEC_event_flowElements_429145 and process 
							JavaSDM.ensure(!__DEC_event_flowElements_429145
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_680858 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_680858 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_680858 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_680858
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_680858 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_680858
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from outFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(outFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// negative check for link flowNodeRefs from event
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(event, Lane.class,
										"flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from event to __DEC_event_targetRef_731656
							fujaba__Success = false;

							fujaba__IterEventTo__DEC_event_targetRef_731656 = new ArrayList(
									event.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventTo__DEC_event_targetRef_731656
											.hasNext()) {
								try {
									__DEC_event_targetRef_731656 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_731656
											.next();

									// check object __DEC_event_targetRef_731656 is really bound
									JavaSDM.ensure(__DEC_event_targetRef_731656 != null);
									// check isomorphic binding between objects __DEC_event_targetRef_731656 and inFlow 
									JavaSDM.ensure(!__DEC_event_targetRef_731656
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_event_targetRef_731656 and outFlow 
									JavaSDM.ensure(!__DEC_event_targetRef_731656
											.equals(outFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_sourceRef is really bound
						JavaSDM.ensure(_edge_sourceRef != null);
						// check object event is really bound
						JavaSDM.ensure(event != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from event to process
						JavaSDM.ensure(process.equals(event.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to event
						JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link targetRef from inFlow to event
						JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

						// check link targetRef from outFlow to event
						JavaSDM.ensure(!(event.equals(outFlow.getTargetRef())));

						// check link trg from _edge_sourceRef to event
						JavaSDM.ensure(event.equals(_edge_sourceRef.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, event,
								inFlow, process, outFlow);
						if (fujaba__Success) {
							// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_473(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_216684 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_456108 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_927307 = null;
		SequenceFlow __DEC_event_targetRef_927307 = null;
		Match match = null;
		Iterator fujaba__IterEventTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		IntermediateThrowEvent event = null;

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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof Process ? (Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to event
			JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

			// iterate to-many link targetRef from event to inFlow
			fujaba__Success = false;

			fujaba__IterEventToInFlow = new ArrayList(event.getIncoming())
					.iterator();

			while (fujaba__IterEventToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterEventToInFlow.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// iterate to-many link trg from event to _edge_sourceRef
					fujaba__Success = false;

					fujaba__IterEventTo_edge_sourceRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(event,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterEventTo_edge_sourceRef.hasNext()) {
						try {
							_edge_sourceRef = (EMoflonEdge) fujaba__IterEventTo_edge_sourceRef
									.next();

							// check object _edge_sourceRef is really bound
							JavaSDM.ensure(_edge_sourceRef != null);
							// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
							JavaSDM.ensure(!_edge_sourceRef
									.equals(_edge_outgoing));

							// check link src from _edge_sourceRef to outFlow
							JavaSDM.ensure(outFlow.equals(_edge_sourceRef
									.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_216684 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_216684 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_216684 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_216684
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_216684 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_216684
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_456108 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_456108 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_456108 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_456108
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_456108 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_456108
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link default from outFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(outFlow,
												ExclusiveGateway.class,
												"default").size() == 0);
								// negative check for link flowNodeRefs from event
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(event,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_927307
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_927307 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_927307
													.hasNext()) {
										try {
											__DEC_event_targetRef_927307 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_927307
													.next();

											// check object __DEC_event_targetRef_927307 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_927307 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_927307 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_927307
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_927307 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_927307
													.equals(outFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_outgoing is really bound
								JavaSDM.ensure(_edge_outgoing != null);
								// check object _edge_sourceRef is really bound
								JavaSDM.ensure(_edge_sourceRef != null);
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_outgoing to event
								JavaSDM.ensure(event.equals(_edge_outgoing
										.getSrc()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_outgoing to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_outgoing
										.getTrg()));

								// check link trg from _edge_sourceRef to event
								JavaSDM.ensure(event.equals(_edge_sourceRef
										.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, inFlow, process, outFlow);
								if (fujaba__Success) {
									// statement node ''
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_200(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_227702 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_109469 = null;
		Step __DEC_normalStep_next_109469 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;

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

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_227702 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_227702 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_227702 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_227702
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_227702 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_227702
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

							// iterate to-many link next from normalStep to __DEC_normalStep_next_109469
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_109469 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_109469
											.hasNext()) {
								try {
									__DEC_normalStep_next_109469 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_109469
											.next();

									// check object __DEC_normalStep_next_109469 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_109469 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_109469 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_109469
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_109469 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_109469
											.equals(prevStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_actor is really bound
						JavaSDM.ensure(_edge_actor != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_actor to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_actor.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_actor to actor
						JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, actor, flow);
						if (fujaba__Success) {
							// statement node ''
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_201(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_65888 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_65639 = null;
		Step __DEC_normalStep_next_65639 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Actor actor = null;
		NormalStep normalStep = null;
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

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link steps from normalStep to flow
			JavaSDM.ensure(flow.equals(normalStep.eContainer()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_65888 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_65888 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_65888 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_65888
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_65888 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_65888
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

							// iterate to-many link next from normalStep to __DEC_normalStep_next_65639
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_65639 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_65639
											.hasNext()) {
								try {
									__DEC_normalStep_next_65639 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_65639
											.next();

									// check object __DEC_normalStep_next_65639 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_65639 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_65639 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_65639
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_65639 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_65639
											.equals(prevStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_steps is really bound
						JavaSDM.ensure(_edge_steps != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_steps to flow
						JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_steps to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_steps.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, actor, flow);
						if (fujaba__Success) {
							// statement node ''
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToStep inFlowToPrevStepDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		IntermediateThrowEvent event = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep eventToNormalStep = null;
		NormalStep normalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Step prevStep = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToPrevStepListToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToPrevStepList = null;
		RuleEntryList inFlowToPrevStepList = null;

		// story node 'create result'
		try {
			fujaba__Success = false;

			// create object ruleResult
			ruleResult = TGGRuntimeFactory.eINSTANCE
					.createModelgeneratorRuleResult();

			// create object isApplicableMatch
			isApplicableMatch = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableMatch();

			// assign attribute ruleResult
			ruleResult.setSuccess(false);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'is applicable core'
		try {
			fujaba__Success = false;

			// check object ruleEntryContainer is really bound
			JavaSDM.ensure(ruleEntryContainer != null);
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToPrevStepList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToPrevStepList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToPrevStepList
					.hasNext()) {
				try {
					inFlowToPrevStepList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToPrevStepList
							.next();

					// check object inFlowToPrevStepList is really bound
					JavaSDM.ensure(inFlowToPrevStepList != null);
					// iterate to-many link entryObjects from inFlowToPrevStepList to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterInFlowToPrevStepListToInFlowToPrevStep = new ArrayList(
							inFlowToPrevStepList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToPrevStepListToInFlowToPrevStep
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToPrevStepListToInFlowToPrevStep
									.next();

							// ensure correct type and really bound of object inFlowToPrevStep
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
							inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
							// bind object
							inFlow = inFlowToPrevStep.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof Process);
							process = (Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									inFlow));

							// bind object
							prevStep = inFlowToPrevStep.getTarget();

							// check object prevStep is really bound
							JavaSDM.ensure(prevStep != null);

							// iterate to-many link source from inFlow to inFlowToFlow
							fujaba__Success = false;

							fujaba__IterInFlowToInFlowToFlow = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(inFlow,
													SequenceFlowToUCFlow.class,
													"source")).iterator();

							while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
								try {
									inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
											.next();

									// check object inFlowToFlow is really bound
									JavaSDM.ensure(inFlowToFlow != null);
									// bind object
									flow = inFlowToFlow.getTarget();

									// check object flow is really bound
									JavaSDM.ensure(flow != null);

									// iterate to-many link source from process to processToActor
									fujaba__Success = false;

									fujaba__IterProcessToProcessToActor = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															process,
															ProcessToActor.class,
															"source"))
											.iterator();

									while (fujaba__IterProcessToProcessToActor
											.hasNext()) {
										try {
											processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
													.next();

											// check object processToActor is really bound
											JavaSDM.ensure(processToActor != null);
											// bind object
											actor = processToActor.getTarget();

											// check object actor is really bound
											JavaSDM.ensure(actor != null);

											// story node 'solve CSP'
											try {
												fujaba__Success = false;

												_TmpObject = (this
														.generateModel_solveCsp_BWD(
																isApplicableMatch,
																event,
																inFlow,
																prevStep,
																inFlowToPrevStep,
																normalStep,
																process,
																outFlow,
																actor,
																processToActor,
																eventToNormalStep,
																outFlowToNormalStep,
																flow,
																inFlowToFlow,
																outFlowToFlow,
																ruleResult));

												// ensure correct type and really bound of object csp
												JavaSDM.ensure(_TmpObject instanceof CSP);
												csp = (CSP) _TmpObject;
												fujaba__Success = true;
											} catch (JavaSDMException fujaba__InternalException) {
												fujaba__Success = false;
											}

											// statement node 'check CSP'
											fujaba__Success = this
													.generateModel_checkCsp_BWD(csp);
											if (fujaba__Success) {
												// story node 'perform'
												try {
													fujaba__Success = false;

													// check object actor is really bound
													JavaSDM.ensure(actor != null);
													// check object flow is really bound
													JavaSDM.ensure(flow != null);
													// check object inFlow is really bound
													JavaSDM.ensure(inFlow != null);
													// check object inFlowToFlow is really bound
													JavaSDM.ensure(inFlowToFlow != null);
													// check object inFlowToPrevStep is really bound
													JavaSDM.ensure(inFlowToPrevStep != null);
													// check object prevStep is really bound
													JavaSDM.ensure(prevStep != null);
													// check object process is really bound
													JavaSDM.ensure(process != null);
													// check object processToActor is really bound
													JavaSDM.ensure(processToActor != null);
													// check object ruleResult is really bound
													JavaSDM.ensure(ruleResult != null);
													// create object event
													event = Bpmn2Factory.eINSTANCE
															.createIntermediateThrowEvent();

													// create object outFlow
													outFlow = Bpmn2Factory.eINSTANCE
															.createSequenceFlow();

													// create object eventToNormalStep
													eventToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createFlowNodeToStep();

													// create object normalStep
													normalStep = UseCaseDSLFactory.eINSTANCE
															.createNormalStep();

													// create object outFlowToNormalStep
													outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToStep();

													// create object outFlowToFlow
													outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToUCFlow();

													// assign attribute event
													event.setId((java.lang.String) csp
															.getAttributeVariable(
																	"event",
																	"id")
															.getValue());
													// assign attribute event
													event.setName((java.lang.String) csp
															.getAttributeVariable(
																	"event",
																	"name")
															.getValue());
													// assign attribute normalStep
													normalStep
															.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"normalStep",
																			"name")
																	.getValue());
													// assign attribute normalStep
													normalStep
															.setLabel((java.lang.String) csp
																	.getAttributeVariable(
																			"normalStep",
																			"label")
																	.getValue());
													// assign attribute ruleResult
													ruleResult.setSuccess(true);

													// create link
													ruleResult
															.getSourceObjects()
															.add(event);

													// create link
													inFlow.setTargetRef(event);

													// create link
													process.getFlowElements()
															.add(event);

													// create link
													outFlow.setSourceRef(event);

													// create link
													eventToNormalStep
															.setSource(event);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	prevStep,
																	normalStep,
																	"next");

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	normalStep,
																	actor,
																	"actor");

													// create link
													outFlowToNormalStep
															.setTarget(normalStep);

													// create link
													eventToNormalStep
															.setTarget(normalStep);

													// create link
													ruleResult
															.getTargetObjects()
															.add(normalStep);

													// create link
													flow.getSteps().add(
															normalStep);

													// create link
													process.getFlowElements()
															.add(outFlow); // add link

													// create link
													ruleResult
															.getSourceObjects()
															.add(outFlow);

													// create link
													outFlowToNormalStep
															.setSource(outFlow);

													// create link
													outFlowToFlow
															.setSource(outFlow);

													// create link
													ruleResult
															.getCorrObjects()
															.add(eventToNormalStep);

													// create link
													ruleResult
															.getCorrObjects()
															.add(outFlowToNormalStep);

													// create link
													outFlowToFlow
															.setTarget(flow);

													// create link
													ruleResult.getCorrObjects()
															.add(outFlowToFlow);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												return ruleResult;

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateThrowEvent event, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, SequenceFlow outFlow, Actor actor,
			ProcessToActor processToActor, FlowNodeToStep eventToNormalStep,
			SequenceFlowToStep outFlowToNormalStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow,
			SequenceFlowToUCFlow outFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", csp);
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);

		// Create constraints
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_event_id, var_normalStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
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
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Step) arguments.get(3),
					(SequenceFlowToStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5),
					(SequenceFlow) arguments.get(6), (Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Flow) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_199__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_199((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_468__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_468((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_469__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_469((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_470__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_470((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_471__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_471((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_472__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_472((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_473__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_473((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_200__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_200((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_201__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_201((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Step) arguments.get(3),
					(SequenceFlowToStep) arguments.get(4),
					(NormalStep) arguments.get(5),
					(bpmn2.Process) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Actor) arguments.get(8),
					(ProcessToActor) arguments.get(9),
					(FlowNodeToStep) arguments.get(10),
					(SequenceFlowToStep) arguments.get(11),
					(Flow) arguments.get(12),
					(SequenceFlowToUCFlow) arguments.get(13),
					(SequenceFlowToUCFlow) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IntermediateThrowEventToStepRuleImpl
