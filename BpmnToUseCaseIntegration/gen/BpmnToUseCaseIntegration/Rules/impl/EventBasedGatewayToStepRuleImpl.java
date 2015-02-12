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

import BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule;
import BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule;
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
 * An implementation of the model object '<em><b>Event Based Gateway To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayToStepRuleImpl extends AbstractRuleImpl implements
		EventBasedGatewayToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEventBasedGatewayToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, inFlow,
					process, eventBasedGateway));

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

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "toBeTranslatedNodes");

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

				// create link
				__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__process_flowElements_eventBasedGateway
						.setTrg(eventBasedGateway);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
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
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, inFlow, process,
					eventBasedGateway);
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
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Step prevStep = null;
		Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep normalStep = null;
		FlowNodeToStep ebgToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge ebgToNormalStep__target__normalStep = null;
		EMoflonEdge ebgToNormalStep__source__eventBasedGateway = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge prevStep__next__normalStep = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("eventBasedGateway"));

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;
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
			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object ebgToNormalStep
			ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getAttributeVariable(
					"normalStep", "name").getValue());
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getAttributeVariable(
					"normalStep", "label").getValue());

			// create link
			ebgToNormalStep.setSource(eventBasedGateway);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(prevStep,
					normalStep, "next");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(normalStep,
					actor, "actor");

			// create link
			flow.getSteps().add(normalStep);

			// create link
			ebgToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects ebgToNormalStep and actor 
			JavaSDM.ensure(!ebgToNormalStep.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and actor 
			JavaSDM.ensure(!eventBasedGateway.equals(actor));

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

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects prevStep and ebgToNormalStep 
			JavaSDM.ensure(!prevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToActor and ebgToNormalStep 
			JavaSDM.ensure(!processToActor.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToPrevStep and eventBasedGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects prevStep and eventBasedGateway 
			JavaSDM.ensure(!prevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToActor and eventBasedGateway 
			JavaSDM.ensure(!processToActor.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

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

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __eventBasedGateway_incoming_inFlow
			__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_eventBasedGateway
			__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object prevStep__next__normalStep
			prevStep__next__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_eventBasedGateway
			__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EventBasedGatewayToStepRule");
			// assign attribute prevStep__next__normalStep
			prevStep__next__normalStep.setName("next");
			// assign attribute __process_flowElements_eventBasedGateway
			__process_flowElements_eventBasedGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_eventBasedGateway
			__inFlow_targetRef_eventBasedGateway.setName("targetRef");
			// assign attribute __eventBasedGateway_incoming_inFlow
			__eventBasedGateway_incoming_inFlow.setName("incoming");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");
			// assign attribute ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway.setName("source");
			// assign attribute ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__eventBasedGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__source__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__process_flowElements_eventBasedGateway,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					prevStep__next__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_eventBasedGateway, "translatedEdges");

			// create link
			__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

			// create link
			prevStep__next__normalStep.setSrc(prevStep);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			prevStep__next__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			ebgToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__process_flowElements_eventBasedGateway.setSrc(process);

			// create link
			__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

			// create link
			__process_flowElements_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			ebgToNormalStep__source__eventBasedGateway
					.setTrg(eventBasedGateway);

			// create link
			__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			ebgToNormalStep__target__normalStep.setSrc(ebgToNormalStep);

			// create link
			ebgToNormalStep__source__eventBasedGateway.setSrc(ebgToNormalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep);
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
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow inFlow = null;
		Process process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __processToActor_source_process = null;
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
			ruleresult.setRule("EventBasedGatewayToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("eventBasedGateway"));

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
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
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
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
										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

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

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
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

										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway
												.setName("targetRef");
										// assign attribute __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow
												.setName("incoming");
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
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setSrc(inFlow);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setTrg(inFlow);

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
														prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__process_flowElements_eventBasedGateway
												.setSrc(process);

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
										__inFlow_targetRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__process_flowElements_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setSrc(eventBasedGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														eventBasedGateway);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

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
														__processToActor_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__eventBasedGateway_incoming_inFlow,
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
														__process_flowElements_eventBasedGateway,
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
														__inFlow_targetRef_eventBasedGateway,
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
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_source_inFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															inFlow, prevStep,
															inFlowToPrevStep,
															process,
															eventBasedGateway,
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
														.setRuleName("EventBasedGatewayToStepRule");

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
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("eventBasedGateway", eventBasedGateway);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", true, csp);
		var_eventBasedGateway_id.setValue(eventBasedGateway.getId());
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", true, csp);
		var_eventBasedGateway_name.setValue(eventBasedGateway.getName());

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
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("eventBasedGateway").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEventBasedGateway());
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
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __prevStep_next_normalStep = null;

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

				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __prevStep_next_normalStep
				__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __prevStep_next_normalStep
				__prevStep_next_normalStep.setName("next");
				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__prevStep_next_normalStep, "toBeTranslatedEdges");

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
						prevStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");
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
		EventBasedGateway eventBasedGateway = null;
		FlowNodeToStep ebgToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge ebgToNormalStep__source__eventBasedGateway = null;
		EMoflonEdge eventBasedGateway__incoming__inFlow = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge inFlow__targetRef__eventBasedGateway = null;
		EMoflonEdge process__flowElements__eventBasedGateway = null;
		EMoflonEdge ebgToNormalStep__target__normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;

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
			// create object eventBasedGateway
			eventBasedGateway = Bpmn2Factory.eINSTANCE
					.createEventBasedGateway();

			// create object ebgToNormalStep
			ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// assign attribute eventBasedGateway
			eventBasedGateway
					.setId((java.lang.String) csp.getAttributeVariable(
							"eventBasedGateway", "id").getValue());
			// assign attribute eventBasedGateway
			eventBasedGateway.setName((java.lang.String) csp
					.getAttributeVariable("eventBasedGateway", "name")
					.getValue());
			// assign attribute eventBasedGateway
			eventBasedGateway.setGatewayDirection((bpmn2.GatewayDirection) csp
					.getAttributeVariable("eventBasedGateway",
							"gatewayDirection").getValue());

			// create link
			eventBasedGateway.getIncoming().add(inFlow);

			// create link
			ebgToNormalStep.setTarget(normalStep);

			// create link
			process.getFlowElements().add(eventBasedGateway); // add link

			// create link
			ebgToNormalStep.setSource(eventBasedGateway);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects ebgToNormalStep and actor 
			JavaSDM.ensure(!ebgToNormalStep.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and actor 
			JavaSDM.ensure(!eventBasedGateway.equals(actor));

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

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects prevStep and ebgToNormalStep 
			JavaSDM.ensure(!prevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToActor and ebgToNormalStep 
			JavaSDM.ensure(!processToActor.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToPrevStep and eventBasedGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects prevStep and eventBasedGateway 
			JavaSDM.ensure(!prevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToActor and eventBasedGateway 
			JavaSDM.ensure(!processToActor.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

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

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventBasedGateway__incoming__inFlow
			eventBasedGateway__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __prevStep_next_normalStep
			__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__eventBasedGateway
			inFlow__targetRef__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__eventBasedGateway
			process__flowElements__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EventBasedGatewayToStepRule");
			// assign attribute __prevStep_next_normalStep
			__prevStep_next_normalStep.setName("next");
			// assign attribute process__flowElements__eventBasedGateway
			process__flowElements__eventBasedGateway.setName("flowElements");
			// assign attribute inFlow__targetRef__eventBasedGateway
			inFlow__targetRef__eventBasedGateway.setName("targetRef");
			// assign attribute eventBasedGateway__incoming__inFlow
			eventBasedGateway__incoming__inFlow.setName("incoming");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");
			// assign attribute ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway.setName("source");
			// assign attribute ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__source__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__prevStep_next_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			inFlow__targetRef__eventBasedGateway.setSrc(inFlow);

			// create link
			eventBasedGateway__incoming__inFlow.setTrg(inFlow);

			// create link
			__prevStep_next_normalStep.setSrc(prevStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			ebgToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__prevStep_next_normalStep.setTrg(normalStep);

			// create link
			process__flowElements__eventBasedGateway.setSrc(process);

			// create link
			eventBasedGateway__incoming__inFlow.setSrc(eventBasedGateway);

			// create link
			process__flowElements__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			ebgToNormalStep__source__eventBasedGateway
					.setTrg(eventBasedGateway);

			// create link
			inFlow__targetRef__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			ebgToNormalStep__target__normalStep.setSrc(ebgToNormalStep);

			// create link
			ebgToNormalStep__source__eventBasedGateway.setSrc(ebgToNormalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep);
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
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterPrevStepToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;

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
			ruleresult.setRule("EventBasedGatewayToStepRule");

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

			// iterate to-many link target from prevStep to inFlowToPrevStep
			fujaba__Success = false;

			fujaba__IterPrevStepToInFlowToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							prevStep, SequenceFlowToStep.class, "target"))
					.iterator();

			while (fujaba__IterPrevStepToInFlowToPrevStep.hasNext()) {
				try {
					inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterPrevStepToInFlowToPrevStep
							.next();

					// check object inFlowToPrevStep is really bound
					JavaSDM.ensure(inFlowToPrevStep != null);
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

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __prevStep_next_normalStep
										__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_actor_actor
										__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
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
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										__prevStep_next_normalStep
												.setSrc(prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										__prevStep_next_normalStep
												.setTrg(normalStep);

										// create link
										__normalStep_actor_actor
												.setSrc(normalStep);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										__normalStep_actor_actor.setTrg(actor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

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
														__prevStep_next_normalStep,
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
														__inFlowToFlow_target_flow,
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
														__processToActor_target_actor,
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
														__process_flowElements_inFlow,
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
														__normalStep_actor_actor,
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
														.setRuleName("EventBasedGatewayToStepRule");

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
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);

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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_89(
			EMoflonEdge _edge_next) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_203634 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_817725 = null;
		Step __DEC_normalStep_next_817725 = null;
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
					__DEC_normalStep_steps_203634 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_203634 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_203634 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_203634.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_203634 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_203634.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_817725
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_817725 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_817725
									.hasNext()) {
						try {
							__DEC_normalStep_next_817725 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_817725
									.next();

							// check object __DEC_normalStep_next_817725 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_817725 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_817725 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_817725
									.equals(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_next_817725 and prevStep 
							JavaSDM.ensure(!__DEC_normalStep_next_817725
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_215(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_932847 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_287726 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_287726 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;
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

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

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
					// check link incoming from inFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(inFlow
							.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_eventBasedGateway_flowElements_932847 = eventBasedGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
									.eContainer() : null;

							// check object __DEC_eventBasedGateway_flowElements_932847 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_932847 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_932847
									.getFlowElements().contains(
											eventBasedGateway));

							// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_932847 and process 
							JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_932847
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from eventBasedGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(eventBasedGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_287726
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_287726 = new ArrayList(
									eventBasedGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_287726
											.hasNext()) {
								try {
									__DEC_eventBasedGateway_targetRef_287726 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_287726
											.next();

									// check object __DEC_eventBasedGateway_targetRef_287726 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_287726 != null);
									// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_287726 and inFlow 
									JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_287726
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link trg from _edge_flowElements to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway
								.equals(_edge_flowElements.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, eventBasedGateway);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_216(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_877326 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_4872 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_4872 = null;
		Match match = null;
		Process process = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;

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
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link incoming from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_eventBasedGateway_flowElements_877326 = eventBasedGateway
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
							.eContainer() : null;

					// check object __DEC_eventBasedGateway_flowElements_877326 is really bound
					JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_877326 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_877326
							.getFlowElements().contains(eventBasedGateway));

					// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_877326 and process 
					JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_877326
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from eventBasedGateway
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(eventBasedGateway, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_4872
					fujaba__Success = false;

					fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_4872 = new ArrayList(
							eventBasedGateway.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_4872
									.hasNext()) {
						try {
							__DEC_eventBasedGateway_targetRef_4872 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_4872
									.next();

							// check object __DEC_eventBasedGateway_targetRef_4872 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_4872 != null);
							// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_4872 and inFlow 
							JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_4872
									.equals(inFlow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
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
				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from eventBasedGateway to process
				JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link incoming from inFlow to eventBasedGateway
				JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link trg from _edge_targetRef to eventBasedGateway
				JavaSDM.ensure(eventBasedGateway.equals(_edge_targetRef
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, inFlow,
						process, eventBasedGateway);
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

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_217(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_230326 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_403158 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_403158 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Process process = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;

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

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link incoming from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link src from inFlow to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterInFlowTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
							.next();

					// check object _edge_targetRef is really bound
					JavaSDM.ensure(_edge_targetRef != null);
					// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
					JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

					// check link trg from _edge_targetRef to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(_edge_targetRef
							.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_eventBasedGateway_flowElements_230326 = eventBasedGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
									.eContainer() : null;

							// check object __DEC_eventBasedGateway_flowElements_230326 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_230326 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_230326
									.getFlowElements().contains(
											eventBasedGateway));

							// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_230326 and process 
							JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_230326
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from eventBasedGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(eventBasedGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_403158
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_403158 = new ArrayList(
									eventBasedGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_403158
											.hasNext()) {
								try {
									__DEC_eventBasedGateway_targetRef_403158 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_403158
											.next();

									// check object __DEC_eventBasedGateway_targetRef_403158 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_403158 != null);
									// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_403158 and inFlow 
									JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_403158
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_incoming to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(_edge_incoming
								.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, eventBasedGateway);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_90(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_872900 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_592666 = null;
		Step __DEC_normalStep_next_592666 = null;
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
							__DEC_normalStep_steps_872900 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_872900 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_872900 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_872900
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_872900 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_872900
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

							// iterate to-many link next from normalStep to __DEC_normalStep_next_592666
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_592666 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_592666
											.hasNext()) {
								try {
									__DEC_normalStep_next_592666 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_592666
											.next();

									// check object __DEC_normalStep_next_592666 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_592666 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_592666 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_592666
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_592666 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_592666
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_91(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_921988 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_633535 = null;
		Step __DEC_normalStep_next_633535 = null;
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
							__DEC_normalStep_steps_921988 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_921988 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_921988 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_921988
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_921988 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_921988
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

							// iterate to-many link next from normalStep to __DEC_normalStep_next_633535
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_633535 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_633535
											.hasNext()) {
								try {
									__DEC_normalStep_next_633535 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_633535
											.next();

									// check object __DEC_normalStep_next_633535 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_633535 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_633535 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_633535
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_633535 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_633535
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
		EventBasedGateway eventBasedGateway = null;
		NormalStep normalStep = null;
		FlowNodeToStep ebgToNormalStep = null;
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
																inFlow,
																prevStep,
																inFlowToPrevStep,
																normalStep,
																process,
																eventBasedGateway,
																actor,
																processToActor,
																flow,
																inFlowToFlow,
																ebgToNormalStep,
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
													// create object eventBasedGateway
													eventBasedGateway = Bpmn2Factory.eINSTANCE
															.createEventBasedGateway();

													// create object normalStep
													normalStep = UseCaseDSLFactory.eINSTANCE
															.createNormalStep();

													// create object ebgToNormalStep
													ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createFlowNodeToStep();

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
													// assign attribute eventBasedGateway
													eventBasedGateway
															.setId((java.lang.String) csp
																	.getAttributeVariable(
																			"eventBasedGateway",
																			"id")
																	.getValue());
													// assign attribute eventBasedGateway
													eventBasedGateway
															.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"eventBasedGateway",
																			"name")
																	.getValue());
													// assign attribute eventBasedGateway
													eventBasedGateway
															.setGatewayDirection((bpmn2.GatewayDirection) csp
																	.getAttributeVariable(
																			"eventBasedGateway",
																			"gatewayDirection")
																	.getValue());
													// assign attribute ruleResult
													ruleResult.setSuccess(true);

													// create link
													eventBasedGateway
															.getIncoming().add(
																	inFlow);

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
													ebgToNormalStep
															.setTarget(normalStep);

													// create link
													flow.getSteps().add(
															normalStep);

													// create link
													ruleResult
															.getTargetObjects()
															.add(normalStep);

													// create link
													process.getFlowElements()
															.add(eventBasedGateway); // add link

													// create link
													ebgToNormalStep
															.setSource(eventBasedGateway);

													// create link
													ruleResult
															.getSourceObjects()
															.add(eventBasedGateway);

													// create link
													ruleResult
															.getCorrObjects()
															.add(ebgToNormalStep);

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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, FlowNodeToStep ebgToNormalStep,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);

		// Create constraints
		Eq_modelgenGatewayDirection eq_modelgenGatewayDirection = new Eq_modelgenGatewayDirection();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenGatewayDirection);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenGatewayDirection.setRuleName("");
		eq_modelgenGatewayDirection.solve(
				var_eventBasedGateway_gatewayDirection, literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_eventBasedGateway_name, var_normalStep_label);

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
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, eventBasedGateway));

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

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "toBeTranslatedNodes");

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_eventBasedGateway
						.setTrg(eventBasedGateway);

				// create link
				__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

				// create link
				__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					eventBasedGateway);
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
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("eventBasedGateway", eventBasedGateway);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", true, csp);
		var_eventBasedGateway_id.setValue(eventBasedGateway.getId());
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", true, csp);
		var_eventBasedGateway_name.setValue(eventBasedGateway.getName());

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
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;

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
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, actor,
					normalStep, flow));

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
				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				__normalStep_actor_actor.setTrg(actor);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

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

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, actor, normalStep, flow);
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
	public void registerObjectsToMatch_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		match.registerObject("actor", actor);
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
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
			bpmn2.Process process, SequenceFlow inFlow, Actor actor,
			ProcessToActor processToActor, NormalStep normalStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_178(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_547050 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_499708 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_499708 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;
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

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

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
					// check link incoming from inFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(inFlow
							.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_eventBasedGateway_flowElements_547050 = eventBasedGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
									.eContainer() : null;

							// check object __DEC_eventBasedGateway_flowElements_547050 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_547050 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_547050
									.getFlowElements().contains(
											eventBasedGateway));

							// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_547050 and process 
							JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_547050
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from eventBasedGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(eventBasedGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_499708
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_499708 = new ArrayList(
									eventBasedGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_499708
											.hasNext()) {
								try {
									__DEC_eventBasedGateway_targetRef_499708 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_499708
											.next();

									// check object __DEC_eventBasedGateway_targetRef_499708 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_499708 != null);
									// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_499708 and inFlow 
									JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_499708
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link trg from _edge_flowElements to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway
								.equals(_edge_flowElements.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, eventBasedGateway);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_179(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_12378 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_836450 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_836450 = null;
		Match match = null;
		Process process = null;
		EventBasedGateway eventBasedGateway = null;
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

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = eventBasedGateway.eContainer() instanceof Process ? (Process) eventBasedGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements()
					.contains(eventBasedGateway));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link incoming from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_eventBasedGateway_flowElements_12378 = eventBasedGateway
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
							.eContainer() : null;

					// check object __DEC_eventBasedGateway_flowElements_12378 is really bound
					JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_12378 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_12378
							.getFlowElements().contains(eventBasedGateway));

					// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_12378 and process 
					JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_12378
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from eventBasedGateway
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(eventBasedGateway, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_836450
					fujaba__Success = false;

					fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_836450 = new ArrayList(
							eventBasedGateway.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_836450
									.hasNext()) {
						try {
							__DEC_eventBasedGateway_targetRef_836450 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_836450
									.next();

							// check object __DEC_eventBasedGateway_targetRef_836450 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_836450 != null);
							// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_836450 and inFlow 
							JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_836450
									.equals(inFlow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
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
				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from eventBasedGateway to process
				JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link incoming from inFlow to eventBasedGateway
				JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link trg from _edge_targetRef to eventBasedGateway
				JavaSDM.ensure(eventBasedGateway.equals(_edge_targetRef
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, process,
						inFlow, eventBasedGateway);
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

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_180(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_68733 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_214306 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_214306 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		SequenceFlow inFlow = null;
		Process process = null;
		EventBasedGateway eventBasedGateway = null;

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

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = eventBasedGateway.eContainer() instanceof Process ? (Process) eventBasedGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements()
					.contains(eventBasedGateway));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link incoming from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link trg from eventBasedGateway to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, EMoflonEdge.class, "trg"))
					.iterator();

			while (fujaba__IterEventBasedGatewayTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterEventBasedGatewayTo_edge_targetRef
							.next();

					// check object _edge_targetRef is really bound
					JavaSDM.ensure(_edge_targetRef != null);
					// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
					JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

					// check link src from _edge_targetRef to inFlow
					JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_eventBasedGateway_flowElements_68733 = eventBasedGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
									.eContainer() : null;

							// check object __DEC_eventBasedGateway_flowElements_68733 is really bound
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_68733 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_68733
									.getFlowElements().contains(
											eventBasedGateway));

							// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_68733 and process 
							JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_68733
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from eventBasedGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(eventBasedGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from eventBasedGateway to __DEC_eventBasedGateway_targetRef_214306
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_214306 = new ArrayList(
									eventBasedGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_214306
											.hasNext()) {
								try {
									__DEC_eventBasedGateway_targetRef_214306 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_214306
											.next();

									// check object __DEC_eventBasedGateway_targetRef_214306 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_214306 != null);
									// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_214306 and inFlow 
									JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_214306
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_incoming to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(_edge_incoming
								.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, eventBasedGateway);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_74(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_314930 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_833280 = null;
		Step __DEC_normalStep_next_833280 = null;
		Match match = null;
		Actor actor = null;
		Flow flow = null;
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
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// bind object
			_TmpObject = _edge_actor.getTrg();

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;

			// check link actor from normalStep to actor
			JavaSDM.ensure(actor.equals(normalStep.getActor()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_314930 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_314930 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_314930 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_314930.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_314930 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_314930.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_833280
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_833280 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_833280
									.hasNext()) {
						try {
							__DEC_normalStep_next_833280 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_833280
									.next();

							// check object __DEC_normalStep_next_833280 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_833280 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_833280 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_833280
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
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

				// check object _edge_actor is really bound
				JavaSDM.ensure(_edge_actor != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

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
				fujaba__Success = this.isAppropriate_BWD(match, actor,
						normalStep, flow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_75(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_316707 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_148261 = null;
		Step __DEC_normalStep_next_148261 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_316707 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_316707 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_316707 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_316707.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_316707 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_316707.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_148261
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_148261 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_148261
									.hasNext()) {
						try {
							__DEC_normalStep_next_148261 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_148261
									.next();

							// check object __DEC_normalStep_next_148261 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_148261 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_148261 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_148261
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
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

				// check object _edge_steps is really bound
				JavaSDM.ensure(_edge_steps != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

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
				fujaba__Success = this.isAppropriate_BWD(match, actor,
						normalStep, flow);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		EventBasedGateway eventBasedGateway = null;
		FlowNodeToStep ebgToNormalStep = null;
		NormalStep normalStep = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Flow flow = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToFlowListToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToFlowList = null;
		RuleEntryList inFlowToFlowList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToFlowList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToFlowList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToFlowList.hasNext()) {
				try {
					inFlowToFlowList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToFlowList
							.next();

					// check object inFlowToFlowList is really bound
					JavaSDM.ensure(inFlowToFlowList != null);
					// iterate to-many link entryObjects from inFlowToFlowList to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterInFlowToFlowListToInFlowToFlow = new ArrayList(
							inFlowToFlowList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToFlowListToInFlowToFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToFlowListToInFlowToFlow
									.next();

							// ensure correct type and really bound of object inFlowToFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
							inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
							// bind object
							inFlow = inFlowToFlow.getSource();

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
							flow = inFlowToFlow.getTarget();

							// check object flow is really bound
							JavaSDM.ensure(flow != null);

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

									// story node 'solve CSP'
									try {
										fujaba__Success = false;

										_TmpObject = (this
												.generateModel_solveCsp_BWD(
														isApplicableMatch,
														process, inFlow,
														eventBasedGateway,
														actor, processToActor,
														normalStep, flow,
														inFlowToFlow,
														ebgToNormalStep,
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
											// check object process is really bound
											JavaSDM.ensure(process != null);
											// check object processToActor is really bound
											JavaSDM.ensure(processToActor != null);
											// check object ruleResult is really bound
											JavaSDM.ensure(ruleResult != null);
											// create object eventBasedGateway
											eventBasedGateway = Bpmn2Factory.eINSTANCE
													.createEventBasedGateway();

											// create object ebgToNormalStep
											ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
													.createFlowNodeToStep();

											// create object normalStep
											normalStep = UseCaseDSLFactory.eINSTANCE
													.createNormalStep();

											// assign attribute eventBasedGateway
											eventBasedGateway
													.setId((java.lang.String) csp
															.getAttributeVariable(
																	"eventBasedGateway",
																	"id")
															.getValue());
											// assign attribute eventBasedGateway
											eventBasedGateway
													.setName((java.lang.String) csp
															.getAttributeVariable(
																	"eventBasedGateway",
																	"name")
															.getValue());
											// assign attribute eventBasedGateway
											eventBasedGateway
													.setGatewayDirection((bpmn2.GatewayDirection) csp
															.getAttributeVariable(
																	"eventBasedGateway",
																	"gatewayDirection")
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
											process.getFlowElements().add(
													eventBasedGateway); // add link

											// create link
											eventBasedGateway.getIncoming()
													.add(inFlow);

											// create link
											ebgToNormalStep
													.setSource(eventBasedGateway);

											// create link
											ruleResult.getSourceObjects().add(
													eventBasedGateway);

											// create link
											normalStep.setActor(actor);

											// create link
											ebgToNormalStep
													.setTarget(normalStep);

											// create link
											ruleResult.getTargetObjects().add(
													normalStep);

											// create link
											flow.getSteps().add(normalStep);

											// create link
											ruleResult.getCorrObjects().add(
													ebgToNormalStep);

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, NormalStep normalStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, FlowNodeToStep ebgToNormalStep,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);

		// Create constraints
		Eq_modelgenGatewayDirection eq_modelgenGatewayDirection = new Eq_modelgenGatewayDirection();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenGatewayDirection);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenGatewayDirection.setRuleName("");
		eq_modelgenGatewayDirection.solve(
				var_eventBasedGateway_gatewayDirection, literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EventBasedGatewayToStepCoreRule.class) {
			switch (baseOperationID) {
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP;
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
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(EventBasedGateway) arguments.get(5),
					(Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_89((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_215__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_215((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_216__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_216((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_217__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_217((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_90((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_91((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5),
					(EventBasedGateway) arguments.get(6),
					(Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Flow) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10),
					(FlowNodeToStep) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Actor) arguments.get(4),
					(ProcessToActor) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Actor) arguments.get(3),
					(ProcessToActor) arguments.get(4),
					(NormalStep) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_178((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_179((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_180((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_74((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_75((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Actor) arguments.get(4),
					(ProcessToActor) arguments.get(5),
					(NormalStep) arguments.get(6), (Flow) arguments.get(7),
					(SequenceFlowToUCFlow) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EventBasedGatewayToStepRuleImpl
