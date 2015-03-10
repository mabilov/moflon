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

import BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule;
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
 * An implementation of the model object '<em><b>Exclusive Gateway To Step Core Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExclusiveGatewayToStepCoreRuleImpl extends AbstractRuleImpl
		implements ExclusiveGatewayToStepCoreRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayToStepCoreRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExclusiveGatewayToStepCoreRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exclusiveGateway = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_laneSets_laneSet = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
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
					inFlow, exclusiveGateway, outFlow, lane, laneSet));

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

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_exclusiveGateway
				__lane_flowNodeRefs_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway.setName("targetRef");
				// assign attribute __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow.setName("default");
				// assign attribute __lane_flowNodeRefs_exclusiveGateway
				__lane_flowNodeRefs_exclusiveGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_outFlow,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

				// create link
				__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

				// create link
				__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_default_outFlow.setSrc(exclusiveGateway);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__lane_flowNodeRefs_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__exclusiveGateway_default_outFlow.setTrg(outFlow);

				// create link
				__lane_flowNodeRefs_exclusiveGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
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

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					exclusiveGateway, outFlow, lane, laneSet);
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
		ExclusiveGateway exclusiveGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep normalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge exclusiveGatewayToNormalStep__source__exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge exclusiveGatewayToNormalStep__target__normalStep = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge __lane_flowNodeRefs_exclusiveGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
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
			JavaSDM.ensure(fujaba__Success);
			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object exclusiveGatewayToNormalStep
			exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getValue("normalStep",
					"name"));
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getValue("normalStep",
					"label"));

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					outFlow, "source");

			// create link
			exclusiveGatewayToNormalStep.setSource(exclusiveGateway);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(normalStep,
					actor, "actor");

			// create link
			flow.getSteps().add(normalStep);

			// create link
			exclusiveGatewayToNormalStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
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
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway, "translatedElements");

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
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects exclusiveGateway and actor 
			JavaSDM.ensure(!exclusiveGateway.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and actor 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects lane and exclusiveGateway 
			JavaSDM.ensure(!lane.equals(exclusiveGateway));

			// check isomorphic binding between objects laneSet and exclusiveGateway 
			JavaSDM.ensure(!laneSet.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToActor and exclusiveGateway 
			JavaSDM.ensure(!processToActor.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects lane and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!lane.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects laneSet and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!laneSet.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToActor and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToActor.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToFlow and lane 
			JavaSDM.ensure(!outFlowToFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToFlow and laneSet 
			JavaSDM.ensure(!outFlowToFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_default_outFlow
			__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_exclusiveGateway
			__lane_flowNodeRefs_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveGatewayToStepCoreRule");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway.setName("targetRef");
			// assign attribute __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
			// assign attribute __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute __exclusiveGateway_default_outFlow
			__exclusiveGateway_default_outFlow.setName("default");
			// assign attribute exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setName("source");
			// assign attribute exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");
			// assign attribute __lane_flowNodeRefs_exclusiveGateway
			__lane_flowNodeRefs_exclusiveGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_default_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__source__exclusiveGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_exclusiveGateway, "translatedEdges");

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			__process_flowElements_exclusiveGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

			// create link
			__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setTrg(exclusiveGateway);

			// create link
			__process_flowElements_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__lane_flowNodeRefs_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

			// create link
			__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

			// create link
			__exclusiveGateway_default_outFlow.setSrc(exclusiveGateway);

			// create link
			__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_default_outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

			// create link
			__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			__lane_flowNodeRefs_exclusiveGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, normalStep, outFlowToFlow,
				inFlowToFlow, process, inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);
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
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
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
			ruleresult.setRule("ExclusiveGatewayToStepCoreRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (match.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
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

					// iterate to-many link source from process to processToActor
					fujaba__Success = false;

					fujaba__IterProcessToProcessToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(process,
											ProcessToActor.class, "source"))
							.iterator();

					while (fujaba__IterProcessToProcessToActor.hasNext()) {
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
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToActor is really bound
								JavaSDM.ensure(processToActor != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(outFlow.equals(exclusiveGateway
										.getDefault()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from processToActor to process
								JavaSDM.ensure(process.equals(processToActor
										.getSource()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from processToActor to actor
								JavaSDM.ensure(actor.equals(processToActor
										.getTarget()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link flowNodeRefs from lane to exclusiveGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										exclusiveGateway));

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_outFlow
								__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_exclusiveGateway
								__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToActor_source_process
								__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_inFlow
								__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_laneSets_laneSet
								__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_targetRef_exclusiveGateway
								__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __exclusiveGateway_incoming_inFlow
								__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __outFlow_sourceRef_exclusiveGateway
								__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __exclusiveGateway_outgoing_outFlow
								__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __lane_flowNodeRefs_exclusiveGateway
								__lane_flowNodeRefs_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __exclusiveGateway_default_outFlow
								__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToActor_target_actor
								__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __laneSet_lanes_lane
								__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow.setName("source");
								// assign attribute __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow.setName("target");
								// assign attribute __process_laneSets_laneSet
								__process_laneSets_laneSet.setName("laneSets");
								// assign attribute __process_flowElements_inFlow
								__process_flowElements_inFlow
										.setName("flowElements");
								// assign attribute __process_flowElements_exclusiveGateway
								__process_flowElements_exclusiveGateway
										.setName("flowElements");
								// assign attribute __process_flowElements_outFlow
								__process_flowElements_outFlow
										.setName("flowElements");
								// assign attribute __inFlow_targetRef_exclusiveGateway
								__inFlow_targetRef_exclusiveGateway
										.setName("targetRef");
								// assign attribute __exclusiveGateway_incoming_inFlow
								__exclusiveGateway_incoming_inFlow
										.setName("incoming");
								// assign attribute __outFlow_sourceRef_exclusiveGateway
								__outFlow_sourceRef_exclusiveGateway
										.setName("sourceRef");
								// assign attribute __exclusiveGateway_outgoing_outFlow
								__exclusiveGateway_outgoing_outFlow
										.setName("outgoing");
								// assign attribute __exclusiveGateway_default_outFlow
								__exclusiveGateway_default_outFlow
										.setName("default");
								// assign attribute __processToActor_source_process
								__processToActor_source_process
										.setName("source");
								// assign attribute __processToActor_target_actor
								__processToActor_target_actor.setName("target");
								// assign attribute __lane_flowNodeRefs_exclusiveGateway
								__lane_flowNodeRefs_exclusiveGateway
										.setName("flowNodeRefs");
								// assign attribute __laneSet_lanes_lane
								__laneSet_lanes_lane.setName("lanes");

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlowToFlow);

								// create link
								__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

								// create link
								__inFlowToFlow_source_inFlow
										.setSrc(inFlowToFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										process);

								// create link
								__process_flowElements_outFlow.setSrc(process);

								// create link
								__process_flowElements_exclusiveGateway
										.setSrc(process);

								// create link
								__processToActor_source_process.setTrg(process);

								// create link
								__process_flowElements_inFlow.setSrc(process);

								// create link
								__process_laneSets_laneSet.setSrc(process);

								// create link
								__process_flowElements_inFlow.setTrg(inFlow);

								// create link
								__inFlow_targetRef_exclusiveGateway
										.setSrc(inFlow);

								// create link
								__inFlowToFlow_source_inFlow.setTrg(inFlow);

								// create link
								__exclusiveGateway_incoming_inFlow
										.setTrg(inFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										exclusiveGateway);

								// create link
								__outFlow_sourceRef_exclusiveGateway
										.setTrg(exclusiveGateway);

								// create link
								__exclusiveGateway_outgoing_outFlow
										.setSrc(exclusiveGateway);

								// create link
								__process_flowElements_exclusiveGateway
										.setTrg(exclusiveGateway);

								// create link
								__lane_flowNodeRefs_exclusiveGateway
										.setTrg(exclusiveGateway);

								// create link
								__exclusiveGateway_incoming_inFlow
										.setSrc(exclusiveGateway);

								// create link
								__exclusiveGateway_default_outFlow
										.setSrc(exclusiveGateway);

								// create link
								__inFlow_targetRef_exclusiveGateway
										.setTrg(exclusiveGateway);

								// create link
								isApplicableMatch.getAllContextElements().add(
										outFlow);

								// create link
								__outFlow_sourceRef_exclusiveGateway
										.setSrc(outFlow);

								// create link
								__exclusiveGateway_outgoing_outFlow
										.setTrg(outFlow);

								// create link
								__exclusiveGateway_default_outFlow
										.setTrg(outFlow);

								// create link
								__process_flowElements_outFlow.setTrg(outFlow);

								// create link
								__inFlowToFlow_target_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__processToActor_target_actor.setTrg(actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								__processToActor_target_actor
										.setSrc(processToActor);

								// create link
								__processToActor_source_process
										.setSrc(processToActor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										processToActor);

								// create link
								__laneSet_lanes_lane.setTrg(lane);

								// create link
								isApplicableMatch.getAllContextElements().add(
										lane);

								// create link
								__lane_flowNodeRefs_exclusiveGateway
										.setSrc(lane);

								// create link
								__laneSet_lanes_lane.setSrc(laneSet);

								// create link
								__process_laneSets_laneSet.setTrg(laneSet);

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneSet);

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
												__exclusiveGateway_default_outFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__exclusiveGateway_incoming_inFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__laneSet_lanes_lane,
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
												__inFlow_targetRef_exclusiveGateway,
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
												__outFlow_sourceRef_exclusiveGateway,
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
												__process_laneSets_laneSet,
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
												__lane_flowNodeRefs_exclusiveGateway,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch,
													inFlowToFlow, process,
													inFlow, exclusiveGateway,
													outFlow, flow, actor,
													processToActor, lane,
													laneSet));

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
												.setRuleName("ExclusiveGatewayToStepCoreRule");
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
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
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
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", true, csp);
		var_exclusiveGateway_id.setValue(exclusiveGateway.getId());
		var_exclusiveGateway_id.setType("");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", true, csp);
		var_exclusiveGateway_name.setValue(exclusiveGateway.getName());
		var_exclusiveGateway_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("exclusiveGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getExclusiveGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
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

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, normalStep,
					flow, actor));

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
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				// create link
				__normalStep_actor_actor.setTrg(actor);

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
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, normalStep, flow, actor);
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
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge exclusiveGatewayToNormalStep__target__normalStep = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge lane__flowNodeRefs__exclusiveGateway = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge exclusiveGatewayToNormalStep__source__exclusiveGateway = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge exclusiveGateway__default__outFlow = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge exclusiveGateway__outgoing__outFlow = null;
		EMoflonEdge exclusiveGateway__incoming__inFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge process__flowElements__exclusiveGateway = null;
		EMoflonEdge outFlow__sourceRef__exclusiveGateway = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge inFlow__targetRef__exclusiveGateway = null;

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
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
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
			JavaSDM.ensure(fujaba__Success);
			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object exclusiveGatewayToNormalStep
			exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object exclusiveGateway
			exclusiveGateway = Bpmn2Factory.eINSTANCE.createExclusiveGateway();

			// assign attribute exclusiveGateway
			exclusiveGateway.setId((java.lang.String) csp.getValue(
					"exclusiveGateway", "id"));
			// assign attribute exclusiveGateway
			exclusiveGateway.setName((java.lang.String) csp.getValue(
					"exclusiveGateway", "name"));
			// assign attribute exclusiveGateway
			exclusiveGateway.setGatewayDirection((bpmn2.GatewayDirection) csp
					.getValue("exclusiveGateway", "gatewayDirection"));

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			exclusiveGatewayToNormalStep.setTarget(normalStep);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					outFlow, "source");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			process.getFlowElements().add(exclusiveGateway); // add link

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			exclusiveGateway.getIncoming().add(inFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					exclusiveGateway, outFlow, "default");

			// create link
			exclusiveGatewayToNormalStep.setSource(exclusiveGateway);

			// create link
			lane.getFlowNodeRefs().add(exclusiveGateway);

			// create link
			outFlow.setSourceRef(exclusiveGateway);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
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
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects exclusiveGateway and actor 
			JavaSDM.ensure(!exclusiveGateway.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and actor 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects lane and exclusiveGateway 
			JavaSDM.ensure(!lane.equals(exclusiveGateway));

			// check isomorphic binding between objects laneSet and exclusiveGateway 
			JavaSDM.ensure(!laneSet.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToActor and exclusiveGateway 
			JavaSDM.ensure(!processToActor.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects lane and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!lane.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects laneSet and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!laneSet.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToActor and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToActor.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToFlow and lane 
			JavaSDM.ensure(!outFlowToFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToFlow and laneSet 
			JavaSDM.ensure(!outFlowToFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object lane__flowNodeRefs__exclusiveGateway
			lane__flowNodeRefs__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__default__outFlow
			exclusiveGateway__default__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__incoming__inFlow
			exclusiveGateway__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__exclusiveGateway
			process__flowElements__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__exclusiveGateway
			inFlow__targetRef__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveGatewayToStepCoreRule");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute process__flowElements__exclusiveGateway
			process__flowElements__exclusiveGateway.setName("flowElements");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute inFlow__targetRef__exclusiveGateway
			inFlow__targetRef__exclusiveGateway.setName("targetRef");
			// assign attribute exclusiveGateway__incoming__inFlow
			exclusiveGateway__incoming__inFlow.setName("incoming");
			// assign attribute outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway.setName("sourceRef");
			// assign attribute exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow.setName("outgoing");
			// assign attribute exclusiveGateway__default__outFlow
			exclusiveGateway__default__outFlow.setName("default");
			// assign attribute exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setName("source");
			// assign attribute exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");
			// assign attribute lane__flowNodeRefs__exclusiveGateway
			lane__flowNodeRefs__exclusiveGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane__flowNodeRefs__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__source__exclusiveGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__default__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__exclusiveGateway, "createdEdges");

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			process__flowElements__exclusiveGateway.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			exclusiveGateway__incoming__inFlow.setTrg(inFlow);

			// create link
			inFlow__targetRef__exclusiveGateway.setSrc(inFlow);

			// create link
			exclusiveGateway__outgoing__outFlow.setSrc(exclusiveGateway);

			// create link
			inFlow__targetRef__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			lane__flowNodeRefs__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			outFlow__sourceRef__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__default__outFlow.setSrc(exclusiveGateway);

			// create link
			process__flowElements__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__incoming__inFlow.setSrc(exclusiveGateway);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__outgoing__outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			exclusiveGateway__default__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__exclusiveGateway.setSrc(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			lane__flowNodeRefs__exclusiveGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, normalStep, outFlowToFlow,
				inFlowToFlow, process, inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);
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
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
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
			ruleresult.setRule("ExclusiveGatewayToStepCoreRule");

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
			// check object match is really bound
			JavaSDM.ensure(match != null);
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

					// iterate to-many link target from actor to processToActor
					fujaba__Success = false;

					fujaba__IterActorToProcessToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(actor,
											ProcessToActor.class, "target"))
							.iterator();

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
								// check object normalStep is really bound
								JavaSDM.ensure(normalStep != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToActor is really bound
								JavaSDM.ensure(processToActor != null);
								// check link actor from normalStep to actor
								JavaSDM.ensure(actor.equals(normalStep
										.getActor()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from processToActor to process
								JavaSDM.ensure(process.equals(processToActor
										.getSource()));

								// check link steps from normalStep to flow
								JavaSDM.ensure(flow.equals(normalStep
										.eContainer()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from processToActor to actor
								JavaSDM.ensure(actor.equals(processToActor
										.getTarget()));

								// iterate to-many link laneSets from process to laneSet
								fujaba__Success = false;

								fujaba__IterProcessToLaneSet = new ArrayList(
										process.getLaneSets()).iterator();

								while (fujaba__IterProcessToLaneSet.hasNext()) {
									try {
										laneSet = (LaneSet) fujaba__IterProcessToLaneSet
												.next();

										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// iterate to-many link lanes from laneSet to lane
										fujaba__Success = false;

										fujaba__IterLaneSetToLane = new ArrayList(
												laneSet.getLanes()).iterator();

										while (fujaba__IterLaneSetToLane
												.hasNext()) {
											try {
												lane = (Lane) fujaba__IterLaneSetToLane
														.next();

												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __normalStep_actor_actor
												__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flow_steps_normalStep
												__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_laneSets_laneSet
												__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __processToActor_source_process
												__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_inFlow
												__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __processToActor_target_actor
												__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __laneSet_lanes_lane
												__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __normalStep_actor_actor
												__normalStep_actor_actor
														.setName("actor");
												// assign attribute __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow
														.setName("source");
												// assign attribute __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow
														.setName("target");
												// assign attribute __process_laneSets_laneSet
												__process_laneSets_laneSet
														.setName("laneSets");
												// assign attribute __process_flowElements_inFlow
												__process_flowElements_inFlow
														.setName("flowElements");
												// assign attribute __flow_steps_normalStep
												__flow_steps_normalStep
														.setName("steps");
												// assign attribute __processToActor_source_process
												__processToActor_source_process
														.setName("source");
												// assign attribute __processToActor_target_actor
												__processToActor_target_actor
														.setName("target");
												// assign attribute __laneSet_lanes_lane
												__laneSet_lanes_lane
														.setName("lanes");

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(normalStep);

												// create link
												__normalStep_actor_actor
														.setSrc(normalStep);

												// create link
												__flow_steps_normalStep
														.setTrg(normalStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlowToFlow);

												// create link
												__inFlowToFlow_target_flow
														.setSrc(inFlowToFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setSrc(inFlowToFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(process);

												// create link
												__process_laneSets_laneSet
														.setSrc(process);

												// create link
												__processToActor_source_process
														.setTrg(process);

												// create link
												__process_flowElements_inFlow
														.setSrc(process);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setTrg(inFlow);

												// create link
												__process_flowElements_inFlow
														.setTrg(inFlow);

												// create link
												__flow_steps_normalStep
														.setSrc(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__inFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												__processToActor_target_actor
														.setTrg(actor);

												// create link
												__normalStep_actor_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

												// create link
												__processToActor_target_actor
														.setSrc(processToActor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(processToActor);

												// create link
												__processToActor_source_process
														.setSrc(processToActor);

												// create link
												__laneSet_lanes_lane
														.setTrg(lane);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(lane);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(laneSet);

												// create link
												__process_laneSets_laneSet
														.setTrg(laneSet);

												// create link
												__laneSet_lanes_lane
														.setSrc(laneSet);

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
																__laneSet_lanes_lane,
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
																__process_flowElements_inFlow,
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
																__flow_steps_normalStep,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__process_laneSets_laneSet,
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
																	normalStep,
																	inFlowToFlow,
																	process,
																	inFlow,
																	flow,
																	actor,
																	processToActor,
																	lane,
																	laneSet));

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
																.setRuleName("ExclusiveGatewayToStepCoreRule");
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
	public void registerObjectsToMatch_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
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
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		var_exclusiveGateway_id.setType("");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		var_exclusiveGateway_name.setType("");
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);
		var_exclusiveGateway_gatewayDirection.setType("EObject");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_14(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_428262 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_970001 = null;
		Step __DEC_normalStep_next_970001 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_428262 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_428262 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_428262 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_428262.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_428262 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_428262.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_970001
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_970001 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_970001
									.hasNext()) {
						try {
							__DEC_normalStep_next_970001 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_970001
									.next();

							// check object __DEC_normalStep_next_970001 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_970001 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_970001 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_970001
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
				fujaba__Success = this.isAppropriate_BWD(match, normalStep,
						flow, actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_31(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_682218 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_459563 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_441128 = null;
		ExclusiveGateway __DEC_outFlow_default_441128 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_942817 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_942817 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

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

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link flowNodeRefs from exclusiveGateway to lane
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayToLane = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exclusiveGateway,
											Lane.class, "flowNodeRefs"))
							.iterator();

					while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterExclusiveGatewayToLane
									.next();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);
							// iterate to-many link laneSets from process to laneSet
							fujaba__Success = false;

							fujaba__IterProcessToLaneSet = new ArrayList(
									process.getLaneSets()).iterator();

							while (fujaba__IterProcessToLaneSet.hasNext()) {
								try {
									laneSet = (LaneSet) fujaba__IterProcessToLaneSet
											.next();

									// check object laneSet is really bound
									JavaSDM.ensure(laneSet != null);
									// check link lanes from lane to laneSet
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exclusiveGateway_flowElements_682218 = exclusiveGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
													.eContainer() : null;

											// check object __DEC_exclusiveGateway_flowElements_682218 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_682218 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_682218
													.getFlowElements()
													.contains(exclusiveGateway));

											// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_682218 and process 
											JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_682218
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
											__DEC_outFlow_flowElements_459563 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_459563 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_459563 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_459563
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_459563 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_459563
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_441128
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_441128 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_441128
															.hasNext()) {
												try {
													__DEC_outFlow_default_441128 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_441128
															.next();

													// check object __DEC_outFlow_default_441128 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_441128 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_441128 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_441128
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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_942817
											fujaba__Success = false;

											fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_942817 = new ArrayList(
													exclusiveGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_942817
															.hasNext()) {
												try {
													__DEC_exclusiveGateway_targetRef_942817 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_942817
															.next();

													// check object __DEC_exclusiveGateway_targetRef_942817 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_942817 != null);
													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_942817 and inFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_942817
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_942817 and outFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_942817
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
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to exclusiveGateway
										JavaSDM.ensure(!(exclusiveGateway
												.equals(outFlow.getTargetRef())));

										// check link trg from _edge_flowElements to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to exclusiveGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(exclusiveGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exclusiveGateway,
														outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_514719 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_64830 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_507918 = null;
		ExclusiveGateway __DEC_outFlow_default_507918 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_374827 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_374827 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// bind object
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// check link default from exclusiveGateway to outFlow
			JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

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

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// iterate to-many link lanes from laneSet to lane
							fujaba__Success = false;

							fujaba__IterLaneSetToLane = new ArrayList(
									laneSet.getLanes()).iterator();

							while (fujaba__IterLaneSetToLane.hasNext()) {
								try {
									lane = (Lane) fujaba__IterLaneSetToLane
											.next();

									// check object lane is really bound
									JavaSDM.ensure(lane != null);
									// check link flowNodeRefs from lane to exclusiveGateway
									JavaSDM.ensure(lane.getFlowNodeRefs()
											.contains(exclusiveGateway));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exclusiveGateway_flowElements_514719 = exclusiveGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
													.eContainer() : null;

											// check object __DEC_exclusiveGateway_flowElements_514719 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_514719 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_514719
													.getFlowElements()
													.contains(exclusiveGateway));

											// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_514719 and process 
											JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_514719
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
											__DEC_outFlow_flowElements_64830 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_64830 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_64830 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_64830
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_64830 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_64830
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_507918
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_507918 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_507918
															.hasNext()) {
												try {
													__DEC_outFlow_default_507918 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_507918
															.next();

													// check object __DEC_outFlow_default_507918 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_507918 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_507918 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_507918
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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_374827
											fujaba__Success = false;

											fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_374827 = new ArrayList(
													exclusiveGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_374827
															.hasNext()) {
												try {
													__DEC_exclusiveGateway_targetRef_374827 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_374827
															.next();

													// check object __DEC_exclusiveGateway_targetRef_374827 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_374827 != null);
													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_374827 and inFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_374827
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_374827 and outFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_374827
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
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to exclusiveGateway
										JavaSDM.ensure(!(exclusiveGateway
												.equals(outFlow.getTargetRef())));

										// check link trg from _edge_flowElements to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to exclusiveGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(exclusiveGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exclusiveGateway,
														outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_99870 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_616433 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_741129 = null;
		ExclusiveGateway __DEC_outFlow_default_741129 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_946800 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_946800 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exclusiveGateway to lane
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exclusiveGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExclusiveGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					outFlow = exclusiveGateway.getDefault();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

					// bind object
					_TmpObject = _edge_targetRef.getSrc();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;

					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// bind object
					_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(inFlow));

					// check link flowElements from exclusiveGateway to process
					JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exclusiveGateway_flowElements_99870 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_99870 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_99870 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_99870
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_99870 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_99870
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
									__DEC_outFlow_flowElements_616433 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_616433 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_616433 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_616433
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_616433 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_616433
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_741129
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_741129 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_741129
													.hasNext()) {
										try {
											__DEC_outFlow_default_741129 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_741129
													.next();

											// check object __DEC_outFlow_default_741129 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_741129 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_741129 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_741129
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

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_946800
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_946800 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_946800
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_946800 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_946800
													.next();

											// check object __DEC_exclusiveGateway_targetRef_946800 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_946800 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_946800 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_946800
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_946800 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_946800
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
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(outFlow.equals(exclusiveGateway
										.getDefault()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_targetRef to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_targetRef.getTrg()));

								// check link flowNodeRefs from lane to exclusiveGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										exclusiveGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, exclusiveGateway,
										outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_34(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_571347 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_679746 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_154539 = null;
		ExclusiveGateway __DEC_outFlow_default_154539 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_351726 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_351726 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from exclusiveGateway to lane
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exclusiveGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExclusiveGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					outFlow = exclusiveGateway.getDefault();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);

					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// bind object
					_TmpObject = exclusiveGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exclusiveGateway
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(
							exclusiveGateway));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// iterate to-many link trg from exclusiveGateway to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													exclusiveGateway,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterExclusiveGatewayTo_edge_targetRef
									.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterExclusiveGatewayTo_edge_targetRef
											.next();

									// check object _edge_targetRef is really bound
									JavaSDM.ensure(_edge_targetRef != null);
									// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
									JavaSDM.ensure(!_edge_targetRef
											.equals(_edge_incoming));

									// check link src from _edge_targetRef to inFlow
									JavaSDM.ensure(inFlow
											.equals(_edge_targetRef.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exclusiveGateway_flowElements_571347 = exclusiveGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
													.eContainer() : null;

											// check object __DEC_exclusiveGateway_flowElements_571347 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_571347 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_571347
													.getFlowElements()
													.contains(exclusiveGateway));

											// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_571347 and process 
											JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_571347
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
											__DEC_outFlow_flowElements_679746 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_679746 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_679746 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_679746
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_679746 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_679746
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_154539
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_154539 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_154539
															.hasNext()) {
												try {
													__DEC_outFlow_default_154539 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_154539
															.next();

													// check object __DEC_outFlow_default_154539 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_154539 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_154539 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_154539
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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_351726
											fujaba__Success = false;

											fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_351726 = new ArrayList(
													exclusiveGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_351726
															.hasNext()) {
												try {
													__DEC_exclusiveGateway_targetRef_351726 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_351726
															.next();

													// check object __DEC_exclusiveGateway_targetRef_351726 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_351726 != null);
													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_351726 and inFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_351726
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_351726 and outFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_351726
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
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
										JavaSDM.ensure(!_edge_targetRef
												.equals(_edge_incoming));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_incoming to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to exclusiveGateway
										JavaSDM.ensure(!(exclusiveGateway
												.equals(outFlow.getTargetRef())));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(_edge_targetRef
														.getTrg()));

										// check link flowNodeRefs from lane to exclusiveGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(exclusiveGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exclusiveGateway,
														outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_35(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_907927 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_494466 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_157387 = null;
		ExclusiveGateway __DEC_outFlow_default_157387 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_22624 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_22624 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link src from _edge_sourceRef to outFlow
			JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

			// iterate to-many link flowNodeRefs from exclusiveGateway to lane
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exclusiveGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExclusiveGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// iterate to-many link targetRef from exclusiveGateway to inFlow
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (fujaba__IterExclusiveGatewayToInFlow
									.hasNext()) {
								try {
									inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
											.next();

									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link flowElements from inFlow to process
									JavaSDM.ensure(process.equals(inFlow
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exclusiveGateway_flowElements_907927 = exclusiveGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
													.eContainer() : null;

											// check object __DEC_exclusiveGateway_flowElements_907927 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_907927 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_907927
													.getFlowElements()
													.contains(exclusiveGateway));

											// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_907927 and process 
											JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_907927
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
											__DEC_outFlow_flowElements_494466 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_494466 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_494466 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_494466
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_494466 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_494466
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_157387
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_157387 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_157387
															.hasNext()) {
												try {
													__DEC_outFlow_default_157387 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_157387
															.next();

													// check object __DEC_outFlow_default_157387 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_157387 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_157387 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_157387
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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_22624
											fujaba__Success = false;

											fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_22624 = new ArrayList(
													exclusiveGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_22624
															.hasNext()) {
												try {
													__DEC_exclusiveGateway_targetRef_22624 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_22624
															.next();

													// check object __DEC_exclusiveGateway_targetRef_22624 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_22624 != null);
													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_22624 and inFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_22624
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_22624 and outFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_22624
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
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_sourceRef to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_sourceRef
														.getSrc()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to exclusiveGateway
										JavaSDM.ensure(!(exclusiveGateway
												.equals(outFlow.getTargetRef())));

										// check link trg from _edge_sourceRef to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(_edge_sourceRef
														.getTrg()));

										// check link flowNodeRefs from lane to exclusiveGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(exclusiveGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exclusiveGateway,
														outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_36(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_334834 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_201876 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_390508 = null;
		ExclusiveGateway __DEC_outFlow_default_390508 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_654267 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_654267 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exclusiveGateway to lane
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exclusiveGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExclusiveGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = _edge_outgoing.getTrg();

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;

					// check link default from exclusiveGateway to outFlow
					JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

					// bind object
					_TmpObject = outFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) outFlow
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(outFlow));

					// check link flowElements from exclusiveGateway to process
					JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
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

							// check link targetRef from inFlow to exclusiveGateway
							JavaSDM.ensure(exclusiveGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link laneSets from process to laneSet
							fujaba__Success = false;

							fujaba__IterProcessToLaneSet = new ArrayList(
									process.getLaneSets()).iterator();

							while (fujaba__IterProcessToLaneSet.hasNext()) {
								try {
									laneSet = (LaneSet) fujaba__IterProcessToLaneSet
											.next();

									// check object laneSet is really bound
									JavaSDM.ensure(laneSet != null);
									// check link lanes from lane to laneSet
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// iterate to-many link src from outFlow to _edge_sourceRef
									fujaba__Success = false;

									fujaba__IterOutFlowTo_edge_sourceRef = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															EMoflonEdge.class,
															"src")).iterator();

									while (fujaba__IterOutFlowTo_edge_sourceRef
											.hasNext()) {
										try {
											_edge_sourceRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_sourceRef
													.next();

											// check object _edge_sourceRef is really bound
											JavaSDM.ensure(_edge_sourceRef != null);
											// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
											JavaSDM.ensure(!_edge_sourceRef
													.equals(_edge_outgoing));

											// check link trg from _edge_sourceRef to exclusiveGateway
											JavaSDM.ensure(exclusiveGateway
													.equals(_edge_sourceRef
															.getTrg()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_exclusiveGateway_flowElements_334834 = exclusiveGateway
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
															.eContainer()
															: null;

													// check object __DEC_exclusiveGateway_flowElements_334834 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_334834 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_334834
															.getFlowElements()
															.contains(
																	exclusiveGateway));

													// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_334834 and process 
													JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_334834
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
													__DEC_outFlow_flowElements_201876 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_201876 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_201876 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_201876
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_201876 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_201876
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

													// iterate to-many link default from outFlow to __DEC_outFlow_default_390508
													fujaba__Success = false;

													fujaba__IterOutFlowTo__DEC_outFlow_default_390508 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			outFlow,
																			ExclusiveGateway.class,
																			"default"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterOutFlowTo__DEC_outFlow_default_390508
																	.hasNext()) {
														try {
															__DEC_outFlow_default_390508 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_390508
																	.next();

															// check object __DEC_outFlow_default_390508 is really bound
															JavaSDM.ensure(__DEC_outFlow_default_390508 != null);
															// check isomorphic binding between objects __DEC_outFlow_default_390508 and exclusiveGateway 
															JavaSDM.ensure(!__DEC_outFlow_default_390508
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

												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_654267
													fujaba__Success = false;

													fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_654267 = new ArrayList(
															exclusiveGateway
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_654267
																	.hasNext()) {
														try {
															__DEC_exclusiveGateway_targetRef_654267 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_654267
																	.next();

															// check object __DEC_exclusiveGateway_targetRef_654267 is really bound
															JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_654267 != null);
															// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_654267 and inFlow 
															JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_654267
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_654267 and outFlow 
															JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_654267
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
												// check object exclusiveGateway is really bound
												JavaSDM.ensure(exclusiveGateway != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
												JavaSDM.ensure(!_edge_sourceRef
														.equals(_edge_outgoing));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link default from exclusiveGateway to outFlow
												JavaSDM.ensure(outFlow
														.equals(exclusiveGateway
																.getDefault()));

												// check link flowElements from exclusiveGateway to process
												JavaSDM.ensure(process
														.equals(exclusiveGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link sourceRef from outFlow to exclusiveGateway
												JavaSDM.ensure(exclusiveGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_outgoing to exclusiveGateway
												JavaSDM.ensure(exclusiveGateway
														.equals(_edge_outgoing
																.getSrc()));

												// check link src from _edge_sourceRef to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_sourceRef
																.getSrc()));

												// check link targetRef from inFlow to exclusiveGateway
												JavaSDM.ensure(exclusiveGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from outFlow to exclusiveGateway
												JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
														.getTargetRef())));

												// check link trg from _edge_outgoing to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_outgoing
																.getTrg()));

												// check link trg from _edge_sourceRef to exclusiveGateway
												JavaSDM.ensure(exclusiveGateway
														.equals(_edge_sourceRef
																.getTrg()));

												// check link flowNodeRefs from lane to exclusiveGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																exclusiveGateway));

												// create object match
												match = TGGRuntimeFactory.eINSTANCE
														.createMatch();

												// assign attribute match
												match.setRuleName(__eClass
														.getName());
												// statement node 'bookkeeping with generic isAppropriate method'
												fujaba__Success = this
														.isAppropriate_FWD(
																match,
																process,
																inFlow,
																exclusiveGateway,
																outFlow, lane,
																laneSet);
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
															__result.getContents()
																	.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(
			EMoflonEdge _edge_default) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_429533 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_424166 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_503683 = null;
		ExclusiveGateway __DEC_outFlow_default_503683 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_83236 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_83236 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExclusiveGatewayToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_default is really bound
			JavaSDM.ensure(_edge_default != null);
			// bind object
			_TmpObject = _edge_default.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_default.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link default from exclusiveGateway to outFlow
			JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

			// bind object
			_TmpObject = outFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

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

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link flowNodeRefs from exclusiveGateway to lane
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayToLane = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exclusiveGateway,
											Lane.class, "flowNodeRefs"))
							.iterator();

					while (fujaba__IterExclusiveGatewayToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterExclusiveGatewayToLane
									.next();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);
							// iterate to-many link laneSets from process to laneSet
							fujaba__Success = false;

							fujaba__IterProcessToLaneSet = new ArrayList(
									process.getLaneSets()).iterator();

							while (fujaba__IterProcessToLaneSet.hasNext()) {
								try {
									laneSet = (LaneSet) fujaba__IterProcessToLaneSet
											.next();

									// check object laneSet is really bound
									JavaSDM.ensure(laneSet != null);
									// check link lanes from lane to laneSet
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exclusiveGateway_flowElements_429533 = exclusiveGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
													.eContainer() : null;

											// check object __DEC_exclusiveGateway_flowElements_429533 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_429533 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_429533
													.getFlowElements()
													.contains(exclusiveGateway));

											// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_429533 and process 
											JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_429533
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
											__DEC_outFlow_flowElements_424166 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_424166 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_424166 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_424166
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_424166 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_424166
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_503683
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_503683 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_503683
															.hasNext()) {
												try {
													__DEC_outFlow_default_503683 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_503683
															.next();

													// check object __DEC_outFlow_default_503683 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_503683 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_503683 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_503683
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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_83236
											fujaba__Success = false;

											fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_83236 = new ArrayList(
													exclusiveGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_83236
															.hasNext()) {
												try {
													__DEC_exclusiveGateway_targetRef_83236 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_83236
															.next();

													// check object __DEC_exclusiveGateway_targetRef_83236 is really bound
													JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_83236 != null);
													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_83236 and inFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_83236
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_83236 and outFlow 
													JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_83236
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

										// check object _edge_default is really bound
										JavaSDM.ensure(_edge_default != null);
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_default to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(_edge_default.getSrc()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to exclusiveGateway
										JavaSDM.ensure(!(exclusiveGateway
												.equals(outFlow.getTargetRef())));

										// check link trg from _edge_default to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_default.getTrg()));

										// check link flowNodeRefs from lane to exclusiveGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(exclusiveGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exclusiveGateway,
														outFlow, lane, laneSet);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_455564 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_893884 = null;
		Step __DEC_normalStep_next_893884 = null;
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
					__DEC_normalStep_steps_455564 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_455564 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_455564 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_455564.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_455564 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_455564.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_893884
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_893884 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_893884
									.hasNext()) {
						try {
							__DEC_normalStep_next_893884 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_893884
									.next();

							// check object __DEC_normalStep_next_893884 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_893884 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_893884 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_893884
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
				fujaba__Success = this.isAppropriate_BWD(match, normalStep,
						flow, actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_486181 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_28927 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_413825 = null;
		ExclusiveGateway __DEC_outFlow_default_413825 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_93190 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_93190 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Lane lane = null;

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

			// check object _edge_flowNodeRefs is really bound
			JavaSDM.ensure(_edge_flowNodeRefs != null);
			// bind object
			_TmpObject = _edge_flowNodeRefs.getSrc();

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;

			// bind object
			_TmpObject = _edge_flowNodeRefs.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link flowNodeRefs from lane to exclusiveGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(exclusiveGateway));

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// check link lanes from lane to laneSet
					JavaSDM.ensure(laneSet.equals(lane.eContainer()));

					// iterate to-many link targetRef from exclusiveGateway to inFlow
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
							exclusiveGateway.getIncoming()).iterator();

					while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
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
									__DEC_exclusiveGateway_flowElements_486181 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_486181 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_486181 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_486181
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_486181 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_486181
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
									__DEC_outFlow_flowElements_28927 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_28927 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_28927 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_28927
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_28927 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_28927
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_413825
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_413825 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_413825
													.hasNext()) {
										try {
											__DEC_outFlow_default_413825 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_413825
													.next();

											// check object __DEC_outFlow_default_413825 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_413825 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_413825 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_413825
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

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_93190
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_93190 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_93190
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_93190 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_93190
													.next();

											// check object __DEC_exclusiveGateway_targetRef_93190 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_93190 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_93190 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_93190
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_93190 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_93190
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

								// check object _edge_flowNodeRefs is really bound
								JavaSDM.ensure(_edge_flowNodeRefs != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(outFlow.equals(exclusiveGateway
										.getDefault()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowNodeRefs to lane
								JavaSDM.ensure(lane.equals(_edge_flowNodeRefs
										.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_flowNodeRefs to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_flowNodeRefs.getTrg()));

								// check link flowNodeRefs from lane to exclusiveGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										exclusiveGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, exclusiveGateway,
										outFlow, lane, laneSet);
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Flow) arguments.get(6),
					(Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Lane) arguments.get(9),
					(LaneSet) arguments.get(10));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1),
					(SequenceFlowToUCFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_14((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_34((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_35((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_36((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveGatewayToStepCoreRuleImpl
