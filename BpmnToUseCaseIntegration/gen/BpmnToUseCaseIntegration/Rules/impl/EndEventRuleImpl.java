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

import BpmnToUseCaseIntegration.Rules.EndEventRule;
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

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Event Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEventRuleImpl extends AbstractRuleImpl implements EndEventRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEventRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
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
					inFlow, endEvent));

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

				// check object endEvent is really bound
				JavaSDM.ensure(endEvent != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_flowElements_endEvent
				__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_endEvent
				__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __endEvent_incoming_inFlow
				__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_endEvent
				__process_flowElements_endEvent.setName("flowElements");
				// assign attribute __inFlow_targetRef_endEvent
				__inFlow_targetRef_endEvent.setName("targetRef");
				// assign attribute __endEvent_incoming_inFlow
				__endEvent_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_endEvent, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_endEvent, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__endEvent_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						endEvent, "toBeTranslatedNodes");

				// create link
				__process_flowElements_endEvent.setSrc(process);

				// create link
				__endEvent_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_endEvent.setSrc(inFlow);

				// create link
				__endEvent_incoming_inFlow.setSrc(endEvent);

				// create link
				__inFlow_targetRef_endEvent.setTrg(endEvent);

				// create link
				__process_flowElements_endEvent.setTrg(endEvent);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object endEvent is really bound
				JavaSDM.ensure(endEvent != null);
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
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow, endEvent);
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
		EndEvent endEvent = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		EndEventToFlow endEventToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge endEventToFlow__target__flow = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge endEventToFlow__source__endEvent = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("endEvent"));

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
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
			// create object endEventToFlow
			endEventToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createEndEventToFlow();

			// create link
			endEventToFlow.setSource(endEvent);

			// create link
			endEventToFlow.setTarget(flow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
			// check object endEventToFlow is really bound
			JavaSDM.ensure(endEventToFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEvent, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
			// check object endEventToFlow is really bound
			JavaSDM.ensure(endEventToFlow != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects endEventToFlow and endEvent 
			JavaSDM.ensure(!endEventToFlow.equals(endEvent));

			// check isomorphic binding between objects flow and endEvent 
			JavaSDM.ensure(!flow.equals(endEvent));

			// check isomorphic binding between objects inFlow and endEvent 
			JavaSDM.ensure(!inFlow.equals(endEvent));

			// check isomorphic binding between objects inFlowToFlow and endEvent 
			JavaSDM.ensure(!inFlowToFlow.equals(endEvent));

			// check isomorphic binding between objects process and endEvent 
			JavaSDM.ensure(!process.equals(endEvent));

			// check isomorphic binding between objects flow and endEventToFlow 
			JavaSDM.ensure(!flow.equals(endEventToFlow));

			// check isomorphic binding between objects inFlow and endEventToFlow 
			JavaSDM.ensure(!inFlow.equals(endEventToFlow));

			// check isomorphic binding between objects inFlowToFlow and endEventToFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(endEventToFlow));

			// check isomorphic binding between objects process and endEventToFlow 
			JavaSDM.ensure(!process.equals(endEventToFlow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// create object __inFlow_targetRef_endEvent
			__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_endEvent
			__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object endEventToFlow__target__flow
			endEventToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __endEvent_incoming_inFlow
			__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object endEventToFlow__source__endEvent
			endEventToFlow__source__endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EndEventRule");
			// assign attribute __process_flowElements_endEvent
			__process_flowElements_endEvent.setName("flowElements");
			// assign attribute __inFlow_targetRef_endEvent
			__inFlow_targetRef_endEvent.setName("targetRef");
			// assign attribute __endEvent_incoming_inFlow
			__endEvent_incoming_inFlow.setName("incoming");
			// assign attribute endEventToFlow__source__endEvent
			endEventToFlow__source__endEvent.setName("source");
			// assign attribute endEventToFlow__target__flow
			endEventToFlow__target__flow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_endEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_endEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__endEvent_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow__source__endEvent, "createdEdges");

			// create link
			__process_flowElements_endEvent.setSrc(process);

			// create link
			__inFlow_targetRef_endEvent.setSrc(inFlow);

			// create link
			__endEvent_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_endEvent.setTrg(endEvent);

			// create link
			__endEvent_incoming_inFlow.setSrc(endEvent);

			// create link
			endEventToFlow__source__endEvent.setTrg(endEvent);

			// create link
			__process_flowElements_endEvent.setTrg(endEvent);

			// create link
			endEventToFlow__target__flow.setTrg(flow);

			// create link
			endEventToFlow__target__flow.setSrc(endEventToFlow);

			// create link
			endEventToFlow__source__endEvent.setSrc(endEventToFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, endEventToFlow);
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
		EndEvent endEvent = null;
		SequenceFlow inFlow = null;
		Process process = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
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
			ruleresult.setRule("EndEventRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("endEvent"));

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;
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

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object endEvent is really bound
						JavaSDM.ensure(endEvent != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object inFlowToFlow is really bound
						JavaSDM.ensure(inFlowToFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from endEvent to process
						JavaSDM.ensure(process.equals(endEvent.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link source from inFlowToFlow to inFlow
						JavaSDM.ensure(inFlow.equals(inFlowToFlow.getSource()));

						// check link target from inFlowToFlow to flow
						JavaSDM.ensure(flow.equals(inFlowToFlow.getTarget()));

						// check link targetRef from inFlow to endEvent
						JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

						// create object __process_flowElements_endEvent
						__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __process_flowElements_inFlow
						__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __endEvent_incoming_inFlow
						__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlow_targetRef_endEvent
						__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __process_flowElements_inFlow
						__process_flowElements_inFlow.setName("flowElements");
						// assign attribute __process_flowElements_endEvent
						__process_flowElements_endEvent.setName("flowElements");
						// assign attribute __inFlow_targetRef_endEvent
						__inFlow_targetRef_endEvent.setName("targetRef");
						// assign attribute __endEvent_incoming_inFlow
						__endEvent_incoming_inFlow.setName("incoming");
						// assign attribute __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow.setName("source");
						// assign attribute __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow.setName("target");

						// create link
						__process_flowElements_endEvent.setSrc(process);

						// create link
						__process_flowElements_inFlow.setSrc(process);

						// create link
						isApplicableMatch.getAllContextElements().add(process);

						// create link
						__endEvent_incoming_inFlow.setTrg(inFlow);

						// create link
						__inFlow_targetRef_endEvent.setSrc(inFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(inFlow);

						// create link
						__process_flowElements_inFlow.setTrg(inFlow);

						// create link
						__inFlowToFlow_source_inFlow.setTrg(inFlow);

						// create link
						__process_flowElements_endEvent.setTrg(endEvent);

						// create link
						isApplicableMatch.getAllContextElements().add(endEvent);

						// create link
						__endEvent_incoming_inFlow.setSrc(endEvent);

						// create link
						__inFlow_targetRef_endEvent.setTrg(endEvent);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__inFlowToFlow_target_flow.setTrg(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								inFlowToFlow);

						// create link
						__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

						// create link
						__inFlowToFlow_source_inFlow.setSrc(inFlowToFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__inFlowToFlow_source_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __endEvent_incoming_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __inFlow_targetRef_endEvent,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __inFlowToFlow_target_flow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_endEvent,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, process, inFlow,
									endEvent, flow, inFlowToFlow));

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
								// assign attribute ruleresult
								ruleresult.setSuccess(true);
								// assign attribute isApplicableMatch
								isApplicableMatch.setRuleName("EndEventRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("endEvent", endEvent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent) {
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
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", true, csp);
		var_endEvent_name.setValue(endEvent.getName());
		Variable var_flow_finalState = CSPFactoryHelper.eINSTANCE
				.createVariable("flow.finalState", true, csp);
		var_flow_finalState.setValue(flow.getFinalState());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_endEvent_name, var_flow_finalState);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("endEvent", endEvent);
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
			EObject process, EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject endEventToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("endEvent", endEvent);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("endEventToFlow", endEventToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("endEvent").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEndEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_480(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_79234 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_145421 = null;
		SequenceFlow __DEC_endEvent_targetRef_145421 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EndEvent endEvent = null;
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

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// check link flowElements from endEvent to process
			JavaSDM.ensure(process.equals(endEvent.eContainer()));

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
					// check link targetRef from inFlow to endEvent
					JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_endEvent_flowElements_79234 = endEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
									.eContainer() : null;

							// check object __DEC_endEvent_flowElements_79234 is really bound
							JavaSDM.ensure(__DEC_endEvent_flowElements_79234 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_endEvent_flowElements_79234
									.getFlowElements().contains(endEvent));

							// check isomorphic binding between objects __DEC_endEvent_flowElements_79234 and process 
							JavaSDM.ensure(!__DEC_endEvent_flowElements_79234
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from endEvent
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(endEvent, Lane.class,
										"flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_145421
							fujaba__Success = false;

							fujaba__IterEndEventTo__DEC_endEvent_targetRef_145421 = new ArrayList(
									endEvent.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_145421
											.hasNext()) {
								try {
									__DEC_endEvent_targetRef_145421 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_145421
											.next();

									// check object __DEC_endEvent_targetRef_145421 is really bound
									JavaSDM.ensure(__DEC_endEvent_targetRef_145421 != null);
									// check isomorphic binding between objects __DEC_endEvent_targetRef_145421 and inFlow 
									JavaSDM.ensure(!__DEC_endEvent_targetRef_145421
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
						// check object endEvent is really bound
						JavaSDM.ensure(endEvent != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from endEvent to process
						JavaSDM.ensure(process.equals(endEvent.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to endEvent
						JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

						// check link trg from _edge_flowElements to endEvent
						JavaSDM.ensure(endEvent.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, endEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_481(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_322081 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_927046 = null;
		SequenceFlow __DEC_endEvent_targetRef_927046 = null;
		Match match = null;
		Process process = null;
		EndEvent endEvent = null;
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

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// bind object
			_TmpObject = endEvent.eContainer() instanceof Process ? (Process) endEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(endEvent));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to endEvent
			JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_endEvent_flowElements_322081 = endEvent.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
							.eContainer() : null;

					// check object __DEC_endEvent_flowElements_322081 is really bound
					JavaSDM.ensure(__DEC_endEvent_flowElements_322081 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_endEvent_flowElements_322081
							.getFlowElements().contains(endEvent));

					// check isomorphic binding between objects __DEC_endEvent_flowElements_322081 and process 
					JavaSDM.ensure(!__DEC_endEvent_flowElements_322081
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from endEvent
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(endEvent, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_927046
					fujaba__Success = false;

					fujaba__IterEndEventTo__DEC_endEvent_targetRef_927046 = new ArrayList(
							endEvent.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_927046
									.hasNext()) {
						try {
							__DEC_endEvent_targetRef_927046 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_927046
									.next();

							// check object __DEC_endEvent_targetRef_927046 is really bound
							JavaSDM.ensure(__DEC_endEvent_targetRef_927046 != null);
							// check isomorphic binding between objects __DEC_endEvent_targetRef_927046 and inFlow 
							JavaSDM.ensure(!__DEC_endEvent_targetRef_927046
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
				// check object endEvent is really bound
				JavaSDM.ensure(endEvent != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from endEvent to process
				JavaSDM.ensure(process.equals(endEvent.eContainer()));

				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link targetRef from inFlow to endEvent
				JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

				// check link trg from _edge_targetRef to endEvent
				JavaSDM.ensure(endEvent.equals(_edge_targetRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, process,
						inFlow, endEvent);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_482(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_204063 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_62667 = null;
		SequenceFlow __DEC_endEvent_targetRef_62667 = null;
		Match match = null;
		Iterator fujaba__IterEndEventTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		SequenceFlow inFlow = null;
		Process process = null;
		EndEvent endEvent = null;

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

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// bind object
			_TmpObject = endEvent.eContainer() instanceof Process ? (Process) endEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(endEvent));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to endEvent
			JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

			// iterate to-many link trg from endEvent to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterEndEventTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							endEvent, EMoflonEdge.class, "trg")).iterator();

			while (fujaba__IterEndEventTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterEndEventTo_edge_targetRef
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
							__DEC_endEvent_flowElements_204063 = endEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
									.eContainer() : null;

							// check object __DEC_endEvent_flowElements_204063 is really bound
							JavaSDM.ensure(__DEC_endEvent_flowElements_204063 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_endEvent_flowElements_204063
									.getFlowElements().contains(endEvent));

							// check isomorphic binding between objects __DEC_endEvent_flowElements_204063 and process 
							JavaSDM.ensure(!__DEC_endEvent_flowElements_204063
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from endEvent
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(endEvent, Lane.class,
										"flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_62667
							fujaba__Success = false;

							fujaba__IterEndEventTo__DEC_endEvent_targetRef_62667 = new ArrayList(
									endEvent.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_62667
											.hasNext()) {
								try {
									__DEC_endEvent_targetRef_62667 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_62667
											.next();

									// check object __DEC_endEvent_targetRef_62667 is really bound
									JavaSDM.ensure(__DEC_endEvent_targetRef_62667 != null);
									// check isomorphic binding between objects __DEC_endEvent_targetRef_62667 and inFlow 
									JavaSDM.ensure(!__DEC_endEvent_targetRef_62667
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
						// check object endEvent is really bound
						JavaSDM.ensure(endEvent != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check link flowElements from endEvent to process
						JavaSDM.ensure(process.equals(endEvent.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link src from _edge_incoming to endEvent
						JavaSDM.ensure(endEvent.equals(_edge_incoming.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to endEvent
						JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to endEvent
						JavaSDM.ensure(endEvent.equals(_edge_targetRef.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, endEvent);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		EndEvent endEvent = null;
		EndEventToFlow endEventToFlow = null;
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

							// story node 'solve CSP'
							try {
								fujaba__Success = false;

								_TmpObject = (this.generateModel_solveCsp_BWD(
										isApplicableMatch, process, inFlow,
										endEvent, flow, inFlowToFlow,
										endEventToFlow, ruleResult));

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

									// check object flow is really bound
									JavaSDM.ensure(flow != null);
									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check object inFlowToFlow is really bound
									JavaSDM.ensure(inFlowToFlow != null);
									// check object process is really bound
									JavaSDM.ensure(process != null);
									// check object ruleResult is really bound
									JavaSDM.ensure(ruleResult != null);
									// create object endEvent
									endEvent = Bpmn2Factory.eINSTANCE
											.createEndEvent();

									// create object endEventToFlow
									endEventToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
											.createEndEventToFlow();

									// assign attribute endEvent
									endEvent.setName((java.lang.String) csp
											.getAttributeVariable("endEvent",
													"name").getValue());
									// assign attribute ruleResult
									ruleResult.setSuccess(true);

									// create link
									process.getFlowElements().add(endEvent); // add link

									// create link
									endEvent.getIncoming().add(inFlow);

									// create link
									endEventToFlow.setSource(endEvent);

									// create link
									ruleResult.getSourceObjects().add(endEvent);

									// create link
									endEventToFlow.setTarget(flow);

									// create link
									ruleResult.getCorrObjects().add(
											endEventToFlow);

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			EndEventToFlow endEventToFlow, ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_flow_finalState = CSPFactoryHelper.eINSTANCE
				.createVariable("flow.finalState", true, csp);
		var_flow_finalState.setValue(flow.getFinalState());

		// Create explicit parameters

		// Create unbound variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", csp);

		// Create constraints
		Eq_modelgen eq_modelgen = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgen);

		// Solve CSP
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_endEvent_name, var_flow_finalState);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
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
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3));
		case RulesPackage.END_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3));
			return null;
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.END_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_480__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_480((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_481__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_481((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_482__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_482((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW_ENDEVENTTOFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(EndEventToFlow) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEventRuleImpl
