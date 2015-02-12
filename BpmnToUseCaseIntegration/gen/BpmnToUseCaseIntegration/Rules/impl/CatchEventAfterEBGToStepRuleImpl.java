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

import BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule;
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
 * An implementation of the model object '<em><b>Catch Event After EBG To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CatchEventAfterEBGToStepRuleImpl extends AbstractRuleImpl
		implements CatchEventAfterEBGToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventAfterEBGToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCatchEventAfterEBGToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow, IntermediateCatchEvent intermediateCatchEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, eventBasedGateway, outFlow, intermediateCatchEvent));

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
				// check object intermediateCatchEvent is really bound
				JavaSDM.ensure(intermediateCatchEvent != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __intermediateCatchEvent_incoming_outFlow
				__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_eventBasedGateway
				__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_outgoing_outFlow
				__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_targetRef_intermediateCatchEvent
				__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_intermediateCatchEvent
				__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_intermediateCatchEvent
				__process_flowElements_intermediateCatchEvent
						.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __outFlow_sourceRef_eventBasedGateway
				__outFlow_sourceRef_eventBasedGateway.setName("sourceRef");
				// assign attribute __eventBasedGateway_outgoing_outFlow
				__eventBasedGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __outFlow_targetRef_intermediateCatchEvent
				__outFlow_targetRef_intermediateCatchEvent.setName("targetRef");
				// assign attribute __intermediateCatchEvent_incoming_outFlow
				__intermediateCatchEvent_incoming_outFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__intermediateCatchEvent_incoming_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						intermediateCatchEvent, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_targetRef_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_intermediateCatchEvent.setSrc(process);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__outFlow_sourceRef_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__eventBasedGateway_outgoing_outFlow.setSrc(eventBasedGateway);

				// create link
				__outFlow_sourceRef_eventBasedGateway.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__intermediateCatchEvent_incoming_outFlow.setTrg(outFlow);

				// create link
				__outFlow_targetRef_intermediateCatchEvent.setSrc(outFlow);

				// create link
				__eventBasedGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

				// create link
				__intermediateCatchEvent_incoming_outFlow
						.setSrc(intermediateCatchEvent);

				// create link
				__outFlow_targetRef_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

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
				// check object intermediateCatchEvent is really bound
				JavaSDM.ensure(intermediateCatchEvent != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_eventBasedGateway, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

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

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					eventBasedGateway, outFlow, intermediateCatchEvent);
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
		FlowNodeToStep ebgToNormalStep = null;
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlowToUCFlow outFlowToAlternativeFlow = null;
		SequenceFlowToAlternativeFlowAlternative outFlowToAlt = null;
		IntermediateCatchEventToAlternativeFlow iceToAltFlow = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge iceToAltFlow__target__alternativeFlow = null;
		EMoflonEdge alt__ref__alternativeFlow = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge normalStep__stepAlternative__alt = null;
		EMoflonEdge iceToAltFlow__source__intermediateCatchEvent = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__target__alternativeFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge useCase__flows__alternativeFlow = null;
		EMoflonEdge outFlowToAlt__target__alt = null;
		EMoflonEdge outFlowToAlternativeFlow__source__outFlow = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("ebgToNormalStep"));

			// ensure correct type and really bound of object ebgToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			ebgToNormalStep = (FlowNodeToStep) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("intermediateCatchEvent"));

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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
			// create object outFlowToAlternativeFlow
			outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToAlternativeFlowAlternative();

			// create object iceToAltFlow
			iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createIntermediateCatchEventToAlternativeFlow();

			// create object alternativeFlow
			alternativeFlow = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlow();

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// assign attribute alt
			alt.setCondition((java.lang.String) csp.getAttributeVariable("alt",
					"condition").getValue());
			// assign attribute alternativeFlow
			alternativeFlow
					.setName((java.lang.String) csp.getAttributeVariable(
							"alternativeFlow", "name").getValue());

			// create link
			outFlowToAlternativeFlow.setSource(outFlow);

			// create link
			outFlowToAlt.setSource(outFlow);

			// create link
			iceToAltFlow.setSource(intermediateCatchEvent);

			// create link
			useCase.getFlows().add(alternativeFlow); // add link

			// create link
			normalStep.getStepAlternative().add(alt); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt,
					alternativeFlow, "ref");

			// create link
			outFlowToAlt.setTarget(alt);

			// create link
			iceToAltFlow.setTarget(alternativeFlow);

			// create link
			outFlowToAlternativeFlow.setTarget(alternativeFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object outFlowToAlternativeFlow is really bound
			JavaSDM.ensure(outFlowToAlternativeFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object outFlowToAlternativeFlow is really bound
			JavaSDM.ensure(outFlowToAlternativeFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects alternativeFlow and alt 
			JavaSDM.ensure(!alternativeFlow.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alt 
			JavaSDM.ensure(!ebgToNormalStep.equals(alt));

			// check isomorphic binding between objects eventBasedGateway and alt 
			JavaSDM.ensure(!eventBasedGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects iceToAltFlow and alt 
			JavaSDM.ensure(!iceToAltFlow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects intermediateCatchEvent and alt 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToAlt and alt 
			JavaSDM.ensure(!outFlowToAlt.equals(alt));

			// check isomorphic binding between objects outFlowToAlternativeFlow and alt 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects processToUseCase and alt 
			JavaSDM.ensure(!processToUseCase.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and alternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and alternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlow and alternativeFlow 
			JavaSDM.ensure(!inFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and alternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alternativeFlow));

			// check isomorphic binding between objects normalStep and alternativeFlow 
			JavaSDM.ensure(!normalStep.equals(alternativeFlow));

			// check isomorphic binding between objects outFlow and alternativeFlow 
			JavaSDM.ensure(!outFlow.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(alternativeFlow));

			// check isomorphic binding between objects process and alternativeFlow 
			JavaSDM.ensure(!process.equals(alternativeFlow));

			// check isomorphic binding between objects processToUseCase and alternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(alternativeFlow));

			// check isomorphic binding between objects useCase and alternativeFlow 
			JavaSDM.ensure(!useCase.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects iceToAltFlow and ebgToNormalStep 
			JavaSDM.ensure(!iceToAltFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects intermediateCatchEvent and ebgToNormalStep 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToUseCase and ebgToNormalStep 
			JavaSDM.ensure(!processToUseCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects useCase and ebgToNormalStep 
			JavaSDM.ensure(!useCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and eventBasedGateway 
			JavaSDM.ensure(!iceToAltFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects intermediateCatchEvent and eventBasedGateway 
			JavaSDM.ensure(!intermediateCatchEvent.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlt and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlternativeFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToUseCase and eventBasedGateway 
			JavaSDM.ensure(!processToUseCase.equals(eventBasedGateway));

			// check isomorphic binding between objects useCase and eventBasedGateway 
			JavaSDM.ensure(!useCase.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and flow 
			JavaSDM.ensure(!iceToAltFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects intermediateCatchEvent and flow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToAlt and flow 
			JavaSDM.ensure(!outFlowToAlt.equals(flow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and flow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects intermediateCatchEvent and iceToAltFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(iceToAltFlow));

			// check isomorphic binding between objects normalStep and iceToAltFlow 
			JavaSDM.ensure(!normalStep.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlt and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects process and iceToAltFlow 
			JavaSDM.ensure(!process.equals(iceToAltFlow));

			// check isomorphic binding between objects processToUseCase and iceToAltFlow 
			JavaSDM.ensure(!processToUseCase.equals(iceToAltFlow));

			// check isomorphic binding between objects useCase and iceToAltFlow 
			JavaSDM.ensure(!useCase.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and inFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlowToFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and intermediateCatchEvent 
			JavaSDM.ensure(!normalStep.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlow.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlt and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlt.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlternativeFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlternativeFlow
					.equals(intermediateCatchEvent));

			// check isomorphic binding between objects process and intermediateCatchEvent 
			JavaSDM.ensure(!process.equals(intermediateCatchEvent));

			// check isomorphic binding between objects processToUseCase and intermediateCatchEvent 
			JavaSDM.ensure(!processToUseCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects useCase and intermediateCatchEvent 
			JavaSDM.ensure(!useCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and normalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and normalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToUseCase and normalStep 
			JavaSDM.ensure(!processToUseCase.equals(normalStep));

			// check isomorphic binding between objects useCase and normalStep 
			JavaSDM.ensure(!useCase.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and outFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(outFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and outFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToUseCase and outFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlow));

			// check isomorphic binding between objects useCase and outFlow 
			JavaSDM.ensure(!useCase.equals(outFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and outFlowToAlt 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(outFlowToAlt));

			// check isomorphic binding between objects process and outFlowToAlt 
			JavaSDM.ensure(!process.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and outFlowToAlt 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlt));

			// check isomorphic binding between objects useCase and outFlowToAlt 
			JavaSDM.ensure(!useCase.equals(outFlowToAlt));

			// check isomorphic binding between objects process and outFlowToAlternativeFlow 
			JavaSDM.ensure(!process.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and outFlowToAlternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects useCase and outFlowToAlternativeFlow 
			JavaSDM.ensure(!useCase.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__alternativeFlow
			alt__ref__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_targetRef_intermediateCatchEvent
			__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_eventBasedGateway
			__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __intermediateCatchEvent_incoming_outFlow
			__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_intermediateCatchEvent
			__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __eventBasedGateway_outgoing_outFlow
			__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("CatchEventAfterEBGToStepRule");
			// assign attribute __process_flowElements_intermediateCatchEvent
			__process_flowElements_intermediateCatchEvent
					.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __outFlow_sourceRef_eventBasedGateway
			__outFlow_sourceRef_eventBasedGateway.setName("sourceRef");
			// assign attribute __eventBasedGateway_outgoing_outFlow
			__eventBasedGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute __outFlow_targetRef_intermediateCatchEvent
			__outFlow_targetRef_intermediateCatchEvent.setName("targetRef");
			// assign attribute __intermediateCatchEvent_incoming_outFlow
			__intermediateCatchEvent_incoming_outFlow.setName("incoming");
			// assign attribute useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow.setName("flows");
			// assign attribute normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt.setName("stepAlternative");
			// assign attribute alt__ref__alternativeFlow
			alt__ref__alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow.setName("source");
			// assign attribute outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow.setName("target");
			// assign attribute iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent.setName("source");
			// assign attribute iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__target__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_targetRef_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_eventBasedGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__intermediateCatchEvent_incoming_outFlow,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__source__intermediateCatchEvent,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__eventBasedGateway_outgoing_outFlow, "translatedEdges");

			// create link
			__process_flowElements_intermediateCatchEvent.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__eventBasedGateway_outgoing_outFlow.setSrc(eventBasedGateway);

			// create link
			__outFlow_sourceRef_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			__intermediateCatchEvent_incoming_outFlow.setTrg(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_eventBasedGateway.setSrc(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_targetRef_intermediateCatchEvent.setSrc(outFlow);

			// create link
			__eventBasedGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow.setTrg(outFlow);

			// create link
			__intermediateCatchEvent_incoming_outFlow
					.setSrc(intermediateCatchEvent);

			// create link
			__outFlow_targetRef_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			iceToAltFlow__source__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__process_flowElements_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			useCase__flows__alternativeFlow.setSrc(useCase);

			// create link
			normalStep__stepAlternative__alt.setSrc(normalStep);

			// create link
			alt__ref__alternativeFlow.setSrc(alt);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			normalStep__stepAlternative__alt.setTrg(alt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			useCase__flows__alternativeFlow.setTrg(alternativeFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			alt__ref__alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			iceToAltFlow__source__intermediateCatchEvent.setSrc(iceToAltFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setSrc(iceToAltFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				outFlowToAlternativeFlow, iceToAltFlow);
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
		IntermediateCatchEvent intermediateCatchEvent = null;
		SequenceFlow outFlow = null;
		Process process = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge __ebgToNormalStep_source_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __ebgToNormalStep_target_normalStep = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterEventBasedGatewayToEbgToNormalStep = null;
		FlowNodeToStep ebgToNormalStep = null;

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
			ruleresult.setRule("CatchEventAfterEBGToStepRule");

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
			_TmpObject = (match.getObject("intermediateCatchEvent"));

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
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

			// iterate to-many link source from eventBasedGateway to ebgToNormalStep
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayToEbgToNormalStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, FlowNodeToStep.class, "source"))
					.iterator();

			while (fujaba__IterEventBasedGatewayToEbgToNormalStep.hasNext()) {
				try {
					ebgToNormalStep = (FlowNodeToStep) fujaba__IterEventBasedGatewayToEbgToNormalStep
							.next();

					// check object ebgToNormalStep is really bound
					JavaSDM.ensure(ebgToNormalStep != null);
					// bind object
					_TmpObject = ebgToNormalStep.getTarget();

					// ensure correct type and really bound of object normalStep
					JavaSDM.ensure(_TmpObject instanceof NormalStep);
					normalStep = (NormalStep) _TmpObject;

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

							// iterate to-many link source from process to processToUseCase
							fujaba__Success = false;

							fujaba__IterProcessToProcessToUseCase = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToUseCase.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToUseCase
									.hasNext()) {
								try {
									processToUseCase = (ProcessToUseCase) fujaba__IterProcessToProcessToUseCase
											.next();

									// check object processToUseCase is really bound
									JavaSDM.ensure(processToUseCase != null);
									// bind object
									useCase = processToUseCase.getTarget();

									// check object useCase is really bound
									JavaSDM.ensure(useCase != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

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
										// check object intermediateCatchEvent is really bound
										JavaSDM.ensure(intermediateCatchEvent != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from intermediateCatchEvent to process
										JavaSDM.ensure(process
												.equals(intermediateCatchEvent
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from outFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(outFlow.getTargetRef()));

										// check link outgoing from outFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(outFlow.getSourceRef()));

										// check link source from ebgToNormalStep to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(ebgToNormalStep
														.getSource()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from ebgToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(ebgToNormalStep
														.getTarget()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_intermediateCatchEvent
										__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_eventBasedGateway
										__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __eventBasedGateway_outgoing_outFlow
										__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_targetRef_intermediateCatchEvent
										__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __intermediateCatchEvent_incoming_outFlow
										__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_intermediateCatchEvent
										__process_flowElements_intermediateCatchEvent
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
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
										// assign attribute __outFlow_sourceRef_eventBasedGateway
										__outFlow_sourceRef_eventBasedGateway
												.setName("sourceRef");
										// assign attribute __eventBasedGateway_outgoing_outFlow
										__eventBasedGateway_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __outFlow_targetRef_intermediateCatchEvent
										__outFlow_targetRef_intermediateCatchEvent
												.setName("targetRef");
										// assign attribute __intermediateCatchEvent_incoming_outFlow
										__intermediateCatchEvent_incoming_outFlow
												.setName("incoming");
										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway
												.setName("source");
										// assign attribute __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep
												.setName("target");

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__process_flowElements_intermediateCatchEvent
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										__process_flowElements_eventBasedGateway
												.setSrc(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setSrc(inFlow);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														eventBasedGateway);

										// create link
										__outFlow_sourceRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__process_flowElements_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setSrc(eventBasedGateway);

										// create link
										__eventBasedGateway_outgoing_outFlow
												.setSrc(eventBasedGateway);

										// create link
										__outFlow_sourceRef_eventBasedGateway
												.setSrc(outFlow);

										// create link
										__outFlow_targetRef_intermediateCatchEvent
												.setSrc(outFlow);

										// create link
										__intermediateCatchEvent_incoming_outFlow
												.setTrg(outFlow);

										// create link
										__eventBasedGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										__process_flowElements_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														intermediateCatchEvent);

										// create link
										__intermediateCatchEvent_incoming_outFlow
												.setSrc(intermediateCatchEvent);

										// create link
										__outFlow_targetRef_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										__ebgToNormalStep_target_normalStep
												.setTrg(normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__ebgToNormalStep_target_normalStep
												.setSrc(ebgToNormalStep);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setSrc(ebgToNormalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														ebgToNormalStep);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToUseCase_target_useCase,
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
														__process_flowElements_intermediateCatchEvent,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__intermediateCatchEvent_incoming_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_sourceRef_eventBasedGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__ebgToNormalStep_target_normalStep,
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
														__useCase_flows_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_targetRef_intermediateCatchEvent,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__eventBasedGateway_outgoing_outFlow,
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
														__process_flowElements_eventBasedGateway,
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
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__ebgToNormalStep_source_eventBasedGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToUseCase_source_process,
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
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															process,
															inFlow,
															eventBasedGateway,
															outFlow,
															intermediateCatchEvent,
															useCase,
															processToUseCase,
															flow, inFlowToFlow,
															normalStep,
															ebgToNormalStep));

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
														.setRuleName("CatchEventAfterEBGToStepRule");

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
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow, IntermediateCatchEvent intermediateCatchEvent) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("eventBasedGateway", eventBasedGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("intermediateCatchEvent", intermediateCatchEvent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow, IntermediateCatchEvent intermediateCatchEvent) {
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
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", true, csp);
		var_intermediateCatchEvent_id.setValue(intermediateCatchEvent.getId());
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", true, csp);
		var_intermediateCatchEvent_name.setValue(intermediateCatchEvent
				.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_intermediateCatchEvent_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_intermediateCatchEvent_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("ebgToNormalStep", ebgToNormalStep);
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
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject iceToAltFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("iceToAltFlow", iceToAltFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow())
				&& match.getObject("intermediateCatchEvent")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getIntermediateCatchEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, Flow flow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __useCase_flows_flow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, useCase, flow,
					normalStep, alt, alternativeFlow));

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
				// check object alternativeFlow is really bound
				JavaSDM.ensure(alternativeFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and alternativeFlow 
				JavaSDM.ensure(!flow.equals(alternativeFlow));

				// create object __useCase_flows_alternativeFlow
				__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __alt_ref_alternativeFlow
				__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_stepAlternative_alt
				__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_alternativeFlow
				__useCase_flows_alternativeFlow.setName("flows");
				// assign attribute __normalStep_stepAlternative_alt
				__normalStep_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __alt_ref_alternativeFlow
				__alt_ref_alternativeFlow.setName("ref");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_alternativeFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_alternativeFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__normalStep_stepAlternative_alt,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						alternativeFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				__useCase_flows_alternativeFlow.setSrc(useCase);

				// create link
				__normalStep_stepAlternative_alt.setSrc(normalStep);

				// create link
				__alt_ref_alternativeFlow.setSrc(alt);

				// create link
				__normalStep_stepAlternative_alt.setTrg(alt);

				// create link
				__alt_ref_alternativeFlow.setTrg(alternativeFlow);

				// create link
				__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object alternativeFlow is really bound
				JavaSDM.ensure(alternativeFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and alternativeFlow 
				JavaSDM.ensure(!flow.equals(alternativeFlow));

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, useCase, flow, normalStep,
					alt, alternativeFlow);
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
		AlternativeFlow alternativeFlow = null;
		FlowNodeToStep ebgToNormalStep = null;
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		NormalStep normalStep = null;
		Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		SequenceFlow outFlow = null;
		SequenceFlowToAlternativeFlowAlternative outFlowToAlt = null;
		SequenceFlowToUCFlow outFlowToAlternativeFlow = null;
		IntermediateCatchEventToAlternativeFlow iceToAltFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge process__flowElements__intermediateCatchEvent = null;
		EMoflonEdge outFlow__sourceRef__eventBasedGateway = null;
		EMoflonEdge outFlow__targetRef__intermediateCatchEvent = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__source__outFlow = null;
		EMoflonEdge eventBasedGateway__outgoing__outFlow = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge intermediateCatchEvent__incoming__outFlow = null;
		EMoflonEdge outFlowToAlt__target__alt = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__target__alternativeFlow = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge iceToAltFlow__target__alternativeFlow = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge iceToAltFlow__source__intermediateCatchEvent = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("alternativeFlow"));

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("ebgToNormalStep"));

			// ensure correct type and really bound of object ebgToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			ebgToNormalStep = (FlowNodeToStep) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

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
			// create object intermediateCatchEvent
			intermediateCatchEvent = Bpmn2Factory.eINSTANCE
					.createIntermediateCatchEvent();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToAlternativeFlowAlternative();

			// create object outFlowToAlternativeFlow
			outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object iceToAltFlow
			iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createIntermediateCatchEventToAlternativeFlow();

			// assign attribute intermediateCatchEvent
			intermediateCatchEvent.setId((java.lang.String) csp
					.getAttributeVariable("intermediateCatchEvent", "id")
					.getValue());
			// assign attribute intermediateCatchEvent
			intermediateCatchEvent.setName((java.lang.String) csp
					.getAttributeVariable("intermediateCatchEvent", "name")
					.getValue());

			// create link
			outFlowToAlt.setTarget(alt);

			// create link
			outFlowToAlternativeFlow.setTarget(alternativeFlow);

			// create link
			iceToAltFlow.setTarget(alternativeFlow);

			// create link
			process.getFlowElements().add(intermediateCatchEvent); // add link

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			outFlow.setSourceRef(eventBasedGateway);

			// create link
			outFlowToAlt.setSource(outFlow);

			// create link
			outFlowToAlternativeFlow.setSource(outFlow);

			// create link
			intermediateCatchEvent.getIncoming().add(outFlow);

			// create link
			iceToAltFlow.setSource(intermediateCatchEvent);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object outFlowToAlternativeFlow is really bound
			JavaSDM.ensure(outFlowToAlternativeFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object outFlowToAlternativeFlow is really bound
			JavaSDM.ensure(outFlowToAlternativeFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects alternativeFlow and alt 
			JavaSDM.ensure(!alternativeFlow.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alt 
			JavaSDM.ensure(!ebgToNormalStep.equals(alt));

			// check isomorphic binding between objects eventBasedGateway and alt 
			JavaSDM.ensure(!eventBasedGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects iceToAltFlow and alt 
			JavaSDM.ensure(!iceToAltFlow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects intermediateCatchEvent and alt 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToAlt and alt 
			JavaSDM.ensure(!outFlowToAlt.equals(alt));

			// check isomorphic binding between objects outFlowToAlternativeFlow and alt 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects processToUseCase and alt 
			JavaSDM.ensure(!processToUseCase.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and alternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and alternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlow and alternativeFlow 
			JavaSDM.ensure(!inFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and alternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alternativeFlow));

			// check isomorphic binding between objects normalStep and alternativeFlow 
			JavaSDM.ensure(!normalStep.equals(alternativeFlow));

			// check isomorphic binding between objects outFlow and alternativeFlow 
			JavaSDM.ensure(!outFlow.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(alternativeFlow));

			// check isomorphic binding between objects process and alternativeFlow 
			JavaSDM.ensure(!process.equals(alternativeFlow));

			// check isomorphic binding between objects processToUseCase and alternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(alternativeFlow));

			// check isomorphic binding between objects useCase and alternativeFlow 
			JavaSDM.ensure(!useCase.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects iceToAltFlow and ebgToNormalStep 
			JavaSDM.ensure(!iceToAltFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects intermediateCatchEvent and ebgToNormalStep 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToUseCase and ebgToNormalStep 
			JavaSDM.ensure(!processToUseCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects useCase and ebgToNormalStep 
			JavaSDM.ensure(!useCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and eventBasedGateway 
			JavaSDM.ensure(!iceToAltFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects intermediateCatchEvent and eventBasedGateway 
			JavaSDM.ensure(!intermediateCatchEvent.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlt and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlternativeFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToUseCase and eventBasedGateway 
			JavaSDM.ensure(!processToUseCase.equals(eventBasedGateway));

			// check isomorphic binding between objects useCase and eventBasedGateway 
			JavaSDM.ensure(!useCase.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and flow 
			JavaSDM.ensure(!iceToAltFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects intermediateCatchEvent and flow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToAlt and flow 
			JavaSDM.ensure(!outFlowToAlt.equals(flow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and flow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects intermediateCatchEvent and iceToAltFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(iceToAltFlow));

			// check isomorphic binding between objects normalStep and iceToAltFlow 
			JavaSDM.ensure(!normalStep.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlt and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects process and iceToAltFlow 
			JavaSDM.ensure(!process.equals(iceToAltFlow));

			// check isomorphic binding between objects processToUseCase and iceToAltFlow 
			JavaSDM.ensure(!processToUseCase.equals(iceToAltFlow));

			// check isomorphic binding between objects useCase and iceToAltFlow 
			JavaSDM.ensure(!useCase.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and inFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlowToFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and intermediateCatchEvent 
			JavaSDM.ensure(!normalStep.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlow.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlt and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlt.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlternativeFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlternativeFlow
					.equals(intermediateCatchEvent));

			// check isomorphic binding between objects process and intermediateCatchEvent 
			JavaSDM.ensure(!process.equals(intermediateCatchEvent));

			// check isomorphic binding between objects processToUseCase and intermediateCatchEvent 
			JavaSDM.ensure(!processToUseCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects useCase and intermediateCatchEvent 
			JavaSDM.ensure(!useCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and normalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and normalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToUseCase and normalStep 
			JavaSDM.ensure(!processToUseCase.equals(normalStep));

			// check isomorphic binding between objects useCase and normalStep 
			JavaSDM.ensure(!useCase.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and outFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(outFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and outFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToUseCase and outFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlow));

			// check isomorphic binding between objects useCase and outFlow 
			JavaSDM.ensure(!useCase.equals(outFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and outFlowToAlt 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(outFlowToAlt));

			// check isomorphic binding between objects process and outFlowToAlt 
			JavaSDM.ensure(!process.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and outFlowToAlt 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlt));

			// check isomorphic binding between objects useCase and outFlowToAlt 
			JavaSDM.ensure(!useCase.equals(outFlowToAlt));

			// check isomorphic binding between objects process and outFlowToAlternativeFlow 
			JavaSDM.ensure(!process.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and outFlowToAlternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects useCase and outFlowToAlternativeFlow 
			JavaSDM.ensure(!useCase.equals(outFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object process__flowElements__intermediateCatchEvent
			process__flowElements__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__eventBasedGateway
			outFlow__sourceRef__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__targetRef__intermediateCatchEvent
			outFlow__targetRef__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventBasedGateway__outgoing__outFlow
			eventBasedGateway__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object intermediateCatchEvent__incoming__outFlow
			intermediateCatchEvent__incoming__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("CatchEventAfterEBGToStepRule");
			// assign attribute process__flowElements__intermediateCatchEvent
			process__flowElements__intermediateCatchEvent
					.setName("flowElements");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute outFlow__sourceRef__eventBasedGateway
			outFlow__sourceRef__eventBasedGateway.setName("sourceRef");
			// assign attribute eventBasedGateway__outgoing__outFlow
			eventBasedGateway__outgoing__outFlow.setName("outgoing");
			// assign attribute outFlow__targetRef__intermediateCatchEvent
			outFlow__targetRef__intermediateCatchEvent.setName("targetRef");
			// assign attribute intermediateCatchEvent__incoming__outFlow
			intermediateCatchEvent__incoming__outFlow.setName("incoming");
			// assign attribute __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow.setName("flows");
			// assign attribute __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt.setName("stepAlternative");
			// assign attribute __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow.setName("source");
			// assign attribute outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow.setName("target");
			// assign attribute iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent.setName("source");
			// assign attribute iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__intermediateCatchEvent,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__targetRef__intermediateCatchEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent__incoming__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_alternativeFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__target__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_alternativeFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__source__intermediateCatchEvent,
					"createdEdges");

			// create link
			process__flowElements__intermediateCatchEvent.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			eventBasedGateway__outgoing__outFlow.setSrc(eventBasedGateway);

			// create link
			outFlow__sourceRef__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			outFlow__sourceRef__eventBasedGateway.setSrc(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow.setTrg(outFlow);

			// create link
			intermediateCatchEvent__incoming__outFlow.setTrg(outFlow);

			// create link
			outFlow__targetRef__intermediateCatchEvent.setSrc(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			eventBasedGateway__outgoing__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			intermediateCatchEvent__incoming__outFlow
					.setSrc(intermediateCatchEvent);

			// create link
			outFlow__targetRef__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			iceToAltFlow__source__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__useCase_flows_alternativeFlow.setSrc(useCase);

			// create link
			__normalStep_stepAlternative_alt.setSrc(normalStep);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			__normalStep_stepAlternative_alt.setTrg(alt);

			// create link
			__alt_ref_alternativeFlow.setSrc(alt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			__alt_ref_alternativeFlow.setTrg(alternativeFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			iceToAltFlow__source__intermediateCatchEvent.setSrc(iceToAltFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setSrc(iceToAltFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				outFlowToAlternativeFlow, iceToAltFlow);
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
		AlternativeFlow alternativeFlow = null;
		Flow flow = null;
		NormalStep normalStep = null;
		UseCase useCase = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __processToUseCase_source_process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __ebgToNormalStep_source_eventBasedGateway = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __ebgToNormalStep_target_normalStep = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		CSP csp = null;
		Process process = null;
		Iterator fujaba__IterUseCaseToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterNormalStepToEbgToNormalStep = null;
		FlowNodeToStep ebgToNormalStep = null;

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
			ruleresult.setRule("CatchEventAfterEBGToStepRule");

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
			_TmpObject = (match.getObject("alternativeFlow"));

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// iterate to-many link target from normalStep to ebgToNormalStep
			fujaba__Success = false;

			fujaba__IterNormalStepToEbgToNormalStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, FlowNodeToStep.class, "target"))
					.iterator();

			while (fujaba__IterNormalStepToEbgToNormalStep.hasNext()) {
				try {
					ebgToNormalStep = (FlowNodeToStep) fujaba__IterNormalStepToEbgToNormalStep
							.next();

					// check object ebgToNormalStep is really bound
					JavaSDM.ensure(ebgToNormalStep != null);
					// bind object
					_TmpObject = ebgToNormalStep.getSource();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;

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

							// iterate to-many link target from useCase to processToUseCase
							fujaba__Success = false;

							fujaba__IterUseCaseToProcessToUseCase = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(useCase,
													ProcessToUseCase.class,
													"target")).iterator();

							while (fujaba__IterUseCaseToProcessToUseCase
									.hasNext()) {
								try {
									processToUseCase = (ProcessToUseCase) fujaba__IterUseCaseToProcessToUseCase
											.next();

									// check object processToUseCase is really bound
									JavaSDM.ensure(processToUseCase != null);
									// bind object
									process = processToUseCase.getSource();

									// check object process is really bound
									JavaSDM.ensure(process != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object alt is really bound
										JavaSDM.ensure(alt != null);
										// check object alternativeFlow is really bound
										JavaSDM.ensure(alternativeFlow != null);
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
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects flow and alternativeFlow 
										JavaSDM.ensure(!flow
												.equals(alternativeFlow));

										// check link ref from alt to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(alt.getRef()));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flows from alternativeFlow to useCase
										JavaSDM.ensure(useCase
												.equals(alternativeFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link source from ebgToNormalStep to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(ebgToNormalStep
														.getSource()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link stepAlternative from alt to normalStep
										JavaSDM.ensure(normalStep.equals(alt
												.eContainer()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from ebgToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(ebgToNormalStep
														.getTarget()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// create object __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_alternativeFlow
										__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __alt_ref_alternativeFlow
										__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

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
										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
										// assign attribute __useCase_flows_alternativeFlow
										__useCase_flows_alternativeFlow
												.setName("flows");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt
												.setName("stepAlternative");
										// assign attribute __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway
												.setName("source");
										// assign attribute __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep
												.setName("target");
										// assign attribute __alt_ref_alternativeFlow
										__alt_ref_alternativeFlow
												.setName("ref");

										// create link
										__process_flowElements_eventBasedGateway
												.setSrc(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setSrc(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setSrc(eventBasedGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														eventBasedGateway);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__process_flowElements_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_alternativeFlow
												.setSrc(useCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__ebgToNormalStep_target_normalStep
												.setTrg(normalStep);

										// create link
										__normalStep_stepAlternative_alt
												.setSrc(normalStep);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setSrc(ebgToNormalStep);

										// create link
										__ebgToNormalStep_target_normalStep
												.setSrc(ebgToNormalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														ebgToNormalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alt);

										// create link
										__normalStep_stepAlternative_alt
												.setTrg(alt);

										// create link
										__alt_ref_alternativeFlow.setSrc(alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alternativeFlow);

										// create link
										__alt_ref_alternativeFlow
												.setTrg(alternativeFlow);

										// create link
										__useCase_flows_alternativeFlow
												.setTrg(alternativeFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__alt_ref_alternativeFlow,
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
														__ebgToNormalStep_source_eventBasedGateway,
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
														__processToUseCase_source_process,
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
														__useCase_flows_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToUseCase_target_useCase,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__useCase_flows_alternativeFlow,
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
														__ebgToNormalStep_target_normalStep,
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
														__normalStep_stepAlternative_alt,
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
														__process_flowElements_eventBasedGateway,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															process, inFlow,
															eventBasedGateway,
															useCase,
															processToUseCase,
															flow, inFlowToFlow,
															normalStep,
															ebgToNormalStep,
															alt,
															alternativeFlow));

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
														.setRuleName("CatchEventAfterEBGToStepRule");

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
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("normalStep", normalStep);
		match.registerObject("alt", alt);
		match.registerObject("alternativeFlow", alternativeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
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
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", true, csp);
		var_alternativeFlow_name.setValue(alternativeFlow.getName());
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", csp);
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", csp);

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		eq.setRuleName("");
		eq.solve(var_intermediateCatchEvent_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_intermediateCatchEvent_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("ebgToNormalStep", ebgToNormalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("alternativeFlow", alternativeFlow);
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
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject iceToAltFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("iceToAltFlow", iceToAltFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative())
				&& match.getObject("alternativeFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_199(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_150289 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_244253 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_551555 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_551555 = null;
		Match match = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEventBasedGateway = null;
		EventBasedGateway eventBasedGateway = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// iterate to-many link flowElements from process to eventBasedGateway
			fujaba__Success = false;

			fujaba__IterProcessToEventBasedGateway = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEventBasedGateway.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEventBasedGateway.next();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;
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

							// iterate to-many link flowElements from process to outFlow
							fujaba__Success = false;

							fujaba__IterProcessToOutFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToOutFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToOutFlow
											.next();

									// ensure correct type and really bound of object outFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									outFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link incoming from outFlow to intermediateCatchEvent
									JavaSDM.ensure(intermediateCatchEvent
											.equals(outFlow.getTargetRef()));

									// check link outgoing from outFlow to eventBasedGateway
									JavaSDM.ensure(eventBasedGateway
											.equals(outFlow.getSourceRef()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_intermediateCatchEvent_flowElements_150289 = intermediateCatchEvent
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
													.eContainer() : null;

											// check object __DEC_intermediateCatchEvent_flowElements_150289 is really bound
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_150289 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_150289
													.getFlowElements()
													.contains(
															intermediateCatchEvent));

											// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_150289 and process 
											JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_150289
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
											__DEC_outFlow_flowElements_244253 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_244253 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_244253 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_244253
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_244253 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_244253
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
										// negative check for link flowNodeRefs from intermediateCatchEvent
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														intermediateCatchEvent,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_551555
											fujaba__Success = false;

											fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_551555 = new ArrayList(
													intermediateCatchEvent
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_551555
															.hasNext()) {
												try {
													__DEC_intermediateCatchEvent_targetRef_551555 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_551555
															.next();

													// check object __DEC_intermediateCatchEvent_targetRef_551555 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_551555 != null);
													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_551555 and inFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_551555
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_551555 and outFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_551555
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
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object intermediateCatchEvent is really bound
										JavaSDM.ensure(intermediateCatchEvent != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from intermediateCatchEvent to process
										JavaSDM.ensure(process
												.equals(intermediateCatchEvent
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from outFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(outFlow.getTargetRef()));

										// check link incoming from inFlow to intermediateCatchEvent
										JavaSDM.ensure(!(intermediateCatchEvent
												.equals(inFlow.getTargetRef())));

										// check link outgoing from outFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link trg from _edge_flowElements to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(_edge_flowElements
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														eventBasedGateway,
														outFlow,
														intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_200(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_609324 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_104854 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_524273 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_524273 = null;
		Match match = null;
		Iterator fujaba__IterProcessToIntermediateCatchEvent = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToEventBasedGateway = null;
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

			// iterate to-many link flowElements from process to eventBasedGateway
			fujaba__Success = false;

			fujaba__IterProcessToEventBasedGateway = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEventBasedGateway.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEventBasedGateway.next();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;
					// bind object
					_TmpObject = _edge_flowElements.getTrg();

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// check link outgoing from outFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(outFlow
							.getSourceRef()));

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

							// check link incoming from inFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowElements from process to intermediateCatchEvent
							fujaba__Success = false;

							fujaba__IterProcessToIntermediateCatchEvent = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToIntermediateCatchEvent
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToIntermediateCatchEvent
											.next();

									// ensure correct type and really bound of object intermediateCatchEvent
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
									// check link incoming from outFlow to intermediateCatchEvent
									JavaSDM.ensure(intermediateCatchEvent
											.equals(outFlow.getTargetRef()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_intermediateCatchEvent_flowElements_609324 = intermediateCatchEvent
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
													.eContainer() : null;

											// check object __DEC_intermediateCatchEvent_flowElements_609324 is really bound
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_609324 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_609324
													.getFlowElements()
													.contains(
															intermediateCatchEvent));

											// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_609324 and process 
											JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_609324
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
											__DEC_outFlow_flowElements_104854 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_104854 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_104854 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_104854
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_104854 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_104854
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
										// negative check for link flowNodeRefs from intermediateCatchEvent
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														intermediateCatchEvent,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_524273
											fujaba__Success = false;

											fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_524273 = new ArrayList(
													intermediateCatchEvent
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_524273
															.hasNext()) {
												try {
													__DEC_intermediateCatchEvent_targetRef_524273 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_524273
															.next();

													// check object __DEC_intermediateCatchEvent_targetRef_524273 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_524273 != null);
													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_524273 and inFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_524273
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_524273 and outFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_524273
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
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object intermediateCatchEvent is really bound
										JavaSDM.ensure(intermediateCatchEvent != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from intermediateCatchEvent to process
										JavaSDM.ensure(process
												.equals(intermediateCatchEvent
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from outFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(outFlow.getTargetRef()));

										// check link incoming from inFlow to intermediateCatchEvent
										JavaSDM.ensure(!(intermediateCatchEvent
												.equals(inFlow.getTargetRef())));

										// check link outgoing from outFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link trg from _edge_flowElements to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_flowElements
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														eventBasedGateway,
														outFlow,
														intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_201(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_67848 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_797576 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_438791 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_438791 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// bind object
			_TmpObject = outFlow.getTargetRef();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link outgoing from outFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(outFlow.getSourceRef()));

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
							__DEC_intermediateCatchEvent_flowElements_67848 = intermediateCatchEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
									.eContainer() : null;

							// check object __DEC_intermediateCatchEvent_flowElements_67848 is really bound
							JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_67848 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_67848
									.getFlowElements().contains(
											intermediateCatchEvent));

							// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_67848 and process 
							JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_67848
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
							__DEC_outFlow_flowElements_797576 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_797576 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_797576 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_797576
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_797576 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_797576
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
						// negative check for link flowNodeRefs from intermediateCatchEvent
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(intermediateCatchEvent,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_438791
							fujaba__Success = false;

							fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_438791 = new ArrayList(
									intermediateCatchEvent.getIncoming())
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_438791
											.hasNext()) {
								try {
									__DEC_intermediateCatchEvent_targetRef_438791 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_438791
											.next();

									// check object __DEC_intermediateCatchEvent_targetRef_438791 is really bound
									JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_438791 != null);
									// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_438791 and inFlow 
									JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_438791
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_438791 and outFlow 
									JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_438791
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object intermediateCatchEvent is really bound
						JavaSDM.ensure(intermediateCatchEvent != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from intermediateCatchEvent to process
						JavaSDM.ensure(process.equals(intermediateCatchEvent
								.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link incoming from outFlow to intermediateCatchEvent
						JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
								.getTargetRef()));

						// check link incoming from inFlow to intermediateCatchEvent
						JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
								.getTargetRef())));

						// check link outgoing from outFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link trg from _edge_sourceRef to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, eventBasedGateway, outFlow,
								intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_202(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_584472 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_335694 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_334439 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_334439 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Process process = null;
		SequenceFlow outFlow = null;
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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// bind object
			_TmpObject = outFlow.getTargetRef();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// check link outgoing from outFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(outFlow.getSourceRef()));

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

					// check link incoming from inFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link src from outFlow to _edge_sourceRef
					fujaba__Success = false;

					fujaba__IterOutFlowTo_edge_sourceRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(outFlow,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterOutFlowTo_edge_sourceRef.hasNext()) {
						try {
							_edge_sourceRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_sourceRef
									.next();

							// check object _edge_sourceRef is really bound
							JavaSDM.ensure(_edge_sourceRef != null);
							// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
							JavaSDM.ensure(!_edge_sourceRef
									.equals(_edge_outgoing));

							// check link trg from _edge_sourceRef to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway
									.equals(_edge_sourceRef.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_intermediateCatchEvent_flowElements_584472 = intermediateCatchEvent
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
											.eContainer() : null;

									// check object __DEC_intermediateCatchEvent_flowElements_584472 is really bound
									JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_584472 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_584472
											.getFlowElements().contains(
													intermediateCatchEvent));

									// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_584472 and process 
									JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_584472
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
									__DEC_outFlow_flowElements_335694 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_335694 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_335694 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_335694
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_335694 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_335694
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
								// negative check for link flowNodeRefs from intermediateCatchEvent
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												intermediateCatchEvent,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_334439
									fujaba__Success = false;

									fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_334439 = new ArrayList(
											intermediateCatchEvent
													.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_334439
													.hasNext()) {
										try {
											__DEC_intermediateCatchEvent_targetRef_334439 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_334439
													.next();

											// check object __DEC_intermediateCatchEvent_targetRef_334439 is really bound
											JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_334439 != null);
											// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_334439 and inFlow 
											JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_334439
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_334439 and outFlow 
											JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_334439
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
								// check object eventBasedGateway is really bound
								JavaSDM.ensure(eventBasedGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object intermediateCatchEvent is really bound
								JavaSDM.ensure(intermediateCatchEvent != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from eventBasedGateway to process
								JavaSDM.ensure(process.equals(eventBasedGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from intermediateCatchEvent to process
								JavaSDM.ensure(process
										.equals(intermediateCatchEvent
												.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link incoming from inFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(inFlow
										.getTargetRef()));

								// check link incoming from outFlow to intermediateCatchEvent
								JavaSDM.ensure(intermediateCatchEvent
										.equals(outFlow.getTargetRef()));

								// check link incoming from inFlow to intermediateCatchEvent
								JavaSDM.ensure(!(intermediateCatchEvent
										.equals(inFlow.getTargetRef())));

								// check link outgoing from outFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_outgoing to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_outgoing.getSrc()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link trg from _edge_outgoing to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_outgoing
										.getTrg()));

								// check link trg from _edge_sourceRef to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_sourceRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, eventBasedGateway,
										outFlow, intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_203(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_559579 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_209820 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_621716 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_621716 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		EventBasedGateway eventBasedGateway = null;
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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// bind object
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// check link incoming from outFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(outFlow.getTargetRef()));

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
							__DEC_intermediateCatchEvent_flowElements_559579 = intermediateCatchEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
									.eContainer() : null;

							// check object __DEC_intermediateCatchEvent_flowElements_559579 is really bound
							JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_559579 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_559579
									.getFlowElements().contains(
											intermediateCatchEvent));

							// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_559579 and process 
							JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_559579
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
							__DEC_outFlow_flowElements_209820 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_209820 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_209820 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_209820
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_209820 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_209820
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
						// negative check for link flowNodeRefs from intermediateCatchEvent
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(intermediateCatchEvent,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_621716
							fujaba__Success = false;

							fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_621716 = new ArrayList(
									intermediateCatchEvent.getIncoming())
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_621716
											.hasNext()) {
								try {
									__DEC_intermediateCatchEvent_targetRef_621716 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_621716
											.next();

									// check object __DEC_intermediateCatchEvent_targetRef_621716 is really bound
									JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_621716 != null);
									// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_621716 and inFlow 
									JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_621716
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_621716 and outFlow 
									JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_621716
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
						// check object eventBasedGateway is really bound
						JavaSDM.ensure(eventBasedGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object intermediateCatchEvent is really bound
						JavaSDM.ensure(intermediateCatchEvent != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from eventBasedGateway to process
						JavaSDM.ensure(process.equals(eventBasedGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from intermediateCatchEvent to process
						JavaSDM.ensure(process.equals(intermediateCatchEvent
								.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link incoming from inFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(inFlow
								.getTargetRef()));

						// check link incoming from outFlow to intermediateCatchEvent
						JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
								.getTargetRef()));

						// check link incoming from inFlow to intermediateCatchEvent
						JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
								.getTargetRef())));

						// check link outgoing from outFlow to eventBasedGateway
						JavaSDM.ensure(eventBasedGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_targetRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_targetRef.getSrc()));

						// check link trg from _edge_targetRef to intermediateCatchEvent
						JavaSDM.ensure(intermediateCatchEvent
								.equals(_edge_targetRef.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, eventBasedGateway, outFlow,
								intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_204(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_719957 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_77745 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_625557 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_625557 = null;
		Match match = null;
		Iterator fujaba__IterIntermediateCatchEventTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEventBasedGateway = null;
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow outFlow = null;
		Process process = null;
		IntermediateCatchEvent intermediateCatchEvent = null;

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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// bind object
			_TmpObject = intermediateCatchEvent.eContainer() instanceof Process ? (Process) intermediateCatchEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(
					intermediateCatchEvent));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link incoming from outFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(outFlow.getTargetRef()));

			// iterate to-many link flowElements from process to eventBasedGateway
			fujaba__Success = false;

			fujaba__IterProcessToEventBasedGateway = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEventBasedGateway.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEventBasedGateway.next();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;
					// check link outgoing from outFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(outFlow
							.getSourceRef()));

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

							// check link incoming from inFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link trg from intermediateCatchEvent to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterIntermediateCatchEventTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													intermediateCatchEvent,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterIntermediateCatchEventTo_edge_targetRef
									.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterIntermediateCatchEventTo_edge_targetRef
											.next();

									// check object _edge_targetRef is really bound
									JavaSDM.ensure(_edge_targetRef != null);
									// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
									JavaSDM.ensure(!_edge_targetRef
											.equals(_edge_incoming));

									// check link src from _edge_targetRef to outFlow
									JavaSDM.ensure(outFlow
											.equals(_edge_targetRef.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_intermediateCatchEvent_flowElements_719957 = intermediateCatchEvent
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
													.eContainer() : null;

											// check object __DEC_intermediateCatchEvent_flowElements_719957 is really bound
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_719957 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_719957
													.getFlowElements()
													.contains(
															intermediateCatchEvent));

											// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_719957 and process 
											JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_719957
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
											__DEC_outFlow_flowElements_77745 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_77745 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_77745 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_77745
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_77745 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_77745
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
										// negative check for link flowNodeRefs from intermediateCatchEvent
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														intermediateCatchEvent,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link incoming from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_625557
											fujaba__Success = false;

											fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_625557 = new ArrayList(
													intermediateCatchEvent
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_625557
															.hasNext()) {
												try {
													__DEC_intermediateCatchEvent_targetRef_625557 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_625557
															.next();

													// check object __DEC_intermediateCatchEvent_targetRef_625557 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_625557 != null);
													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_625557 and inFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_625557
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_625557 and outFlow 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_625557
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
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object intermediateCatchEvent is really bound
										JavaSDM.ensure(intermediateCatchEvent != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
										JavaSDM.ensure(!_edge_targetRef
												.equals(_edge_incoming));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from intermediateCatchEvent to process
										JavaSDM.ensure(process
												.equals(intermediateCatchEvent
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link incoming from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from outFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(outFlow.getTargetRef()));

										// check link incoming from inFlow to intermediateCatchEvent
										JavaSDM.ensure(!(intermediateCatchEvent
												.equals(inFlow.getTargetRef())));

										// check link outgoing from outFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_incoming to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link trg from _edge_incoming to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(_edge_targetRef
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														eventBasedGateway,
														outFlow,
														intermediateCatchEvent);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_81(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_608861 = null;
		NormalStep __DEC_alt_stepAlternative_894037 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_725307 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_725307 = null;
		Match match = null;
		Iterator fujaba__IterFlowToNormalStep = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		Iterator fujaba__IterAlternativeFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow alternativeFlow = null;
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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;

			// check link flows from alternativeFlow to useCase
			JavaSDM.ensure(useCase.equals(alternativeFlow.eContainer()));

			// iterate to-many link ref from alternativeFlow to alt
			fujaba__Success = false;

			fujaba__IterAlternativeFlowToAlt = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							alternativeFlow, AlternativeFlowAlternative.class,
							"ref")).iterator();

			while (fujaba__IterAlternativeFlowToAlt.hasNext()) {
				try {
					alt = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowToAlt
							.next();

					// check object alt is really bound
					JavaSDM.ensure(alt != null);
					// iterate to-many link flows from useCase to flow
					fujaba__Success = false;

					fujaba__IterUseCaseToFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToFlow.hasNext()) {
						try {
							flow = (Flow) fujaba__IterUseCaseToFlow.next();

							// check object flow is really bound
							JavaSDM.ensure(flow != null);
							// check isomorphic binding between objects flow and alternativeFlow 
							JavaSDM.ensure(!flow.equals(alternativeFlow));

							// iterate to-many link steps from flow to normalStep
							fujaba__Success = false;

							fujaba__IterFlowToNormalStep = new ArrayList(
									flow.getSteps()).iterator();

							while (fujaba__IterFlowToNormalStep.hasNext()) {
								try {
									_TmpObject = fujaba__IterFlowToNormalStep
											.next();

									// ensure correct type and really bound of object normalStep
									JavaSDM.ensure(_TmpObject instanceof NormalStep);
									normalStep = (NormalStep) _TmpObject;
									// check link stepAlternative from alt to normalStep
									JavaSDM.ensure(normalStep.equals(alt
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_alternativeFlow_flows_608861 = alternativeFlow
													.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
													.eContainer() : null;

											// check object __DEC_alternativeFlow_flows_608861 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_flows_608861 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alternativeFlow_flows_608861
													.getFlows().contains(
															alternativeFlow));

											// check isomorphic binding between objects __DEC_alternativeFlow_flows_608861 and useCase 
											JavaSDM.ensure(!__DEC_alternativeFlow_flows_608861
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
											__DEC_alt_stepAlternative_894037 = alt
													.eContainer() instanceof NormalStep ? (NormalStep) alt
													.eContainer() : null;

											// check object __DEC_alt_stepAlternative_894037 is really bound
											JavaSDM.ensure(__DEC_alt_stepAlternative_894037 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alt_stepAlternative_894037
													.getStepAlternative()
													.contains(alt));

											// check isomorphic binding between objects __DEC_alt_stepAlternative_894037 and normalStep 
											JavaSDM.ensure(!__DEC_alt_stepAlternative_894037
													.equals(normalStep));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_725307
											fujaba__Success = false;

											fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_725307 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	alternativeFlow,
																	AlternativeFlowAlternative.class,
																	"ref"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_725307
															.hasNext()) {
												try {
													__DEC_alternativeFlow_ref_725307 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_725307
															.next();

													// check object __DEC_alternativeFlow_ref_725307 is really bound
													JavaSDM.ensure(__DEC_alternativeFlow_ref_725307 != null);
													// check isomorphic binding between objects __DEC_alternativeFlow_ref_725307 and alt 
													JavaSDM.ensure(!__DEC_alternativeFlow_ref_725307
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
										// check object alternativeFlow is really bound
										JavaSDM.ensure(alternativeFlow != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects flow and alternativeFlow 
										JavaSDM.ensure(!flow
												.equals(alternativeFlow));

										// check link ref from alt to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(alt.getRef()));

										// check link flows from alternativeFlow to useCase
										JavaSDM.ensure(useCase
												.equals(alternativeFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link src from _edge_flows to useCase
										JavaSDM.ensure(useCase
												.equals(_edge_flows.getSrc()));

										// check link stepAlternative from alt to normalStep
										JavaSDM.ensure(normalStep.equals(alt
												.eContainer()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link trg from _edge_flows to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(_edge_flows.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														useCase, flow,
														normalStep, alt,
														alternativeFlow);
										if (fujaba__Success) {
											// statement node ''
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_82(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_338788 = null;
		NormalStep __DEC_alt_stepAlternative_538197 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_936728 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_936728 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToAlternativeFlow = null;
		AlternativeFlow alternativeFlow = null;
		UseCase useCase = null;
		Flow flow = null;
		AlternativeFlowAlternative alt = null;
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

			// check object _edge_stepAlternative is really bound
			JavaSDM.ensure(_edge_stepAlternative != null);
			// bind object
			_TmpObject = _edge_stepAlternative.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			_TmpObject = _edge_stepAlternative.getTrg();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// check link stepAlternative from alt to normalStep
			JavaSDM.ensure(normalStep.equals(alt.eContainer()));

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// bind object
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// iterate to-many link flows from useCase to alternativeFlow
			fujaba__Success = false;

			fujaba__IterUseCaseToAlternativeFlow = new ArrayList(
					useCase.getFlows()).iterator();

			while (fujaba__IterUseCaseToAlternativeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterUseCaseToAlternativeFlow.next();

					// ensure correct type and really bound of object alternativeFlow
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
					alternativeFlow = (AlternativeFlow) _TmpObject;
					// check isomorphic binding between objects flow and alternativeFlow 
					JavaSDM.ensure(!flow.equals(alternativeFlow));

					// check link ref from alt to alternativeFlow
					JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_alternativeFlow_flows_338788 = alternativeFlow
									.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
									.eContainer() : null;

							// check object __DEC_alternativeFlow_flows_338788 is really bound
							JavaSDM.ensure(__DEC_alternativeFlow_flows_338788 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alternativeFlow_flows_338788
									.getFlows().contains(alternativeFlow));

							// check isomorphic binding between objects __DEC_alternativeFlow_flows_338788 and useCase 
							JavaSDM.ensure(!__DEC_alternativeFlow_flows_338788
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
							__DEC_alt_stepAlternative_538197 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_538197 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_538197 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_538197
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_538197 and normalStep 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_538197
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_936728
							fujaba__Success = false;

							fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_936728 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													alternativeFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_936728
											.hasNext()) {
								try {
									__DEC_alternativeFlow_ref_936728 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_936728
											.next();

									// check object __DEC_alternativeFlow_ref_936728 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_ref_936728 != null);
									// check isomorphic binding between objects __DEC_alternativeFlow_ref_936728 and alt 
									JavaSDM.ensure(!__DEC_alternativeFlow_ref_936728
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
						// check object alternativeFlow is really bound
						JavaSDM.ensure(alternativeFlow != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects flow and alternativeFlow 
						JavaSDM.ensure(!flow.equals(alternativeFlow));

						// check link ref from alt to alternativeFlow
						JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

						// check link flows from alternativeFlow to useCase
						JavaSDM.ensure(useCase.equals(alternativeFlow
								.eContainer()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link src from _edge_stepAlternative to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_stepAlternative
								.getSrc()));

						// check link stepAlternative from alt to normalStep
						JavaSDM.ensure(normalStep.equals(alt.eContainer()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_stepAlternative to alt
						JavaSDM.ensure(alt.equals(_edge_stepAlternative
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this
								.isAppropriate_BWD(match, useCase, flow,
										normalStep, alt, alternativeFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_888225 = null;
		NormalStep __DEC_alt_stepAlternative_455576 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_536186 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_536186 = null;
		Match match = null;
		Iterator fujaba__IterFlowToNormalStep = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		UseCase useCase = null;
		AlternativeFlow alternativeFlow = null;
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

			// check object _edge_ref is really bound
			JavaSDM.ensure(_edge_ref != null);
			// bind object
			_TmpObject = _edge_ref.getSrc();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// bind object
			_TmpObject = _edge_ref.getTrg();

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;

			// check link ref from alt to alternativeFlow
			JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

			// bind object
			useCase = alternativeFlow.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(alternativeFlow));

			// iterate to-many link flows from useCase to flow
			fujaba__Success = false;

			fujaba__IterUseCaseToFlow = new ArrayList(useCase.getFlows())
					.iterator();

			while (fujaba__IterUseCaseToFlow.hasNext()) {
				try {
					flow = (Flow) fujaba__IterUseCaseToFlow.next();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);
					// check isomorphic binding between objects flow and alternativeFlow 
					JavaSDM.ensure(!flow.equals(alternativeFlow));

					// iterate to-many link steps from flow to normalStep
					fujaba__Success = false;

					fujaba__IterFlowToNormalStep = new ArrayList(
							flow.getSteps()).iterator();

					while (fujaba__IterFlowToNormalStep.hasNext()) {
						try {
							_TmpObject = fujaba__IterFlowToNormalStep.next();

							// ensure correct type and really bound of object normalStep
							JavaSDM.ensure(_TmpObject instanceof NormalStep);
							normalStep = (NormalStep) _TmpObject;
							// check link stepAlternative from alt to normalStep
							JavaSDM.ensure(normalStep.equals(alt.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_alternativeFlow_flows_888225 = alternativeFlow
											.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
											.eContainer() : null;

									// check object __DEC_alternativeFlow_flows_888225 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_flows_888225 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alternativeFlow_flows_888225
											.getFlows().contains(
													alternativeFlow));

									// check isomorphic binding between objects __DEC_alternativeFlow_flows_888225 and useCase 
									JavaSDM.ensure(!__DEC_alternativeFlow_flows_888225
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
									__DEC_alt_stepAlternative_455576 = alt
											.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object __DEC_alt_stepAlternative_455576 is really bound
									JavaSDM.ensure(__DEC_alt_stepAlternative_455576 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alt_stepAlternative_455576
											.getStepAlternative().contains(alt));

									// check isomorphic binding between objects __DEC_alt_stepAlternative_455576 and normalStep 
									JavaSDM.ensure(!__DEC_alt_stepAlternative_455576
											.equals(normalStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_536186
									fujaba__Success = false;

									fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_536186 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															alternativeFlow,
															AlternativeFlowAlternative.class,
															"ref")).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_536186
													.hasNext()) {
										try {
											__DEC_alternativeFlow_ref_536186 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_536186
													.next();

											// check object __DEC_alternativeFlow_ref_536186 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_ref_536186 != null);
											// check isomorphic binding between objects __DEC_alternativeFlow_ref_536186 and alt 
											JavaSDM.ensure(!__DEC_alternativeFlow_ref_536186
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
								// check object alternativeFlow is really bound
								JavaSDM.ensure(alternativeFlow != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object normalStep is really bound
								JavaSDM.ensure(normalStep != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects flow and alternativeFlow 
								JavaSDM.ensure(!flow.equals(alternativeFlow));

								// check link ref from alt to alternativeFlow
								JavaSDM.ensure(alternativeFlow.equals(alt
										.getRef()));

								// check link flows from alternativeFlow to useCase
								JavaSDM.ensure(useCase.equals(alternativeFlow
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link src from _edge_ref to alt
								JavaSDM.ensure(alt.equals(_edge_ref.getSrc()));

								// check link stepAlternative from alt to normalStep
								JavaSDM.ensure(normalStep.equals(alt
										.eContainer()));

								// check link steps from normalStep to flow
								JavaSDM.ensure(flow.equals(normalStep
										.eContainer()));

								// check link trg from _edge_ref to alternativeFlow
								JavaSDM.ensure(alternativeFlow.equals(_edge_ref
										.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										useCase, flow, normalStep, alt,
										alternativeFlow);
								if (fujaba__Success) {
									// statement node ''
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
			FlowNodeToStep ebgToNormalStepDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		SequenceFlow outFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		SequenceFlowToUCFlow outFlowToAlternativeFlow = null;
		SequenceFlowToAlternativeFlowAlternative outFlowToAlt = null;
		IntermediateCatchEventToAlternativeFlow iceToAltFlow = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterEventBasedGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		Process process = null;
		EventBasedGateway eventBasedGateway = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterEbgToNormalStepListToEbgToNormalStep = null;
		FlowNodeToStep ebgToNormalStep = null;
		Iterator fujaba__IterRuleEntryContainerToEbgToNormalStepList = null;
		RuleEntryList ebgToNormalStepList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to ebgToNormalStepList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToEbgToNormalStepList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToEbgToNormalStepList
					.hasNext()) {
				try {
					ebgToNormalStepList = (RuleEntryList) fujaba__IterRuleEntryContainerToEbgToNormalStepList
							.next();

					// check object ebgToNormalStepList is really bound
					JavaSDM.ensure(ebgToNormalStepList != null);
					// iterate to-many link entryObjects from ebgToNormalStepList to ebgToNormalStep
					fujaba__Success = false;

					fujaba__IterEbgToNormalStepListToEbgToNormalStep = new ArrayList(
							ebgToNormalStepList.getEntryObjects()).iterator();

					while (fujaba__IterEbgToNormalStepListToEbgToNormalStep
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterEbgToNormalStepListToEbgToNormalStep
									.next();

							// ensure correct type and really bound of object ebgToNormalStep
							JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
							ebgToNormalStep = (FlowNodeToStep) _TmpObject;
							// bind object
							_TmpObject = ebgToNormalStep.getTarget();

							// ensure correct type and really bound of object normalStep
							JavaSDM.ensure(_TmpObject instanceof NormalStep);
							normalStep = (NormalStep) _TmpObject;

							// bind object
							_TmpObject = ebgToNormalStep.getSource();

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
							JavaSDM.ensure(process.getFlowElements().contains(
									eventBasedGateway));

							// iterate to-many link source from process to processToUseCase
							fujaba__Success = false;

							fujaba__IterProcessToProcessToUseCase = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToUseCase.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToUseCase
									.hasNext()) {
								try {
									processToUseCase = (ProcessToUseCase) fujaba__IterProcessToProcessToUseCase
											.next();

									// check object processToUseCase is really bound
									JavaSDM.ensure(processToUseCase != null);
									// bind object
									useCase = processToUseCase.getTarget();

									// check object useCase is really bound
									JavaSDM.ensure(useCase != null);

									// iterate to-many link incoming from eventBasedGateway to inFlow
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayToInFlow = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (fujaba__IterEventBasedGatewayToInFlow
											.hasNext()) {
										try {
											inFlow = (SequenceFlow) fujaba__IterEventBasedGatewayToInFlow
													.next();

											// check object inFlow is really bound
											JavaSDM.ensure(inFlow != null);
											// check link flowElements from inFlow to process
											JavaSDM.ensure(process
													.equals(inFlow.eContainer()));

											// iterate to-many link source from inFlow to inFlowToFlow
											fujaba__Success = false;

											fujaba__IterInFlowToInFlowToFlow = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	inFlow,
																	SequenceFlowToUCFlow.class,
																	"source"))
													.iterator();

											while (fujaba__IterInFlowToInFlowToFlow
													.hasNext()) {
												try {
													inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
															.next();

													// check object inFlowToFlow is really bound
													JavaSDM.ensure(inFlowToFlow != null);
													// bind object
													flow = inFlowToFlow
															.getTarget();

													// check object flow is really bound
													JavaSDM.ensure(flow != null);

													// check link flows from flow to useCase
													JavaSDM.ensure(useCase.equals(flow
															.eContainer()));

													// check link steps from normalStep to flow
													JavaSDM.ensure(flow.equals(normalStep
															.eContainer()));

													// story node 'solve CSP'
													try {
														fujaba__Success = false;

														_TmpObject = (this
																.generateModel_solveCsp_BWD(
																		isApplicableMatch,
																		process,
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		useCase,
																		processToUseCase,
																		flow,
																		inFlowToFlow,
																		normalStep,
																		ebgToNormalStep,
																		alt,
																		outFlowToAlt,
																		alternativeFlow,
																		outFlowToAlternativeFlow,
																		iceToAltFlow,
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
															// check object normalStep is really bound
															JavaSDM.ensure(normalStep != null);
															// check object process is really bound
															JavaSDM.ensure(process != null);
															// check object processToUseCase is really bound
															JavaSDM.ensure(processToUseCase != null);
															// check object ruleResult is really bound
															JavaSDM.ensure(ruleResult != null);
															// check object useCase is really bound
															JavaSDM.ensure(useCase != null);
															// create object outFlow
															outFlow = Bpmn2Factory.eINSTANCE
																	.createSequenceFlow();

															// create object intermediateCatchEvent
															intermediateCatchEvent = Bpmn2Factory.eINSTANCE
																	.createIntermediateCatchEvent();

															// create object outFlowToAlternativeFlow
															outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																	.createSequenceFlowToUCFlow();

															// create object outFlowToAlt
															outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
																	.createSequenceFlowToAlternativeFlowAlternative();

															// create object iceToAltFlow
															iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																	.createIntermediateCatchEventToAlternativeFlow();

															// create object alternativeFlow
															alternativeFlow = UseCaseDSLFactory.eINSTANCE
																	.createAlternativeFlow();

															// create object alt
															alt = UseCaseDSLFactory.eINSTANCE
																	.createAlternativeFlowAlternative();

															// assign attribute intermediateCatchEvent
															intermediateCatchEvent
																	.setId((java.lang.String) csp
																			.getAttributeVariable(
																					"intermediateCatchEvent",
																					"id")
																			.getValue());
															// assign attribute intermediateCatchEvent
															intermediateCatchEvent
																	.setName((java.lang.String) csp
																			.getAttributeVariable(
																					"intermediateCatchEvent",
																					"name")
																			.getValue());
															// assign attribute alt
															alt.setCondition((java.lang.String) csp
																	.getAttributeVariable(
																			"alt",
																			"condition")
																	.getValue());
															// assign attribute alternativeFlow
															alternativeFlow
																	.setName((java.lang.String) csp
																			.getAttributeVariable(
																					"alternativeFlow",
																					"name")
																			.getValue());
															// assign attribute ruleResult
															ruleResult
																	.setSuccess(true);

															// create link
															process.getFlowElements()
																	.add(outFlow); // add link

															// create link
															process.getFlowElements()
																	.add(intermediateCatchEvent); // add link

															// create link
															outFlow.setSourceRef(eventBasedGateway);

															// create link
															ruleResult
																	.getSourceObjects()
																	.add(outFlow);

															// create link
															outFlowToAlternativeFlow
																	.setSource(outFlow);

															// create link
															outFlowToAlt
																	.setSource(outFlow);

															// create link
															intermediateCatchEvent
																	.getIncoming()
																	.add(outFlow);

															// create link
															ruleResult
																	.getSourceObjects()
																	.add(intermediateCatchEvent);

															// create link
															iceToAltFlow
																	.setSource(intermediateCatchEvent);

															// create link
															useCase.getFlows()
																	.add(alternativeFlow); // add link

															// create link
															normalStep
																	.getStepAlternative()
																	.add(alt); // add link

															// create link
															org.moflon.util.eMoflonEMFUtil
																	.addOppositeReference(
																			alt,
																			alternativeFlow,
																			"ref");

															// create link
															ruleResult
																	.getTargetObjects()
																	.add(alt);

															// create link
															outFlowToAlt
																	.setTarget(alt);

															// create link
															ruleResult
																	.getCorrObjects()
																	.add(outFlowToAlt);

															// create link
															ruleResult
																	.getTargetObjects()
																	.add(alternativeFlow);

															// create link
															iceToAltFlow
																	.setTarget(alternativeFlow);

															// create link
															outFlowToAlternativeFlow
																	.setTarget(alternativeFlow);

															// create link
															ruleResult
																	.getCorrObjects()
																	.add(outFlowToAlternativeFlow);

															// create link
															ruleResult
																	.getCorrObjects()
																	.add(iceToAltFlow);

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
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			SequenceFlowToAlternativeFlowAlternative outFlowToAlt,
			AlternativeFlow alternativeFlow,
			SequenceFlowToUCFlow outFlowToAlternativeFlow,
			IntermediateCatchEventToAlternativeFlow iceToAltFlow,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

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
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", csp);
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", csp);
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);

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
		eq_modelgen.solve(var_intermediateCatchEvent_id,
				var_alternativeFlow_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_intermediateCatchEvent_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("ebgToNormalStep", ebgToNormalStep);
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
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(NormalStep) arguments.get(10),
					(FlowNodeToStep) arguments.get(11));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(UseCase) arguments.get(4),
					(ProcessToUseCase) arguments.get(5),
					(Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(AlternativeFlowAlternative) arguments.get(10),
					(AlternativeFlow) arguments.get(11));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_199__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_199((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_200__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_200((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_201__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_201((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_202__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_202((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_203__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_203((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_204__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_204((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_81((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_82((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowNodeToStep) arguments.get(1));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_SEQUENCEFLOWTOALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_INTERMEDIATECATCHEVENTTOALTERNATIVEFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(NormalStep) arguments.get(10),
					(FlowNodeToStep) arguments.get(11),
					(AlternativeFlowAlternative) arguments.get(12),
					(SequenceFlowToAlternativeFlowAlternative) arguments
							.get(13),
					(AlternativeFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(IntermediateCatchEventToAlternativeFlow) arguments.get(16),
					(ModelgeneratorRuleResult) arguments.get(17));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CatchEventAfterEBGToStepRuleImpl
