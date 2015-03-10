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

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule;

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
 * An implementation of the model object '<em><b>Seq Flow After PG To Parallel Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeqFlowAfterPGToParallelFlowRuleImpl extends AbstractRuleImpl
		implements SeqFlowAfterPGToParallelFlowRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqFlowAfterPGToParallelFlowRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSeqFlowAfterPGToParallelFlowRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __sequenceFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge __parallelGateway_outgoing_sequenceFlow = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check isomorphic binding between objects sequenceFlow and inFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					parallelGateway, sequenceFlow, inFlow));

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

				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check isomorphic binding between objects sequenceFlow and inFlow 
				JavaSDM.ensure(!sequenceFlow.equals(inFlow));

				// create object __sequenceFlow_sourceRef_parallelGateway
				__sequenceFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_sequenceFlow
				__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelGateway_outgoing_sequenceFlow
				__parallelGateway_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_sequenceFlow
				__process_flowElements_sequenceFlow.setName("flowElements");
				// assign attribute __sequenceFlow_sourceRef_parallelGateway
				__sequenceFlow_sourceRef_parallelGateway.setName("sourceRef");
				// assign attribute __parallelGateway_outgoing_sequenceFlow
				__parallelGateway_outgoing_sequenceFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sequenceFlow_sourceRef_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_sequenceFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sequenceFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_outgoing_sequenceFlow,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_sequenceFlow.setSrc(process);

				// create link
				__sequenceFlow_sourceRef_parallelGateway
						.setTrg(parallelGateway);

				// create link
				__parallelGateway_outgoing_sequenceFlow.setSrc(parallelGateway);

				// create link
				__sequenceFlow_sourceRef_parallelGateway.setSrc(sequenceFlow);

				// create link
				__process_flowElements_sequenceFlow.setTrg(sequenceFlow);

				// create link
				__parallelGateway_outgoing_sequenceFlow.setTrg(sequenceFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check isomorphic binding between objects sequenceFlow and inFlow 
				JavaSDM.ensure(!sequenceFlow.equals(inFlow));

				// create object __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway.setName("flowElements");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway.setName("targetRef");
				// assign attribute __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_incoming_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_parallelGateway, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_parallelGateway, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				__process_flowElements_parallelGateway.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__inFlow_targetRef_parallelGateway.setTrg(parallelGateway);

				// create link
				__parallelGateway_incoming_inFlow.setSrc(parallelGateway);

				// create link
				__process_flowElements_parallelGateway.setTrg(parallelGateway);

				// create link
				__parallelGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_parallelGateway.setSrc(inFlow);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, parallelGateway,
					sequenceFlow, inFlow);
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
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		ParallelGateway parallelGateway = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		ParallelStep parallelStep = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		SequenceFlow sequenceFlow = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = null;
		ParallelFlow parallelFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge parallelStep__invokedFlows__parallelFlow = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge useCase__flows__parallelFlow = null;
		EMoflonEdge __sequenceFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __parallelGateway_outgoing_sequenceFlow = null;
		EMoflonEdge sequenceFlowToParallelFlow__source__sequenceFlow = null;
		EMoflonEdge sequenceFlowToParallelFlow__target__parallelFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

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
			_TmpObject = (isApplicableMatch.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("parallelGatewayToParallelStep"));

			// ensure correct type and really bound of object parallelGatewayToParallelStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			parallelGatewayToParallelStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sequenceFlow"));

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects sequenceFlow and inFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlow));

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
			// create object sequenceFlowToParallelFlow
			sequenceFlowToParallelFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object parallelFlow
			parallelFlow = UseCaseDSLFactory.eINSTANCE.createParallelFlow();

			// assign attribute parallelFlow
			parallelFlow.setName((java.lang.String) csp.getValue(
					"parallelFlow", "name"));

			// create link
			sequenceFlowToParallelFlow.setSource(sequenceFlow);

			// create link
			useCase.getFlows().add(parallelFlow); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(parallelStep,
					parallelFlow, "invokedFlows");

			// create link
			sequenceFlowToParallelFlow.setTarget(parallelFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object parallelFlow is really bound
			JavaSDM.ensure(parallelFlow != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToParallelFlow is really bound
			JavaSDM.ensure(sequenceFlowToParallelFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelFlow, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object parallelFlow is really bound
			JavaSDM.ensure(parallelFlow != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToParallelFlow is really bound
			JavaSDM.ensure(sequenceFlowToParallelFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and flow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects sequenceFlow and flow 
			JavaSDM.ensure(!sequenceFlow.equals(flow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and flow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects parallelFlow and inFlow 
			JavaSDM.ensure(!parallelFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects sequenceFlow and inFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and inFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects parallelFlow and inFlowToFlow 
			JavaSDM.ensure(!parallelFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects sequenceFlow and inFlowToFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and inFlowToFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and parallelFlow 
			JavaSDM.ensure(!parallelGateway.equals(parallelFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(parallelFlow));

			// check isomorphic binding between objects parallelStep and parallelFlow 
			JavaSDM.ensure(!parallelStep.equals(parallelFlow));

			// check isomorphic binding between objects process and parallelFlow 
			JavaSDM.ensure(!process.equals(parallelFlow));

			// check isomorphic binding between objects processToUseCase and parallelFlow 
			JavaSDM.ensure(!processToUseCase.equals(parallelFlow));

			// check isomorphic binding between objects sequenceFlow and parallelFlow 
			JavaSDM.ensure(!sequenceFlow.equals(parallelFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelFlow));

			// check isomorphic binding between objects useCase and parallelFlow 
			JavaSDM.ensure(!useCase.equals(parallelFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelGateway 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects processToUseCase and parallelGateway 
			JavaSDM.ensure(!processToUseCase.equals(parallelGateway));

			// check isomorphic binding between objects sequenceFlow and parallelGateway 
			JavaSDM.ensure(!sequenceFlow.equals(parallelGateway));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelGateway 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelGateway));

			// check isomorphic binding between objects useCase and parallelGateway 
			JavaSDM.ensure(!useCase.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGatewayToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelGatewayToParallelStep 
			JavaSDM.ensure(!process.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects processToUseCase and parallelGatewayToParallelStep 
			JavaSDM.ensure(!processToUseCase
					.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects sequenceFlow and parallelGatewayToParallelStep 
			JavaSDM.ensure(!sequenceFlow.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelGatewayToParallelStep 
			JavaSDM.ensure(!sequenceFlowToParallelFlow
					.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects useCase and parallelGatewayToParallelStep 
			JavaSDM.ensure(!useCase.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// check isomorphic binding between objects processToUseCase and parallelStep 
			JavaSDM.ensure(!processToUseCase.equals(parallelStep));

			// check isomorphic binding between objects sequenceFlow and parallelStep 
			JavaSDM.ensure(!sequenceFlow.equals(parallelStep));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelStep 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelStep));

			// check isomorphic binding between objects useCase and parallelStep 
			JavaSDM.ensure(!useCase.equals(parallelStep));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and process 
			JavaSDM.ensure(!sequenceFlow.equals(process));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and process 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlow.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(processToUseCase));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and sequenceFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlowToParallelFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlowToParallelFlow));

			// create object parallelStep__invokedFlows__parallelFlow
			parallelStep__invokedFlows__parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_sequenceFlow
			__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__parallelFlow
			useCase__flows__parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sequenceFlow_sourceRef_parallelGateway
			__sequenceFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelGateway_outgoing_sequenceFlow
			__parallelGateway_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToParallelFlow__source__sequenceFlow
			sequenceFlowToParallelFlow__source__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToParallelFlow__target__parallelFlow
			sequenceFlowToParallelFlow__target__parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SeqFlowAfterPGToParallelFlowRule");
			// assign attribute __process_flowElements_sequenceFlow
			__process_flowElements_sequenceFlow.setName("flowElements");
			// assign attribute __sequenceFlow_sourceRef_parallelGateway
			__sequenceFlow_sourceRef_parallelGateway.setName("sourceRef");
			// assign attribute __parallelGateway_outgoing_sequenceFlow
			__parallelGateway_outgoing_sequenceFlow.setName("outgoing");
			// assign attribute useCase__flows__parallelFlow
			useCase__flows__parallelFlow.setName("flows");
			// assign attribute parallelStep__invokedFlows__parallelFlow
			parallelStep__invokedFlows__parallelFlow.setName("invokedFlows");
			// assign attribute sequenceFlowToParallelFlow__source__sequenceFlow
			sequenceFlowToParallelFlow__source__sequenceFlow.setName("source");
			// assign attribute sequenceFlowToParallelFlow__target__parallelFlow
			sequenceFlowToParallelFlow__target__parallelFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelStep__invokedFlows__parallelFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_sequenceFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__parallelFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__sequenceFlow_sourceRef_parallelGateway,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelGateway_outgoing_sequenceFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow__source__sequenceFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow__target__parallelFlow,
					"createdEdges");

			// create link
			__process_flowElements_sequenceFlow.setSrc(process);

			// create link
			__sequenceFlow_sourceRef_parallelGateway.setTrg(parallelGateway);

			// create link
			__parallelGateway_outgoing_sequenceFlow.setSrc(parallelGateway);

			// create link
			sequenceFlowToParallelFlow__source__sequenceFlow
					.setTrg(sequenceFlow);

			// create link
			__parallelGateway_outgoing_sequenceFlow.setTrg(sequenceFlow);

			// create link
			__sequenceFlow_sourceRef_parallelGateway.setSrc(sequenceFlow);

			// create link
			__process_flowElements_sequenceFlow.setTrg(sequenceFlow);

			// create link
			useCase__flows__parallelFlow.setSrc(useCase);

			// create link
			parallelStep__invokedFlows__parallelFlow.setSrc(parallelStep);

			// create link
			sequenceFlowToParallelFlow__target__parallelFlow
					.setTrg(parallelFlow);

			// create link
			useCase__flows__parallelFlow.setTrg(parallelFlow);

			// create link
			parallelStep__invokedFlows__parallelFlow.setTrg(parallelFlow);

			// create link
			sequenceFlowToParallelFlow__source__sequenceFlow
					.setSrc(sequenceFlowToParallelFlow);

			// create link
			sequenceFlowToParallelFlow__target__parallelFlow
					.setSrc(sequenceFlowToParallelFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, parallelGateway,
				sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, parallelStep, parallelGatewayToParallelStep,
				parallelFlow, sequenceFlowToParallelFlow);
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
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;
		bpmn2.Process process = null;
		SequenceFlow sequenceFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge __parallelGateway_outgoing_sequenceFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __parallelGatewayToParallelStep_source_parallelGateway = null;
		EMoflonEdge __sequenceFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_parallelStep = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __parallelGatewayToParallelStep_target_parallelStep = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		ParallelStep parallelStep = null;
		Iterator fujaba__IterParallelGatewayToParallelGatewayToParallelStep = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
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
			ruleresult.setRule("SeqFlowAfterPGToParallelFlowRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (match.getObject("sequenceFlow"));

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects sequenceFlow and inFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlow));

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

					// iterate to-many link source from parallelGateway to parallelGatewayToParallelStep
					fujaba__Success = false;

					fujaba__IterParallelGatewayToParallelGatewayToParallelStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelGateway,
											FlowNodeToStep.class, "source"))
							.iterator();

					while (fujaba__IterParallelGatewayToParallelGatewayToParallelStep
							.hasNext()) {
						try {
							parallelGatewayToParallelStep = (FlowNodeToStep) fujaba__IterParallelGatewayToParallelGatewayToParallelStep
									.next();

							// check object parallelGatewayToParallelStep is really bound
							JavaSDM.ensure(parallelGatewayToParallelStep != null);
							// bind object
							_TmpObject = parallelGatewayToParallelStep
									.getTarget();

							// ensure correct type and really bound of object parallelStep
							JavaSDM.ensure(_TmpObject instanceof ParallelStep);
							parallelStep = (ParallelStep) _TmpObject;

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

										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object parallelGateway is really bound
										JavaSDM.ensure(parallelGateway != null);
										// check object parallelGatewayToParallelStep is really bound
										JavaSDM.ensure(parallelGatewayToParallelStep != null);
										// check object parallelStep is really bound
										JavaSDM.ensure(parallelStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object sequenceFlow is really bound
										JavaSDM.ensure(sequenceFlow != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects sequenceFlow and inFlow 
										JavaSDM.ensure(!sequenceFlow
												.equals(inFlow));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from parallelGateway to process
										JavaSDM.ensure(process
												.equals(parallelGateway
														.eContainer()));

										// check link flowElements from sequenceFlow to process
										JavaSDM.ensure(process
												.equals(sequenceFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from parallelGatewayToParallelStep to parallelGateway
										JavaSDM.ensure(parallelGateway
												.equals(parallelGatewayToParallelStep
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link sourceRef from sequenceFlow to parallelGateway
										JavaSDM.ensure(parallelGateway
												.equals(sequenceFlow
														.getSourceRef()));

										// check link steps from parallelStep to flow
										JavaSDM.ensure(flow.equals(parallelStep
												.eContainer()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from parallelGatewayToParallelStep to parallelStep
										JavaSDM.ensure(parallelStep
												.equals(parallelGatewayToParallelStep
														.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// check link targetRef from inFlow to parallelGateway
										JavaSDM.ensure(parallelGateway
												.equals(inFlow.getTargetRef()));

										// create object __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_sequenceFlow
										__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGateway_outgoing_sequenceFlow
										__parallelGateway_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGatewayToParallelStep_source_parallelGateway
										__parallelGatewayToParallelStep_source_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __sequenceFlow_sourceRef_parallelGateway
										__sequenceFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_parallelStep
										__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGatewayToParallelStep_target_parallelStep
										__parallelGatewayToParallelStep_target_parallelStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway
												.setName("flowElements");
										// assign attribute __process_flowElements_sequenceFlow
										__process_flowElements_sequenceFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __sequenceFlow_sourceRef_parallelGateway
										__sequenceFlow_sourceRef_parallelGateway
												.setName("sourceRef");
										// assign attribute __parallelGateway_outgoing_sequenceFlow
										__parallelGateway_outgoing_sequenceFlow
												.setName("outgoing");
										// assign attribute __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway
												.setName("targetRef");
										// assign attribute __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow
												.setName("incoming");
										// assign attribute __flow_steps_parallelStep
										__flow_steps_parallelStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");
										// assign attribute __parallelGatewayToParallelStep_source_parallelGateway
										__parallelGatewayToParallelStep_source_parallelGateway
												.setName("source");
										// assign attribute __parallelGatewayToParallelStep_target_parallelStep
										__parallelGatewayToParallelStep_target_parallelStep
												.setName("target");

										// create link
										__process_flowElements_parallelGateway
												.setSrc(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										__process_flowElements_sequenceFlow
												.setSrc(process);

										// create link
										__parallelGateway_outgoing_sequenceFlow
												.setSrc(parallelGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelGateway);

										// create link
										__inFlow_targetRef_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__parallelGateway_incoming_inFlow
												.setSrc(parallelGateway);

										// create link
										__parallelGatewayToParallelStep_source_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__process_flowElements_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__sequenceFlow_sourceRef_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__sequenceFlow_sourceRef_parallelGateway
												.setSrc(sequenceFlow);

										// create link
										__parallelGateway_outgoing_sequenceFlow
												.setTrg(sequenceFlow);

										// create link
										__process_flowElements_sequenceFlow
												.setTrg(sequenceFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														sequenceFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__parallelGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_parallelGateway
												.setSrc(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__flow_steps_parallelStep.setSrc(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

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
														parallelStep);

										// create link
										__parallelGatewayToParallelStep_target_parallelStep
												.setTrg(parallelStep);

										// create link
										__flow_steps_parallelStep
												.setTrg(parallelStep);

										// create link
										__parallelGatewayToParallelStep_target_parallelStep
												.setSrc(parallelGatewayToParallelStep);

										// create link
										isApplicableMatch
												.getAllContextElements()
												.add(parallelGatewayToParallelStep);

										// create link
										__parallelGatewayToParallelStep_source_parallelGateway
												.setSrc(parallelGatewayToParallelStep);

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
														__inFlow_targetRef_parallelGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelGatewayToParallelStep_source_parallelGateway,
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
														__parallelGatewayToParallelStep_target_parallelStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelGateway_incoming_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_parallelGateway,
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
														__flow_steps_parallelStep,
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
														__processToUseCase_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelGateway_outgoing_sequenceFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_sequenceFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__sequenceFlow_sourceRef_parallelGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_target_flow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															process,
															parallelGateway,
															sequenceFlow,
															inFlow, flow,
															inFlowToFlow,
															useCase,
															processToUseCase,
															parallelStep,
															parallelGatewayToParallelStep));

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
														.setRuleName("SeqFlowAfterPGToParallelFlowRule");
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

									fujaba__Success = true;
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
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		match.registerObject("process", process);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("sequenceFlow", sequenceFlow);
		match.registerObject("inFlow", inFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
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
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sequenceFlow_id = CSPFactoryHelper.eINSTANCE
				.createVariable("sequenceFlow.id", true, csp);
		var_sequenceFlow_id.setValue(sequenceFlow.getId());
		var_sequenceFlow_id.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelFlow.name", csp);
		var_parallelFlow_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sequenceFlow_id, var_parallelFlow_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("sequenceFlow", sequenceFlow);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
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
			EObject process, EObject parallelGateway, EObject sequenceFlow,
			EObject inFlow, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("parallelFlow", parallelFlow);
		ruleresult.registerObject("sequenceFlowToParallelFlow",
				sequenceFlowToParallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sequenceFlow").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Flow flow, UseCase useCase,
			ParallelStep parallelStep, ParallelFlow parallelFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCase_flows_parallelFlow = null;
		EMoflonEdge __parallelStep_invokedFlows_parallelFlow = null;
		EMoflonEdge __flow_steps_parallelStep = null;
		EMoflonEdge __useCase_flows_flow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object parallelFlow is really bound
			JavaSDM.ensure(parallelFlow != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, flow, useCase,
					parallelStep, parallelFlow));

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

				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelFlow is really bound
				JavaSDM.ensure(parallelFlow != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parallelFlow and flow 
				JavaSDM.ensure(!parallelFlow.equals(flow));

				// create object __useCase_flows_parallelFlow
				__useCase_flows_parallelFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelStep_invokedFlows_parallelFlow
				__parallelStep_invokedFlows_parallelFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_parallelFlow
				__useCase_flows_parallelFlow.setName("flows");
				// assign attribute __parallelStep_invokedFlows_parallelFlow
				__parallelStep_invokedFlows_parallelFlow
						.setName("invokedFlows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_parallelFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelStep_invokedFlows_parallelFlow,
						"toBeTranslatedEdges");

				// create link
				__useCase_flows_parallelFlow.setSrc(useCase);

				// create link
				__parallelStep_invokedFlows_parallelFlow.setSrc(parallelStep);

				// create link
				__useCase_flows_parallelFlow.setTrg(parallelFlow);

				// create link
				__parallelStep_invokedFlows_parallelFlow.setTrg(parallelFlow);

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
				// check object parallelFlow is really bound
				JavaSDM.ensure(parallelFlow != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parallelFlow and flow 
				JavaSDM.ensure(!parallelFlow.equals(flow));

				// create object __flow_steps_parallelStep
				__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __flow_steps_parallelStep
				__flow_steps_parallelStep.setName("steps");
				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_parallelStep, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				__flow_steps_parallelStep.setSrc(flow);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__flow_steps_parallelStep.setTrg(parallelStep);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, flow, useCase, parallelStep,
					parallelFlow);
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
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		ParallelFlow parallelFlow = null;
		ParallelGateway parallelGateway = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		ParallelStep parallelStep = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlow sequenceFlow = null;
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __parallelStep_invokedFlows_parallelFlow = null;
		EMoflonEdge __useCase_flows_parallelFlow = null;
		EMoflonEdge parallelGateway__outgoing__sequenceFlow = null;
		EMoflonEdge sequenceFlowToParallelFlow__target__parallelFlow = null;
		EMoflonEdge sequenceFlow__sourceRef__parallelGateway = null;
		EMoflonEdge sequenceFlowToParallelFlow__source__sequenceFlow = null;
		EMoflonEdge process__flowElements__sequenceFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

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
			_TmpObject = (isApplicableMatch.getObject("parallelFlow"));

			// ensure correct type and really bound of object parallelFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parallelFlow = (ParallelFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("parallelGatewayToParallelStep"));

			// ensure correct type and really bound of object parallelGatewayToParallelStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			parallelGatewayToParallelStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
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
			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

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
			// create object sequenceFlow
			sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object sequenceFlowToParallelFlow
			sequenceFlowToParallelFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute sequenceFlow
			sequenceFlow.setId((java.lang.String) csp.getValue("sequenceFlow",
					"id"));

			// create link
			sequenceFlowToParallelFlow.setTarget(parallelFlow);

			// create link
			process.getFlowElements().add(sequenceFlow); // add link

			// create link
			sequenceFlow.setSourceRef(parallelGateway);

			// create link
			sequenceFlowToParallelFlow.setSource(sequenceFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object parallelFlow is really bound
			JavaSDM.ensure(parallelFlow != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToParallelFlow is really bound
			JavaSDM.ensure(sequenceFlowToParallelFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object parallelFlow is really bound
			JavaSDM.ensure(parallelFlow != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToParallelFlow is really bound
			JavaSDM.ensure(sequenceFlowToParallelFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and flow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects sequenceFlow and flow 
			JavaSDM.ensure(!sequenceFlow.equals(flow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and flow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects parallelFlow and inFlow 
			JavaSDM.ensure(!parallelFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects sequenceFlow and inFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and inFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects parallelFlow and inFlowToFlow 
			JavaSDM.ensure(!parallelFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects sequenceFlow and inFlowToFlow 
			JavaSDM.ensure(!sequenceFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and inFlowToFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and parallelFlow 
			JavaSDM.ensure(!parallelGateway.equals(parallelFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(parallelFlow));

			// check isomorphic binding between objects parallelStep and parallelFlow 
			JavaSDM.ensure(!parallelStep.equals(parallelFlow));

			// check isomorphic binding between objects process and parallelFlow 
			JavaSDM.ensure(!process.equals(parallelFlow));

			// check isomorphic binding between objects processToUseCase and parallelFlow 
			JavaSDM.ensure(!processToUseCase.equals(parallelFlow));

			// check isomorphic binding between objects sequenceFlow and parallelFlow 
			JavaSDM.ensure(!sequenceFlow.equals(parallelFlow));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelFlow));

			// check isomorphic binding between objects useCase and parallelFlow 
			JavaSDM.ensure(!useCase.equals(parallelFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelGateway 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects processToUseCase and parallelGateway 
			JavaSDM.ensure(!processToUseCase.equals(parallelGateway));

			// check isomorphic binding between objects sequenceFlow and parallelGateway 
			JavaSDM.ensure(!sequenceFlow.equals(parallelGateway));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelGateway 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelGateway));

			// check isomorphic binding between objects useCase and parallelGateway 
			JavaSDM.ensure(!useCase.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGatewayToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelGatewayToParallelStep 
			JavaSDM.ensure(!process.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects processToUseCase and parallelGatewayToParallelStep 
			JavaSDM.ensure(!processToUseCase
					.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects sequenceFlow and parallelGatewayToParallelStep 
			JavaSDM.ensure(!sequenceFlow.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelGatewayToParallelStep 
			JavaSDM.ensure(!sequenceFlowToParallelFlow
					.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects useCase and parallelGatewayToParallelStep 
			JavaSDM.ensure(!useCase.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// check isomorphic binding between objects processToUseCase and parallelStep 
			JavaSDM.ensure(!processToUseCase.equals(parallelStep));

			// check isomorphic binding between objects sequenceFlow and parallelStep 
			JavaSDM.ensure(!sequenceFlow.equals(parallelStep));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and parallelStep 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(parallelStep));

			// check isomorphic binding between objects useCase and parallelStep 
			JavaSDM.ensure(!useCase.equals(parallelStep));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and process 
			JavaSDM.ensure(!sequenceFlow.equals(process));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and process 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlow.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(processToUseCase));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToParallelFlow and sequenceFlow 
			JavaSDM.ensure(!sequenceFlowToParallelFlow.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlowToParallelFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlowToParallelFlow));

			// create object __parallelStep_invokedFlows_parallelFlow
			__parallelStep_invokedFlows_parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_parallelFlow
			__useCase_flows_parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGateway__outgoing__sequenceFlow
			parallelGateway__outgoing__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToParallelFlow__target__parallelFlow
			sequenceFlowToParallelFlow__target__parallelFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlow__sourceRef__parallelGateway
			sequenceFlow__sourceRef__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToParallelFlow__source__sequenceFlow
			sequenceFlowToParallelFlow__source__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__sequenceFlow
			process__flowElements__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SeqFlowAfterPGToParallelFlowRule");
			// assign attribute process__flowElements__sequenceFlow
			process__flowElements__sequenceFlow.setName("flowElements");
			// assign attribute sequenceFlow__sourceRef__parallelGateway
			sequenceFlow__sourceRef__parallelGateway.setName("sourceRef");
			// assign attribute parallelGateway__outgoing__sequenceFlow
			parallelGateway__outgoing__sequenceFlow.setName("outgoing");
			// assign attribute __useCase_flows_parallelFlow
			__useCase_flows_parallelFlow.setName("flows");
			// assign attribute __parallelStep_invokedFlows_parallelFlow
			__parallelStep_invokedFlows_parallelFlow.setName("invokedFlows");
			// assign attribute sequenceFlowToParallelFlow__source__sequenceFlow
			sequenceFlowToParallelFlow__source__sequenceFlow.setName("source");
			// assign attribute sequenceFlowToParallelFlow__target__parallelFlow
			sequenceFlowToParallelFlow__target__parallelFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__parallelStep_invokedFlows_parallelFlow,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_parallelFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGateway__outgoing__sequenceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow__target__parallelFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow__sourceRef__parallelGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToParallelFlow__source__sequenceFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__sequenceFlow, "createdEdges");

			// create link
			process__flowElements__sequenceFlow.setSrc(process);

			// create link
			sequenceFlow__sourceRef__parallelGateway.setTrg(parallelGateway);

			// create link
			parallelGateway__outgoing__sequenceFlow.setSrc(parallelGateway);

			// create link
			process__flowElements__sequenceFlow.setTrg(sequenceFlow);

			// create link
			sequenceFlowToParallelFlow__source__sequenceFlow
					.setTrg(sequenceFlow);

			// create link
			sequenceFlow__sourceRef__parallelGateway.setSrc(sequenceFlow);

			// create link
			parallelGateway__outgoing__sequenceFlow.setTrg(sequenceFlow);

			// create link
			__useCase_flows_parallelFlow.setSrc(useCase);

			// create link
			__parallelStep_invokedFlows_parallelFlow.setSrc(parallelStep);

			// create link
			__parallelStep_invokedFlows_parallelFlow.setTrg(parallelFlow);

			// create link
			sequenceFlowToParallelFlow__target__parallelFlow
					.setTrg(parallelFlow);

			// create link
			__useCase_flows_parallelFlow.setTrg(parallelFlow);

			// create link
			sequenceFlowToParallelFlow__target__parallelFlow
					.setSrc(sequenceFlowToParallelFlow);

			// create link
			sequenceFlowToParallelFlow__source__sequenceFlow
					.setSrc(sequenceFlowToParallelFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, process, parallelGateway,
				sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, parallelStep, parallelGatewayToParallelStep,
				parallelFlow, sequenceFlowToParallelFlow);
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
		Flow flow = null;
		ParallelFlow parallelFlow = null;
		ParallelStep parallelStep = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __parallelGatewayToParallelStep_source_parallelGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_parallelStep = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCase_flows_parallelFlow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __parallelStep_invokedFlows_parallelFlow = null;
		EMoflonEdge __parallelGatewayToParallelStep_target_parallelStep = null;
		CSP csp = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterUseCaseToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterParallelStepToParallelGatewayToParallelStep = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
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
			ruleresult.setRule("SeqFlowAfterPGToParallelFlowRule");

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
			_TmpObject = (match.getObject("parallelFlow"));

			// ensure correct type and really bound of object parallelFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parallelFlow = (ParallelFlow) _TmpObject;
			_TmpObject = (match.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

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

					// iterate to-many link target from parallelStep to parallelGatewayToParallelStep
					fujaba__Success = false;

					fujaba__IterParallelStepToParallelGatewayToParallelStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelStep,
											FlowNodeToStep.class, "target"))
							.iterator();

					while (fujaba__IterParallelStepToParallelGatewayToParallelStep
							.hasNext()) {
						try {
							parallelGatewayToParallelStep = (FlowNodeToStep) fujaba__IterParallelStepToParallelGatewayToParallelStep
									.next();

							// check object parallelGatewayToParallelStep is really bound
							JavaSDM.ensure(parallelGatewayToParallelStep != null);
							// bind object
							_TmpObject = parallelGatewayToParallelStep
									.getSource();

							// ensure correct type and really bound of object parallelGateway
							JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
							parallelGateway = (ParallelGateway) _TmpObject;

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

										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object parallelFlow is really bound
										JavaSDM.ensure(parallelFlow != null);
										// check object parallelGateway is really bound
										JavaSDM.ensure(parallelGateway != null);
										// check object parallelGatewayToParallelStep is really bound
										JavaSDM.ensure(parallelGatewayToParallelStep != null);
										// check object parallelStep is really bound
										JavaSDM.ensure(parallelStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects parallelFlow and flow 
										JavaSDM.ensure(!parallelFlow
												.equals(flow));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from parallelGateway to process
										JavaSDM.ensure(process
												.equals(parallelGateway
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link flows from parallelFlow to useCase
										JavaSDM.ensure(useCase
												.equals(parallelFlow
														.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from parallelGatewayToParallelStep to parallelGateway
										JavaSDM.ensure(parallelGateway
												.equals(parallelGatewayToParallelStep
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link steps from parallelStep to flow
										JavaSDM.ensure(flow.equals(parallelStep
												.eContainer()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from parallelGatewayToParallelStep to parallelStep
										JavaSDM.ensure(parallelStep
												.equals(parallelGatewayToParallelStep
														.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// check link targetRef from inFlow to parallelGateway
										JavaSDM.ensure(parallelGateway
												.equals(inFlow.getTargetRef()));

										// check link invokedFlows from parallelFlow to parallelStep
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														parallelFlow,
														ParallelStep.class,
														"invokedFlows")
												.contains(parallelStep));

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGatewayToParallelStep_source_parallelGateway
										__parallelGatewayToParallelStep_source_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_parallelStep
										__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_parallelFlow
										__useCase_flows_parallelFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelStep_invokedFlows_parallelFlow
										__parallelStep_invokedFlows_parallelFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGatewayToParallelStep_target_parallelStep
										__parallelGatewayToParallelStep_target_parallelStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway
												.setName("flowElements");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway
												.setName("targetRef");
										// assign attribute __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow
												.setName("incoming");
										// assign attribute __flow_steps_parallelStep
										__flow_steps_parallelStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
										// assign attribute __useCase_flows_parallelFlow
										__useCase_flows_parallelFlow
												.setName("flows");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");
										// assign attribute __parallelStep_invokedFlows_parallelFlow
										__parallelStep_invokedFlows_parallelFlow
												.setName("invokedFlows");
										// assign attribute __parallelGatewayToParallelStep_source_parallelGateway
										__parallelGatewayToParallelStep_source_parallelGateway
												.setName("source");
										// assign attribute __parallelGatewayToParallelStep_target_parallelStep
										__parallelGatewayToParallelStep_target_parallelStep
												.setName("target");

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__process_flowElements_parallelGateway
												.setSrc(process);

										// create link
										__parallelGateway_incoming_inFlow
												.setSrc(parallelGateway);

										// create link
										__inFlow_targetRef_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__process_flowElements_parallelGateway
												.setTrg(parallelGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelGateway);

										// create link
										__parallelGatewayToParallelStep_source_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__parallelGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_parallelGateway
												.setSrc(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__flow_steps_parallelStep.setSrc(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

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
										__useCase_flows_parallelFlow
												.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelStep);

										// create link
										__parallelStep_invokedFlows_parallelFlow
												.setSrc(parallelStep);

										// create link
										__flow_steps_parallelStep
												.setTrg(parallelStep);

										// create link
										__parallelGatewayToParallelStep_target_parallelStep
												.setTrg(parallelStep);

										// create link
										__parallelGatewayToParallelStep_source_parallelGateway
												.setSrc(parallelGatewayToParallelStep);

										// create link
										isApplicableMatch
												.getAllContextElements()
												.add(parallelGatewayToParallelStep);

										// create link
										__parallelGatewayToParallelStep_target_parallelStep
												.setSrc(parallelGatewayToParallelStep);

										// create link
										__useCase_flows_parallelFlow
												.setTrg(parallelFlow);

										// create link
										__parallelStep_invokedFlows_parallelFlow
												.setTrg(parallelFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelStep_invokedFlows_parallelFlow,
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
														__useCase_flows_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelGateway_incoming_inFlow,
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
														__inFlow_targetRef_parallelGateway,
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
														__process_flowElements_parallelGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__flow_steps_parallelStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelGatewayToParallelStep_target_parallelStep,
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
														__parallelGatewayToParallelStep_source_parallelGateway,
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
														__useCase_flows_parallelFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															process,
															parallelGateway,
															inFlow,
															flow,
															inFlowToFlow,
															useCase,
															processToUseCase,
															parallelStep,
															parallelGatewayToParallelStep,
															parallelFlow));

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
														.setRuleName("SeqFlowAfterPGToParallelFlowRule");
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

									fujaba__Success = true;
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
	public void registerObjectsToMatch_BWD(Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("parallelStep", parallelStep);
		match.registerObject("parallelFlow", parallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
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
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_parallelFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelFlow.name", true, csp);
		var_parallelFlow_name.setValue(parallelFlow.getName());
		var_parallelFlow_name.setType("");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables
		Variable var_sequenceFlow_id = CSPFactoryHelper.eINSTANCE
				.createVariable("sequenceFlow.id", csp);
		var_sequenceFlow_id.setType("");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_sequenceFlow_id, var_parallelFlow_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		isApplicableMatch.registerObject("parallelFlow", parallelFlow);
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
			EObject process, EObject parallelGateway, EObject sequenceFlow,
			EObject inFlow, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("parallelFlow", parallelFlow);
		ruleresult.registerObject("sequenceFlowToParallelFlow",
				sequenceFlowToParallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("parallelFlow")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_64(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_180630 = null;
		Match match = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow sequenceFlow = null;
		bpmn2.Process process = null;

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
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from sequenceFlow to process
			JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

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
					// check isomorphic binding between objects sequenceFlow and inFlow 
					JavaSDM.ensure(!sequenceFlow.equals(inFlow));

					// bind object
					_TmpObject = inFlow.getTargetRef();

					// ensure correct type and really bound of object parallelGateway
					JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
					parallelGateway = (ParallelGateway) _TmpObject;

					// check link flowElements from parallelGateway to process
					JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

					// check link sourceRef from sequenceFlow to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(sequenceFlow
							.getSourceRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_sequenceFlow_flowElements_180630 = sequenceFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
									.eContainer() : null;

							// check object __DEC_sequenceFlow_flowElements_180630 is really bound
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_180630 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_180630
									.getFlowElements().contains(sequenceFlow));

							// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_180630 and process 
							JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_180630
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from sequenceFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(sequenceFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check isomorphic binding between objects sequenceFlow and inFlow 
						JavaSDM.ensure(!sequenceFlow.equals(inFlow));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link sourceRef from sequenceFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(sequenceFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link trg from _edge_flowElements to sequenceFlow
						JavaSDM.ensure(sequenceFlow.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, parallelGateway, sequenceFlow, inFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_65(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_931142 = null;
		Match match = null;
		Iterator fujaba__IterParallelGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		ParallelGateway parallelGateway = null;
		SequenceFlow sequenceFlow = null;

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

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) parallelGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(parallelGateway));

			// check link flowElements from sequenceFlow to process
			JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

			// check link sourceRef from sequenceFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(sequenceFlow.getSourceRef()));

			// iterate to-many link targetRef from parallelGateway to inFlow
			fujaba__Success = false;

			fujaba__IterParallelGatewayToInFlow = new ArrayList(
					parallelGateway.getIncoming()).iterator();

			while (fujaba__IterParallelGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterParallelGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects sequenceFlow and inFlow 
					JavaSDM.ensure(!sequenceFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_sequenceFlow_flowElements_931142 = sequenceFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
									.eContainer() : null;

							// check object __DEC_sequenceFlow_flowElements_931142 is really bound
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_931142 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_931142
									.getFlowElements().contains(sequenceFlow));

							// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_931142 and process 
							JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_931142
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from sequenceFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(sequenceFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// check object _edge_sourceRef is really bound
						JavaSDM.ensure(_edge_sourceRef != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check isomorphic binding between objects sequenceFlow and inFlow 
						JavaSDM.ensure(!sequenceFlow.equals(inFlow));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link sourceRef from sequenceFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(sequenceFlow
								.getSourceRef()));

						// check link src from _edge_sourceRef to sequenceFlow
						JavaSDM.ensure(sequenceFlow.equals(_edge_sourceRef
								.getSrc()));

						// check link targetRef from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link trg from _edge_sourceRef to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, parallelGateway, sequenceFlow, inFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_337705 = null;
		Match match = null;
		Iterator fujaba__IterSequenceFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		SequenceFlow sequenceFlow = null;
		ParallelGateway parallelGateway = null;

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

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = sequenceFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) sequenceFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(sequenceFlow));

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

			// check link sourceRef from sequenceFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(sequenceFlow.getSourceRef()));

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
					// check isomorphic binding between objects sequenceFlow and inFlow 
					JavaSDM.ensure(!sequenceFlow.equals(inFlow));

					// check link targetRef from inFlow to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

					// iterate to-many link src from sequenceFlow to _edge_sourceRef
					fujaba__Success = false;

					fujaba__IterSequenceFlowTo_edge_sourceRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(sequenceFlow,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterSequenceFlowTo_edge_sourceRef.hasNext()) {
						try {
							_edge_sourceRef = (EMoflonEdge) fujaba__IterSequenceFlowTo_edge_sourceRef
									.next();

							// check object _edge_sourceRef is really bound
							JavaSDM.ensure(_edge_sourceRef != null);
							// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
							JavaSDM.ensure(!_edge_sourceRef
									.equals(_edge_outgoing));

							// check link trg from _edge_sourceRef to parallelGateway
							JavaSDM.ensure(parallelGateway
									.equals(_edge_sourceRef.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_sequenceFlow_flowElements_337705 = sequenceFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
											.eContainer() : null;

									// check object __DEC_sequenceFlow_flowElements_337705 is really bound
									JavaSDM.ensure(__DEC_sequenceFlow_flowElements_337705 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_sequenceFlow_flowElements_337705
											.getFlowElements().contains(
													sequenceFlow));

									// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_337705 and process 
									JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_337705
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link default from sequenceFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(sequenceFlow,
												ExclusiveGateway.class,
												"default").size() == 0);
								// check object _edge_outgoing is really bound
								JavaSDM.ensure(_edge_outgoing != null);
								// check object _edge_sourceRef is really bound
								JavaSDM.ensure(_edge_sourceRef != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object sequenceFlow is really bound
								JavaSDM.ensure(sequenceFlow != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects sequenceFlow and inFlow 
								JavaSDM.ensure(!sequenceFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link flowElements from sequenceFlow to process
								JavaSDM.ensure(process.equals(sequenceFlow
										.eContainer()));

								// check link sourceRef from sequenceFlow to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(sequenceFlow.getSourceRef()));

								// check link src from _edge_outgoing to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_outgoing.getSrc()));

								// check link src from _edge_sourceRef to sequenceFlow
								JavaSDM.ensure(sequenceFlow
										.equals(_edge_sourceRef.getSrc()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_outgoing to sequenceFlow
								JavaSDM.ensure(sequenceFlow
										.equals(_edge_outgoing.getTrg()));

								// check link trg from _edge_sourceRef to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_sourceRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, parallelGateway, sequenceFlow,
										inFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_24(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_parallelFlow_flows_495486 = null;
		Iterator fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_134699 = null;
		ParallelStep __DEC_parallelFlow_invokedFlows_134699 = null;
		Match match = null;
		Iterator fujaba__IterFlowToParallelStep = null;
		ParallelStep parallelStep = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		ParallelFlow parallelFlow = null;
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

			// ensure correct type and really bound of object parallelFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parallelFlow = (ParallelFlow) _TmpObject;

			// check link flows from parallelFlow to useCase
			JavaSDM.ensure(useCase.equals(parallelFlow.eContainer()));

			// iterate to-many link flows from useCase to flow
			fujaba__Success = false;

			fujaba__IterUseCaseToFlow = new ArrayList(useCase.getFlows())
					.iterator();

			while (fujaba__IterUseCaseToFlow.hasNext()) {
				try {
					flow = (Flow) fujaba__IterUseCaseToFlow.next();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);
					// check isomorphic binding between objects parallelFlow and flow 
					JavaSDM.ensure(!parallelFlow.equals(flow));

					// iterate to-many link steps from flow to parallelStep
					fujaba__Success = false;

					fujaba__IterFlowToParallelStep = new ArrayList(
							flow.getSteps()).iterator();

					while (fujaba__IterFlowToParallelStep.hasNext()) {
						try {
							_TmpObject = fujaba__IterFlowToParallelStep.next();

							// ensure correct type and really bound of object parallelStep
							JavaSDM.ensure(_TmpObject instanceof ParallelStep);
							parallelStep = (ParallelStep) _TmpObject;
							// check link invokedFlows from parallelFlow to parallelStep
							JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelFlow,
											ParallelStep.class, "invokedFlows")
									.contains(parallelStep));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_parallelFlow_flows_495486 = parallelFlow
											.eContainer() instanceof UseCase ? (UseCase) parallelFlow
											.eContainer() : null;

									// check object __DEC_parallelFlow_flows_495486 is really bound
									JavaSDM.ensure(__DEC_parallelFlow_flows_495486 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_parallelFlow_flows_495486
											.getFlows().contains(parallelFlow));

									// check isomorphic binding between objects __DEC_parallelFlow_flows_495486 and useCase 
									JavaSDM.ensure(!__DEC_parallelFlow_flows_495486
											.equals(useCase));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link ref from parallelFlow
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(
												parallelFlow,
												AlternativeFlowAlternative.class,
												"ref").size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link invokedFlows from parallelFlow to __DEC_parallelFlow_invokedFlows_134699
									fujaba__Success = false;

									fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_134699 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															parallelFlow,
															ParallelStep.class,
															"invokedFlows"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_134699
													.hasNext()) {
										try {
											__DEC_parallelFlow_invokedFlows_134699 = (ParallelStep) fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_134699
													.next();

											// check object __DEC_parallelFlow_invokedFlows_134699 is really bound
											JavaSDM.ensure(__DEC_parallelFlow_invokedFlows_134699 != null);
											// check isomorphic binding between objects __DEC_parallelFlow_invokedFlows_134699 and parallelStep 
											JavaSDM.ensure(!__DEC_parallelFlow_invokedFlows_134699
													.equals(parallelStep));

											fujaba__Success = true;
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
								// check object parallelFlow is really bound
								JavaSDM.ensure(parallelFlow != null);
								// check object parallelStep is really bound
								JavaSDM.ensure(parallelStep != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects parallelFlow and flow 
								JavaSDM.ensure(!parallelFlow.equals(flow));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link flows from parallelFlow to useCase
								JavaSDM.ensure(useCase.equals(parallelFlow
										.eContainer()));

								// check link src from _edge_flows to useCase
								JavaSDM.ensure(useCase.equals(_edge_flows
										.getSrc()));

								// check link steps from parallelStep to flow
								JavaSDM.ensure(flow.equals(parallelStep
										.eContainer()));

								// check link trg from _edge_flows to parallelFlow
								JavaSDM.ensure(parallelFlow.equals(_edge_flows
										.getTrg()));

								// check link invokedFlows from parallelFlow to parallelStep
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(parallelFlow,
												ParallelStep.class,
												"invokedFlows").contains(
												parallelStep));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										flow, useCase, parallelStep,
										parallelFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(
			EMoflonEdge _edge_invokedFlows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_parallelFlow_flows_617557 = null;
		Iterator fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_638969 = null;
		ParallelStep __DEC_parallelFlow_invokedFlows_638969 = null;
		Match match = null;
		ParallelFlow parallelFlow = null;
		UseCase useCase = null;
		Flow flow = null;
		ParallelStep parallelStep = null;

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

			// check object _edge_invokedFlows is really bound
			JavaSDM.ensure(_edge_invokedFlows != null);
			// bind object
			_TmpObject = _edge_invokedFlows.getSrc();

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;

			// bind object
			flow = parallelStep.eContainer() instanceof Flow ? (Flow) parallelStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(parallelStep));

			// bind object
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// bind object
			_TmpObject = _edge_invokedFlows.getTrg();

			// ensure correct type and really bound of object parallelFlow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			parallelFlow = (ParallelFlow) _TmpObject;

			// check isomorphic binding between objects parallelFlow and flow 
			JavaSDM.ensure(!parallelFlow.equals(flow));

			// check link flows from parallelFlow to useCase
			JavaSDM.ensure(useCase.equals(parallelFlow.eContainer()));

			// check link invokedFlows from parallelFlow to parallelStep
			JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil.getOppositeReference(
					parallelFlow, ParallelStep.class, "invokedFlows").contains(
					parallelStep));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_parallelFlow_flows_617557 = parallelFlow.eContainer() instanceof UseCase ? (UseCase) parallelFlow
							.eContainer() : null;

					// check object __DEC_parallelFlow_flows_617557 is really bound
					JavaSDM.ensure(__DEC_parallelFlow_flows_617557 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_parallelFlow_flows_617557.getFlows()
							.contains(parallelFlow));

					// check isomorphic binding between objects __DEC_parallelFlow_flows_617557 and useCase 
					JavaSDM.ensure(!__DEC_parallelFlow_flows_617557
							.equals(useCase));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link ref from parallelFlow
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parallelFlow,
								AlternativeFlowAlternative.class, "ref").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link invokedFlows from parallelFlow to __DEC_parallelFlow_invokedFlows_638969
					fujaba__Success = false;

					fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_638969 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelFlow,
											ParallelStep.class, "invokedFlows"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_638969
									.hasNext()) {
						try {
							__DEC_parallelFlow_invokedFlows_638969 = (ParallelStep) fujaba__IterParallelFlowTo__DEC_parallelFlow_invokedFlows_638969
									.next();

							// check object __DEC_parallelFlow_invokedFlows_638969 is really bound
							JavaSDM.ensure(__DEC_parallelFlow_invokedFlows_638969 != null);
							// check isomorphic binding between objects __DEC_parallelFlow_invokedFlows_638969 and parallelStep 
							JavaSDM.ensure(!__DEC_parallelFlow_invokedFlows_638969
									.equals(parallelStep));

							fujaba__Success = true;
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
				// check object parallelFlow is really bound
				JavaSDM.ensure(parallelFlow != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects parallelFlow and flow 
				JavaSDM.ensure(!parallelFlow.equals(flow));

				// check link flows from flow to useCase
				JavaSDM.ensure(useCase.equals(flow.eContainer()));

				// check link flows from parallelFlow to useCase
				JavaSDM.ensure(useCase.equals(parallelFlow.eContainer()));

				// check link src from _edge_invokedFlows to parallelStep
				JavaSDM.ensure(parallelStep.equals(_edge_invokedFlows.getSrc()));

				// check link steps from parallelStep to flow
				JavaSDM.ensure(flow.equals(parallelStep.eContainer()));

				// check link trg from _edge_invokedFlows to parallelFlow
				JavaSDM.ensure(parallelFlow.equals(_edge_invokedFlows.getTrg()));

				// check link invokedFlows from parallelFlow to parallelStep
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parallelFlow, ParallelStep.class,
								"invokedFlows").contains(parallelStep));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, flow, useCase,
						parallelStep, parallelFlow);
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
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(UseCase) arguments.get(7),
					(ProcessToUseCase) arguments.get(8),
					(ParallelStep) arguments.get(9),
					(FlowNodeToStep) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP_PARALLELFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(ParallelStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(ParallelFlow) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_64__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_64((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_65((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SeqFlowAfterPGToParallelFlowRuleImpl