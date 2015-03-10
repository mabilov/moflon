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
import BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule;

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
 * An implementation of the model object '<em><b>Seq Flow After EG To Alt Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeqFlowAfterEGToAltFlowRuleImpl extends AbstractRuleImpl implements
		SeqFlowAfterEGToAltFlowRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqFlowAfterEGToAltFlowRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSeqFlowAfterEGToAltFlowRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __defaultFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_defaultFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, defaultFlow,
					exclusiveGateway, process, outFlow));

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

				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

				// create link
				__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// create object __defaultFlow_sourceRef_exclusiveGateway
				__defaultFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_defaultFlow
				__process_flowElements_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_defaultFlow
				__exclusiveGateway_outgoing_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow.setName("default");
				// assign attribute __defaultFlow_sourceRef_exclusiveGateway
				__defaultFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_defaultFlow
				__exclusiveGateway_outgoing_defaultFlow.setName("outgoing");
				// assign attribute __process_flowElements_defaultFlow
				__process_flowElements_defaultFlow.setName("flowElements");
				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__defaultFlow_sourceRef_exclusiveGateway,
						"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						defaultFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_defaultFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__process_flowElements_exclusiveGateway,
								"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_defaultFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__exclusiveGateway_outgoing_defaultFlow,
								"contextEdges");

				// create link
				__exclusiveGateway_outgoing_defaultFlow.setTrg(defaultFlow);

				// create link
				__defaultFlow_sourceRef_exclusiveGateway.setSrc(defaultFlow);

				// create link
				__exclusiveGateway_default_defaultFlow.setTrg(defaultFlow);

				// create link
				__process_flowElements_defaultFlow.setTrg(defaultFlow);

				// create link
				__exclusiveGateway_outgoing_defaultFlow
						.setSrc(exclusiveGateway);

				// create link
				__defaultFlow_sourceRef_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_default_defaultFlow.setSrc(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__process_flowElements_defaultFlow.setSrc(process);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, defaultFlow,
					exclusiveGateway, process, outFlow);
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
		SequenceFlow defaultFlow = null;
		SequenceFlowToUCFlow defaultFlowToFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		Flow flow = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;
		SequenceFlowToUCFlow outFlowToAlternativeFlow = null;
		SeqFlowToAltFlowAlt outFlowToAlt = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__source__outFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;
		EMoflonEdge alt__ref__alternativeFlow = null;
		EMoflonEdge useCase__flows__alternativeFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__target__alternativeFlow = null;
		EMoflonEdge normalStep__stepAlternative__alt = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge outFlowToAlt__target__alt = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlowToFlow"));

			// ensure correct type and really bound of object defaultFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			defaultFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("exclusiveGatewayToNormalStep"));

			// ensure correct type and really bound of object exclusiveGatewayToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			exclusiveGatewayToNormalStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
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
			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

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
			// create object alternativeFlow
			alternativeFlow = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlow();

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object outFlowToAlternativeFlow
			outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSeqFlowToAltFlowAlt();

			// assign attribute alternativeFlow
			alternativeFlow.setName((java.lang.String) csp.getValue(
					"alternativeFlow", "name"));
			// assign attribute alt
			alt.setCondition((java.lang.String) csp
					.getValue("alt", "condition"));

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToAlt,
					outFlow, "source");

			// create link
			useCase.getFlows().add(alternativeFlow); // add link

			// create link
			normalStep.getStepAlternative().add(alt); // add link

			// create link
			outFlowToAlternativeFlow.setTarget(alternativeFlow);

			// create link
			alt.setRef(alternativeFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					outFlowToAlternativeFlow, outFlow, "source");

			// create link
			outFlowToAlt.setTarget(alt);

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
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow, "createdLinkElements");
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
			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object defaultFlowToFlow is really bound
			JavaSDM.ensure(defaultFlowToFlow != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
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

			// check isomorphic binding between objects defaultFlow and alt 
			JavaSDM.ensure(!defaultFlow.equals(alt));

			// check isomorphic binding between objects defaultFlowToFlow and alt 
			JavaSDM.ensure(!defaultFlowToFlow.equals(alt));

			// check isomorphic binding between objects exclusiveGateway and alt 
			JavaSDM.ensure(!exclusiveGateway.equals(alt));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and alt 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

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

			// check isomorphic binding between objects defaultFlow and alternativeFlow 
			JavaSDM.ensure(!defaultFlow.equals(alternativeFlow));

			// check isomorphic binding between objects defaultFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!defaultFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects exclusiveGateway and alternativeFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(alternativeFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and alternativeFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

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

			// check isomorphic binding between objects defaultFlowToFlow and defaultFlow 
			JavaSDM.ensure(!defaultFlowToFlow.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects flow and defaultFlow 
			JavaSDM.ensure(!flow.equals(defaultFlow));

			// check isomorphic binding between objects normalStep and defaultFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToAlt and defaultFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and defaultFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(defaultFlow));

			// check isomorphic binding between objects process and defaultFlow 
			JavaSDM.ensure(!process.equals(defaultFlow));

			// check isomorphic binding between objects processToUseCase and defaultFlow 
			JavaSDM.ensure(!processToUseCase.equals(defaultFlow));

			// check isomorphic binding between objects useCase and defaultFlow 
			JavaSDM.ensure(!useCase.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlowToFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlowToFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlowToFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(defaultFlowToFlow));

			// check isomorphic binding between objects flow and defaultFlowToFlow 
			JavaSDM.ensure(!flow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects normalStep and defaultFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlow and defaultFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and defaultFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and defaultFlowToFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects process and defaultFlowToFlow 
			JavaSDM.ensure(!process.equals(defaultFlowToFlow));

			// check isomorphic binding between objects processToUseCase and defaultFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(defaultFlowToFlow));

			// check isomorphic binding between objects useCase and defaultFlowToFlow 
			JavaSDM.ensure(!useCase.equals(defaultFlowToFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToAlt and exclusiveGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToAlternativeFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToUseCase and exclusiveGateway 
			JavaSDM.ensure(!processToUseCase.equals(exclusiveGateway));

			// check isomorphic binding between objects useCase and exclusiveGateway 
			JavaSDM.ensure(!useCase.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToUseCase and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToUseCase
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects useCase and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!useCase.equals(exclusiveGatewayToNormalStep));

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

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object alt__ref__alternativeFlow
			alt__ref__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SeqFlowAfterEGToAltFlowRule");
			// assign attribute useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow.setName("flows");
			// assign attribute normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt.setName("stepAlternative");
			// assign attribute outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow.setName("source");
			// assign attribute outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow.setName("target");
			// assign attribute alt__ref__alternativeFlow
			alt__ref__alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
			// assign attribute __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			useCase__flows__alternativeFlow.setSrc(useCase);

			// create link
			normalStep__stepAlternative__alt.setSrc(normalStep);

			// create link
			alt__ref__alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			useCase__flows__alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			alt__ref__alternativeFlow.setSrc(alt);

			// create link
			normalStep__stepAlternative__alt.setTrg(alt);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			outFlowToAlternativeFlow__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

			// create link
			__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow);
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
		SequenceFlow defaultFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __defaultFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __defaultFlowToFlow_source_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __process_flowElements_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_defaultFlow = null;
		EMoflonEdge __defaultFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_target_normalStep = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_source_exclusiveGateway = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		Flow flow = null;
		Iterator fujaba__IterDefaultFlowToDefaultFlowToFlow = null;
		SequenceFlowToUCFlow defaultFlowToFlow = null;

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
			ruleresult.setRule("SeqFlowAfterEGToAltFlowRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (match.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// iterate to-many link source from defaultFlow to defaultFlowToFlow
			fujaba__Success = false;

			fujaba__IterDefaultFlowToDefaultFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							defaultFlow, SequenceFlowToUCFlow.class, "source"))
					.iterator();

			while (fujaba__IterDefaultFlowToDefaultFlowToFlow.hasNext()) {
				try {
					defaultFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterDefaultFlowToDefaultFlowToFlow
							.next();

					// check object defaultFlowToFlow is really bound
					JavaSDM.ensure(defaultFlowToFlow != null);
					// bind object
					flow = defaultFlowToFlow.getTarget();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// iterate to-many link source from exclusiveGateway to exclusiveGatewayToNormalStep
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exclusiveGateway,
											FlowNodeToStep.class, "source"))
							.iterator();

					while (fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
							.hasNext()) {
						try {
							exclusiveGatewayToNormalStep = (FlowNodeToStep) fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
									.next();

							// check object exclusiveGatewayToNormalStep is really bound
							JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
							// bind object
							_TmpObject = exclusiveGatewayToNormalStep
									.getTarget();

							// ensure correct type and really bound of object normalStep
							JavaSDM.ensure(_TmpObject instanceof NormalStep);
							normalStep = (NormalStep) _TmpObject;

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

										// check object defaultFlow is really bound
										JavaSDM.ensure(defaultFlow != null);
										// check object defaultFlowToFlow is really bound
										JavaSDM.ensure(defaultFlowToFlow != null);
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object exclusiveGatewayToNormalStep is really bound
										JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
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
										// check isomorphic binding between objects outFlow and defaultFlow 
										JavaSDM.ensure(!outFlow
												.equals(defaultFlow));

										// check link default from exclusiveGateway to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from defaultFlow to process
										JavaSDM.ensure(process
												.equals(defaultFlow
														.eContainer()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link source from defaultFlowToFlow to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(defaultFlowToFlow
														.getSource()));

										// check link source from exclusiveGatewayToNormalStep to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(exclusiveGatewayToNormalStep
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link sourceRef from defaultFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(defaultFlow
														.getSourceRef()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from defaultFlowToFlow to flow
										JavaSDM.ensure(flow
												.equals(defaultFlowToFlow
														.getTarget()));

										// check link target from exclusiveGatewayToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(exclusiveGatewayToNormalStep
														.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlow_sourceRef_exclusiveGateway
										__defaultFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlowToFlow_source_defaultFlow
										__defaultFlowToFlow_source_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_default_defaultFlow
										__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_defaultFlow
										__process_flowElements_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_outgoing_defaultFlow
										__exclusiveGateway_outgoing_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlowToFlow_target_flow
										__defaultFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGatewayToNormalStep_target_normalStep
										__exclusiveGatewayToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGatewayToNormalStep_source_exclusiveGateway
										__exclusiveGatewayToNormalStep_source_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_exclusiveGateway
										__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_outgoing_outFlow
										__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

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
										// assign attribute __defaultFlowToFlow_source_defaultFlow
										__defaultFlowToFlow_source_defaultFlow
												.setName("source");
										// assign attribute __defaultFlowToFlow_target_flow
										__defaultFlowToFlow_target_flow
												.setName("target");
										// assign attribute __exclusiveGatewayToNormalStep_source_exclusiveGateway
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setName("source");
										// assign attribute __exclusiveGatewayToNormalStep_target_normalStep
										__exclusiveGatewayToNormalStep_target_normalStep
												.setName("target");
										// assign attribute __exclusiveGateway_default_defaultFlow
										__exclusiveGateway_default_defaultFlow
												.setName("default");
										// assign attribute __defaultFlow_sourceRef_exclusiveGateway
										__defaultFlow_sourceRef_exclusiveGateway
												.setName("sourceRef");
										// assign attribute __exclusiveGateway_outgoing_defaultFlow
										__exclusiveGateway_outgoing_defaultFlow
												.setName("outgoing");
										// assign attribute __outFlow_sourceRef_exclusiveGateway
										__outFlow_sourceRef_exclusiveGateway
												.setName("sourceRef");
										// assign attribute __exclusiveGateway_outgoing_outFlow
										__exclusiveGateway_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __process_flowElements_defaultFlow
										__process_flowElements_defaultFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
												.setName("flowElements");

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

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
														defaultFlow);

										// create link
										__defaultFlow_sourceRef_exclusiveGateway
												.setSrc(defaultFlow);

										// create link
										__defaultFlowToFlow_source_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__exclusiveGateway_default_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__process_flowElements_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__exclusiveGateway_outgoing_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__defaultFlowToFlow_target_flow
												.setTrg(flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__defaultFlowToFlow_source_defaultFlow
												.setSrc(defaultFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														defaultFlowToFlow);

										// create link
										__defaultFlowToFlow_target_flow
												.setSrc(defaultFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										__exclusiveGatewayToNormalStep_target_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements()
												.add(exclusiveGatewayToNormalStep);

										// create link
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setSrc(exclusiveGatewayToNormalStep);

										// create link
										__exclusiveGatewayToNormalStep_target_normalStep
												.setSrc(exclusiveGatewayToNormalStep);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__process_flowElements_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setSrc(exclusiveGateway);

										// create link
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__defaultFlow_sourceRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_default_defaultFlow
												.setSrc(exclusiveGateway);

										// create link
										__exclusiveGateway_outgoing_defaultFlow
												.setSrc(exclusiveGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														exclusiveGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_defaultFlow
												.setSrc(process);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										__process_flowElements_exclusiveGateway
												.setSrc(process);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setSrc(outFlow);

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
														__exclusiveGatewayToNormalStep_target_normalStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGateway_outgoing_outFlow,
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
														__useCase_flows_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_sourceRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_exclusiveGateway,
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
														__exclusiveGateway_outgoing_defaultFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_defaultFlow,
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
														__defaultFlowToFlow_source_defaultFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGateway_default_defaultFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__defaultFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__defaultFlow_sourceRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGatewayToNormalStep_source_exclusiveGateway,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															useCase,
															processToUseCase,
															defaultFlow,
															flow,
															defaultFlowToFlow,
															normalStep,
															exclusiveGatewayToNormalStep,
															exclusiveGateway,
															process, outFlow));

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
														.setRuleName("SeqFlowAfterEGToAltFlowRule");
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
	public void registerObjectsToMatch_FWD(Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		match.registerObject("defaultFlow", defaultFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("process", process);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
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
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_outFlow_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.id", true, csp);
		var_outFlow_id.setValue(outFlow.getId());
		var_outFlow_id.setType("");
		Variable var_outFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.name", true, csp);
		var_outFlow_name.setValue(outFlow.getName());
		var_outFlow_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_outFlow_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_outFlow_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("outFlow", outFlow);
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
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("outFlow").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, Flow flow,
			NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
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
					normalStep, alternativeFlow, alt));

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
						alternativeFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_alternativeFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__normalStep_stepAlternative_alt,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				__useCase_flows_alternativeFlow.setSrc(useCase);

				// create link
				__normalStep_stepAlternative_alt.setSrc(normalStep);

				// create link
				__alt_ref_alternativeFlow.setTrg(alternativeFlow);

				// create link
				__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

				// create link
				__alt_ref_alternativeFlow.setSrc(alt);

				// create link
				__normalStep_stepAlternative_alt.setTrg(alt);

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
						normalStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

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
					alternativeFlow, alt);
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
		SequenceFlow defaultFlow = null;
		SequenceFlowToUCFlow defaultFlowToFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		Flow flow = null;
		NormalStep normalStep = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlowToUCFlow outFlowToAlternativeFlow = null;
		SequenceFlow outFlow = null;
		SeqFlowToAltFlowAlt outFlowToAlt = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge outFlow__sourceRef__exclusiveGateway = null;
		EMoflonEdge exclusiveGateway__outgoing__outFlow = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;
		EMoflonEdge outFlowToAlternativeFlow__target__alternativeFlow = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge outFlowToAlt__target__alt = null;
		EMoflonEdge outFlowToAlternativeFlow__source__outFlow = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;

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
			_TmpObject = (isApplicableMatch.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlowToFlow"));

			// ensure correct type and really bound of object defaultFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			defaultFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("exclusiveGatewayToNormalStep"));

			// ensure correct type and really bound of object exclusiveGatewayToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			exclusiveGatewayToNormalStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
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
			JavaSDM.ensure(fujaba__Success);
			// create object outFlowToAlternativeFlow
			outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSeqFlowToAltFlowAlt();

			// assign attribute outFlow
			outFlow.setId((java.lang.String) csp.getValue("outFlow", "id"));
			// assign attribute outFlow
			outFlow.setName((java.lang.String) csp.getValue("outFlow", "name"));

			// create link
			outFlowToAlternativeFlow.setTarget(alternativeFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					outFlowToAlternativeFlow, outFlow, "source");

			// create link
			outFlowToAlt.setTarget(alt);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToAlt,
					outFlow, "source");

			// create link
			outFlow.setSourceRef(exclusiveGateway);

			// create link
			process.getFlowElements().add(outFlow); // add link

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
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "translatedElements");
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
			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object defaultFlowToFlow is really bound
			JavaSDM.ensure(defaultFlowToFlow != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
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

			// check isomorphic binding between objects defaultFlow and alt 
			JavaSDM.ensure(!defaultFlow.equals(alt));

			// check isomorphic binding between objects defaultFlowToFlow and alt 
			JavaSDM.ensure(!defaultFlowToFlow.equals(alt));

			// check isomorphic binding between objects exclusiveGateway and alt 
			JavaSDM.ensure(!exclusiveGateway.equals(alt));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and alt 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

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

			// check isomorphic binding between objects defaultFlow and alternativeFlow 
			JavaSDM.ensure(!defaultFlow.equals(alternativeFlow));

			// check isomorphic binding between objects defaultFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!defaultFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects exclusiveGateway and alternativeFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(alternativeFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and alternativeFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

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

			// check isomorphic binding between objects defaultFlowToFlow and defaultFlow 
			JavaSDM.ensure(!defaultFlowToFlow.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects flow and defaultFlow 
			JavaSDM.ensure(!flow.equals(defaultFlow));

			// check isomorphic binding between objects normalStep and defaultFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToAlt and defaultFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and defaultFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(defaultFlow));

			// check isomorphic binding between objects process and defaultFlow 
			JavaSDM.ensure(!process.equals(defaultFlow));

			// check isomorphic binding between objects processToUseCase and defaultFlow 
			JavaSDM.ensure(!processToUseCase.equals(defaultFlow));

			// check isomorphic binding between objects useCase and defaultFlow 
			JavaSDM.ensure(!useCase.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlowToFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlowToFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlowToFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(defaultFlowToFlow));

			// check isomorphic binding between objects flow and defaultFlowToFlow 
			JavaSDM.ensure(!flow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects normalStep and defaultFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlow and defaultFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and defaultFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(defaultFlowToFlow));

			// check isomorphic binding between objects outFlowToAlternativeFlow and defaultFlowToFlow 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(defaultFlowToFlow));

			// check isomorphic binding between objects process and defaultFlowToFlow 
			JavaSDM.ensure(!process.equals(defaultFlowToFlow));

			// check isomorphic binding between objects processToUseCase and defaultFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(defaultFlowToFlow));

			// check isomorphic binding between objects useCase and defaultFlowToFlow 
			JavaSDM.ensure(!useCase.equals(defaultFlowToFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToAlt and exclusiveGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToAlternativeFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToAlternativeFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToUseCase and exclusiveGateway 
			JavaSDM.ensure(!processToUseCase.equals(exclusiveGateway));

			// check isomorphic binding between objects useCase and exclusiveGateway 
			JavaSDM.ensure(!useCase.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToAlternativeFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToAlternativeFlow
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToUseCase and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToUseCase
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects useCase and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!useCase.equals(exclusiveGatewayToNormalStep));

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

			// create object outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("SeqFlowAfterEGToAltFlowRule");
			// assign attribute __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow.setName("flows");
			// assign attribute __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt.setName("stepAlternative");
			// assign attribute outFlowToAlternativeFlow__source__outFlow
			outFlowToAlternativeFlow__source__outFlow.setName("source");
			// assign attribute outFlowToAlternativeFlow__target__alternativeFlow
			outFlowToAlternativeFlow__target__alternativeFlow.setName("target");
			// assign attribute __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway.setName("sourceRef");
			// assign attribute exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow.setName("outgoing");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_alternativeFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlternativeFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_alternativeFlow, "translatedEdges");

			// create link
			__useCase_flows_alternativeFlow.setSrc(useCase);

			// create link
			__normalStep_stepAlternative_alt.setSrc(normalStep);

			// create link
			__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

			// create link
			__alt_ref_alternativeFlow.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			outFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(outFlowToAlternativeFlow);

			// create link
			__normalStep_stepAlternative_alt.setTrg(alt);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			__alt_ref_alternativeFlow.setSrc(alt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			outFlow__sourceRef__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__outgoing__outFlow.setSrc(exclusiveGateway);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			outFlowToAlternativeFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			// create link
			exclusiveGateway__outgoing__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__exclusiveGateway.setSrc(outFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow);
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
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __exclusiveGateway_outgoing_defaultFlow = null;
		EMoflonEdge __defaultFlowToFlow_source_defaultFlow = null;
		EMoflonEdge __process_flowElements_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __defaultFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __defaultFlowToFlow_target_flow = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_target_normalStep = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_source_exclusiveGateway = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		CSP csp = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterUseCaseToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterNormalStepToExclusiveGatewayToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterFlowToDefaultFlowToFlow = null;
		SequenceFlowToUCFlow defaultFlowToFlow = null;

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
			ruleresult.setRule("SeqFlowAfterEGToAltFlowRule");

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

			// iterate to-many link target from flow to defaultFlowToFlow
			fujaba__Success = false;

			fujaba__IterFlowToDefaultFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							SequenceFlowToUCFlow.class, "target")).iterator();

			while (fujaba__IterFlowToDefaultFlowToFlow.hasNext()) {
				try {
					defaultFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToDefaultFlowToFlow
							.next();

					// check object defaultFlowToFlow is really bound
					JavaSDM.ensure(defaultFlowToFlow != null);
					// bind object
					defaultFlow = defaultFlowToFlow.getSource();

					// check object defaultFlow is really bound
					JavaSDM.ensure(defaultFlow != null);

					// iterate to-many link target from normalStep to exclusiveGatewayToNormalStep
					fujaba__Success = false;

					fujaba__IterNormalStepToExclusiveGatewayToNormalStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											FlowNodeToStep.class, "target"))
							.iterator();

					while (fujaba__IterNormalStepToExclusiveGatewayToNormalStep
							.hasNext()) {
						try {
							exclusiveGatewayToNormalStep = (FlowNodeToStep) fujaba__IterNormalStepToExclusiveGatewayToNormalStep
									.next();

							// check object exclusiveGatewayToNormalStep is really bound
							JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
							// bind object
							_TmpObject = exclusiveGatewayToNormalStep
									.getSource();

							// ensure correct type and really bound of object exclusiveGateway
							JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
							exclusiveGateway = (ExclusiveGateway) _TmpObject;

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
										// check object defaultFlow is really bound
										JavaSDM.ensure(defaultFlow != null);
										// check object defaultFlowToFlow is really bound
										JavaSDM.ensure(defaultFlowToFlow != null);
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object exclusiveGatewayToNormalStep is really bound
										JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
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

										// check link default from exclusiveGateway to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link ref from alt to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(alt.getRef()));

										// check link flowElements from defaultFlow to process
										JavaSDM.ensure(process
												.equals(defaultFlow
														.eContainer()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flows from alternativeFlow to useCase
										JavaSDM.ensure(useCase
												.equals(alternativeFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link source from defaultFlowToFlow to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(defaultFlowToFlow
														.getSource()));

										// check link source from exclusiveGatewayToNormalStep to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(exclusiveGatewayToNormalStep
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link sourceRef from defaultFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(defaultFlow
														.getSourceRef()));

										// check link stepAlternative from alt to normalStep
										JavaSDM.ensure(normalStep.equals(alt
												.eContainer()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from defaultFlowToFlow to flow
										JavaSDM.ensure(flow
												.equals(defaultFlowToFlow
														.getTarget()));

										// check link target from exclusiveGatewayToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(exclusiveGatewayToNormalStep
														.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_alternativeFlow
										__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_outgoing_defaultFlow
										__exclusiveGateway_outgoing_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlowToFlow_source_defaultFlow
										__defaultFlowToFlow_source_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_defaultFlow
										__process_flowElements_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_default_defaultFlow
										__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlow_sourceRef_exclusiveGateway
										__defaultFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __defaultFlowToFlow_target_flow
										__defaultFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGatewayToNormalStep_target_normalStep
										__exclusiveGatewayToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGatewayToNormalStep_source_exclusiveGateway
										__exclusiveGatewayToNormalStep_source_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __alt_ref_alternativeFlow
										__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

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
										// assign attribute __defaultFlowToFlow_source_defaultFlow
										__defaultFlowToFlow_source_defaultFlow
												.setName("source");
										// assign attribute __defaultFlowToFlow_target_flow
										__defaultFlowToFlow_target_flow
												.setName("target");
										// assign attribute __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt
												.setName("stepAlternative");
										// assign attribute __exclusiveGatewayToNormalStep_source_exclusiveGateway
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setName("source");
										// assign attribute __exclusiveGatewayToNormalStep_target_normalStep
										__exclusiveGatewayToNormalStep_target_normalStep
												.setName("target");
										// assign attribute __alt_ref_alternativeFlow
										__alt_ref_alternativeFlow
												.setName("ref");
										// assign attribute __exclusiveGateway_default_defaultFlow
										__exclusiveGateway_default_defaultFlow
												.setName("default");
										// assign attribute __defaultFlow_sourceRef_exclusiveGateway
										__defaultFlow_sourceRef_exclusiveGateway
												.setName("sourceRef");
										// assign attribute __exclusiveGateway_outgoing_defaultFlow
										__exclusiveGateway_outgoing_defaultFlow
												.setName("outgoing");
										// assign attribute __process_flowElements_defaultFlow
										__process_flowElements_defaultFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway
												.setName("flowElements");

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										__useCase_flows_alternativeFlow
												.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														defaultFlow);

										// create link
										__exclusiveGateway_outgoing_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__defaultFlowToFlow_source_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__process_flowElements_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__exclusiveGateway_default_defaultFlow
												.setTrg(defaultFlow);

										// create link
										__defaultFlow_sourceRef_exclusiveGateway
												.setSrc(defaultFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__defaultFlowToFlow_target_flow
												.setTrg(flow);

										// create link
										__defaultFlowToFlow_source_defaultFlow
												.setSrc(defaultFlowToFlow);

										// create link
										__defaultFlowToFlow_target_flow
												.setSrc(defaultFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														defaultFlowToFlow);

										// create link
										__exclusiveGatewayToNormalStep_target_normalStep
												.setTrg(normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										__normalStep_stepAlternative_alt
												.setSrc(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setSrc(exclusiveGatewayToNormalStep);

										// create link
										__exclusiveGatewayToNormalStep_target_normalStep
												.setSrc(exclusiveGatewayToNormalStep);

										// create link
										isApplicableMatch
												.getAllContextElements()
												.add(exclusiveGatewayToNormalStep);

										// create link
										__alt_ref_alternativeFlow
												.setTrg(alternativeFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alternativeFlow);

										// create link
										__useCase_flows_alternativeFlow
												.setTrg(alternativeFlow);

										// create link
										__alt_ref_alternativeFlow.setSrc(alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alt);

										// create link
										__normalStep_stepAlternative_alt
												.setTrg(alt);

										// create link
										__exclusiveGateway_default_defaultFlow
												.setSrc(exclusiveGateway);

										// create link
										__exclusiveGateway_outgoing_defaultFlow
												.setSrc(exclusiveGateway);

										// create link
										__process_flowElements_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														exclusiveGateway);

										// create link
										__exclusiveGatewayToNormalStep_source_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__defaultFlow_sourceRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__process_flowElements_exclusiveGateway
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_defaultFlow
												.setSrc(process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

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
														__alt_ref_alternativeFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_exclusiveGateway,
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
														__process_flowElements_defaultFlow,
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
														__exclusiveGateway_default_defaultFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__defaultFlowToFlow_target_flow,
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
														__defaultFlow_sourceRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGatewayToNormalStep_source_exclusiveGateway,
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
														__exclusiveGatewayToNormalStep_target_normalStep,
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
														__exclusiveGateway_outgoing_defaultFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__defaultFlowToFlow_source_defaultFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															useCase,
															processToUseCase,
															defaultFlow,
															flow,
															defaultFlowToFlow,
															normalStep,
															exclusiveGatewayToNormalStep,
															alternativeFlow,
															alt,
															exclusiveGateway,
															process));

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
														.setRuleName("SeqFlowAfterEGToAltFlowRule");
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
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("normalStep", normalStep);
		match.registerObject("alternativeFlow", alternativeFlow);
		match.registerObject("alt", alt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
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
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", true, csp);
		var_alternativeFlow_name.setValue(alternativeFlow.getName());
		var_alternativeFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_outFlow_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.id", csp);
		var_outFlow_id.setType("");
		Variable var_outFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.name", csp);
		var_outFlow_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_outFlow_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_outFlow_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("alternativeFlow", alternativeFlow);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("process", process);
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
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("alternativeFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow())
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_21(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_40136 = null;
		NormalStep __DEC_alt_stepAlternative_442571 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_427914 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_427914 = null;
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
											__DEC_alternativeFlow_flows_40136 = alternativeFlow
													.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
													.eContainer() : null;

											// check object __DEC_alternativeFlow_flows_40136 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_flows_40136 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alternativeFlow_flows_40136
													.getFlows().contains(
															alternativeFlow));

											// check isomorphic binding between objects __DEC_alternativeFlow_flows_40136 and useCase 
											JavaSDM.ensure(!__DEC_alternativeFlow_flows_40136
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
											__DEC_alt_stepAlternative_442571 = alt
													.eContainer() instanceof NormalStep ? (NormalStep) alt
													.eContainer() : null;

											// check object __DEC_alt_stepAlternative_442571 is really bound
											JavaSDM.ensure(__DEC_alt_stepAlternative_442571 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alt_stepAlternative_442571
													.getStepAlternative()
													.contains(alt));

											// check isomorphic binding between objects __DEC_alt_stepAlternative_442571 and normalStep 
											JavaSDM.ensure(!__DEC_alt_stepAlternative_442571
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

											// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_427914
											fujaba__Success = false;

											fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_427914 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	alternativeFlow,
																	AlternativeFlowAlternative.class,
																	"ref"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_427914
															.hasNext()) {
												try {
													__DEC_alternativeFlow_ref_427914 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_427914
															.next();

													// check object __DEC_alternativeFlow_ref_427914 is really bound
													JavaSDM.ensure(__DEC_alternativeFlow_ref_427914 != null);
													// check isomorphic binding between objects __DEC_alternativeFlow_ref_427914 and alt 
													JavaSDM.ensure(!__DEC_alternativeFlow_ref_427914
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
														normalStep,
														alternativeFlow, alt);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_656650 = null;
		NormalStep __DEC_alt_stepAlternative_94222 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_181397 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_181397 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToAlternativeFlow = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;
		UseCase useCase = null;
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

			// check object _edge_stepAlternative is really bound
			JavaSDM.ensure(_edge_stepAlternative != null);
			// bind object
			_TmpObject = _edge_stepAlternative.getSrc();

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

			// check link stepAlternative from alt to normalStep
			JavaSDM.ensure(normalStep.equals(alt.eContainer()));

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
							__DEC_alternativeFlow_flows_656650 = alternativeFlow
									.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
									.eContainer() : null;

							// check object __DEC_alternativeFlow_flows_656650 is really bound
							JavaSDM.ensure(__DEC_alternativeFlow_flows_656650 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alternativeFlow_flows_656650
									.getFlows().contains(alternativeFlow));

							// check isomorphic binding between objects __DEC_alternativeFlow_flows_656650 and useCase 
							JavaSDM.ensure(!__DEC_alternativeFlow_flows_656650
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
							__DEC_alt_stepAlternative_94222 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_94222 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_94222 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_94222
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_94222 and normalStep 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_94222
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

							// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_181397
							fujaba__Success = false;

							fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_181397 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													alternativeFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_181397
											.hasNext()) {
								try {
									__DEC_alternativeFlow_ref_181397 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_181397
											.next();

									// check object __DEC_alternativeFlow_ref_181397 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_ref_181397 != null);
									// check isomorphic binding between objects __DEC_alternativeFlow_ref_181397 and alt 
									JavaSDM.ensure(!__DEC_alternativeFlow_ref_181397
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
										normalStep, alternativeFlow, alt);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_23(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_153638 = null;
		NormalStep __DEC_alt_stepAlternative_741875 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_521829 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_521829 = null;
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
									__DEC_alternativeFlow_flows_153638 = alternativeFlow
											.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
											.eContainer() : null;

									// check object __DEC_alternativeFlow_flows_153638 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_flows_153638 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alternativeFlow_flows_153638
											.getFlows().contains(
													alternativeFlow));

									// check isomorphic binding between objects __DEC_alternativeFlow_flows_153638 and useCase 
									JavaSDM.ensure(!__DEC_alternativeFlow_flows_153638
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
									__DEC_alt_stepAlternative_741875 = alt
											.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object __DEC_alt_stepAlternative_741875 is really bound
									JavaSDM.ensure(__DEC_alt_stepAlternative_741875 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alt_stepAlternative_741875
											.getStepAlternative().contains(alt));

									// check isomorphic binding between objects __DEC_alt_stepAlternative_741875 and normalStep 
									JavaSDM.ensure(!__DEC_alt_stepAlternative_741875
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

									// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_521829
									fujaba__Success = false;

									fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_521829 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															alternativeFlow,
															AlternativeFlowAlternative.class,
															"ref")).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_521829
													.hasNext()) {
										try {
											__DEC_alternativeFlow_ref_521829 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_521829
													.next();

											// check object __DEC_alternativeFlow_ref_521829 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_ref_521829 != null);
											// check isomorphic binding between objects __DEC_alternativeFlow_ref_521829 and alt 
											JavaSDM.ensure(!__DEC_alternativeFlow_ref_521829
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
										useCase, flow, normalStep,
										alternativeFlow, alt);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_61(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_790649 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_105514 = null;
		ExclusiveGateway __DEC_outFlow_default_105514 = null;
		Match match = null;
		bpmn2.Process process = null;
		SequenceFlow defaultFlow = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			defaultFlow = exclusiveGateway.getDefault();

			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from defaultFlow to process
			JavaSDM.ensure(process.equals(defaultFlow.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from defaultFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(defaultFlow.getSourceRef()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_outFlow_flowElements_790649 = outFlow.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
							.eContainer() : null;

					// check object __DEC_outFlow_flowElements_790649 is really bound
					JavaSDM.ensure(__DEC_outFlow_flowElements_790649 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_outFlow_flowElements_790649
							.getFlowElements().contains(outFlow));

					// check isomorphic binding between objects __DEC_outFlow_flowElements_790649 and process 
					JavaSDM.ensure(!__DEC_outFlow_flowElements_790649
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

					// iterate to-many link default from outFlow to __DEC_outFlow_default_105514
					fujaba__Success = false;

					fujaba__IterOutFlowTo__DEC_outFlow_default_105514 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(outFlow,
											ExclusiveGateway.class, "default"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterOutFlowTo__DEC_outFlow_default_105514
									.hasNext()) {
						try {
							__DEC_outFlow_default_105514 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_105514
									.next();

							// check object __DEC_outFlow_default_105514 is really bound
							JavaSDM.ensure(__DEC_outFlow_default_105514 != null);
							// check isomorphic binding between objects __DEC_outFlow_default_105514 and exclusiveGateway 
							JavaSDM.ensure(!__DEC_outFlow_default_105514
									.equals(exclusiveGateway));

							fujaba__Success = true;
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
				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// check link default from exclusiveGateway to defaultFlow
				JavaSDM.ensure(defaultFlow.equals(exclusiveGateway.getDefault()));

				// check link default from exclusiveGateway to outFlow
				JavaSDM.ensure(!(outFlow.equals(exclusiveGateway.getDefault())));

				// check link flowElements from defaultFlow to process
				JavaSDM.ensure(process.equals(defaultFlow.eContainer()));

				// check link flowElements from exclusiveGateway to process
				JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

				// check link flowElements from outFlow to process
				JavaSDM.ensure(process.equals(outFlow.eContainer()));

				// check link sourceRef from defaultFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(defaultFlow
						.getSourceRef()));

				// check link sourceRef from outFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

				// check link src from _edge_sourceRef to outFlow
				JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

				// check link trg from _edge_sourceRef to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(_edge_sourceRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, defaultFlow,
						exclusiveGateway, process, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_62(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_22648 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_832625 = null;
		ExclusiveGateway __DEC_outFlow_default_832625 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		bpmn2.Process process = null;
		SequenceFlow defaultFlow = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			defaultFlow = exclusiveGateway.getDefault();

			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from defaultFlow to process
			JavaSDM.ensure(process.equals(defaultFlow.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from defaultFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(defaultFlow.getSourceRef()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link trg from exclusiveGateway to _edge_sourceRef
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayTo_edge_sourceRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exclusiveGateway, EMoflonEdge.class, "trg"))
					.iterator();

			while (fujaba__IterExclusiveGatewayTo_edge_sourceRef.hasNext()) {
				try {
					_edge_sourceRef = (EMoflonEdge) fujaba__IterExclusiveGatewayTo_edge_sourceRef
							.next();

					// check object _edge_sourceRef is really bound
					JavaSDM.ensure(_edge_sourceRef != null);
					// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
					JavaSDM.ensure(!_edge_sourceRef.equals(_edge_outgoing));

					// check link src from _edge_sourceRef to outFlow
					JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_22648 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_22648 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_22648 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_22648
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_22648 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_22648
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

							// iterate to-many link default from outFlow to __DEC_outFlow_default_832625
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_832625 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_832625
											.hasNext()) {
								try {
									__DEC_outFlow_default_832625 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_832625
											.next();

									// check object __DEC_outFlow_default_832625 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_832625 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_832625 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_832625
											.equals(exclusiveGateway));

									fujaba__Success = true;
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
						// check object defaultFlow is really bound
						JavaSDM.ensure(defaultFlow != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
						JavaSDM.ensure(!_edge_sourceRef.equals(_edge_outgoing));

						// check isomorphic binding between objects outFlow and defaultFlow 
						JavaSDM.ensure(!outFlow.equals(defaultFlow));

						// check link default from exclusiveGateway to defaultFlow
						JavaSDM.ensure(defaultFlow.equals(exclusiveGateway
								.getDefault()));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(!(outFlow.equals(exclusiveGateway
								.getDefault())));

						// check link flowElements from defaultFlow to process
						JavaSDM.ensure(process.equals(defaultFlow.eContainer()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from defaultFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(defaultFlow
								.getSourceRef()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_outgoing to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_outgoing
								.getSrc()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link trg from _edge_outgoing to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_outgoing.getTrg()));

						// check link trg from _edge_sourceRef to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this
								.isAppropriate_FWD(match, defaultFlow,
										exclusiveGateway, process, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_63(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_375195 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_707913 = null;
		ExclusiveGateway __DEC_outFlow_default_707913 = null;
		Match match = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		SequenceFlow outFlow = null;
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

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// iterate to-many link flowElements from process to defaultFlow
			fujaba__Success = false;

			fujaba__IterProcessToDefaultFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDefaultFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDefaultFlow.next();

					// ensure correct type and really bound of object defaultFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					defaultFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and defaultFlow 
					JavaSDM.ensure(!outFlow.equals(defaultFlow));

					// bind object
					_TmpObject = defaultFlow.getSourceRef();

					// ensure correct type and really bound of object exclusiveGateway
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					exclusiveGateway = (ExclusiveGateway) _TmpObject;

					// check link default from exclusiveGateway to defaultFlow
					JavaSDM.ensure(defaultFlow.equals(exclusiveGateway
							.getDefault()));

					// check link flowElements from exclusiveGateway to process
					JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_375195 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_375195 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_375195 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_375195
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_375195 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_375195
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

							// iterate to-many link default from outFlow to __DEC_outFlow_default_707913
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_707913 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_707913
											.hasNext()) {
								try {
									__DEC_outFlow_default_707913 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_707913
											.next();

									// check object __DEC_outFlow_default_707913 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_707913 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_707913 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_707913
											.equals(exclusiveGateway));

									fujaba__Success = true;
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
						// check object defaultFlow is really bound
						JavaSDM.ensure(defaultFlow != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and defaultFlow 
						JavaSDM.ensure(!outFlow.equals(defaultFlow));

						// check link default from exclusiveGateway to defaultFlow
						JavaSDM.ensure(defaultFlow.equals(exclusiveGateway
								.getDefault()));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(!(outFlow.equals(exclusiveGateway
								.getDefault())));

						// check link flowElements from defaultFlow to process
						JavaSDM.ensure(process.equals(defaultFlow.eContainer()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from defaultFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(defaultFlow
								.getSourceRef()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link trg from _edge_flowElements to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this
								.isAppropriate_FWD(match, defaultFlow,
										exclusiveGateway, process, outFlow);
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
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(ProcessToUseCase) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(ExclusiveGateway) arguments.get(8),
					(bpmn2.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE_EXCLUSIVEGATEWAY_PROCESS:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(ProcessToUseCase) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(AlternativeFlow) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(ExclusiveGateway) arguments.get(10),
					(bpmn2.Process) arguments.get(11));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_61__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_61((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_62((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_63__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_63((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SeqFlowAfterEGToAltFlowRuleImpl
