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

import BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule;
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
 * An implementation of the model object '<em><b>Parallel Converging Gateway Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelConvergingGatewayRuleImpl extends AbstractRuleImpl
		implements ParallelConvergingGatewayRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelConvergingGatewayRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelConvergingGatewayRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			SequenceFlow outFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __parallelGateway_outgoing_outFlow = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __outFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
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
					inFlow, parallelGateway, outFlow));

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
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __parallelGateway_outgoing_outFlow
				__parallelGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_parallelGateway
				__outFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway.setName("targetRef");
				// assign attribute __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_parallelGateway
				__outFlow_sourceRef_parallelGateway.setName("sourceRef");
				// assign attribute __parallelGateway_outgoing_outFlow
				__parallelGateway_outgoing_outFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_parallelGateway.setSrc(process);

				// create link
				__parallelGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_parallelGateway.setSrc(inFlow);

				// create link
				__parallelGateway_incoming_inFlow.setSrc(parallelGateway);

				// create link
				__process_flowElements_parallelGateway.setTrg(parallelGateway);

				// create link
				__parallelGateway_outgoing_outFlow.setSrc(parallelGateway);

				// create link
				__inFlow_targetRef_parallelGateway.setTrg(parallelGateway);

				// create link
				__outFlow_sourceRef_parallelGateway.setTrg(parallelGateway);

				// create link
				__parallelGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_parallelGateway.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

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
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
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
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

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
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					parallelGateway, outFlow);
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
		ParallelFlow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		SequenceFlow outFlow = null;
		ParallelGateway parallelGateway = null;
		ParallelStep parallelStep = null;
		Process process = null;
		Step step = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		SequenceFlowToStep outFlowToParallelStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __outFlow_sourceRef_parallelGateway = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge parallelGatewayToParallelStep__target__parallelStep = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge outFlowToParallelStep__target__parallelStep = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __parallelGateway_outgoing_outFlow = null;
		EMoflonEdge parallelGatewayToParallelStep__source__parallelGateway = null;
		EMoflonEdge outFlowToParallelStep__source__outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
			flow = (ParallelFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToStep"));

			// ensure correct type and really bound of object inFlowToStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("initFlow"));

			// ensure correct type and really bound of object initFlow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			initFlow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof Step);
			step = (Step) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects step and parallelStep 
			JavaSDM.ensure(!step.equals(parallelStep));

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
			// create object parallelGatewayToParallelStep
			parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlowToParallelStep
			outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create link
			parallelGatewayToParallelStep.setSource(parallelGateway);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToParallelStep.setSource(outFlow);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

			// create link
			parallelGatewayToParallelStep.setTarget(parallelStep);

			// create link
			outFlowToParallelStep.setTarget(parallelStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToParallelStep is really bound
			JavaSDM.ensure(outFlowToParallelStep != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToParallelStep, "createdLinkElements");
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
			// check object inFlowToStep is really bound
			JavaSDM.ensure(inFlowToStep != null);
			// check object initFlow is really bound
			JavaSDM.ensure(initFlow != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToParallelStep is really bound
			JavaSDM.ensure(outFlowToParallelStep != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToStep and flow 
			JavaSDM.ensure(!inFlowToStep.equals(flow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToInitFlow and flow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(flow));

			// check isomorphic binding between objects outFlowToParallelStep and flow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and flow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToStep and inFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlow 
			JavaSDM.ensure(!initFlow.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToParallelStep and inFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects step and inFlow 
			JavaSDM.ensure(!step.equals(inFlow));

			// check isomorphic binding between objects inFlowToStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects step and inFlowToFlow 
			JavaSDM.ensure(!step.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToStep 
			JavaSDM.ensure(!initFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlow and inFlowToStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToParallelStep and inFlowToStep 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects parallelGateway and inFlowToStep 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToStep));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToStep 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects parallelStep and inFlowToStep 
			JavaSDM.ensure(!parallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects process and inFlowToStep 
			JavaSDM.ensure(!process.equals(inFlowToStep));

			// check isomorphic binding between objects step and inFlowToStep 
			JavaSDM.ensure(!step.equals(inFlowToStep));

			// check isomorphic binding between objects outFlow and initFlow 
			JavaSDM.ensure(!outFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and initFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToParallelStep and initFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(initFlow));

			// check isomorphic binding between objects parallelGateway and initFlow 
			JavaSDM.ensure(!parallelGateway.equals(initFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and initFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(initFlow));

			// check isomorphic binding between objects parallelStep and initFlow 
			JavaSDM.ensure(!parallelStep.equals(initFlow));

			// check isomorphic binding between objects process and initFlow 
			JavaSDM.ensure(!process.equals(initFlow));

			// check isomorphic binding between objects step and initFlow 
			JavaSDM.ensure(!step.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and outFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToParallelStep and outFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(outFlow));

			// check isomorphic binding between objects parallelGateway and outFlow 
			JavaSDM.ensure(!parallelGateway.equals(outFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and outFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(outFlow));

			// check isomorphic binding between objects parallelStep and outFlow 
			JavaSDM.ensure(!parallelStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects step and outFlow 
			JavaSDM.ensure(!step.equals(outFlow));

			// check isomorphic binding between objects outFlowToParallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelGateway and outFlowToInitFlow 
			JavaSDM.ensure(!parallelGateway.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!parallelStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToInitFlow 
			JavaSDM.ensure(!process.equals(outFlowToInitFlow));

			// check isomorphic binding between objects step and outFlowToInitFlow 
			JavaSDM.ensure(!step.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelGateway and outFlowToParallelStep 
			JavaSDM.ensure(!parallelGateway.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelGatewayToParallelStep and outFlowToParallelStep 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelStep and outFlowToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(outFlowToParallelStep));

			// check isomorphic binding between objects process and outFlowToParallelStep 
			JavaSDM.ensure(!process.equals(outFlowToParallelStep));

			// check isomorphic binding between objects step and outFlowToParallelStep 
			JavaSDM.ensure(!step.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelGateway 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects step and parallelGateway 
			JavaSDM.ensure(!step.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGatewayToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelGatewayToParallelStep 
			JavaSDM.ensure(!process.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects step and parallelGatewayToParallelStep 
			JavaSDM.ensure(!step.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// check isomorphic binding between objects step and parallelStep 
			JavaSDM.ensure(!step.equals(parallelStep));

			// check isomorphic binding between objects step and process 
			JavaSDM.ensure(!step.equals(process));

			// create object __outFlow_sourceRef_parallelGateway
			__outFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_parallelGateway
			__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelGateway_incoming_inFlow
			__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToParallelStep__target__parallelStep
			outFlowToParallelStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_parallelGateway
			__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelGateway_outgoing_outFlow
			__parallelGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToParallelStep__source__outFlow
			outFlowToParallelStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelConvergingGatewayRule");
			// assign attribute __process_flowElements_parallelGateway
			__process_flowElements_parallelGateway.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __inFlow_targetRef_parallelGateway
			__inFlow_targetRef_parallelGateway.setName("targetRef");
			// assign attribute __parallelGateway_incoming_inFlow
			__parallelGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_parallelGateway
			__outFlow_sourceRef_parallelGateway.setName("sourceRef");
			// assign attribute __parallelGateway_outgoing_outFlow
			__parallelGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway
					.setName("source");
			// assign attribute parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep
					.setName("target");
			// assign attribute outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow.setName("source");
			// assign attribute outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow.setName("target");
			// assign attribute outFlowToParallelStep__source__outFlow
			outFlowToParallelStep__source__outFlow.setName("source");
			// assign attribute outFlowToParallelStep__target__parallelStep
			outFlowToParallelStep__target__parallelStep.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_parallelGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_parallelGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__target__parallelStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							outFlowToParallelStep__target__parallelStep,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_parallelGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__source__parallelGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToParallelStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			__process_flowElements_parallelGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__parallelGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_parallelGateway.setSrc(inFlow);

			// create link
			__inFlow_targetRef_parallelGateway.setTrg(parallelGateway);

			// create link
			__parallelGateway_outgoing_outFlow.setSrc(parallelGateway);

			// create link
			__process_flowElements_parallelGateway.setTrg(parallelGateway);

			// create link
			__outFlow_sourceRef_parallelGateway.setTrg(parallelGateway);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setTrg(parallelGateway);

			// create link
			__parallelGateway_incoming_inFlow.setSrc(parallelGateway);

			// create link
			__parallelGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToParallelStep__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_parallelGateway.setSrc(outFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			outFlowToParallelStep__target__parallelStep.setTrg(parallelStep);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setTrg(parallelStep);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setSrc(parallelGatewayToParallelStep);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setSrc(parallelGatewayToParallelStep);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToParallelStep__target__parallelStep
					.setSrc(outFlowToParallelStep);

			// create link
			outFlowToParallelStep__source__outFlow
					.setSrc(outFlowToParallelStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, parallelGateway,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
				parallelStep, parallelGatewayToParallelStep, outFlowToInitFlow,
				outFlowToParallelStep);
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
		SequenceFlow outFlow = null;
		ParallelGateway parallelGateway = null;
		Process process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __inFlowToStep_source_inFlow = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __parallelGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __parallelStep_invokedFlows_flow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __inFlowToStep_target_step = null;
		EMoflonEdge __initFlow_steps_parallelStep = null;
		CSP csp = null;
		Flow initFlow = null;
		Iterator fujaba__IterFlowToParallelStep = null;
		ParallelStep parallelStep = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		ParallelFlow flow = null;
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
			ruleresult.setRule("ParallelConvergingGatewayRule");

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
			_TmpObject = (match.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
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
					_TmpObject = inFlowToFlow.getTarget();

					// ensure correct type and really bound of object flow
					JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
					flow = (ParallelFlow) _TmpObject;

					// iterate to-many link source from inFlow to inFlowToStep
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToStep.class, "source"))
							.iterator();

					while (fujaba__IterInFlowToInFlowToStep.hasNext()) {
						try {
							inFlowToStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToStep
									.next();

							// check object inFlowToStep is really bound
							JavaSDM.ensure(inFlowToStep != null);
							// bind object
							step = inFlowToStep.getTarget();

							// check object step is really bound
							JavaSDM.ensure(step != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object inFlowToStep is really bound
								JavaSDM.ensure(inFlowToStep != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from inFlowToStep to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToStep
										.getSource()));

								// check link sourceRef from outFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(outFlow
										.getSourceRef()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from inFlowToStep to step
								JavaSDM.ensure(step.equals(inFlowToStep
										.getTarget()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// iterate to-many link invokedFlows from flow to parallelStep
								fujaba__Success = false;

								fujaba__IterFlowToParallelStep = new ArrayList(
										org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(flow,
														ParallelStep.class,
														"invokedFlows"))
										.iterator();

								while (fujaba__IterFlowToParallelStep.hasNext()) {
									try {
										parallelStep = (ParallelStep) fujaba__IterFlowToParallelStep
												.next();

										// check object parallelStep is really bound
										JavaSDM.ensure(parallelStep != null);
										// check isomorphic binding between objects step and parallelStep 
										JavaSDM.ensure(!step
												.equals(parallelStep));

										// bind object
										initFlow = parallelStep.eContainer() instanceof Flow ? (Flow) parallelStep
												.eContainer() : null;

										// check object initFlow is really bound
										JavaSDM.ensure(initFlow != null);

										// check if contained via correct reference
										JavaSDM.ensure(initFlow.getSteps()
												.contains(parallelStep));

										// check isomorphic binding between objects initFlow and flow 
										JavaSDM.ensure(!initFlow.equals(flow));

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToStep_source_inFlow
										__inFlowToStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelGateway_outgoing_outFlow
										__parallelGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_parallelGateway
										__outFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __parallelStep_invokedFlows_flow
										__parallelStep_invokedFlows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_step
										__flow_steps_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToStep_target_step
										__inFlowToStep_target_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __initFlow_steps_parallelStep
										__initFlow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_parallelGateway
										__process_flowElements_parallelGateway
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_parallelGateway
										__inFlow_targetRef_parallelGateway
												.setName("targetRef");
										// assign attribute __parallelGateway_incoming_inFlow
										__parallelGateway_incoming_inFlow
												.setName("incoming");
										// assign attribute __outFlow_sourceRef_parallelGateway
										__outFlow_sourceRef_parallelGateway
												.setName("sourceRef");
										// assign attribute __parallelGateway_outgoing_outFlow
										__parallelGateway_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __flow_steps_step
										__flow_steps_step.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __inFlowToStep_source_inFlow
										__inFlowToStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToStep_target_step
										__inFlowToStep_target_step
												.setName("target");
										// assign attribute __initFlow_steps_parallelStep
										__initFlow_steps_parallelStep
												.setName("steps");
										// assign attribute __parallelStep_invokedFlows_flow
										__parallelStep_invokedFlows_flow
												.setName("invokedFlows");

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__process_flowElements_parallelGateway
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlow_targetRef_parallelGateway
												.setSrc(inFlow);

										// create link
										__inFlowToStep_source_inFlow
												.setTrg(inFlow);

										// create link
										__parallelGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__parallelGateway_outgoing_outFlow
												.setSrc(parallelGateway);

										// create link
										__process_flowElements_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__parallelGateway_incoming_inFlow
												.setSrc(parallelGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelGateway);

										// create link
										__outFlow_sourceRef_parallelGateway
												.setTrg(parallelGateway);

										// create link
										__outFlow_sourceRef_parallelGateway
												.setSrc(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										__parallelGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										__parallelStep_invokedFlows_flow
												.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToStep_target_step.setTrg(step);

										// create link
										__flow_steps_step.setTrg(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										__inFlowToStep_target_step
												.setSrc(inFlowToStep);

										// create link
										__inFlowToStep_source_inFlow
												.setSrc(inFlowToStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														initFlow);

										// create link
										__initFlow_steps_parallelStep
												.setSrc(initFlow);

										// create link
										__parallelStep_invokedFlows_flow
												.setSrc(parallelStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														parallelStep);

										// create link
										__initFlow_steps_parallelStep
												.setTrg(parallelStep);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__parallelStep_invokedFlows_flow,
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
														__parallelGateway_outgoing_outFlow,
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
														__inFlowToFlow_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__initFlow_steps_parallelStep,
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
														__inFlowToStep_source_inFlow,
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
														__inFlowToFlow_target_flow,
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
														__outFlow_sourceRef_parallelGateway,
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
														__inFlowToStep_target_step,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															process, inFlow,
															parallelGateway,
															outFlow, flow,
															inFlowToFlow, step,
															inFlowToStep,
															initFlow,
															parallelStep));

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
														.setRuleName("ParallelConvergingGatewayRule");

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
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			SequenceFlow outFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			SequenceFlow outFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());

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
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
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
			EObject process, EObject inFlow, EObject parallelGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToParallelStep",
				outFlowToParallelStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("parallelGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getParallelGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_514(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_385757 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_829802 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_346885 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_346885 = null;
		Match match = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;
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

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

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
					// check link targetRef from inFlow to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

					// iterate to-many link flowElements from process to outFlow
					fujaba__Success = false;

					fujaba__IterProcessToOutFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToOutFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToOutFlow.next();

							// ensure correct type and really bound of object outFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							outFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link sourceRef from outFlow to parallelGateway
							JavaSDM.ensure(parallelGateway.equals(outFlow
									.getSourceRef()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_385757 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_385757 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_385757 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_385757
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_385757 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_385757
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
									__DEC_parallelGateway_flowElements_829802 = parallelGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
											.eContainer() : null;

									// check object __DEC_parallelGateway_flowElements_829802 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_829802 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_829802
											.getFlowElements().contains(
													parallelGateway));

									// check isomorphic binding between objects __DEC_parallelGateway_flowElements_829802 and process 
									JavaSDM.ensure(!__DEC_parallelGateway_flowElements_829802
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
								// negative check for link flowNodeRefs from parallelGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(parallelGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_346885
									fujaba__Success = false;

									fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_346885 = new ArrayList(
											parallelGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_346885
													.hasNext()) {
										try {
											__DEC_parallelGateway_targetRef_346885 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_346885
													.next();

											// check object __DEC_parallelGateway_targetRef_346885 is really bound
											JavaSDM.ensure(__DEC_parallelGateway_targetRef_346885 != null);
											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_346885 and inFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_346885
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_346885 and outFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_346885
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
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link sourceRef from outFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to parallelGateway
								JavaSDM.ensure(!(parallelGateway.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_flowElements to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_flowElements.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, parallelGateway,
										outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_515(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_125656 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_903234 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_810738 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_810738 = null;
		Match match = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
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

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

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

					// iterate to-many link flowElements from process to parallelGateway
					fujaba__Success = false;

					fujaba__IterProcessToParallelGateway = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToParallelGateway.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToParallelGateway
									.next();

							// ensure correct type and really bound of object parallelGateway
							JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
							parallelGateway = (ParallelGateway) _TmpObject;
							// check link sourceRef from outFlow to parallelGateway
							JavaSDM.ensure(parallelGateway.equals(outFlow
									.getSourceRef()));

							// check link targetRef from inFlow to parallelGateway
							JavaSDM.ensure(parallelGateway.equals(inFlow
									.getTargetRef()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_125656 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_125656 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_125656 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_125656
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_125656 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_125656
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
									__DEC_parallelGateway_flowElements_903234 = parallelGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
											.eContainer() : null;

									// check object __DEC_parallelGateway_flowElements_903234 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_903234 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_903234
											.getFlowElements().contains(
													parallelGateway));

									// check isomorphic binding between objects __DEC_parallelGateway_flowElements_903234 and process 
									JavaSDM.ensure(!__DEC_parallelGateway_flowElements_903234
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
								// negative check for link flowNodeRefs from parallelGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(parallelGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_810738
									fujaba__Success = false;

									fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_810738 = new ArrayList(
											parallelGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_810738
													.hasNext()) {
										try {
											__DEC_parallelGateway_targetRef_810738 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_810738
													.next();

											// check object __DEC_parallelGateway_targetRef_810738 is really bound
											JavaSDM.ensure(__DEC_parallelGateway_targetRef_810738 != null);
											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_810738 and inFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_810738
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_810738 and outFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_810738
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
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link sourceRef from outFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to parallelGateway
								JavaSDM.ensure(!(parallelGateway.equals(outFlow
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
										process, inFlow, parallelGateway,
										outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_516(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_362998 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_211471 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_146416 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_146416 = null;
		Match match = null;
		Iterator fujaba__IterParallelGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		ParallelGateway parallelGateway = null;
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

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelGateway.eContainer() instanceof Process ? (Process) parallelGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(parallelGateway));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link sourceRef from parallelGateway to outFlow
			fujaba__Success = false;

			fujaba__IterParallelGatewayToOutFlow = new ArrayList(
					parallelGateway.getOutgoing()).iterator();

			while (fujaba__IterParallelGatewayToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterParallelGatewayToOutFlow
							.next();

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
							__DEC_outFlow_flowElements_362998 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_362998 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_362998 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_362998
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_362998 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_362998
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
							__DEC_parallelGateway_flowElements_211471 = parallelGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
									.eContainer() : null;

							// check object __DEC_parallelGateway_flowElements_211471 is really bound
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_211471 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_211471
									.getFlowElements()
									.contains(parallelGateway));

							// check isomorphic binding between objects __DEC_parallelGateway_flowElements_211471 and process 
							JavaSDM.ensure(!__DEC_parallelGateway_flowElements_211471
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
						// negative check for link flowNodeRefs from parallelGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parallelGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_146416
							fujaba__Success = false;

							fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_146416 = new ArrayList(
									parallelGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_146416
											.hasNext()) {
								try {
									__DEC_parallelGateway_targetRef_146416 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_146416
											.next();

									// check object __DEC_parallelGateway_targetRef_146416 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_targetRef_146416 != null);
									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_146416 and inFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_146416
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_146416 and outFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_146416
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
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link sourceRef from outFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to parallelGateway
						JavaSDM.ensure(!(parallelGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_targetRef to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, parallelGateway, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_517(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_735063 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_747731 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_134918 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_134918 = null;
		Match match = null;
		Iterator fujaba__IterParallelGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterParallelGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		ParallelGateway parallelGateway = null;
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

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelGateway.eContainer() instanceof Process ? (Process) parallelGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(parallelGateway));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link sourceRef from parallelGateway to outFlow
			fujaba__Success = false;

			fujaba__IterParallelGatewayToOutFlow = new ArrayList(
					parallelGateway.getOutgoing()).iterator();

			while (fujaba__IterParallelGatewayToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterParallelGatewayToOutFlow
							.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link trg from parallelGateway to _edge_targetRef
					fujaba__Success = false;

					fujaba__IterParallelGatewayTo_edge_targetRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelGateway,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterParallelGatewayTo_edge_targetRef
							.hasNext()) {
						try {
							_edge_targetRef = (EMoflonEdge) fujaba__IterParallelGatewayTo_edge_targetRef
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
									__DEC_outFlow_flowElements_735063 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_735063 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_735063 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_735063
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_735063 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_735063
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
									__DEC_parallelGateway_flowElements_747731 = parallelGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
											.eContainer() : null;

									// check object __DEC_parallelGateway_flowElements_747731 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_747731 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_747731
											.getFlowElements().contains(
													parallelGateway));

									// check isomorphic binding between objects __DEC_parallelGateway_flowElements_747731 and process 
									JavaSDM.ensure(!__DEC_parallelGateway_flowElements_747731
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
								// negative check for link flowNodeRefs from parallelGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(parallelGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_134918
									fujaba__Success = false;

									fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_134918 = new ArrayList(
											parallelGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_134918
													.hasNext()) {
										try {
											__DEC_parallelGateway_targetRef_134918 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_134918
													.next();

											// check object __DEC_parallelGateway_targetRef_134918 is really bound
											JavaSDM.ensure(__DEC_parallelGateway_targetRef_134918 != null);
											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_134918 and inFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_134918
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_134918 and outFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_134918
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
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
								JavaSDM.ensure(!_edge_targetRef
										.equals(_edge_incoming));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link sourceRef from outFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_incoming to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_incoming.getSrc()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to parallelGateway
								JavaSDM.ensure(!(parallelGateway.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_incoming to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_incoming
										.getTrg()));

								// check link trg from _edge_targetRef to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_targetRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, parallelGateway,
										outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_518(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_543932 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_401683 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_87884 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_87884 = null;
		Match match = null;
		Iterator fujaba__IterParallelGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		ParallelGateway parallelGateway = null;
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

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelGateway.eContainer() instanceof Process ? (Process) parallelGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(parallelGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(outFlow.getSourceRef()));

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
							__DEC_outFlow_flowElements_543932 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_543932 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_543932 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_543932
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_543932 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_543932
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
							__DEC_parallelGateway_flowElements_401683 = parallelGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
									.eContainer() : null;

							// check object __DEC_parallelGateway_flowElements_401683 is really bound
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_401683 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_401683
									.getFlowElements()
									.contains(parallelGateway));

							// check isomorphic binding between objects __DEC_parallelGateway_flowElements_401683 and process 
							JavaSDM.ensure(!__DEC_parallelGateway_flowElements_401683
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
						// negative check for link flowNodeRefs from parallelGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parallelGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_87884
							fujaba__Success = false;

							fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_87884 = new ArrayList(
									parallelGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_87884
											.hasNext()) {
								try {
									__DEC_parallelGateway_targetRef_87884 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_87884
											.next();

									// check object __DEC_parallelGateway_targetRef_87884 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_targetRef_87884 != null);
									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_87884 and inFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_87884
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_87884 and outFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_87884
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
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link sourceRef from outFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link targetRef from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to parallelGateway
						JavaSDM.ensure(!(parallelGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_sourceRef to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, parallelGateway, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_519(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_287101 = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_180341 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_497243 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_497243 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
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

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

			// check link sourceRef from outFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(outFlow.getSourceRef()));

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

					// check link targetRef from inFlow to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

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
									__DEC_outFlow_flowElements_287101 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_287101 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_287101 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_287101
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_287101 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_287101
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
									__DEC_parallelGateway_flowElements_180341 = parallelGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
											.eContainer() : null;

									// check object __DEC_parallelGateway_flowElements_180341 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_180341 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_parallelGateway_flowElements_180341
											.getFlowElements().contains(
													parallelGateway));

									// check isomorphic binding between objects __DEC_parallelGateway_flowElements_180341 and process 
									JavaSDM.ensure(!__DEC_parallelGateway_flowElements_180341
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
								// negative check for link flowNodeRefs from parallelGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(parallelGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from parallelGateway to __DEC_parallelGateway_targetRef_497243
									fujaba__Success = false;

									fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_497243 = new ArrayList(
											parallelGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_497243
													.hasNext()) {
										try {
											__DEC_parallelGateway_targetRef_497243 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_497243
													.next();

											// check object __DEC_parallelGateway_targetRef_497243 is really bound
											JavaSDM.ensure(__DEC_parallelGateway_targetRef_497243 != null);
											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_497243 and inFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_497243
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_parallelGateway_targetRef_497243 and outFlow 
											JavaSDM.ensure(!__DEC_parallelGateway_targetRef_497243
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
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object parallelGateway is really bound
								JavaSDM.ensure(parallelGateway != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from parallelGateway to process
								JavaSDM.ensure(process.equals(parallelGateway
										.eContainer()));

								// check link sourceRef from outFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_outgoing to parallelGateway
								JavaSDM.ensure(parallelGateway
										.equals(_edge_outgoing.getSrc()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link targetRef from inFlow to parallelGateway
								JavaSDM.ensure(parallelGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to parallelGateway
								JavaSDM.ensure(!(parallelGateway.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_outgoing to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_outgoing
										.getTrg()));

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
										process, inFlow, parallelGateway,
										outFlow);
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
		SequenceFlow outFlow = null;
		ParallelGateway parallelGateway = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		SequenceFlowToStep outFlowToParallelStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		Iterator fujaba__IterFlowToParallelStep = null;
		ParallelStep parallelStep = null;
		ParallelFlow flow = null;
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
							_TmpObject = inFlowToFlow.getTarget();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
							flow = (ParallelFlow) _TmpObject;

							// iterate to-many link invokedFlows from flow to parallelStep
							fujaba__Success = false;

							fujaba__IterFlowToParallelStep = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(flow,
													ParallelStep.class,
													"invokedFlows")).iterator();

							while (fujaba__IterFlowToParallelStep.hasNext()) {
								try {
									parallelStep = (ParallelStep) fujaba__IterFlowToParallelStep
											.next();

									// check object parallelStep is really bound
									JavaSDM.ensure(parallelStep != null);
									// bind object
									initFlow = parallelStep.eContainer() instanceof Flow ? (Flow) parallelStep
											.eContainer() : null;

									// check object initFlow is really bound
									JavaSDM.ensure(initFlow != null);

									// check if contained via correct reference
									JavaSDM.ensure(initFlow.getSteps()
											.contains(parallelStep));

									// check isomorphic binding between objects initFlow and flow 
									JavaSDM.ensure(!initFlow.equals(flow));

									// iterate to-many link source from inFlow to inFlowToStep
									fujaba__Success = false;

									fujaba__IterInFlowToInFlowToStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															inFlow,
															SequenceFlowToStep.class,
															"source"))
											.iterator();

									while (fujaba__IterInFlowToInFlowToStep
											.hasNext()) {
										try {
											inFlowToStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToStep
													.next();

											// check object inFlowToStep is really bound
											JavaSDM.ensure(inFlowToStep != null);
											// bind object
											step = inFlowToStep.getTarget();

											// check object step is really bound
											JavaSDM.ensure(step != null);

											// check isomorphic binding between objects step and parallelStep 
											JavaSDM.ensure(!step
													.equals(parallelStep));

											// check link steps from step to flow
											JavaSDM.ensure(flow.equals(step
													.eContainer()));

											// story node 'solve CSP'
											try {
												fujaba__Success = false;

												_TmpObject = (this
														.generateModel_solveCsp_BWD(
																isApplicableMatch,
																process,
																inFlow,
																parallelGateway,
																outFlow,
																flow,
																inFlowToFlow,
																step,
																inFlowToStep,
																initFlow,
																parallelStep,
																parallelGatewayToParallelStep,
																outFlowToInitFlow,
																outFlowToParallelStep,
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

													// check object flow is really bound
													JavaSDM.ensure(flow != null);
													// check object inFlow is really bound
													JavaSDM.ensure(inFlow != null);
													// check object inFlowToFlow is really bound
													JavaSDM.ensure(inFlowToFlow != null);
													// check object inFlowToStep is really bound
													JavaSDM.ensure(inFlowToStep != null);
													// check object initFlow is really bound
													JavaSDM.ensure(initFlow != null);
													// check object parallelStep is really bound
													JavaSDM.ensure(parallelStep != null);
													// check object process is really bound
													JavaSDM.ensure(process != null);
													// check object ruleResult is really bound
													JavaSDM.ensure(ruleResult != null);
													// check object step is really bound
													JavaSDM.ensure(step != null);
													// check isomorphic binding between objects initFlow and flow 
													JavaSDM.ensure(!initFlow
															.equals(flow));

													// check isomorphic binding between objects step and parallelStep 
													JavaSDM.ensure(!step
															.equals(parallelStep));

													// create object outFlow
													outFlow = Bpmn2Factory.eINSTANCE
															.createSequenceFlow();

													// create object parallelGateway
													parallelGateway = Bpmn2Factory.eINSTANCE
															.createParallelGateway();

													// create object parallelGatewayToParallelStep
													parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createFlowNodeToStep();

													// create object outFlowToParallelStep
													outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToStep();

													// create object outFlowToInitFlow
													outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToUCFlow();

													// assign attribute parallelGateway
													parallelGateway
															.setGatewayDirection((bpmn2.GatewayDirection) csp
																	.getAttributeVariable(
																			"parallelGateway",
																			"gatewayDirection")
																	.getValue());
													// assign attribute ruleResult
													ruleResult.setSuccess(true);

													// create link
													process.getFlowElements()
															.add(outFlow); // add link

													// create link
													process.getFlowElements()
															.add(parallelGateway); // add link

													// create link
													parallelGateway
															.getIncoming().add(
																	inFlow);

													// create link
													outFlow.setSourceRef(parallelGateway);

													// create link
													ruleResult
															.getSourceObjects()
															.add(parallelGateway);

													// create link
													parallelGatewayToParallelStep
															.setSource(parallelGateway);

													// create link
													outFlowToParallelStep
															.setSource(outFlow);

													// create link
													outFlowToInitFlow
															.setSource(outFlow);

													// create link
													ruleResult
															.getSourceObjects()
															.add(outFlow);

													// create link
													outFlowToInitFlow
															.setTarget(initFlow);

													// create link
													parallelGatewayToParallelStep
															.setTarget(parallelStep);

													// create link
													outFlowToParallelStep
															.setTarget(parallelStep);

													// create link
													ruleResult
															.getCorrObjects()
															.add(parallelGatewayToParallelStep);

													// create link
													ruleResult
															.getCorrObjects()
															.add(outFlowToInitFlow);

													// create link
													ruleResult
															.getCorrObjects()
															.add(outFlowToParallelStep);

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
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
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
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(Flow) arguments.get(9), (ParallelStep) arguments.get(10));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_514__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_514((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_515__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_515((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_516__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_516((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_517__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_517((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_518__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_518((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_519__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_519((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(Flow) arguments.get(9), (ParallelStep) arguments.get(10),
					(FlowNodeToStep) arguments.get(11),
					(SequenceFlowToUCFlow) arguments.get(12),
					(SequenceFlowToStep) arguments.get(13),
					(ModelgeneratorRuleResult) arguments.get(14));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelConvergingGatewayRuleImpl
